import java.util.concurrent.atomic.AtomicInteger;

public class Bank {
    AtomicInteger money = new AtomicInteger(10000);
    //private Object lock = new Object();

    int getMoney() {
        return money.get();
    }

    void take(int money) {
            this.money.addAndGet(money * -1);
    }

    void repay(int money) {
        this.money.addAndGet(money);
    }

    public Bank() {

        new Client(this, "Client1").start();
        new Client(this, "Client2").start();
        new Client(this, "Client3").start();
    }
}
