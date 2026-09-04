package com.inmobi.media;

import android.content.Context;

/* JADX INFO: renamed from: com.inmobi.media.nl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3179nl extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f27075b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3179nl(Context context, kl.f fVar) {
        super(2, fVar);
        this.f27075b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3179nl(this.f27075b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3179nl(this.f27075b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01ae  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (com.inmobi.media.C3178nk.b(r18) == r1) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3179nl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
