package ea;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.n0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f37638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ob.c0 f37639b = new ob.c0(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37640c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n0 f37642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f37644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f37645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f37646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f37647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f37648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f37649l;

    public w(m mVar) {
        this.f37638a = mVar;
    }

    private boolean c(ob.d0 d0Var, byte[] bArr, int i10) {
        int iMin = Math.min(d0Var.a(), i10 - this.f37641d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            d0Var.V(iMin);
        } else {
            d0Var.l(bArr, this.f37641d, iMin);
        }
        int i11 = this.f37641d + iMin;
        this.f37641d = i11;
        return i11 == i10;
    }

    private boolean d() {
        this.f37639b.p(0);
        int iH = this.f37639b.h(24);
        if (iH != 1) {
            ob.u.i("PesReader", "Unexpected start code prefix: " + iH);
            this.f37647j = -1;
            return false;
        }
        this.f37639b.r(8);
        int iH2 = this.f37639b.h(16);
        this.f37639b.r(5);
        this.f37648k = this.f37639b.g();
        this.f37639b.r(2);
        this.f37643f = this.f37639b.g();
        this.f37644g = this.f37639b.g();
        this.f37639b.r(6);
        int iH3 = this.f37639b.h(8);
        this.f37646i = iH3;
        if (iH2 == 0) {
            this.f37647j = -1;
        } else {
            int i10 = (iH2 - 3) - iH3;
            this.f37647j = i10;
            if (i10 < 0) {
                ob.u.i("PesReader", "Found negative packet payload size: " + this.f37647j);
                this.f37647j = -1;
            }
        }
        return true;
    }

    private void e() {
        this.f37639b.p(0);
        this.f37649l = C.TIME_UNSET;
        if (this.f37643f) {
            this.f37639b.r(4);
            long jH = ((long) this.f37639b.h(3)) << 30;
            this.f37639b.r(1);
            long jH2 = jH | ((long) (this.f37639b.h(15) << 15));
            this.f37639b.r(1);
            long jH3 = jH2 | ((long) this.f37639b.h(15));
            this.f37639b.r(1);
            if (!this.f37645h && this.f37644g) {
                this.f37639b.r(4);
                long jH4 = ((long) this.f37639b.h(3)) << 30;
                this.f37639b.r(1);
                long jH5 = jH4 | ((long) (this.f37639b.h(15) << 15));
                this.f37639b.r(1);
                long jH6 = jH5 | ((long) this.f37639b.h(15));
                this.f37639b.r(1);
                this.f37642e.b(jH6);
                this.f37645h = true;
            }
            this.f37649l = this.f37642e.b(jH3);
        }
    }

    private void f(int i10) {
        this.f37640c = i10;
        this.f37641d = 0;
    }

    @Override // ea.i0
    public void a(n0 n0Var, u9.m mVar, i0.d dVar) {
        this.f37642e = n0Var;
        this.f37638a.d(mVar, dVar);
    }

    @Override // ea.i0
    public final void b(ob.d0 d0Var, int i10) {
        ob.a.i(this.f37642e);
        if ((i10 & 1) != 0) {
            int i11 = this.f37640c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    ob.u.i("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f37647j != -1) {
                        ob.u.i("PesReader", "Unexpected start indicator: expected " + this.f37647j + " more bytes");
                    }
                    this.f37638a.packetFinished();
                }
            }
            f(1);
        }
        while (d0Var.a() > 0) {
            int i12 = this.f37640c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        if (c(d0Var, this.f37639b.f48353a, Math.min(10, this.f37646i)) && c(d0Var, null, this.f37646i)) {
                            e();
                            i10 |= this.f37648k ? 4 : 0;
                            this.f37638a.c(this.f37649l, i10);
                            f(3);
                        }
                    } else {
                        if (i12 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = d0Var.a();
                        int i13 = this.f37647j;
                        int i14 = i13 != -1 ? iA - i13 : 0;
                        if (i14 > 0) {
                            iA -= i14;
                            d0Var.T(d0Var.f() + iA);
                        }
                        this.f37638a.b(d0Var);
                        int i15 = this.f37647j;
                        if (i15 != -1) {
                            int i16 = i15 - iA;
                            this.f37647j = i16;
                            if (i16 == 0) {
                                this.f37638a.packetFinished();
                                f(1);
                            }
                        }
                    }
                } else if (c(d0Var, this.f37639b.f48353a, 9)) {
                    f(d() ? 2 : 0);
                }
            } else {
                d0Var.V(d0Var.a());
            }
        }
    }

    @Override // ea.i0
    public final void seek() {
        this.f37640c = 0;
        this.f37641d = 0;
        this.f37645h = false;
        this.f37638a.seek();
    }
}
