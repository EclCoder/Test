package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.jf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3069jf extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nm.a f26816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3095kf f26818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3069jf(C3095kf c3095kf, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f26818c = c3095kf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f26817b = obj;
        this.f26819d |= Integer.MIN_VALUE;
        return this.f26818c.d(this);
    }
}
