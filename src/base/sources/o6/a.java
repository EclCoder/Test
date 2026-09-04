package o6;

import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f48211a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f48212b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f48213c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f48214d = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static z6.a f48215e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f48216f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f48217g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f48218h = 8192;

    public static int a() {
        return f48217g;
    }

    public static int b() {
        return f48218h;
    }

    public static int c() {
        return f48213c;
    }

    public static int d() {
        return f48211a;
    }

    public static boolean e(String str) {
        return f48216f && str != null && str.endsWith(".mp4");
    }

    public static void f() {
        z6.a aVar = f48215e;
        if (aVar != null) {
            aVar.gjv();
        }
    }

    public static void g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            f48216f = jSONObject.optInt("check_moov", 0) == 1;
            f48217g = jSONObject.optInt("new_media_source", 1);
            f48218h = jSONObject.optInt("read_buffer_size_k", 8) * UserVerificationMethods.USER_VERIFY_ALL;
        } catch (JSONException unused) {
        }
    }

    public static void h(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            f48211a = jSONObject.optInt("splash", 10);
            f48212b = jSONObject.optInt("reward", 10);
            f48213c = jSONObject.optInt("brand", 10);
            int iOptInt = jSONObject.optInt("other", 10);
            f48214d = iOptInt;
            if (f48211a < 0) {
                f48211a = 10;
            }
            if (f48212b < 0) {
                f48212b = 10;
            }
            if (f48213c < 0) {
                f48213c = 10;
            }
            if (iOptInt < 0) {
                f48214d = 10;
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public static void i(z6.a aVar) {
        f48215e = aVar;
    }

    public static int j() {
        return f48212b;
    }

    public static int k() {
        return f48214d;
    }
}
