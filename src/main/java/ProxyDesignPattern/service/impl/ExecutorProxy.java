package main.java.ProxyDesignPattern.service.impl;

import main.java.ProxyDesignPattern.service.Executer;
import main.java.ProxyDesignPattern.util.ExecutorDefaults;

public class ExecutorProxy implements Executer {

    private boolean isAdmin;
    private final ExecuterImpl executer;

    public ExecutorProxy(String name, String pass) {
        if (ExecutorDefaults.USER_NAME.equals(name) &&
                ExecutorDefaults.password.equals(pass)) {
            isAdmin = true;
        }
        executer = new ExecuterImpl();
    }

    @Override
    public void executeQuery(String query) throws Exception {
        if (ExecutorDefaults.DELETE_QUERY.equals(query)) {
            if (!isAdmin)
                throw new Exception("Query cannot executed except ADMIN ROLE");
            executer.executeQuery(query);
        }
    }
}
