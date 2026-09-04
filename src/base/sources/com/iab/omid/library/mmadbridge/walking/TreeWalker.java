package com.iab.omid.library.mmadbridge.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.mmadbridge.internal.j;
import com.iab.omid.library.mmadbridge.utils.f;
import com.iab.omid.library.mmadbridge.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TreeWalker implements com.iab.omid.library.mmadbridge.processor.a.InterfaceC0354a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f24152i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f24153j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f24154k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f24155l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f24156m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24158b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f24164h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f24157a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24159c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.mmadbridge.weakreference.a> f24160d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.walking.a f24162f = new com.iab.omid.library.mmadbridge.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.processor.b f24161e = new com.iab.omid.library.mmadbridge.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.walking.b f24163g = new com.iab.omid.library.mmadbridge.walking.b(new com.iab.omid.library.mmadbridge.walking.async.c());

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
            TreeWalker.this.f24163g.b();
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
            if (TreeWalker.f24154k != null) {
                TreeWalker.f24154k.post(TreeWalker.f24155l);
                TreeWalker.f24154k.postDelayed(TreeWalker.f24156m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f24164h);
    }

    private void e() {
        this.f24158b = 0;
        this.f24160d.clear();
        this.f24159c = false;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                this.f24159c = true;
                break;
            }
        }
        this.f24164h = f.b();
    }

    public static TreeWalker getInstance() {
        return f24152i;
    }

    private void i() {
        if (f24154k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24154k = handler;
            handler.post(f24155l);
            f24154k.postDelayed(f24156m, 200L);
        }
    }

    private void k() {
        Handler handler = f24154k;
        if (handler != null) {
            handler.removeCallbacks(f24156m);
            f24154k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24157a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f24157a.add(treeWalkerTimeLogger);
    }

    void f() {
        TreeWalker treeWalker;
        this.f24162f.e();
        long jB = f.b();
        com.iab.omid.library.mmadbridge.processor.a aVarA = this.f24161e.a();
        if (this.f24162f.b().size() > 0) {
            for (String str : this.f24162f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f24162f.a(str), jSONObjectA);
                com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f24163g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f24162f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA2);
            treeWalker.f24163g.b(jSONObjectA2, treeWalker.f24162f.c(), jB);
            if (treeWalker.f24159c) {
                Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f24160d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f24163g.b();
        }
        treeWalker.f24162f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f24157a.clear();
        f24153j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24157a.contains(treeWalkerTimeLogger)) {
            this.f24157a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f24157a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f24157a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f24158b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f24158b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f24162f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, strC);
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, Boolean.valueOf(this.f24162f.e(view)));
        com.iab.omid.library.mmadbridge.utils.c.b(jSONObject, Boolean.valueOf(this.f24162f.c(strC)));
        this.f24162f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.mmadbridge.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.mmadbridge.processor.a.InterfaceC0354a
    public void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.mmadbridge.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f24162f.d(view)) != com.iab.omid.library.mmadbridge.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f24159c && cVarD == com.iab.omid.library.mmadbridge.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f24160d.add(new com.iab.omid.library.mmadbridge.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f24158b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.mmadbridge.processor.a aVarB = this.f24161e.b();
        String strB = this.f24162f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.mmadbridge.walking.a.C0356a c0356aB = this.f24162f.b(view);
        if (c0356aB == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, c0356aB);
        return true;
    }
}
