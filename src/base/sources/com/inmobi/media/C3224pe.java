package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.pe, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3224pe extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Be f27201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3224pe(Be be2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27201b = be2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27200a = obj;
        this.f27202c |= Integer.MIN_VALUE;
        return this.f27201b.a(this);
    }
}
