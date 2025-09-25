package conversiones;

import com.google.gson.Gson;
import principales.Principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversiones {

    private static final String CLAVE_API = "d94e64f3e84378d18e2aa0d2";
    public Resultados realizarConversion (String monedaUno, String monedaConvertida, double monto) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + CLAVE_API + "/pair/" + monedaUno + monedaConvertida  + monto);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Gson().fromJson(response.body(), Resultados.class);

    }
}
