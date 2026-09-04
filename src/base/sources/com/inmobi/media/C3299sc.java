package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.sc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3299sc extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3325tc f27457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C6 f27458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3299sc(C3325tc c3325tc, C6 c10, kl.f fVar) {
        super(2, fVar);
        this.f27457b = c3325tc;
        this.f27458c = c10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3299sc(this.f27457b, this.f27458c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3299sc(this.f27457b, this.f27458c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r1.a(r13, r12) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = ll.b.f()
            int r1 = r12.f27456a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            fl.s.b(r13)
            goto L7a
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            fl.s.b(r13)
            goto L69
        L1e:
            fl.s.b(r13)
            com.inmobi.media.tc r13 = r12.f27457b
            com.inmobi.media.B6 r1 = r13.f27544d
            com.inmobi.media.C6 r4 = r12.f27458c
            r1.getClass()
            java.lang.String r5 = "experienceModel"
            kotlin.jvm.internal.s.h(r4, r5)
            boolean r5 = r4 instanceof com.inmobi.media.Oj
            if (r5 == 0) goto L44
            com.inmobi.media.Nj r6 = new com.inmobi.media.Nj
            android.content.Context r7 = r1.f24519a
            em.o0 r8 = r1.f24520b
            r9 = r4
            com.inmobi.media.Oj r9 = (com.inmobi.media.Oj) r9
            hm.v r10 = r1.f24521c
            com.inmobi.media.u9 r11 = r1.f24522d
            r6.<init>(r7, r8, r9, r10, r11)
            goto L58
        L44:
            boolean r5 = r4 instanceof com.inmobi.media.Gm
            if (r5 == 0) goto L7f
            com.inmobi.media.Fm r6 = new com.inmobi.media.Fm
            android.content.Context r7 = r1.f24519a
            em.o0 r8 = r1.f24520b
            r9 = r4
            com.inmobi.media.Gm r9 = (com.inmobi.media.Gm) r9
            hm.v r10 = r1.f24521c
            com.inmobi.media.u9 r11 = r1.f24522d
            r6.<init>(r7, r8, r9, r10, r11)
        L58:
            r13.f27542b = r6
            com.inmobi.media.tc r13 = r12.f27457b
            com.inmobi.media.k2 r13 = r13.f27542b
            if (r13 == 0) goto L69
            r12.f27456a = r3
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r0) goto L69
            goto L79
        L69:
            com.inmobi.media.tc r13 = r12.f27457b
            com.inmobi.media.k2 r1 = r13.f27542b
            if (r1 == 0) goto L7a
            com.inmobi.media.ads.nativeAd.MediaView r13 = r13.f27543c
            r12.f27456a = r2
            java.lang.Object r13 = r1.a(r13, r12)
            if (r13 != r0) goto L7a
        L79:
            return r0
        L7a:
            com.inmobi.media.tc r13 = r12.f27457b
            com.inmobi.media.ads.nativeAd.MediaView r13 = r13.f27543c
            return r13
        L7f:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3299sc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
