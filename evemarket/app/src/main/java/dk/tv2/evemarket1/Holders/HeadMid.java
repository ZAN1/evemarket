package dk.tv2.evemarket1.Holders;

import java.util.List;

/**
 * Created by cfr on 09-05-2017.
 */

public class HeadMid {
    private String name;
   // private HeadParent parentGroup;
    private List<HeadParent> parentGroup;

    public List<HeadParent> getParentGroup() {
        return parentGroup;
    }

    public String getName() {
        return name;
    }



    private String id;

    public String getId() {
        return id;
    }
}
