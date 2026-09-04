package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class l implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final ThreadLocal f7013e = new ThreadLocal();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static Comparator f7014f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f7016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f7017c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f7015a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f7018d = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f7026d;
            if ((recyclerView == null) != (cVar2.f7026d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f7023a;
            if (z10 != cVar2.f7023a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f7024b - cVar.f7024b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f7025c - cVar2.f7025c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b implements RecyclerView.q.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f7021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f7022d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f7022d;
            int i13 = i12 * 2;
            int[] iArr = this.f7021c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f7021c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f7021c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f7021c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f7022d++;
        }

        void b() {
            int[] iArr = this.f7021c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f7022d = 0;
        }

        void c(RecyclerView recyclerView, boolean z10) {
            this.f7022d = 0;
            int[] iArr = this.f7021c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.q qVar = recyclerView.f6660n;
            if (recyclerView.f6658m == null || qVar == null || !qVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f6642e.p()) {
                    qVar.collectInitialPrefetchPositions(recyclerView.f6658m.getItemCount(), this);
                }
            } else if (!recyclerView.w0()) {
                qVar.collectAdjacentPrefetchPositions(this.f7019a, this.f7020b, recyclerView.f6651i0, this);
            }
            int i10 = this.f7022d;
            if (i10 > qVar.mPrefetchMaxCountObserved) {
                qVar.mPrefetchMaxCountObserved = i10;
                qVar.mPrefetchMaxObservedInInitialPrefetch = z10;
                recyclerView.f6638c.P();
            }
        }

        boolean d(int i10) {
            if (this.f7021c != null) {
                int i11 = this.f7022d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f7021c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f7019a = i10;
            this.f7020b = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f7026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7027e;

        c() {
        }

        public void a() {
            this.f7023a = false;
            this.f7024b = 0;
            this.f7025c = 0;
            this.f7026d = null;
            this.f7027e = 0;
        }
    }

    l() {
    }

    private void b() {
        c cVar;
        int size = this.f7015a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = (RecyclerView) this.f7015a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f6649h0.c(recyclerView, false);
                i10 += recyclerView.f6649h0.f7022d;
            }
        }
        this.f7018d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f7015a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f6649h0;
                int iAbs = Math.abs(bVar.f7019a) + Math.abs(bVar.f7020b);
                for (int i14 = 0; i14 < bVar.f7022d * 2; i14 += 2) {
                    if (i12 >= this.f7018d.size()) {
                        cVar = new c();
                        this.f7018d.add(cVar);
                    } else {
                        cVar = (c) this.f7018d.get(i12);
                    }
                    int[] iArr = bVar.f7021c;
                    int i15 = iArr[i14 + 1];
                    cVar.f7023a = i15 <= iAbs;
                    cVar.f7024b = iAbs;
                    cVar.f7025c = i15;
                    cVar.f7026d = recyclerView2;
                    cVar.f7027e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f7018d, f7014f);
    }

    private void c(c cVar, long j10) {
        RecyclerView.g0 g0VarI = i(cVar.f7026d, cVar.f7027e, cVar.f7023a ? Long.MAX_VALUE : j10);
        if (g0VarI == null || g0VarI.mNestedRecyclerView == null || !g0VarI.isBound() || g0VarI.isInvalid()) {
            return;
        }
        h(g0VarI.mNestedRecyclerView.get(), j10);
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f7018d.size(); i10++) {
            c cVar = (c) this.f7018d.get(i10);
            if (cVar.f7026d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.f6644f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.g0 g0VarP0 = RecyclerView.p0(recyclerView.f6644f.i(i11));
            if (g0VarP0.mPosition == i10 && !g0VarP0.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.E && recyclerView.f6644f.j() != 0) {
            recyclerView.i1();
        }
        b bVar = recyclerView.f6649h0;
        bVar.c(recyclerView, true);
        if (bVar.f7022d != 0) {
            try {
                Trace.beginSection(j10 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                recyclerView.f6651i0.f(recyclerView.f6658m);
                for (int i10 = 0; i10 < bVar.f7022d * 2; i10 += 2) {
                    i(recyclerView, bVar.f7021c[i10], j10);
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    private RecyclerView.g0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.x xVar = recyclerView.f6638c;
        if (j10 == Long.MAX_VALUE) {
            try {
                if (j0.o.c()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.U0(false);
                Trace.endSection();
            }
        }
        recyclerView.S0();
        RecyclerView.g0 g0VarN = xVar.N(i10, false, j10);
        if (g0VarN != null) {
            if (!g0VarN.isBound() || g0VarN.isInvalid()) {
                xVar.a(g0VarN, false);
            } else {
                xVar.G(g0VarN.itemView);
            }
        }
        return g0VarN;
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.E0 && this.f7015a.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f7015a.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.E0 && !this.f7015a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f7016b == 0) {
                this.f7016b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f6649h0.e(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        boolean zRemove = this.f7015a.remove(recyclerView);
        if (RecyclerView.E0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (!this.f7015a.isEmpty()) {
                int size = this.f7015a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) this.f7015a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f7017c);
                }
            }
        } finally {
            this.f7016b = 0L;
            Trace.endSection();
        }
    }
}
