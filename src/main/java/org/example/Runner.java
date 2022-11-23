package org.example;

import org.example.byuer.Petrovich;
import org.example.byuer.Reshar;
import org.example.config.Config;
import org.example.importer.Absolut;
import org.example.importer.Aist;
import org.example.stock.Stock;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Stock stock = context.getBean(Stock.class);
        Absolut absolut = context.getBean("absolut", Absolut.class);
        absolut.addVodka(3);
        Aist aist = context.getBean("aist", Aist.class);
        aist.addBike(3);
        Petrovich petrovich = context.getBean(Petrovich.class);
        petrovich.getProductsFromStock();
        Reshar reshar = context.getBean(Reshar.class);
        reshar.getProductsFromStock();
    }
}
