package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Yd extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2836ae f26080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yd(C2836ae c2836ae, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f26080b = c2836ae;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f26079a = obj;
        this.f26081c |= Integer.MIN_VALUE;
        return this.f26080b.a(null, this);
    }
}
