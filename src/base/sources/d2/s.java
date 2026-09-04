package d2;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import o2.h0;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f36146d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f36147e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f36148a = AudioProcessor.f4623a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36150c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36149b = 2;

    private ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i10;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = (i11 + 255) / 255;
        int length = i12 + 27 + i11;
        if (this.f36149b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f36146d.length;
            length += f36147e.length + length2;
            i10 = length2;
        } else {
            i10 = 0;
        }
        ByteBuffer byteBufferC = c(length);
        if (this.f36149b == 2) {
            if (bArr != null) {
                e(byteBufferC, bArr);
            } else {
                byteBufferC.put(f36146d);
            }
            byteBufferC.put(f36147e);
        }
        int iJ = this.f36150c + h0.j(byteBuffer);
        this.f36150c = iJ;
        f(byteBufferC, iJ, this.f36149b, i12, false);
        for (int i13 = 0; i13 < i12; i13++) {
            if (i11 >= 255) {
                byteBufferC.put((byte) -1);
                i11 -= 255;
            } else {
                byteBufferC.put((byte) i11);
                i11 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferC.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferC.flip();
        if (this.f36149b == 2) {
            byte[] bArrArray = byteBufferC.array();
            int iArrayOffset = byteBufferC.arrayOffset() + i10;
            byte[] bArr2 = f36147e;
            byteBufferC.putInt(i10 + bArr2.length + 22, c0.w(bArrArray, iArrayOffset + bArr2.length, byteBufferC.limit() - byteBufferC.position(), 0));
        } else {
            byteBufferC.putInt(22, c0.w(byteBufferC.array(), byteBufferC.arrayOffset(), byteBufferC.limit() - byteBufferC.position(), 0));
        }
        this.f36149b++;
        return byteBufferC;
    }

    private ByteBuffer c(int i10) {
        if (this.f36148a.capacity() < i10) {
            this.f36148a = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f36148a.clear();
        }
        return this.f36148a;
    }

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(com.google.common.primitives.j.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, c0.w(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void f(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z10 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(com.google.common.primitives.j.a(i11));
    }

    public void a(DecoderInputBuffer decoderInputBuffer, List list) {
        w1.a.e(decoderInputBuffer.f4864d);
        if (decoderInputBuffer.f4864d.limit() - decoderInputBuffer.f4864d.position() == 0) {
            return;
        }
        this.f36148a = b(decoderInputBuffer.f4864d, (this.f36149b == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null);
        decoderInputBuffer.b();
        decoderInputBuffer.k(this.f36148a.remaining());
        decoderInputBuffer.f4864d.put(this.f36148a);
        decoderInputBuffer.l();
    }

    public void d() {
        this.f36148a = AudioProcessor.f4623a;
        this.f36150c = 0;
        this.f36149b = 2;
    }
}
