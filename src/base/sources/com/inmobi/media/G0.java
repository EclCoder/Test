package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class G0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H0 f24826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(H0 h10, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f24826b = h10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f24825a = obj;
        this.f24827c |= Integer.MIN_VALUE;
        return this.f24826b.a(null, this);
    }
}
