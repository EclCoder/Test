package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tl.a f622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f628h;

    public y(Executor executor, tl.a reportFullyDrawn) {
        kotlin.jvm.internal.s.h(executor, "executor");
        kotlin.jvm.internal.s.h(reportFullyDrawn, "reportFullyDrawn");
        this.f621a = executor;
        this.f622b = reportFullyDrawn;
        this.f623c = new Object();
        this.f627g = new ArrayList();
        this.f628h = new Runnable() { // from class: androidx.activity.x
            @Override // java.lang.Runnable
            public final void run() {
                y.d(this.f620a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(y yVar) {
        synchronized (yVar.f623c) {
            try {
                yVar.f625e = false;
                if (yVar.f624d == 0 && !yVar.f626f) {
                    yVar.f622b.invoke();
                    yVar.b();
                }
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f623c) {
            try {
                this.f626f = true;
                Iterator it = this.f627g.iterator();
                while (it.hasNext()) {
                    ((tl.a) it.next()).invoke();
                }
                this.f627g.clear();
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f623c) {
            z10 = this.f626f;
        }
        return z10;
    }
}
