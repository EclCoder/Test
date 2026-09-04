package com.bytedance.sdk.component.hn.hnj.hn;

import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class hnj implements hn, qor, Cloneable, ByteChannel {
    private static final byte[] qor = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    long f12868hn;
    sk hnj;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnj)) {
            return false;
        }
        hnj hnjVar = (hnj) obj;
        long j10 = this.f12868hn;
        if (j10 != hnjVar.f12868hn) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        sk skVar = this.hnj;
        sk skVar2 = hnjVar.hnj;
        int i10 = skVar.f12869hn;
        int i11 = skVar2.f12869hn;
        while (j11 < this.f12868hn) {
            long jMin = Math.min(skVar.qor - i10, skVar2.qor - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (skVar.hnj[i10] != skVar2.hnj[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == skVar.qor) {
                skVar = skVar.dkl;
                i10 = skVar.f12869hn;
            }
            if (i11 == skVar2.qor) {
                skVar2 = skVar2.dkl;
                i11 = skVar2.f12869hn;
            }
            j11 += jMin;
        }
        return true;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    /* JADX INFO: renamed from: gjv, reason: merged with bridge method [inline-methods] */
    public hnj clone() {
        hnj hnjVar = new hnj();
        if (this.f12868hn == 0) {
            return hnjVar;
        }
        sk skVarHnj = this.hnj.hnj();
        hnjVar.hnj = skVarHnj;
        skVarHnj.dse = skVarHnj;
        skVarHnj.dkl = skVarHnj;
        sk skVar = this.hnj;
        while (true) {
            skVar = skVar.dkl;
            if (skVar == this.hnj) {
                hnjVar.f12868hn = this.f12868hn;
                return hnjVar;
            }
            hnjVar.hnj.dse.hnj(skVar.hnj());
        }
    }

    public int hashCode() {
        sk skVar = this.hnj;
        if (skVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = skVar.qor;
            for (int i12 = skVar.f12869hn; i12 < i11; i12++) {
                i10 = (i10 * 31) + skVar.hnj[i12];
            }
            skVar = skVar.dkl;
        } while (skVar != this.hnj);
        return i10;
    }

    public byte hn() {
        long j10 = this.f12868hn;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        sk skVar = this.hnj;
        int i10 = skVar.f12869hn;
        int i11 = skVar.qor;
        int i12 = i10 + 1;
        byte b10 = skVar.hnj[i10];
        this.f12868hn = j10 - 1;
        if (i12 != i11) {
            skVar.f12869hn = i12;
            return b10;
        }
        this.hnj = skVar.hn();
        dkl.hnj(skVar);
        return b10;
    }

    public boolean hnj() {
        return this.f12868hn == 0;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public String qor() {
        try {
            return hnj(this.f12868hn, ojm.hnj);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        sk skVar = this.hnj;
        if (skVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), skVar.qor - skVar.f12869hn);
        byteBuffer.put(skVar.hnj, skVar.f12869hn, iMin);
        int i10 = skVar.f12869hn + iMin;
        skVar.f12869hn = i10;
        this.f12868hn -= (long) iMin;
        if (i10 == skVar.qor) {
            this.hnj = skVar.hn();
            dkl.hnj(skVar);
        }
        return iMin;
    }

    public final gjv sk() {
        long j10 = this.f12868hn;
        if (j10 <= 2147483647L) {
            return gjv((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f12868hn);
    }

    public String toString() {
        return sk().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            sk skVarQor = qor(1);
            int iMin = Math.min(i10, 8192 - skVarQor.qor);
            byteBuffer.get(skVarQor.hnj, skVarQor.qor, iMin);
            i10 -= iMin;
            skVarQor.qor += iMin;
        }
        this.f12868hn += (long) iRemaining;
        return iRemaining;
    }

    public String hnj(long j10, Charset charset) {
        ojm.hnj(this.f12868hn, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
        }
        if (j10 == 0) {
            return "";
        }
        sk skVar = this.hnj;
        int i10 = skVar.f12869hn;
        if (((long) i10) + j10 > skVar.qor) {
            return new String(hnj(j10), charset);
        }
        String str = new String(skVar.hnj, i10, (int) j10, charset);
        int i11 = (int) (((long) skVar.f12869hn) + j10);
        skVar.f12869hn = i11;
        this.f12868hn -= j10;
        if (i11 == skVar.qor) {
            this.hnj = skVar.hn();
            dkl.hnj(skVar);
        }
        return str;
    }

    sk qor(int i10) {
        if (i10 > 0 && i10 <= 8192) {
            sk skVar = this.hnj;
            if (skVar == null) {
                sk skVarHnj = dkl.hnj();
                this.hnj = skVarHnj;
                skVarHnj.dse = skVarHnj;
                skVarHnj.dkl = skVarHnj;
                return skVarHnj;
            }
            sk skVar2 = skVar.dse;
            return (skVar2.qor + i10 > 8192 || !skVar2.f12870sk) ? skVar2.hnj(dkl.hnj()) : skVar2;
        }
        throw new IllegalArgumentException();
    }

    public final gjv gjv(int i10) {
        if (i10 == 0) {
            return gjv.qor;
        }
        return new dse(this, i10);
    }

    public hnj hn(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            ojm.hnj(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                sk skVarQor = qor(1);
                int iMin = Math.min(i12 - i10, 8192 - skVarQor.qor);
                System.arraycopy(bArr, i10, skVarQor.hnj, skVarQor.qor, iMin);
                i10 += iMin;
                skVarQor.qor += iMin;
            }
            this.f12868hn += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] hnj(long j10) throws EOFException {
        ojm.hnj(this.f12868hn, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            hnj(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
    }

    public hnj hn(int i10) {
        sk skVarQor = qor(1);
        byte[] bArr = skVarQor.hnj;
        int i11 = skVarQor.qor;
        skVarQor.qor = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f12868hn++;
        return this;
    }

    public void hnj(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int iHnj = hnj(bArr, i10, bArr.length - i10);
            if (iHnj == -1) {
                throw new EOFException();
            }
            i10 += iHnj;
        }
    }

    public hnj hn(long j10) {
        if (j10 == 0) {
            return hn(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        sk skVarQor = qor(iNumberOfTrailingZeros);
        byte[] bArr = skVarQor.hnj;
        int i10 = skVarQor.qor;
        for (int i11 = (i10 + iNumberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = qor[(int) (15 & j10)];
            j10 >>>= 4;
        }
        skVarQor.qor += iNumberOfTrailingZeros;
        this.f12868hn += (long) iNumberOfTrailingZeros;
        return this;
    }

    public int hnj(byte[] bArr, int i10, int i11) {
        ojm.hnj(bArr.length, i10, i11);
        sk skVar = this.hnj;
        if (skVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, skVar.qor - skVar.f12869hn);
        System.arraycopy(skVar.hnj, skVar.f12869hn, bArr, i10, iMin);
        int i12 = skVar.f12869hn + iMin;
        skVar.f12869hn = i12;
        this.f12868hn -= (long) iMin;
        if (i12 == skVar.qor) {
            this.hnj = skVar.hn();
            dkl.hnj(skVar);
        }
        return iMin;
    }

    public hnj hnj(String str) {
        return hnj(str, 0, str.length());
    }

    public hnj hnj(String str, int i10, int i11) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            }
            while (i10 < i11) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    sk skVarQor = qor(1);
                    byte[] bArr = skVarQor.hnj;
                    int i12 = skVarQor.qor - i10;
                    int iMin = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                            break;
                        }
                        i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) cCharAt;
                    }
                    int i14 = skVarQor.qor;
                    int i15 = (i12 + i10) - i14;
                    skVarQor.qor = i14 + i15;
                    this.f12868hn += (long) i15;
                } else {
                    if (cCharAt2 < 2048) {
                        hn((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        hn((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i16 = i10 + 1;
                        char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i17 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            hn((i17 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            hn(((i17 >> 12) & 63) | 128);
                            hn(((i17 >> 6) & 63) | 128);
                            hn((i17 & 63) | 128);
                            i10 += 2;
                        } else {
                            hn(63);
                            i10 = i16;
                        }
                    } else {
                        hn((cCharAt2 >> '\f') | 224);
                        hn(((cCharAt2 >> 6) & 63) | 128);
                        hn((cCharAt2 & '?') | 128);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }

    public hnj hnj(int i10) {
        if (i10 < 128) {
            hn(i10);
            return this;
        }
        if (i10 < 2048) {
            hn((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            hn((i10 & 63) | 128);
            return this;
        }
        if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                hn(63);
                return this;
            }
            hn((i10 >> 12) | 224);
            hn(((i10 >> 6) & 63) | 128);
            hn((i10 & 63) | 128);
            return this;
        }
        if (i10 <= 1114111) {
            hn((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            hn(((i10 >> 12) & 63) | 128);
            hn(((i10 >> 6) & 63) | 128);
            hn((i10 & 63) | 128);
            return this;
        }
        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
    }

    public hnj hnj(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            }
            if (charset != null) {
                if (charset.equals(ojm.hnj)) {
                    return hnj(str, i10, i11);
                }
                byte[] bytes = str.substring(i10, i11).getBytes(charset);
                return hn(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(trPLwhKZgZ.GnnCy + i11 + " < " + i10);
    }
}
