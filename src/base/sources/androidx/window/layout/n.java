package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import fl.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class n implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile n f7738d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f7740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f7741b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f7737c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ReentrantLock f7739e = new ReentrantLock();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            if (n.f7738d == null) {
                ReentrantLock reentrantLock = n.f7739e;
                reentrantLock.lock();
                try {
                    if (n.f7738d == null) {
                        n.f7738d = new n(n.f7737c.b(context));
                    }
                    g0 g0Var = g0.f38750a;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            n nVar = n.f7738d;
            kotlin.jvm.internal.s.e(nVar);
            return nVar;
        }

        public final g b(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            try {
                if (c(SidecarCompat.f7674f.c())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.l()) {
                        return sidecarCompat;
                    }
                    return null;
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        public final boolean c(z4.h hVar) {
            return hVar != null && hVar.compareTo(z4.h.f58636f.a()) >= 0;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class b implements g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f7742a;

        public b(n this$0) {
            kotlin.jvm.internal.s.h(this$0, "this$0");
            this.f7742a = this$0;
        }

        @Override // androidx.window.layout.g.a
        public void a(Activity activity, u newLayout) {
            kotlin.jvm.internal.s.h(activity, "activity");
            kotlin.jvm.internal.s.h(newLayout, "newLayout");
            for (c cVar : this.f7742a.h()) {
                if (kotlin.jvm.internal.s.c(cVar.d(), activity)) {
                    cVar.b(newLayout);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f7743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f7744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final m0.a f7745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private u f7746d;

        public c(Activity activity, Executor executor, m0.a callback) {
            kotlin.jvm.internal.s.h(activity, "activity");
            kotlin.jvm.internal.s.h(executor, "executor");
            kotlin.jvm.internal.s.h(callback, "callback");
            this.f7743a = activity;
            this.f7744b = executor;
            this.f7745c = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c this$0, u newLayoutInfo) {
            kotlin.jvm.internal.s.h(this$0, "this$0");
            kotlin.jvm.internal.s.h(newLayoutInfo, "$newLayoutInfo");
            this$0.f7745c.accept(newLayoutInfo);
        }

        public final void b(final u newLayoutInfo) {
            kotlin.jvm.internal.s.h(newLayoutInfo, "newLayoutInfo");
            this.f7746d = newLayoutInfo;
            this.f7744b.execute(new Runnable() { // from class: androidx.window.layout.o
                @Override // java.lang.Runnable
                public final void run() {
                    n.c.c(this.f7747a, newLayoutInfo);
                }
            });
        }

        public final Activity d() {
            return this.f7743a;
        }

        public final m0.a e() {
            return this.f7745c;
        }

        public final u f() {
            return this.f7746d;
        }
    }

    public n(g gVar) {
        this.f7740a = gVar;
        g gVar2 = this.f7740a;
        if (gVar2 == null) {
            return;
        }
        gVar2.a(new b(this));
    }

    private final void f(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7741b;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.s.c(((c) it.next()).d(), activity)) {
                    return;
                }
            }
        }
        g gVar = this.f7740a;
        if (gVar == null) {
            return;
        }
        gVar.c(activity);
    }

    private final boolean i(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7741b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.s.c(((c) it.next()).d(), activity)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.window.layout.p
    public void a(Activity activity, Executor executor, m0.a callback) {
        u uVarF;
        Object next;
        kotlin.jvm.internal.s.h(activity, "activity");
        kotlin.jvm.internal.s.h(executor, "executor");
        kotlin.jvm.internal.s.h(callback, "callback");
        ReentrantLock reentrantLock = f7739e;
        reentrantLock.lock();
        try {
            g gVarG = g();
            if (gVarG == null) {
                callback.accept(new u(gl.r.l()));
                return;
            }
            boolean zI = i(activity);
            c cVar = new c(activity, executor, callback);
            h().add(cVar);
            if (zI) {
                Iterator it = h().iterator();
                do {
                    uVarF = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.s.c(activity, ((c) next).d()));
                c cVar2 = (c) next;
                if (cVar2 != null) {
                    uVarF = cVar2.f();
                }
                if (uVarF != null) {
                    cVar.b(uVarF);
                }
            } else {
                gVarG.b(activity);
            }
            g0 g0Var = g0.f38750a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.p
    public void b(m0.a callback) {
        kotlin.jvm.internal.s.h(callback, "callback");
        synchronized (f7739e) {
            try {
                if (g() == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (c callbackWrapper : h()) {
                    if (callbackWrapper.e() == callback) {
                        kotlin.jvm.internal.s.g(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                h().removeAll(arrayList);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    f(((c) obj).d());
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final g g() {
        return this.f7740a;
    }

    public final CopyOnWriteArrayList h() {
        return this.f7741b;
    }
}
