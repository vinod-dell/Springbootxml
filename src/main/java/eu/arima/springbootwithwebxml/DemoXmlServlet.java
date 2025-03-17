package eu.arima.springbootwithwebxml;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.PrintWriter;

public class DemoXmlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json");
        JSONArray pets = new JSONArray();
        pets.put("cat");
        pets.put("dog");
        try {
            Thread.sleep(80000);
        } catch(Exception e) {
            e.printStackTrace();
        }
        PrintWriter out = resp.getWriter();
        out.println(pets);
        resp.getWriter().write("sleep 80Sec");
    }
}
