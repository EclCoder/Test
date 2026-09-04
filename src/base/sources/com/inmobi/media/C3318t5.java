package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.t5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3318t5 extends AbstractC3252qg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3095kf f27512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3318t5(C3433xg dao) {
        super(dao);
        kotlin.jvm.internal.s.h(dao, "dao");
        this.f27512d = new C3095kf(dao, new C3266r5(this), this.f27340c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r13.a(r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.Zf r13, kotlin.coroutines.jvm.internal.d r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.inmobi.media.C3292s5
            if (r0 == 0) goto L13
            r0 = r14
            com.inmobi.media.s5 r0 = (com.inmobi.media.C3292s5) r0
            int r1 = r0.f27435d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27435d = r1
            goto L18
        L13:
            com.inmobi.media.s5 r0 = new com.inmobi.media.s5
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f27433b
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f27435d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            fl.s.b(r14)
            goto Lb2
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            fl.s.b(r14)
            goto La7
        L3c:
            com.inmobi.media.Zf r13 = r0.f27432a
            fl.s.b(r14)
        L41:
            r8 = r13
            goto L5c
        L43:
            fl.s.b(r14)
            java.lang.String r14 = "t5"
            java.lang.String r2 = "TAG"
            kotlin.jvm.internal.s.g(r14, r2)
            java.lang.String r14 = r13.f26142b
            java.lang.String r14 = r13.f26145e
            r0.f27432a = r13
            r0.f27435d = r5
            java.lang.Object r14 = r12.a(r14, r0)
            if (r14 != r1) goto L41
            goto Lb1
        L5c:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r13 = r14.booleanValue()
            r14 = 0
            if (r13 != 0) goto L88
            java.util.concurrent.ConcurrentHashMap r13 = r12.f27339b
            java.lang.String r0 = r8.f26148h
            java.lang.Object r13 = r13.get(r0)
            java.lang.ref.WeakReference r13 = (java.lang.ref.WeakReference) r13
            if (r13 == 0) goto L78
            java.lang.Object r13 = r13.get()
            r14 = r13
            com.inmobi.media.ng r14 = (com.inmobi.media.InterfaceC3174ng) r14
        L78:
            r11 = r14
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "Database capacity exceeded for pings"
            r7 = 2248(0x8c8, float:3.15E-42)
            r5 = 0
            com.inmobi.media.AbstractC3252qg.a(r5, r6, r7, r8, r9, r11)
            fl.g0 r13 = fl.g0.f38750a
            return r13
        L88:
            com.inmobi.media.xg r13 = r12.f27338a
            r0.f27432a = r14
            r0.f27435d = r4
            com.inmobi.media.n9 r13 = r13.f27857a
            android.content.ContentValues r14 = com.inmobi.media.AbstractC3458yg.a(r8)
            r2 = 4
            java.lang.String r4 = "pings"
            java.lang.Object r13 = r13.a(r4, r14, r2, r0)
            java.lang.Object r14 = ll.b.f()
            if (r13 != r14) goto La2
            goto La4
        La2:
            fl.g0 r13 = fl.g0.f38750a
        La4:
            if (r13 != r1) goto La7
            goto Lb1
        La7:
            com.inmobi.media.kf r13 = r12.f27512d
            r0.f27435d = r3
            java.lang.Object r13 = r13.a(r0)
            if (r13 != r1) goto Lb2
        Lb1:
            return r1
        Lb2:
            fl.g0 r13 = fl.g0.f38750a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3318t5.a(com.inmobi.media.Zf, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
