package ooadlab13;

class Rental {
    Movie _movie;
    private int _daysRented;
    private int frequentRenterPoints;
    public Rental(Movie movie, DateRange range) {
        _movie = movie;
        _daysRented = (int)((range.getEnd().getTime() - range.getStart().getTime()) / (1000 * 60 * 60 * 24));
        frequentRenterPoints = 0;
    }
    public int getDaysRented() {
        return _daysRented;
    }

    public String getTitle() {
        return _movie.getTitle();
    }

    public int getPriceCode() {
        return _movie.getPriceCode();
    }

    public Movie getMovie() { return _movie; }

    public double getCharge(){
        return _movie.getCharge(_daysRented);
    }

    public int getFrequentRenterPoints() {
        // add frequent renter points
        frequentRenterPoints ++;
        // add bonus for a two day new release rental
        if ((getPriceCode() == Movie.NEW_RELEASE)
                && getDaysRented() > 1) frequentRenterPoints++;
        return frequentRenterPoints;
    }

}