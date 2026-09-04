package com.inmobi.media;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.inmobi.media.v3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3368v3 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V2 f27678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3322t9 f27679c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3368v3(V2 v10, InterfaceC3322t9 interfaceC3322t9, kl.f fVar) {
        super(2, fVar);
        this.f27678b = v10;
        this.f27679c = interfaceC3322t9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3368v3(this.f27678b, this.f27679c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3368v3(this.f27678b, this.f27679c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27677a;
        if (i10 == 0) {
            fl.s.b(obj);
            A3 a10 = A3.f24440a;
            SystemClock.elapsedRealtime();
            if (this.f27678b.f25873e) {
                InterfaceC3322t9 interfaceC3322t9 = this.f27679c;
                if (interfaceC3322t9 != null) {
                    kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                    ((C3348u9) interfaceC3322t9).c("A3", "ping in web view");
                }
                new C3135m3(A3.f24451l).a(this.f27678b);
            } else {
                InterfaceC3322t9 interfaceC3322t10 = this.f27679c;
                if (interfaceC3322t10 != null) {
                    kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                    ((C3348u9) interfaceC3322t10).c("A3", "ping in http executor");
                }
                C3187o3 c3187o3 = new C3187o3();
                V2 v10 = this.f27678b;
                this.f27677a = 1;
                obj = c3187o3.a(v10, this);
                if (obj == objF) {
                    return objF;
                }
            }
            return fl.g0.f38750a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fl.s.b(obj);
        EnumC2931e6 enumC2931e6 = (EnumC2931e6) obj;
        if (enumC2931e6 != null) {
            A3.f24451l.a(this.f27678b, enumC2931e6);
        } else {
            A3.f24451l.a(this.f27678b);
        }
        return fl.g0.f38750a;
    }
}
