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


        Alfi(pie, pos);
    }

    public static void Alfi(String pie, String pos) {

        if (alfil.equals(pie)) {
            System.out.print("Elige una posición:");
            pos = sh.nextLine();
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if (pos.equals(tablero[i][j])) {

                        System.out.print("El alfil se encuentra en la posición " + pos +
                                " y puede estar en las posiciones :");

                        int w=i;
                        int h=j;
                        int x=i;
                        int y=j;
                        int z=i;
                        int u=j;
                        int v=i;
                        int t=j;

                        while(z!=7 && u!=7){
                            z++;
                            u++;
                            System.out.print(tablero[z][u] + " ");
                        }

                        while(v!=0 && t!=0){
                            v--;
                            t--;
                            System.out.print(tablero[v][t] + " ");
                        }

                        while(h!=7 && w!=0){
                            h++;
                            w--;
                            System.out.print(tablero[w][h] + " ");
                        }

                        while(x!=7 && y!=0){
                            x++;
                            y--;
                            System.out.print(tablero[x][y] + " ");
                        }


                    }
                }
            }
        }
    }
}