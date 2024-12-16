public class GSave implements BankAccountDecorator{

    private final BankAccountDecorator account;

    public GSave(BankAccountDecorator account){
        this.account = account;
    }

    @Override
    public String showAccountType(){
        return "GSave";
    }

    @Override 
    public double getInterestRate(){
        return 0.025; // 2.5%
    }

    @Override 
    public double getBalance(){
        return account.getBalance();
    }

    @Override 
    public String showBenefits(){
        return account.showBenefits() + ", GCash Transfer";
    }

    @Override 
    public double computeBalanceWithInterest(){
        return getBalance() + (getBalance()*getInterestRate());
    }

    @Override
    public String showInfo(){
        return account.showInfo();
    }
}
