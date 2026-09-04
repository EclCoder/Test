package com.inmobi.media;

import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class G7 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R7 f24841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f24842c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G7(R7 r10, ArrayList arrayList, kl.f fVar) {
        super(2, fVar);
        this.f24841b = r10;
        this.f24842c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new G7(this.f24841b, this.f24842c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new G7(this.f24841b, this.f24842c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        G7 g10;
        Object objF = ll.b.f();
        int i10 = this.f24840a;
        if (i10 == 0) {
            fl.s.b(obj);
            R7 r10 = this.f24841b;
            if (!r10.f25593f.get()) {
                r10.f25593f.set(true);
                if (kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
                    r10.f25603p.q(r10.B);
                } else {
                    em.k.d(r10.f25590c, null, null, new C3398w7(null, r10), 3, null);
                }
            }
            this.f24841b.f25608u = System.currentTimeMillis();
            R7 r11 = this.f24841b;
            androidx.media3.exoplayer.o oVar = r11.f25603p;
            ArrayList arrayList = this.f24842c;
            InterfaceC3322t9 interfaceC3322t9 = r11.f25589b;
            L2 l10 = r11.f25610w;
            boolean isCache = r11.f25588a.getIsCache();
            this.f24840a = 1;
            g10 = this;
            obj = AbstractC2923dn.a(oVar, arrayList, interfaceC3322t9, l10, isCache, g10);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            g10 = this;
        }
        g10.f24841b.a((AbstractC3037i8) obj);
        return fl.g0.f38750a;
    }
}
