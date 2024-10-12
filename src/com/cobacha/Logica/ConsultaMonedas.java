package com.cobacha.Logica;
import com.cobacha.ConsultaApi.ConsultaAPIMonedas;
import com.cobacha.Principal.Vistas;
import com.google.gson.Gson;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConsultaMonedas extends Vistas {


    private String monedaBase , otraMoneda , monto ,conversion_result;
    public String fechaHora;



    public String getFechaHora() {
        return fechaHora;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getOtraMoneda() {
        return otraMoneda;
    }

    public String getMonto() {
        return monto;
    }

    public String getConversion_result() {
        return conversion_result;
    }

    public String Fecha(){
        Date fechaHoraActual=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy HH:mm");
        fechaHora= formato.format(fechaHoraActual);
        return  fechaHora;
    }

    public void consultaMonedasPredeterminada(int opc) throws IOException, InterruptedException {
        switch (opc){
            case 1:
                monedaBase="ARS";
                otraMoneda="USD";
                break;
            case 2:
                monedaBase="USD";
                otraMoneda="ARS";
                break;
            case 3:
                monedaBase="BOB";
                otraMoneda="USD";
                break;
            case 4:
                monedaBase="USD";
                otraMoneda="BOB";
                break;
            case 5:
                monedaBase="CLP";
                otraMoneda="USD";
                break;
            case 6:
                monedaBase="USD";
                otraMoneda="CLP";
                break;
                default:
                break;
        }
        ConsultaAPIAnadeLOG();
    }

    public void consultaMonedasPersonalizada() throws IOException, InterruptedException {
        Scanner lee =new Scanner(System.in);
        muestraTablaMoneda();


        do{
            System.out.print(green+"\t\t\t\t\t\t\t\t\t\t\tDame el codigo de la moneda base: ");
            monedaBase=lee.nextLine();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\tDame el codigo de la moneda objetivo: "+reset);
            otraMoneda=lee.nextLine();
            if(monedaBase.length()==3&&otraMoneda.length()==3){
                if (validaMoneda(monedaBase)&&validaMoneda(otraMoneda)){
                    ConsultaAPIAnadeLOG();
                    break;
                }
            }
        }while(true);
    }
    public boolean validaMoneda(String moneda){
        moneda=moneda.toUpperCase();
        if(!tabla.contains(moneda)){
            System.out.println(red+"\t\t\t\t\t\t\t\t\t\t\tNo se encontro moneda: "+moneda+reset +blue+"Por favor consulta la tabla de monedas");
        };
        return tabla.contains(moneda);
    }

    public void ConsultaAPIAnadeLOG() throws IOException, InterruptedException {
        String json;
        Scanner lee = new Scanner(System.in);
        lee=new Scanner(System.in);

        System.out.printf(blue+"\t\t\t\t\t\t\t\t\t\t\tDame el monto del las monedas: "+reset);
        monto= lee.nextLine();
        json = new ConsultaAPIMonedas().consulta(monedaBase,otraMoneda, monto);

        Gson gson=new Gson();
        ExtraccionConversionResult conversion_result_json= gson.fromJson(json , ExtraccionConversionResult.class);
        conversion_result=String.valueOf(conversion_result_json);
        //aqui llamar da guardar en archivos
        new LogDeConsultas().anadiALog(monedaBase,otraMoneda,monto,conversion_result,Fecha());
    }
}


