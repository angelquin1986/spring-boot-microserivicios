package com.ec.qsoft.inventario;

import com.ec.qsoft.util.spring.ribbon.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath*:applicationContext.xml"})
@SpringBootApplication
@EnableFeignClients
@RibbonClient(name = "inventario", configuration = RibbonConfiguration.class)
public class FacturacionApplication {

    public static void main(String[] args) {
        SpringApplication.run(FacturacionApplication.class, args);
    }

}
