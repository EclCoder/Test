package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.gi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2995gi extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3228pi f26624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26625e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2995gi(String str, GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, long j10, kl.f fVar) {
        super(2, fVar);
        this.f26623c = str;
        this.f26624d = gestureDetectorOnGestureListenerC3228pi;
        this.f26625e = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C2995gi c2995gi = new C2995gi(this.f26623c, this.f26624d, this.f26625e, fVar);
        c2995gi.f26622b = obj;
        return c2995gi;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C2995gi) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fe, code lost:
    
        if (em.i.j(r14, r4, r13) == r1) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2995gi.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
