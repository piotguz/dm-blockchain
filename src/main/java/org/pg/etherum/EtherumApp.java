package org.pg.etherum;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class EtherumApp extends SpringBootServletInitializer {
    public static void main (String[]args){
        new EtherumApp()
                .configure(new SpringApplicationBuilder(EtherumApp.class))
                .run(args);
    }
}
