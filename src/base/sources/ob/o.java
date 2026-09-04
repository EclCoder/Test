package ob;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f48412a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f48413a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f48414b;

        public b a(int i10) {
            ob.a.g(!this.f48414b);
            this.f48413a.append(i10, true);
            return this;
        }

        public b b(o oVar) {
            for (int i10 = 0; i10 < oVar.d(); i10++) {
                a(oVar.c(i10));
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

        public o e() {
            ob.a.g(!this.f48414b);
            this.f48414b = true;
            return new o(this.f48413a);
        }
    }

    public boolean a(int i10) {
        return this.f48412a.get(i10);
    }

    public boolean b(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i10) {
        ob.a.c(i10, 0, d());
        return this.f48412a.keyAt(i10);
    }

    public int d() {
        return this.f48412a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (r0.f48425a >= 24) {
            return this.f48412a.equals(oVar.f48412a);
        }
        if (d() != oVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (c(i10) != oVar.c(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (r0.f48425a >= 24) {
            return this.f48412a.hashCode();
        }
        int iD = d();
        for (int i10 = 0; i10 < d(); i10++) {
            iD = (iD * 31) + c(i10);
        }
        return iD;
    }

    private o(SparseBooleanArray sparseBooleanArray) {
        this.f48412a = sparseBooleanArray;
    }
}
