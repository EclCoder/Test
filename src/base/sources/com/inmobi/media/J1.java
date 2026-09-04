package com.inmobi.media;

import android.view.ViewGroup;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class J1 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M1 f25042b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(M1 m10, kl.f fVar) {
        super(2, fVar);
        this.f25042b = m10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new J1(this.f25042b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new J1(this.f25042b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25041a;
        if (i10 != 0) {
            if (i10 == 1) {
                fl.s.b(obj);
            } else {
                throw new IllegalStateException(mDXVAtwcaFMHJ.CHGoodrWyJOn);
            }
        } else {
            fl.s.b(obj);
            M1 m10 = this.f25042b;
            ViewGroup viewGroup = m10.f25239b;
            em.o0 o0Var = m10.f25238a;
            this.f25041a = 1;
            if (M1.a(m10, viewGroup, o0Var, this) == objF) {
                return objF;
            }
        }
        return fl.g0.f38750a;
    }
}
