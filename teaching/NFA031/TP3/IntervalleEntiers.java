public class IntervalleEntiers {
  public static void main(String[] args) {
// déterminer si a est compris ou non entre b et c
    int a, b, c;
    Terminal.ecrireString("Saisir a: ");
    a = Terminal.lireInt();
    Terminal.ecrireString("Saisir b: ");
    b = Terminal.lireInt();
    Terminal.ecrireString("Saisir c: ");
    c = Terminal.lireInt();
    
    if (b > c) {
// permuter b et c en mémoire
      int t = b;
      b = c;
      c = t;
    }
    
    if ((a >= b) && (a <= c)) {
      Terminal.ecrireStringln(a + " est dans l'intervalle [" + b + ", " 
                                + c + "].");
    } else {
      Terminal.ecrireStringln(a + " n'est pas dans l'intervalle [" + b 
                                + ", " + c + "].");
    }
  }
}