package com.example.demo.repository;

import com.example.demo.entity.Dep;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepRepository extends CrudRepository<Dep,Long> {
   @Qualifier("select u from Dep u.depName=:depName")
   public Dep findByDepName(@Param("depName") String depName);

//   public Dep findByDepNameIgnoreCase(String depName);
}
