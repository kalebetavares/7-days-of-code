import br.com.seven.days.code.model.APIClient;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;

public class JsonParserTest {

    @Test
    public void parseAtribute() throws IOException, InterruptedException {
        APIClient apiClient = new APIClient();
        String attribute = "fullTitle";
        Matcher matcher = Pattern.compile("\""+attribute+"\":\"(.*?)\"").matcher(apiClient.getFileJson());
        List<String> titleFilms = new ArrayList<>();

            for (int i = 0 ; i < 250; i++) {
                matcher.find();
                titleFilms.add(matcher.group(1));
            }

        titleFilms.forEach(System.out::println);
    }

}
