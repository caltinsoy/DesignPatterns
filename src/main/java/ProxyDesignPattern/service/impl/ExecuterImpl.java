package main.java.ProxyDesignPattern.service.impl;

import main.java.ProxyDesignPattern.service.Executer;

public class ExecuterImpl implements Executer {
    @Override
    public void executeQuery(String query) {
        System.out.println("Executing Query: " + query);
    }
}
