package aa;

import com.google.android.exoplayer2.ParserException;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayDeque;
import u9.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f160a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f161b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f162c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private aa.b f163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f166g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f168b;

        private b(int i10, long j10) {
            this.f167a = i10;
            this.f168b = j10;
        }
    }

    private long c(l lVar) {
        lVar.resetPeekPosition();
        while (true) {
            lVar.peekFully(this.f160a, 0, 4);
            int iC = g.c(this.f160a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f160a, iC, false);
                if (this.f163d.isLevel1Element(iA)) {
                    lVar.skipFully(iC);
                    return iA;
                }
            }
            lVar.skipFully(1);
        }
    }

    private double d(l lVar, int i10) {
        long jE = e(lVar, i10);
        return i10 == 4 ? Float.intBitsToFloat((int) jE) : Double.longBitsToDouble(jE);
    }

    private long e(l lVar, int i10) {
        lVar.readFully(this.f160a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f160a[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        return j10;
    }

    private static String f(l lVar, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        lVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // aa.c
    public boolean a(l lVar) throws ParserException {
        ob.a.i(this.f163d);
        while (true) {
            b bVar = (b) this.f161b.peek();
            if (bVar != null && lVar.getPosition() >= bVar.f168b) {
                this.f163d.endMasterElement(((b) this.f161b.pop()).f167a);
                return true;
            }
            if (this.f164e == 0) {
                long jD = this.f162c.d(lVar, true, false, 4);
                if (jD == -2) {
                    jD = c(lVar);
                }
                if (jD == -1) {
                    return false;
                }
                this.f165f = (int) jD;
                this.f164e = 1;
            }
            if (this.f164e == 1) {
                this.f166g = this.f162c.d(lVar, false, true, 8);
                this.f164e = 2;
            }
            int elementType = this.f163d.getElementType(this.f165f);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = lVar.getPosition();
                    this.f161b.push(new b(this.f165f, this.f166g + position));
                    this.f163d.startMasterElement(this.f165f, position, this.f166g);
                    this.f164e = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j10 = this.f166g;
                    if (j10 <= 8) {
                        this.f163d.integerElement(this.f165f, e(lVar, (int) j10));
                        this.f164e = 0;
                        return true;
                    }
                    throw ParserException.a("Invalid integer size: " + this.f166g, null);
                }
                if (elementType == 3) {
                    long j11 = this.f166g;
                    if (j11 <= 2147483647L) {
                        this.f163d.stringElement(this.f165f, f(lVar, (int) j11));
                        this.f164e = 0;
                        return true;
                    }
                    throw ParserException.a("String element size: " + this.f166g, null);
                }
                if (elementType == 4) {
                    this.f163d.a(this.f165f, (int) this.f166g, lVar);
                    this.f164e = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw ParserException.a("Invalid element type " + elementType, null);
                }
                long j12 = this.f166g;
                if (j12 == 4 || j12 == 8) {
                    this.f163d.floatElement(this.f165f, d(lVar, (int) j12));
                    this.f164e = 0;
                    return true;
                }
                throw ParserException.a("Invalid float size: " + this.f166g, null);
            }
            lVar.skipFully((int) this.f166g);
            this.f164e = 0;
        }
    }

    @Override // aa.c
    public void b(aa.b bVar) {
        this.f163d = bVar;
    }

    @Override // aa.c
    public void reset() {
        this.f164e = 0;
        this.f161b.clear();
        this.f162c.e();
    }
}
