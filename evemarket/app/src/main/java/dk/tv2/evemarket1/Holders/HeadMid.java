package dk.tv2.evemarket1.Holders;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cfr on 09-05-2017.
 */

public class HeadMid {
    private String name;
    private HeadParent parentGroup;
    private String id;
    private List<HeadMid> childgroups = new ArrayList<>();
    private List<HeadMid> cheildcheild = new ArrayList<>();
    private List<HeadMid> hans = new ArrayList<>();
    private List<HeadMid> hansi = new ArrayList();
    private List<HeadMid> cata = new ArrayList<>();
    private List<HeadMid> headmid;

    public List<HeadMid> getCata() {
        return cata;
    }

    public void setCata(List<HeadMid> cata) {
        this.cata = cata;
    }

    public List<HeadMid> getHeadmid() {
        return headmid;
    }

    public void setHeadmid(List<HeadMid> headmid) {
        this.headmid = headmid;
    }

    //private hans12;
    public List<HeadMid> getHansi() {
        return hansi;
    }

    public void setHansi(List<HeadMid> hansi) {
        this.hansi = hansi;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentGroup(HeadParent parentGroup) {
        this.parentGroup = parentGroup;
    }

    public void setId_str(String id) {
        this.id = id;
    }

    public void setChildgroups(List<HeadMid> childgroups) {
        this.childgroups = childgroups;
    }

    public void setCheildcheild(List<HeadMid> cheildcheild) {
        this.cheildcheild = cheildcheild;
    }

    public List<HeadMid> getHans() {
        return hans;
    }

    public void setHans(List<HeadMid> hans) {
        this.hans = hans;
    }

    public List<HeadMid> getCheildcheild() {
        return cheildcheild;
    }

    public List<HeadMid> getChildgroups() {
        return childgroups;
    }

    public HeadParent getParentGroup() {
        return parentGroup;
    }

    public String getName() {
        return name;
    }










    public void addCheilsGroupe(HeadMid childgroup){

        childgroups.add(childgroup);


    }
    public void addcheildofcheild(HeadMid cheildcheild1){

        cheildcheild.add(cheildcheild1);

    }
    @Override
    public String toString(){

        return hans.toString();

    }



    public String getId() {
        return id;
    }
}

