package com.clevermis.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;

}
