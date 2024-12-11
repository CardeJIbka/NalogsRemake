import IncomeDeclaration.IncomeDeclaration;
import IncomeStorage.IncomeStorage;

public class Main {
    public static void main(String[] args) {

        IncomeStorage storage = new IncomeStorage(2020, "Роман");
        storage.addIncome("Деньги free", 1200, 3550, 27550,
                52550, 0, 0, 0, 0, 0, 0, 0, 0);
        //storage.addIncome("Деньги легко", 1000, 123, 456,
               // 22, 1, 97, 23, 1234, 433, 44, 112, 0);
        IncomeDeclaration declaration = new IncomeDeclaration(storage);
        System.out.println(declaration.getAllIncomesInMonth());
        System.out.println(declaration.getSumIncomeFromYearBegin());
        System.out.println(declaration.getSumTax());
        System.out.println(declaration.getYear());
        System.out.println(declaration.getFIO());
        System.out.println(declaration.getTaxOnSumIncome());

    }
}
