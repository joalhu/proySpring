/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.upt.app.service;

import org.springframework.stereotype.Service;
import pe.upt.app.model.PromModel;

/**
 *
 * @author Bernardo
 */
@Service
public class PromService {
    public PromModel procesarPromedio(PromModel model){
        //Proceso
        int promFinal=(model.getPract1()+model.getExParcial()*2+model.getPract2()*2+model.getTrabPract()*2+
                model.getExFinal()*3)/10;
        String estado=(promFinal>10.5)?"Aprobado":"Desaprobado";
        //Reporte
        model.setPromFinal(promFinal);
        model.setEstado(estado);
        
        return model;
    }
}
