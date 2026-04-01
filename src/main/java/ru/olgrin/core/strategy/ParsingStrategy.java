package ru.olgrin.core.strategy;

import ru.olgrin.core.config.ParserConfig;

public interface ParsingStrategy {

    boolean supports(String url);
    ParserConfig getConfig();
}
