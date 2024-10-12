package com.cobacha.ConsultaApi;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPIMonedas {
    private String APIKEY = "b2fa664ef11c28fc3d29e300";
    public String consulta(String monedaBase, String otraMoneda, String monto) throws IOException, InterruptedException {
        String urlString = "https://v6.exchangerate-api.com/v6/" + APIKEY + "/pair/" + monedaBase + "/" + otraMoneda + "/" + monto;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlString))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();//la respuesta de la peticion la guardamos en json
        return json;
    }
}