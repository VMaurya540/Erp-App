package com.geekster.erpapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudenntPercentageDTO {
    private int rollNo;
    private String name;
    private double percentage;
}
