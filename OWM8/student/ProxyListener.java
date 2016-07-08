package student;
import java.lang.reflect.*;

public class ProxyListener implements java.lang.reflect.InvocationHandler {

    public ProxyListener() {         

    }    

    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable

    {

        Object result = null;

        try {

            // Prints the method being invoked

            System.out.print("begin method "+ m.getName() + "(");

            


         // if the method name equals some method's name then call your method


      } catch (Exception e) {

           throw new RuntimeException("unexpected invocation exception: " +

                                  e.getMessage());

     } finally {

             System.out.println("end method " + m.getName());

    }

   return result;

  }
}