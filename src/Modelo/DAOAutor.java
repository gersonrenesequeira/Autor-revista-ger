/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.*;
/**
 *
 * @author Usuario
 */

public class DAOAutor {
    //método para insertar datos a la BD
   public Autor Insertar(String cedula, String nombres, String apellidos,
           String email, java.sql.Date fechaNac ){
       String transaccion = "INSERT INTO Autor (nombres,apellidos,email,cedula,fechaNac) VALUES('"
               + nombres +"', '"
               + apellidos +"', '"
               + email +"', '"
               + cedula +"', '"
               + fechaNac +"')";
       //llamar al metodo Actualizar ubicado en DataBase.java
       if (new DataBase().Actualizar(transaccion) > 0 ){
           return new Autor(cedula, nombres, apellidos, email, fechaNac);
       }
       return null;
        }
   //método actualizar un registro en la BD
   public int Actualizar (int id, String nombres, String apellidos, String email,
           String cedula, java.sql.Date fechaNac){
       
       String transaccion = "UPDATE Autor SET nombres='"
               + nombres +"', apellidos='"
               + apellidos +"', email='"
               + email +"', fechaNac='"
               + fechaNac +"', cedula='"
               + cedula +"' WHERE id_autor="
               + id ;
       
       return new DataBase().Actualizar(transaccion);
   }
   //metodo para selecionar todos los registros de la tabla 
   public List obtenerDatos() {
       String transaccion = "SELECT * FROM Autor";
       //llamar el metodo listar de BataDase.java
       List<Map> registros = new DataBase().Listar(transaccion);
       List<Autor> autores = new ArrayList(); //arreglo de autores 
       //ciclo que recorre cada registro y los agrega al arreglo de autores 
       for (Map registro : registros){
           Autor aut = new Autor ((int) registro.get("id_autor"),
           (String) registro.get("nombres"),
           (String) registro.get("apellidos"),
           (String) registro.get("email"),
           (String) registro.get("cedula"),
           (java.sql.Date) registro.get("fechaNac"));
           autores.add(aut);
       }
       return autores;//retorna todos los autores ubicados a la tabla de BD
}
   //elimina un registro de la tabla en la BD
   public int Eliminar(int id){
       String transaccion ="DELETE FROM Autor WHERE id_autor='"+ id + "'";
       return new DataBase().Actualizar(transaccion);
   }
   
}
   
