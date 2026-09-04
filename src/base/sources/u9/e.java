package u9;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nb.h f54262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f54264d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54267g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f54265e = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f54261a = new byte[4096];

    static {
        o9.n.a("goog.exo.extractor");
    }

    public e(nb.h hVar, long j10, long j11) {
        this.f54262b = hVar;
        this.f54264d = j10;
        this.f54263c = j11;
    }

    private void f(int i10) {
        if (i10 != -1) {
            this.f54264d += (long) i10;
        }
    }

    private void i(int i10) {
        int i11 = this.f54266f + i10;
        byte[] bArr = this.f54265e;
        if (i11 > bArr.length) {
            this.f54265e = Arrays.copyOf(this.f54265e, r0.q(bArr.length * 2, C.DEFAULT_BUFFER_SEGMENT_SIZE + i11, i11 + 524288));
        }
    }

    private int j(byte[] bArr, int i10, int i11) {
        int i12 = this.f54267g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f54265e, 0, bArr, i10, iMin);
        n(iMin);
        return iMin;
    }

    private int k(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f54262b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    private int l(int i10) {
        int iMin = Math.min(this.f54267g, i10);
        n(iMin);
        return iMin;
    }

    private void n(int i10) {
        int i11 = this.f54267g - i10;
        this.f54267g = i11;
        this.f54266f = 0;
        byte[] bArr = this.f54265e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f54265e = bArr2;
    }

    @Override // u9.l
    public boolean advancePeekPosition(int i10, boolean z10) throws EOFException, InterruptedIOException {
        i(i10);
        int iK = this.f54267g - this.f54266f;
        while (iK < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iK = k(this.f54265e, this.f54266f, i11, iK, z11);
            if (iK == -1) {
                return false;
            }
            this.f54267g = this.f54266f + iK;
            i10 = i11;
            z10 = z11;
        }
        this.f54266f += i10;
        return true;
    }

    @Override // u9.l
    public int b(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        e eVar;
        int iMin;
        i(i11);
        int i12 = this.f54267g;
        int i13 = this.f54266f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            eVar = this;
            iMin = eVar.k(this.f54265e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            eVar.f54267g += iMin;
        } else {
            eVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(eVar.f54265e, eVar.f54266f, bArr, i10, iMin);
        eVar.f54266f += iMin;
        return iMin;
    }

    @Override // u9.l
    public long getLength() {
        return this.f54263c;
    }

    @Override // u9.l
    public long getPeekPosition() {
        return this.f54264d + ((long) this.f54266f);
    }

    @Override // u9.l
    public long getPosition() {
        return this.f54264d;
    }

    public boolean m(int i10, boolean z10) throws EOFException, InterruptedIOException {
        int iL = l(i10);
        while (iL < i10 && iL != -1) {
            iL = k(this.f54261a, -iL, Math.min(i10, this.f54261a.length + iL), iL, z10);
        }
        f(iL);
        return iL != -1;
    }

    @Override // u9.l
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) {
        if (!advancePeekPosition(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f54265e, this.f54266f - i11, bArr, i10, i11);
        return true;
    }

    @Override // u9.l, nb.h
    public int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int iJ = j(bArr, i10, i11);
        if (iJ == 0) {
            iJ = k(bArr, i10, i11, 0, true);
        }
        f(iJ);
        return iJ;
    }

    @Override // u9.l
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iJ = j(bArr, i10, i11);
        while (iJ < i11 && iJ != -1) {
            iJ = k(bArr, i10, i11, iJ, z10);
        }
        f(iJ);
        return iJ != -1;
    }

    @Override // u9.l
    public void resetPeekPosition() {
        this.f54266f = 0;
    }

    @Override // u9.l
    public int skip(int i10) throws EOFException, InterruptedIOException {
        int iL = l(i10);
        if (iL == 0) {
            byte[] bArr = this.f54261a;
            iL = k(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        f(iL);
        return iL;
    }

    @Override // u9.l
    public void skipFully(int i10) throws EOFException, InterruptedIOException {
        m(i10, false);
    }

    @Override // u9.l
    public void peekFully(byte[] bArr, int i10, int i11) {
        peekFully(bArr, i10, i11, false);
    }

    @Override // u9.l
    public void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        readFully(bArr, i10, i11, false);
    }

    @Override // u9.l
    public void advancePeekPosition(int i10) throws EOFException, InterruptedIOException {
        advancePeekPosition(i10, false);
    }
}
