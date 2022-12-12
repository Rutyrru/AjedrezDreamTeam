public class Ajedrez {
    //estoy en d4
    static String tablero[][]={
            {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"},
            {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"},
            {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
            {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"},
            {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
            {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"},
            {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
            {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"},
    };

    String posicion = tablero[4][3];

    public static void Torre(){
            for (int i = 1; i < tablero.length-3; i++) {//poner length menos la fila-1
                System.out.print(tablero[4-i][3]+" ");
            }
            for (int i = 1; i < tablero.length-4; i++) {//poner lenght menos la fila
                System.out.print(tablero[4+i][3]+" ");
            }
            System.out.println();
            for (int i = 1; i < tablero[4].length-2; i++) {
                System.out.print(tablero[4][3-i]+" ");
            }
            for (int i = 1; i < tablero[4].length-3; i++) {
                System.out.print(tablero[4][3+i]+" ");
            }
    }

    public static void main(String[] args) {
        Torre();
    }
}
