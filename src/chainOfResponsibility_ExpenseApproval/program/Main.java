package chainOfResponsibility_ExpenseApproval.program;

import chainOfResponsibility_ExpenseApproval.handlers.ExpenseHandler;
import chainOfResponsibility_ExpenseApproval.models.CEO;
import chainOfResponsibility_ExpenseApproval.models.Director;
import chainOfResponsibility_ExpenseApproval.models.Expense;
import chainOfResponsibility_ExpenseApproval.models.Manager;

/**
 * Author: Thalys Henrique
 * LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 *
 * Expense Approval App
 */

public class Main {
    public static void main(String[] args) {

        // Expenses Handlers
        ExpenseHandler manager = new Manager();
        ExpenseHandler director = new Director();
        ExpenseHandler ceo = new CEO();

        // Configuration Chain of Responsibility
        manager.setNextHandler(director);
        director.setNextHandler(ceo);

        // Expense
        Expense expense = new Expense(2000, "Expenses");

        // Request for expense approval at first handler of chain
        manager.approveExpense(expense);
    }
}
