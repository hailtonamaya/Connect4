
package connect4;

import java.util.ArrayList;



public class mainConnect4 {
    
    static ArrayList<people> people;
    static ArrayList<player> players;
    static drawCircle Circulos[][];
    static menuInicio menuInicio = new menuInicio();
    
    public static void main(String[] args) {
        players = new ArrayList<>();
        people = new ArrayList<>();
        Circulos = new drawCircle[7][6];
        menuInicio.setVisible(true);

    }
}
