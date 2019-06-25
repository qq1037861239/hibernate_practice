package com.demo.dao;

import com.demo.pojo.Num;
import com.demo.toolbox.SessionPool;
import org.hibernate.Session;

public class SaveDatas {
    public void saveNum(Num num) {
        Session session = SessionPool.getSession();
        session.save(num);
    }
}
