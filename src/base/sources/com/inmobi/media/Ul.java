package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ul extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f25853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wl f25855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ul(Wl wl2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f25855c = wl2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25854b = obj;
        this.f25856d |= Integer.MIN_VALUE;
        return Wl.c(this.f25855c, null, this);
    }
}
