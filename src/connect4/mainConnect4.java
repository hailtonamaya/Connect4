
package connect4;

import java.util.ArrayList;



public class mainConnect4 {
    
    static ArrayList<people> people;
    static drawCircle Circulos[][];
    static menuInicio menuInicio = new menuInicio();
    
    public static void main(String[] args) {
        people = new ArrayList<>();
        Circulos = new drawCircle[7][6];
        menuInicio.setVisible(true);

    }
}
