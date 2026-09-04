package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.W9;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class W9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fl.k f25935a = fl.l.b(new tl.a() { // from class: yh.o5
        @Override // tl.a
        public final Object invoke() {
            return W9.b();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V9 f25936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3447y5 f25937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Sa f25938d;

    static {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f25936b = new V9();
        f25938d = new Sa(a());
        Context context = Xi.f26021a;
        if (context != null) {
            f25937c = new C3447y5(context, a(), (Fc) Xi.f26025e.getValue());
        }
        if (a().getCrashConfig().getReportSessionInfo()) {
            Z4 type = Z4.f26113d;
            kotlin.jvm.internal.s.h(type, "type");
            La laA = Z9.a();
            if (laA != null) {
                laA.a(type.f26245a, jCurrentTimeMillis, true);
            }
            La laA2 = Z9.a();
            if (laA2 != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                laA2.a("s-cnt", 0, false);
            }
        }
        if (AbstractC3225pf.f27203a.getCrashConfig().getReportOOMInfo()) {
            for (AbstractC2853b5 type2 : gl.r.o(C2827a5.f26168d, Y4.f26057d)) {
                kotlin.jvm.internal.s.h(type2, "type");
                La laA3 = Z9.a();
                if (laA3 != null) {
                    laA3.a(type2.f26245a, jCurrentTimeMillis, true);
                }
            }
        }
    }

    public static CrashConfig a() {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(CrashConfig.class, "clazz");
        return (CrashConfig) AbstractC2878c4.f26300a.a(CrashConfig.class);
    }

    public static final U9 b() {
        return new U9(AbstractC3193o9.b());
    }

    public static void c() {
        La laA;
        if (a().getCrashConfig().getReportSessionInfo() && (laA = Z9.a()) != null) {
            kotlin.jvm.internal.s.h("s-cnt", "key");
            laA.a("s-cnt", laA.f25198a.getInt("s-cnt", 0) + 1, false);
        }
        C3447y5 c3447y5 = f25937c;
        if (c3447y5 != null) {
            Iterator it = c3447y5.f27910c.iterator();
            while (it.hasNext()) {
                ((AbstractC3422x5) it.next()).a();
            }
        }
        Sa sa2 = f25938d;
        sa2.getClass();
        AbstractC3488zl.a(new Pa(sa2, null));
        ((Fc) Xi.f26025e.getValue()).a(new int[]{2, 1, 152, 150, 151}, sa2.f25684d);
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        AbstractC2878c4.a("crashReporting", f25936b);
    }

    public static void a(M2 incident) {
        kotlin.jvm.internal.s.h(incident, "event");
        Sa sa2 = f25938d;
        sa2.getClass();
        kotlin.jvm.internal.s.h(incident, "incident");
        if (sa2.f25681a.getCatchConfig().getEnabled() && sa2.f25683c.f26072b.a()) {
            AbstractC3488zl.a(new Oa(sa2, incident, null));
        }
    }

    public static void a(JSONObject payload, boolean z10, long j10) throws JSONException {
        kotlin.jvm.internal.s.h(payload, "payload");
        if (a().getCrashConfig().getReportSessionInfo() && z10) {
            Z4 crashType = Z4.f26113d;
            kotlin.jvm.internal.s.h(crashType, "crashType");
            La laA = Z9.a();
            long j11 = 0;
            if (laA != null) {
                String key = crashType.f26245a;
                kotlin.jvm.internal.s.h(key, "key");
                long j12 = laA.f25198a.getLong(key, 0L);
                String str = crashType.f26246b;
                if (j12 == 0) {
                    laA.a(str, j10, true);
                } else {
                    laA.a(str, j10 - j12, true);
                }
            }
            kotlin.jvm.internal.s.h(crashType, "crashType");
            La laA2 = Z9.a();
            if (laA2 != null) {
                String key2 = crashType.f26246b;
                kotlin.jvm.internal.s.h(key2, "key");
                j11 = laA2.f25198a.getLong(key2, 0L);
            }
            payload.put("crashFreeSessionLength", j11);
            La laA3 = Z9.a();
            int i10 = 0;
            if (laA3 != null) {
                kotlin.jvm.internal.s.h("s-cnt", "key");
                i10 = laA3.f25198a.getInt("s-cnt", 0);
            }
            payload.put("crashFreeSessionCount", i10);
        }
    }
}
