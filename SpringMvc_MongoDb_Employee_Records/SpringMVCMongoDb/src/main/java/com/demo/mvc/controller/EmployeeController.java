package com.demo.mvc.controller;

import com.demo.mvc.DTO.EmployeeDto;
import com.demo.mvc.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Controller
public class EmployeeController {

    @Autowired
    EmployeeService empService;


    @RequestMapping("/addEmployee")
    public String addEmployeeDetails(@RequestParam("empName") String empName, @RequestParam("empId") String empId, @RequestParam("empMail") String empMail, @RequestParam("empLocation") String empLocation, Model model)
    {
        EmployeeDto empDto=new EmployeeDto();
        empDto.setEmpId(empId);
        empDto.setEmpName(empName);
        empDto.setEmpEmail(empMail);
        empDto.setEmpLocation(empLocation);
        empService.addEmployeeDetails(empDto);
        return "display";
    }

    @RequestMapping(value="/displayAll",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> displayAll() throws JsonProcessingException {
        List<EmployeeDto> empDtoList;
        empDtoList=empService.displayAll();
        ObjectMapper mapper=new ObjectMapper();
        String response=mapper.writeValueAsString(empDtoList);
        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(response,headers,HttpStatus.OK);
    }

    @RequestMapping(value="/displayByEmpId/{empId}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> displayByEmpId(@PathVariable(value="empId") String empId) throws JsonProcessingException {

        EmployeeDto empDto=empService.displayByEmpId(empId);
        ObjectMapper mapper=new ObjectMapper();
        String response=mapper.writeValueAsString(empDto);
        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(response,headers,HttpStatus.OK);
    }
}
