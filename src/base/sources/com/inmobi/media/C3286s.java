package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3286s extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3390w f27421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3286s(C3390w c3390w, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27421b = c3390w;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27420a = obj;
        this.f27422c |= Integer.MIN_VALUE;
        return C3390w.a(this.f27421b, null, null, 0, this);
    }
}
