package com.demo.mvc.service;

import com.demo.mvc.DTO.EmployeeDto;
import com.demo.mvc.Entity.Employee;
import com.demo.mvc.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void addEmployeeDetails(EmployeeDto empDto) {
        ModelMapper modelMapper=new ModelMapper();
        Employee emp=modelMapper.map(empDto,Employee.class);
        employeeRepository.save(emp);
    }

    public List<EmployeeDto> displayAll() {
        List<Employee> empList=employeeRepository.findAll();
        List<EmployeeDto> empDtoList=new ArrayList<>();
        for(Employee emp:empList)
        {
            empDtoList.add(new EmployeeDto(emp.getEmpId(),emp.getEmpName(),emp.getEmpEmail(),emp.getEmpLocation()));
        }
        System.out.println(empDtoList);
        return empDtoList;
    }

    public EmployeeDto displayByEmpId(String empId) {
        Employee emp=employeeRepository.findByEmpId(empId);
        ModelMapper mapper=new ModelMapper();
        EmployeeDto employeeDto=mapper.map(emp,EmployeeDto.class);
        return employeeDto;
    }
}
