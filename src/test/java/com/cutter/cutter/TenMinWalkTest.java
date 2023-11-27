package com.cutter.cutter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TenMinWalkTest {
    @Test

    public void Test() {
        TenMinWalk tenMinWalk = new TenMinWalk();
        assertEquals(true, tenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        assertEquals(false, tenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        assertEquals(false, tenMinWalk.isValid(new char[] {'w'}));
        assertEquals( false, tenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }

}