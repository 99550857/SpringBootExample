package com.niit.kstart;

import com.niit.kstart.controller.CourseController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by 99550 on 2018/9/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {
    private MockMvc mvc;
    //构建MockMvc
    @Before
    public void setUp() throws Exception{
//        mvc = MockMvcBuilders.standaloneSetup(new CourseController()).build();
    }

    //测试Controller层
    @Test
    public void getHello() throws Exception{
//        mvc.perform(MockMvcRequestBuilders.get("/course").accept(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print()).andReturn();
    }
}
