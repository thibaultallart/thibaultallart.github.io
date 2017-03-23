public class NombreDeJours {
  public static void main(String[] args) {
    int m, a;
    Terminal.ecrireString("Choisissez un mois: ");
    m = Terminal.lireInt();
    Terminal.ecrireString("Choisissez une année: ");
    a = Terminal.lireInt();
    
    if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
       Terminal.ecrireStringln("Le mois contient 31 jours.");
    }
    else if (m!=2){
      Terminal.ecrireStringln("Le mois contient 30 jours.");
    }
    else{    
      // fevrier -> calcule si l'année est bisextile
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
      if (bis == true) {
        Terminal.ecrireStringln("Le mois contient 29 jours.");
      } else {
        Terminal.ecrireStringln("Le mois contient 28 jours.");
      }
    }
  }
}