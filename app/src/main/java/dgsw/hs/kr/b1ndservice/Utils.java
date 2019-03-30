package dgsw.hs.kr.b1ndservice;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executors;

import dgsw.hs.kr.b1ndservice.res.StaticResources;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Utils {
    public static Retrofit RETROFIT =
            new Retrofit.Builder()
                    .baseUrl(StaticResources.DEFAULT_HOST)
                    .addConverterFactory(GsonConverterFactory.create())
                    .callbackExecutor(Executors.newSingleThreadExecutor())
                    .build();

    public static String encryptSHA512(String target) throws NoSuchAlgorithmException {

        final MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
        final StringBuilder encryptedPassword = new StringBuilder();

        messageDigest.update(target.getBytes());

        final byte[] buffer = messageDigest.digest();

        for (byte temp : buffer) {

            StringBuilder sb = new StringBuilder(Integer.toHexString(temp));

            while (sb.length() < 2) {

                sb.insert(0, "0");
            }

            sb = new StringBuilder(sb.substring(sb.length() - 2));
            encryptedPassword.append(sb);
        }

        return encryptedPassword.toString();
    }
}
