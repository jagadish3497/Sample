package dom.jagadish.com;

import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	@RequestMapper("\hello")
	public void ModelAndView hello(HttpServletResponse response, HttpServletRequest request) {
		String name=request.getParameter("name");
		String password	=request.getParameter("pass");
	if(password.equals("admin") && name.equals("jagadish")) {
		String message="Welcome"+name;
		return new ModelAndView("hellopage","message",message);
	}
	else {
		return new ModelAndView("errorpage","message","Invalid Password");
		
	}
		
	}

}
