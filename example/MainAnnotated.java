package example;
import example.GetInfo;

public class Main {
    public static void main(String[] args) {
        GetInfo input = new GetInfo();          /*<<< String login; >>>*/
        String information = input.info();      /*<<< public String info(), assigns login = scanner.nextLine(); >>>*/
        HttpServletRequest request = new HttpServletRequest();
        HttpServletRequest response = new HttpServletRequest();
        request.setParameter("username", information);
        request.setParameter("password", information);
        LoginServlet servlet = new LoginServlet();  /*<<< protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException, executes: ResultSet rs = stmt.executeQuery(query);>>>*/
        servlet.doPost(request, response);
    }
}
