package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ra extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sa f25626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X9 f25627c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ra(Sa sa2, X9 x10, kl.f fVar) {
        super(1, fVar);
        this.f25626b = sa2;
        this.f25627c = x10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new Ra(this.f25626b, this.f25627c, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Ra(this.f25626b, this.f25627c, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (com.inmobi.media.Sa.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (com.inmobi.media.Sa.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (com.inmobi.media.Sa.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ra.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
