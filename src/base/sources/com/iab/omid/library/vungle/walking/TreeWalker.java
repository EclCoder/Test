package com.iab.omid.library.vungle.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.vungle.internal.k;
import com.iab.omid.library.vungle.utils.f;
import com.iab.omid.library.vungle.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TreeWalker implements com.iab.omid.library.vungle.processor.a.InterfaceC0360a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f24317i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f24318j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f24319k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f24320l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f24321m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24323b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f24329h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f24322a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24324c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.vungle.weakreference.a> f24325d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.vungle.walking.a f24327f = new com.iab.omid.library.vungle.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.vungle.processor.b f24326e = new com.iab.omid.library.vungle.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.vungle.walking.b f24328g = new com.iab.omid.library.vungle.walking.b(new com.iab.omid.library.vungle.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f24328g.b();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f24319k != null) {
                TreeWalker.f24319k.post(TreeWalker.f24320l);
                TreeWalker.f24319k.postDelayed(TreeWalker.f24321m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f24329h);
    }

    private void e() {
        this.f24323b = 0;
        this.f24325d.clear();
        this.f24324c = false;
        Iterator<com.iab.omid.library.vungle.adsession.a> it = com.iab.omid.library.vungle.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().g()) {
                this.f24324c = true;
                break;
            }
        }
        this.f24329h = f.b();
    }

    public static TreeWalker getInstance() {
        return f24317i;
    }

    private void i() {
        if (f24319k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24319k = handler;
            handler.post(f24320l);
            f24319k.postDelayed(f24321m, 200L);
        }
    }

    private void k() {
        Handler handler = f24319k;
        if (handler != null) {
            handler.removeCallbacks(f24321m);
            f24319k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        k.b().a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24322a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f24322a.add(treeWalkerTimeLogger);
    }

    void f() {
        TreeWalker treeWalker;
        this.f24327f.e();
        long jB = f.b();
        com.iab.omid.library.vungle.processor.a aVarA = this.f24326e.a();
        if (this.f24327f.b().size() > 0) {
            for (String str : this.f24327f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f24327f.a(str), jSONObjectA);
                com.iab.omid.library.vungle.utils.c.c(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f24328g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f24327f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.vungle.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.vungle.utils.c.c(jSONObjectA2);
            treeWalker.f24328g.b(jSONObjectA2, treeWalker.f24327f.c(), jB);
            if (treeWalker.f24324c) {
                Iterator<com.iab.omid.library.vungle.adsession.a> it = com.iab.omid.library.vungle.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f24325d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f24328g.b();
        }
        treeWalker.f24327f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f24322a.clear();
        f24318j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24322a.contains(treeWalkerTimeLogger)) {
            this.f24322a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f24322a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f24322a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f24323b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f24323b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f24327f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.vungle.utils.c.a(jSONObject, strC);
        com.iab.omid.library.vungle.utils.c.a(jSONObject, Boolean.valueOf(this.f24327f.e(view)));
        com.iab.omid.library.vungle.utils.c.b(jSONObject, Boolean.valueOf(this.f24327f.c(strC)));
        this.f24327f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.vungle.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.vungle.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.vungle.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.vungle.processor.a.InterfaceC0360a
    public void a(View view, com.iab.omid.library.vungle.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.vungle.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f24327f.d(view)) != com.iab.omid.library.vungle.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.vungle.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f24324c && cVarD == com.iab.omid.library.vungle.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f24325d.add(new com.iab.omid.library.vungle.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f24323b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.vungle.processor.a aVarB = this.f24326e.b();
        String strB = this.f24327f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.vungle.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.vungle.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.vungle.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.vungle.walking.a.C0362a c0362aB = this.f24327f.b(view);
        if (c0362aB == null) {
            return false;
        }
        com.iab.omid.library.vungle.utils.c.a(jSONObject, c0362aB);
        return true;
    }
}
