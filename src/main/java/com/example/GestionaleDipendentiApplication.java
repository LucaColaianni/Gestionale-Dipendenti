package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@SpringBootApplication
public class GestionaleDipendentiApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(GestionaleDipendentiApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Luca");
		employee.setLastName("Colaianni");
		employee.setEmailId("lucacolaianni26@gmail.com");
		employeeRepository.save(employee);
		
		Employee employee1 = new Employee();
		employee1.setFirstName("Marco");
		employee1.setLastName("Perini");
		employee1.setEmailId("marcoperini@gmail.com");
		employeeRepository.save(employee1 );
		
		
	}

}
