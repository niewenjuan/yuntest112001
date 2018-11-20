package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-11-20T03:26:40.792Z")

@RestSchema(schemaId = "projectpzgt")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class ProjectpzgtImpl {

    @Autowired
    private ProjectpzgtDelegate userProjectpzgtDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectpzgtDelegate.helloworld(name);
    }

}
