package com.heroxin.redis.repository;

/*
    @Author Heroxin
    
    @Create 2023-03-09-11:00

    @Description:
*/

import com.heroxin.redis.domain.Persion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersionRepository extends CrudRepository<Persion,String> {
   List<Persion> findByLastname(String lastname);
   Page<Persion> findPersionByLastname(String lastname, Pageable page);
   List<Persion> findByFirstnameAndLastname(String firstname,String lastname);
   List<Persion> findByAddress_City(String city);
   List<Persion> findByFamilyList_Username(String username);

}
