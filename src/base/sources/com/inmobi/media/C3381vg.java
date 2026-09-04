package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.vg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3381vg extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3433xg f27725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3381vg(C3433xg c3433xg, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27725b = c3433xg;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27724a = obj;
        this.f27726c |= Integer.MIN_VALUE;
        return this.f27725b.b(null, null, this);
    }
}
