public class NoteMoyenne {
  public static void main(String[] args) {
    double np, ne, nf;
    Terminal.ecrireString("Saisir la note de partiel: ");
    np = Terminal.lireDouble();
    Terminal.ecrireString("Saisir la note d'�crit: ");
    ne = Terminal.lireDouble();
    
// Si la note d'�crit est strictement inf�rieure � 7
    if (ne < 7) {
      nf = ne;
    } else if (np < ne) {
      nf = ne;
    } else {
      nf = 0.5 * (np + ne);
    }
    Terminal.ecrireStringln("La note finale d'UE vaut: " + nf);
    if (nf >= 10) {
      Terminal.ecrireStringln("L'UE est valid�e!");
    } else {
      Terminal.ecrireStringln("Merci de revenir en septembre.");
    }
  }
}