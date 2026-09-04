package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.un, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3362un extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3414wn f27650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3362un(C3414wn c3414wn, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27650d = c3414wn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27649c = obj;
        this.f27651e |= Integer.MIN_VALUE;
        return C3414wn.a(this.f27650d, this);
    }
}
