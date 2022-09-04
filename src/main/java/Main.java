import br.com.seven.days.code.model.ImdbApiClient;
import br.com.seven.days.code.service.HTMLGenerator;
import br.com.seven.days.code.service.ImdbJsonParser;
import br.com.seven.days.code.model.Movie;

import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        ImdbApiClient imdbApiClient = new ImdbApiClient();
        ImdbJsonParser imdbJsonParser = new ImdbJsonParser();

        List<Movie> movies = imdbJsonParser.parse((imdbApiClient.getFileJson()));

        PrintWriter writerFile = new PrintWriter("index.html");

        HTMLGenerator htmlGenerator = new HTMLGenerator(writerFile);
        htmlGenerator.generate(movies);

        writerFile.close();
    }
}
