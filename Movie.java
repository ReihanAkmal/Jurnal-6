package Sorting;

class Movie implements Comparable<Movie> {
    // Atribut yang memiliki acces modifier private
    private double rating;
    private String name;
    private int year;

    // Ini adalah function untuk memanggil atribut yaitu rating, name, dan year
    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    // Ini adalah fungsi untuk mendapatkan rating
    public double getRating() {
        return rating;
    }

    // Ini adalah fungsi untuk mendapatkan nama
    public String getName() {
        return name;
    }

    // Ini adalah fungsi untuk mendapatkan tahun
    public int getYear() {
        return year;
    }

    // Ini adalah fungsi untuk meng-komper data kedalam objek
    @Override
    public int compareTo(Movie o) {
        return this.getYear() - o.getYear();
    }
}

