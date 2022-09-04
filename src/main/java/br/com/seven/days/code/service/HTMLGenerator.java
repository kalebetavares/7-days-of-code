package br.com.seven.days.code.service;

import java.io.PrintWriter;
import java.util.List;

public class HTMLGenerator {
    private final PrintWriter writer;
    private static final String HEAD =
            """
                    <!DOCTYPE html>
                    <html lang="en">
                    <head>
                          <meta charset=\"UTF-8\">
                          <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">
                          <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"
                                + "integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">
                          <title>Top 250 films</title>
                    </head>
                    <body>           
                    """;
    private static final String DIV =
            """
            <div class=\"card text-white bg-dark mb-3 \" style=\"max-width: 18rem; margin: auto;\">
                 <h4 class=\"card-header\">%s</h4>
                 <div class=\"card-body\">
                 <img class=\"card-img\" src=\"%s\" alt=\"%s\">
                 <p class=\"card-text mt-2\">Nota: %s - Ano: %s</p>
                 </div>
            </div>
            """;

    private static final String BODY =
            """ 
                   </body>
            </html> 
            """;
    public HTMLGenerator(PrintWriter writer){
        this.writer = writer;
    }

    public void generate(List<? extends Content> contents){
        writer.print(HEAD);
        for (Content content : contents) {
            writer.print(String.format(DIV, content.title(), content.urlImage(), content.title(), content.rating(), content.year()));
        }
        writer.print(BODY);
        writer.close();
    }
}
