package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.k4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3084k4 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3136m4 f26837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26838c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3084k4(C3136m4 c3136m4, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f26837b = c3136m4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f26836a = obj;
        this.f26838c |= Integer.MIN_VALUE;
        return this.f26837b.b(this);
    }
}
