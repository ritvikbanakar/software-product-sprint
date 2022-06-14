package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String textValue = request.getParameter("text-input");

    // Print the value so you can see it in the server logs.
    if (textValue.length() != 0) {
        System.out.println("You submitted: " + textValue);
    }

    // Write the value to the response so the user can see it.
    response.getWriter().println("<head><title>Submitted</title></head>");
    response.getWriter().println("<link rel=\"stylesheet\" href=\"https://cdn.simplecss.org/simple-v1.css\">");
    response.getWriter().println("<h1>I got your message!</h1>");
    response.getWriter().println("<a href=\"../\">Click here to go back</a>");
  }
}