package lifecoding.myapp;

public class AccountingApp {
    
    public static void main(String[] args) {

        double valueOfSupply = Double.parseDouble(args[0]);
        double varRate = 0.1;
        double expenseRate = 0.3;

        double vat = valueOfSupply * varRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - valueOfSupply * expenseRate;

        double dividend1 = income  * 0.5;
        double dividend2 = income * 0.3;
        double dividend3 = income * 0.2;

        
        System.out.println("Value of supply : " + valueOfSupply); //공급가
        System.out.println("VAT : " + vat); // 부가가치세
        System.out.println("Total : " +  total); // 소비자 가격
        System.out.println("Expense : " + expense); // 비용
        System.out.println("Income : " + income); // 순이익
        System.out.println("Dividend 1 : " + dividend1); // 1번째 배당   
        System.out.println("Dividend 2 : " + dividend2); // 2번째 배당   
        System.out.println("Dividend 3 : " + dividend3); // 3번째 배당   
    }
}
