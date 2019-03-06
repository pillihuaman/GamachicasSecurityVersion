package common.System.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import domain.System.BusinessEntity.Base.Imagen;

@Controller("/Imagen")
public class ImagenController {
	   @RequestMapping(value = "/RegisterImagen", method = RequestMethod.GET)
	   public ModelAndView student( ModelMap mod) {
		   mod.addAttribute("Mensaje", "Registra informacion basica");
		   return new ModelAndView("RegisterImagen", "command", new Imagen());
	   }
	   
	   @RequestMapping(value = "/addImagen", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("command")Imagen Imagen,
	   ModelMap model) {
         int idimagen=Imagen.getIdimagen();
         byte[] img= Imagen.getImagendata();
//	      model.addAttribute("name", student.getName());
//	      model.addAttribute("age", student.getAge());
//	      model.addAttribute("id", student.getId());
		    return "addImagen";
	      
	   }
	
}
