public class Ex1Qd {
  public static void main (String [] arguments) {
    int a, b, c;
    Terminal.ecrireString("Saisir le premier entier: ");
    a = Terminal.lireInt();
    Terminal.ecrireString("Saisir le second entier: ");
    b = Terminal.lireInt();
    Terminal.ecrireString("Saisir le dernier entier: ");
    c = Terminal.lireInt();
    int max;
    max = Math.max(Math.max(a,b),c);
    Terminal.ecrireStringln("Le plus grand est "+ max);
  }
}