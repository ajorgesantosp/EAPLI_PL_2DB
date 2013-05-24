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
import java.util.Calendar;
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
    public List<Income> getListIncome() {

        if (lista != null) {
            return lista;
        } else {
            return null;
        }
    }

    public List<Income> getWeeklyIncome() {

        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        Date monday = c.getTime();

        c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);

        Date sunday = c.getTime();

        List<Income> weekly = new ArrayList<Income>();


        for (int i = 0; i < lista.size(); i++) {

            int ano=lista.get(i).getDate().getYear();
            if(ano<0)
                ano=ano+1900+1900;
                
            c.set(ano, lista.get(i).getDate().getMonth()-1, lista.get(i).getDate().getDate());

            Date current = c.getTime();
            if (current.compareTo(monday) >= 0 && current.compareTo(sunday) <= 0) {
                weekly.add(lista.get(i));
            }

        }
        return weekly;



    }

    
    
    public List<Income> getLastMonthIncome() {

        List<Income> monthIncome = new ArrayList<Income>();

        Date d = new Date();
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getDate().getMonth() == d.getMonth()) {
                monthIncome.add(lista.get(i));

            }

        }

        
        return monthIncome;

    }

}
