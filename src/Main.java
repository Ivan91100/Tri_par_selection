public class Main {
    public int[] triSelection(int[] tableau){
        for (int i=0, tableau.size(), ++){
            if (tableau[i]<tableau[i+1]){
                int c = tableau[i];
                tableau[i]=tableau[i+1];
                tableau[i+1]=c;
            }
        }
        return tableau;
    }
}