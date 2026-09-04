package com.inmobi.media;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class r extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Tj f27351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3390w f27353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f27355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f27356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f27357g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C3390w c3390w, String str, int i10, int i11, int i12, kl.f fVar) {
        super(2, fVar);
        this.f27353c = c3390w;
        this.f27354d = str;
        this.f27355e = i10;
        this.f27356f = i11;
        this.f27357g = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new r(this.f27353c, this.f27354d, this.f27355e, this.f27356f, this.f27357g, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws C3118lc {
        Tj tj2;
        Object objF = ll.b.f();
        int i10 = this.f27352b;
        if (i10 == 0) {
            fl.s.b(obj);
            Tj tj3 = new Tj(this.f27353c.f27749a);
            tj3.setLayoutParams(new ViewGroup.LayoutParams(this.f27356f, this.f27357g));
            C3390w c3390w = this.f27353c;
            String str = this.f27354d;
            int i11 = this.f27355e;
            this.f27351a = tj3;
            this.f27352b = 1;
            Object objA = C3390w.a(c3390w, tj3, str, i11, this);
            if (objA == objF) {
                return objF;
            }
            tj2 = tj3;
            obj = objA;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tj2 = this.f27351a;
            fl.s.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return tj2;
        }
        throw new C3118lc();
    }
}
