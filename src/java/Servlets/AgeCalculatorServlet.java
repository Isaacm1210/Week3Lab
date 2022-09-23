
package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mhame
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                        .forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String AgeS = request.getParameter("age");
        
        if(AgeS == null || AgeS == ""){
            
            request.setAttribute("ageMessage", "You must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
        }
        else{
            int ageI = Integer.parseInt(AgeS);
        
        ageI = ageI + 1;
        
        request.setAttribute("ageMessage", "Your age next Birthday will be: " + ageI);
        request.setAttribute("ageVal", AgeS);
        
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
        }
        
     
    }

}
