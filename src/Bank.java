public class Bank {
    private static int money = 10000;

    /*
    public Bank() {

        Thread client1 = new Client();
        Thread client2 = new Client();
        Thread client3 = new Client();

        client1.start();
        client2.start();
        client3.start();



        new Client(this, "Client1").start();
        new Client(this, "Client2").start();
        new Client(this, "Client3").start();

    }
    */

    int getMoney() {
        return money;
    }

    static synchronized void take(int money) {
        Bank.money -= money;
    }

    static synchronized void repay(int money) {
        Bank.money += money;
    }
}
