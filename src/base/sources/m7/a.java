package m7;

import android.os.Bundle;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.e1;
import com.facebook.internal.w;
import java.util.HashSet;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f45293b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f45292a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashSet f45294c = new HashSet();

    private a() {
    }

    public static final void a() {
        if (x7.a.c(a.class)) {
            return;
        }
        try {
            if (f45293b) {
                return;
            }
            f45292a.b();
            f45293b = !f45294c.isEmpty();
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
        }
    }

    private final void b() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            w wVarV = a0.v(h0.n(), false);
            if (wVarV == null) {
                return;
            }
            f45294c = c(wVarV.b());
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final HashSet c(JSONArray jSONArray) {
        try {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                HashSet hashSetM = e1.m(jSONArray);
                return hashSetM == null ? new HashSet() : hashSetM;
            } catch (Exception unused) {
                return new HashSet();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static final void d(Bundle bundle) {
        if (x7.a.c(a.class)) {
            return;
        }
        try {
            if (f45293b && bundle != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : f45294c) {
                    if (bundle.containsKey(str)) {
                        bundle.remove(str);
                        jSONArray.put(str);
                    }
                }
                if (jSONArray.length() > 0) {
                    bundle.putString("_bannedParams", jSONArray.toString());
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
        }
    }
}
