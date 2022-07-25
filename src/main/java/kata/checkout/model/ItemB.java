package kata.checkout.model;

import java.math.BigDecimal;

public class ItemB extends StockKeepingUnit{
    public ItemB(String name) {
        super(name);
        setOfferPrice(new BigDecimal(45));
        setCount(1);
        setOfferItem(2);
        setHasOffer(true);
        setPrice(new BigDecimal(30));
    }
}
