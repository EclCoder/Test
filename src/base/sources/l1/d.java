package l1;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f43740b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f43741a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(float f10, float f11, float f12, float f13, float f14, float f15) {
            float f16 = f12 - f10;
            float f17 = f13 - f11;
            long jC = y.c(f16, f17);
            float f18 = f14 - f10;
            float f19 = f15 - f11;
            long jC2 = y.c(f18, f19);
            long jM = y.m(jC);
            long jM2 = y.m(jC2);
            boolean z10 = p.c(jM, f18, f19) >= 0.0f;
            float fD = p.d(jC, jC2);
            if (fD > 0.999f) {
                return b(f12, f13, f14, f15);
            }
            float f20 = 1;
            float f21 = f20 - fD;
            float fD2 = ((((y.d(f16, f17) * 4.0f) / 3.0f) * (((float) Math.sqrt(2 * f21)) - ((float) Math.sqrt(f20 - (fD * fD))))) / f21) * (z10 ? 1.0f : -1.0f);
            return e.a(f12, f13, f12 + (p.g(jM) * fD2), f13 + (p.h(jM) * fD2), f14 - (p.g(jM2) * fD2), f15 - (p.h(jM2) * fD2), f14, f15);
        }

        public final d b(float f10, float f11, float f12, float f13) {
            return e.a(f10, f11, y.i(f10, f12, 0.33333334f), y.i(f11, f13, 0.33333334f), y.i(f10, f12, 0.6666667f), y.i(f11, f13, 0.6666667f), f12, f13);
        }

        private a() {
        }
    }

    public /* synthetic */ d(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    private final boolean o(float f10) {
        return Math.abs(f10) < 1.0E-4f;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c9 A[PHI: r3 r7
      0x01c9: PHI (r3v15 float) = (r3v12 float), (r3v21 float) binds: [B:85:0x0218, B:62:0x01c7] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r7v14 float) = (r7v10 float), (r7v16 float) binds: [B:85:0x0218, B:62:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x021b A[PHI: r9 r15
      0x021b: PHI (r9v5 float) = (r9v2 float), (r9v3 float), (r9v3 float), (r9v2 float), (r9v2 float), (r9v2 float) binds: [B:65:0x01d2, B:77:0x0201, B:79:0x0205, B:51:0x01a6, B:54:0x01b0, B:56:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r15v13 float) = (r15v9 float), (r15v10 float), (r15v10 float), (r15v9 float), (r15v9 float), (r15v9 float) binds: [B:65:0x01d2, B:77:0x0201, B:79:0x0205, B:51:0x01a6, B:54:0x01b0, B:56:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    public final void a(float[] bounds, boolean z10) {
        char c10;
        char c11;
        char c12;
        float f10;
        float fG;
        float fC;
        float fG2;
        float f11;
        float fSqrt;
        float fSqrt2;
        float fH;
        float f12;
        float fH2;
        float f13;
        kotlin.jvm.internal.s.h(bounds, "bounds");
        if (p()) {
            bounds[0] = b();
            bounds[1] = c();
            bounds[2] = b();
            bounds[3] = c();
            return;
        }
        float fMin = Math.min(b(), d());
        float fMin2 = Math.min(c(), e());
        float fMax = Math.max(b(), d());
        float fMax2 = Math.max(c(), e());
        if (z10) {
            bounds[0] = Math.min(fMin, Math.min(f(), h()));
            bounds[1] = Math.min(fMin2, Math.min(g(), i()));
            bounds[2] = Math.max(fMax, Math.max(f(), h()));
            bounds[3] = Math.max(fMax2, Math.max(g(), i()));
            return;
        }
        float f14 = 3;
        float f15 = (((-b()) + (f() * f14)) - (h() * f14)) + d();
        float f16 = 2;
        float f17 = 4;
        float fB = ((b() * f16) - (f() * f17)) + (h() * f16);
        float f18 = (-b()) + f();
        if (!o(f15)) {
            float f19 = (fB * fB) - ((f17 * f15) * f18);
            if (f19 >= 0.0f) {
                float f20 = -fB;
                c10 = 0;
                c11 = 3;
                double d10 = f19;
                c12 = 2;
                f10 = fMin2;
                float f21 = f15 * f16;
                float fSqrt3 = (((float) Math.sqrt(d10)) + f20) / f21;
                if (0.0f <= fSqrt3 && fSqrt3 <= 1.0f) {
                    float fG3 = p.g(k(fSqrt3));
                    if (fG3 < fMin) {
                        fMin = fG3;
                    }
                    if (fG3 > fMax) {
                        fMax = fG3;
                    }
                }
                float fSqrt4 = (f20 - ((float) Math.sqrt(d10))) / f21;
                if (0.0f <= fSqrt4 && fSqrt4 <= 1.0f) {
                    float fG4 = p.g(k(fSqrt4));
                    if (fG4 < fMin) {
                        fMin = fG4;
                    }
                    if (fG4 > fMax) {
                        fMax = fG4;
                    }
                }
            }
            fG = (((-c()) + (g() * f14)) - (f14 * i())) + e();
            fC = ((c() * f16) - (g() * f17)) + (i() * f16);
            fG2 = (-c()) + g();
            if (o(fG)) {
                f11 = (fC * fC) - ((f17 * fG) * fG2);
                if (f11 >= 0.0f) {
                    float f22 = -fC;
                    double d11 = f11;
                    float f23 = f16 * fG;
                    fSqrt = (((float) Math.sqrt(d11)) + f22) / f23;
                    if (0.0f <= fSqrt && fSqrt <= 1.0f) {
                        fH2 = p.h(k(fSqrt));
                        if (fH2 < f10) {
                            f10 = fH2;
                        }
                        if (fH2 > fMax2) {
                            fMax2 = fH2;
                        }
                    }
                    fSqrt2 = (f22 - ((float) Math.sqrt(d11))) / f23;
                    if (0.0f <= fSqrt2 || fSqrt2 > 1.0f) {
                        f12 = f10;
                    } else {
                        fH = p.h(k(fSqrt2));
                        f12 = fH < f10 ? fH : f10;
                        if (fH > fMax2) {
                            fMax2 = fH;
                        }
                    }
                } else {
                    f12 = f10;
                }
            } else if (fC == 0.0f) {
                f12 = f10;
            } else {
                f13 = (f16 * fG2) / ((-2) * fC);
                if (0.0f <= f13 || f13 > 1.0f) {
                    f12 = f10;
                } else {
                    fH = p.h(k(f13));
                    f12 = fH < f10 ? fH : f10;
                    if (fH > fMax2) {
                        fMax2 = fH;
                    }
                }
            }
            bounds[c10] = fMin;
            bounds[1] = f12;
            bounds[c12] = fMax;
            bounds[c11] = fMax2;
        }
        if (fB != 0.0f) {
            float f24 = (f18 * f16) / ((-2) * fB);
            if (0.0f <= f24 && f24 <= 1.0f) {
                float fG5 = p.g(k(f24));
                if (fG5 < fMin) {
                    fMin = fG5;
                }
                if (fG5 > fMax) {
                    fMax = fG5;
                }
            }
        }
        c10 = 0;
        c11 = 3;
        c12 = 2;
        f10 = fMin2;
        fG = (((-c()) + (g() * f14)) - (f14 * i())) + e();
        fC = ((c() * f16) - (g() * f17)) + (i() * f16);
        fG2 = (-c()) + g();
        if (o(fG)) {
            f11 = (fC * fC) - ((f17 * fG) * fG2);
            if (f11 >= 0.0f) {
                float f25 = -fC;
                double d12 = f11;
                float f26 = f16 * fG;
                fSqrt = (((float) Math.sqrt(d12)) + f25) / f26;
                if (0.0f <= fSqrt) {
                    fH2 = p.h(k(fSqrt));
                    if (fH2 < f10) {
                        f10 = fH2;
                    }
                    if (fH2 > fMax2) {
                        fMax2 = fH2;
                    }
                }
                fSqrt2 = (f25 - ((float) Math.sqrt(d12))) / f26;
                if (0.0f <= fSqrt2) {
                    f12 = f10;
                } else {
                    f12 = f10;
                }
            } else {
                f12 = f10;
            }
        } else if (fC == 0.0f) {
            f12 = f10;
        } else {
            f13 = (f16 * fG2) / ((-2) * fC);
            if (0.0f <= f13) {
                f12 = f10;
            } else {
                f12 = f10;
            }
        }
        bounds[c10] = fMin;
        bounds[1] = f12;
        bounds[c12] = fMax;
        bounds[c11] = fMax2;
    }

    public final float b() {
        return this.f43741a[0];
    }

    public final float c() {
        return this.f43741a[1];
    }

    public final float d() {
        return this.f43741a[6];
    }

    public final float e() {
        return this.f43741a[7];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return Arrays.equals(this.f43741a, ((d) obj).f43741a);
        }
        return false;
    }

    public final float f() {
        return this.f43741a[2];
    }

    public final float g() {
        return this.f43741a[3];
    }

    public final float h() {
        return this.f43741a[4];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f43741a);
    }

    public final float i() {
        return this.f43741a[5];
    }

    public final float[] j() {
        return this.f43741a;
    }

    public final long k(float f10) {
        float f11 = 1 - f10;
        float f12 = f11 * f11 * f11;
        float f13 = 3 * f10;
        float f14 = f13 * f11 * f11;
        float f15 = f13 * f10 * f11;
        float f16 = f10 * f10 * f10;
        return androidx.collection.g.b((b() * f12) + (f() * f14) + (h() * f15) + (d() * f16), (c() * f12) + (g() * f14) + (i() * f15) + (e() * f16));
    }

    public final d l() {
        return e.a(d(), e(), h(), i(), f(), g(), b(), c());
    }

    public final fl.q m(float f10) {
        float f11 = 1 - f10;
        long jK = k(f10);
        float f12 = f11 * f11;
        float f13 = 2 * f11 * f10;
        float f14 = f10 * f10;
        return fl.w.a(e.a(b(), c(), (b() * f11) + (f() * f10), (c() * f11) + (g() * f10), (b() * f12) + (f() * f13) + (h() * f14), (c() * f12) + (g() * f13) + (i() * f14), p.g(jK), p.h(jK)), e.a(p.g(jK), p.h(jK), (f() * f12) + (h() * f13) + (d() * f14), (g() * f12) + (i() * f13) + (e() * f14), (h() * f11) + (d() * f10), (i() * f11) + (e() * f10), d(), e()));
    }

    public final d n(q f10) {
        kotlin.jvm.internal.s.h(f10, "f");
        o oVar = new o();
        gl.j.m(this.f43741a, oVar.j(), 0, 0, 0, 14, null);
        oVar.q(f10);
        return oVar;
    }

    public final boolean p() {
        return Math.abs(b() - d()) < 1.0E-4f && Math.abs(c() - e()) < 1.0E-4f;
    }

    public String toString() {
        return "anchor0: (" + b() + ", " + c() + ") control0: (" + f() + ", " + g() + "), control1: (" + h() + ", " + i() + "), anchor1: (" + d() + ", " + e() + ')';
    }

    public d(float[] points) {
        kotlin.jvm.internal.s.h(points, "points");
        this.f43741a = points;
        if (points.length != 8) {
            throw new IllegalArgumentException("Points array size should be 8");
        }
    }

    public /* synthetic */ d(float[] fArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new float[8] : fArr);
    }

    private d(long j10, long j11, long j12, long j13) {
        this(new float[]{p.g(j10), p.h(j10), p.g(j11), p.h(j11), p.g(j12), p.h(j12), p.g(j13), p.h(j13)});
    }
}
