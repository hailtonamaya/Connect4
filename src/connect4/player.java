
package connect4;

import java.util.Calendar;

public class player {
    private String username, password, nombreCompleto;
    private int puntos;
    private Calendar fechaNac; 
    
   
    public player(String username, String password, String name, Calendar fechaNac){
        this.username = username;
        this.password = password;
        this.nombreCompleto = name;
        this.fechaNac = fechaNac;
        puntos = 0;
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
    
    public int getPuntos(){
        return puntos;
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

    
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public void print(){
        System.out.println("Usuario: " + getUsername() +
                "\nContraseña: " + getPassword() +
                "\nPuntos: " + getPuntos() + "\n");
    }
    

}
