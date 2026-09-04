package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class P0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function1 f25448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ R0 f25450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(R0 r10, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f25450c = r10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25449b = obj;
        this.f25451d |= Integer.MIN_VALUE;
        return this.f25450c.a((Function1) null, this);
    }
}
