package chainOfResponsibility_ExpenseApproval.test;

import chainOfResponsibility_ExpenseApproval.handlers.ExpenseHandler;
import chainOfResponsibility_ExpenseApproval.models.CEO;
import chainOfResponsibility_ExpenseApproval.models.Director;
import chainOfResponsibility_ExpenseApproval.models.Expense;
import chainOfResponsibility_ExpenseApproval.models.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExpenseApproval {

    ExpenseHandler manager;
    ExpenseHandler director;
    ExpenseHandler ceo;
    Expense expenseManager;
    Expense expenseDirector;
    Expense expenseCEO;
    @Before
    public void initialize(){
        manager = new Manager();
        director = new Director();
        ceo = new CEO();

        manager.setNextHandler(director);
        director.setNextHandler(ceo);
    }

    @Test
    public void testManager(){
        expenseManager = new Expense(999, "Expenses Manager");
        manager.approveExpense(expenseManager);

        assertEquals(999, expenseManager.getValue(), 0);
    }

    @Test
    public void testDirector(){
        expenseDirector = new Expense(4999, "Expenses Director");
        manager.approveExpense(expenseDirector);

        assertEquals(4999, expenseDirector.getValue(), 0);
    }

    @Test
    public void testCEO(){
        expenseCEO = new Expense(9999, "Expenses CEO");
        manager.approveExpense(expenseCEO);

        assertEquals(9999, expenseCEO.getValue(), 0);
    }
}
