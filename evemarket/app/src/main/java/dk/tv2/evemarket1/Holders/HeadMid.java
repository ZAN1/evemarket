package dk.tv2.evemarket1.Holders;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cfr on 09-05-2017.
 */

public class HeadMid {
    private String name;
    private HeadParent parentGroup;
    private String id_str;
    private List<HeadMid> childgroups = new ArrayList<>();


    public List<HeadMid> getChildgroups() {
        return childgroups;
    }

    public HeadParent getParentGroup() {
        return parentGroup;
    }

    public String getName() {
        return name;
    }





    public String  getId_str() {
        return id_str;
    }

    public void addCheilsGroupe(HeadMid childgroup){

        childgroups.add(childgroup);


    }

}

