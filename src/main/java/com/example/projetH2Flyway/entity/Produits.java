/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetH2Flyway.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author joelx
 */
@Entity
@Table(name = "Produits", uniqueConstraints = {
    @UniqueConstraint(columnNames = "nom")
})
public class Produits {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String description;
    private float prix;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "categorie_projet", joinColumns = @JoinColumn(name = "produit_id")
    , inverseJoinColumns = @JoinColumn(name = "categorie_id"))
    private List<CategorieProduit> categoriesProduit;
    
    private static final Logger LOG = Logger.getLogger(Produits.class.getName());

    public static Logger getLOG() {
        return LOG;
    }
    

    public Produits(String nom, String description, float prix, List<CategorieProduit> categoriesProduit) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.categoriesProduit = categoriesProduit;
    }

    public List<CategorieProduit> getCategoriesProduit() {
        return categoriesProduit;
    }

    public void setCategoriesProduit(List<CategorieProduit> categoriesProduit) {
        this.categoriesProduit = categoriesProduit;
    }

    
    

    public Produits() {
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public float getPrix() {
        return prix;
    }

    
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
    
    
    
    
    
    
}
