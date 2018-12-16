package ooadlab13;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public int getPriceCode(){
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg){
        switch (arg){
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                try {
                    throw new IllegalAccessException("Incorrect Price Code");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
        }
    }

    public int getFrequentRenterPoints(int frequentRenterPoints, int daysRented) {
        // add frequent renter points
        frequentRenterPoints ++;
        // add bonus for a two day new release rental
        if ((getPriceCode() == NEW_RELEASE)
                && daysRented > 1) frequentRenterPoints++;
        return frequentRenterPoints;
    }

    public double getCharge(int daysRented){
        return _price.getCharge(daysRented);
    }
}