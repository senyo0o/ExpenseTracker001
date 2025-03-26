package com.SenyoSenaya.ExpenseTracker.repository;


import com.SenyoSenaya.ExpenseTracker.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
