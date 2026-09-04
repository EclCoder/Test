package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.Me;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em.o0 f25276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ln f25277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Je f25278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f25279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f25280e;

    public Me(em.o0 coroutineScope, Ln viewabilityModel) {
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(viewabilityModel, "viewabilityModel");
        this.f25276a = coroutineScope;
        this.f25277b = viewabilityModel;
        this.f25279d = new AtomicBoolean(false);
        this.f25280e = new ArrayList();
        Ne ne2 = new Ne(new Nn(viewabilityModel.f25229a, viewabilityModel.f25231c), new Nn(viewabilityModel.f25230b, viewabilityModel.f25232d));
        ViewGroup parentView = viewabilityModel.f25233e.f26265a.getParentView();
        ImageView iconView = viewabilityModel.f25233e.f26265a.getIconView();
        C2865bh c2865bh = viewabilityModel.f25233e;
        MediaView mediaView = c2865bh.f26266b;
        kotlin.jvm.internal.s.h(c2865bh, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MediaView mediaView2 = c2865bh.f26266b;
        if (mediaView2 != null) {
            linkedHashSet.add(mediaView2);
        }
        View view = c2865bh.f26267c;
        if (view != null) {
            linkedHashSet.add(view);
        }
        View ctaView = c2865bh.f26265a.getCtaView();
        if (ctaView != null) {
            linkedHashSet.add(ctaView);
        }
        ImageView iconView2 = c2865bh.f26265a.getIconView();
        if (iconView2 != null) {
            linkedHashSet.add(iconView2);
        }
        View titleView = c2865bh.f26265a.getTitleView();
        if (titleView != null) {
            linkedHashSet.add(titleView);
        }
        View descriptionView = c2865bh.f26265a.getDescriptionView();
        if (descriptionView != null) {
            linkedHashSet.add(descriptionView);
        }
        View ratingView = c2865bh.f26265a.getRatingView();
        if (ratingView != null) {
            linkedHashSet.add(ratingView);
        }
        View advertiserView = c2865bh.f26265a.getAdvertiserView();
        if (advertiserView != null) {
            linkedHashSet.add(advertiserView);
        }
        linkedHashSet.addAll(c2865bh.f26265a.getExtraViews$media_release());
        this.f25278c = new Je(parentView, iconView, mediaView, gl.r.I0(linkedHashSet), ne2);
    }

    public static final fl.g0 b(Me me2, boolean z10) {
        me2.f25278c.f25067e.f25347b.f25371b = z10;
        return fl.g0.f38750a;
    }

    public final void a() {
        if (this.f25279d.getAndSet(true)) {
            return;
        }
        ViewGroup parentView = this.f25277b.f25233e.f26265a.getParentView();
        a(this.f25277b.f25233e.f26265a.getIconView(), parentView, this.f25277b.f25229a, new Function1() { // from class: yh.n2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Me.a(this.f57848a, ((Boolean) obj).booleanValue());
            }
        });
        Ln ln2 = this.f25277b;
        a(ln2.f25233e.f26266b, parentView, ln2.f25230b, new Function1() { // from class: yh.o2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Me.b(this.f57863a, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void b() {
        int i10 = 0;
        if (this.f25279d.getAndSet(false)) {
            ArrayList arrayList = this.f25280e;
            kotlin.jvm.internal.s.h(arrayList, "<this>");
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                L6.a((em.z1) obj);
            }
            arrayList.clear();
            this.f25280e.clear();
        }
    }

    public static final fl.g0 a(Me me2, boolean z10) {
        me2.f25278c.f25067e.f25346a.f25371b = z10;
        return fl.g0.f38750a;
    }

    public final void a(View view, ViewGroup parentView, boolean z10, Function1 function1) {
        if (view == null || !z10) {
            return;
        }
        em.o0 coroutineScope = this.f25276a;
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(parentView, "parentView");
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        this.f25280e.add(em.k.d(this.f25276a, null, null, new Le(hm.g.A(hm.g.u(hm.g.d(new Kn(view, parentView, null)), em.c1.c()), coroutineScope, hm.f0.f40523a.b(), Boolean.valueOf(Mn.b(view, parentView))), null, function1), 3, null));
    }
}
