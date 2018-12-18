package ooadlab13;

public class RegularPrice extends Price {
    @Override
    public int getPriceCode(){
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 0;
        //determine amounts for aRental line
        result += 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }

    public int getFrequenctRenterPoint(){
        return 1;
    }
}
