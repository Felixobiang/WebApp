package com.openclassrooms.webapp;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerCreateEmployeeTest {
	@Autowired
    public MockMvc mockMvc;

    @Test
    public void testCreateEmployee() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/createEmployee"))
            
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(view().name("formNewEmployee"));
    }
}
