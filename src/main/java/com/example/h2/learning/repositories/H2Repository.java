package com.example.h2.learning.repositories;

import com.example.h2.learning.domains.ElectronicItems;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface H2Repository extends CrudRepository< ElectronicItems,String > {
}
