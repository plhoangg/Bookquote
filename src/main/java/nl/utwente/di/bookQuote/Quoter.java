package nl.utwente.di.bookQuote;

import java.util.HashMap;

public class Quoter {
    private HashMap<String,Double> table = new HashMap<String,Double>();

    public Quoter() {
        table.put("1", 10.0);
        table.put("2", 45.0);
        table.put("3", 20.0);
        table.put("4", 35.0);
        table.put("5", 50.0);
    }

    public double getBookPrice(String isbn) {
        if(table.containsKey(isbn)) {
            return table.get(isbn);
        } else {
            return 0.0;
        }
    }
}
