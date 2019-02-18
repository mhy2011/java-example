package com.mhy.singleton.hungry;

import org.junit.Test;

import static org.junit.Assert.*;

public class HungrySingleton01Test {

    @Test
    public void doSomething() {
        HungrySingleton01 instance = HungrySingleton01.getInstance();
        HungrySingleton01 instance2 = HungrySingleton01.getInstance();
        System.out.println("instance = " + instance);
        System.out.println("instance2 = " + instance2);
        assertEquals(instance, instance2);
    }
}