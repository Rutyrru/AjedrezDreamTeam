import java.util.Scanner;

public class Alfil {
    static String[][] tablero = {
            {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"},
            {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"},
            {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
            {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"},
            {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
            {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"},
            {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
            {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"}
    };

    static String alfil = "a";

    static Scanner sc = new Scanner(System.in);
    static Scanner sh = new Scanner(System.in);

    public static void main(String[] args) {

        String pie;
        String pos = "";

        System.out.print("Elige una pieza de ajedrez:");
        pie = sc.nextLine();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }


        Alfi(pie, alfil, pos, tablero);
    }

    public static void Alfi(String pie, String alfil, String pos, String[][] tablero) {

        if (alfil.equals(pie)) {
            System.out.print("Elige una posición:");
            pos = sh.nextLine();
            for (int c = 0; c < tablero.length; c++) {
                for (int d = 0; d < tablero[c].length; d++) {
                    if (pos.equals(tablero[c][d])) {
                        System.out.print("El alfil se encuentra en la posición " + pos +
                                " y puede estar en las posiciones :");
                        int u=c;
                        int v=d;
                        int w=c;
                        int x=d;
                        int y=c;
                        int z=d;

                        while(u!=7){
                            u++;
                            System.out.print(tablero[u][u]+" ");
                        }
                        while(v!=0){
                            v--;
                            System.out.print(tablero[v][v]+" ");
                        }
                        while(w!=7 && x!=0){
                            w++;
                            x--;
                            System.out.print(tablero[w][x]+" ");
                        }
                        while(y!=0 && z!=7){
                            y--;
                            z++;
                            System.out.print(tablero[y][z]+" ");
                        }

                    }
                }
            }
        }
    }
}
