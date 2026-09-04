package t1;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f52721a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f52722a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f52723b;

        public b a(int i10) {
            w1.a.g(!this.f52723b);
            this.f52722a.append(i10, true);
            return this;
        }

        public b b(n nVar) {
            for (int i10 = 0; i10 < nVar.c(); i10++) {
                a(nVar.b(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public n e() {
            w1.a.g(!this.f52723b);
            this.f52723b = true;
            return new n(this.f52722a);
        }
    }

    public boolean a(int i10) {
        return this.f52721a.get(i10);
    }

    public int b(int i10) {
        w1.a.c(i10, 0, c());
        return this.f52721a.keyAt(i10);
    }

    public int c() {
        return this.f52721a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (w1.c0.f55769a >= 24) {
            return this.f52721a.equals(nVar.f52721a);
        }
        if (c() != nVar.c()) {
            return false;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            if (b(i10) != nVar.b(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (w1.c0.f55769a >= 24) {
            return this.f52721a.hashCode();
        }
        int iC = c();
        for (int i10 = 0; i10 < c(); i10++) {
            iC = (iC * 31) + b(i10);
        }
        return iC;
    }

    private n(SparseBooleanArray sparseBooleanArray) {
        this.f52721a = sparseBooleanArray;
    }
}
