package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.n6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3164n6 extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3216p6 f27035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f27036c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3164n6(C3216p6 c3216p6, boolean z10, kl.f fVar) {
        super(1, fVar);
        this.f27035b = c3216p6;
        this.f27036c = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3164n6(this.f27035b, this.f27036c, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3164n6(this.f27035b, this.f27036c, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27034a;
        try {
            if (i10 == 0) {
                fl.s.b(obj);
                C3216p6 c3216p6 = this.f27035b;
                boolean z10 = this.f27036c;
                this.f27034a = 1;
                if (C3216p6.a(c3216p6, z10, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
        } catch (Exception unused) {
            C3216p6 c3216p7 = this.f27035b;
            String str = c3216p7.f27172e;
            c3216p7.f27173f.set(false);
        }
        return fl.g0.f38750a;
    }
}
