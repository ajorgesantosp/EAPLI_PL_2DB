/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;

/**
 *
 * @author i110401
 */
public class AlertLimit {

    private BigDecimal weeklyExpenseLimitRed;
    private BigDecimal weeklyExpenseLimitYellow;
    private BigDecimal monthlyExpenseLimitRed;
    private BigDecimal monthlyExpenseLimitYellow;
    private BigDecimal minBalanceRed;
    private BigDecimal minBalanceYellow;
    private BigDecimal deviationLimitRed;
    private BigDecimal deviationLimitYellow;

    public AlertLimit() {
        weeklyExpenseLimitRed = BigDecimal.ZERO;
        weeklyExpenseLimitYellow = BigDecimal.ZERO;
        monthlyExpenseLimitRed = BigDecimal.ZERO;
        monthlyExpenseLimitYellow = BigDecimal.ZERO;
        minBalanceRed = BigDecimal.ZERO;
        minBalanceYellow = BigDecimal.ZERO;
        deviationLimitRed = BigDecimal.ZERO;
        deviationLimitYellow = BigDecimal.ZERO;
    }

    public AlertLimit(BigDecimal elr, BigDecimal ely, BigDecimal emr, BigDecimal emy, BigDecimal mbr, BigDecimal mby, BigDecimal dlr, BigDecimal dly) {
        setWeeklyExpenseLimitRed(elr);
        setWeeklyExpenseLimitYellow(ely);
        setMonthlyExpenseLimitRed(emr);
        setMonthlyExpenseLimitYellow(emy);
        setMinBalanceRed(mbr);
        setMinBalanceYellow(mby);
        setDeviationLimitRed(dlr);
        setDeviationLimitYellow(dly);
    }

    /**
     * @return the weeklyExpenseLimitRed
     */
    public BigDecimal getWeeklyExpenseLimitRed() {
        return weeklyExpenseLimitRed;
    }

    /**
     * @param weeklyExpenseLimitRed the weeklyExpenseLimitRed to set
     */
    public void setWeeklyExpenseLimitRed(BigDecimal weeklyExpenseLimitRed) {
        this.weeklyExpenseLimitRed = weeklyExpenseLimitRed;
    }

    /**
     * @return the weeklyExpenseLimitYellow
     */
    public BigDecimal getWeeklyExpenseLimitYellow() {
        return weeklyExpenseLimitYellow;
    }

    /**
     * @param weeklyExpenseLimitYellow the weeklyExpenseLimitYellow to set
     */
    public void setWeeklyExpenseLimitYellow(BigDecimal weeklyExpenseLimitYellow) {
        this.weeklyExpenseLimitYellow = weeklyExpenseLimitYellow;
    }

    /**
     * @return the monthlyExpenseLimitRed
     */
    public BigDecimal getMonthlyExpenseLimitRed() {
        return monthlyExpenseLimitRed;
    }

    /**
     * @param monthlyExpenseLimitRed the monthlyExpenseLimitRed to set
     */
    public void setMonthlyExpenseLimitRed(BigDecimal monthlyExpenseLimitRed) {
        this.monthlyExpenseLimitRed = monthlyExpenseLimitRed;
    }

    /**
     * @return the monthlyExpenseLimitYellow
     */
    public BigDecimal getMonthlyExpenseLimitYellow() {
        return monthlyExpenseLimitYellow;
    }

    /**
     * @param monthlyExpenseLimitYellow the monthlyExpenseLimitYellow to set
     */
    public void setMonthlyExpenseLimitYellow(BigDecimal monthlyExpenseLimitYellow) {
        this.monthlyExpenseLimitYellow = monthlyExpenseLimitYellow;
    }

    /**
     * @return the minBalanceRed
     */
    public BigDecimal getMinBalanceRed() {
        return minBalanceRed;
    }

    /**
     * @param minBalanceRed the minBalanceRed to set
     */
    public void setMinBalanceRed(BigDecimal minBalanceRed) {
        this.minBalanceRed = minBalanceRed;
    }

    /**
     * @return the minBalanceYellow
     */
    public BigDecimal getMinBalanceYellow() {
        return minBalanceYellow;
    }

    /**
     * @param minBalanceYellow the minBalanceYellow to set
     */
    public void setMinBalanceYellow(BigDecimal minBalanceYellow) {
        this.minBalanceYellow = minBalanceYellow;
    }

    /**
     * @return the deviationLimitRed
     */
    public BigDecimal getDeviationLimitRed() {
        return deviationLimitRed;
    }

    /**
     * @param deviationLimitRed the deviationLimitRed to set
     */
    public void setDeviationLimitRed(BigDecimal deviationLimitRed) {
        this.deviationLimitRed = deviationLimitRed;
    }

    /**
     * @return the deviationLimitYellow
     */
    public BigDecimal getDeviationLimitYellow() {
        return deviationLimitYellow;
    }

    /**
     * @param deviationLimitYellow the deviationLimitYellow to set
     */
    public void setDeviationLimitYellow(BigDecimal deviationLimitYellow) {
        this.deviationLimitYellow = deviationLimitYellow;
    }
}
