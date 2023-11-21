package com.juacko.springsql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.juacko.springsql.Entity.TestEntity;
import com.juacko.springsql.service.SpringService;

@RestController
@RequestMapping("/v1/api")
public class SpringController {

	@Autowired
	SpringService service;
	
	@GetMapping("/consultadata")
	public List<TestEntity> consulta() {
		
		String resultado = null;
		List<TestEntity> datos = null;
		try {
			datos = service.obtendata();
			
			//resultado = datos.toString();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return datos;
	}

	@GetMapping("/testdata")
	public List<TestEntity> obten2(@RequestParam(value = "run") int run) {
		
		List<TestEntity> lista = null;
		try {
			

			lista = service.obtendata();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}
}
