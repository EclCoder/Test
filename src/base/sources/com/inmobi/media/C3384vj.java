package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.vj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3384vj extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC3332tj f27736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3332tj f27737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nm.a f27738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC3410wj f27740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27741f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3384vj(AbstractC3410wj abstractC3410wj, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27740e = abstractC3410wj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27739d = obj;
        this.f27741f |= Integer.MIN_VALUE;
        return this.f27740e.a(null, null, this);
    }
}
