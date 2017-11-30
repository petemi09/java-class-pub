package exercise10;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.Objects;

/**
 * Class Book
 * @author yasiro01
 */
public class Book {
   protected final String title;
   protected final String author;
   protected Double price;
   protected final Integer year;
   
public Book(final String title, final String author, double price, final Integer year){
    this.title = title;
    this.author = author;
    this.price = price;
    this.year = year;
}

public Book(Book other){
    this.title = other.title;
    this.author = other.author;
    this.year = other.year;
    this.price = other.price;
}

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        return this.title + " (" + this.year +") by " + this.author + " costs $" + df.format(price);
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.title);
        hash = 17 * hash + Objects.hashCode(this.author);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.year);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        return true;
    }

    public Integer getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}

class ByTitle implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.title.compareTo(o2.title);
    }
    
}

class ByAuthor implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
         return o1.author.compareTo(o2.author);
    }
}

class ByPrice implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.price.compareTo(o2.price);
    }
}

class ByYear implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.year.compareTo(o2.year);
    }

}
