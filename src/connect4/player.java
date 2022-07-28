
package connect4;

import java.util.Calendar;

public class player extends people{
    int puntos;
    
    public player(String username, String password, String name, Calendar fechaNac){
        super(username, password, name, fechaNac);
        puntos = 0;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }    

}
