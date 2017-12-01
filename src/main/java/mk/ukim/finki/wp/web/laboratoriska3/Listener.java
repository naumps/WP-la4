package mk.ukim.finki.wp.web.laboratoriska3;


import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class Listener implements HttpSessionAttributeListener, HttpSessionListener, ServletRequestListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("Sesiski atribut dodaden: '" + se.getName() + "' so vrednost: " + se.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("Sesiski atribut izbrisan: " + se.getName());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("Sesiski atribut zamenet: '" + se.getName() + "' so vrednost: " + se.getValue());

    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Sesija kreirana: " + se.toString());

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Sesija unistena: " + se.toString());
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Nov povik do servlet: " + sre.toString());

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Inicijalizacija na povik do servlet: " + sre.toString());
    }

}
