package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.i7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3036i7 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f26727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3243q7 f26730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26731e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3036i7(C3243q7 c3243q7, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f26730d = c3243q7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f26729c = obj;
        this.f26731e |= Integer.MIN_VALUE;
        return this.f26730d.c(this);
    }
}
