package common.System.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import domain.System.BusinessEntity.ViewStockBE;
import domain.System.BusinessEntity.Base.Imagen;
import model.system.repository.stockClothes;

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

     	ViewStockBE objs= new ViewStockBE();
    	stockClothes stockClothes= new stockClothes();
    	stockClothes.getViewStock(objs);
         
         
         
		    return "addImagen";
	      
	   }
	
}
