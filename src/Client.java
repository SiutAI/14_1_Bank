public class Client extends Thread {
    Bank bank;

    Client(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {

        while (true) {
            bank.take(1000);
            bank.repay(1000);
        }
    }
}
