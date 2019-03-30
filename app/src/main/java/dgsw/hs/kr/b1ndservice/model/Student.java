package dgsw.hs.kr.b1ndservice.model;

import com.google.gson.annotations.SerializedName;

public class Student extends Member {
    private int idx;

    @SerializedName("class_idx")
    private int classIdx;

    private int number;

    @SerializedName("parents_logs")
    private ParentLog[] parentsLogs;

    public Student(Member member) {
        super(member);
    }

    public ParentLog[] getParentsLogs() {
        return parentsLogs;
    }

    public void setParentsLogs(ParentLog[] parentsLogs) {
        this.parentsLogs = parentsLogs;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getClassIdx() {
        return classIdx;
    }

    public void setClassIdx(int classIdx) {
        this.classIdx = classIdx;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
