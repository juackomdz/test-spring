package com.juacko.springsql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.juacko.springsql.Entity.TestEntity;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Integer>{

	@Query(value = "select top 3 id,NOMBRE_COMPLETO,RUT "+
	"from dbo.TB_Entidad ", nativeQuery = true)
	public List<TestEntity> obtenTest();
}
