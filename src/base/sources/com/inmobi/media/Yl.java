package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Yl extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public El f26093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Zl f26095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yl(Zl zl2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f26095c = zl2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f26094b = obj;
        this.f26096d |= Integer.MIN_VALUE;
        return this.f26095c.a(null, null, null, this);
    }
}
