package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;

/* JADX INFO: renamed from: com.inmobi.media.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3364v extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3390w f27656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Tj f27658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3364v(C3390w c3390w, String str, Tj tj2, kl.f fVar) {
        super(2, fVar);
        this.f27656b = c3390w;
        this.f27657c = str;
        this.f27658d = tj2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3364v(this.f27656b, this.f27657c, this.f27658d, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3364v) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27655a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            return obj;
        }
        fl.s.b(obj);
        C3390w c3390w = this.f27656b;
        String str = this.f27657c;
        Tj tj2 = this.f27658d;
        this.f27655a = 1;
        em.q qVar = new em.q(ll.b.c(this), 1);
        qVar.H();
        qVar.i(new C3312t(c3390w));
        Picasso picasso = Yf.f26082a;
        Yf.b(c3390w.f27749a).load(str).tag(c3390w.f27753e).transform(new Tf(Bitmap.Config.RGB_565)).into(tj2, new C3338u(c3390w, qVar));
        Object objB = qVar.B();
        if (objB == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(this);
        }
        return objB == objF ? objF : objB;
    }
}
