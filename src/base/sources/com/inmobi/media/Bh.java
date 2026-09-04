package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Bh extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC3317t4 f24549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ch f24551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bh(Ch ch2, kl.f fVar) {
        super(fVar);
        this.f24551c = ch2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f24550b = obj;
        this.f24552d |= Integer.MIN_VALUE;
        return this.f24551c.emit(null, this);
    }
}
