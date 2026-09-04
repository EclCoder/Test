package da;

import com.google.android.exoplayer2.ParserException;
import com.inmobi.media.core.config.models.CrashConfig;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import ob.r0;
import u9.a0;
import u9.l;
import u9.n;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f36485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f36486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f36487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f36488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f36490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f36491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f36492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f36493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f36494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f36495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f36496l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements z {
        private b() {
        }

        @Override // u9.z
        public long getDurationUs() {
            return a.this.f36488d.b(a.this.f36490f);
        }

        @Override // u9.z
        public z.a getSeekPoints(long j10) {
            return new z.a(new a0(j10, r0.r((a.this.f36486b + BigInteger.valueOf(a.this.f36488d.c(j10)).multiply(BigInteger.valueOf(a.this.f36487c - a.this.f36486b)).divide(BigInteger.valueOf(a.this.f36490f)).longValue()) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, a.this.f36486b, a.this.f36487c - 1)));
        }

        @Override // u9.z
        public boolean isSeekable() {
            return true;
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        ob.a.a(j10 >= 0 && j11 > j10);
        this.f36488d = iVar;
        this.f36486b = j10;
        this.f36487c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f36490f = j13;
            this.f36489e = 4;
        } else {
            this.f36489e = 0;
        }
        this.f36485a = new f();
    }

    private long g(l lVar) throws IOException {
        if (this.f36493i == this.f36494j) {
            return -1L;
        }
        long position = lVar.getPosition();
        if (!this.f36485a.d(lVar, this.f36494j)) {
            long j10 = this.f36493i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f36485a.a(lVar, false);
        lVar.resetPeekPosition();
        long j11 = this.f36492h;
        f fVar = this.f36485a;
        long j12 = fVar.f36515c;
        long j13 = j11 - j12;
        int i10 = fVar.f36520h + fVar.f36521i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f36494j = position;
            this.f36496l = j12;
        } else {
            this.f36493i = lVar.getPosition() + ((long) i10);
            this.f36495k = this.f36485a.f36515c;
        }
        long j14 = this.f36494j;
        long j15 = this.f36493i;
        if (j14 - j15 < 100000) {
            this.f36494j = j15;
            return j15;
        }
        long position2 = lVar.getPosition() - (((long) i10) * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f36494j;
        long j17 = this.f36493i;
        return r0.r(position2 + ((j13 * (j16 - j17)) / (this.f36496l - this.f36495k)), j17, j16 - 1);
    }

    private void i(l lVar) throws ParserException {
        while (true) {
            this.f36485a.c(lVar);
            this.f36485a.a(lVar, false);
            f fVar = this.f36485a;
            if (fVar.f36515c > this.f36492h) {
                lVar.resetPeekPosition();
                return;
            } else {
                lVar.skipFully(fVar.f36520h + fVar.f36521i);
                this.f36493i = lVar.getPosition();
                this.f36495k = this.f36485a.f36515c;
            }
        }
    }

    @Override // da.g
    public long a(l lVar) throws IOException {
        int i10 = this.f36489e;
        if (i10 == 0) {
            long position = lVar.getPosition();
            this.f36491g = position;
            this.f36489e = 1;
            long j10 = this.f36487c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jG = g(lVar);
                if (jG != -1) {
                    return jG;
                }
                this.f36489e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            i(lVar);
            this.f36489e = 4;
            return -(this.f36495k + 2);
        }
        this.f36490f = h(lVar);
        this.f36489e = 4;
        return this.f36491g;
    }

    @Override // da.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b createSeekMap() {
        if (this.f36490f != 0) {
            return new b();
        }
        return null;
    }

    long h(l lVar) throws ParserException, EOFException {
        this.f36485a.b();
        if (!this.f36485a.c(lVar)) {
            throw new EOFException();
        }
        this.f36485a.a(lVar, false);
        f fVar = this.f36485a;
        lVar.skipFully(fVar.f36520h + fVar.f36521i);
        long j10 = this.f36485a.f36515c;
        while (true) {
            f fVar2 = this.f36485a;
            if ((fVar2.f36514b & 4) == 4 || !fVar2.c(lVar) || lVar.getPosition() >= this.f36487c || !this.f36485a.a(lVar, true)) {
                break;
            }
            f fVar3 = this.f36485a;
            if (!n.e(lVar, fVar3.f36520h + fVar3.f36521i)) {
                break;
            }
            j10 = this.f36485a.f36515c;
        }
        return j10;
    }

    @Override // da.g
    public void startSeek(long j10) {
        this.f36492h = r0.r(j10, 0L, this.f36490f - 1);
        this.f36489e = 2;
        this.f36493i = this.f36486b;
        this.f36494j = this.f36487c;
        this.f36495k = 0L;
        this.f36496l = this.f36490f;
    }
}
