package kata.checkout.model;

import java.math.BigDecimal;

public class ItemC extends StockKeepingUnit{
    public ItemC(String name) {
        super(name);
        setCount(1);
        setHasOffer(false);
        setPrice(new BigDecimal(20));
    }
}
