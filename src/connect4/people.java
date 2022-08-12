
package connect4;

import java.util.ArrayList;
import java.util.Calendar;

public class people {
    private String username, password, nombreCompleto;
    private Calendar fechaNac;
    private int puntos;
    private ArrayList<String> lastGames;
    
   
    public people(String username, String password, String name, Calendar fechaNac){
        this.username = username;
        this.password = password;
        this.nombreCompleto = name;
        this.fechaNac = fechaNac;
        this.puntos=0;
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

    @Override
    public String toString(){
        return nombreCompleto + " - " + username + " - " + puntos;
    }
    

}
