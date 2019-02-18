package com.mhy.singleton.hungry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HungrySingleton02Test {

    @Test
    public void doSomething() {
        HungrySingleton02 instance = HungrySingleton02.getInstance();
        HungrySingleton02 instance2 = HungrySingleton02.getInstance();
        System.out.println("instance = " + instance);
        System.out.println("instance2 = " + instance2);
        assertEquals(instance, instance2);
    }
}