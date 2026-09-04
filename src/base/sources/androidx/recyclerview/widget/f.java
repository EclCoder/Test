package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f6880a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f6884e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6883d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f6881b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List f6882c = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f6885a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f6886b;

        a() {
        }

        private void c() {
            if (this.f6886b == null) {
                this.f6886b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f6885a &= ~(1 << i10);
                return;
            }
            a aVar = this.f6886b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        int b(int i10) {
            a aVar = this.f6886b;
            if (aVar == null) {
                return i10 >= 64 ? Long.bitCount(this.f6885a) : Long.bitCount(this.f6885a & ((1 << i10) - 1));
            }
            return i10 < 64 ? Long.bitCount(this.f6885a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f6885a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f6885a & (1 << i10)) != 0;
            }
            c();
            return this.f6886b.d(i10 - 64);
        }

        void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f6886b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f6885a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f6885a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f6886b != null) {
                c();
                this.f6886b.e(0, z11);
            }
        }

        boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f6886b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f6885a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f6885a = j12;
            long j13 = j10 - 1;
            this.f6885a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f6886b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f6886b.f(0);
            }
            return z10;
        }

        void g() {
            this.f6885a = 0L;
            a aVar = this.f6886b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 < 64) {
                this.f6885a |= 1 << i10;
            } else {
                c();
                this.f6886b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f6886b == null) {
                return Long.toBinaryString(this.f6885a);
            }
            return this.f6886b.toString() + "xx" + Long.toBinaryString(this.f6885a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface b {
        View a(int i10);

        void addView(View view, int i10);

        void b(View view);

        int c();

        RecyclerView.g0 d(View view);

        void e(int i10);

        void f();

        int g(View view);

        void h(View view);

        void i(int i10);

        void j(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    f(b bVar) {
        this.f6880a = bVar;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iC = this.f6880a.c();
        int i11 = i10;
        while (i11 < iC) {
            int iB = i10 - (i11 - this.f6881b.b(i11));
            if (iB == 0) {
                while (this.f6881b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f6882c.add(view);
        this.f6880a.b(view);
    }

    private boolean t(View view) {
        if (!this.f6882c.remove(view)) {
            return false;
        }
        this.f6880a.h(view);
        return true;
    }

    void a(View view, int i10, boolean z10) {
        int iC = i10 < 0 ? this.f6880a.c() : h(i10);
        this.f6881b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f6880a.addView(view, iC);
    }

    void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iC = i10 < 0 ? this.f6880a.c() : h(i10);
        this.f6881b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f6880a.j(view, iC, layoutParams);
    }

    void d(int i10) {
        int iH = h(i10);
        this.f6881b.f(iH);
        this.f6880a.e(iH);
    }

    View e(int i10) {
        int size = this.f6882c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f6882c.get(i11);
            RecyclerView.g0 g0VarD = this.f6880a.d(view);
            if (g0VarD.getLayoutPosition() == i10 && !g0VarD.isInvalid() && !g0VarD.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    View f(int i10) {
        return this.f6880a.a(h(i10));
    }

    int g() {
        return this.f6880a.c() - this.f6882c.size();
    }

    View i(int i10) {
        return this.f6880a.a(i10);
    }

    int j() {
        return this.f6880a.c();
    }

    void k(View view) {
        int iG = this.f6880a.g(view);
        if (iG >= 0) {
            this.f6881b.h(iG);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iG = this.f6880a.g(view);
        if (iG == -1 || this.f6881b.d(iG)) {
            return -1;
        }
        return iG - this.f6881b.b(iG);
    }

    boolean n(View view) {
        return this.f6882c.contains(view);
    }

    void o() {
        this.f6881b.g();
        for (int size = this.f6882c.size() - 1; size >= 0; size--) {
            this.f6880a.h((View) this.f6882c.get(size));
            this.f6882c.remove(size);
        }
        this.f6880a.f();
    }

    void p(View view) {
        int i10 = this.f6883d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f6883d = 1;
            this.f6884e = view;
            int iG = this.f6880a.g(view);
            if (iG >= 0) {
                if (this.f6881b.f(iG)) {
                    t(view);
                }
                this.f6880a.i(iG);
            }
        } finally {
            this.f6883d = 0;
            this.f6884e = null;
        }
    }

    void q(int i10) {
        int i11 = this.f6883d;
        if (i11 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iH = h(i10);
            View viewA = this.f6880a.a(iH);
            if (viewA != null) {
                this.f6883d = 1;
                this.f6884e = viewA;
                if (this.f6881b.f(iH)) {
                    t(viewA);
                }
                this.f6880a.i(iH);
            }
        } finally {
            this.f6883d = 0;
            this.f6884e = null;
        }
    }

    boolean r(View view) {
        int i10 = this.f6883d;
        if (i10 == 1) {
            if (this.f6884e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f6883d = 2;
            int iG = this.f6880a.g(view);
            if (iG == -1) {
                t(view);
                return true;
            }
            if (!this.f6881b.d(iG)) {
                return false;
            }
            this.f6881b.f(iG);
            t(view);
            this.f6880a.i(iG);
            return true;
        } finally {
            this.f6883d = 0;
        }
    }

    void s(View view) {
        int iG = this.f6880a.g(view);
        if (iG < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f6881b.d(iG)) {
            this.f6881b.a(iG);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f6881b.toString() + ", hidden list:" + this.f6882c.size();
    }
}
