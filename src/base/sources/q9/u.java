package q9;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f50508d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f50509e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f50510a = AudioProcessor.f16452a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50512c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50511b = 2;

    private ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i10;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = (i11 + 255) / 255;
        int length = i12 + 27 + i11;
        if (this.f50511b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f50508d.length;
            length += f50509e.length + length2;
            i10 = length2;
        } else {
            i10 = 0;
        }
        ByteBuffer byteBufferC = c(length);
        if (this.f50511b == 2) {
            if (bArr != null) {
                e(byteBufferC, bArr);
            } else {
                byteBufferC.put(f50508d);
            }
            byteBufferC.put(f50509e);
        }
        int i13 = this.f50512c + v.i(byteBuffer);
        this.f50512c = i13;
        f(byteBufferC, i13, this.f50511b, i12, false);
        for (int i14 = 0; i14 < i12; i14++) {
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
        if (this.f50511b == 2) {
            byte[] bArrArray = byteBufferC.array();
            int iArrayOffset = byteBufferC.arrayOffset() + i10;
            byte[] bArr2 = f50509e;
            byteBufferC.putInt(i10 + bArr2.length + 22, r0.t(bArrArray, iArrayOffset + bArr2.length, byteBufferC.limit() - byteBufferC.position(), 0));
        } else {
            byteBufferC.putInt(22, r0.t(byteBufferC.array(), byteBufferC.arrayOffset(), byteBufferC.limit() - byteBufferC.position(), 0));
        }
        this.f50511b++;
        return byteBufferC;
    }

    private ByteBuffer c(int i10) {
        if (this.f50510a.capacity() < i10) {
            this.f50510a = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f50510a.clear();
        }
        return this.f50510a;
    }

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(com.google.common.primitives.j.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, r0.t(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
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
        ob.a.e(decoderInputBuffer.f16754c);
        if (decoderInputBuffer.f16754c.limit() - decoderInputBuffer.f16754c.position() == 0) {
            return;
        }
        this.f50510a = b(decoderInputBuffer.f16754c, (this.f50511b == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null);
        decoderInputBuffer.b();
        decoderInputBuffer.m(this.f50510a.remaining());
        decoderInputBuffer.f16754c.put(this.f50510a);
        decoderInputBuffer.n();
    }

    public void d() {
        this.f50510a = AudioProcessor.f16452a;
        this.f50512c = 0;
        this.f50511b = 2;
    }
}
