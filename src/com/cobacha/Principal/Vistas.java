package com.cobacha.Principal;
import com.cobacha.Logica.LogDeConsultas;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Vistas {
    /*Colores texto*/
    String black="\033[30m";
    public String red="\033[31m";
    public String green="\033[32m";
    String yellow="\033[33m";
    public String blue="\033[34m";
    String magneta="\033[35m";
    String cyan="\033[36m";
    String grisClaro="\033[37m";
    String brightBlack="\033[90m";
    String brightRed="\033[91m";
    String brightGreen="\033[92m";
    String brightYellow="\033[93m";
    String brightBlue="\033[94m";
    String brightMagneta="\033[95m";
    String brightCyan="\033[96m";

    public String reset="\u001B[0m";
    /*colores fondo*/
    String fondoBlack="\033[40m";
    String fondoRed="\033[41m";
    String fondoGreen="\033[42m";
    String fondoYellow="\033[43m";
    String fondoBlue="\033[44m";
    String fondoMagenta="\033[45m";
    String fondoCyan="\033[46m";
    String fondoGris="\033[47m";
    String fondoGrisOscuro ="\033[100m";
    String fondoRedClaro="\033[101m";
    String fondoGreenClaro="\033[102m";
    String fondoYellowClaro="\033[103m";
    String fondoBlueClaro ="\033[104m";
    String fondoMagentaClaro ="\033[105m";
    String fondoCyanClaro="\033[106m";
    String fondoBlanco="\033[107m";




    private int opc;

    public String tabla=" ";

    Scanner lee = new Scanner(System.in);

    public int menuPrincipal(){
        do{
            try {
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t\t"+reset);
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+fondoGris+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+reset);
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+fondoGris+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+reset);
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+fondoGris+"\t\t"+fondoBlack+brightGreen+"\tEscoje una opcion por favor:  \t\t"+fondoGris+"\t\t"+fondoGrisOscuro+"\t"+reset);
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+fondoGris+"\t\t"+fondoBlack+red+"\t1. Pesos Argentino a Dolares USA\t"+fondoGris+"\t\t"+fondoGrisOscuro+"\t"+reset);
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+fondoGris+"\t\t"+fondoBlack+yellow+"\t2. Dolares USA a Pesos Argentino\t"+fondoGris+"\t\t"+fondoGrisOscuro+"\t"+reset);
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+fondoGris+"\t\t"+fondoBlack+brightYellow+"\t3. Boliviano Bolivia a Dolares USA\t"+fondoGris+"\t\t"+fondoGrisOscuro+"\t"+reset);
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+fondoGris+"\t\t"+fondoBlack+cyan+"\t4. Dolares USA a Boliviano Bolivia\t"+fondoGris+"\t\t"+fondoGrisOscuro+"\t"+reset);
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+fondoGris+"\t\t"+fondoBlack+brightCyan+"\t5. Peso Chileno a Dolares USA\t\t"+fondoGris+"\t\t"+fondoGrisOscuro+"\t"+reset);
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+fondoGris+"\t\t"+fondoBlack+magneta+"\t6. Dolares USA a Peso Chileno\t\t"+fondoGris+"\t\t"+fondoGrisOscuro+"\t"+reset);
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+fondoGris+"\t\t"+fondoBlack+brightMagneta+"\t7. Otras monedas\t\t\t\t\t"+fondoGris+"\t\t"+fondoGrisOscuro+"\t"+reset);
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+fondoGris+"\t\t"+fondoBlack+blue+"\t8. Ver log de Consultas\t\t\t\t"+fondoGris+"\t\t"+fondoGrisOscuro+"\t"+reset);
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+fondoGris+"\t\t"+fondoBlack+brightBlue+"\t9. Salir\t\t\t\t\t\t\t"+fondoGris+"\t\t"+fondoGrisOscuro+"\t"+reset);
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+fondoGris+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+reset);
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+fondoGris+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t"+reset);
                System.out.println(reset+"\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+fondoGrisOscuro+"\t\t"+reset);
                System.out.printf(green+"\t\t\t\t\t\t\t\t\t\t\t"+"Dame una opcion= "+reset);
                opc=lee.nextInt();
                System.out.println();
                return opc;
            } catch (Exception e) {
                System.out.printf(red+"\t\t\t\t\t\t\t\t\t\t\tERROR: Dame una opcion del 1 al 9\n");
                lee.next();
            }
        }while (true);
    }
    public void mostrarResultado(String monto, String base_code, String target_code, String conversion_result, String fechaHora) throws InterruptedException, IOException {
        System.out.print(cyan+"\n\t\t\t\t\t\t\t\t\t\t\t***************************************************************\n"+reset);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+blue+"Fecha y hora: "+magneta+fechaHora+reset);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+blue+monto+" "+magneta+base_code+yellow+"  /  "+blue+conversion_result+" " +magneta+target_code+reset);
        System.out.print(cyan+"\t\t\t\t\t\t\t\t\t\t\t***************************************************************\n"+reset);
        precionaEnterParaContinuar();
    }
    public void precionaEnterParaContinuar(){
        System.out.println(green+"\t\t\t\t\t\t\t\t\t\t\tPara continuar preciona enter....");
        lee.nextLine();
        lee.reset();
        lee.nextLine();
    }
    public void mostrarLOG() throws IOException {
        FileReader lector= new FileReader("LOG_DE_CONSULTAS.txt");
        int caracter;
        while ((caracter=lector.read())!=-1){
            System.out.print (blue+(char)caracter);
        }
        lector.close();
        precionaEnterParaContinuar();
    }
    public void mensajeDespedida(){
        System.out.print(black+ fondoCyanClaro +"\t\t\t\t\t\t\t\t\t\t\tGracias por usar esta aplicacion!!!!!"+reset);
        lee.nextLine();
    }
    public void muestraTablaMoneda() throws IOException {
        FileReader lector= new FileReader("TABLA_MONEDA.txt");
        int caracter;

        System.out.println(cyan);
        while ((caracter=lector.read())!=-1){
            System.out.print ((char)caracter);
            tabla+=((char)caracter);
        }
        lector.close();
        System.out.println(reset);
    }
    public  void logo(){
        int i=0;
        while(i<20){
            System.out.println(" ");
            i++;
        }
        i=0;

        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t00000000000000000000000000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t00000000            000000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t000000    00000000    0000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t00000  000000000000   0000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t000    000000000000    000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t0000000000000000000    000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t00000000000000000      000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t0000000000000     0    000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t000000000     00000    000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t00000      00000000    000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t000    000000000000    000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t000    000000000000    000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t000    000000000000    000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t000    0000000000      000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t00000      0000        000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t0000000        0000    000"+reset);
        System.out.println(blue+"\t\t\t\t\t\t\t\t\t\t\t00000000000000000000000000"+reset);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t"+fondoCyanClaro+black+"_____Bienvenido!!!!!!_____"+reset);


        precionaEnterParaContinuar();
        while(i<20){
            System.out.println(" ");
            i++;
        }
    }
}

