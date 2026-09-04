package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Fj extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Gj f24797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24798c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fj(Gj gj2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f24797b = gj2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f24796a = obj;
        this.f24798c |= Integer.MIN_VALUE;
        return this.f24797b.a(this);
    }
}
