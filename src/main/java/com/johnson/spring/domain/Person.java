package com.johnson.spring.domain;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Getter
@ToString
public class Person {
    private String name = "johnson";

    @Autowired
    private Vehicle audiVehicle;

}
