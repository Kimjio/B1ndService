package dgsw.hs.kr.b1ndservice.model;

import com.google.gson.annotations.SerializedName;

public class ChildrenLog {
    private int idx;

    @SerializedName("child_idx")
    private int childIdx;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getChildIdx() {
        return childIdx;
    }

    public void setChildIdx(int childIdx) {
        this.childIdx = childIdx;
    }
}
