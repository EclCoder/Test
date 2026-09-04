package o2;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface o0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f48135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f48137d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f48134a = i10;
            this.f48135b = bArr;
            this.f48136c = i11;
            this.f48137d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f48134a == aVar.f48134a && this.f48136c == aVar.f48136c && this.f48137d == aVar.f48137d && Arrays.equals(this.f48135b, aVar.f48135b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f48134a * 31) + Arrays.hashCode(this.f48135b)) * 31) + this.f48136c) * 31) + this.f48137d;
        }
    }

    default int a(t1.g gVar, int i10, boolean z10) {
        return d(gVar, i10, z10, 0);
    }

    void b(t1.o oVar);

    default void c(w1.u uVar, int i10) {
        f(uVar, i10, 0);
    }

    int d(t1.g gVar, int i10, boolean z10, int i11);

    void e(long j10, int i10, int i11, int i12, a aVar);

    void f(w1.u uVar, int i10, int i11);
}
