package chainOfResponsibility_ExpenseApproval.models;

import chainOfResponsibility_ExpenseApproval.handlers.ExpenseHandler;

/**
 * Author: Thalys Henrique
 * LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 *
 * Expense Approval App
 */

public class Manager extends ExpenseHandler {

    @Override
    protected boolean canApproveExpense(Expense expense) {
        if(expense.getValue() > 0 && expense.getValue() <= 1000){
            return true;
        }
        return false;
    }

    @Override
    protected void doApproveExpense(Expense expense) {
        System.out.println("Expenses Manager approve");
    }
}
