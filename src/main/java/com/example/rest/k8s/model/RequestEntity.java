package com.example.rest.k8s.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestEntity {
    private int number_one;
    private int number_two;
}
