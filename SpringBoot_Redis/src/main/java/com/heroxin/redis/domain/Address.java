package com.heroxin.redis.domain;

/*
    @Author Heroxin
    
    @Create 2023-03-09-10:16

    @Description:
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.index.Indexed;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Indexed
    private String city;
    @Indexed
    private String country;
}
