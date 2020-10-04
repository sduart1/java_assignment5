
package com.origamisoftware.teach.advanced.services;

import com.origamisoftware.teach.advanced.model.StockQuote;
import java.util.Calendar;
import java.util.List;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


/**
 *
 * Unit tests for SimpleStockService
 */
public class SimpleStockServiceTest {
 
    /**
     * Test the SimpleStockService getQuot(symbol) method
     */
    @Test
    public void getQuoteSymbolTest (){
        SimpleStockService stockService = new SimpleStockService();
        String symbol = "APPL";
        StockQuote stockQuote = stockService.getQuote(symbol);
        assertNotNull("Checking to make sure we can get a quote",  stockQuote);
    }
    
    
    /**
     * Test the SimpleStockService getQuote(symbol, calendar, calendar) method 
     */
    @Test
    public void getQuoteListTest(){
        SimpleStockService stockService = new SimpleStockService();
       
        String symbol = "GOOG";
        Calendar from = Calendar.getInstance();
        from.set(1981, 01, 25, 0,0,0);
        Calendar until = Calendar.getInstance();
        until.set(2020, 02, 15, 0, 0, 0);
        
        List<StockQuote> stockQuote = stockService.getQuote(symbol, from, until);

        assertNotNull("Checking to make sure we can get a quote",  stockQuote);

    }
}

