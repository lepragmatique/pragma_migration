/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetH2Flyway.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name = "users", uniqueConstraints = {
    @UniqueConstraint(columnNames = "email")
})
public class Users {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_Name", unique=true, insertable=true, updatable=true, nullable=false)
    private String firstName;
    @Column(name = "last_Name", unique=true, insertable=true, updatable=true, nullable=false)
    private String lastName;
    @Column(name = "email", unique=true, insertable=true, updatable=true, nullable=false)
    private String email;
     @Column(name = "password", unique=true, insertable=true, updatable=true, nullable=false)
    private String password;
      @Column(name = "adress", unique=true, insertable=true, updatable=true, nullable=false)
    private String adresse;
      
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id")
    , inverseJoinColumns = @JoinColumn(name = "role_id"))
    
    private List<Role> roles;

    public Users(String firstName, String lastName, String email, String password, String adresse, List<Role> roles) {
       
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.adresse = adresse;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAdresse() {
        return adresse;
    }
    
    public List<Role> getRoles() {
        return roles;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Users() {
    }
    private static final Logger LOG = Logger.getLogger(Users.class.getName());

   
   
    
    
    
    
    
}
