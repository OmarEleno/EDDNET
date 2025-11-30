package com.example.web;

import com.example.domain.Individuo;
// import static java.rmi.server.LogStream.log; // <-- CAMBIO: Eliminado
import lombok.extern.slf4j.Slf4j;
import com.example.dao.IndividuoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio { // <-- CAMBIO: Nombre de clase (buena práctica)
    
    @Autowired
    private IndividuoDao individuoDao; // <-- CAMBIO: Variable en minúscula
    
     @GetMapping("/")
     public String comienzo(Model model){
         
         // Usa la variable en minúscula para llamar al DAO
         Iterable<Individuo> individuos = individuoDao.findAll(); 
         
         //log.info("Ejecutando el controlador MVC");
         
         model.addAttribute("individuos", individuos);
         
         // Esto buscará el archivo: src/main/resources/templates/Indice.html
         return "Indice"; 
     }
         
}