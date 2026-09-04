package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Na extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X9 f25334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Sa f25336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25337d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Na(Sa sa2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f25336c = sa2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25335b = obj;
        this.f25337d |= Integer.MIN_VALUE;
        return Sa.a(this.f25336c, null, this);
    }
}
