/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Vuelos;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author bug
 */
@Named(value = "controlerVuelos")
@SessionScoped
public class ControlerVuelos implements Serializable {
    
    @EJB
    private Facade.VuelosFacade vuelosFacade;
    private Vuelos vuelos=new Vuelos();

    /**
     * Creates a new instance of ControlerVuelos
     */
    
    
    
    
    public ControlerVuelos() {
    }
    
    
    public List<Vuelos> getAllVuelos()
    {
        return vuelosFacade.findAll();
    }
    
    public void AltaVuelo(Vuelos vuelo)
    {
        vuelosFacade.create(vuelo);
    }

    public Vuelos getVuelos() {
        return vuelos;
    }

    public void setVuelos(Vuelos vuelos) {
        this.vuelos = vuelos;
    }
    
    
    
    
}
