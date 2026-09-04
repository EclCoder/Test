package u9;

import com.google.android.exoplayer2.v0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface b0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f54234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f54235c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f54236d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f54233a = i10;
            this.f54234b = bArr;
            this.f54235c = i11;
            this.f54236d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f54233a == aVar.f54233a && this.f54235c == aVar.f54235c && this.f54236d == aVar.f54236d && Arrays.equals(this.f54234b, aVar.f54234b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f54233a * 31) + Arrays.hashCode(this.f54234b)) * 31) + this.f54235c) * 31) + this.f54236d;
        }
    }

    default int a(nb.h hVar, int i10, boolean z10) {
        return d(hVar, i10, z10, 0);
    }

    void b(ob.d0 d0Var, int i10, int i11);

    default void c(ob.d0 d0Var, int i10) {
        b(d0Var, i10, 0);
    }

    int d(nb.h hVar, int i10, boolean z10, int i11);

    void e(v0 v0Var);

    void f(long j10, int i10, int i11, int i12, a aVar);
}
