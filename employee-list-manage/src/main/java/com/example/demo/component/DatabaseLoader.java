package com.example.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

/**
 * データ初期設定
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

	// DI
	private final EmployeeRepository repository;

	@Autowired
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	// 初期データ投入
	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Employee("Abe", "Ryo", "engineer"));
	}
}
