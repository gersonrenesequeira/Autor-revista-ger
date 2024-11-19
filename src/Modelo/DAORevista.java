/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Time;
import java.util.*;

/**
 *
 * @author PC33-B5
 */
public class DAORevista {
    public Revista Insertar(int NumeroRev, String TituloRev, String IssnRev,
            Float PrecioRev, String AyoRev,  java.sql.Time HoraventaRev){
         String transaccion = "INSERT INTO Revista(numero,titulo,ayo,issn,precio,java.sql.Time Horaventa) VAlUES ('"
                + NumeroRev +"', '"
                +TituloRev +"', '"
                +AyoRev +"', '"
                +IssnRev +"', '"
                +PrecioRev +"', '"
                +HoraventaRev +"')";
              if (new DataBase().Actualizar(transaccion) > 0 ){
           return new Revista(NumeroRev, TituloRev, AyoRev ,IssnRev ,PrecioRev ,
                   HoraventaRev);         
    }
       return null;  
}
    public int Actualizar (int NumeroRev, String TituloRev, String AyoRev,
           String IssnRev, float PrecioRev, java.sql.Time HoraventaRev){
        
    String transaccion = "UPDATE Revista SET NumeroRev='"
            + NumeroRev +"', TituloRev='"
               + TituloRev +"', AyoRev='"
               + AyoRev +"', IssnRev='"
               + IssnRev +"', PrecioRev='"
               + PrecioRev +"', HoraventaRev='"
               + HoraventaRev;
               
     return new DataBase().Actualizar(transaccion);
    }
       public List obtenerDatos() {
           String transaccion = "SELECT * FROM Revista";
           List<Map> registros = new DataBase().Listar(transaccion);
       List<Revista> revistas = new ArrayList();
       for (Map registro : registros){
           Revista revis = new Revista((int) registro.get("NumeroRev"),
                   (String) registro.get("TituloRev"),
                   (String) registro.get("IssnRev"),
           (String) registro.get("AyoRev"),(float) registro.get("PrecioRev"),
           (java.sql.Time) registro.get("HoraventaRev")); revistas.add(revis);
       }
   return revistas;
}
       public int Eliminar(int NumeroRev){
        String transaccion ="DELETE FROM Revista WHERE NumeroRev='"+ "'";
       return new DataBase().Actualizar(transaccion);
       }

    
    }


