
import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<paciente> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int op;

        do {
            System.out.println("Bienvenido a la clinica");
            System.out.println("1 registrar paciente particular");
            System.out.println("2 registrar paciente EPS");
            System.out.println("3 registrar paciente VIP    ");
            System.out.println("4 buscar paciente por documento");
            System.out.println("5 mostrar pacientes por tipo");
            System.out.println("6 calcular el costo de la consulta");
            System.out.println("7 mostrar consultas costosas");
            System.out.println("8 mostrar paciente que mas pago");
            System.out.println("0 salir");

            op = sc.nextInt();
            sc.nextLine();

            switch (op){


                case 1:
                    System.out.println("1 registrar paciente particular");

                    System.out.println("Nombre: ");
                    String nombrep =sc.nextLine();
                    System.out.println("Documento: ");
                    int documentop =sc.nextInt();
                    sc.nextLine();
                    System.out.println("Costo consulta: ");
                    double costop =sc.nextDouble();
                    sc.nextLine();

                    pacienteparticular p = new pacienteparticular(costop, documentop, nombrep);
                    list.add(p);
                    break;

                case 2:
                    System.out.println("2 registrar paciente EPS");

                    System.out.println("Nombre: ");
                    String nombre =sc.nextLine();
                    System.out.println("Documento: ");
                    int documento =sc.nextInt();
                    System.out.println("Costo consulta: ");
                    double costo =sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Nombre EPS: ");
                    String nombreeps =sc.nextLine();

                    pacienteeps e =new pacienteeps(costo,documento, nombre, nombreeps);
                    list.add(e);
                    break;

                case 3:
                    System.out.println("3 registrar paciente VIP");

                    System.out.println("Nombre: ");
                    String nombrev =sc.nextLine();
                    System.out.println("Documento: ");
                    int documentov =sc.nextInt();
                    System.out.println("Costo consulta: ");
                    double costov =sc.nextDouble();
                    System.out.println("años de fidelidad: ");
                    int añosFidelidad =sc.nextInt();

                    pacienteVip v = new pacienteVip(costov, documentov, nombrev, añosFidelidad);
                    list.add(v);
                    break;
                case 4:
                    System.out.println("4 buscar paciente por documento");
                    documento

                case 5:
                case 6:



            }

        }while (op !=0);

    }
}