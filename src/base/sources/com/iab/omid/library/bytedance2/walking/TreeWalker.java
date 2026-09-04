package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.bytedance2.utils.f;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TreeWalker implements com.iab.omid.library.bytedance2.processor.a.InterfaceC0345a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f23877i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f23878j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f23879k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f23880l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f23881m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23883b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f23889h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f23882a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23884c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.bytedance2.weakreference.a> f23885d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.a f23887f = new com.iab.omid.library.bytedance2.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.processor.b f23886e = new com.iab.omid.library.bytedance2.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.b f23888g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());

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
            TreeWalker.this.f23888g.b();
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
            if (TreeWalker.f23879k != null) {
                TreeWalker.f23879k.post(TreeWalker.f23880l);
                TreeWalker.f23879k.postDelayed(TreeWalker.f23881m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f23889h);
    }

    private void e() {
        this.f23883b = 0;
        this.f23885d.clear();
        this.f23884c = false;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                this.f23884c = true;
                break;
            }
        }
        this.f23889h = f.b();
    }

    public static TreeWalker getInstance() {
        return f23877i;
    }

    private void i() {
        if (f23879k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f23879k = handler;
            handler.post(f23880l);
            f23879k.postDelayed(f23881m, 200L);
        }
    }

    private void k() {
        Handler handler = f23879k;
        if (handler != null) {
            handler.removeCallbacks(f23881m);
            f23879k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23882a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f23882a.add(treeWalkerTimeLogger);
    }

    void f() {
        TreeWalker treeWalker;
        this.f23887f.e();
        long jB = f.b();
        com.iab.omid.library.bytedance2.processor.a aVarA = this.f23886e.a();
        if (this.f23887f.b().size() > 0) {
            for (String str : this.f23887f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f23887f.a(str), jSONObjectA);
                com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f23888g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f23887f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA2);
            treeWalker.f23888g.b(jSONObjectA2, treeWalker.f23887f.c(), jB);
            if (treeWalker.f23884c) {
                Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f23885d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f23888g.b();
        }
        treeWalker.f23887f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f23882a.clear();
        f23878j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23882a.contains(treeWalkerTimeLogger)) {
            this.f23882a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f23882a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f23882a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f23883b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f23883b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f23887f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, strD);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, Boolean.valueOf(this.f23887f.f(view)));
        this.f23887f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.bytedance2.processor.a.InterfaceC0345a
    public void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.bytedance2.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f23887f.e(view)) != com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f23884c && cVarE == com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f23885d.add(new com.iab.omid.library.bytedance2.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z11);
            }
            treeWalker.f23883b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.bytedance2.processor.a aVarB = this.f23886e.b();
        String strB = this.f23887f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.bytedance2.walking.a.C0347a c0347aC = this.f23887f.c(view);
        if (c0347aC == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, c0347aC);
        return true;
    }
}
