
import java.util.Scanner;

public static int leggicomando(){
    String c;
    do {
        System.out.println("[I] Inserisci elemento | [E] Elimina elemento | [R] Ricerca elemento | [D] Elimina duplicati | [V] Visualizza vettore | [X] Esci");

    } while(c!="I" && c!="E" && c!="R" && c!="D" && c!="V" && c!="X");
    return c;
}

public static int ricercaNelVettore (int [] V =new int [] , int valore,N){
    int i;
    i=0;
    return i;
}

public static int InserisciElemento (int [] V =new int [] , int N,i,ie ){
    int N2;
    N2=N-1;
    int [] V = new int [N*10];
    i=ie;
    while (i<=N-1){
        V[i]=V[i-1];
        i=i+1;
    }
    N2=N-1;
    return N2;

}

public static int EliminaElemento (int [] V =new int [] , int N,e,j,d , int [] W =new int [] ){
    int N2;
    N2=N-1;
    int [] V = new int [N*10];
    i=ie;
    while (i<=N-2){
        V[i]=V[i+1];
        i=i+1;
    }
    N2=N-1;
    return N2;

    return N2;


    public static void  visualizzaVettore (int [] V =new int [] , int valore){
        int i;
        i=0;
        while ("i<N"){
            System.out.println("V[i]");
            i=i+1;
        }
 
    }

    public static void azzeraVettore (int [] V =new int [] , int valore){
        int i;
        i=0;
        while ("i<N"){
            System.out.println("V[i]");
            i=i+1;
        }
 
    }

    public static int EliminaDuplicati (int [] V =new int [] , int N ,i,j){
        int N2;
        while(i<N){
            while(j<N){
                if(V[i] == V[j]){
                }
                j=j+1;
            }
            i=i+1;
        }
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
        int [] V =new int [N];
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
