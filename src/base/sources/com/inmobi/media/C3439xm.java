package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.xm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3439xm extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3464ym f27879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3439xm(C3464ym c3464ym, kl.f fVar) {
        super(fVar);
        this.f27879c = c3464ym;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27877a = obj;
        this.f27878b |= Integer.MIN_VALUE;
        return this.f27879c.emit(null, this);
    }
}
