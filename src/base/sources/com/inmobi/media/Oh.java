package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Oh extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f25424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Fb f25425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ph f25427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f25428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f25429f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oh(Ph ph2, long j10, boolean z10, kl.f fVar) {
        super(2, fVar);
        this.f25427d = ph2;
        this.f25428e = j10;
        this.f25429f = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Oh(this.f25427d, this.f25428e, this.f25429f, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Oh) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (r2.b(r7, r17) == r1) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f25426c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L36
            if (r2 == r5) goto L2a
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            java.lang.Object r1 = r0.f25424a
            com.inmobi.media.Fb r1 = (com.inmobi.media.Fb) r1
            fl.s.b(r18)
            r8 = r1
            goto L89
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            fl.s.b(r18)
            goto Lbf
        L2a:
            com.inmobi.media.Fb r2 = r0.f25425b
            java.lang.Object r7 = r0.f25424a
            com.inmobi.media.yb r7 = (com.inmobi.media.C3453yb) r7
            fl.s.b(r18)
            r8 = r18
            goto L66
        L36:
            fl.s.b(r18)
            com.inmobi.media.Ph r2 = r0.f25427d
            long r9 = r0.f25428e
            boolean r14 = r0.f25429f
            java.lang.String r8 = r2.f25503j
            java.util.concurrent.atomic.AtomicInteger r2 = r2.f25504k
            int r15 = r2.get()
            com.inmobi.media.yb r7 = new com.inmobi.media.yb
            r12 = 0
            r16 = 12
            r11 = 0
            r7.<init>(r8, r9, r11, r12, r14, r15, r16)
            fl.k r2 = com.inmobi.media.Gb.f24849a
            java.lang.Object r2 = r2.getValue()
            com.inmobi.media.Fb r2 = (com.inmobi.media.Fb) r2
            r0.f25424a = r7
            r0.f25425b = r2
            r0.f25426c = r5
            java.lang.Object r8 = r2.b(r8, r0)
            if (r8 != r1) goto L66
            goto L87
        L66:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7b
            r0.f25424a = r6
            r0.f25425b = r6
            r0.f25426c = r4
            java.lang.Object r2 = r2.b(r7, r0)
            if (r2 != r1) goto Lbf
            goto L87
        L7b:
            r0.f25424a = r2
            r0.f25425b = r6
            r0.f25426c = r3
            java.lang.Object r3 = r2.a(r7, r0)
            if (r3 != r1) goto L88
        L87:
            return r1
        L88:
            r8 = r2
        L89:
            em.o0 r1 = com.inmobi.media.AbstractC2834ac.f26174a
            long r1 = r0.f25428e
            com.inmobi.media.Ph r3 = r0.f25427d
            long r9 = r3.f25495b
            long r9 = r1 - r9
            int r11 = r3.f25496c
            java.lang.String r1 = "dao"
            kotlin.jvm.internal.s.h(r8, r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = com.inmobi.media.AbstractC2834ac.f26176c
            boolean r1 = r1.getAndSet(r5)
            if (r1 != 0) goto Lbf
            com.inmobi.media.Yb r7 = new com.inmobi.media.Yb
            r12 = 0
            r7.<init>(r8, r9, r11, r12)
            em.o0 r1 = com.inmobi.media.AbstractC3488zl.f28033a
            java.lang.String r1 = "runnable"
            kotlin.jvm.internal.s.h(r7, r1)
            em.o0 r8 = com.inmobi.media.AbstractC3488zl.f28033a
            com.inmobi.media.wl r11 = new com.inmobi.media.wl
            r1 = 10000(0x2710, double:4.9407E-320)
            r11.<init>(r1, r6, r7)
            r12 = 3
            r13 = 0
            r9 = 0
            r10 = 0
            em.i.d(r8, r9, r10, r11, r12, r13)
        Lbf:
            fl.g0 r1 = fl.g0.f38750a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Oh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
