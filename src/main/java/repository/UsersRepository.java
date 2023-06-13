/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import com.example.projetH2Flyway.entity.Users;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author joelx
 */
public interface UsersRepository extends JpaRepository<User, Long> {

    public void save(Users users);
    
}
