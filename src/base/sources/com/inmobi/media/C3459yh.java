package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.yh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3459yh extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f27954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3484zh f27956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3459yh(C3484zh c3484zh, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27956c = c3484zh;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27955b = obj;
        this.f27957d |= Integer.MIN_VALUE;
        return this.f27956c.a(null, this);
    }
}
