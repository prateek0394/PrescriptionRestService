package com.sniper.controller;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by jainpj on 11/02/17.
 */
@Path("/postReq1")
public class PostController {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> req1(Map<String, String> obj){
        Map<String, String> obj2 = new HashMap<>();
        obj2.putAll(obj);
        System.out.println(obj);
        obj2.put("msg","Its working man");
        return obj2;
    }
}
