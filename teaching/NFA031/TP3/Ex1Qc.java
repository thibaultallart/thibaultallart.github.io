public class Ex1Qc {
  public static void main (String [] arguments) {
    int a, b, c;
    Terminal.ecrireString("Saisir le premier entier: ");
    a = Terminal.lireInt();
    Terminal.ecrireString("Saisir le second entier: ");
    b = Terminal.lireInt();
    Terminal.ecrireString("Saisir le dernier entier: ");
    c = Terminal.lireInt();
    int max;
    if (a>=b){
      if (a>=c){// ici, a>=b et a>=c est vrai
        max = a;
        Terminal.ecrireStringln(a+">="+b+" et "+a+">="+c);
      }else{// ici, a>=b et c>a est vrai
        max = c; // c>a>=b 
        Terminal.ecrireStringln(a+">="+b+" et "+c+">"+a);
      }
    }else if (b>=c){ // a<b et b>=c
      max = b; // b> (a,c)
      Terminal.ecrireStringln(a+"<"+b+" et "+b+">="+c);
    } else{ // a<b et b<c
        max = c; // a<b<c
        Terminal.ecrireStringln(a+"<"+b+" et "+b+"<"+c);
      }
      Terminal.ecrireStringln("Le plus grand est "+ max);
  }
}