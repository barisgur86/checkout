package kata.checkout.model;

import java.math.BigDecimal;

public class StockKeepingUnit {
    private String name;
    private BigDecimal price;
    private int offerItem;
    private BigDecimal offerPrice;

    public int getOfferItem() {
        return offerItem;
    }

    public void setOfferItem(int offerItem) {
        this.offerItem = offerItem;
    }

    public BigDecimal getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(BigDecimal offerPrice) {
        this.offerPrice = offerPrice;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isHasOffer() {
        return hasOffer;
    }

    public void setHasOffer(boolean hasOffer) {
        this.hasOffer = hasOffer;
    }

    private BigDecimal totalAmount;
    private int count;
    private boolean hasOffer;

    public BigDecimal calculateTotalAmount() {
        totalAmount = BigDecimal.ZERO;
        if (count>0 && hasOffer){
           totalAmount = price.multiply(new BigDecimal(count % offerItem)).add(offerPrice.multiply(new BigDecimal(count/offerItem)));
        }else totalAmount = price.multiply(new BigDecimal(count));

        return totalAmount;
    }


    public String getName() {
        return name;
    }

    public StockKeepingUnit(String name) {
        this.name = name;
        this.count=0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
