package com.example.rest.k8s.controller;

import com.example.rest.k8s.model.RequestEntity;
import com.example.rest.k8s.services.OperatorsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class MathOperatorsController {

    private OperatorsInterface operatorsInterface;

    @Autowired
    public MathOperatorsController(OperatorsInterface operatorsInterface) {
        this.operatorsInterface = operatorsInterface;
    }

    @GetMapping(
            path = "add"
    )
    public Map<String, Object> addOperation(@RequestBody RequestEntity request) {
        Map<String, Object> result = new HashMap<>();


        int resultOperation = this.operatorsInterface.add(
                request.getNumber_one(),
                request.getNumber_two()
                );
        System.out.println("Result of Add operation ---> " + resultOperation);

        result.put("result", resultOperation);

        return result;
    }


    @GetMapping(path = "subtract")
    public Map<String, Object> substrateOperation(@RequestBody RequestEntity request) {
        Map<String, Object> result = new HashMap<>();


        int resultOperation = this.operatorsInterface.subtracts(
                request.getNumber_one(),
                request.getNumber_two()
        );
        System.out.println("Result of Subtract operation ---> " + resultOperation);


        result.put("result", resultOperation);

        return result;
    }
}
