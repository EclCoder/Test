package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.tk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3333tk extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3359uk f27572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3333tk(C3359uk c3359uk, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27572b = c3359uk;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27571a = obj;
        this.f27573c |= Integer.MIN_VALUE;
        return this.f27572b.b(0, this);
    }
}
