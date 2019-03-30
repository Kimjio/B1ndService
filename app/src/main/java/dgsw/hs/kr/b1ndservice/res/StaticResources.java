package dgsw.hs.kr.b1ndservice.res;

import android.os.Environment;

import dgsw.hs.kr.b1ndservice.BuildConfig;

/**
 * @author 이지헌
 */
public final class StaticResources {

    public static final boolean DEBUG = BuildConfig.DEBUG;

    public static final String DIRECTORY_DOWNLOADS = Environment.DIRECTORY_DOWNLOADS + "/TMessenger";

    public static String SOCKET_HOST = "http://115.68.25.98:3000";
    public static String DEFAULT_HOST = "http://115.68.25.98:3000";

}
