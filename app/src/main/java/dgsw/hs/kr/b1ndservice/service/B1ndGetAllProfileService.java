package dgsw.hs.kr.b1ndservice.service;

import dgsw.hs.kr.b1ndservice.R;
import dgsw.hs.kr.b1ndservice.Utils;
import dgsw.hs.kr.b1ndservice.interfaces.OnGetAllProfileListener;
import dgsw.hs.kr.b1ndservice.interfaces.OnGetClassesListener;
import dgsw.hs.kr.b1ndservice.model.Member;
import dgsw.hs.kr.b1ndservice.retrofit2.interfaces.GetAllProfile;
import dgsw.hs.kr.b1ndservice.retrofit2.interfaces.GetClasses;
import dgsw.hs.kr.b1ndservice.retrofit2.response.ResponseTypeManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class B1ndGetAllProfileService {
    private GetAllProfile getAllProfile;

    private OnGetAllProfileListener getClassesListener;

    public B1ndGetAllProfileService() {
        intiRetrofit();
    }

    private void intiRetrofit(){
        getAllProfile = Utils.RETROFIT.create(GetAllProfile.class);
    }

    public void getAllProfile(String token, OnGetAllProfileListener onGetAllProfileListener){
        this.getClassesListener = onGetAllProfileListener;

        Call<ResponseTypeManager.MemberProfilesAlias> getClasses = getAllProfile.getAllProfile(token);

        getClasses.enqueue(new Callback<ResponseTypeManager.MemberProfilesAlias>(){
            @Override
            public void onResponse(Call<ResponseTypeManager.MemberProfilesAlias> call,
                                   Response<ResponseTypeManager.MemberProfilesAlias> response) {
                if (response.body().getStatus() == 404) {
                    getClassesListener.onGetAllProfileFailed(response.body().getStatus(),
                            response.body().getMessage());
                } else if (response.body().getStatus() == 200) {
                    getClassesListener.onGetAllProfileSuccess(response.body().getStatus(),
                             response.body().getData().getMembers());
                }
            }

            @Override
            public void onFailure(Call<ResponseTypeManager.MemberProfilesAlias> call, Throwable t) {
                getClassesListener.onGetAllProfileFailed(0,String.valueOf(R.string.error_server));
            }
        });

    }
}
