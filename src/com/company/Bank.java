package com.company;

public class Bank {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        System.out.println("Вы положили на счёт: " + (amount += sum));
    }

    public void withDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("Вы не можете снять запрашиваемую сумму чем остаток денег на счёте", sum);
        } else {
            System.out.println("Со счёта снято: " + sum);
            System.out.println("Остаток на счету: " + (amount -= sum));
        }
    }
}
