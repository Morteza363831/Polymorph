package com.example.polymorph;

import com.example.polymorph.entity.Customer;
import com.example.polymorph.entity.Employee;
import com.example.polymorph.repo.CustomerRepo;
import com.example.polymorph.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.example")
public class PolymorphApplication implements CommandLineRunner {

    @Autowired private CustomerRepo customerRepo;
    @Autowired private EmployeeRepo employeeRepo;
    public static void main(String[] args) {
        SpringApplication.run(PolymorphApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        employee.setName("morteza");
        employee.setCompany("fan");
        employeeRepo.save(employee);
        Customer customer = new Customer();
        customer.setName("ali");
        customer.setEmail("ali@gmail.com");
        customerRepo.save(customer);

        List<Employee> employees = employeeRepo.findAll();
        for (Employee e : employees) {
            System.out.println(e.getName());
        }
    }
}
