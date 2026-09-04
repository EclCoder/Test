package com.inmobi.media;

import android.os.Handler;
import android.view.View;
import com.inmobi.media.AbstractC3104ko;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.ko, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3104ko {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f26875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f26876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f26877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3322t9 f26878d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f26880f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC3027ho f26882h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26885k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f26879e = new ArrayList(50);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f26881g = new AtomicBoolean(true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fl.k f26883i = fl.l.b(new tl.a() { // from class: yh.d9
        @Override // tl.a
        public final Object invoke() {
            return AbstractC3104ko.a(this.f57665a);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fl.k f26884j = fl.l.b(new tl.a() { // from class: yh.e9
        @Override // tl.a
        public final Object invoke() {
            return AbstractC3104ko.b(this.f57695a);
        }
    });

    public AbstractC3104ko(WeakHashMap weakHashMap, Handler handler, byte b10, InterfaceC3322t9 interfaceC3322t9) {
        this.f26875a = weakHashMap;
        this.f26876b = handler;
        this.f26877c = b10;
        this.f26878d = interfaceC3322t9;
    }

    public static final RunnableC3001go a(AbstractC3104ko abstractC3104ko) {
        return new RunnableC3001go(abstractC3104ko, abstractC3104ko.f26881g);
    }

    public static final Runnable b(final AbstractC3104ko abstractC3104ko) {
        return new Runnable() { // from class: yh.f9
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3104ko.c(this.f57715a);
            }
        };
    }

    public static final void c(AbstractC3104ko abstractC3104ko) {
        abstractC3104ko.f26876b.post((RunnableC3001go) abstractC3104ko.f26883i.getValue());
    }

    public abstract int c();

    public abstract void d();

    public final void e() {
        InterfaceC3322t9 interfaceC3322t9 = this.f26878d;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("VisibilityTracker", "pause " + this);
        }
        ((RunnableC3001go) this.f26883i.getValue()).run();
        this.f26876b.removeCallbacksAndMessages(null);
        this.f26885k = false;
        this.f26881g.set(true);
    }

    public final void f() {
        InterfaceC3322t9 interfaceC3322t9 = this.f26878d;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("VisibilityTracker", "resume " + this);
        }
        this.f26881g.set(false);
        if (this.f26885k || this.f26881g.get()) {
            return;
        }
        this.f26885k = true;
        em.k.d(H9.f24931d, null, null, new C3078jo(this, null), 3, null);
    }

    public final void a(View rootView, View view, View view2, int i10) {
        kotlin.jvm.internal.s.h(rootView, "rootView");
        kotlin.jvm.internal.s.h(view, "view");
        InterfaceC3322t9 interfaceC3322t9 = this.f26878d;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("VisibilityTracker", "add view to tracker - minPercent - " + i10 + "  " + this);
        }
        C3052io c3052io = (C3052io) this.f26875a.get(view);
        if (c3052io == null) {
            c3052io = new C3052io();
            this.f26875a.put(view, c3052io);
            this.f26880f++;
        }
        c3052io.f26759a = i10;
        long j10 = this.f26880f;
        c3052io.f26760b = j10;
        c3052io.f26761c = rootView;
        long j11 = 50;
        if (j10 % j11 == 0) {
            long j12 = j10 - j11;
            for (Map.Entry entry : this.f26875a.entrySet()) {
                View view3 = (View) entry.getKey();
                if (((C3052io) entry.getValue()).f26760b < j12) {
                    this.f26879e.add(view3);
                }
            }
            Iterator it = this.f26879e.iterator();
            kotlin.jvm.internal.s.g(it, "iterator(...)");
            while (it.hasNext()) {
                a((View) it.next());
            }
            this.f26879e.clear();
        }
        if (this.f26875a.size() == 1) {
            f();
        }
    }

    public final void b() {
        InterfaceC3322t9 interfaceC3322t9 = this.f26878d;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("VisibilityTracker", "destroy " + this);
        }
        a();
        this.f26882h = null;
        this.f26881g.set(true);
    }

    public final void a(View view) {
        kotlin.jvm.internal.s.h(view, "view");
        InterfaceC3322t9 interfaceC3322t9 = this.f26878d;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("VisibilityTracker", "removed view from tracker " + this);
        }
        if (((C3052io) this.f26875a.remove(view)) != null) {
            this.f26880f--;
            if (this.f26875a.isEmpty()) {
                e();
            }
        }
    }

    public final void a() {
        InterfaceC3322t9 interfaceC3322t9 = this.f26878d;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("VisibilityTracker", "clear " + this);
        }
        this.f26875a.clear();
        this.f26876b.removeMessages(0);
        this.f26885k = false;
    }
}
