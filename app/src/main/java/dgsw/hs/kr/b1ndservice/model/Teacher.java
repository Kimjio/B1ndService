package dgsw.hs.kr.b1ndservice.model;

import com.google.gson.annotations.SerializedName;

public class Teacher extends Member {
    @SerializedName("departments_logs")
    private DepartmentLog[] departmentsLogs;

    private String tel;
    private int idx;

    public Teacher(Member member) {
        super(member);
    }

    public Teacher() {

    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public DepartmentLog[] getDepartmentsLogs() {
        return departmentsLogs;
    }

    public void setDepartmentsLogs(DepartmentLog[] departments) {
        this.departmentsLogs = departments;
    }
}
