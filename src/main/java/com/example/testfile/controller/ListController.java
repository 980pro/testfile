package com.example.testfile.controller;

import com.example.testfile.dao.TodoDAO;
import com.example.testfile.domain.TodoVO;
import com.example.testfile.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Log4j2
@WebServlet(name = "listconrtoller", urlPatterns = "/todo/list")
public class ListController extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String userid = req.getParameter("userid");
        String userpass = req.getParameter("userpass");
        String age = req.getParameter("age");
        String sex = req.getParameter("sex");
        String[] hobbyArray = req.getParameterValues("hobby");
        String travel = req.getParameter("travel");
        String text = req.getParameter("text");

        TodoVO dto = TodoVO.builder()
                .name(name)
                .userid(userid)
                .userpass(userpass)
                .age(Integer.parseInt(age))
                .sex(sex)
                .hobby(String.join(", ", hobbyArray))
                .travel(travel)
                .text(text)
                .build();

        req.setAttribute("dto", dto);
        try {
            TodoDAO.insert(dto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        req.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(req, resp);
    }
}

