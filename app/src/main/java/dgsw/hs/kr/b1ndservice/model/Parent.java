package dgsw.hs.kr.b1ndservice.model;

import com.google.gson.annotations.SerializedName;

public class Parent extends Member {
    private int idx;

    @SerializedName("children_logs")
    private ChildrenLog[] childrenLogs;

    public Parent(Member member) {
        super(member);
    }

    public Parent() {

    }

    public ChildrenLog[] getChildrenLogs() {
        return childrenLogs;
    }

    public void setChildrenLogs(ChildrenLog[] childrenLogs) {
        this.childrenLogs = childrenLogs;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }
}
