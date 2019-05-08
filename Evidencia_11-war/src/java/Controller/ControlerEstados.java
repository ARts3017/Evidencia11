/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Estados;
import Facade.EstadosFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author bug
 */
@Named(value = "controlerEstados")
@SessionScoped
public class ControlerEstados implements Serializable {
    @EJB
    private EstadosFacade estadosFacade;
    private Estados estados =new Estados();

    /**
     * Creates a new instance of ControlerEstados
     */
    public ControlerEstados() {
    }
    
    
    public List<Estados> getAllEstados()
    {
        return estadosFacade.findAll();
    }
    
    public void AltaEstado(Estados estado)
    {
        estadosFacade.create(estado);
    }

    public Estados getEstados() {
        return estados;
    }

    public void setEstados(Estados estados) {
        this.estados = estados;
    }
    
    
}
