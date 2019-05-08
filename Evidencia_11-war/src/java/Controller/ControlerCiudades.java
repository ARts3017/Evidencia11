/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Ciudades;
import Facade.CiudadesFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author bug
 */
@Named(value = "controlerCiudades")
@SessionScoped
public class ControlerCiudades implements Serializable {
    @EJB
    private CiudadesFacade ciudadesFacade;
    private Ciudades ciudades=new Ciudades();

    /**
     * Creates a new instance of ControlerCiudades
     */
    public ControlerCiudades() {
    }
    
    
    public List<Ciudades> getAllCiudades()
    {
        return ciudadesFacade.findAll();
    }
    
    public void AltaCiudad(Ciudades ciudad)
    {
        ciudadesFacade.create(ciudad);
    }

    public Ciudades getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudades ciudades) {
        this.ciudades = ciudades;
    }
    
    
    
}
