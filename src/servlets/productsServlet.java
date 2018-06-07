package servlets;

import entities.Product;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/servlets/productsServlet")
public class productsServlet extends javax.servlet.http.HttpServlet {

    public static ArrayList<Product> products = new ArrayList<>();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        products.add(new Product(request.getParameter("name1"), request.getParameter("price1")));
        products.add(new Product(request.getParameter("name2"), request.getParameter("price2")));
        products.add(new Product(request.getParameter("name3"), request.getParameter("price3")));

        System.out.println(products.toString());

        response.sendRedirect("http://localhost:8081/summary.jsp");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
