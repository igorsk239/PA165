package cz.muni.fi.pa165.currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.math.BigDecimal;
import java.util.Currency;

public class MainXml {
    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Autowired
    static CurrencyConvertor cur;

    public static void main(String[] args) {
        cur = context.getBean("currencyConvertorImpl", CurrencyConvertor.class);
        System.out.println(cur.convert(Currency.getInstance("EUR"), Currency.getInstance("CZK"), BigDecimal.ONE));

    }
}
