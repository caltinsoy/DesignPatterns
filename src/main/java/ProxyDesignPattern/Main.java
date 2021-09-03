package main.java.ProxyDesignPattern;

import main.java.ProxyDesignPattern.service.Executer;
import main.java.ProxyDesignPattern.service.impl.ExecutorProxy;

public class Main {

    public static void main(String[] args) throws Exception {
//        Executer nonAdminExecuter = new ExecutorProxy("NonAdmin", "Admin@123");
//        nonAdminExecuter.executeQuery("DELETE");

        Executer adminExecuter = new ExecutorProxy("ADMIN", "password");
        adminExecuter.executeQuery("DELETE");
    }
}
