package chainOfResponsibility.models;

import chainOfResponsibility.handlers.ExpenseHandler;

/**
 * Author: Thalys Henrique
 * LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 *
 * Expense Approval App
 */

public class CEO extends ExpenseHandler {

    @Override
    protected boolean canApproveExpense(Expense expense) {
        if(expense.getValue() > 5000){
            return true;
        }
        return false;
    }

    @Override
    protected void doApproveExpense(Expense expense) {
        System.out.println("Expenses CEO approve");
    }
}
