package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.um, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3361um extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Fm f27643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fm f27645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3361um(Fm fm2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27645c = fm2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27644b = obj;
        this.f27646d |= Integer.MIN_VALUE;
        return this.f27645c.b(this);
    }
}
