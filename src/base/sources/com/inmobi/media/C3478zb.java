package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.zb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3478zb extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fb f28008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3478zb(Fb fb2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f28008b = fb2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28007a = obj;
        this.f28009c |= Integer.MIN_VALUE;
        return this.f28008b.a(0L, 0, this);
    }
}
