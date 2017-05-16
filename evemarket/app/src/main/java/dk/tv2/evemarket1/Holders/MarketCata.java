package dk.tv2.evemarket1.Holders;

import java.util.List;

/**
 * Created by cfr on 16-05-2017.
 */

public class MarketCata {

    private List<HeadGroup> catagory;

    public List<HeadGroup> getCatagory() {
        return catagory;
    }

    public void setCatagory(List<HeadGroup> catagory) {
        this.catagory = catagory;
    }

    @Override
    public String toString() {
        return catagory.toString();
    }
}
