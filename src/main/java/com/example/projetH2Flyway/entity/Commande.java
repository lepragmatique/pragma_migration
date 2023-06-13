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
import java.sql.Date;


/**
 *
 * @author joelx
 */

@Entity
@Table(name = "Commande")
public class Commande {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_commende")
    private Long id;
    @Column(name = "date", unique=true, insertable=true, updatable=true, nullable=false)
    private Date date;
    @Column(name = "adresse", unique=true, insertable=true, updatable=true, nullable=false)
    private String adresse;
    @Column(name = "statut", unique=true, insertable=true, updatable=true, nullable=false)
    private Statut email;
    
      
}
