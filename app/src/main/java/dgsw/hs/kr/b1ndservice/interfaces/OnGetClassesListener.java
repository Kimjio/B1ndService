package dgsw.hs.kr.b1ndservice.interfaces;


import dgsw.hs.kr.b1ndservice.model.Class_;

public interface OnGetClassesListener {
    void onGetClassesSuccess(int status, Class_[] classes);
    void onGetClassesFailed(int status, String message);
}
