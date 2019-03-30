package dgsw.hs.kr.b1ndservice.interfaces;

import java.util.ArrayList;

import dgsw.hs.kr.b1ndservice.model.Class_;
import dgsw.hs.kr.b1ndservice.model.Member;

public interface OnGetAllProfileListener {
    void onGetAllProfileSuccess(int status, ArrayList<Member> members);
    void onGetAllProfileFailed(int status, String message);
}
