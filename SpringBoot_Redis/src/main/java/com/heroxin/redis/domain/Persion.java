package com.heroxin.redis.domain;

/*
    @Author Heroxin
    
    @Create 2023-03-09-10:13

    @Description:
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.util.List;

@RedisHash("persion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persion {
    @Id
    private String id;
    @Indexed
    private String firstname;
    @Indexed
    private String lastname;
    private Address address;
    private List<Family> familyList;

    public Persion(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}