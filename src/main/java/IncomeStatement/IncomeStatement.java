package IncomeStatement;

import java.util.ArrayList;
import java.util.List;

public class IncomeStatement {
    private Integer year;
    private String FIO;
    private String Organization;
    private double incomeJan;
    private double incomeFeb;
    private double incomeMarch;
    private double incomeApr;
    private double incomeMay;
    private double incomeJune;
    private double incomeJuly;
    private double incomeAug;
    private double incomeSep;
    private double incomeOct;
    private double incomeNov;
    private double incomeDec;

    public IncomeStatement(Integer year, String FIO, String organization, double incomeJan,
                           double incomeFeb, double incomeMarch, double incomeApr, double incomeMay,
                           double incomeJune, double incomeJuly, double incomeAug, double incomeSep,
                           double incomeOct, double incomeNov, double incomeDec) {

        this.year = year;
        this.FIO = FIO;
        Organization = organization;
        this.incomeJan = incomeJan;
        this.incomeFeb = incomeFeb;
        this.incomeMarch = incomeMarch;
        this.incomeApr = incomeApr;
        this.incomeMay = incomeMay;
        this.incomeJune = incomeJune;
        this.incomeJuly = incomeJuly;
        this.incomeAug = incomeAug;
        this.incomeSep = incomeSep;
        this.incomeOct = incomeOct;
        this.incomeNov = incomeNov;
        this.incomeDec = incomeDec;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String organization) {
        Organization = organization;
    }

    public double getIncomeJan() {
        return incomeJan;
    }

    public void setIncomeJan(double incomeJan) {
        this.incomeJan = incomeJan;
    }

    public double getIncomeFeb() {
        return incomeFeb;
    }

    public void setIncomeFeb(double incomeFeb) {
        this.incomeFeb = incomeFeb;
    }

    public double getIncomeMarch() {
        return incomeMarch;
    }

    public void setIncomeMarch(double incomeMarch) {
        this.incomeMarch = incomeMarch;
    }

    public double getIncomeApr() {
        return incomeApr;
    }

    public void setIncomeApr(double incomeApr) {
        this.incomeApr = incomeApr;
    }

    public double getIncomeMay() {
        return incomeMay;
    }

    public void setIncomeMay(double incomeMay) {
        this.incomeMay = incomeMay;
    }

    public double getIncomeJune() {
        return incomeJune;
    }

    public void setIncomeJune(double incomeJune) {
        this.incomeJune = incomeJune;
    }

    public double getIncomeJuly() {
        return incomeJuly;
    }

    public void setIncomeJuly(double incomeJuly) {
        this.incomeJuly = incomeJuly;
    }

    public double getIncomeAug() {
        return incomeAug;
    }

    public void setIncomeAug(double incomeAug) {
        this.incomeAug = incomeAug;
    }

    public double getIncomeSep() {
        return incomeSep;
    }

    public void setIncomeSep(double incomeSep) {
        this.incomeSep = incomeSep;
    }

    public double getIncomeOct() {
        return incomeOct;
    }

    public void setIncomeOct(double incomeOct) {
        this.incomeOct = incomeOct;
    }

    public double getIncomeNov() {
        return incomeNov;
    }

    public void setIncomeNov(double incomeNov) {
        this.incomeNov = incomeNov;
    }

    public double getIncomeDec() {
        return incomeDec;
    }

    public void setIncomeDec(double incomeDec) {
        this.incomeDec = incomeDec;
    }

    public List<Double> getIncomes() {
        List<Double> incomes = new ArrayList<>();
        incomes.add(getIncomeJan());
        incomes.add(getIncomeFeb());
        incomes.add(getIncomeMarch());
        incomes.add(getIncomeApr());
        incomes.add(getIncomeMay());
        incomes.add(getIncomeJune());
        incomes.add(getIncomeJuly());
        incomes.add(getIncomeAug());
        incomes.add(getIncomeSep());
        incomes.add(getIncomeOct());
        incomes.add(getIncomeNov());
        incomes.add(getIncomeDec());
        return incomes;
    }
}
