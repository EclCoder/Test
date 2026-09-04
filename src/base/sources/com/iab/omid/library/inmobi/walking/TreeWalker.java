package com.iab.omid.library.inmobi.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.inmobi.internal.j;
import com.iab.omid.library.inmobi.utils.f;
import com.iab.omid.library.inmobi.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TreeWalker implements com.iab.omid.library.inmobi.processor.a.InterfaceC0350a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f24017i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f24018j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f24019k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f24020l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f24021m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24023b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f24029h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f24022a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24024c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.inmobi.weakreference.a> f24025d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.inmobi.walking.a f24027f = new com.iab.omid.library.inmobi.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.inmobi.processor.b f24026e = new com.iab.omid.library.inmobi.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.inmobi.walking.b f24028g = new com.iab.omid.library.inmobi.walking.b(new com.iab.omid.library.inmobi.walking.async.c());

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
            TreeWalker.this.f24028g.b();
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
            if (TreeWalker.f24019k != null) {
                TreeWalker.f24019k.post(TreeWalker.f24020l);
                TreeWalker.f24019k.postDelayed(TreeWalker.f24021m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f24029h);
    }

    private void e() {
        this.f24023b = 0;
        this.f24025d.clear();
        this.f24024c = false;
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().g()) {
                this.f24024c = true;
                break;
            }
        }
        this.f24029h = f.b();
    }

    public static TreeWalker getInstance() {
        return f24017i;
    }

    private void i() {
        if (f24019k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24019k = handler;
            handler.post(f24020l);
            f24019k.postDelayed(f24021m, 200L);
        }
    }

    private void k() {
        Handler handler = f24019k;
        if (handler != null) {
            handler.removeCallbacks(f24021m);
            f24019k = null;
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
        if (this.f24022a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f24022a.add(treeWalkerTimeLogger);
    }

    void f() {
        TreeWalker treeWalker;
        this.f24027f.e();
        long jB = f.b();
        com.iab.omid.library.inmobi.processor.a aVarA = this.f24026e.a();
        if (this.f24027f.b().size() > 0) {
            for (String str : this.f24027f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f24027f.a(str), jSONObjectA);
                com.iab.omid.library.inmobi.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f24028g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f24027f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.inmobi.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.inmobi.utils.c.b(jSONObjectA2);
            treeWalker.f24028g.b(jSONObjectA2, treeWalker.f24027f.c(), jB);
            if (treeWalker.f24024c) {
                Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f24025d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f24028g.b();
        }
        treeWalker.f24027f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f24022a.clear();
        f24018j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24022a.contains(treeWalkerTimeLogger)) {
            this.f24022a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f24022a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f24022a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f24023b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f24023b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f24027f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, strC);
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, Boolean.valueOf(this.f24027f.e(view)));
        com.iab.omid.library.inmobi.utils.c.b(jSONObject, Boolean.valueOf(this.f24027f.c(strC)));
        this.f24027f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.inmobi.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.inmobi.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.inmobi.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.inmobi.processor.a.InterfaceC0350a
    public void a(View view, com.iab.omid.library.inmobi.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.inmobi.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f24027f.d(view)) != com.iab.omid.library.inmobi.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f24024c && cVarD == com.iab.omid.library.inmobi.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f24025d.add(new com.iab.omid.library.inmobi.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f24023b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.inmobi.processor.a aVarB = this.f24026e.b();
        String strB = this.f24027f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.inmobi.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.inmobi.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.inmobi.walking.a.C0352a c0352aB = this.f24027f.b(view);
        if (c0352aB == null) {
            return false;
        }
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, c0352aB);
        return true;
    }
}
