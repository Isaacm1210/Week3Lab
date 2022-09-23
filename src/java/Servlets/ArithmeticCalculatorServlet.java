/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Isaac Mhamed
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("result", "---");
        
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp")
                .forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String operation = request.getParameter("operator");
        
        request.setAttribute("FirstNum", first);
        request.setAttribute("SecondNum", second);
        
        int result;
        
        boolean isNumValid = true;
        
        
        if(first == null || first == "" || second == null || second == ""){
            isNumValid = false;
        }
        
        if(isNumValid == false){
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp")
                .forward(request, response);
        }
        else if(operation.equals("+")){
            int firstNum = Integer.parseInt(first);
            int secondNum = Integer.parseInt(second);
            result = firstNum + secondNum;
            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp")
                .forward(request, response);
        }
        else if(operation.equals("-")){
            int firstNum = Integer.parseInt(first);
            int secondNum = Integer.parseInt(second);
            result = firstNum - secondNum;
            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp")
                .forward(request, response);
        }
        else if(operation.equals("*")){
            int firstNum = Integer.parseInt(first);
            int secondNum = Integer.parseInt(second);
            result = firstNum * secondNum;
            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp")
                .forward(request, response);
        }
        else{
            int firstNum = Integer.parseInt(first);
            int secondNum = Integer.parseInt(second);
            result = firstNum % secondNum;
            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp")
                .forward(request, response);
        }
    }


}
