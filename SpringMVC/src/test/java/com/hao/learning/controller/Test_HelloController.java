package com.hao.learning.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * @author lingxue created on 10/4/16
 * @version v0.1
 **/

public class Test_HelloController {

    @Test
    public void testHome(){
        HelloController helloController = new HelloController();
        assertEquals(helloController.home(),"home");
    }

    @Test
    public void testHomeBetter() throws Exception{
        HelloController helloController = new HelloController();
        MockMvc mockMvc = standaloneSetup(helloController).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }

}
