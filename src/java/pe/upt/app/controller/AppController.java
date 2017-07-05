/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.upt.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.upt.app.model.PromModel;
import pe.upt.app.service.PromService;



/**
 *
 * @author Bernardo
 */
@Controller
public class AppController {
 @Autowired
    private PromService promService;
    @RequestMapping(value="index.htm", method=RequestMethod.GET)
    public String home(){
        return "index";
    }
    @RequestMapping(value="procesar.htm", method=RequestMethod.POST)
    public String procesar(@ModelAttribute PromModel promModel,
            Model model){
        //Proceso
        promModel=promService.procesarPromedio(promModel);
        //Reporte
        model.addAttribute("repo", promModel);
        return "index";
    }
}
