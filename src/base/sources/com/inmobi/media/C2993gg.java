package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.gg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2993gg extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Zf f26615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tl.o f26616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC3019hg f26618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26619e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2993gg(AbstractC3019hg abstractC3019hg, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f26618d = abstractC3019hg;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f26617c = obj;
        this.f26619e |= Integer.MIN_VALUE;
        return this.f26618d.a(null, null, this);
    }
}
