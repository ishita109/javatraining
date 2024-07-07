package mmbank;

public class Main {
    public static void main(String[] args) {
        BankFactory bankFactory = new MMBankFactory();

        SavingAcc savingAcc = bankFactory.getNewSavingAcc(101, "Ishita Gandhi", 1000.0f, true);
        CurrentAcc currentAcc = bankFactory.getNewCurrentAcc(102, "John Doe", 2000.0f, 500.0f);

        System.out.println(savingAcc);
        System.out.println(currentAcc);

        savingAcc.withdraw(600);
        currentAcc.withdraw(2300);

        System.out.println(savingAcc);
        System.out.println(currentAcc);
    }
}
