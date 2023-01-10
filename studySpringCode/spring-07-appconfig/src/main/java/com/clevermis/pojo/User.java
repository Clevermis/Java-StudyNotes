package com.clevermis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
@AllArgsConstructor
//这里这个注解的意思是。就是说明这个类被spring接管了，注册到了容器中。
@Component
public class User {

    private String name;

    public String getName() {
        return this.name;
    }
    @Value("clevermis")// 属性注入值
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            '}';
    }
}
