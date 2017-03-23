public class ConversionEurosDollars {
    public static void main (String[] args) {
        double euros;
        double dollars;
        Terminal.ecrireStringln("Somme en Euros? ");
        euros = Terminal.lireDouble();
        dollars = euros * 1.3;       
        Terminal.ecrireString("La Somme en Dollars: ");
        Terminal.ecrireDoubleln(dollars);
    }
}