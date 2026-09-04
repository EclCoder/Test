package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Dd extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ed f24651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dd(Ed ed2, kl.f fVar) {
        super(fVar);
        this.f24651c = ed2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f24649a = obj;
        this.f24650b |= Integer.MIN_VALUE;
        return this.f24651c.emit(null, this);
    }
}
