package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.s5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3292s5 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Zf f27432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3318t5 f27434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3292s5(C3318t5 c3318t5, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27434c = c3318t5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27433b = obj;
        this.f27435d |= Integer.MIN_VALUE;
        return this.f27434c.a((Zf) null, this);
    }
}
