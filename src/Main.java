
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
                    int aniosFidelidad =sc.nextInt();

                    pacienteVip v = new pacienteVip(costov, documentov, nombrev, aniosFidelidad);
                    list.add(v);
                    break;
                case 4:
                    System.out.println("4 buscar paciente por documento");
                    System.out.println("Diguite el documento del paciente a buscar");
                    int busDoc = sc. nextInt();

                    boolean siesta = false;
                    for (paciente pa : list){
                        if (pa.getDocumento()== busDoc){
                            double costoF = pa.calcularCostoFinal();
                            pa.mostrarDatos(costoF);
                            siesta = true;
                            break;
                        }
                    }
                    if (!siesta){
                        System.out.println("No hay pacientes con ese numero de documento");
                    }
                    break;
                case 5:
                    int me;

                    do {
                        System.out.println("5. Mostrar pacientes por tipo");
                        System.out.println("1. Mostrar todos los pacientes");
                        System.out.println("2. Mostrar pacientes particulares");
                        System.out.println("3. Mostrar pacientes EPS");
                        System.out.println("4. Mostrar pacientes VIP");
                        System.out.println("0. Salir");
                        System.out.println("Elija una opcion 1-4");

                        me = sc.nextInt();

                        switch (me) {

                            case 1:
                                System.out.println("1. Mostrar todos los pacientes");
                                System.out.println("=================================");

                                if (list.isEmpty()) {
                                    System.out.println("No hay pacientes");
                                } else {
                                    for (paciente pa : list) {
                                        pa.mostrarDatos(pa.calcularCostoFinal());
                                        System.out.println("=================================");
                                    }
                                }
                                break;

                            case 2:
                                System.out.println("2. Mostrar pacientes particulares");
                                System.out.println("=================================");

                                for (paciente pa : list) {
                                    if (pa instanceof pacienteparticular) {
                                        pa.mostrarDatos(pa.calcularCostoFinal());
                                        System.out.println("=================================");
                                    }
                                }
                                break;

                            case 3:
                                System.out.println("3. Mostrar pacientes EPS");
                                System.out.println("=================================");

                                for (paciente pa : list) {
                                    if (pa instanceof pacienteeps) {
                                        pa.mostrarDatos(pa.calcularCostoFinal());
                                        System.out.println("=================================");
                                    }
                                }
                                break;

                            case 4:
                                System.out.println("4. Mostrar pacientes VIP");
                                System.out.println("=================================");

                                for (paciente pa : list) {
                                    if (pa instanceof pacienteVip) {
                                        pa.mostrarDatos(pa.calcularCostoFinal());
                                        System.out.println("=================================");
                                    }
                                }
                                break;
                        }

                    } while (me != 0);

                    break;
                case 6:
                    System.out.println("6 calcular el costo de la consulta");

                    System.out.println("Ingrese documento del paciente: ");
                    int docCosto = sc.nextInt();

                    boolean encontradoCosto = false;

                    for (paciente pa : list) {
                        if (pa.getDocumento() == docCosto) {
                            double costoF = pa.calcularCostoFinal();
                            System.out.println("Costo final: " + costoF);
                            encontradoCosto = true;
                            break;
                        }
                    }

                    if (!encontradoCosto) {
                        System.out.println("EL paciente no ha sido encontrado");
                    }
                    break;
                case 7:
                    System.out.println("7 mostrar consultas costosas");

                    for (paciente pa : list) {
                        if (pa.esConsultaCostosa()) {
                            pa.mostrarDatos(pa.calcularCostoFinal());
                        }
                    }
                    break;
                case 8:
                    System.out.println("8 mostrar paciente que mas pago");
                    paciente mayor = list.get(0);
                    double mayorCosto = mayor.calcularCostoFinal();

                    for (paciente pa : list) {
                        double ganador  = pa.calcularCostoFinal();

                        if (ganador > mayorCosto) {
                            mayorCosto = ganador;
                            mayor = pa;
                        }
                    }

                    System.out.println("Paciente que más pagó:");
                    mayor.mostrarDatos(mayorCosto);
                    break;
            }
        }while (op !=0);

    }
}