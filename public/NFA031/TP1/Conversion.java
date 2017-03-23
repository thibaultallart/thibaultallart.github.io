public class Conversion {
    public static void main (String[] args) {
        double pouces;
        double centimetres;
        Terminal.ecrireStringln("Longueur en pouces? ");
        pouces = Terminal.lireDouble();
        centimetres = pouces * 2.54;       
        Terminal.ecrireString("La longueur en centimetres: ");
        Terminal.ecrireDoubleln(centimetres);
    }
}