package dgsw.hs.kr.b1ndservice.service;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

import dgsw.hs.kr.b1ndservice.interfaces.CallbackResponse;
import dgsw.hs.kr.b1ndservice.interfaces.OnLoginSuccessListener;
import dgsw.hs.kr.b1ndservice.R;
import dgsw.hs.kr.b1ndservice.Utils;
import dgsw.hs.kr.b1ndservice.res.StaticResources;
import dgsw.hs.kr.b1ndservice.retrofit2.callback.LoginCallback;
import dgsw.hs.kr.b1ndservice.retrofit2.interfaces.Login;
import dgsw.hs.kr.b1ndservice.retrofit2.response.ResponseTypeManager;
import dgsw.hs.kr.b1ndservice.retrofit2.response.member.login.Request.Request;
import dgsw.hs.kr.b1ndservice.retrofit2.response.member.login.Response.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;

public class B1ndLogin {

    private Login loginService;


    public B1ndLogin() {
        initRetrofit();
    }

    private void initRetrofit() {
        Log.e("server",StaticResources.DEFAULT_HOST);
        loginService = Utils.RETROFIT.create(Login.class);
    }

    public void login(String email, String password, final OnLoginSuccessListener loginSuccessListener) {
        try {

            Request request = new Request(email, Utils.encryptSHA512(password));
            Call<ResponseTypeManager.LoginAlias> loginRequest =
                    loginService.login(request);
            loginRequest.enqueue(
                    new LoginCallback(
                            new CallbackResponse<ResponseTypeManager.LoginAlias>() {
                                @Override
                                public void onResponse(
                                        ResponseTypeManager.LoginAlias loginAlias) {

                                    try {
                                        loginSuccessListener.onSuccess(
                                                loginAlias.getStatus(), loginAlias.getMessage(),
                                                loginAlias.getData().getToken(), loginAlias.getData().getRefreshToken());
                                    } catch (Exception e) {
                                        loginSuccessListener.onFail(loginAlias.getMessage());

                                        e.printStackTrace();
                                    }
                                }

                                @Override
                                public void onError(ResponseBody errorBody) {
//                                    400 ~500
                                    try {
                                        loginSuccessListener.onFail(
                                                new JSONObject(
                                                        Objects
                                                                .requireNonNull(
                                                                        errorBody)
                                                                .string()).get("message").toString());
                                    } catch (JSONException | IOException e) {
                                        e.printStackTrace();
                                    }
                                }

                                @Override
                                public void onFailure(Throwable throwable) {

                                    loginSuccessListener.onFail("서버연결오류"+StaticResources.DEFAULT_HOST);
                                    loginSuccessListener.onFail(throwable.getMessage());
                                    Log.e("LoginErr", "서버연결오류"+StaticResources.DEFAULT_HOST);
                                }
                            }));
        } catch (NoSuchAlgorithmException e) {
            loginSuccessListener.onFail(e.getMessage());
        }
    }

}

//    private void initDatabase(String email, String token, String refreshToken) {
//        try {
//            if (!databaseHelper.getRefreshToken().equals(refreshToken)) {
//
//                databaseHelper.deleteAllData();
//            }
//
//            databaseHelper.insertTokenData(token, refreshToken);
//        } catch (Exception e) {
//            Log.e("LoginErr", e.toString());
////            loginProgressBar.setVisibility(View.GONE);
//        }
//
//        SocketManager.getInstance().connect(context);
//
//        Call<ResponseTypeManager.GetClassesAlias> getClasses = getClassService.getClasses(token);
//        getClasses.enqueue(new GetStudentCallBackClass(context));
//
//        Call<ResponseTypeManager.GetDepartmentsAlias> getDepartmentsAliasCall =
//                getDepartmentsService.getDepartments(databaseHelper.getToken());
//
//        getDepartmentsAliasCall.enqueue(new GetDepartmentsAliasCallback(context));
//
//        Call<ResponseTypeManager.MemberProfilesAlias> getAllProfileRequest =
//                getAllProfileService.getAllProfile(databaseHelper.getToken());
//
//        getAllProfileRequest.enqueue(
//                new GetAllProfileCallback(
//                        new CallbackResponse<ResponseTypeManager.MemberProfilesAlias>() {
//                            @Override
//                            public void onResponse(ResponseTypeManager.MemberProfilesAlias body) {
//                                try {
//                                    for (Member member : body.getData().getMembers()) {
//                                        databaseHelper.insertMemberData(member, email);
//                                    }
//
//                                    Member myInfo = databaseHelper.getMyInform();
//                                    Utils.MY_ID = myInfo.getId();
//
//                                    checkMemberType(myInfo);
//
//                                    return;
//                                } catch (Exception e) {
//                                    Log.e("ERR", "", e);
////                                    runOnUiThread(
////                                            () -> {
////                                                Toast.makeText(
////                                                        LoginActivity.this,
////                                                        R.string.error_unknown,
////                                                        Toast.LENGTH_SHORT)
////                                                        .show();
////                                                loginProgressBar.setVisibility(View.GONE);
////                                            });
//                                }
//                            }
//
//                            @Override
//                            public void onError(ResponseBody errorBody) {
//                                Log.e("LoginErr", String.valueOf(R.string.error_server));
//                            }
//
//                            @Override
//                            public void onFailure(Throwable throwable) {
//                                onError(null);
//                            }
//                        }));
//    }
//
//
//    public void checkMemberType(Member myInfo) {
//        if (myInfo instanceof Student)
//            memberType = MemberType.Student;
//        if (myInfo instanceof Teacher)
//            memberType = MemberType.Teacher;
//        if (myInfo instanceof Parent)
//            memberType = MemberType.Parent;
//    }
