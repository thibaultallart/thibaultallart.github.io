public class AnneeBissextile {
  public static void main(String[] args) {
    int a;
    Terminal.ecrireString("Choisissez une année: ");
    a = Terminal.lireInt();
    
    boolean bis = false;
    
    if ((a % 4) == 0) {
// multiple de 4
      if ((a % 100) == 0) {
// multiple de 100
        if ((a % 400) == 0) {
// multiple de 400
          bis = true;
        } else {
// non multiple de 400
          bis = false;
        }
      } else {
// les multiples de 4 qui ne sont pas multiples de 100
        bis = true;
      }
    }
    Terminal.ecrireString("L'année " + a);
    if (bis == true) {
      Terminal.ecrireString(" est");
    } else {
      Terminal.ecrireString(" n'est pas");
    }
    Terminal.ecrireStringln(" bissextile.");
  }
}