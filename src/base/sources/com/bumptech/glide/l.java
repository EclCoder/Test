package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import f6.p;
import f6.q;
import f6.s;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class l implements ComponentCallbacks2, f6.l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final i6.f f11196m = (i6.f) i6.f.o0(Bitmap.class).Q();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final i6.f f11197n = (i6.f) i6.f.o0(d6.c.class).Q();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final i6.f f11198o = (i6.f) ((i6.f) i6.f.p0(t5.a.f53132c).Y(h.LOW)).h0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.bumptech.glide.c f11199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f11200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final f6.j f11201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f11202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p f11203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s f11204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f11205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f6.b f11206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArrayList f11207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i6.f f11208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f11209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f11210l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            lVar.f11201c.d(lVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c implements f6.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f11212a;

        c(q qVar) {
            this.f11212a = qVar;
        }

        @Override // f6.b.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (l.this) {
                    this.f11212a.e();
                }
            }
        }
    }

    public l(com.bumptech.glide.c cVar, f6.j jVar, p pVar, Context context) {
        this(cVar, jVar, pVar, new q(), cVar.i(), context);
    }

    private void B(j6.i iVar) {
        boolean zA = A(iVar);
        i6.c cVarD = iVar.d();
        if (zA || this.f11199a.s(iVar) || cVarD == null) {
            return;
        }
        iVar.f(null);
        cVarD.clear();
    }

    private synchronized void n() {
        try {
            Iterator it = this.f11204f.j().iterator();
            while (it.hasNext()) {
                m((j6.i) it.next());
            }
            this.f11204f.i();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized boolean A(j6.i iVar) {
        i6.c cVarD = iVar.d();
        if (cVarD == null) {
            return true;
        }
        if (!this.f11202d.a(cVarD)) {
            return false;
        }
        this.f11204f.l(iVar);
        iVar.f(null);
        return true;
    }

    public k i(Class cls) {
        return new k(this.f11199a, this, cls, this.f11200b);
    }

    public k j() {
        return i(Bitmap.class).b(f11196m);
    }

    public k k() {
        return i(Drawable.class);
    }

    public void l(View view) {
        m(new b(view));
    }

    public void m(j6.i iVar) {
        if (iVar == null) {
            return;
        }
        B(iVar);
    }

    List o() {
        return this.f11207i;
    }

    @Override // f6.l
    public synchronized void onDestroy() {
        this.f11204f.onDestroy();
        n();
        this.f11202d.b();
        this.f11201c.b(this);
        this.f11201c.b(this.f11206h);
        m6.l.w(this.f11205g);
        this.f11199a.y(this);
    }

    @Override // f6.l
    public synchronized void onStart() {
        x();
        this.f11204f.onStart();
    }

    @Override // f6.l
    public synchronized void onStop() {
        try {
            this.f11204f.onStop();
            if (this.f11210l) {
                n();
            } else {
                w();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f11209k) {
            v();
        }
    }

    synchronized i6.f p() {
        return this.f11208j;
    }

    m q(Class cls) {
        return this.f11199a.k().e(cls);
    }

    public k r(Uri uri) {
        return k().D0(uri);
    }

    public k s(Integer num) {
        return k().E0(num);
    }

    public k t(String str) {
        return k().G0(str);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f11202d + ", treeNode=" + this.f11203e + "}";
    }

    public synchronized void u() {
        this.f11202d.c();
    }

    public synchronized void v() {
        u();
        Iterator it = this.f11203e.a().iterator();
        while (it.hasNext()) {
            ((l) it.next()).u();
        }
    }

    public synchronized void w() {
        this.f11202d.d();
    }

    public synchronized void x() {
        this.f11202d.f();
    }

    protected synchronized void y(i6.f fVar) {
        this.f11208j = (i6.f) ((i6.f) fVar.clone()).c();
    }

    synchronized void z(j6.i iVar, i6.c cVar) {
        this.f11204f.k(iVar);
        this.f11202d.g(cVar);
    }

    l(com.bumptech.glide.c cVar, f6.j jVar, p pVar, q qVar, f6.c cVar2, Context context) {
        this.f11204f = new s();
        a aVar = new a();
        this.f11205g = aVar;
        this.f11199a = cVar;
        this.f11201c = jVar;
        this.f11203e = pVar;
        this.f11202d = qVar;
        this.f11200b = context;
        f6.b bVarA = cVar2.a(context.getApplicationContext(), new c(qVar));
        this.f11206h = bVarA;
        cVar.r(this);
        if (m6.l.q()) {
            m6.l.v(aVar);
        } else {
            jVar.d(this);
        }
        jVar.d(bVarA);
        this.f11207i = new CopyOnWriteArrayList(cVar.k().c());
        y(cVar.k().d());
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b extends j6.d {
        b(View view) {
            super(view);
        }

        @Override // j6.i
        public void g(Drawable drawable) {
        }

        @Override // j6.d
        protected void l(Drawable drawable) {
        }

        @Override // j6.i
        public void a(Object obj, k6.b bVar) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
