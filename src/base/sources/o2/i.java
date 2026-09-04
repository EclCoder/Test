package o2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t1.g f48070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f48071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f48072d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f48074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f48075g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f48073e = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f48069a = new byte[4096];

    static {
        t1.s.a("media3.extractor");
    }

    public i(t1.g gVar, long j10, long j11) {
        this.f48070b = gVar;
        this.f48072d = j10;
        this.f48071c = j11;
    }

    private void d(int i10) {
        if (i10 != -1) {
            this.f48072d += (long) i10;
        }
    }

    private void e(int i10) {
        int i11 = this.f48074f + i10;
        byte[] bArr = this.f48073e;
        if (i11 > bArr.length) {
            this.f48073e = Arrays.copyOf(this.f48073e, w1.c0.o(bArr.length * 2, C.DEFAULT_BUFFER_SEGMENT_SIZE + i11, i11 + 524288));
        }
    }

    private int f(byte[] bArr, int i10, int i11) {
        int i12 = this.f48075g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f48073e, 0, bArr, i10, iMin);
        j(iMin);
        return iMin;
    }

    private int g(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f48070b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    private int h(int i10) {
        int iMin = Math.min(this.f48075g, i10);
        j(iMin);
        return iMin;
    }

    private void j(int i10) {
        int i11 = this.f48075g - i10;
        this.f48075g = i11;
        this.f48074f = 0;
        byte[] bArr = this.f48073e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f48073e = bArr2;
    }

    @Override // o2.q
    public boolean advancePeekPosition(int i10, boolean z10) throws EOFException, InterruptedIOException {
        e(i10);
        int iG = this.f48075g - this.f48074f;
        while (iG < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iG = g(this.f48073e, this.f48074f, i11, iG, z11);
            if (iG == -1) {
                return false;
            }
            this.f48075g = this.f48074f + iG;
            i10 = i11;
            z10 = z11;
        }
        this.f48074f += i10;
        return true;
    }

    @Override // o2.q
    public int b(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        i iVar;
        int iMin;
        e(i11);
        int i12 = this.f48075g;
        int i13 = this.f48074f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            iVar = this;
            iMin = iVar.g(this.f48073e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            iVar.f48075g += iMin;
        } else {
            iVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(iVar.f48073e, iVar.f48074f, bArr, i10, iMin);
        iVar.f48074f += iMin;
        return iMin;
    }

    @Override // o2.q
    public long getLength() {
        return this.f48071c;
    }

    @Override // o2.q
    public long getPeekPosition() {
        return this.f48072d + ((long) this.f48074f);
    }

    @Override // o2.q
    public long getPosition() {
        return this.f48072d;
    }

    public boolean i(int i10, boolean z10) throws EOFException, InterruptedIOException {
        int iH = h(i10);
        while (iH < i10 && iH != -1) {
            iH = g(this.f48069a, -iH, Math.min(i10, this.f48069a.length + iH), iH, z10);
        }
        d(iH);
        return iH != -1;
    }

    @Override // o2.q
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) {
        if (!advancePeekPosition(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f48073e, this.f48074f - i11, bArr, i10, i11);
        return true;
    }

    @Override // o2.q, t1.g
    public int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int iF = f(bArr, i10, i11);
        if (iF == 0) {
            iF = g(bArr, i10, i11, 0, true);
        }
        d(iF);
        return iF;
    }

    @Override // o2.q
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iF = f(bArr, i10, i11);
        while (iF < i11 && iF != -1) {
            iF = g(bArr, i10, i11, iF, z10);
        }
        d(iF);
        return iF != -1;
    }

    @Override // o2.q
    public void resetPeekPosition() {
        this.f48074f = 0;
    }

    @Override // o2.q
    public int skip(int i10) throws EOFException, InterruptedIOException {
        int iH = h(i10);
        if (iH == 0) {
            byte[] bArr = this.f48069a;
            iH = g(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        d(iH);
        return iH;
    }

    @Override // o2.q
    public void skipFully(int i10) throws EOFException, InterruptedIOException {
        i(i10, false);
    }

    @Override // o2.q
    public void peekFully(byte[] bArr, int i10, int i11) {
        peekFully(bArr, i10, i11, false);
    }

    @Override // o2.q
    public void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        readFully(bArr, i10, i11, false);
    }

    @Override // o2.q
    public void advancePeekPosition(int i10) throws EOFException, InterruptedIOException {
        advancePeekPosition(i10, false);
    }
}
