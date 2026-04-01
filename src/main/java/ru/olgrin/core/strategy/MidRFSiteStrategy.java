package ru.olgrin.core.strategy;

import ru.olgrin.core.config.ParserConfig;

import java.util.HashMap;
import java.util.Map;

public class MidRFSiteStrategy implements ParsingStrategy{
    @Override
    public boolean supports(String url) {
        return url.contains(url);
    }

    @Override
    public ParserConfig getConfig() {
        Map<String, String> selectors = new HashMap<>();
        selectors.put("text","div.news-line__list-wrapper > ul > li > a");
        ParserConfig config = new ParserConfig(selectors);
        return config;
    }
}

//#main_news69cccf7cadc2a > div.news-line__body > div.news-line__list-wrapper > ul > li:nth-child(1) > a