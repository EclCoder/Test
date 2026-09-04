package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Bj extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Tj f24556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ej f24558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bj(Ej ej2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f24558d = ej2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f24557c = obj;
        this.f24559e |= Integer.MIN_VALUE;
        return Ej.a(this.f24558d, null, null, this);
    }
}
