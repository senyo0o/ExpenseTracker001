package com.SenyoSenaya.ExpenseTracker.controller;


import com.SenyoSenaya.ExpenseTracker.dto.ExpenseDTO;
import com.SenyoSenaya.ExpenseTracker.entity.Expense;
import com.SenyoSenaya.ExpenseTracker.services.expense.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expense")
@RequiredArgsConstructor
@CrossOrigin

public class ExpenseController {


    private final ExpenseService expenseService;

    @PostMapping

    public ResponseEntity<?> postExpense(@RequestBody ExpenseDTO dto) {
        Expense createdExpense = expenseService.postExpense(dto);
        if (createdExpense != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdExpense);
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @GetMapping("/all")
    public ResponseEntity<?> getAllExpenses() {
        return ResponseEntity.ok(expenseService.getAllExpenses());
    }

}
