package com.juacko.springsql.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juacko.springsql.Entity.TestEntity;
import com.juacko.springsql.repository.TestRepository;
import com.juacko.springsql.service.SpringService;

@Service
public class SpringServiceImp implements SpringService{

	@Autowired
	private TestRepository test;
	
	@Override
	public List<TestEntity> obtendata() throws Exception{
		
		List<TestEntity> lista = test.obtenTest();
		
		return lista;
		
	}
}
