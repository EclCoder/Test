package g3;

import androidx.media3.common.ParserException;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayDeque;
import o2.q;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f38840a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f38841b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f38842c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g3.b f38843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f38846g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f38847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f38848b;

        private b(int i10, long j10) {
            this.f38847a = i10;
            this.f38848b = j10;
        }
    }

    private long c(q qVar) {
        qVar.resetPeekPosition();
        while (true) {
            qVar.peekFully(this.f38840a, 0, 4);
            int iC = g.c(this.f38840a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f38840a, iC, false);
                if (this.f38843d.isLevel1Element(iA)) {
                    qVar.skipFully(iC);
                    return iA;
                }
            }
            qVar.skipFully(1);
        }
    }

    private double d(q qVar, int i10) {
        long jE = e(qVar, i10);
        return i10 == 4 ? Float.intBitsToFloat((int) jE) : Double.longBitsToDouble(jE);
    }

    private long e(q qVar, int i10) {
        qVar.readFully(this.f38840a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f38840a[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        return j10;
    }

    private static String f(q qVar, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        qVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // g3.c
    public boolean a(q qVar) throws ParserException {
        w1.a.i(this.f38843d);
        while (true) {
            b bVar = (b) this.f38841b.peek();
            if (bVar != null && qVar.getPosition() >= bVar.f38848b) {
                this.f38843d.endMasterElement(((b) this.f38841b.pop()).f38847a);
                return true;
            }
            if (this.f38844e == 0) {
                long jD = this.f38842c.d(qVar, true, false, 4);
                if (jD == -2) {
                    jD = c(qVar);
                }
                if (jD == -1) {
                    return false;
                }
                this.f38845f = (int) jD;
                this.f38844e = 1;
            }
            if (this.f38844e == 1) {
                this.f38846g = this.f38842c.d(qVar, false, true, 8);
                this.f38844e = 2;
            }
            int elementType = this.f38843d.getElementType(this.f38845f);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = qVar.getPosition();
                    this.f38841b.push(new b(this.f38845f, this.f38846g + position));
                    this.f38843d.startMasterElement(this.f38845f, position, this.f38846g);
                    this.f38844e = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j10 = this.f38846g;
                    if (j10 <= 8) {
                        this.f38843d.integerElement(this.f38845f, e(qVar, (int) j10));
                        this.f38844e = 0;
                        return true;
                    }
                    throw ParserException.a("Invalid integer size: " + this.f38846g, null);
                }
                if (elementType == 3) {
                    long j11 = this.f38846g;
                    if (j11 <= 2147483647L) {
                        this.f38843d.stringElement(this.f38845f, f(qVar, (int) j11));
                        this.f38844e = 0;
                        return true;
                    }
                    throw ParserException.a("String element size: " + this.f38846g, null);
                }
                if (elementType == 4) {
                    this.f38843d.a(this.f38845f, (int) this.f38846g, qVar);
                    this.f38844e = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw ParserException.a("Invalid element type " + elementType, null);
                }
                long j12 = this.f38846g;
                if (j12 == 4 || j12 == 8) {
                    this.f38843d.floatElement(this.f38845f, d(qVar, (int) j12));
                    this.f38844e = 0;
                    return true;
                }
                throw ParserException.a("Invalid float size: " + this.f38846g, null);
            }
            qVar.skipFully((int) this.f38846g);
            this.f38844e = 0;
        }
    }

    @Override // g3.c
    public void b(g3.b bVar) {
        this.f38843d = bVar;
    }

    @Override // g3.c
    public void reset() {
        this.f38844e = 0;
        this.f38841b.clear();
        this.f38842c.e();
    }
}
