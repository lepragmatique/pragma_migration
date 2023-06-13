/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetH2Flyway.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.logging.Logger;

/**
 *
 * @author joelx
 */

@Entity
@Table(name = "CategorieProduit")
public class CategorieProduit {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Categorie_id", updatable = false, nullable = false)
    private Long id;
	
    @Column(name="CategorieProduit", updatable = true, nullable = false)
    private String name;

    public CategorieProduit(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    private static final Logger LOG = Logger.getLogger(CategorieProduit.class.getName());

    public static Logger getLOG() {
        return LOG;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
