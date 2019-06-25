package com.demo.toolbox;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionPool {
    private static final Configuration CONFIG;
    private static final SessionFactory SF;

    static {
        CONFIG = new Configuration().configure();
        SF = CONFIG.buildSessionFactory();
    }

    public static Session getSession() {
        return SF.getCurrentSession();
    }
}
