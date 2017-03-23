public class BonjourNom{
    public static void main(String[] args){
        String lenom;
        Terminal.ecrireString("Entrez votre nom: ");
        lenom=Terminal.lireString();
        Terminal.ecrireString("Bonjour ");
        Terminal.ecrireStringln(lenom);
    }
}