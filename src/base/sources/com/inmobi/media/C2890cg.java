package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.cg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2890cg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static J8 f26334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C3318t5 f26335c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2890cg f26333a = new C2890cg();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f26336d = new AtomicBoolean(false);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00da, code lost:
    
        if (r7 == r1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r7) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2890cg.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (r7 == r1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.media.C2864bg
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.bg r0 = (com.inmobi.media.C2864bg) r0
            int r1 = r0.f26264c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26264c = r1
            goto L18
        L13:
            com.inmobi.media.bg r0 = new com.inmobi.media.bg
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f26262a
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f26264c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            fl.s.b(r7)
            goto Lae
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            fl.s.b(r7)
            goto L76
        L39:
            fl.s.b(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = com.inmobi.media.C2890cg.f26336d
            r2 = 0
            boolean r7 = r7.compareAndSet(r4, r2)
            if (r7 == 0) goto Lb1
            com.inmobi.media.J8 r7 = com.inmobi.media.C2890cg.f26334b
            if (r7 == 0) goto L76
            r0.f26264c = r4
            com.inmobi.media.q7 r7 = r7.f25052d
            r7.getClass()
            com.inmobi.media.eg r2 = com.inmobi.media.EnumC2941eg.STOPPED
            com.inmobi.media.eg r4 = r7.f26683d
            com.inmobi.media.eg r5 = com.inmobi.media.EnumC2941eg.STARTED
            if (r4 != r5) goto L68
            r7.f26683d = r2
            java.lang.Object r7 = r7.e(r0)
            java.lang.Object r2 = ll.b.f()
            if (r7 != r2) goto L65
            goto L6a
        L65:
            fl.g0 r7 = fl.g0.f38750a
            goto L6a
        L68:
            fl.g0 r7 = fl.g0.f38750a
        L6a:
            java.lang.Object r2 = ll.b.f()
            if (r7 != r2) goto L71
            goto L73
        L71:
            fl.g0 r7 = fl.g0.f38750a
        L73:
            if (r7 != r1) goto L76
            goto Lad
        L76:
            com.inmobi.media.t5 r7 = com.inmobi.media.C2890cg.f26335c
            if (r7 == 0) goto Lb1
            r0.f26264c = r3
            java.lang.String r2 = "t5"
            java.lang.String r3 = "TAG"
            kotlin.jvm.internal.s.g(r2, r3)
            com.inmobi.media.kf r7 = r7.f27512d
            r7.getClass()
            com.inmobi.media.eg r2 = com.inmobi.media.EnumC2941eg.STOPPED
            com.inmobi.media.eg r3 = r7.f26683d
            com.inmobi.media.eg r4 = com.inmobi.media.EnumC2941eg.STARTED
            if (r3 != r4) goto La0
            r7.f26683d = r2
            java.lang.Object r7 = r7.d(r0)
            java.lang.Object r0 = ll.b.f()
            if (r7 != r0) goto L9d
            goto La2
        L9d:
            fl.g0 r7 = fl.g0.f38750a
            goto La2
        La0:
            fl.g0 r7 = fl.g0.f38750a
        La2:
            java.lang.Object r0 = ll.b.f()
            if (r7 != r0) goto La9
            goto Lab
        La9:
            fl.g0 r7 = fl.g0.f38750a
        Lab:
            if (r7 != r1) goto Lae
        Lad:
            return r1
        Lae:
            fl.g0 r7 = fl.g0.f38750a
            return r7
        Lb1:
            fl.g0 r7 = fl.g0.f38750a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2890cg.b(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
