package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.il, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3049il extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26758b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3049il(boolean z10, kl.f fVar) {
        super(1, fVar);
        this.f26758b = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3049il(this.f26758b, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3049il(this.f26758b, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r5.b(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (com.inmobi.media.C3231pl.a(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return r0;
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
            int r1 = r4.f26757a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            fl.s.b(r5)
            goto L36
        L1b:
            fl.s.b(r5)
            boolean r5 = r4.f26758b
            if (r5 == 0) goto L2d
            com.inmobi.media.pl r5 = com.inmobi.media.C3231pl.f27278a
            r4.f26757a = r3
            java.lang.Object r5 = r5.b(r4)
            if (r5 != r0) goto L36
            goto L35
        L2d:
            r4.f26757a = r2
            java.lang.Object r5 = com.inmobi.media.C3231pl.a(r4)
            if (r5 != r0) goto L36
        L35:
            return r0
        L36:
            fl.g0 r5 = fl.g0.f38750a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3049il.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
