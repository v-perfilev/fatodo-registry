package com.persoff68.fatodo;

import com.persoff68.fatodo.config.AppProfileUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Properties;

@SpringBootApplication
@EnableEurekaServer
public class FatodoRegistryApplication {

    public static void main(String[] args) {
        Properties defaultProfileProperties = AppProfileUtils.getDefaultProfile();
        SpringApplication app = new SpringApplication(FatodoRegistryApplication.class);
        app.setDefaultProperties(defaultProfileProperties);
        app.run();
    }

}
