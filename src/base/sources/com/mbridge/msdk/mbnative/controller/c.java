package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f31491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<View> f31492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f31493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f31494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f31495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f31497g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            c.this.b();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0416c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f31500a;

        RunnableC0416c(View view) {
            this.f31500a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewTreeObserver viewTreeObserver = this.f31500a.getViewTreeObserver();
            if (viewTreeObserver == null || viewTreeObserver.isAlive()) {
                c.this.f31491a = new WeakReference(viewTreeObserver);
                if (c.this.f31493c != null) {
                    viewTreeObserver.addOnPreDrawListener(c.this.f31493c);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        void a(ArrayList<View> arrayList, ArrayList<View> arrayList2);
    }

    public c(List<View> list, d dVar, Handler handler, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f31492b = arrayList;
        this.f31493c = null;
        this.f31494d = dVar;
        this.f31495e = handler;
        this.f31497g = i10;
        if (list != null) {
            this.f31492b = list;
        } else {
            arrayList.clear();
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f31496f = false;
            List<View> list = this.f31492b;
            if (list == null || list.size() <= 0) {
                return;
            }
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            for (int i10 = 0; i10 < this.f31492b.size(); i10++) {
                View view = this.f31492b.get(i10);
                if (b(view)) {
                    arrayList.add(view);
                } else {
                    arrayList2.add(view);
                }
            }
            d dVar = this.f31494d;
            if (dVar != null) {
                dVar.a(arrayList, arrayList2);
            }
            if (arrayList.size() > 0) {
                a();
            }
            arrayList.clear();
            arrayList2.clear();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f31496f) {
            return;
        }
        Handler handler = this.f31495e;
        if (handler != null) {
            if (this.f31497g == 1) {
                d();
            } else {
                handler.postDelayed(new b(), 100L);
            }
        }
        this.f31496f = true;
    }

    private void c() {
        try {
            b();
        } catch (Throwable th2) {
            q0.b("ImpressionTracker", th2.getMessage(), th2);
        }
        try {
            this.f31493c = new a();
        } catch (Throwable th3) {
            q0.b("ImpressionTracker", th3.getMessage(), th3);
        }
    }

    public void a(View view) {
        View viewA;
        View view2;
        if (view != null) {
            viewA = f.a(view.getContext(), view);
            this.f31492b.add(view);
        } else {
            List<View> list = this.f31492b;
            viewA = null;
            if (list != null && list.size() > 0) {
                for (int i10 = 0; i10 < this.f31492b.size() && ((view2 = this.f31492b.get(i10)) == null || (viewA = f.a(view2.getContext(), view2)) == null); i10++) {
                }
            }
        }
        if (viewA == null) {
            return;
        }
        viewA.post(new RunnableC0416c(viewA));
    }

    private boolean b(View view) {
        return !e1.a(view, this.f31497g);
    }

    public void a() {
        try {
            this.f31496f = false;
            WeakReference<ViewTreeObserver> weakReference = this.f31491a;
            if (weakReference != null && weakReference.get() != null) {
                ViewTreeObserver viewTreeObserver = this.f31491a.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f31493c);
                }
                this.f31491a.clear();
            }
            this.f31494d = null;
            this.f31493c = null;
            List<View> list = this.f31492b;
            if (list != null) {
                list.clear();
            }
            this.f31492b = null;
        } catch (Throwable unused) {
        }
    }
}
