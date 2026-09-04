package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.C9;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fl.k f24581a = fl.l.b(new tl.a() { // from class: yh.y
        @Override // tl.a
        public final Object invoke() {
            return C9.b();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f24582b;

    static {
        String simpleName = C9.class.getSimpleName();
        f24582b = simpleName;
        kotlin.jvm.internal.s.e(simpleName);
    }

    public static String a() {
        La la2 = (La) f24581a.getValue();
        String string = null;
        if (la2 != null) {
            kotlin.jvm.internal.s.h("cip", "key");
            string = la2.f25198a.getString("cip", null);
        }
        String TAG = f24582b;
        kotlin.jvm.internal.s.g(TAG, "TAG");
        return string;
    }

    public static final La b() {
        Context context = Xi.f26021a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        return Ka.a(context, "inmobi_store");
    }

    public static void a(String str) {
        La la2 = (La) f24581a.getValue();
        if (la2 != null) {
            ConcurrentHashMap concurrentHashMap = La.f25197b;
            la2.a("cip", str, false);
            fl.g0 g0Var = fl.g0.f38750a;
        }
        kotlin.jvm.internal.s.e(f24582b);
    }
}
