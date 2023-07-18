package ru.netology.service;



public class CashbackHackServiceTest {

    @org.junit.Test

    public void remainIfEquals(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(actual, expected);

    }
    @org.junit.Test

    public void remainIfLess(){
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        org.junit.Assert.assertEquals(actual, expected);
    }
}
