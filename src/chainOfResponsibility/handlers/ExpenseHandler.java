package chainOfResponsibility.handlers;

import chainOfResponsibility.models.Expense;

/**
 * Author: Thalys Henrique
 * LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 *
 * Expense Approval App
 */

public abstract class ExpenseHandler {

    private ExpenseHandler nextHandler;
    protected abstract boolean canApproveExpense(Expense expense);
    protected abstract void doApproveExpense(Expense expense);

    /**
     *
     */
    public void approveExpense(Expense expense){
        if(canApproveExpense(expense)){
            doApproveExpense(expense);
        } else if(nextHandler != null){
            nextHandler.approveExpense(expense);
        } else {
            System.out.println("Manipulator for expense approve not found");
        }
    }

    public void setNextHandler(ExpenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
