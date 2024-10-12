package com.cobacha.Logica;
import java.io.FileWriter;
import java.io.IOException;

public class LogDeConsultas  {
public void anadiALog (String monedaBase,String monedaObjetivo,String monto,String conversion_result,  String fechaHora) throws IOException {
    FileWriter escrivir=new FileWriter("LOG_DE_CONSULTAS.txt",true);
    escrivir.write("""
            \t\t\t\t\t\t\t\t\t\t\tFecha: %s / %s %s = %s %s \n""".formatted(fechaHora,monto,monedaBase,conversion_result,monedaObjetivo)
    );
    escrivir.close();
}
}
