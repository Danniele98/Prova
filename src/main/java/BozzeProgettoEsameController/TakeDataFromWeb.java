package BozzeProgettoEsameController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class TakeDataFromWeb extends HttpServlet {
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

    	/* Lettura dell'input dall'utente
    	@param("city", "country")
    	*/
        String city = request.getParameter("city");
        String country = request.getParameter("country");
        
        System.out.println("La città selezionata è "+ city+";");
        System.out.println("La città si trova in "+ country+";");
        
        //Do some processing here...
        
        PrintWriter writer=response.get.getWriter();
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your city is: " + city + "<br/>";      
        htmlRespone += "Your country is: " + country + "</h2>";    
        htmlRespone += "</html>";
         
        // return response
        writer.println(htmlRespone);
 
    }
 
}