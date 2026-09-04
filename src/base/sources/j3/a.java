package j3;

import androidx.media3.common.ParserException;
import com.inmobi.media.core.config.models.CrashConfig;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import o2.j0;
import o2.k0;
import o2.q;
import o2.s;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f41928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f41929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f41930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f41931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f41933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f41934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f41935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f41936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f41937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f41938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f41939l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements j0 {
        private b() {
        }

        @Override // o2.j0
        public long getDurationUs() {
            return a.this.f41931d.b(a.this.f41933f);
        }

        @Override // o2.j0
        public j0.a getSeekPoints(long j10) {
            return new j0.a(new k0(j10, c0.p((a.this.f41929b + BigInteger.valueOf(a.this.f41931d.c(j10)).multiply(BigInteger.valueOf(a.this.f41930c - a.this.f41929b)).divide(BigInteger.valueOf(a.this.f41933f)).longValue()) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, a.this.f41929b, a.this.f41930c - 1)));
        }

        @Override // o2.j0
        public boolean isSeekable() {
            return true;
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        w1.a.a(j10 >= 0 && j11 > j10);
        this.f41931d = iVar;
        this.f41929b = j10;
        this.f41930c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f41933f = j13;
            this.f41932e = 4;
        } else {
            this.f41932e = 0;
        }
        this.f41928a = new f();
    }

    private long g(q qVar) throws IOException {
        if (this.f41936i == this.f41937j) {
            return -1L;
        }
        long position = qVar.getPosition();
        if (!this.f41928a.d(qVar, this.f41937j)) {
            long j10 = this.f41936i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f41928a.a(qVar, false);
        qVar.resetPeekPosition();
        long j11 = this.f41935h;
        f fVar = this.f41928a;
        long j12 = fVar.f41958c;
        long j13 = j11 - j12;
        int i10 = fVar.f41963h + fVar.f41964i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f41937j = position;
            this.f41939l = j12;
        } else {
            this.f41936i = qVar.getPosition() + ((long) i10);
            this.f41938k = this.f41928a.f41958c;
        }
        long j14 = this.f41937j;
        long j15 = this.f41936i;
        if (j14 - j15 < 100000) {
            this.f41937j = j15;
            return j15;
        }
        long position2 = qVar.getPosition() - (((long) i10) * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f41937j;
        long j17 = this.f41936i;
        return c0.p(position2 + ((j13 * (j16 - j17)) / (this.f41939l - this.f41938k)), j17, j16 - 1);
    }

    private void i(q qVar) throws ParserException {
        while (true) {
            this.f41928a.c(qVar);
            this.f41928a.a(qVar, false);
            f fVar = this.f41928a;
            if (fVar.f41958c > this.f41935h) {
                qVar.resetPeekPosition();
                return;
            } else {
                qVar.skipFully(fVar.f41963h + fVar.f41964i);
                this.f41936i = qVar.getPosition();
                this.f41938k = this.f41928a.f41958c;
            }
        }
    }

    @Override // j3.g
    public long a(q qVar) throws IOException {
        int i10 = this.f41932e;
        if (i10 == 0) {
            long position = qVar.getPosition();
            this.f41934g = position;
            this.f41932e = 1;
            long j10 = this.f41930c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jG = g(qVar);
                if (jG != -1) {
                    return jG;
                }
                this.f41932e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            i(qVar);
            this.f41932e = 4;
            return -(this.f41938k + 2);
        }
        this.f41933f = h(qVar);
        this.f41932e = 4;
        return this.f41934g;
    }

    @Override // j3.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b createSeekMap() {
        if (this.f41933f != 0) {
            return new b();
        }
        return null;
    }

    long h(q qVar) throws ParserException, EOFException {
        this.f41928a.b();
        if (!this.f41928a.c(qVar)) {
            throw new EOFException();
        }
        this.f41928a.a(qVar, false);
        f fVar = this.f41928a;
        qVar.skipFully(fVar.f41963h + fVar.f41964i);
        long j10 = this.f41928a.f41958c;
        while (true) {
            f fVar2 = this.f41928a;
            if ((fVar2.f41957b & 4) == 4 || !fVar2.c(qVar) || qVar.getPosition() >= this.f41930c || !this.f41928a.a(qVar, true)) {
                break;
            }
            f fVar3 = this.f41928a;
            if (!s.e(qVar, fVar3.f41963h + fVar3.f41964i)) {
                break;
            }
            j10 = this.f41928a.f41958c;
        }
        return j10;
    }

    @Override // j3.g
    public void startSeek(long j10) {
        this.f41935h = c0.p(j10, 0L, this.f41933f - 1);
        this.f41932e = 2;
        this.f41936i = this.f41929b;
        this.f41937j = this.f41930c;
        this.f41938k = 0L;
        this.f41939l = this.f41933f;
    }
}
