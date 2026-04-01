package ru.olgrin.core.pipeline;

import ru.olgrin.core.config.ParserConfig;
import ru.olgrin.core.loader.PageLoader;
import ru.olgrin.core.model.ParsedResult;
import ru.olgrin.core.parser.UniversalParser;

public class ParsingPipeline {

    private PageLoader loader;
    private UniversalParser parser;

    public ParsingPipeline(PageLoader loader, UniversalParser parser) {
        this.loader = loader;
        this.parser = parser;
    }

    public ParsedResult execute(String url, ParserConfig config) throws Exception {
        return parser.parse(loader.load(url), config);
    }
}
