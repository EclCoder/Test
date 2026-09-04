package com.inmobi.media;

import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.inmobi.media.AbstractC3267r6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.r6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3267r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fl.k f27377a = fl.l.b(new tl.a() { // from class: yh.jb
        @Override // tl.a
        public final Object invoke() {
            return AbstractC3267r6.a();
        }
    });

    public static final em.o0 a() {
        kotlin.jvm.internal.s.g("r6", dOIDCKnIR.fRn);
        kotlin.jvm.internal.s.h("r6", "name");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new I9("r6", false));
        kotlin.jvm.internal.s.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return em.p0.a(em.r1.b(executorServiceNewSingleThreadExecutor));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0090  */
    public static void a(C3035i6 eventPayload, String url, int i10, int i11, long j10, Rk rk2, C3216p6 c3216p6, boolean z10) {
        long jPow;
        kotlin.jvm.internal.s.g("r6", "TAG");
        if (Ze.a() != null || !Xi.f26024d.get()) {
            kotlin.jvm.internal.s.g("r6", "TAG");
            c3216p6.getClass();
            kotlin.jvm.internal.s.h(eventPayload, "eventPayload");
            String TAG = c3216p6.f27172e;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            em.j.b(null, new C3112l6(eventPayload, false, c3216p6, null), 1, null);
            c3216p6.a(System.currentTimeMillis());
            if (c3216p6.f27171d != null) {
                ArrayList eventIds = eventPayload.f26725a;
                kotlin.jvm.internal.s.h(eventIds, "eventIds");
                Integer num = AbstractC3307sk.f27478c;
                if (num != null && eventIds.contains(Integer.valueOf(num.intValue()))) {
                    AbstractC3307sk.f27478c = null;
                }
            }
            c3216p6.f27173f.set(false);
            return;
        }
        if (url != null) {
            String payload = eventPayload.f26726b;
            int i12 = i10 - i11;
            kotlin.jvm.internal.s.h(url, "url");
            kotlin.jvm.internal.s.h(payload, "payload");
            kotlin.jvm.internal.s.h(url, "url");
            kotlin.jvm.internal.s.h(url, "url");
            HashMap mapJ = gl.l0.j(fl.w.a("payload", payload));
            kotlin.jvm.internal.s.h(mapJ, "<this>");
            JSONObject jSONObjectB = AbstractC2829a7.b();
            if (jSONObjectB != null) {
                String string = jSONObjectB.toString();
                kotlin.jvm.internal.s.g(string, "toString(...)");
                mapJ.put("consentObject", string);
            }
            Te te2 = new Te(url, i12 > 0 ? gl.l0.f(fl.w.a("X-im-retry-count", String.valueOf(i12))) : null, null, new C2881c7(mapJ, 0), null, 52);
            if (z10) {
                if (i11 != i10) {
                    jPow = ((long) Math.pow(2.0d, i12)) * j10;
                } else {
                    jPow = 0;
                }
            } else if (i11 != i10) {
                jPow = j10;
            } else {
                jPow = 0;
            }
            em.k.d((em.o0) f27377a.getValue(), null, null, new C3242q6(jPow, te2, i11, eventPayload, url, i10, j10, rk2, c3216p6, z10, null), 3, null);
        }
    }
}
