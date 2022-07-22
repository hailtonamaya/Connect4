
package connect4;

import java.util.ArrayList;



public class mainConnect4 {
    
    public static ArrayList<player> jugadores;
    static menuInicio menuInicio = new menuInicio();
    
    public static void main(String[] args) {
        jugadores = new ArrayList<>();
        menuInicio.setVisible(true);

    }

}
