package kata.checkout.model;

import java.math.BigDecimal;

public class ItemA extends  StockKeepingUnit{
    public ItemA(String name) {
        super(name);
        setOfferPrice(new BigDecimal(130));
        setCount(1);
        setOfferItem(3);
        setHasOffer(true);
        setPrice(new BigDecimal(50));
    }
}
