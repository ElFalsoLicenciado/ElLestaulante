import java.util.*;

public class Main {
    public static void main(String[] args) {
    Restaurante restaurante = new Restaurante();
    Scanner sc = new Scanner(System.in);
    int choice = 0;

        do {
            System.out.println("\n*** BIENVENIDO AL RESTAURANTE ***");
            System.out.println("Elige la opción deseada");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Registrar platillo");
            System.out.println("3. Registrar empleado");
            System.out.println("4. Mostrar cliente");
            System.out.println("5. Mostrar platillo");
            System.out.println("6. Mostrar Empleado");
            System.out.println("7. Crear Orden");
            System.out.println("8. Mostrar ordenes");
            System.out.println("9. Salir");

            System.out.print("Ingresar opción: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("\nElegiste registrar cliente");
                    System.out.print("Ingresa el nombre: ");
                    String nombreCliente = sc.nextLine();
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("\nElegiste registrar platillo");

                    System.out.print("Ingresa el nombre: ");
                    String nombrePlatillo = sc.nextLine();

                    System.out.print("Ingresa el precio: ");
                    double precio = sc.nextDouble();

                    break;

                case 3:
                    sc.nextLine();
                    System.out.println("\nElegiste registrar empleado");

                    System.out.print("Ingresa el nombre del empleado: ");
                    String nombreEmpleado = sc.nextLine();

                    System.out.print("Ingresa el salario: ");
                    double salarioEmpleado = sc.nextDouble();

                    System.out.print("Ingresa el rol: ");
                    String rolEmpleado = sc.nextLine();

                    break;

                case 4:
                    
                    break;

                case 5:
                    
                    break;

                case 6:
                    

                case 7:
                    System.out.println("ADIOS :)");
                    return;

            }

        }while(choice != 9);
    }
        
    }
    

