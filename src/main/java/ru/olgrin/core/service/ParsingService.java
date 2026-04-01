package ru.olgrin.core.service;

import ru.olgrin.core.model.ParsedResult;
import ru.olgrin.core.pipeline.ParsingPipeline;
import ru.olgrin.core.strategy.ParsingStrategy;
import ru.olgrin.core.strategy.StrategyRegistry;

public class ParsingService {
    private ParsingPipeline pipeline;
    private StrategyRegistry registry;

    public ParsingService(ParsingPipeline pipeline, StrategyRegistry registry) {
        this.pipeline = pipeline;
        this.registry = registry;
    }

    public ParsedResult parse(String url) throws Exception {
        ParsingStrategy strategy = registry.find(url);
        return pipeline.execute(url, strategy.getConfig());
    }
}
