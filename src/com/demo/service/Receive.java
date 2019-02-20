package com.demo.service;

import com.demo.dao.SaveDatas;
import com.demo.pojo.Num;
import com.demo.toolbox.SessionPool;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Receive {

    public void putToRep(Num num) {
        Session session = SessionPool.getSession();
        Transaction tr = null;

        try {
            tr = session.beginTransaction();
            new SaveDatas().saveNum(num);
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tr != null) {
                tr.rollback();
            }
        }
    }
}
