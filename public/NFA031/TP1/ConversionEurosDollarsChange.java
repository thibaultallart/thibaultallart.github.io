public class ConversionEurosDollarsChange {
    public static void main (String[] args) {
        double euros;
        double dollars;
        double taux;
        Terminal.ecrireStringln("Somme en Euros? ");
        euros = Terminal.lireDouble();
        Terminal.ecrireStringln("Taux de change? ");
        taux = Terminal.lireDouble();
        dollars = euros * taux;       
        Terminal.ecrireString("La Somme en Dollars: ");
        Terminal.ecrireDoubleln(dollars);
    }
}