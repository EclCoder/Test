package com.facebook.internal;

import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.facebook.FacebookException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f15313g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f15315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReentrantLock f15316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f15317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f15318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15319f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(boolean z10) {
            if (!z10) {
                throw new FacebookException("Validation failed");
            }
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a();

        boolean cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f15320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f15321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f15322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f15323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m1 f15324e;

        public c(m1 m1Var, Runnable callback) {
            kotlin.jvm.internal.s.h(callback, "callback");
            this.f15324e = m1Var;
            this.f15320a = callback;
        }

        @Override // com.facebook.internal.m1.b
        public void a() {
            ReentrantLock reentrantLock = this.f15324e.f15316c;
            m1 m1Var = this.f15324e;
            reentrantLock.lock();
            try {
                if (!d()) {
                    m1Var.f15317d = e(m1Var.f15317d);
                    m1Var.f15317d = b(m1Var.f15317d, true);
                }
                fl.g0 g0Var = fl.g0.f38750a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final c b(c cVar, boolean z10) {
            a aVar = m1.f15313g;
            aVar.b(this.f15321b == null);
            aVar.b(this.f15322c == null);
            if (cVar == null) {
                this.f15322c = this;
                this.f15321b = this;
                cVar = this;
            } else {
                this.f15321b = cVar;
                c cVar2 = cVar.f15322c;
                this.f15322c = cVar2;
                if (cVar2 != null) {
                    cVar2.f15321b = this;
                }
                c cVar3 = this.f15321b;
                if (cVar3 != null) {
                    cVar3.f15322c = cVar2 != null ? cVar2.f15321b : null;
                }
            }
            return z10 ? this : cVar;
        }

        public final Runnable c() {
            return this.f15320a;
        }

        @Override // com.facebook.internal.m1.b
        public boolean cancel() {
            ReentrantLock reentrantLock = this.f15324e.f15316c;
            m1 m1Var = this.f15324e;
            reentrantLock.lock();
            try {
                if (d()) {
                    fl.g0 g0Var = fl.g0.f38750a;
                    return false;
                }
                m1Var.f15317d = e(m1Var.f15317d);
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }

        public boolean d() {
            return this.f15323d;
        }

        public final c e(c cVar) {
            a aVar = m1.f15313g;
            aVar.b(this.f15321b != null);
            aVar.b(this.f15322c != null);
            if (cVar == this && (cVar = this.f15321b) == this) {
                cVar = null;
            }
            c cVar2 = this.f15321b;
            if (cVar2 != null) {
                cVar2.f15322c = this.f15322c;
            }
            c cVar3 = this.f15322c;
            if (cVar3 != null) {
                cVar3.f15321b = cVar2;
            }
            this.f15322c = null;
            this.f15321b = null;
            return cVar;
        }

        public void f(boolean z10) {
            this.f15323d = z10;
        }
    }

    public m1(int i10, Executor executor) {
        kotlin.jvm.internal.s.h(executor, UHbHibBvYxKnPE.Bqby);
        this.f15314a = i10;
        this.f15315b = executor;
        this.f15316c = new ReentrantLock();
    }

    public static /* synthetic */ b f(m1 m1Var, Runnable runnable, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return m1Var.e(runnable, z10);
    }

    private final void g(final c cVar) {
        this.f15315b.execute(new Runnable() { // from class: com.facebook.internal.l1
            @Override // java.lang.Runnable
            public final void run() {
                m1.h(cVar, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(c node, m1 this$0) {
        kotlin.jvm.internal.s.h(node, "$node");
        kotlin.jvm.internal.s.h(this$0, "this$0");
        try {
            node.c().run();
        } finally {
            this$0.i(node);
        }
    }

    private final void i(c cVar) {
        c cVar2;
        this.f15316c.lock();
        if (cVar != null) {
            this.f15318e = cVar.e(this.f15318e);
            this.f15319f--;
        }
        if (this.f15319f < this.f15314a) {
            cVar2 = this.f15317d;
            if (cVar2 != null) {
                this.f15317d = cVar2.e(cVar2);
                this.f15318e = cVar2.b(this.f15318e, false);
                this.f15319f++;
                cVar2.f(true);
            }
        } else {
            cVar2 = null;
        }
        this.f15316c.unlock();
        if (cVar2 != null) {
            g(cVar2);
        }
    }

    private final void j() {
        i(null);
    }

    public final b e(Runnable callback, boolean z10) {
        kotlin.jvm.internal.s.h(callback, "callback");
        c cVar = new c(this, callback);
        ReentrantLock reentrantLock = this.f15316c;
        reentrantLock.lock();
        try {
            this.f15317d = cVar.b(this.f15317d, z10);
            fl.g0 g0Var = fl.g0.f38750a;
            reentrantLock.unlock();
            j();
            return cVar;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public /* synthetic */ m1(int i10, Executor executor, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10, (i11 & 2) != 0 ? com.facebook.h0.v() : executor);
    }
}
