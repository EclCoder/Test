package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class X2 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z2 f25993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2(Z2 z10, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f25993b = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25992a = obj;
        this.f25994c |= Integer.MIN_VALUE;
        return this.f25993b.a(this);
    }
}
