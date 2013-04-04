/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;
import Model.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author losa
 */
public class ExpenseRepository  implements IExpenseRepository
{
    // class member
    private static List<Expense> listExpense= new ArrayList<Expense>();

    public ExpenseRepository() {}
    
    public void save(Expense exp)
    {
        if (exp==null) throw new IllegalArgumentException();
        listExpense.add(exp);
      
    }
    
    /**
     * return the last Expense
     */
    public Expense findLast(){
        
        if(listExpense.isEmpty()){
             System.out.println(" No Expense recorded!");
             return null;
        }
        else{
            Expense exp = listExpense.get(listExpense.size()-1);
            return exp;
        }
    }
    
    public List<Expense> getLastMonthExpense(){
        
        List<Expense> monthExpense= new ArrayList<Expense>();
        
        Date d=new Date();
        for(int i=0; i<listExpense.size();i++){
            
            if(listExpense.get(i).getDate().getMonth()==d.getMonth()){
                monthExpense.add(listExpense.get(i));
                
            }
            
        }
        
        
        return monthExpense;
        
    }
    public List<Expense> getList() {
        List<Expense> aExp= listExpense;
        return aExp;
    }
}
