public class Client extends Thread {
    Bank bank;
    String name;

    Client(Bank bank, String name) {
        this.bank = bank;
        this.name = name;
    }

    @Override
    public void run() {

        while (true) {
            if (bank.getMoney() >= 1000) {
                bank.take(1000);
                //System.out.println(name + " took 1000 money");
                bank.repay(1000);
                //System.out.println(name + " repay 1000 money");
            }
        }
    }
}
