/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.inMemory.IncomeRepository;
import eapli.exception.EmptyList;
import eapli.util.DateTime;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Renato
 */
public class RecordIncome {
    IncomeRepository inc;
    private static List<Income> lista = new ArrayList<Income>();
    
    
    public RecordIncome(){
        inc= new IncomeRepository();
    }
    
    public void loadRepository() throws EmptyList {
        lista = inc.getList();

    }
    
    public List<Income> getExpenseBetweenDates(String begin,String end) throws Exception{
        List<Income> income = new ArrayList<Income>();
        Date beginDate=DateTime.parseDate(begin);
        Date endDate=DateTime.parseDate(end);
        System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++) {
            
            Date d=(Date)lista.get(i).getDate();
            if (d.compareTo(beginDate)>=0 && d.compareTo(endDate)<=0) {
                income.add(lista.get(i));
            }
        }
        
        return income;
    }
   
}
