package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.k6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3086k6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f26840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3216p6 f26842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26843d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3086k6(C3216p6 c3216p6, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f26842c = c3216p6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f26841b = obj;
        this.f26843d |= Integer.MIN_VALUE;
        return this.f26842c.a(0L, this);
    }
}
