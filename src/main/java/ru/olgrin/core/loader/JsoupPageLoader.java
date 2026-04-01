package ru.olgrin.core.loader;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class JsoupPageLoader implements PageLoader{
    @Override
    public String load(String url) throws Exception {

//        CookieFromPlaywright cookieFromPlaywright = new CookieFromPlaywright();

//        System.out.println(org.jsoup.Jsoup.connect(url)
//                .userAgent("Chrome/146.0.7680.165 Safari/537.36")
//                .referrer("https://www.google.com/")
////                .cookies(cookieFromPlaywright.getCookies(url))
//                .get()
//                .html());

        Connection.Response response = Jsoup.connect("https://mid.ru/")
                .userAgent("Mozilla/5.0 (Windows; U; Windows NT 6.1; rv:2.2) Gecko/20110201")
                .referrer("https://www.google.com/")
                .execute();

        byte[] bytes = response.bodyAsBytes();

        String html = new String(bytes, "windows-1251");

//        return org.jsoup.Jsoup.connect(url)
//                .userAgent("Chrome/146.0.7680.165 Safari/537.36")
//                .referrer("https://www.google.com/")
////                .cookies(cookieFromPlaywright.getCookies(url))
//                .get()
//                .html();

        return html;
    }
}
