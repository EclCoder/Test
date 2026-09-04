package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.vn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3388vn extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3414wn f27748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3388vn(C3414wn c3414wn, kl.f fVar) {
        super(2, fVar);
        this.f27748c = c3414wn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C3388vn c3388vn = new C3388vn(this.f27748c, fVar);
        c3388vn.f27747b = obj;
        return c3388vn;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        C3388vn c3388vn = new C3388vn(this.f27748c, (kl.f) obj2);
        c3388vn.f27747b = (em.o0) obj;
        return c3388vn.invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030 A[PHI: r1
      0x0030: PHI (r1v5 em.o0) = (r1v2 em.o0), (r1v4 em.o0), (r1v9 em.o0) binds: [B:14:0x0028, B:22:0x0052, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0036 A[Catch: IllegalStateException -> 0x0026, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x0026, blocks: (B:17:0x0036, B:10:0x0022), top: B:26:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0046 A[PHI: r1
      0x0046: PHI (r1v4 em.o0) = (r1v3 em.o0), (r1v5 em.o0), (r1v7 em.o0) binds: [B:20:0x0043, B:18:0x0040, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0052 -> B:15:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = ll.b.f()
            int r1 = r6.f27746a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L28
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r6.f27747b
            em.o0 r1 = (em.o0) r1
            fl.s.b(r7)
            goto L30
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            java.lang.Object r1 = r6.f27747b
            em.o0 r1 = (em.o0) r1
            fl.s.b(r7)     // Catch: java.lang.IllegalStateException -> L26
            goto L46
        L26:
            r7 = move-exception
            goto L43
        L28:
            fl.s.b(r7)
            java.lang.Object r7 = r6.f27747b
            r1 = r7
            em.o0 r1 = (em.o0) r1
        L30:
            boolean r7 = em.p0.f(r1)
            if (r7 == 0) goto L55
            com.inmobi.media.wn r7 = r6.f27748c     // Catch: java.lang.IllegalStateException -> L26
            r6.f27747b = r1     // Catch: java.lang.IllegalStateException -> L26
            r6.f27746a = r3     // Catch: java.lang.IllegalStateException -> L26
            java.lang.Object r7 = com.inmobi.media.C3414wn.a(r7, r6)     // Catch: java.lang.IllegalStateException -> L26
            if (r7 != r0) goto L46
            goto L54
        L43:
            r7.toString()
        L46:
            com.inmobi.media.wn r7 = r6.f27748c
            long r4 = r7.f27814c
            r6.f27747b = r1
            r6.f27746a = r2
            java.lang.Object r7 = em.y0.a(r4, r6)
            if (r7 != r0) goto L30
        L54:
            return r0
        L55:
            fl.g0 r7 = fl.g0.f38750a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3388vn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
