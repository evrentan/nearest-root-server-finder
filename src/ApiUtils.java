import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ApiUtils {

    public static List<String> getNearbyCities() {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(Constants.GET_NEARBY_CITIES_URI))
                .build();

        HttpResponse<String> httpResponse;

        try {
            httpResponse = HttpClient.newHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException exception) {
            throw new RuntimeException(exception.getMessage());
        }

        if (Objects.nonNull(httpResponse) && httpResponse.statusCode() != 200) {
            throw new RuntimeException(String.format("Error with GetNearByCities API call: %s", httpResponse.statusCode()));
        }

        String[][] response = new GsonBuilder().create().fromJson(httpResponse.body(), String[][].class);

        List<String> nearByCities = new ArrayList<>();

        for (String[] responseItem : response) {
            nearByCities.add(responseItem[1]);
        }

        return nearByCities;
    }
}
