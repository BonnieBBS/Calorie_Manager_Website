/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bonnie
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FormInfo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        System.out.println("test: "+action);
        
        if (action == null) {
            action = "join";
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        } else if (action.equals("subscribe")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String birthday = request.getParameter("birthday");
            String email = request.getParameter("email");
            String tel = request.getParameter("tel");
            String gender = request.getParameter("gender");

            Subscriber subscriber = new Subscriber(firstName, lastName, birthday, email, tel, gender);
            
            // set User object in request object and set URL
            request.setAttribute("subscriber", subscriber);
            
            url = "/thanks.jsp";   // the "thanks" page
        }

        // forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

}
