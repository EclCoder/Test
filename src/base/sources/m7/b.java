package m7;

import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.e1;
import com.facebook.internal.w;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f45296b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f45295a = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Set f45297c = new HashSet();

    private b() {
    }

    public static final void a() {
        if (x7.a.c(b.class)) {
            return;
        }
        try {
            f45295a.c();
            Set set = f45297c;
            if (set != null && !set.isEmpty()) {
                f45296b = true;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
        }
    }

    public static final boolean b(String eventName) {
        if (x7.a.c(b.class)) {
            return false;
        }
        try {
            s.h(eventName, "eventName");
            if (f45296b) {
                return f45297c.contains(eventName);
            }
            return false;
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
            return false;
        }
    }

    private final void c() {
        HashSet hashSetM;
        if (x7.a.c(this)) {
            return;
        }
        try {
            w wVarV = a0.v(h0.n(), false);
            if (wVarV == null || (hashSetM = e1.m(wVarV.c())) == null) {
                return;
            }
            f45297c = hashSetM;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
