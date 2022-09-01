import br.com.seven.days.code.model.APIClient;

import java.io.*;

public class WriterFileJson {

    public static void main(String[] args) throws IOException, InterruptedException {
        APIClient apiClient = new APIClient();

        OutputStream file = new FileOutputStream("top250films.json");
        Writer writer = new OutputStreamWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write(apiClient.getFileJson());
        bufferedWriter.close();
    }
}
