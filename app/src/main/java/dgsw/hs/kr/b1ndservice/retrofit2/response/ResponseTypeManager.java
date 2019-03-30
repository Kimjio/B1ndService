package dgsw.hs.kr.b1ndservice.retrofit2.response;

import dgsw.hs.kr.b1ndservice.retrofit2.response.member.login.Response.Response;

public class ResponseTypeManager {
    public static class LoginAlias
            extends dgsw.hs.kr.b1ndservice.retrofit2.response.member.login.Response.Response {
    }

    public static class MemberProfilesAlias
            extends dgsw.hs.kr.b1ndservice.retrofit2.response.member.lookup.Response.Response{
    }

    public static class GetClassesAlias
            extends dgsw.hs.kr.b1ndservice.retrofit2.response.member.student.Response{
    }

    public static class GetDepartmentsAlias
            extends dgsw.hs.kr.b1ndservice.retrofit2.response.member.department.lookup.Response {
    }


    public ResponseTypeManager() {
    }
}
