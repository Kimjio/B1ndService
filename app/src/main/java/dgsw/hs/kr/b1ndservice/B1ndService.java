package dgsw.hs.kr.b1ndservice;

import dgsw.hs.kr.b1ndservice.res.StaticResources;

public class B1ndService {
    public B1ndService(String url){
        StaticResources.DEFAULT_HOST = url;
    }
}
