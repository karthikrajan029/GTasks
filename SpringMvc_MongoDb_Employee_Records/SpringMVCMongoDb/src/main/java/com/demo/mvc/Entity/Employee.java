package com.demo.mvc.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="employees")
public class Employee {

    @Indexed(unique = true)
    private String empId;
    private String empName;
    private String empEmail;
    private String empLocation;
}
