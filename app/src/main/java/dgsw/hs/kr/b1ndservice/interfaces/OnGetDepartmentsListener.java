package dgsw.hs.kr.b1ndservice.interfaces;


import dgsw.hs.kr.b1ndservice.model.Department;

public interface OnGetDepartmentsListener {
    void onGetDepartmentsSuccess(int status, Department[] departments);
    void onGetDepartmentsFailed(int status, String message);
}
