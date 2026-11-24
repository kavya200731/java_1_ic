public class Bank {
    public double getInterestRate() {
        return 0.0;
    }

    public static void main(String[] args) {
        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();

        System.out.println(sbi.getInterestRate());
        System.out.println(hdfc.getInterestRate());
    }
}

class SBI extends Bank {
    @Override
    public double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    public double getInterestRate() {
        return 7.0;
    }
}