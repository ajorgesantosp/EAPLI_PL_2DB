/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;

/**
 *
 * @author Filipe
 */
public abstract class BaseUI {

    BaseController bc;

    abstract void doShow();

    protected abstract BaseController getController();

    public void showBalance() {
       getController().showWeeklyExpenses();
       getController().ShowlastMonthExpensesLoop();
    }
    //
}
