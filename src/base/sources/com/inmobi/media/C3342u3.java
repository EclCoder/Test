package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.u3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3342u3 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V2 f27588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2822a0 f27589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3322t9 f27590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A3 f27592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27593f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3342u3(A3 a10, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27592e = a10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27591d = obj;
        this.f27593f |= Integer.MIN_VALUE;
        return this.f27592e.a(null, null, null, this);
    }
}
