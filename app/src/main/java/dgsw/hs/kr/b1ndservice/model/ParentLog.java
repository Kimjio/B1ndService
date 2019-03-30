package dgsw.hs.kr.b1ndservice.model;

import com.google.gson.annotations.SerializedName;

public class ParentLog {
    @SerializedName("parent_idx")
    private int parentIdx;

    public int getParentIdx() {
        return parentIdx;
    }

    public void setParentIdx(int parentIdx) {
        this.parentIdx = parentIdx;
    }
}
