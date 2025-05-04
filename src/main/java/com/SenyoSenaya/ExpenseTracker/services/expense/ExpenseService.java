package com.SenyoSenaya.ExpenseTracker.services.expense;

import com.SenyoSenaya.ExpenseTracker.dto.ExpenseDTO;
import com.SenyoSenaya.ExpenseTracker.entity.Expense;

import java.util.List;

public interface ExpenseService {

    Expense postExpense(ExpenseDTO expenseDTO);


     List<Expense> getAllExpenses();
}
