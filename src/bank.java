public class bank {
    private int balance=10000;
    public void withdraw(int amount){
        if(amount>balance){
            throw new insufficientbalance("insufficientbalance");
        }else{
            balance=balance-amount;
            System.out.println("withdraw successful. remaining balance:"+balance);
        }

    }
}
