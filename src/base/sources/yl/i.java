package yl;

import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends h {
    public static double b(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    public static float c(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static int d(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long e(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static int f(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long g(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static float h(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int i(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long j(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            return j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static d k(int i10, int i11) {
        return d.f58087d.a(i10, i11, -1);
    }

    public static d l(d dVar, int i10) {
        s.h(dVar, "<this>");
        h.a(i10 > 0, Integer.valueOf(i10));
        d.a aVar = d.f58087d;
        int iA = dVar.a();
        int iB = dVar.b();
        if (dVar.d() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iA, iB, i10);
    }

    public static f m(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? f.f58095e.a() : new f(i10, i11 - 1);
    }
}
