package n0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f46715a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Window f46716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k0 f46717b;

        a(Window window, k0 k0Var) {
            this.f46716a = window;
            this.f46717b = k0Var;
        }

        private void g(int i10) {
            if (i10 == 1) {
                h(4);
            } else if (i10 == 2) {
                h(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f46717b.a();
            }
        }

        private void j(int i10) {
            if (i10 == 1) {
                k(4);
                l(UserVerificationMethods.USER_VERIFY_ALL);
            } else if (i10 == 2) {
                k(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f46717b.b();
            }
        }

        @Override // n0.o1.g
        void a(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    g(i11);
                }
            }
        }

        @Override // n0.o1.g
        void e(int i10) {
            this.f46716a.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                k(6144);
                return;
            }
            if (i10 == 1) {
                k(4096);
                h(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                k(2048);
                h(4096);
            }
        }

        @Override // n0.o1.g
        void f(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    j(i11);
                }
            }
        }

        protected void h(int i10) {
            View decorView = this.f46716a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void i(int i10) {
            this.f46716a.addFlags(i10);
        }

        protected void k(int i10) {
            View decorView = this.f46716a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void l(int i10) {
            this.f46716a.clearFlags(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b extends a {
        b(Window window, k0 k0Var) {
            super(window, k0Var);
        }

        @Override // n0.o1.g
        public boolean b() {
            return (this.f46716a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // n0.o1.g
        public void d(boolean z10) {
            if (!z10) {
                k(8192);
                return;
            }
            l(67108864);
            i(Integer.MIN_VALUE);
            h(8192);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends b {
        c(Window window, k0 k0Var) {
            super(window, k0Var);
        }

        @Override // n0.o1.g
        public void c(boolean z10) {
            if (!z10) {
                k(16);
                return;
            }
            l(134217728);
            i(Integer.MIN_VALUE);
            h(16);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class e extends d {
        e(Window window, o1 o1Var, k0 k0Var) {
            super(window, o1Var, k0Var);
        }

        @Override // n0.o1.d, n0.o1.g
        void e(int i10) {
            this.f46719b.setSystemBarsBehavior(i10);
        }

        e(WindowInsetsController windowInsetsController, o1 o1Var, k0 k0Var) {
            super(windowInsetsController, o1Var, k0Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class f extends e {
        f(Window window, o1 o1Var, k0 k0Var) {
            super(window, o1Var, k0Var);
        }

        @Override // n0.o1.d, n0.o1.g
        public boolean b() {
            return (this.f46719b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // n0.o1.d, n0.o1.g
        public void c(boolean z10) {
            this.f46719b.setSystemBarsAppearance(z10 ? 16 : 0, 16);
        }

        @Override // n0.o1.d, n0.o1.g
        public void d(boolean z10) {
            this.f46719b.setSystemBarsAppearance(z10 ? 8 : 0, 8);
        }

        f(WindowInsetsController windowInsetsController, o1 o1Var, k0 k0Var) {
            super(windowInsetsController, o1Var, k0Var);
        }
    }

    private o1(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f46715a = new f(windowInsetsController, this, new k0(windowInsetsController));
        } else {
            this.f46715a = new d(windowInsetsController, this, new k0(windowInsetsController));
        }
    }

    public static o1 g(WindowInsetsController windowInsetsController) {
        return new o1(windowInsetsController);
    }

    public void a(int i10) {
        this.f46715a.a(i10);
    }

    public boolean b() {
        return this.f46715a.b();
    }

    public void c(boolean z10) {
        this.f46715a.c(z10);
    }

    public void d(boolean z10) {
        this.f46715a.d(z10);
    }

    public void e(int i10) {
        this.f46715a.e(i10);
    }

    public void f(int i10) {
        this.f46715a.f(i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final o1 f46718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowInsetsController f46719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final k0 f46720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.collection.u f46721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected Window f46722e;

        d(Window window, o1 o1Var, k0 k0Var) {
            this(window.getInsetsController(), o1Var, k0Var);
            this.f46722e = window;
        }

        private boolean g(int i10, int i11) {
            Window window = this.f46722e;
            if (window != null) {
                return (i10 & window.getDecorView().getSystemUiVisibility()) != 0;
            }
            this.f46719b.setSystemBarsAppearance(0, 0);
            return (this.f46719b.getSystemBarsAppearance() & i11) != 0;
        }

        private void h(boolean z10, int i10, int i11) {
            if (this.f46722e != null) {
                if (z10) {
                    i(i10);
                    return;
                } else {
                    j(i10);
                    return;
                }
            }
            if (z10) {
                this.f46719b.setSystemBarsAppearance(i11, i11);
            } else {
                this.f46719b.setSystemBarsAppearance(0, i11);
            }
        }

        @Override // n0.o1.g
        void a(int i10) {
            if ((i10 & 8) != 0) {
                this.f46720c.a();
            }
            this.f46719b.hide(i10 & (-9));
        }

        @Override // n0.o1.g
        public boolean b() {
            return g(8192, 8);
        }

        @Override // n0.o1.g
        public void c(boolean z10) {
            h(z10, 16, 16);
        }

        @Override // n0.o1.g
        public void d(boolean z10) {
            h(z10, 8192, 8);
        }

        @Override // n0.o1.g
        void e(int i10) {
            Window window = this.f46722e;
            if (window == null) {
                this.f46719b.setSystemBarsBehavior(i10);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                j(6144);
                return;
            }
            if (i10 == 1) {
                j(4096);
                i(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                j(2048);
                i(4096);
            }
        }

        @Override // n0.o1.g
        void f(int i10) {
            if ((i10 & 8) != 0) {
                this.f46720c.b();
            }
            this.f46719b.show(i10 & (-9));
        }

        protected void i(int i10) {
            View decorView = this.f46722e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void j(int i10) {
            View decorView = this.f46722e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, o1 o1Var, k0 k0Var) {
            this.f46721d = new androidx.collection.u();
            this.f46719b = windowInsetsController;
            this.f46718a = o1Var;
            this.f46720c = k0Var;
        }
    }

    public o1(Window window, View view) {
        k0 k0Var = new k0(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f46715a = new f(window, this, k0Var);
            return;
        }
        if (i10 >= 30) {
            this.f46715a = new d(window, this, k0Var);
        } else if (i10 >= 26) {
            this.f46715a = new c(window, k0Var);
        } else {
            this.f46715a = new b(window, k0Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class g {
        g() {
        }

        abstract void a(int i10);

        public abstract boolean b();

        public abstract void d(boolean z10);

        abstract void e(int i10);

        abstract void f(int i10);

        public void c(boolean z10) {
        }
    }
}
