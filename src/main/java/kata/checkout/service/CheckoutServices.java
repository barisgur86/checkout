package kata.checkout.service;


import kata.checkout.model.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class CheckoutServices {
    public static HashMap<String, StockKeepingUnit> cartMap = new HashMap<>();


    public static BigDecimal calculateTotalAmount() {
        List<BigDecimal> totalAmountList= new ArrayList<>();
        cartMap.values().forEach(item-> item.calculateTotalAmount());
        totalAmountList =cartMap.values().stream().map(item-> item.getTotalAmount()).collect(Collectors.toList());
        BigDecimal sumTotalAmount = totalAmountList.stream().reduce(BigDecimal.ZERO, BigDecimal::add);

        return sumTotalAmount;
    }


    public static StockKeepingUnit createSKU(String itemName) {
        switch (itemName) {
            case "A":
                return new ItemA(itemName);
            case "B":
                return new ItemB(itemName);
            case "C":
                return new ItemC(itemName);
            case "D":
                return new ItemD(itemName);
            default:
                StockKeepingUnit sku = null;
                return sku;

        }
    }

    public static void addCart(String itemName) {
        if (cartMap.containsKey(itemName)) {
            int count = cartMap.get(itemName).getCount();
            cartMap.get(itemName).setCount(++count);
        }

        else {
           StockKeepingUnit sku = createSKU(itemName);
            Optional<StockKeepingUnit> skuOptional = Optional.ofNullable(sku);
           if (skuOptional.isPresent())
                cartMap.put(skuOptional.get().getName(), skuOptional.get());
           else
               throw new BusinessException("Item is not found");
        }
    }
}
