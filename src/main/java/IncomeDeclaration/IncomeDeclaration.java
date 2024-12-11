package IncomeDeclaration;

import IncomeStatement.IncomeStatement;
import IncomeStorage.IncomeStorage;


import java.util.ArrayList;
import java.util.List;

public class IncomeDeclaration {

    private final ArrayList<IncomeStatement> incomeStatements;
    private final Integer year;
    private final String FIO;

    public IncomeDeclaration(IncomeStorage storage) {
        this.year = storage.getYear();
        this.FIO = storage.getFIO();
        this.incomeStatements = storage.getIncomeStatements();
    }

    public ArrayList<IncomeStatement> getIncomeStatements() {
        return incomeStatements;
    }

    public Integer getYear() {
        return year;
    }

    public String getFIO() {
        return FIO;
    }

    public List<Double> getAllIncomesInMonth() {
        List<Double> allIncomesInMonth = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            allIncomesInMonth.add((double) 0);
        }
        for (int i = 0; i < incomeStatements.size(); i++) {
            allIncomesInMonth.set(0, allIncomesInMonth.get(0) + incomeStatements.get(i).getIncomeJan());
            allIncomesInMonth.set(1, allIncomesInMonth.get(1) + incomeStatements.get(i).getIncomeFeb());
            allIncomesInMonth.set(2, allIncomesInMonth.get(2) + incomeStatements.get(i).getIncomeMarch());
            allIncomesInMonth.set(3, allIncomesInMonth.get(3) + incomeStatements.get(i).getIncomeApr());
            allIncomesInMonth.set(4, allIncomesInMonth.get(4) + incomeStatements.get(i).getIncomeMay());
            allIncomesInMonth.set(5, allIncomesInMonth.get(5) + incomeStatements.get(i).getIncomeJune());
            allIncomesInMonth.set(6, allIncomesInMonth.get(6) + incomeStatements.get(i).getIncomeJuly());
            allIncomesInMonth.set(7, allIncomesInMonth.get(7) + incomeStatements.get(i).getIncomeAug());
            allIncomesInMonth.set(8, allIncomesInMonth.get(8) + incomeStatements.get(i).getIncomeSep());
            allIncomesInMonth.set(9, allIncomesInMonth.get(9) + incomeStatements.get(i).getIncomeOct());
            allIncomesInMonth.set(10, allIncomesInMonth.get(10) + incomeStatements.get(i).getIncomeNov());
            allIncomesInMonth.set(11, allIncomesInMonth.get(11) + incomeStatements.get(i).getIncomeDec());
        }
        return allIncomesInMonth;
    }

    public List<Double> getSumIncomeFromYearBegin() {
        List<Double> sumIncome = new ArrayList<>();
        sumIncome.add(getAllIncomesInMonth().getFirst());
        for (int i = 1; i < getAllIncomesInMonth().size(); i++) {
            sumIncome.add(getAllIncomesInMonth().get(i) + sumIncome.get(i - 1));
        }
        return sumIncome;
    }

    public List<Double> getTaxOnSumIncome() {
        List<Double> taxOnSumIncome = new ArrayList<Double>();

        for (int i = 0; i < getSumIncomeFromYearBegin().size(); i++) {
            if (getSumIncomeFromYearBegin().get(i) >= 240000) {
                taxOnSumIncome.add((getSumIncomeFromYearBegin().get(i) - 240000) * 0.2);
            } else if (getSumIncomeFromYearBegin().get(i) >= 24000) {
                taxOnSumIncome.add((getSumIncomeFromYearBegin().get(i) - 24000) * 0.13);
            } else taxOnSumIncome.add((double) 0);
        }
        return taxOnSumIncome;
    }

    public double getSumTax() {
        double sumTax = 0;
        for (int i = 0; i < getAllIncomesInMonth().size(); i++) {
            if (getAllIncomesInMonth().get(i) >= 240000) {
                sumTax += getAllIncomesInMonth().get(i) * 0.2;
            } else if (getAllIncomesInMonth().get(i) >= 24000) {
                sumTax += getAllIncomesInMonth().get(i) * 0.13;
            }
        }
        return sumTax;
    }
}
