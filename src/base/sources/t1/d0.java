package t1;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f52651b = new d0(com.google.common.collect.c0.C());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f52652c = w1.c0.s0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.collect.c0 f52653a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f52654f = w1.c0.s0(0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f52655g = w1.c0.s0(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f52656h = w1.c0.s0(3);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f52657i = w1.c0.s0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f52658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b0 f52659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f52660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f52661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean[] f52662e;

        public a(b0 b0Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = b0Var.f52572a;
            this.f52658a = i10;
            boolean z11 = false;
            w1.a.a(i10 == iArr.length && i10 == zArr.length);
            this.f52659b = b0Var;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f52660c = z11;
            this.f52661d = (int[]) iArr.clone();
            this.f52662e = (boolean[]) zArr.clone();
        }

        public b0 a() {
            return this.f52659b;
        }

        public o b(int i10) {
            return this.f52659b.a(i10);
        }

        public int c() {
            return this.f52659b.f52574c;
        }

        public boolean d() {
            return com.google.common.primitives.a.b(this.f52662e, true);
        }

        public boolean e(int i10) {
            return this.f52662e[i10];
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f52660c == aVar.f52660c && this.f52659b.equals(aVar.f52659b) && Arrays.equals(this.f52661d, aVar.f52661d) && Arrays.equals(this.f52662e, aVar.f52662e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f52659b.hashCode() * 31) + (this.f52660c ? 1 : 0)) * 31) + Arrays.hashCode(this.f52661d)) * 31) + Arrays.hashCode(this.f52662e);
        }
    }

    public d0(List list) {
        this.f52653a = com.google.common.collect.c0.x(list);
    }

    public com.google.common.collect.c0 a() {
        return this.f52653a;
    }

    public boolean b(int i10) {
        for (int i11 = 0; i11 < this.f52653a.size(); i11++) {
            a aVar = (a) this.f52653a.get(i11);
            if (aVar.d() && aVar.c() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        return this.f52653a.equals(((d0) obj).f52653a);
    }

    public int hashCode() {
        return this.f52653a.hashCode();
    }
}
