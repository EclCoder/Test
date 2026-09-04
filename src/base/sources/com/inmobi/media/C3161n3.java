package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.n3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3161n3 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V2 f27026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3187o3 f27028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27029d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3161n3(C3187o3 c3187o3, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27028c = c3187o3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27027b = obj;
        this.f27029d |= Integer.MIN_VALUE;
        return this.f27028c.a(null, this);
    }
}
