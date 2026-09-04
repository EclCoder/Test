package com.inmobi.media;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.U;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3228pi f25778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f25779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N f25781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3322t9 f25782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f25783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public L f25784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I6 f25785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final em.o0 f25786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f25787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public em.z1 f25788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Oo f25789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final O f25790m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f25791n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final T f25792o;

    public U(GestureDetectorOnGestureListenerC3228pi adView, Set friendlyViews, long j10, N listener, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(adView, "adView");
        kotlin.jvm.internal.s.h(friendlyViews, "friendlyViews");
        kotlin.jvm.internal.s.h(listener, "listener");
        this.f25778a = adView;
        this.f25779b = friendlyViews;
        this.f25780c = j10;
        this.f25781d = listener;
        this.f25782e = interfaceC3322t9;
        this.f25783f = adView.getContext();
        this.f25786i = H9.f24931d;
        this.f25787j = new AtomicBoolean(false);
        this.f25790m = new O(this);
        this.f25792o = new T(this);
    }

    public static final M a(U u10) {
        fl.q qVar;
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        int i10 = 0;
        u10.getClass();
        Rect rect = new Rect();
        if (u10.f25778a.getRootView() == null || u10.f25778a.getVisibility() != 0 || !u10.f25778a.hasWindowFocus() || !u10.f25791n || !u10.f25778a.getGlobalVisibleRect(rect)) {
            return null;
        }
        Context context = u10.f25783f;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.h(context, "<this>");
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            qVar = new fl.q(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        } catch (Exception unused) {
            qVar = new fl.q(0, 0);
        }
        int iIntValue = ((Number) qVar.d()).intValue();
        int iIntValue2 = ((Number) qVar.g()).intValue();
        Rect rect2 = new Rect();
        if (!u10.f25778a.getLocalVisibleRect(rect2) || rect2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        View rootView = u10.f25778a.getRootView();
        Set set = u10.f25779b;
        if (rootView instanceof ViewGroup) {
            ArrayList arrayList2 = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.push(rootView);
            boolean z10 = false;
            while (!arrayDeque.isEmpty()) {
                View view = (View) arrayDeque.pop();
                if (view.getVisibility() == 0) {
                    if (kotlin.jvm.internal.s.c(view, u10.f25778a)) {
                        z10 = true;
                    } else if (!set.contains(view)) {
                        Rect rect3 = new Rect();
                        if (view.getLocalVisibleRect(rect3) && !rect3.isEmpty()) {
                            Rect rect4 = new Rect();
                            boolean globalVisibleRect = view.getGlobalVisibleRect(rect4);
                            if (kotlin.jvm.internal.s.c(view, u10.f25778a) || (globalVisibleRect && rect4.intersect(rect))) {
                                B5.f24500a.getClass();
                                boolean z11 = !B5.y() || view.getZ() >= u10.f25778a.getZ();
                                if (z10 && z11) {
                                    arrayList2.add(rect4);
                                }
                                if (view instanceof ViewGroup) {
                                    ViewGroup viewGroup = (ViewGroup) view;
                                    for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                                        arrayDeque.push(viewGroup.getChildAt(childCount));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            L l10 = u10.f25784g;
            if (l10 != null && (rectF4 = l10.f25150b) != null) {
                a(rect, arrayList2, rectF4);
            }
            L l11 = u10.f25784g;
            if (l11 != null && (rectF3 = l11.f25150b) != null) {
                a(rect, arrayList2, rectF3);
            }
            L l12 = u10.f25784g;
            if (l12 != null && (rectF2 = l12.f25151c) != null) {
                a(rect, arrayList2, rectF2);
            }
            L l13 = u10.f25784g;
            if (l13 != null && (rectF = l13.f25152d) != null) {
                a(rect, arrayList2, rectF);
            }
            if (arrayList2.size() == 1) {
                arrayList.add(new RectF((Rect) arrayList2.get(0)));
            } else {
                Region region = new Region();
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    region.op((Rect) obj, Region.Op.UNION);
                }
                RegionIterator regionIterator = new RegionIterator(region);
                Rect rect5 = new Rect();
                while (regionIterator.next(rect5)) {
                    arrayList.add(new RectF(rect5));
                }
            }
        }
        return new M(new RectF(rect2), arrayList, iIntValue, iIntValue2);
    }

    public static final fl.g0 b(U u10) {
        u10.getClass();
        B5.f24500a.getClass();
        if (B5.u()) {
            u10.f25789l = new Oo(u10.f25778a, u10.f25792o, u10.f25782e);
        } else {
            InterfaceC3322t9 interfaceC3322t9 = u10.f25782e;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).c("AdExposureTracker", "Cannot calculate curved areas for this Android OS");
            }
        }
        u10.f25788k = J3.a(u10.f25786i, 0L, u10.f25780c, new S(u10, null));
        return fl.g0.f38750a;
    }

    public static final fl.g0 c(U u10) {
        em.z1 z1Var = u10.f25788k;
        if (z1Var != null) {
            em.z1.c0(z1Var, null, 1, null);
        }
        Oo oo2 = u10.f25789l;
        if (oo2 != null) {
            oo2.a();
        }
        u10.f25789l = null;
        u10.f25788k = null;
        I6 i10 = new I6(0.0f, null, null);
        if (!kotlin.jvm.internal.s.c(i10, u10.f25785h)) {
            ((C2892ci) u10.f25781d).a(i10);
            u10.f25785h = i10;
        }
        return fl.g0.f38750a;
    }

    public final void b(View view) {
        kotlin.jvm.internal.s.h(view, "view");
        InterfaceC3322t9 interfaceC3322t9 = this.f25782e;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("AdExposureTracker", "Removing friendly view: " + view);
        }
        this.f25779b.remove(view);
    }

    public final void b() {
        InterfaceC3322t9 interfaceC3322t9;
        if (this.f25787j.compareAndSet(true, false)) {
            Object objA = L3.a(new tl.a() { // from class: yh.o4
                @Override // tl.a
                public final Object invoke() {
                    return U.c(this.f57864a);
                }
            });
            Throwable thE = fl.r.e(objA);
            if (thE != null && (interfaceC3322t9 = this.f25782e) != null) {
                ((C3348u9) interfaceC3322t9).b("AdExposureTracker", "Error stopping exposure tracking - " + thE.getMessage());
            }
            fl.r.a(objA);
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f25782e;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).c("AdExposureTracker", "Exposure tracking is already stopped");
        }
    }

    public final void a() {
        if (this.f25787j.compareAndSet(false, true)) {
            Object objA = L3.a(new tl.a() { // from class: yh.p4
                @Override // tl.a
                public final Object invoke() {
                    return U.b(this.f57877a);
                }
            });
            Throwable thE = fl.r.e(objA);
            if (thE != null) {
                InterfaceC3322t9 interfaceC3322t9 = this.f25782e;
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).b("AdExposureTracker", "Error starting exposure tracking - " + thE.getMessage());
                }
                this.f25787j.set(false);
                fl.k kVar = W9.f25935a;
                W9.a(new M2(thE));
            }
            fl.r.a(objA);
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f25782e;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).c("AdExposureTracker", "Exposure tracking is already started");
        }
    }

    public final void a(View view) {
        kotlin.jvm.internal.s.h(view, "view");
        InterfaceC3322t9 interfaceC3322t9 = this.f25782e;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("AdExposureTracker", "Adding friendly view: " + view);
        }
        this.f25779b.add(view);
    }

    public final void a(Throwable th2) {
        InterfaceC3322t9 interfaceC3322t9 = this.f25782e;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("AdExposureTracker", "Error calculating exposure metrics - " + th2.getMessage());
        }
    }

    public static final void a(Rect rect, ArrayList arrayList, RectF rectF) {
        if (rectF.intersect(new RectF(rect))) {
            arrayList.add(new Rect(J3.b(rectF.left), J3.b(rectF.top), J3.b(rectF.right), J3.b(rectF.bottom)));
        }
    }
}
