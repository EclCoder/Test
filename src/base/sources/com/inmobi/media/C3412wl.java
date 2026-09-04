package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.wl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3412wl extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f27806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.jvm.internal.m f27807c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3412wl(long j10, kl.f fVar, Function1 function1) {
        super(2, fVar);
        this.f27806b = j10;
        this.f27807c = (kotlin.coroutines.jvm.internal.m) function1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.m, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3412wl(this.f27806b, fVar, this.f27807c);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.m, kotlin.jvm.functions.Function1] */
    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3412wl(this.f27806b, (kl.f) obj2, this.f27807c).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r7.invoke(r6) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.coroutines.jvm.internal.m, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = ll.b.f()
            int r1 = r6.f27805a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            fl.s.b(r7)
            goto L37
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            fl.s.b(r7)
            goto L2c
        L1e:
            fl.s.b(r7)
            long r4 = r6.f27806b
            r6.f27805a = r3
            java.lang.Object r7 = em.y0.a(r4, r6)
            if (r7 != r0) goto L2c
            goto L36
        L2c:
            kotlin.coroutines.jvm.internal.m r7 = r6.f27807c
            r6.f27805a = r2
            java.lang.Object r7 = r7.invoke(r6)
            if (r7 != r0) goto L37
        L36:
            return r0
        L37:
            fl.g0 r7 = fl.g0.f38750a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3412wl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
