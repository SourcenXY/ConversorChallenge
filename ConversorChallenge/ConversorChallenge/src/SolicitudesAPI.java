import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SolicitudesAPI {
    public Monedas encontrarMoneda(String base, String cambiar) {
        URI url = URI.create("https://v6.exchangerate-api.com/v6/7c06300b123e6943b68053ff/pair/" + base + "/" + cambiar);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(url).build();

        try{
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        }
        catch (Exception e) {
            throw new RuntimeException("No se encontro la moneda");
        }
    }
}
