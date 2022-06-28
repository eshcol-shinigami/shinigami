/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SHINIGAMI_ESHCOL
 */
public class Etudiant implements InterfaceRoleEtudiant{
      
    public String nom;
    public int matricule;
    
    public Etudiant(){
    
       
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }
    
    
    public void infoEtudiant(String pNom, int pMat){
      pNom = this.nom;
      pMat = this.matricule;
      
      System.out.println("Nom : "+pNom+"& Maticule :"+pMat);
    
    }

    @Override
    public void calculNote() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saluer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
