package com.sniper;

import com.sniper.controller.BaseController;
import com.sniper.controller.PostController;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {

        registerEndpoints();

    }

    private void registerEndpoints() {

         register(BaseController.class);
         register(PostController.class);

    }

}
