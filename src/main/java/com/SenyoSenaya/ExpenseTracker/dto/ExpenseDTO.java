package com.SenyoSenaya.ExpenseTracker.dto;


import lombok.Data;

@Data

public class ExpenseDTO {

    private Long id;

    private String title;

    private String description;

    private String category;

    private String date;

    private Double amount;


}
