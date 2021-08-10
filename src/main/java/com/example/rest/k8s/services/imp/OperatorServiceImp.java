package com.example.rest.k8s.services.imp;

import com.example.rest.k8s.services.OperatorsInterface;
import org.springframework.stereotype.Service;

@Service
public class OperatorServiceImp implements OperatorsInterface {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtracts(int num1, int num2) {
        return num1 - num2;
    }
}
