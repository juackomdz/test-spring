package com.juacko.springsql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juacko.springsql.Entity.TestEntity;


@Service
public interface SpringService {

	List<TestEntity> obtendata() throws Exception;
}
