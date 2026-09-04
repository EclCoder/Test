package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Pb extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3453yb f25474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3453yb f25475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Rb f25477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25478f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pb(Rb rb2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f25477e = rb2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25476d = obj;
        this.f25478f |= Integer.MIN_VALUE;
        return this.f25477e.b(null, null, this);
    }
}
