package com.example.myblog.controller;

import com.jayway.jsonpath.JsonPath;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

//import static org.junit.matchers
public class BlogControllerTest {

    @InjectMocks
    private BlogController blogController;

    private MockMvc mockMvc;

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(blogController).build();
    }

    @Test
    public void test() throws Exception {
        mockMvc.perform(get("/test")).andDo(print());


    }
    @Test
    public void testCreateBlogEntry() throws Exception {
        mockMvc.perform(post("/create")
                .content("{\"title\":\"Blog entry test\"}")
                .contentType(MediaType.APPLICATION_JSON)
        ).andDo(print());


    }
}
