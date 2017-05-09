package dk.tv2.evemarket1.Holders;

import java.util.List;

/**
 * Created by cfr on 09-05-2017.
 */

public class HeadGroup {
    private String name;
    private String id;
    private List<HeadMid> parentGroup;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<HeadMid> getParentGroup() {
        return parentGroup;
    }
}
