package r7;

import android.app.Activity;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.w;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f51122a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f51123b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f51124c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f51125d = new LinkedHashSet();

    private e() {
    }

    public static final synchronized void b() {
        if (x7.a.c(e.class)) {
            return;
        }
        try {
            h0.v().execute(new Runnable() { // from class: r7.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.c();
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        if (x7.a.c(e.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f51123b;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            f51122a.d();
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }

    private final void d() {
        String strY;
        if (x7.a.c(this)) {
            return;
        }
        try {
            w wVarV = a0.v(h0.n(), false);
            if (wVarV != null && (strY = wVarV.y()) != null) {
                g(strY);
                if (f51124c.isEmpty() && f51125d.isEmpty()) {
                    return;
                }
                File fileL = o7.f.l(o7.f.a.MTML_APP_EVENT_PREDICTION);
                if (fileL == null) {
                    return;
                }
                a.d(fileL);
                Activity activityM = n7.g.m();
                if (activityM != null) {
                    h(activityM);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final boolean e(String event) {
        if (x7.a.c(e.class)) {
            return false;
        }
        try {
            s.h(event, "event");
            return f51125d.contains(event);
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
            return false;
        }
    }

    public static final boolean f(String event) {
        if (x7.a.c(e.class)) {
            return false;
        }
        try {
            s.h(event, "event");
            return f51124c.contains(event);
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
            return false;
        }
    }

    public static final void h(Activity activity) {
        if (x7.a.c(e.class)) {
            return;
        }
        try {
            s.h(activity, "activity");
            try {
                if (!f51123b.get() || !a.f() || (f51124c.isEmpty() && f51125d.isEmpty())) {
                    g.f51127d.b(activity);
                    return;
                }
                g.f51127d.a(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }

    public final void g(String str) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Set set = f51124c;
                    String string = jSONArray.getString(i10);
                    s.g(string, "jsonArray.getString(i)");
                    set.add(string);
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    Set set2 = f51125d;
                    String string2 = jSONArray2.getString(i11);
                    s.g(string2, "jsonArray.getString(i)");
                    set2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
