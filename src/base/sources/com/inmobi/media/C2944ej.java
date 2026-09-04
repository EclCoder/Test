package com.inmobi.media;

import android.content.Context;
import android.os.Process;
import com.inmobi.media.C2944ej;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.ej, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2944ej {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f26505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f26506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f26507f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final La f26510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final I1 f26511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final I1 f26512k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zl.k[] f26503b = {kotlin.jvm.internal.l0.g(new kotlin.jvm.internal.c0(C2944ej.class, "sessionCnt", "getSessionCnt()I", 0)), kotlin.jvm.internal.l0.g(new kotlin.jvm.internal.c0(C2944ej.class, "userRetention", "getUserRetention()I", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2944ej f26502a = new C2944ej();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f26504c = C2944ej.class.getSimpleName();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f26508g = gl.r.q(0, 0, 0, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f26509h = new AtomicBoolean(false);

    static {
        La laA;
        int i10 = -1;
        Context context = Xi.f26021a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = La.f25197b;
            laA = Ka.a(context, "session_pref_file");
        } else {
            laA = null;
        }
        f26510i = laA;
        int i11 = 12;
        f26511j = new I1(i10, new tl.a() { // from class: yh.p8
            @Override // tl.a
            public final Object invoke() {
                return Integer.valueOf(C2944ej.a());
            }
        }, i11);
        f26512k = new I1(i10, new tl.a() { // from class: yh.q8
            @Override // tl.a
            public final Object invoke() {
                return Integer.valueOf(C2944ej.b());
            }
        }, i11);
    }

    public static boolean a(int i10) {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
        return ((SignalsConfig) AbstractC2878c4.f26300a.a(SignalsConfig.class)).getSession().getSigControlList().contains(Integer.valueOf(i10));
    }

    public static final int b() {
        f26502a.getClass();
        La la2 = f26510i;
        if (la2 == null) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        kotlin.jvm.internal.s.h("u-ret", "key");
        return Integer.min((int) ((jCurrentTimeMillis - la2.f25198a.getLong("u-ret", jCurrentTimeMillis)) / com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS), Integer.MAX_VALUE);
    }

    public static void c() {
        if (f26509h.getAndSet(true)) {
            return;
        }
        if (AbstractC3229pj.a().getSessionEnabled()) {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.s.g(string, "toString(...)");
            f26505d = string;
            String TAG = f26504c;
            kotlin.jvm.internal.s.g(TAG, "TAG");
        }
        f26507f = System.currentTimeMillis() - Process.getElapsedCpuTime();
        if (a(5)) {
            La la2 = f26510i;
            if (la2 != null) {
                kotlin.jvm.internal.s.h("cnt", "key");
                la2.a("cnt", Integer.min(la2.f25198a.getInt("cnt", 0) + 1, Integer.MAX_VALUE), false);
            }
            f26511j.a();
        }
        if (a(6)) {
            La la3 = f26510i;
            if (la3 != null) {
                kotlin.jvm.internal.s.h("u-ret", "key");
                if (!la3.f25198a.contains("u-ret")) {
                    la3.a("u-ret", System.currentTimeMillis(), false);
                }
            }
            f26512k.a();
        }
    }

    public static final int a() {
        f26502a.getClass();
        La la2 = f26510i;
        if (la2 == null) {
            return 0;
        }
        kotlin.jvm.internal.s.h("cnt", "key");
        return la2.f25198a.getInt("cnt", 0);
    }

    public static void a(String adtype, Boolean bool) {
        kotlin.jvm.internal.s.h(adtype, "adtype");
        if (kotlin.jvm.internal.s.c(adtype, "banner") && a(1)) {
            List list = f26508g;
            list.set(0, Integer.valueOf(Integer.min(((Number) list.get(0)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (kotlin.jvm.internal.s.c(adtype, "int") && !kotlin.jvm.internal.s.c(bool, Boolean.TRUE) && a(2)) {
            List list2 = f26508g;
            list2.set(1, Integer.valueOf(Integer.min(((Number) list2.get(1)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (kotlin.jvm.internal.s.c(adtype, "native") && a(4)) {
            List list3 = f26508g;
            list3.set(3, Integer.valueOf(Integer.min(((Number) list3.get(3)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (kotlin.jvm.internal.s.c(bool, Boolean.TRUE) && a(3)) {
            List list4 = f26508g;
            list4.set(2, Integer.valueOf(Integer.min(((Number) list4.get(2)).intValue() + 1, Integer.MAX_VALUE)));
        }
    }
}
