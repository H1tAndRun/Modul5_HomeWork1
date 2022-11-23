package org.example.config;

import org.example.employee.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class Config {

    @Bean()
    public Employee misha() {
        Employee employee = new Employee();
        employee.setName("Misha");
        return employee;
    }

    @Bean()
    public Employee zelia() {
        Employee employee = new Employee();
        employee.setName("Zelia");
        return employee;
    }
}
