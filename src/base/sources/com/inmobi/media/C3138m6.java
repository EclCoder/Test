package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.m6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3138m6 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3216p6 f26982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3035i6 f26983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3138m6(C3216p6 c3216p6, C3035i6 c3035i6, kl.f fVar) {
        super(2, fVar);
        this.f26982b = c3216p6;
        this.f26983c = c3035i6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3138m6(this.f26982b, this.f26983c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3138m6(this.f26982b, this.f26983c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26981a;
        if (i10 == 0) {
            fl.s.b(obj);
            AbstractC3009h6 abstractC3009h6 = this.f26982b.f27169b;
            ArrayList arrayList = this.f26983c.f26725a;
            this.f26981a = 1;
            if (abstractC3009h6.a(arrayList, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        return fl.g0.f38750a;
    }
}
