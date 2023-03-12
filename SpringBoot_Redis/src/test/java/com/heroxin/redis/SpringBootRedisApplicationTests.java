package com.heroxin.redis;

import com.heroxin.redis.domain.Address;
import com.heroxin.redis.domain.Family;
import com.heroxin.redis.domain.Persion;
import com.heroxin.redis.repository.PersionRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringBootRedisApplicationTests {

    @Autowired
    private PersionRepository repository;
    @Test
    public void savePersion(){
        Persion persion01 = new Persion("楚", "鑫");
        Persion persion02 = new Persion("wen", "xin");
        Address address01 = new Address("河北", "南京");
        persion01.setAddress(address01);
        List<Family> list = new ArrayList<>();
        Family bro = new Family("兄", "鑫");
        Family sis = new Family("妹", "静");
        list.add(bro);
        list.add(sis);
        persion01.setFamilyList(list);
        Persion save01 = repository.save(persion01);
        Persion save02 = repository.save(persion02);
        System.out.println(save01);
        System.out.println(save02);

    }

    @Test
    public void selectPersion(){
        System.out.println(repository.findByAddress_City("河北"));
    }
    @Test
    public void updatePersion(){
        Persion persion = repository.findByFirstnameAndLastname("楚", "鑫").get(0);
        persion.setFirstname("阿");
        Persion save = repository.save(persion);
        System.out.println(save);
    }
    @Test
    public void deletePersion(){
        Persion persion = repository.findByFirstnameAndLastname("wen", "xin").get(0);
        repository.delete(persion);

    }
}
