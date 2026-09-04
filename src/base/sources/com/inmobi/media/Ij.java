package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ij extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Nj f25026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ij(Nj nj2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f25026b = nj2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25025a = obj;
        this.f25027c |= Integer.MIN_VALUE;
        return this.f25026b.a(this);
    }
}
