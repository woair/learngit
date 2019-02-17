package com.example.demo;

public class AAAA {
    private static AAAA ourInstance = new AAAA();

    public static AAAA getInstance() {
        return ourInstance;
    }

    private AAAA() {
    }
}
