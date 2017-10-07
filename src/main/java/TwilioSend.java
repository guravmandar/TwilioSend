

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioSend extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TwilioSend() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().println("Mandar's SMS Service");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {// TODO Auto-generated method stub
		doGet(request, response);

		String accountSid = "AC9940407b8af9da883b301dc4f0c1a19f";
		String authToken = "33103f6df95f74c8a9ed4d3d455e4c0a";

		Twilio.init(accountSid, authToken);
		Message message = Message.creator(new PhoneNumber("+15512295964"), // to
				new PhoneNumber("+15512281160"), // from
				"Hello from MANDAR GURAV CS 643 Fall 2017" // body
		).create();

		System.out.println(message.getSid());}

}
