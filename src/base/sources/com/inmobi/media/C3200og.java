package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.og, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3200og extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2967fg f27137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3174ng f27138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Zf f27139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC3252qg f27141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27142f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3200og(AbstractC3252qg abstractC3252qg, kl.f fVar) {
        super(fVar);
        this.f27141e = abstractC3252qg;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27140d = obj;
        this.f27142f |= Integer.MIN_VALUE;
        return this.f27141e.a(null, null, this);
    }
}
