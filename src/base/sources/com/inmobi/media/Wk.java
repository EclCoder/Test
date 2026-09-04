package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Wk extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2843al f25959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25960c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wk(C2843al c2843al, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f25959b = c2843al;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25958a = obj;
        this.f25960c |= Integer.MIN_VALUE;
        return this.f25959b.a((kotlin.coroutines.jvm.internal.d) this);
    }
}
