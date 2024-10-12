package com.cobacha.Principal;
import com.cobacha.Logica.ConsultaMonedas;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opc=0;
        Vistas vistaMenusResultados=new Vistas();
        while(opc!=9) {
            opc = vistaMenusResultados.menuPrincipal(); //Menu principal
            if (opc>=1 && opc<=6 ){
                ConsultaMonedas consultaMonedasPredetirminadas = new ConsultaMonedas();
                consultaMonedasPredetirminadas.consultaMonedasPredeterminada(opc); //pasamos la opcin para saver que monedas escojimos
                vistaMenusResultados.mostrarResultado(consultaMonedasPredetirminadas.getMonto(), consultaMonedasPredetirminadas.getMonedaBase(), consultaMonedasPredetirminadas.getOtraMoneda(), consultaMonedasPredetirminadas.getConversion_result(),consultaMonedasPredetirminadas.getFechaHora());
            }
            if(opc==7){
                ConsultaMonedas consultaMonedasPresonalizadas = new ConsultaMonedas();
                consultaMonedasPresonalizadas.consultaMonedasPersonalizada();
                vistaMenusResultados.mostrarResultado(consultaMonedasPresonalizadas.getMonto(), consultaMonedasPresonalizadas.getMonedaBase(), consultaMonedasPresonalizadas.getOtraMoneda(), consultaMonedasPresonalizadas.getConversion_result(), consultaMonedasPresonalizadas.fechaHora);
            }
            if (opc==8){
                vistaMenusResultados.mostrarLOG();
            }
        }
        vistaMenusResultados.mensajeDespedida();
    }
}
