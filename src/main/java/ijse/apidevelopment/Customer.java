package ijse.apidevelopment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(value = "/customer")
public class Customer extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer= resp.getWriter();
        writer.println("Hello Customer");

        int number = 3;
        int number1 = Integer.parseInt(req.getParameter("Number"));
        int sum = number  + number1;

        PrintWriter writer1 = resp.getWriter();
        if(sum % 2 == 0){
            writer1.println("Even Number");
        }else{
            writer1.println("Odd Number");
        }
    }
}

