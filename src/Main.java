import Articulo.*;
import java.util.*;

public class Main {
    static ArrayList<Articulo> listaArticulo = new ArrayList<Articulo>();

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true){
            try {
                imprimirMenu();
                opcion = sn.nextInt();
                sn.nextLine();

                if(opcion == 0){
                    System.out.println("Saliendo...");
                    break;
                }

                switch (opcion){
                    case 1:
                        agregarArticulo();
                        break;
                    case 2:
                        modificarPrecioArticulo();
                        break;
                    case 3:
                        mostrarListaArticulos();
                        break;
                    default:
                        System.out.println("\nSeleccione una opcion del menu\n");
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("\nERROR, valor no valido\n");
                sn.nextLine();
            }
        }
    }

    private static void mostrarListaArticulos()
    {
        Articulo art;

        for (int i = 0; i < listaArticulo.size(); i++)
        {
            System.out.println("Nombre: " + listaArticulo.get(i).getNombre() + ".Modelo: " + listaArticulo.get(i).getModelo() + ". Descripcion: " + listaArticulo.get(i).getDescripcion() + ". Precio: $" + listaArticulo.get(i).getPrecio());
        }
    }

    private static void modificarPrecioArticulo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo para cambiar el precio:");
        String nombre = sc.nextLine();

        for (int i = 0; i < listaArticulo.size(); i++)
        {
            if (listaArticulo.get(i).getNombre().equals(nombre))
            {
                System.out.print("Ingrese el nuevo precio de "+listaArticulo.get(i).getNombre()+" en USD: $");
                float nuevoPrecio = sc.nextFloat();

                listaArticulo.get(i).setPrecio(nuevoPrecio);
                return;
            }
        }
    }

    private static void agregarArticulo() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String modelo;
        String descripcion;
        float precio;

        System.out.println("Ingrese el nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingrese el modelo:");
        modelo = sc.nextLine();
        System.out.println("Ingresar una desripcion: ");
        descripcion = sc.nextLine();
        System.out.println("Ingresar el precio: ");
        precio = sc.nextFloat();
        sc.nextLine();

        int tipoArticulo = obtenerTipoArticulo();
        Articulo articulo = new Articulo(nombre, modelo, descripcion, precio);

        switch (tipoArticulo){
            case 1:
                System.out.println("Ingresar el sistema operativo: ");
                String sistemaOperativo = sc.nextLine();
                System.out.println("Ingrese la cancion del ringtone: ");
                String ringtone = sc.nextLine();

                articulo = new Telefono(articulo, sistemaOperativo, ringtone);
                break;
            case 2:
                System.out.println("Ingresar memoria RAM: ");
                String memoriaRAM = sc.nextLine();
                System.out.println("Ingresar tamaño: ");
                String tamanio = sc.nextLine();

                articulo = new Laptop(articulo, memoriaRAM, tamanio);
                break;
            case 3:
                System.out.println("Ingresar la marca: ");
                String marca = sc.nextLine();
                System.out.println("Ingresar el juego que incluye: ");
                String juegoIncluido = sc.nextLine();

                articulo = new Consola(articulo, marca, juegoIncluido);
                break;
        }

        System.out.println("\nArticulo agregado exitosamente...\n");

        listaArticulo.add(articulo);
    }

    private static int obtenerTipoArticulo() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while (true) {
            try{
                System.out.println("Seleccione una opcion:");
                System.out.println("1. Telefono.");
                System.out.println("2. Laptop.");
                System.out.println("3. Consola");
                System.out.print("Opcion -> ");
                opcion = sn.nextInt();
                if(opcion >= 1 && opcion <= 3)
                    return opcion;
                else
                    System.out.println("\nPor favor ingrese una opcion valida\n");
            }catch(Exception e){
                System.out.println("\nPor favor ingrese un dato valido\n");
            }finally {
                sn.nextLine();
            }
        }

    }

    private static void imprimirMenu()
    {
        System.out.println("Seleccione una opcion:");
        System.out.println("0. Salir");
        System.out.println("1. Agregar articulo.");
        System.out.println("2. Modificar precio.");
        System.out.println("3. Mostrar listado de productos.");
        System.out.print("Opcion -> ");
    }
}