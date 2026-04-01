package ru.olgrin.core.parser;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import ru.olgrin.core.config.ParserConfig;
import ru.olgrin.core.model.ParsedResult;

import java.util.Collections;
import java.util.List;

public class UniversalParser {

    public ParsedResult parse(String html, ParserConfig config){
        ParsedResult result = new ParsedResult();

        for (var entry:config.getSelectors().entrySet()){
            result.put(entry.getKey(), Jsoup.parse(html).select(entry.getValue()).eachText());
        }

        return result;
    }
}
