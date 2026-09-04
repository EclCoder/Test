package androidx.window.layout;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import fl.g0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowLayoutComponent f7698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReentrantLock f7699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f7700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f7701d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f7702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReentrantLock f7703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u f7704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set f7705d;

        public a(Activity activity) {
            kotlin.jvm.internal.s.h(activity, "activity");
            this.f7702a = activity;
            this.f7703b = new ReentrantLock();
            this.f7705d = new LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(WindowLayoutInfo value) {
            kotlin.jvm.internal.s.h(value, "value");
            ReentrantLock reentrantLock = this.f7703b;
            reentrantLock.lock();
            try {
                this.f7704c = i.f7706a.b(this.f7702a, value);
                Iterator it = this.f7705d.iterator();
                while (it.hasNext()) {
                    ((m0.a) it.next()).accept(this.f7704c);
                }
                g0 g0Var = g0.f38750a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(m0.a listener) {
            kotlin.jvm.internal.s.h(listener, "listener");
            ReentrantLock reentrantLock = this.f7703b;
            reentrantLock.lock();
            try {
                u uVar = this.f7704c;
                if (uVar != null) {
                    listener.accept(uVar);
                }
                this.f7705d.add(listener);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean c() {
            return this.f7705d.isEmpty();
        }

        public final void d(m0.a listener) {
            kotlin.jvm.internal.s.h(listener, "listener");
            ReentrantLock reentrantLock = this.f7703b;
            reentrantLock.lock();
            try {
                this.f7705d.remove(listener);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public h(WindowLayoutComponent component) {
        kotlin.jvm.internal.s.h(component, "component");
        this.f7698a = component;
        this.f7699b = new ReentrantLock();
        this.f7700c = new LinkedHashMap();
        this.f7701d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.p
    public void a(Activity activity, Executor executor, m0.a callback) {
        g0 g0Var;
        kotlin.jvm.internal.s.h(activity, "activity");
        kotlin.jvm.internal.s.h(executor, "executor");
        kotlin.jvm.internal.s.h(callback, "callback");
        ReentrantLock reentrantLock = this.f7699b;
        reentrantLock.lock();
        try {
            a aVar = (a) this.f7700c.get(activity);
            if (aVar == null) {
                g0Var = null;
            } else {
                aVar.b(callback);
                this.f7701d.put(callback, activity);
                g0Var = g0.f38750a;
            }
            if (g0Var == null) {
                a aVar2 = new a(activity);
                this.f7700c.put(activity, aVar2);
                this.f7701d.put(callback, activity);
                aVar2.b(callback);
                this.f7698a.addWindowLayoutInfoListener(activity, aVar2);
            }
            g0 g0Var2 = g0.f38750a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.p
    public void b(m0.a callback) {
        kotlin.jvm.internal.s.h(callback, "callback");
        ReentrantLock reentrantLock = this.f7699b;
        reentrantLock.lock();
        try {
            Activity activity = (Activity) this.f7701d.get(callback);
            if (activity == null) {
                return;
            }
            a aVar = (a) this.f7700c.get(activity);
            if (aVar == null) {
                return;
            }
            aVar.d(callback);
            if (aVar.c()) {
                this.f7698a.removeWindowLayoutInfoListener(aVar);
            }
            g0 g0Var = g0.f38750a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
