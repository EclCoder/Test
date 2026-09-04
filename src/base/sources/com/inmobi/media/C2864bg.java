package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.bg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2864bg extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2890cg f26263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2864bg(C2890cg c2890cg, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f26263b = c2890cg;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f26262a = obj;
        this.f26264c |= Integer.MIN_VALUE;
        return this.f26263b.b(this);
    }
}
