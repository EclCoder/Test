package com.inmobi.media;

import android.R;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.inmobi.media.ee, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2939ee extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3043ie f26489a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2939ee(C3043ie c3043ie, kl.f fVar) {
        super(2, fVar);
        this.f26489a = c3043ie;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C2939ee(this.f26489a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C2939ee(this.f26489a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        C3043ie c3043ie = this.f26489a;
        c3043ie.getClass();
        c3043ie.f26738a.addView(c3043ie.f26744g, new RelativeLayout.LayoutParams(-1, -1));
        C3043ie c3043ie2 = this.f26489a;
        boolean z10 = c3043ie2.f26741d.f26707d.f25375a;
        c3043ie2.f26746i = z10;
        if (z10) {
            c3043ie2.a(c3043ie2.f26747j, c3043ie2.f26748k);
        } else {
            c3043ie2.a(c3043ie2.f26748k, c3043ie2.f26747j);
        }
        C3310sn c3310sn = this.f26489a.f26749l;
        if (c3310sn.f27487c.f25418a) {
            float fB = N5.b();
            ProgressBar progressBar = new ProgressBar(c3310sn.f27486b.getContext(), null, R.attr.progressBarStyleHorizontal);
            c3310sn.f27489e = progressBar;
            H6.a(progressBar, c3310sn.f27487c, fB);
            c3310sn.f27486b.addView(c3310sn.f27489e);
            em.k.d(c3310sn.f27485a, em.c1.c(), null, new C3259qn(c3310sn.f27488d, null, c3310sn), 2, null);
        }
        return fl.g0.f38750a;
    }
}
