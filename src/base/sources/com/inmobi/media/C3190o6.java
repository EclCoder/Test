package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.o6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3190o6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f27120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f27121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3216p6 f27123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27124e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3190o6(C3216p6 c3216p6, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27123d = c3216p6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27122c = obj;
        this.f27124e |= Integer.MIN_VALUE;
        return this.f27123d.a(0L, 0L, this);
    }
}
