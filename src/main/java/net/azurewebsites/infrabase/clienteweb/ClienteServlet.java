/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.azurewebsites.infrabase.clienteweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author erocha
 */
@WebServlet(urlPatterns = {"/cliente", "/clienteServlet", "/clienteController"} )
public class ClienteServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("Chamou pelo método GET");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().print("Chamnou pelo método GET");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("Chamou pelo método POST");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().print("Chamnou pelo método POST");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().print("Chamnou pelo método DELETE");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().print("Chamnou pelo método PUT");
    }
    
    
    
    
}
