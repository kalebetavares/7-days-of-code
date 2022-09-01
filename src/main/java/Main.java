import br.com.seven.days.code.model.APIClient;
import br.com.seven.days.code.service.HTMLGenerator;
import br.com.seven.days.code.service.JsonParser;
import br.com.seven.days.code.model.Movie;

import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        APIClient apiClient = new APIClient();
        JsonParser jsonParser = new JsonParser();
        List<Movie> movies = jsonParser.top250Movies((apiClient.getFileJson()));

        FileOutputStream outputStream = new FileOutputStream("index.html");
        PrintWriter writerFile = new PrintWriter(outputStream);

        HTMLGenerator htmlGenerator = new HTMLGenerator(writerFile);
        htmlGenerator.generate(movies);

        outputStream.close();
        writerFile.close();
    }
}
