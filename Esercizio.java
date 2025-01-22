
import java.util.Scanner;

public int leggicomando(){
    String c;
    do {
        System.out.println("[I] Inserisci elemento | [E] Elimina elemento | [R] Ricerca elemento | [D] Elimina duplicati | [V] sualizza vettore | [S] Esci");

    } while(c!="I" && c!="E" && c!="R" && c!="D" && c!="V" && c!="S");
    return c;
}

public int RicercaElemento (int [] V = int [] , int valore){
    int R;
    return R;
}

public int InserisciElemento (int [] V = int [] , int valore){
    int I;
    return I;
}

public int EliminaElemento (int [] V = int [] , int valore){
    int E;
    return E;
}


public int ricercaNelVettore (int [] V = int [] , int valore){
    int i;
    return i;
}

class Esercizio {

    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        int N, valore, I, E, R, D;
        String c;
        N = in.nextLine();
        int [] V = int [N];
        do {
            c=leggicomando();

            if (c = "I"){
                I=InserisciElemento(V,valore);
            }

            if (c = "E"){
                E=EliminaElemento(V,valore);
            }

            if (c = "R"){
                R=RicercaElemento(V,valore);
            }

            if (c = "D"){
                D=EliminaDuplicati(V,valore);
            }

            if (c = "V"){
                i=ricercaNelVettore(V,valore);
            }

        } while (c!= "S");
 
    }
}
