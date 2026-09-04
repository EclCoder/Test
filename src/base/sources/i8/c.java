package i8;

import java.io.OutputStream;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f41181f = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f41185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41186e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedList f41183b = new LinkedList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f41182a = null;

    private c(a aVar, byte[] bArr, int i10) {
        this.f41185d = bArr;
        this.f41186e = i10;
    }

    private void d() {
        int length = this.f41184c + this.f41185d.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.f41184c = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 131072) {
            iMax = 131072;
        }
        this.f41183b.add(this.f41185d);
        this.f41185d = new byte[iMax];
        this.f41186e = 0;
    }

    public static c l(byte[] bArr, int i10) {
        return new c(null, bArr, i10);
    }

    public void h(int i10) {
        if (this.f41186e >= this.f41185d.length) {
            d();
        }
        byte[] bArr = this.f41185d;
        int i11 = this.f41186e;
        this.f41186e = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    public byte[] i(int i10) {
        this.f41186e = i10;
        return q();
    }

    public byte[] k() {
        d();
        return this.f41185d;
    }

    public void m() {
        this.f41184c = 0;
        this.f41186e = 0;
        if (this.f41183b.isEmpty()) {
            return;
        }
        this.f41183b.clear();
    }

    public byte[] q() {
        int i10 = this.f41184c + this.f41186e;
        if (i10 == 0) {
            return f41181f;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (byte[] bArr2 : this.f41183b) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i11, length);
            i11 += length;
        }
        System.arraycopy(this.f41185d, 0, bArr, i11, this.f41186e);
        int i12 = i11 + this.f41186e;
        if (i12 == i10) {
            if (!this.f41183b.isEmpty()) {
                m();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i10 + ", copied " + i12 + " bytes");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        while (true) {
            int iMin = Math.min(this.f41185d.length - this.f41186e, i11);
            if (iMin > 0) {
                System.arraycopy(bArr, i10, this.f41185d, this.f41186e, iMin);
                i10 += iMin;
                this.f41186e += iMin;
                i11 -= iMin;
            }
            if (i11 <= 0) {
                return;
            } else {
                d();
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        h(i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }
}
