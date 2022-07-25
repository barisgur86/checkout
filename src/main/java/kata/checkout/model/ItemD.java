package kata.checkout.model;

import java.math.BigDecimal;

public class ItemD extends StockKeepingUnit {
    public ItemD(String name) {
        super(name);
        setCount(1);
        setHasOffer(false);
        setPrice(new BigDecimal(15));
    }
}
