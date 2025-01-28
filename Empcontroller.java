package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Empcontroller {

@Autowired

emprepo emprepo;

@GetMapping("/emp1")

public List<employeeees> getAll()

{

	return emprepo.findAll();

}
@PostMapping("/insertemp1")
	public employeeees create(@Value(value="")@RequestBody employeeees empobj)
	{
	return emprepo.save(empobj);
	}

}

