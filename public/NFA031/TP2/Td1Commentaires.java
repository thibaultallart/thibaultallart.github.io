// Ce programme ne compile pas, puisqu'il contient plusieurs erreurs !
public class Td1Commentaires {
  public static void main (String [] arguments) {
    Terminal.ecrireStringln("exo1");
    character a;            // char
    int a,bb                // ; manquant et a d�j� d�clar�
    char c = 'bonjour';     // "bonjour" est un string (chaine de carat�res)
    boolean tt =            // valeur (true ou false) et ; manquant
    a=2;                    // on ne peut pas affecter un int (2) � une variable de type caract�re
    bb = x+3;               // x n'a pas �t� d�clar�
    tt=x+4;                 // on ne peut pas affecter un int (x+3) � une variable de type boolean
    a = x +1;               // on ne peut pas affecter un int (x+1) � une variable de type caract�re
    bb= 3*w;                // w n'a pas �t� d�clar�
    bb+1 = 3;               // les op�rations doivent �tre � droite de l'op�rateur d'affectation (=)
    bb==2;                  // == est l'op�rateur de comparaison
  }
}