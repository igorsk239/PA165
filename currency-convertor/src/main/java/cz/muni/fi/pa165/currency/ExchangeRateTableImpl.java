package cz.muni.fi.pa165.currency;

import org.springframework.stereotype.Component;
import javax.inject.Named;
import java.math.BigDecimal;
import java.util.Currency;

@Component
@Named
public class ExchangeRateTableImpl implements ExchangeRateTable {
    @Override
    public BigDecimal getExchangeRate(Currency sourceCurrency, Currency targetCurrency) throws ExternalServiceFailureException {
        return BigDecimal.valueOf(27);
    }
}
