package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.j6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3060j6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rk f26780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2983g6 f26781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f26786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f26787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C3216p6 f26788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26789j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3060j6(C3216p6 c3216p6, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f26788i = c3216p6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f26787h = obj;
        this.f26789j |= Integer.MIN_VALUE;
        return C3216p6.a(this.f26788i, false, (kotlin.coroutines.jvm.internal.d) this);
    }
}
