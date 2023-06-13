/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import com.example.projetH2Flyway.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author joelx
 */
public interface RoleRepository extends JpaRepository<Role,Long> {
    
}
