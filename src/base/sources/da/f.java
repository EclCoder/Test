package da;

import com.google.android.exoplayer2.ParserException;
import ob.d0;
import u9.l;
import u9.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f36515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f36516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f36517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f36518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f36521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f36522j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d0 f36523k = new d0(255);

    f() {
    }

    public boolean a(l lVar, boolean z10) throws ParserException {
        b();
        this.f36523k.Q(27);
        if (!n.b(lVar, this.f36523k.e(), 0, 27, z10) || this.f36523k.J() != 1332176723) {
            return false;
        }
        int iH = this.f36523k.H();
        this.f36513a = iH;
        if (iH != 0) {
            if (z10) {
                return false;
            }
            throw ParserException.e("unsupported bit stream revision");
        }
        this.f36514b = this.f36523k.H();
        this.f36515c = this.f36523k.v();
        this.f36516d = this.f36523k.x();
        this.f36517e = this.f36523k.x();
        this.f36518f = this.f36523k.x();
        int iH2 = this.f36523k.H();
        this.f36519g = iH2;
        this.f36520h = iH2 + 27;
        this.f36523k.Q(iH2);
        if (!n.b(lVar, this.f36523k.e(), 0, this.f36519g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f36519g; i10++) {
            this.f36522j[i10] = this.f36523k.H();
            this.f36521i += this.f36522j[i10];
        }
        return true;
    }

    public void b() {
        this.f36513a = 0;
        this.f36514b = 0;
        this.f36515c = 0L;
        this.f36516d = 0L;
        this.f36517e = 0L;
        this.f36518f = 0L;
        this.f36519g = 0;
        this.f36520h = 0;
        this.f36521i = 0;
    }

    public boolean c(l lVar) {
        return d(lVar, -1L);
    }

    public boolean d(l lVar, long j10) {
        ob.a.a(lVar.getPosition() == lVar.getPeekPosition());
        this.f36523k.Q(4);
        while (true) {
            if ((j10 != -1 && lVar.getPosition() + 4 >= j10) || !n.b(lVar, this.f36523k.e(), 0, 4, true)) {
                break;
            }
            this.f36523k.U(0);
            if (this.f36523k.J() == 1332176723) {
                lVar.resetPeekPosition();
                return true;
            }
            lVar.skipFully(1);
        }
        do {
            if (j10 != -1 && lVar.getPosition() >= j10) {
                break;
            }
        } while (lVar.skip(1) != -1);
        return false;
    }
}
