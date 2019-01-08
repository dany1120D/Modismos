/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.ModismoDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author danie
 */
@WebServlet(name = "ModismoController", urlPatterns = {"/ModismoController"})
public class ModismoController extends HttpServlet {
    private static final String LISTAR_PALABRAS="/listaPalabras.jsp";
    private ModismoDao dao;
    
    public ModismoController(){
    dao = new ModismoDao();
    }    
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String forward = "";
        String accion=request.getParameter("action");
        
        if (accion.equals("listaPalabras"))
        {
            forward = LISTAR_PALABRAS;
            //Es lo mismo de las dos formas
//            forward="/listaPalabras.jsp";
            request.setAttribute("palabras", dao.read());
        }
        
        RequestDispatcher view=request.getRequestDispatcher(forward);
        view.forward(request,response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
