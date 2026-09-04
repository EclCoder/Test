package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.jk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3074jk extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3385vk f26822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3178nk f26825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26826e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3074jk(C3178nk c3178nk, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f26825d = c3178nk;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f26824c = obj;
        this.f26826e |= Integer.MIN_VALUE;
        return this.f26825d.a(null, this);
    }
}
