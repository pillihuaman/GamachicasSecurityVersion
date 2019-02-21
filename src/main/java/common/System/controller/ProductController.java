package common.System.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

//import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;



@Controller
public class ProductController extends AbstractController {

	
	
	   @RequestMapping(value="/productos",method=RequestMethod.GET)
	    public String getproducts(ModelMap mo)
	    {
		   mo.addAttribute("productosopj", "Bienvenidos a los productos");
	    	    	 return "productos";
	    	
	    }
	  @RequestMapping(value="/listProduct",method=RequestMethod.GET)
	   public String model()
	   {
     
        
       //model.addAttribute("Welcome","stadgfdsfgge");//Users Users = new Users();
    
		    return "listProduct";
		   
	   }
	   /*
		@RequestMapping(value = "/listProduct", method = RequestMethod.GET)
		   public String employee(ModelMap model) {
			model.addAttribute("heading", "helo");
		      return "listProduct";
		   }*/
		
		/* @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
		   public String addEmployee(@ModelAttribute("SpringWeb")Employee emp, 
		   ModelMap model) {
		      model.addAttribute("ID", emp.getID());
		      model.addAttribute("name", emp.getName());
		      model.addAttribute("salary", emp.getSalary());
		      
		      return "showEmployee";
		   }
	 */
	   
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
