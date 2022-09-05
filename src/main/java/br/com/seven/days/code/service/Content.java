package br.com.seven.days.code.service;

public interface Content extends Comparable<Content> {
    String title();
    String urlImage();
    String rating();
    String year();
}
