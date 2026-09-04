package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.al, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2843al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2843al f26226a = new C2843al();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3484zh f26227b = new C3484zh();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f26228c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static em.v0 f26229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C2921dl f26230e;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (a((kl.f) r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.media.Wk
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.Wk r0 = (com.inmobi.media.Wk) r0
            int r1 = r0.f25960c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25960c = r1
            goto L18
        L13:
            com.inmobi.media.Wk r0 = new com.inmobi.media.Wk
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f25958a
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f25960c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            fl.s.b(r7)
            goto L55
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            fl.s.b(r7)
            goto L4c
        L38:
            fl.s.b(r7)
            com.inmobi.media.zh r7 = com.inmobi.media.C2843al.f26227b
            com.inmobi.media.Xk r2 = new com.inmobi.media.Xk
            r5 = 0
            r2.<init>(r5)
            r0.f25960c = r4
            java.lang.Object r7 = com.inmobi.media.J3.a(r7, r2, r0)
            if (r7 != r1) goto L4c
            goto L54
        L4c:
            r0.f25960c = r3
            java.lang.Object r7 = a(r0)
            if (r7 != r1) goto L55
        L54:
            return r1
        L55:
            fl.g0 r7 = fl.g0.f38750a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2843al.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static Object a(kl.f fVar) {
        C3484zh c3484zh = AbstractC3229pj.f27269a;
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
        SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig = ((SignalsConfig) AbstractC2878c4.f26300a.a(SignalsConfig.class)).getUnifiedIdServiceConfig();
        unifiedIdServiceConfig.getUrl();
        Object objA = J3.a(f26227b, new Yk(unifiedIdServiceConfig, null), fVar);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }

    public static Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, kl.f fVar) {
        if (inMobiUnifiedIdInterface != null) {
            kotlin.coroutines.jvm.internal.b.a(f26228c.add(inMobiUnifiedIdInterface));
        }
        if (f26227b.f28021b.get() != null) {
            Objects.toString(inMobiUnifiedIdInterface);
            return fl.g0.f38750a;
        }
        Object objA = a(fVar);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }
}
