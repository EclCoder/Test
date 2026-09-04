package com.mbridge.msdk.thrid.okio;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f33637c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    o f33638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f33639b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.f33639b, 2147483647L);
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.f33639b > 0) {
                return cVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }
            return -1;
        }

        public String toString() {
            return c.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            return c.this.read(bArr, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e, com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public f b(long j10) {
        return new f(c(j10));
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String c() {
        return d(Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String d(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j10);
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jA = a((byte) 10, 0L, j11);
        if (jA != -1) {
            return h(jA);
        }
        if (j11 < size() && f(j11 - 1) == 13 && f(j11) == 10) {
            return h(j11);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + cVar.o().g() + (char) 8230);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void e(long j10) throws EOFException {
        if (this.f33639b < j10) {
            throw new EOFException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j10 = this.f33639b;
        if (j10 != cVar.f33639b) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        o oVar = this.f33638a;
        o oVar2 = cVar.f33638a;
        int i10 = oVar.f33672b;
        int i11 = oVar2.f33672b;
        while (j11 < this.f33639b) {
            long jMin = Math.min(oVar.f33673c - i10, oVar2.f33673c - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (oVar.f33671a[i10] != oVar2.f33671a[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == oVar.f33673c) {
                oVar = oVar.f33676f;
                i10 = oVar.f33672b;
            }
            if (i11 == oVar2.f33673c) {
                oVar2 = oVar2.f33676f;
                i11 = oVar2.f33672b;
            }
            j11 += jMin;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean f() {
        return this.f33639b == 0;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short g() {
        return u.a(readShort());
    }

    String h(long j10) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (f(j11) == 13) {
                String strG = g(j11);
                skip(2L);
                return strG;
            }
        }
        String strG2 = g(j10);
        skip(1L);
        return strG2;
    }

    public int hashCode() {
        o oVar = this.f33638a;
        if (oVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = oVar.f33673c;
            for (int i12 = oVar.f33672b; i12 < i11; i12++) {
                i10 = (i10 * 31) + oVar.f33671a[i12];
            }
            oVar = oVar.f33676f;
        } while (oVar != this.f33638a);
        return i10;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long i() {
        int i10;
        if (this.f33639b == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            o oVar = this.f33638a;
            byte[] bArr = oVar.f33671a;
            int i12 = oVar.f33672b;
            int i13 = oVar.f33673c;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 != 0) {
                            z10 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b10));
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new c().a(j10).writeByte((int) b10).p());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f33638a = oVar.b();
                p.a(oVar);
            } else {
                oVar.f33672b = i12;
            }
            if (z10) {
                break;
            }
        } while (this.f33638a != null);
        this.f33639b -= (long) i11;
        return j10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public InputStream j() {
        return new a();
    }

    public final void k() {
        try {
            skip(this.f33639b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c();
        if (this.f33639b == 0) {
            return cVar;
        }
        o oVarC = this.f33638a.c();
        cVar.f33638a = oVarC;
        oVarC.f33677g = oVarC;
        oVarC.f33676f = oVarC;
        for (o oVar = this.f33638a.f33676f; oVar != this.f33638a; oVar = oVar.f33676f) {
            cVar.f33638a.f33677g.a(oVar.c());
        }
        cVar.f33639b = this.f33639b;
        return cVar;
    }

    public final long m() {
        long j10 = this.f33639b;
        if (j10 == 0) {
            return 0L;
        }
        o oVar = this.f33638a.f33677g;
        int i10 = oVar.f33673c;
        return (i10 >= 8192 || !oVar.f33675e) ? j10 : j10 - ((long) (i10 - oVar.f33672b));
    }

    public byte[] n() {
        try {
            return c(this.f33639b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public f o() {
        return new f(n());
    }

    public String p() {
        try {
            return a(this.f33639b, u.f33686a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final f q() {
        long j10 = this.f33639b;
        if (j10 <= 2147483647L) {
            return a((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f33639b);
    }

    public int read(byte[] bArr, int i10, int i11) {
        u.a(bArr.length, i10, i11);
        o oVar = this.f33638a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, oVar.f33673c - oVar.f33672b);
        System.arraycopy(oVar.f33671a, oVar.f33672b, bArr, i10, iMin);
        int i12 = oVar.f33672b + iMin;
        oVar.f33672b = i12;
        this.f33639b -= (long) iMin;
        if (i12 == oVar.f33673c) {
            this.f33638a = oVar.b();
            p.a(oVar);
        }
        return iMin;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte readByte() {
        long j10 = this.f33639b;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        o oVar = this.f33638a;
        int i10 = oVar.f33672b;
        int i11 = oVar.f33673c;
        int i12 = i10 + 1;
        byte b10 = oVar.f33671a[i10];
        this.f33639b = j10 - 1;
        if (i12 != i11) {
            oVar.f33672b = i12;
            return b10;
        }
        this.f33638a = oVar.b();
        p.a(oVar);
        return b10;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void readFully(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int i11 = read(bArr, i10, bArr.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int readInt() {
        long j10 = this.f33639b;
        if (j10 < 4) {
            throw new IllegalStateException("size < 4: " + this.f33639b);
        }
        o oVar = this.f33638a;
        int i10 = oVar.f33672b;
        int i11 = oVar.f33673c;
        if (i11 - i10 < 4) {
            return ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        byte[] bArr = oVar.f33671a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i13;
        this.f33639b = j10 - 4;
        if (i14 != i11) {
            oVar.f33672b = i14;
            return i15;
        }
        this.f33638a = oVar.b();
        p.a(oVar);
        return i15;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short readShort() {
        long j10 = this.f33639b;
        if (j10 < 2) {
            throw new IllegalStateException("size < 2: " + this.f33639b);
        }
        o oVar = this.f33638a;
        int i10 = oVar.f33672b;
        int i11 = oVar.f33673c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        byte[] bArr = oVar.f33671a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i13;
        this.f33639b = j10 - 2;
        if (i14 == i11) {
            this.f33638a = oVar.b();
            p.a(oVar);
        } else {
            oVar.f33672b = i14;
        }
        return (short) i15;
    }

    public final long size() {
        return this.f33639b;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            o oVar = this.f33638a;
            if (oVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, oVar.f33673c - oVar.f33672b);
            long j11 = iMin;
            this.f33639b -= j11;
            j10 -= j11;
            o oVar2 = this.f33638a;
            int i10 = oVar2.f33672b + iMin;
            oVar2.f33672b = i10;
            if (i10 == oVar2.f33673c) {
                this.f33638a = oVar2.b();
                p.a(oVar2);
            }
        }
    }

    public String toString() {
        return q().toString();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c a(String str) {
        return a(str, 0, str.length());
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte[] c(long j10) throws EOFException {
        u.a(this.f33639b, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int e() {
        return u.a(readInt());
    }

    public final byte f(long j10) {
        u.a(this.f33639b, j10, 1L);
        long j11 = this.f33639b;
        if (j11 - j10 > j10) {
            o oVar = this.f33638a;
            long j12 = j10;
            while (true) {
                int i10 = oVar.f33673c;
                int i11 = oVar.f33672b;
                long j13 = i10 - i11;
                if (j12 < j13) {
                    return oVar.f33671a[i11 + ((int) j12)];
                }
                j12 -= j13;
                oVar = oVar.f33676f;
            }
        } else {
            long j14 = j10 - j11;
            o oVar2 = this.f33638a.f33677g;
            while (true) {
                int i12 = oVar2.f33673c;
                int i13 = oVar2.f33672b;
                j14 += (long) (i12 - i13);
                if (j14 >= 0) {
                    return oVar2.f33671a[i13 + ((int) j14)];
                }
                oVar2 = oVar2.f33677g;
            }
        }
    }

    public String g(long j10) {
        return a(j10, u.f33686a);
    }

    o b(int i10) {
        if (i10 >= 1 && i10 <= 8192) {
            o oVar = this.f33638a;
            if (oVar == null) {
                o oVarA = p.a();
                this.f33638a = oVarA;
                oVarA.f33677g = oVarA;
                oVarA.f33676f = oVarA;
                return oVarA;
            }
            o oVar2 = oVar.f33677g;
            return (oVar2.f33673c + i10 > 8192 || !oVar2.f33675e) ? oVar2.a(p.a()) : oVar2;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c writeShort(int i10) {
        o oVarB = b(2);
        byte[] bArr = oVarB.f33671a;
        int i11 = oVarB.f33673c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        oVarB.f33673c = i11 + 2;
        this.f33639b += 2;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int iRemaining = byteBuffer.remaining();
            int i10 = iRemaining;
            while (i10 > 0) {
                o oVarB = b(1);
                int iMin = Math.min(i10, 8192 - oVarB.f33673c);
                byteBuffer.get(oVarB.f33671a, oVarB.f33673c, iMin);
                i10 -= iMin;
                oVarB.f33673c += iMin;
            }
            this.f33639b += (long) iRemaining;
            return iRemaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final c a(c cVar, long j10, long j11) {
        if (cVar != null) {
            long j12 = j10;
            u.a(this.f33639b, j12, j11);
            if (j11 != 0) {
                cVar.f33639b += j11;
                o oVar = this.f33638a;
                while (true) {
                    long j13 = oVar.f33673c - oVar.f33672b;
                    if (j12 < j13) {
                        break;
                    }
                    j12 -= j13;
                    oVar = oVar.f33676f;
                }
                o oVar2 = oVar;
                long j14 = j11;
                while (j14 > 0) {
                    o oVarC = oVar2.c();
                    int i10 = (int) (((long) oVarC.f33672b) + j12);
                    oVarC.f33672b = i10;
                    oVarC.f33673c = Math.min(i10 + ((int) j14), oVarC.f33673c);
                    o oVar3 = cVar.f33638a;
                    if (oVar3 == null) {
                        oVarC.f33677g = oVarC;
                        oVarC.f33676f = oVarC;
                        cVar.f33638a = oVarC;
                    } else {
                        oVar3.f33677g.a(oVarC);
                    }
                    j14 -= (long) (oVarC.f33673c - oVarC.f33672b);
                    oVar2 = oVar2.f33676f;
                    j12 = 0;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c writeByte(int i10) {
        o oVarB = b(1);
        byte[] bArr = oVarB.f33671a;
        int i11 = oVarB.f33673c;
        oVarB.f33673c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f33639b++;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 >= 0) {
            long j11 = this.f33639b;
            if (j11 == 0) {
                return -1L;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            cVar.a(this, j10);
            return j10;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j10);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        o oVar = this.f33638a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), oVar.f33673c - oVar.f33672b);
        byteBuffer.put(oVar.f33671a, oVar.f33672b, iMin);
        int i10 = oVar.f33672b + iMin;
        oVar.f33672b = i10;
        this.f33639b -= (long) iMin;
        if (i10 == oVar.f33673c) {
            this.f33638a = oVar.b();
            p.a(oVar);
        }
        return iMin;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c writeInt(int i10) {
        o oVarB = b(4);
        byte[] bArr = oVarB.f33671a;
        int i11 = oVarB.f33673c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        oVarB.f33673c = i11 + 4;
        this.f33639b += 4;
        return this;
    }

    public c f(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            writeByte((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            writeByte((i10 & 63) | 128);
            return this;
        }
        if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                writeByte(63);
                return this;
            }
            writeByte((i10 >> 12) | 224);
            writeByte(((i10 >> 6) & 63) | 128);
            writeByte((i10 & 63) | 128);
            return this;
        }
        if (i10 <= 1114111) {
            writeByte((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            writeByte(((i10 >> 12) & 63) | 128);
            writeByte(((i10 >> 6) & 63) | 128);
            writeByte((i10 & 63) | 128);
            return this;
        }
        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return t.f33682d;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String a(Charset charset) {
        try {
            return a(this.f33639b, charset);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public c a(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        o oVarB = b(iNumberOfTrailingZeros);
        byte[] bArr = oVarB.f33671a;
        int i10 = oVarB.f33673c;
        for (int i11 = (i10 + iNumberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f33637c[(int) (15 & j10)];
            j10 >>>= 4;
        }
        oVarB.f33673c += iNumberOfTrailingZeros;
        this.f33639b += (long) iNumberOfTrailingZeros;
        return this;
    }

    public String a(long j10, Charset charset) {
        u.a(this.f33639b, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
        }
        if (j10 == 0) {
            return "";
        }
        o oVar = this.f33638a;
        int i10 = oVar.f33672b;
        if (((long) i10) + j10 > oVar.f33673c) {
            return new String(c(j10), charset);
        }
        String str = new String(oVar.f33671a, i10, (int) j10, charset);
        int i11 = (int) (((long) oVar.f33672b) + j10);
        oVar.f33672b = i11;
        this.f33639b -= j10;
        if (i11 == oVar.f33673c) {
            this.f33638a = oVar.b();
            p.a(oVar);
        }
        return str;
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() {
    }

    public c a(f fVar) {
        if (fVar != null) {
            fVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public c a(String str, int i10, int i11) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i10);
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            }
            while (i10 < i11) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    o oVarB = b(1);
                    byte[] bArr = oVarB.f33671a;
                    int i12 = oVarB.f33673c - i10;
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
                    int i14 = oVarB.f33673c;
                    int i15 = (i12 + i10) - i14;
                    oVarB.f33673c = i14 + i15;
                    this.f33639b += (long) i15;
                } else {
                    if (cCharAt2 < 2048) {
                        writeByte((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        writeByte((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i16 = i10 + 1;
                        char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i17 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            writeByte((i17 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            writeByte(((i17 >> 12) & 63) | 128);
                            writeByte(((i17 >> 6) & 63) | 128);
                            writeByte((i17 & 63) | 128);
                            i10 += 2;
                        } else {
                            writeByte(63);
                            i10 = i16;
                        }
                    } else {
                        writeByte((cCharAt2 >> '\f') | 224);
                        writeByte(((cCharAt2 >> 6) & 63) | 128);
                        writeByte((cCharAt2 & '?') | 128);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }

    public c a(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i10);
        }
        if (i11 >= i10) {
            if (i11 <= str.length()) {
                if (charset != null) {
                    if (charset.equals(u.f33686a)) {
                        return a(str, i10, i11);
                    }
                    byte[] bytes = str.substring(i10, i11).getBytes(charset);
                    return write(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException("charset == null");
            }
            throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            u.a(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                o oVarB = b(1);
                int iMin = Math.min(i12 - i10, 8192 - oVarB.f33673c);
                System.arraycopy(bArr, i10, oVarB.f33671a, oVarB.f33673c, iMin);
                i10 += iMin;
                oVarB.f33673c += iMin;
            }
            this.f33639b += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public long a(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j10 = 0;
        while (true) {
            long jB = sVar.b(this, 8192L);
            if (jB == -1) {
                return j10;
            }
            j10 += jB;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar != this) {
            u.a(cVar.f33639b, 0L, j10);
            while (j10 > 0) {
                o oVar = cVar.f33638a;
                if (j10 < oVar.f33673c - oVar.f33672b) {
                    o oVar2 = this.f33638a;
                    o oVar3 = oVar2 != null ? oVar2.f33677g : null;
                    if (oVar3 != null && oVar3.f33675e) {
                        if ((((long) oVar3.f33673c) + j10) - ((long) (oVar3.f33674d ? 0 : oVar3.f33672b)) <= 8192) {
                            oVar.a(oVar3, (int) j10);
                            cVar.f33639b -= j10;
                            this.f33639b += j10;
                            return;
                        }
                    }
                    cVar.f33638a = oVar.a((int) j10);
                }
                o oVar4 = cVar.f33638a;
                long j11 = oVar4.f33673c - oVar4.f33672b;
                cVar.f33638a = oVar4.b();
                o oVar5 = this.f33638a;
                if (oVar5 == null) {
                    this.f33638a = oVar4;
                    oVar4.f33677g = oVar4;
                    oVar4.f33676f = oVar4;
                } else {
                    oVar5.f33677g.a(oVar4).a();
                }
                cVar.f33639b -= j11;
                this.f33639b += j11;
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long a(byte b10) {
        return a(b10, 0L, Long.MAX_VALUE);
    }

    public long a(byte b10, long j10, long j11) {
        o oVar;
        long j12 = 0;
        if (j10 >= 0 && j11 >= j10) {
            long j13 = this.f33639b;
            long j14 = j11 > j13 ? j13 : j11;
            if (j10 == j14 || (oVar = this.f33638a) == null) {
                return -1L;
            }
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    oVar = oVar.f33677g;
                    j13 -= (long) (oVar.f33673c - oVar.f33672b);
                }
            } else {
                while (true) {
                    long j15 = ((long) (oVar.f33673c - oVar.f33672b)) + j12;
                    if (j15 >= j10) {
                        break;
                    }
                    oVar = oVar.f33676f;
                    j12 = j15;
                }
                j13 = j12;
            }
            long j16 = j10;
            while (j13 < j14) {
                byte[] bArr = oVar.f33671a;
                int iMin = (int) Math.min(oVar.f33673c, (((long) oVar.f33672b) + j14) - j13);
                for (int i10 = (int) ((((long) oVar.f33672b) + j16) - j13); i10 < iMin; i10++) {
                    if (bArr[i10] == b10) {
                        return ((long) (i10 - oVar.f33672b)) + j13;
                    }
                }
                j13 += (long) (oVar.f33673c - oVar.f33672b);
                oVar = oVar.f33676f;
                j16 = j13;
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f33639b), Long.valueOf(j10), Long.valueOf(j11)));
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean a(long j10, f fVar) {
        return a(j10, fVar, 0, fVar.j());
    }

    public boolean a(long j10, f fVar, int i10, int i11) {
        if (j10 < 0 || i10 < 0 || i11 < 0 || this.f33639b - j10 < i11 || fVar.j() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (f(((long) i12) + j10) != fVar.a(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public final f a(int i10) {
        if (i10 == 0) {
            return f.f33642e;
        }
        return new q(this, i10);
    }
}
