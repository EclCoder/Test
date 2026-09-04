package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Rn extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sn f25661b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rn(Sn sn2, kl.f fVar) {
        super(2, fVar);
        this.f25661b = sn2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Rn(this.f25661b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Rn(this.f25661b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = ll.b.f()
            int r1 = r6.f25660a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            fl.s.b(r7)
            goto L44
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            fl.s.b(r7)
            goto L31
        L1e:
            fl.s.b(r7)
            com.inmobi.media.Sn r7 = r6.f25661b
            com.inmobi.media.Un r7 = r7.f25717b
            int r7 = r7.f25859b
            long r4 = (long) r7
            r6.f25660a = r3
            java.lang.Object r7 = em.y0.a(r4, r6)
            if (r7 != r0) goto L31
            goto L43
        L31:
            com.inmobi.media.Sn r7 = r6.f25661b
            com.inmobi.media.Tn r1 = r7.f25719d
            r1.f25774b = r3
            hm.v r7 = r7.f25718c
            fl.g0 r1 = fl.g0.f38750a
            r6.f25660a = r2
            java.lang.Object r7 = r7.emit(r1, r6)
            if (r7 != r0) goto L44
        L43:
            return r0
        L44:
            fl.g0 r7 = fl.g0.f38750a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Rn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
