package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.km, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3102km extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Hl f26868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3180nm f26870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3102km(C3180nm c3180nm, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f26870c = c3180nm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f26869b = obj;
        this.f26871d |= Integer.MIN_VALUE;
        return this.f26870c.a(this);
    }
}
