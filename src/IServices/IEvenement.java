/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IServices;

import Entités.Evenement;

/**
 *
 * @author boussandel
 */
public interface IEvenement {
    public void ajouterEvenement (Evenement e); 
    public void supprimerEvenement(Integer idEvenement);
    public void modifierEvenement(Evenement e,int id) ;
    public Evenement rechercherById(Integer r) ;  
    
}
