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

    @Override
    public int getFrequenctRenterPoint(int frequentRenterPoints, int daysRented) {
        frequentRenterPoints ++;
        if(daysRented > 1){
            frequentRenterPoints ++;
        }
        return frequentRenterPoints;
    }

}
