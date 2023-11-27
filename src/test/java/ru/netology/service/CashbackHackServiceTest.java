package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainAmountMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;

        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}