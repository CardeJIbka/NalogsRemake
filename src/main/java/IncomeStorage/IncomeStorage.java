package IncomeStorage;

import IncomeStatement.IncomeStatement;

import java.util.ArrayList;

public class IncomeStorage {

    private final ArrayList<IncomeStatement> incomeStatements;
    private final Integer year;
    private final String FIO;

    public IncomeStorage(Integer year, String FIO) {
        this.incomeStatements = new ArrayList<IncomeStatement>();
        this.year = year;
        this.FIO = FIO;
    }

    public void addIncome(String organization, double incomeJan,
                          double incomeFeb, double incomeMarch, double incomeApr, double incomeMay,
                          double incomeJune, double incomeJuly, double incomeAug, double incomeSep,
                          double incomeOct, double incomeNov, double incomeDec) {

        this.incomeStatements.add(new IncomeStatement(this.year, this.FIO, organization, incomeJan,
                incomeFeb, incomeMarch, incomeApr, incomeMay, incomeJune, incomeJuly,
                incomeAug, incomeSep, incomeOct, incomeNov, incomeDec));
    }

    public void addIncome(IncomeStatement incomeStatement) {
        if (!incomeStatement.getYear().equals(this.year) && !incomeStatement.getFIO().equals(this.FIO)) {
            throw new IllegalArgumentException("В доходе указан не тот год или ФИО");
        }
        this.incomeStatements.add(incomeStatement);
    }

    public ArrayList<IncomeStatement> getIncomeStatements() {
        return incomeStatements;
    }

    public String getFIO() {
        return FIO;
    }

    public Integer getYear() {
        return year;
    }
}
