package dgsw.hs.kr.b1ndservice.model;

import com.google.gson.annotations.SerializedName;

public class DepartmentLog {
    @SerializedName("department_idx")
    private int departmentIdx;

    private int type;
    private String position;

    @SerializedName("class_idx")
    private int classIdx;

    public DepartmentLog(int departmentIdx, int type, String position, int classIdx) {
        this.departmentIdx = departmentIdx;
        this.type = type;
        this.position = position;
        this.classIdx = classIdx;
    }

    public int getDepartmentIdx() {
        return departmentIdx;
    }

    public void setDepartmentIdx(int departmentIdx) {
        this.departmentIdx = departmentIdx;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getClassIdx() {
        return classIdx;
    }

    public void setClassIdx(int classIdx) {
        this.classIdx = classIdx;
    }
}
