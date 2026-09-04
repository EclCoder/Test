package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ff extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Gf f24778b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ff(Gf gf2, kl.f fVar) {
        super(2, fVar);
        this.f24778b = gf2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Ff(this.f24778b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Ff(this.f24778b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r5.a(r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = ll.b.f()
            int r1 = r4.f24777a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            fl.s.b(r5)
            goto L37
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            fl.s.b(r5)
            goto L2c
        L1e:
            fl.s.b(r5)
            com.inmobi.media.Gf r5 = r4.f24778b
            r4.f24777a = r3
            java.lang.Object r5 = com.inmobi.media.Gf.a(r5, r4)
            if (r5 != r0) goto L2c
            goto L36
        L2c:
            com.inmobi.media.xf r5 = com.inmobi.media.C3432xf.f27854a
            r4.f24777a = r2
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L37
        L36:
            return r0
        L37:
            fl.g0 r5 = fl.g0.f38750a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ff.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
