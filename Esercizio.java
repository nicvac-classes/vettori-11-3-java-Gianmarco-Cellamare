
import java.util.Scanner;

public static int leggicomando(){
    String c;
    do {
        System.out.println("[I] Inserisci elemento | [E] Elimina elemento | [R] Ricerca elemento | [D] Elimina duplicati | [V] Visualizza vettore | [X] Esci");

    } while(c!="I" && c!="E" && c!="R" && c!="D" && c!="V" && c!="X");
    return c;
}

public static int ricercaNelVettore (int [] V = int [] , int valore,N){
    int i;
    i=0;
    return i;
}

public static int InserisciElemento (int [] V = int [] , int N,e,j,d , int [] W = int [] ){
    int N2;
    N2=N;
    int [] V = int [N*10];
    int [] W = int [N+1];
    for (i=0 ; i=d-1 ; i=i+1){
        W[i]=V[i];
        for (i=d+1 ; i=N ; i=i+1){
            W[j]=V[j-1];
        }
    }
    return N2;

}

public static int EliminaElemento (int [] V = int [] , int N,e,j,d , int [] W = int [] ){
    int N2;
    N2=N;
    int [] W = int [N-1];
    for (i=0 ; i=d-1 ; i=i+1){
        W[i]=V[i];
        for (i=d+1 ; i=N ; i=i+1){
            W[j]=V[j-1];
        }
    }
    return N2;

    public static void  visualizzaVettore (int [] V = int [] , int valore){
        int i;
        i=0;
        while ("i<N"){
            System.out.println("V[i]");
            i=i+1;
        }
 
    }

    public static void azzeraVettore (int [] V = int [] , int valore){
        int i;
        i=0;
        while ("i<N"){
            System.out.println("V[i]");
            i=i+1;
        }
 
    }

    public static int EliminaDuplicati (int [] V = int [] , int N){
        int N2;
        N2=N;
        return N2;
    }




class Esercizio {

    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        int i, N, e, j, d;
        String c;
        System.out.println("Inserisci dimensione del vettore");
        N = in.nextLine();
        int [] V = int [N];
        do {
            c=leggicomando();

            if (c = "I"){
                System.out.println("Inserisci elemento");
                e = in.nextLine();
                do {
                    stem.out.println("Inserisci posizione");
                    i = in.nextline();
                    N=InserisciElemento(VN,e,i,W,j,d);


                }while(i<0 or i>=N);
            }

            if (c = "E"){
                do {
                    System.out.println("Inserire cella del vettore che desideri eliminare");
                    i = in.nextLine();
                    N=EliminaElemento(VN,e,i,W,j,d);


                }while(i<0 or i>=N);
            }

            if (c = "R"){
                System.out.println("Inserisci elemento da cercare");
                e=in.nextline();
                if (i > =0){
                    System.out.println("L'elemento " +e+ "si trova nella posizione " +i);
                }
                else {
                    System.out.println("L'elemento " +e+ "non è stato trovato ");
                }
                i=ricercaNelVettore(V,N,e);

            }

            if (c = "D"){
               System.out.println("Rimozione dei duplicati");
               N=EliminaDuplicati(V,N);
            }

            if (c = "V"){
                VisualizzaVettore(V,N);
            }

        } while (c!= "X");
 
    }
}
