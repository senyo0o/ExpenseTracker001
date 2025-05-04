package com.SenyoSenaya.ExpenseTracker.services.expense;


import com.SenyoSenaya.ExpenseTracker.dto.ExpenseDTO;
import com.SenyoSenaya.ExpenseTracker.entity.Expense;
import com.SenyoSenaya.ExpenseTracker.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor


public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;


    public Expense postExpense(ExpenseDTO expenseDTO) {
        return saveorUpdateExpense(new Expense(), expenseDTO);
    }

    private Expense saveorUpdateExpense(Expense expense, ExpenseDTO expenseDTO) {
        expense.setTitle(expenseDTO.getTitle());
        expense.setDate(expenseDTO.getDate());
        expense.setAmount(expenseDTO.getAmount());
        expense.setCategory(expenseDTO.getCategory());
        expense.setDescription(expenseDTO.getDescription());



        return expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll().stream()
                .sorted(Comparator.comparing(Expense::getDate).reversed())
                .collect(Collectors.toList());
    }
}
