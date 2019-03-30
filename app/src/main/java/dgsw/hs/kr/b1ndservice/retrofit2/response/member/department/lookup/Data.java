package dgsw.hs.kr.b1ndservice.retrofit2.response.member.department.lookup;

import dgsw.hs.kr.b1ndservice.model.Department;

/**
 * @author dawncrow
 * @date 2018. 1. 11.
 */
public class Data {
    private Department[] departments;

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] value) {
        this.departments = value;
    }
}
