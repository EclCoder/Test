package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.wb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3402wb extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nm.a f27776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3428xb f27778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27779e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3402wb(C3428xb c3428xb, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27778d = c3428xb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27777c = obj;
        this.f27779e |= Integer.MIN_VALUE;
        return this.f27778d.a(null, this);
    }
}
