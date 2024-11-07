package org.iesch.org.rest1.config;

import org.iesch.org.rest1.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Configuracion {

    @Bean
    public List<Product> inicializa(){
        List<Product> products = new ArrayList<>();

        products.add(Product.builder().id(1).name("Fairy").categoria("Limpieza").price(2.36).description("Lava platos a mano").stock(4).build());
        products.add(Product.builder().id(2).name("Lejía").categoria("Limpieza").price(4.00).description("Lava suelos").stock(5).build());
        products.add(Product.builder().id(3).name("Jabon de manos").categoria("Limpieza").price(2.00).description("Lava manos").stock(10).build());
        products.add(Product.builder().id(4).name("Estropajo").categoria("Limpieza").price(0.75).description("Lava platos a mano").stock(34).build());
        products.add(Product.builder().id(5).name("Sal lavavajillas").categoria("Limpieza").description("Lava platos").price(1.57).stock(20).build());
        products.add(Product.builder().id(6).name("Ariel").categoria("Limpieza").price(3.98).description("Lava platos").stock(46).build());
        products.add(Product.builder().id(7).name("Suavizante").categoria("Limpieza").price(5.90).description("Lava ropa").stock(43).build());
        products.add(Product.builder().id(8).name("Fregona").categoria("Limpieza").price(2.36).description("Lava suelo").stock(6).build());

        return products;
    }

}
