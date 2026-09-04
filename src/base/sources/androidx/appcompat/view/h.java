package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import n0.a1;
import n0.b1;
import n0.c1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    b1 f955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f956e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f953b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c1 f957f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList f952a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends c1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f958a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f959b = 0;

        a() {
        }

        @Override // n0.b1
        public void b(View view) {
            int i10 = this.f959b + 1;
            this.f959b = i10;
            if (i10 == h.this.f952a.size()) {
                b1 b1Var = h.this.f955d;
                if (b1Var != null) {
                    b1Var.b(null);
                }
                d();
            }
        }

        @Override // n0.c1, n0.b1
        public void c(View view) {
            if (this.f958a) {
                return;
            }
            this.f958a = true;
            b1 b1Var = h.this.f955d;
            if (b1Var != null) {
                b1Var.c(null);
            }
        }

        void d() {
            this.f959b = 0;
            this.f958a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f956e) {
            ArrayList arrayList = this.f952a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((a1) obj).c();
            }
            this.f956e = false;
        }
    }

    void b() {
        this.f956e = false;
    }

    public h c(a1 a1Var) {
        if (!this.f956e) {
            this.f952a.add(a1Var);
        }
        return this;
    }

    public h d(a1 a1Var, a1 a1Var2) {
        this.f952a.add(a1Var);
        a1Var2.i(a1Var.d());
        this.f952a.add(a1Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f956e) {
            this.f953b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f956e) {
            this.f954c = interpolator;
        }
        return this;
    }

    public h g(b1 b1Var) {
        if (!this.f956e) {
            this.f955d = b1Var;
        }
        return this;
    }

    public void h() {
        if (this.f956e) {
            return;
        }
        ArrayList arrayList = this.f952a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a1 a1Var = (a1) obj;
            long j10 = this.f953b;
            if (j10 >= 0) {
                a1Var.e(j10);
            }
            Interpolator interpolator = this.f954c;
            if (interpolator != null) {
                a1Var.f(interpolator);
            }
            if (this.f955d != null) {
                a1Var.g(this.f957f);
            }
            a1Var.k();
        }
        this.f956e = true;
    }
}
