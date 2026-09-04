package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.z4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3471z4 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B4 f27974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27975d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3471z4(B4 b10, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27974c = b10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27973b = obj;
        this.f27975d |= Integer.MIN_VALUE;
        return this.f27974c.a(null, null, null, this);
    }
}
