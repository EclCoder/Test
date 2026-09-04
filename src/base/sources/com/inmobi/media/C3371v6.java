package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.v6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3371v6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3448y6 f27686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3371v6(C3448y6 c3448y6, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27686c = c3448y6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27685b = obj;
        this.f27687d |= Integer.MIN_VALUE;
        return C3448y6.a(this.f27686c, this);
    }
}
