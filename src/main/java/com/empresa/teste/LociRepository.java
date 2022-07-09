package com.empresa.teste;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LociRepository extends CrudRepository<Loci, String> { }
  
