package ru.olgrin;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import ru.olgrin.core.loader.JsoupPageLoader;
import ru.olgrin.core.loader.LoaderFromFile;
import ru.olgrin.core.loader.PageLoader;
import ru.olgrin.core.model.ParsedResult;
import ru.olgrin.core.parser.UniversalParser;
import ru.olgrin.core.pipeline.ParsingPipeline;
import ru.olgrin.core.service.ParsingService;
import ru.olgrin.core.strategy.MidRFSiteStrategy;
import ru.olgrin.core.strategy.StrategyRegistry;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
//        PageLoader loader = new JsoupPageLoader();
        PageLoader loader = new LoaderFromFile();
        UniversalParser parser = new UniversalParser();
        ParsingPipeline pipeline = new ParsingPipeline(loader, parser);
        StrategyRegistry registry = new StrategyRegistry();
        registry.register(new MidRFSiteStrategy());
        ParsingService service = new ParsingService(pipeline, registry);
////        ParsedResult result = service.parse("https://mid.ru/");
        ParsedResult result = service.parse("1.html");
//        System.out.println(result.getAll());
//        List<String> list = result.get("text");
//        System.out.println(list.get(1));
//        String strings = result.get("div.main");
//        byte[] body = strings.getBytes();
//        System.out.println(new String(body, "windows-1251"));

//        Document document = Jsoup.connect("https://mid.ru/")
//                .userAgent("Mozilla/5.0 (Windows; U; Windows NT 6.1; rv:2.2) Gecko/20110201")
//                .referrer("https://www.google.com/")
//                .get();
//        System.out.println(document.text());

//        File input = new File("1.html");
//        Document document = Jsoup.parse(input, "windows-1251");

//        Connection.Response responses = Jsoup.connect("https://mid.ru/")
//                .userAgent("Mozilla/5.0 (Windows; U; Windows NT 6.1; rv:2.2) Gecko/20110201")
//                .referrer("https://www.google.com/")
//                .execute();
//
//        byte[] bytes = responses.bodyAsBytes();
//
//        String html = new String(bytes, "windows-1251");
//
//        Document document = Jsoup.parse(html);
//
//        Elements list = document.select("div.news-line__list-wrapper > ul > li > a");
//        for (Element element : list.select("a")) {
//            System.out.println(element.text());
        }
    }