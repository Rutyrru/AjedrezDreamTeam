import java.util.Scanner;

public class Dama {
    static String[][] tablero = {
            {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"},
            {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"},
            {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
            {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"},
            {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
            {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"},
            {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
            {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"},
    };
    static int letra;
    static int num;
    static String pos;

    public static void dama() {
        for (int i = 1; i <= letra; i++) {
            System.out.print(tablero[letra - i][num] + " ");
        }
        for (int i = 1; i < tablero.length - letra; i++) {
            System.out.print(tablero[letra + i][num] + " ");
        }
        System.out.println();
        for (int i = 1; i <= num; i++) {
            System.out.print(tablero[letra][num - i] + " ");
        }
        for (int i = 1; i < tablero[letra].length - num; i++) {
            System.out.print(tablero[letra][num + i] + " ");
        }
        System.out.println();
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if (pos.equals(tablero[i][j])) {
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
                        System.out.println();

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        System.out.println("letra");
        letra = sc.nextInt();
        System.out.println("num");
        num = sc.nextInt();
        System.out.println("posicion");
        pos=ss.nextLine();
        dama();
    }
}
