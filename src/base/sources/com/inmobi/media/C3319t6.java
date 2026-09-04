package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.t6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3319t6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3448y6 f27517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27518f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3319t6(C3448y6 c3448y6, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27517e = c3448y6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27516d = obj;
        this.f27518f |= Integer.MIN_VALUE;
        return this.f27517e.a(0, this);
    }
}
