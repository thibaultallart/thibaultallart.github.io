public class ExoCorrection {
  public static void main (String [] arguments) {
    int a,b,c;
    boolean abc_tries;
    Terminal.ecrireString("a ? ");
    a = Terminal.lireInt();
    Terminal.ecrireString("b ? ");
    b = Terminal.lireInt();
    Terminal.ecrireString("c ? ");
    c = Terminal.lireInt();
    abc_tries = ((a >= b) && (b >= c));
    //abc_tries = !((a < b) || (b < c)); // exact mais moins compréhensible
    Terminal.ecrireBooleanln(abc_tries);
    Terminal.ecrireStringln("\n");
  }
}