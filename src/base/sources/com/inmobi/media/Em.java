package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.Em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Em extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fm f24734a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em(Fm fm2, kl.f fVar) {
        super(2, fVar);
        this.f24734a = fm2;
    }

    public static final void a(Fm fm2, View view) {
        T4.a(fm2.f24803d, fm2.f24801b, C2973fm.f26575a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Em(this.f24734a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Em(this.f24734a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        final Fm fm2 = this.f24734a;
        ViewGroup viewGroup = fm2.f24809j;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: yh.k1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Em.a(fm2, view);
                }
            });
        }
        return fl.g0.f38750a;
    }
}
