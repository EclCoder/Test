package h7;

import android.content.Context;
import android.os.Bundle;
import bm.r;
import com.facebook.appevents.o0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wl.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0604a f40258b = new C0604a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f40259c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f40260a;

    /* JADX INFO: renamed from: h7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0604a {
        public /* synthetic */ C0604a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0604a() {
        }
    }

    static {
        f40259c = c.f56362a.g() <= 1.0E-4d;
    }

    public a(Context context) {
        s.h(context, "context");
        this.f40260a = new o0(context);
    }

    private final boolean a(String str) {
        if (str != null) {
            return r.T(str, "gps", false, 2, null);
        }
        return false;
    }

    public final void b(String str, Bundle bundle) {
        if (f40259c && a(str)) {
            this.f40260a.g(str, bundle);
        }
    }
}
