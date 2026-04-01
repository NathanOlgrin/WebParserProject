package ru.olgrin.core.loader;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.lang.annotation.Documented;

public class LoaderFromFile implements PageLoader{
    @Override
    public String load(String url) throws Exception {
        File input = new File(url);
        Document document = Jsoup.parse(input, "windows-1251");
        return document.html();
    }
}
