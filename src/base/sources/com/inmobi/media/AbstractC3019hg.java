package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.hg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3019hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3433xg f26680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2916dg f26681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3251qf f26682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile EnumC2941eg f26683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f26684e;

    public AbstractC3019hg(C3433xg dao, InterfaceC2916dg interfaceC2916dg, C3251qf networkHandler) {
        kotlin.jvm.internal.s.h(dao, "dao");
        kotlin.jvm.internal.s.h(networkHandler, "networkHandler");
        this.f26680a = dao;
        this.f26681b = interfaceC2916dg;
        this.f26682c = networkHandler;
        this.f26683d = EnumC2941eg.STOPPED;
        this.f26684e = new ConcurrentHashMap();
    }

    public static C2967fg a(Zf zf2, Ve ve2) {
        String str = zf2.f26141a;
        ve2.c();
        ve2.e();
        return new C2967fg(zf2, ve2.c(), ve2.e());
    }

    public abstract fl.g0 b();

    public static AdConfig.PingsV2Config a() {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getPingV2();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        if (r5.invoke(r2, r3) == r4) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.Zf r18, tl.o r19, kotlin.coroutines.jvm.internal.d r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof com.inmobi.media.C2993gg
            if (r3 == 0) goto L19
            r3 = r2
            com.inmobi.media.gg r3 = (com.inmobi.media.C2993gg) r3
            int r4 = r3.f26619e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f26619e = r4
            goto L1e
        L19:
            com.inmobi.media.gg r3 = new com.inmobi.media.gg
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f26617c
            java.lang.Object r4 = ll.b.f()
            int r5 = r3.f26619e
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L4a
            if (r5 == r7) goto L3d
            if (r5 != r6) goto L35
            com.inmobi.media.Zf r1 = r3.f26615a
            fl.s.b(r2)
            goto Lb3
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            tl.o r1 = r3.f26616b
            com.inmobi.media.Zf r5 = r3.f26615a
            fl.s.b(r2)
            r16 = r5
            r5 = r1
            r1 = r16
            goto L9f
        L4a:
            fl.s.b(r2)
            com.inmobi.media.eg r2 = r0.f26683d
            com.inmobi.media.eg r5 = com.inmobi.media.EnumC2941eg.STARTED
            if (r2 != r5) goto Lbd
            java.util.concurrent.ConcurrentHashMap r2 = r0.f26684e
            java.lang.String r5 = r1.f26142b
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L60
            fl.g0 r1 = fl.g0.f38750a
            return r1
        L60:
            java.util.concurrent.ConcurrentHashMap r2 = r0.f26684e
            java.lang.String r5 = r1.f26142b
            java.lang.String r8 = r1.f26141a
            r2.put(r5, r8)
            com.inmobi.media.qf r2 = r0.f26682c
            r3.f26615a = r1
            r5 = r19
            r3.f26616b = r5
            r3.f26619e = r7
            r2.getClass()
            java.util.HashMap r10 = new java.util.HashMap
            java.util.Map r7 = r1.f26143c
            r10.<init>(r7)
            java.lang.String r7 = com.inmobi.media.Xi.c()
            java.lang.String r8 = "User-Agent"
            r10.put(r8, r7)
            com.inmobi.media.Re r8 = new com.inmobi.media.Re
            java.lang.String r9 = r1.f26141a
            boolean r14 = r1.f26144d
            r15 = 28
            r11 = 0
            r12 = 0
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            com.inmobi.media.B9 r2 = r2.f27337a
            com.inmobi.media.B4 r2 = r2.f24525a
            java.lang.Object r2 = r2.a(r8, r3)
            if (r2 != r4) goto L9f
            goto Lb2
        L9f:
            com.inmobi.media.Ve r2 = (com.inmobi.media.Ve) r2
            com.inmobi.media.fg r2 = a(r1, r2)
            r3.f26615a = r1
            r7 = 0
            r3.f26616b = r7
            r3.f26619e = r6
            java.lang.Object r2 = r5.invoke(r2, r3)
            if (r2 != r4) goto Lb3
        Lb2:
            return r4
        Lb3:
            java.util.concurrent.ConcurrentHashMap r2 = r0.f26684e
            java.lang.String r1 = r1.f26142b
            r2.remove(r1)
            fl.g0 r1 = fl.g0.f38750a
            return r1
        Lbd:
            fl.g0 r1 = fl.g0.f38750a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3019hg.a(com.inmobi.media.Zf, tl.o, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        EnumC2941eg enumC2941eg = this.f26683d;
        EnumC2941eg enumC2941eg2 = EnumC2941eg.STARTED;
        EnumC2941eg enumC2941eg3 = EnumC2941eg.STOPPED;
        Objects.toString(enumC2941eg);
        if (this.f26683d == enumC2941eg3) {
            this.f26683d = enumC2941eg2;
            fl.g0 g0VarB = b();
            return g0VarB == ll.b.f() ? g0VarB : fl.g0.f38750a;
        }
        return fl.g0.f38750a;
    }
}
