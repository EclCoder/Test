package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.po, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3234po extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3260qo f27287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3234po(C3260qo c3260qo, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27287b = c3260qo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27286a = obj;
        this.f27288c |= Integer.MIN_VALUE;
        return this.f27287b.a(this);
    }
}
