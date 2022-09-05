import br.com.seven.days.code.model.ImdbApiClientPrivateKey;

import java.io.*;

public class WriterFileJson {

    public static void main(String[] args) throws IOException, InterruptedException {
        ImdbApiClientPrivateKey imdbApiClient = new ImdbApiClientPrivateKey();

        OutputStream file = new FileOutputStream("top250films.json");
        Writer writer = new OutputStreamWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write(imdbApiClient.getFileJson());
        bufferedWriter.close();
    }
}
