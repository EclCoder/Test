package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class G8 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Zf f24843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J8 f24845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G8(J8 j10, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f24845c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f24844b = obj;
        this.f24846d |= Integer.MIN_VALUE;
        return this.f24845c.a((Zf) null, this);
    }
}
