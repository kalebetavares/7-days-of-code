import br.com.seven.days.code.model.APIClient;
import br.com.seven.days.code.service.JsonParser;
import br.com.seven.days.code.model.Movie;

import java.util.List;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        APIClient apiClient = new APIClient();
        JsonParser jsonParser = new JsonParser();

        List<Movie> movies = jsonParser.top250Movies((apiClient.getFileJson()));
        movies.forEach(System.out::println);
    }
}
