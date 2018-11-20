package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectpzgt {

        ProjectpzgtDelegate projectpzgtDelegate = new ProjectpzgtDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectpzgtDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}