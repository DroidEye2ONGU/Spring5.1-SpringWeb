package DroidEye.Servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DroidEye.Bean.Person;

@WebServlet(name = "TestServlet", urlPatterns = "/TestServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.从application域对象中得到IoC容器的引用
        ServletContext servletContext = getServletContext();
        ApplicationContext applicationContext = WebApplicationContextUtils
                .getWebApplicationContext(servletContext);
        //2.从IoC容器中得到需要的bean
        Person person = applicationContext.getBean(Person.class);
        person.hello();
    }
}
