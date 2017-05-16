package dk.tv2.evemarket1.Holders;

import java.util.List;

/**
 * Created by cfr on 16-05-2017.
 */

public class MarketResult {
    private List<HeadMid> items;

    public List<HeadMid> getItems() {
        return items;
    }

    public void setItems(List<HeadMid> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "MarketResult{" +
                "items=" + items +
                '}';
    }
}
