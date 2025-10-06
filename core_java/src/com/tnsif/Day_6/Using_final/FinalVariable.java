package com.tnsif.Day_6.Using_final;

public class FinalVariable {
    final int x = 100;

    final static int y;
    final static int z;

    void change() {
        // x = 30;  // ❌ cannot reassign
        // y = 200; // ❌ cannot reassign
    }

    @Override
    public String toString() {
        return "FinalVariable [x=" + x + ", y=" + y + ", z=" + z + "]";
    }

    static {
        y = 20;
        z = 100;
        System.out.println("Value of y: " + y);
    }
}
