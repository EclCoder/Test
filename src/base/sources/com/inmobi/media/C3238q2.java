package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.q2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3238q2 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nm.a f27302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3315t2 f27304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3238q2(AbstractC3315t2 abstractC3315t2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27304c = abstractC3315t2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27303b = obj;
        this.f27305d |= Integer.MIN_VALUE;
        return AbstractC3315t2.b(this.f27304c, this);
    }
}
