package repaso;

import java.util.Scanner;

public class RepasoApp {

    static Scanner sc = new Scanner(System.in);

    // Vamos a generar las variables globales

    static int id;
    static String nombreProducto;
    static String presentacion;
    static double costo;
    static double precioVenta;
    static double margen;
    static double cantidad;
    static double valorInventario;



    public static void main(String[] args) {
        /*nombreProducto = "Yupi";
        presentacion = "paquete 200 gr";
        costo = 1100;
        margen = 0.3;
        cantidad = 20;
        precioVenta =  Math.round(costo /(1 - margen))  ;
        valorInventario = cantidad*costo;

        System.out.println(precioVenta);
        System.out.println(valorInventario);*/


        menuApp();


    }

    public static void registrarProducto(){
        try {
            System.out.println("Ingrese el id del producto:");
            id = sc.nextInt();
            sc.skip("\n");
            System.out.println("Ingrese el nombre del producto:");
            nombreProducto = sc.nextLine();
            System.out.println("INgrese la presentacion del producto");
            presentacion = sc.nextLine();
            System.out.println("Ingrese el costo del producto: ");
            costo = sc.nextDouble();
            System.out.println("Ingrese la cantidad del producto:");
            cantidad = sc.nextDouble();
            System.out.println("Ingrese el margen de ventas: ");
            margen = sc.nextDouble();
            precioVenta = calcularPrecioVenta();
            valorInventario = calcularValorInventario();
        }catch (Exception e){
            System.out.println("Debe ingresar decimales con coma (,)");

        }
    }

    public static double calcularPrecioVenta(){

        precioVenta =  Math.round(costo /(1 - margen));

        return precioVenta;

    }

    public static double calcularValorInventario(){

        valorInventario = cantidad*costo;

        return valorInventario;
    }

    public static void imprimirProducto(){
        System.out.println("id: "+ id + "\n" +
                "Producto: " + nombreProducto + "\n" +
                "Presentación : " + presentacion + "\n" +
                "Costo: " + costo + "\n" +
                "cantidad: " + cantidad + "\n" +
                "Margen: " + margen + "\n" +
                "Precio de venta: " + precioVenta + "\n" +
                "Valor Inventario: " + valorInventario + "\n");
    }

    public static void menuApp(){

        System.out.println("Inicializar app, oprima 1");
        int isOn = sc.nextInt();

        while(isOn !=0){

            System.out.println("Bienvenido al gestor de Venta XYZ20000");
            System.out.println("Seleccione: 1. Registrar producto" +
                    "2. Listar producto" +
                    "3. Registrar venta" +
                    "4. imprimir factura" +
                    "5. ver caja" +
                    "6. Salir");

            int opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Registrar producto");
                    registrarProducto();
                    break;
                case 2:
                    System.out.println("Listar productos");
                    imprimirProducto();
                    break;
                case 3:
                    System.out.println("Registrar venta");
                    break;
                case 4:
                    System.out.println("Imprimir factura");
                    break;
                case 5:
                    System.out.println("Ver caja");
                    break;
                case 6:
                    System.out.println("Salir");
                    isOn= 0;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");


            }
        }
    }






}
