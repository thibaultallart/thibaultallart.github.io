// Ce programme ne compile pas, puisqu'il contient plusieurs erreurs !
public class Td1Commentaires {
  public static void main (String [] arguments) {
    Terminal.ecrireStringln("exo1");
    character a;            // char
    int a,bb                // ; manquant et a déjà déclaré
    char c = 'bonjour';     // "bonjour" est un string (chaine de caratères)
    boolean tt =            // valeur (true ou false) et ; manquant
    a=2;                    // on ne peut pas affecter un int (2) à une variable de type caractère
    bb = x+3;               // x n'a pas été déclaré
    tt=x+4;                 // on ne peut pas affecter un int (x+3) à une variable de type boolean
    a = x +1;               // on ne peut pas affecter un int (x+1) à une variable de type caractère
    bb= 3*w;                // w n'a pas été déclaré
    bb+1 = 3;               // les opérations doivent être à droite de l'opérateur d'affectation (=)
    bb==2;                  // == est l'opérateur de comparaison
  }
}