/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Aviones;
import Facade.AvionesFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author white
 */
@Named(value = "avionesController")
@SessionScoped
public class ControlerAviones implements  Serializable{

    @EJB
    private AvionesFacade avionesFacade;
    private Aviones aviones=new Aviones();
    
    /**
     * Creates a new instance of ControlerAviones
     */
    
    
    
    public ControlerAviones() {
    }
    
    public List<Aviones> getAllAviones()
    {
        return avionesFacade.findAll();
    }
    
    public void InserAvion(Aviones avion)
    {
        avionesFacade.create(avion);
        
    }

    public Aviones getAviones() {
        return aviones;
    }

    public void setAviones(Aviones aviones) {
        this.aviones = aviones;
    }
    
    
    
    
    
}
