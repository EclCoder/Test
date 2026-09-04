package yn;

import xn.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class f {
    public static final long a(k0 k0Var, xn.h hVar, int i10, int i11, long j10, long j11) {
        kotlin.jvm.internal.s.h(k0Var, "<this>");
        xn.h bytes = hVar;
        kotlin.jvm.internal.s.h(bytes, "bytes");
        int i12 = i10;
        long j12 = i11;
        xn.b.b(bytes.D(), i12, j12);
        if (k0Var.f56945c) {
            throw new IllegalStateException("closed");
        }
        long jMax = j10;
        while (true) {
            long jB = a.b(k0Var.f56944b, bytes, jMax, j11, i12, i11);
            if (jB != -1) {
                return jB;
            }
            long size = (k0Var.f56944b.size() - j12) + 1;
            if (size >= j11) {
                return -1L;
            }
            long j13 = jMax;
            if (!c(k0Var.f56944b, hVar, i10, i11, j13, j11) || k0Var.f56943a.read(k0Var.f56944b, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(j13, size);
            bytes = hVar;
            i12 = i10;
        }
    }

    public static /* synthetic */ long b(k0 k0Var, xn.h hVar, int i10, int i11, long j10, long j11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = hVar.D();
        }
        return a(k0Var, hVar, i13, i11, j10, (i12 & 16) != 0 ? Long.MAX_VALUE : j11);
    }

    private static final boolean c(xn.e eVar, xn.h hVar, int i10, int i11, long j10, long j11) {
        if (eVar.size() < j11) {
            return true;
        }
        int iMax = (int) Math.max(1L, (eVar.size() - j11) + 1);
        int iMin = ((int) Math.min(i11, (eVar.size() - j10) + 1)) - 1;
        if (iMax > iMin) {
            return false;
        }
        int i12 = iMin;
        while (true) {
            xn.e eVar2 = eVar;
            xn.h hVar2 = hVar;
            int i13 = i10;
            if (eVar2.K0(eVar.size() - ((long) i12), hVar2, i13, i12)) {
                return true;
            }
            if (i12 == iMax) {
                return false;
            }
            i12--;
            eVar = eVar2;
            hVar = hVar2;
            i10 = i13;
        }
    }
}
