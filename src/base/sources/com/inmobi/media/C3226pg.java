package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.pg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3226pg extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3252qg f27206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3226pg(AbstractC3252qg abstractC3252qg, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27206c = abstractC3252qg;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27205b = obj;
        this.f27207d |= Integer.MIN_VALUE;
        return this.f27206c.a((String) null, this);
    }
}
