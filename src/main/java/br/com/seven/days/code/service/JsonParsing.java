package br.com.seven.days.code.service;


import java.util.List;

public interface JsonParsing {
     List<? extends Content> parse(String json);
}
