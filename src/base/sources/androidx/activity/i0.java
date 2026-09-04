package androidx.activity;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0.a f581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fl.k f583d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class a extends e4.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e4.c f584c;

        public a() {
            e4.c cVar = new e4.c(new e4.l() { // from class: androidx.activity.h0
                @Override // e4.l
                public final void a() {
                    i0.a.o(i0Var);
                }
            });
            cVar.c(this);
            this.f584c = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(i0 i0Var) {
            Runnable runnable = i0Var.f580a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // e4.h
        protected void j(boolean z10) {
            i0.this.f582c = z10;
            m0.a aVar = i0.this.f581b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z10));
            }
        }

        public final void n() {
            b();
        }

        public final e4.c p() {
            return this.f584c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements androidx.lifecycle.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d0.a f586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i0 f587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.s f588c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f589a;

            static {
                int[] iArr = new int[androidx.lifecycle.s.a.values().length];
                try {
                    iArr[androidx.lifecycle.s.a.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.s.a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.lifecycle.s.a.ON_DESTROY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f589a = iArr;
            }
        }

        b(d0.a aVar, i0 i0Var, androidx.lifecycle.s sVar) {
            this.f586a = aVar;
            this.f587b = i0Var;
            this.f588c = sVar;
        }

        @Override // androidx.lifecycle.y
        public void c(androidx.lifecycle.b0 source, androidx.lifecycle.s.a event) {
            kotlin.jvm.internal.s.h(source, "source");
            kotlin.jvm.internal.s.h(event, "event");
            int i10 = a.f589a[event.ordinal()];
            if (i10 == 1) {
                if (androidx.activity.a.f553b) {
                    this.f586a.A(true);
                    return;
                } else {
                    e4.c.b(this.f587b.j(), this.f586a, 0, 2, null);
                    return;
                }
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f586a.w();
                this.f588c.d(this);
                return;
            }
            if (androidx.activity.a.f553b) {
                this.f586a.A(false);
            } else {
                this.f586a.w();
            }
        }
    }

    public i0(Runnable runnable, m0.a aVar) {
        this.f580a = runnable;
        this.f581b = aVar;
        this.f583d = fl.l.b(new tl.a() { // from class: androidx.activity.f0
            @Override // tl.a
            public final Object invoke() {
                return i0.i(this.f573a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(androidx.lifecycle.s sVar, b bVar) {
        sVar.d(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a i(i0 i0Var) {
        return i0Var.new a();
    }

    private final a k() {
        return (a) this.f583d.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(d0 onBackPressedCallback) {
        kotlin.jvm.internal.s.h(onBackPressedCallback, "onBackPressedCallback");
        e4.c.b(j(), onBackPressedCallback.b(new e0(onBackPressedCallback, null, 2, 0 == true ? 1 : 0)), 0, 2, null);
    }

    public final void g(androidx.lifecycle.b0 owner, d0 onBackPressedCallback) {
        kotlin.jvm.internal.s.h(owner, "owner");
        kotlin.jvm.internal.s.h(onBackPressedCallback, "onBackPressedCallback");
        final androidx.lifecycle.s lifecycle = owner.getLifecycle();
        if (lifecycle.b() == androidx.lifecycle.s.b.DESTROYED) {
            return;
        }
        d0.a aVarB = onBackPressedCallback.b(new e0(onBackPressedCallback, owner));
        if (androidx.activity.a.f553b) {
            aVarB.A(false);
            e4.c.b(j(), aVarB, 0, 2, null);
        }
        final b bVar = new b(aVarB, this, lifecycle);
        lifecycle.a(bVar);
        onBackPressedCallback.a(new AutoCloseable() { // from class: androidx.activity.g0
            @Override // java.lang.AutoCloseable
            public final void close() {
                i0.h(lifecycle, bVar);
            }
        });
    }

    public final e4.c j() {
        return k().p();
    }

    public final void l() {
        k().n();
    }

    public final void m(OnBackInvokedDispatcher invoker) {
        kotlin.jvm.internal.s.h(invoker, "invoker");
        j().d(new e4.m(invoker), 1);
        j().d(new e4.p(invoker), 0);
    }

    public i0(Runnable runnable) {
        this(runnable, null);
    }
}
