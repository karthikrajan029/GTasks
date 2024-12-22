package com.demo.mvc.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    @Id
    private String empId;
    private String empName;
    private String empEmail;
    private String empLocation;
}
