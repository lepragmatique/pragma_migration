/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  joelx
 * Created: 6 juin 2023
 */
--INITIALISATION TABLE ROLE
INSERT INTO ROLE(ROLE_ID,ROLE_NAME) VALUES (1,'ROLE_ADMIN');
INSERT INTO ROLE(ROLE_ID,ROLE_NAME) VALUES (2,'ROLE_USER');

--INITIALISATION TABLE UTILISATEURS
INSERT INTO USERS(ID, ADRESS, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD) values (1, 'Rue du bien etre 11', 'admin@gmail.com', 'Franki', 'Tchao', 'joel');
INSERT INTO USERS(ID, ADRESS, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD) values (2, 'rue de la loyauter 12', 'joel@gmail.com', 'Fran', 'joel', 'reussite');
INSERT INTO USERS(ID, ADRESS, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD) values (3, 'Rue dE LA VICTOIRE', 'franki@gmail.com', 'logon', 'signUp', 'victoire');

-- TABLE DE JOINTURE
INSERT INTO USERS_ROLES(USER_ID,ROLE_ID) VALUES (1,1);
INSERT INTO USERS_ROLES(USER_ID,ROLE_ID) VALUES (1,2);
INSERT INTO USERS_ROLES(USER_ID,ROLE_ID) VALUES (2,2);
INSERT INTO USERS_ROLES(USER_ID,ROLE_ID) VALUES (3,2);

COMMIT;

