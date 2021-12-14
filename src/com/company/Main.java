package com.company;

public class Main {

    public static void main(String[] args) {

        int numberClients = 3;
        int numberDeliveryOptions = 0;
        do {
            numberDeliveryOptions += numberClients;
        } while (numberClients-- > 0);

        System.out.println("Количество вариантов доставки = " + numberDeliveryOptions);
    }
}
