package j3;

import androidx.media3.common.ParserException;
import o2.q;
import o2.s;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f41959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f41960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f41961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f41964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f41965j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final u f41966k = new u(255);

    f() {
    }

    public boolean a(q qVar, boolean z10) throws ParserException {
        b();
        this.f41966k.P(27);
        if (!s.b(qVar, this.f41966k.e(), 0, 27, z10) || this.f41966k.I() != 1332176723) {
            return false;
        }
        int iG = this.f41966k.G();
        this.f41956a = iG;
        if (iG != 0) {
            if (z10) {
                return false;
            }
            throw ParserException.c("unsupported bit stream revision");
        }
        this.f41957b = this.f41966k.G();
        this.f41958c = this.f41966k.u();
        this.f41959d = this.f41966k.w();
        this.f41960e = this.f41966k.w();
        this.f41961f = this.f41966k.w();
        int iG2 = this.f41966k.G();
        this.f41962g = iG2;
        this.f41963h = iG2 + 27;
        this.f41966k.P(iG2);
        if (!s.b(qVar, this.f41966k.e(), 0, this.f41962g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f41962g; i10++) {
            this.f41965j[i10] = this.f41966k.G();
            this.f41964i += this.f41965j[i10];
        }
        return true;
    }

    public void b() {
        this.f41956a = 0;
        this.f41957b = 0;
        this.f41958c = 0L;
        this.f41959d = 0L;
        this.f41960e = 0L;
        this.f41961f = 0L;
        this.f41962g = 0;
        this.f41963h = 0;
        this.f41964i = 0;
    }

    public boolean c(q qVar) {
        return d(qVar, -1L);
    }

    public boolean d(q qVar, long j10) {
        w1.a.a(qVar.getPosition() == qVar.getPeekPosition());
        this.f41966k.P(4);
        while (true) {
            if ((j10 != -1 && qVar.getPosition() + 4 >= j10) || !s.b(qVar, this.f41966k.e(), 0, 4, true)) {
                break;
            }
            this.f41966k.T(0);
            if (this.f41966k.I() == 1332176723) {
                qVar.resetPeekPosition();
                return true;
            }
            qVar.skipFully(1);
        }
        do {
            if (j10 != -1 && qVar.getPosition() >= j10) {
                break;
            }
        } while (qVar.skip(1) != -1);
        return false;
    }
}
