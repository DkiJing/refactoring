package ooadlab13;

public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode(){
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 0;
        //determine amounts for aRental line
        result += daysRented * 3;
        return result;
    }
}
