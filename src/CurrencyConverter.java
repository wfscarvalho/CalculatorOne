public class CurrencyConverter {

    public static double Ammount(double dollarPrice,double howManyDollars){
        return howManyDollars*dollarPrice+(howManyDollars*dollarPrice*0.06);
    }
}
