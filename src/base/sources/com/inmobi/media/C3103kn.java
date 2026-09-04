package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.kn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3103kn extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3129ln f26874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3103kn(C3129ln c3129ln, kl.f fVar) {
        super(fVar);
        this.f26874c = c3129ln;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f26872a = obj;
        this.f26873b |= Integer.MIN_VALUE;
        return this.f26874c.emit(null, this);
    }
}
