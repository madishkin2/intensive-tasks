package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(getHappyTicketChance());
    }

    static double getHappyTicketChance() {
        int counterHappyTicket = 0;
        int limitTickerNumber = 999999;
        int[] arrayNumberTicket = new int[6];

        for (int i = 1001; i <= limitTickerNumber; i++) {
            arrayNumberTicket[5] = i % 10;
            arrayNumberTicket[4] = (i % 100) / 10;
            arrayNumberTicket[3] = (i % 1000) / 100;
            arrayNumberTicket[2] = (i % 10000) / 1000;
            arrayNumberTicket[1] = (i % 100000) / 10000;
            arrayNumberTicket[0] = (i % 1000000) / 100000;

            if ((arrayNumberTicket[0] + arrayNumberTicket[1] + arrayNumberTicket[2]) ==
                    (arrayNumberTicket[3] + arrayNumberTicket[4] + arrayNumberTicket[5])) {
                counterHappyTicket++;
            }
        }
        return (double) counterHappyTicket / limitTickerNumber;
    }
}