package com.Simo.SpringbootBackEnd;

import com.Simo.SpringbootBackEnd.entity.Employee;
import com.Simo.SpringbootBackEnd.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackEndApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackEndApplication.class, args);
	}

	@Autowired

	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 =Employee.builder()
				.firstName("Simo")
				.lastName("Ait")
				.email("m@gmial.com")
				.build();
		Employee employee2 =Employee.builder()
				.firstName("Simo1")
				.lastName("Ait1")
				.email("mo@gmial.com")
				.build();
		Employee employee3 =Employee.builder()
				.firstName("Tony")
				.lastName("Stark")
				.email("Tony@gmial.com")
				.build();
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);




	}
}
