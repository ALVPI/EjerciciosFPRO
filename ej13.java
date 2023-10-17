package hoja3;

import java.util.*;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        boolean bisiesto = false;
        String dia = "";
        String mes = "";
        int diames, intmes, anno;
        /*
         * Vamos a validar las entradas mientras valido no sea true pedimos la cadena
         */
        do {
            // Se pedirá el día de la semana hasta que sea un día válido
            // Valido estará a false y será la condición de salida
            // Porque solo se actualiza en caso de que el día sea correcto
            System.out.print("Introduza un día de la Semana, sin tildes: ");
            dia = sc.nextLine();
            dia = dia.toUpperCase(); // Transformamos la cadena a mayusculas.
            // Comparamos si es alguno de los días de la semana
            if (dia.equals("LUNES") || dia.equals("MARTES") || dia.equals("MIERCOLES") || dia.equals("JUEVES")
                    || dia.equals("VIERNES") || dia.equals("SABADO") || dia.equals("DOMINGO")) {
                valido = true;
            } else {
                System.out.println("No ha introducido un día de la semana, intentelo de nuevo: ");
            }
        } while (!valido);
        valido = false;
        do {
            System.out.print("Introduzca el día del mes: ");
            diames = sc.nextInt();
            if (1 <= diames && diames <= 31) {
                valido = true;
            } else {
                System.out.println("No ha introducido un día de mes válido, por favor...");
            }
        } while (!valido);
        valido = false;
        do {
            System.out.println("Introduzca el número del mes: ");
            intmes = sc.nextInt();
            if (intmes >= 1 & intmes <= 12) {
                valido = true;
            } else {
                System.out.println("No ha introducido un número de mes válido...");
            }
        } while (!valido);
        mes = mesToString(intmes);
        diames = mesYdiavalido(diames, intmes);
        valido = false;
        do {
            System.out.println("Introduzca el año: ");
            anno = sc.nextInt();
            if (anno >= 0) {
                valido = true;
            }
        } while (!valido);
        bisiesto = bisiestocheck(anno);
        diames = febrero(bisiesto, intmes, diames);
        dia = escribirBienElMes(dia);
        System.out.println(dia + "," + diames + " de " + mes + " " + anno);
        sc.close();
    }

    public static String mesToString(int intmes) {
        String mes = "";
        switch (intmes) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";

                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                System.out.println("No ha introducido un número de mes válido...");
                break;
        }
        return mes;
    }

    public static boolean bisiestocheck(int anno) {
        if ((anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int mesYdiavalido(int dia, int intmes) {
        boolean valido = false;
        int result = dia;
        Scanner sc1 = new Scanner(System.in);
        if (intmes == 4 || intmes == 6 || intmes == 9 || intmes == 11) {
            if (dia > 30) {
                do {
                    System.out.print("Introduzca el día del mes: ");
                    result = sc1.nextInt();
                    if (1 <= result && result <= 30) {
                        valido = true;
                    } else {
                        System.out.println("No ha introducido un día de mes válido, por favor...");
                    }
                } while (!valido);
            }
        }

        return result;
    }

    public static int febrero(boolean bisiesto, int mes, int dia) {
        boolean valido = false;
        Scanner sc1 = new Scanner(System.in);
        int diabueno = dia;
        if (bisiesto == true && mes == 2 && dia > 29) {
            do {
                System.out.print("Introduzca el día del mes: ");
                diabueno = sc1.nextInt();
                if (1 <= diabueno && diabueno <= 31) {
                    valido = true;
                } else {
                    System.out.println("No ha introducido un día de mes válido, por favor...");
                }
            } while (!valido);
        } else if (bisiesto == false && mes == 2 && dia > 28) {
            do {
                System.out.print("Introduzca el día del mes: ");
                diabueno = sc1.nextInt();
                if (1 <= diabueno && diabueno <= 31) {
                    valido = true;
                } else {
                    System.out.println("No ha introducido un día de mes válido, por favor...");
                }
            } while (!valido);
        }
        return diabueno;
    }

    public static String escribirBienElMes(String diaString) {
        String resultado = "";
        char letra;
        for (int i = 0; i < diaString.length(); i++) {
            if (i != 0) {
                letra = Character.toLowerCase(diaString.charAt(i));
            } else {
                letra = diaString.charAt(i);
            }
            resultado += letra;
        }
        return resultado;
    }
}