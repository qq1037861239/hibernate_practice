package com.demo.servlet;

import com.demo.pojo.Num;
import com.demo.service.Receive;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;


@WebServlet(name = "receive", urlPatterns = "/receive")
public class ReceiveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        StringBuilder data = new StringBuilder();
        String line = null;

        try {
            BufferedReader br = req.getReader();
            while ((line = br.readLine()) != null) {
                data.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String jsonstr = data.toString();

        Gson gson = new Gson();
        Num num = gson.fromJson(jsonstr, Num.class);
        System.out.println(num.toString());
        new Receive().putToRep(num);
    }
}
