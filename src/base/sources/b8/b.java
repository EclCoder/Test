package b8;

import android.util.Base64;
import android.util.Log;
import bm.d;
import bm.r;
import com.facebook.h0;
import fl.g0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import ql.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f8499a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f8500b = "/.well-known/oauth/openid/keys/";

    private b() {
    }

    public static final PublicKey b(String key) throws InvalidKeySpecException {
        s.h(key, "key");
        byte[] bArrDecode = Base64.decode(r.I(r.I(r.I(key, "\n", "", false, 4, null), "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), 0);
        s.g(bArrDecode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        s.g(publicKeyGeneratePublic, "kf.generatePublic(x509publicKey)");
        return publicKeyGeneratePublic;
    }

    public static final String c(final String kid) {
        s.h(kid, "kid");
        final URL url = new URL("https", "www." + h0.w(), f8500b);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        final k0 k0Var = new k0();
        h0.v().execute(new Runnable() { // from class: b8.a
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                b.d(url, k0Var, kid, reentrantLock, conditionNewCondition);
            }
        });
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) k0Var.f43597a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(URL openIdKeyUrl, k0 result, String kid, ReentrantLock lock, Condition condition) throws IOException {
        s.h(openIdKeyUrl, "$openIdKeyUrl");
        s.h(result, "$result");
        s.h(kid, "$kid");
        s.h(lock, "$lock");
        URLConnection uRLConnectionOpenConnection = openIdKeyUrl.openConnection();
        s.f(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                s.g(inputStream, "connection.inputStream");
                String strC = k.c(new BufferedReader(new InputStreamReader(inputStream, d.f9079b), 8192));
                httpURLConnection.getInputStream().close();
                result.f43597a = new JSONObject(strC).optString(kid);
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    g0 g0Var = g0.f38750a;
                } finally {
                    lock.unlock();
                }
            } catch (Throwable th2) {
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    g0 g0Var2 = g0.f38750a;
                    throw th2;
                } finally {
                    lock.unlock();
                }
            }
        } catch (Exception e10) {
            String name = f8499a.getClass().getName();
            String message = e10.getMessage();
            if (message == null) {
                message = "Error getting public key";
            }
            Log.d(name, message);
            httpURLConnection.disconnect();
            lock.lock();
            try {
                condition.signal();
                g0 g0Var3 = g0.f38750a;
            } finally {
                lock.unlock();
            }
        }
    }

    public static final boolean e(PublicKey publicKey, String data, String signature) {
        s.h(publicKey, "publicKey");
        s.h(data, "data");
        s.h(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(d.f9079b);
            s.g(bytes, "this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] bArrDecode = Base64.decode(signature, 8);
            s.g(bArrDecode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }
}
