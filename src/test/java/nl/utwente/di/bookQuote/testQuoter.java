package nl.utwente.di.bookQuote;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class testQuoter {

    @Test
    public void testBook1() throws Exception {
        Quoter quoter = new Quoter();
        double price = quoter.getBookPrice("1");
        Assertions.assertEquals(10.0, price, 0.0, "Price of book 1 ");
    }
}
