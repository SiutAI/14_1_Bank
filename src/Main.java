public class Main {

    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        new Client(bank, "Client1").start();
        new Client(bank, "Client2").start();
        new Client(bank, "Client3").start();

        while(true) {
            System.out.println(bank.getMoney());
            Thread.sleep(1000);
        }
    }
}
