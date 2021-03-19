package cz.muni.fi.pa165.currency;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Currency;

public class MainAnnotations {
    @Inject
    static CurrencyConvertor cur;
    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    public static void main(String[] args) {
        cur = context.getBean("currencyConvertorImpl", CurrencyConvertor.class);
        System.out.println(cur.convert(Currency.getInstance("EUR"), Currency.getInstance("CZK"), BigDecimal.ONE));
    }
}
