package example;
import example.GetInfo;

public class Main {
    public static void main(String[] args) {
        GetInfo input = new GetInfo();
        String information = input.info();
        HttpServletRequest request = new HttpServletRequest();
        HttpServletRequest response = new HttpServletRequest();
        request.setParameter("username", information);
        request.setParameter("password", information);
        LoginServlet servlet = new LoginServlet();
        servlet.doPost(request, response);
    }
}
