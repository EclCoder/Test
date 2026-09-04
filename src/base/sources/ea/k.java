package ea;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u9.b0 f37451d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f37453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f37454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f37455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private v0 f37456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f37457j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ob.d0 f37448a = new ob.d0(new byte[18]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37452e = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f37458k = C.TIME_UNSET;

    public k(String str) {
        this.f37449b = str;
    }

    private boolean a(ob.d0 d0Var, byte[] bArr, int i10) {
        int iMin = Math.min(d0Var.a(), i10 - this.f37453f);
        d0Var.l(bArr, this.f37453f, iMin);
        int i11 = this.f37453f + iMin;
        this.f37453f = i11;
        return i11 == i10;
    }

    private void e() {
        byte[] bArrE = this.f37448a.e();
        if (this.f37456i == null) {
            v0 v0VarG = q9.s.g(bArrE, this.f37450c, this.f37449b, null);
            this.f37456i = v0VarG;
            this.f37451d.e(v0VarG);
        }
        this.f37457j = q9.s.a(bArrE);
        this.f37455h = (int) ((((long) q9.s.f(bArrE)) * 1000000) / ((long) this.f37456i.f18882z));
    }

    private boolean f(ob.d0 d0Var) {
        while (d0Var.a() > 0) {
            int i10 = this.f37454g << 8;
            this.f37454g = i10;
            int iH = i10 | d0Var.H();
            this.f37454g = iH;
            if (q9.s.d(iH)) {
                byte[] bArrE = this.f37448a.e();
                int i11 = this.f37454g;
                bArrE[0] = (byte) ((i11 >> 24) & 255);
                bArrE[1] = (byte) ((i11 >> 16) & 255);
                bArrE[2] = (byte) ((i11 >> 8) & 255);
                bArrE[3] = (byte) (i11 & 255);
                this.f37453f = 4;
                this.f37454g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // ea.m
    public void b(ob.d0 d0Var) {
        ob.a.i(this.f37451d);
        while (d0Var.a() > 0) {
            int i10 = this.f37452e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(d0Var.a(), this.f37457j - this.f37453f);
                    this.f37451d.c(d0Var, iMin);
                    int i11 = this.f37453f + iMin;
                    this.f37453f = i11;
                    int i12 = this.f37457j;
                    if (i11 == i12) {
                        long j10 = this.f37458k;
                        if (j10 != C.TIME_UNSET) {
                            this.f37451d.f(j10, 1, i12, 0, null);
                            this.f37458k += this.f37455h;
                        }
                        this.f37452e = 0;
                    }
                } else if (a(d0Var, this.f37448a.e(), 18)) {
                    e();
                    this.f37448a.U(0);
                    this.f37451d.c(this.f37448a, 18);
                    this.f37452e = 2;
                }
            } else if (f(d0Var)) {
                this.f37452e = 1;
            }
        }
    }

    @Override // ea.m
    public void c(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f37458k = j10;
        }
    }

    @Override // ea.m
    public void d(u9.m mVar, i0.d dVar) {
        dVar.a();
        this.f37450c = dVar.b();
        this.f37451d = mVar.track(dVar.c(), 1);
    }

    @Override // ea.m
    public void seek() {
        this.f37452e = 0;
        this.f37453f = 0;
        this.f37454g = 0;
        this.f37458k = C.TIME_UNSET;
    }

    @Override // ea.m
    public void packetFinished() {
    }
}
