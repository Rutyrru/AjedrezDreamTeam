import java.util.Scanner;
public class Final {
    static boolean terminar=false;
    static int letra;
    static int numero;
    static String pieza;
    static String posicion;
    static Scanner sc=new Scanner(System.in);
    static Scanner ss=new Scanner(System.in);
    static boolean colorb=true;
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
    static void presentacion(){
        System.out.println("""
             ---------------------------------------
             Bienvenido al reto Nº1 de programación
             Hoy, jugamos al ajedrez.
             --------------------------------------
             """);
    }
    public static void getcolor() {
        System.out.println("""
                ------------------------------------------
                Seleccione la funcion que desea realizar:
                ------------------------------------------
                1-Jugar Pieza Blanca
                2-Juega Pieza Negra
                3-Salir
                ----------------------""");
        int color = sc.nextInt();
        try {
            switch (color) {
                default:
                    System.out.println("""
                            --------------------------
                            ¡Escriba un numero valido!
                            --------------------------""");
                    getcolor();
                    break;
                case 1:
                    System.out.println("Ha elegido jugar con las piezas blancas.");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Ha elegido jugar con las piezas negras.");
                    colorb = false;
                    break;
                case 3:
                    System.out.println("Hasta la vista , muchas gracias.");
                    terminar = true;
                    break;
            }
        }catch (Exception e){
            System.out.println("No puede introducir letras, por favor escriba un valor del 1 al 3.");
            getPosicion();
        }
    }
    public static void getPosicion() {
        System.out.println("Lo segundo será introducir su posición en el tablero:");
        for (int i = 0; i < tablero.length; i++) {
            System.out.println();
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
        }
        System.out.println();
        posicion = ss.nextLine();
       while(!posicion.matches("a1|a2|a3|a4|a5|a6|a7|a8|b1|b2|b3|b4|b5|b6|b7|b8|c1|c2|c3|c4|c5|c6|c7|c8|d1|d2|d3|d4|d5|d6|d7|8|e1|e2|e3|e4|e5|e6|e7|e8|f1|f2|f3|f4|f5|f6|f7|f8|g1|g2|g3|g4|g5|g6|g7|g8|h1|h2|h3|h4|h5|h6|h7|h8")){
            System.out.println("Por favor escriba una posicion valida");
            posicion = sc.next();
        }
        for ( int i = 0; i < tablero.length; i++) {
            for ( int j = 0; j < tablero[i].length; j++) {
                if (posicion.equals(tablero[i][j])) {
                    letra=i;
                    numero=j;
                }
            }
        }
        }
    public static void getpieza(){
            System.out.println("Elija la pieza que desea utilizar:\n" +
                    " -------------\n" +
                    "|  p=Peon     |\n" +
                    "|  t=Torre    |\n" +
                    "|  c=Caballo  |\n" +
                    "|  a=Alfil    |\n" +
                    "|  r=Rey      |\n" +
                    "|  d=Dama     |\n" +
                    " -------------");
            pieza =sc.next();
            switch (pieza){
                default:
                    System.out.println("Por favor, seleccione un valor correcto.");
                    getpieza();
                    break;
                case "p":
                case "P":
                    Peon();break;
                case"t":
                case"T":
                    Torre();break;
                case"c":
                case"C":
                    Caballo();break;
                case"a":
                case"A":
                    Alfil();break;
                case"r":
                case"R":
                    Rey();break;
                case"d":
                case"D":
                    Dama();break;
            }
        }
    public static void Peon() {
        System.out.println("Ha seleccionado el peon,esta pieza es capaz de moverse una unica casilla en horizontal, a no ser que se encuentre en la posicion \"x2\" o en la posicion \"x7\" siendo x cualquier letra." +
                "Dicho esto su Peon que se encuentra en "+posicion+" es capaz de moverse hasta las siguientes casillas:");
        if(colorb){
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if(posicion.matches("a1|b1|c1|d1|e1|f1|g1|h1")){
                        System.out.println("El peon blanco no es capaz de posicionarse en la casilla seleccionada.");
                    }
                    else if (posicion.matches("a2|b2|c2|d2|e2|f2|g2|h2")) {
                        System.out.println(tablero[i - 1][j]);
                        System.out.println(tablero[i - 2][j]);
                    } else {
                        System.out.println(tablero[i - 1][j]);
                    }
                }
            }
        }else if(!colorb){
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if(posicion.matches("a8|b8|c8|d8|e8|f8|g8|h8")){
                        System.out.println("El peon negro no es capaz de posicionarse en la casilla seleccionada.");
                    }
                    else if (posicion.matches("a7|b7|c7|d7|e7|f7|g7|h7")) {
                        System.out.println(tablero[i + 1][j]);
                        System.out.println(tablero[i + 2][j]);
                    } else {
                        System.out.println(tablero[i + 1][j]);
                    }
                }
            }

        }
    }
    public static void Caballo(){
        System.out.println("Ha seleccionado el caballo, esta pieza es capaz de moverse en forma de \"L\"\n" +
                "Dicho esto, estas son las posiciones la cual su caballo, que se encuentra en "+posicion+" puede moverse:");
        try {
            System.out.print(tablero[letra+1][numero+2]+" ");

        }catch (Exception e){
            System.out.print("");
        }
        try {
            System.out.print(tablero[letra-1][numero+2]+" ");

        }catch (Exception e){
            System.out.print("");
        }
        try {
            System.out.print(tablero[letra+1][numero-2]+" ");

        }catch (Exception e){
            System.out.print("");
        }
        try {
            System.out.print(tablero[letra-1][numero-2]+" ");

        }catch (Exception e){
            System.out.print("");
        }
        try {
            System.out.print(tablero[letra+2][numero-1]+" ");

        }catch (Exception e){
            System.out.print("");
        }
        try {
            System.out.print(tablero[letra-2][numero-1]+" ");


        }catch (Exception e){
            System.out.print("");
        }
        try {
            System.out.print(tablero[letra+2][numero+1]+" ");
        }catch (Exception e){
            System.out.print("");
        }
        try {
            System.out.print(tablero[letra-2][numero+1]);

        }catch (Exception e){
            System.out.print("");
        }

    }
    public static void Alfil() {
        System.out.println("Ha seleccionado el Alfil, esta ficha es capaz de moverse cualquier numero de posiciones, pero solo en diagonal." +
                "Dicho esto, su Alfil que se encuentra en "+posicion+" es capaz de moverse hasta las siguientes posiciones:");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (posicion.equals(tablero[i][j])) {
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
    public static void Torre() {
        System.out.println("Ha selecciona la Torre, esta pieza es capaz de moverse cualquier numero de casillas , pero con la limitacion de que solo puede hacerlo en horizontal y vertical." +
                "Dicho esto, su Torre que se encuentra en "+posicion+" se puede mover hacia las casillas:");
        for (int i = 1; i <= letra; i++) {
            System.out.print(tablero[letra - i][numero] + " ");
        }
        for (int i = 1; i < tablero.length - letra; i++) {
            System.out.print(tablero[letra + i][numero] + " ");
        }
        System.out.println();
        for (int i = 1; i <= numero; i++) {
            System.out.print(tablero[letra][numero - i] + " ");
        }
        for (int i = 1; i < tablero[letra].length - numero; i++) {
            System.out.print(tablero[letra][numero + i] + " ");
        }
    }

    public static void Rey() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (posicion.equals(tablero[i][j])) {
                    System.out.print("Ha seleccionado la pieza del Rey, esta pieza es capaz de moverse una unica casilla en cualquier dirección.\n" +
                            "Su Rey que se encuentra en la posición " + posicion +
                            "puede moverse hacias las posiciones :");

                    try {
                        System.out.print(tablero[i + 1][j] + " ");
                    }catch (Exception e){
                        System.out.print("");
                    }

                    try{
                        System.out.print(tablero[i + 1][j + 1] + " ");
                    }catch (Exception e){
                        System.out.print("");
                    }

                    try{
                        System.out.print(tablero[i][j + 1] + " ");
                    }catch (Exception e){
                        System.out.print("");
                    }

                    try {
                        System.out.print(tablero[i - 1][j+1] + " ");
                    }catch (Exception e) {
                        System.out.print("");
                    }

                    try {
                        System.out.print(tablero[i - 1][j] + " ");
                    }catch (Exception e){
                        System.out.print("");
                    }

                    try {
                        System.out.print(tablero[i - 1][j - 1] + " ");
                    }catch (Exception e){
                        System.out.print("");
                    }

                    try {
                        System.out.print(tablero[i][j - 1] + " ");
                    }catch (Exception e){
                        System.out.print("");
                    }

                    try {
                        System.out.print(tablero[i + 1][j - 1] + " ");
                    }catch (Exception e){
                        System.out.print("");
                    }
                }
            }
        }
    }
    public static void Dama() {
        System.out.println("Ha seleccionado la Dama, esta pieza es capaz de moverse en cualquier posición las casillas que desee.\n" +
                "Su dama que se encuentra en: " + posicion + " es capaz de moverse hasta: ");
        for (int i = 1; i <= letra; i++) {
            System.out.print(tablero[letra - i][numero] + " ");
        }
        for (int i = 1; i < tablero.length - letra; i++) {
            System.out.print(tablero[letra + i][numero] + " ");
        }
        System.out.println();
        for (int i = 1; i <= numero; i++) {
            System.out.print(tablero[letra][numero - i] + " ");
        }
        for (int i = 1; i < tablero[letra].length - numero; i++) {
            System.out.print(tablero[letra][numero + i] + " ");
        }
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (posicion.equals(tablero[i][j])) {
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
    public static void Dibujar(){
        for (int i = 0; i < tablero.length; i++) {
            System.out.println();
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {

        presentacion();
        getcolor();
        if(!terminar) {
            getPosicion();
            getpieza();
        }
    }
}
