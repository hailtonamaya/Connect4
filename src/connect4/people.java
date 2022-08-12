
package connect4;

import java.util.ArrayList;
import java.util.Calendar;

public class people {
    private String username, password, nombreCompleto;
    private Calendar fechaNac; 
    private ArrayList<String> lastGames;
    
   
    public people(String username, String password, String name, Calendar fechaNac){
        this.username = username;
        this.password = password;
        this.nombreCompleto = name;
        this.fechaNac = fechaNac;
        lastGames = new ArrayList<>();
    }
    
    public ArrayList getlastGames(){
        return lastGames;
    }        
    
    public String getNombreCompleto(){
        return nombreCompleto;
    }
    
    public Calendar getFechaNac(){
        return fechaNac;
    }

    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }


    public void setNombreCompleto(String name){
        this.nombreCompleto=name;
    }
    
    public void setFechaNac(Calendar FechaNac){
        this.fechaNac=FechaNac;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }


    
    public void print(){
        System.out.println("Usuario: " + getUsername() +
                "\nContraseña: " + getPassword());
    }
    

}
