package com.fasterxml.jackson.core.io;

import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class h extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b f16265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected InputStream f16266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected byte[] f16267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f16268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f16269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final boolean f16270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected char f16271g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f16272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f16273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final boolean f16274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected char[] f16275k;

    public h(b bVar, InputStream inputStream, byte[] bArr, int i10, int i11, boolean z10) {
        this.f16265a = bVar;
        this.f16266b = inputStream;
        this.f16267c = bArr;
        this.f16268d = i10;
        this.f16269e = i11;
        this.f16270f = z10;
        this.f16274j = inputStream != null;
    }

    private void d() {
        byte[] bArr = this.f16267c;
        if (bArr != null) {
            this.f16267c = null;
            this.f16265a.o(bArr);
        }
    }

    private boolean h(int i10) throws IOException {
        int i11;
        this.f16273i += this.f16269e - i10;
        if (i10 > 0) {
            int i12 = this.f16268d;
            if (i12 > 0) {
                byte[] bArr = this.f16267c;
                System.arraycopy(bArr, i12, bArr, 0, i10);
                this.f16268d = 0;
            }
            this.f16269e = i10;
        } else {
            this.f16268d = 0;
            InputStream inputStream = this.f16266b;
            int i13 = inputStream == null ? -1 : inputStream.read(this.f16267c);
            if (i13 < 1) {
                this.f16269e = 0;
                if (i13 < 0) {
                    if (this.f16274j) {
                        d();
                    }
                    return false;
                }
                k();
            }
            this.f16269e = i13;
        }
        while (true) {
            int i14 = this.f16269e;
            if (i14 >= 4) {
                return true;
            }
            InputStream inputStream2 = this.f16266b;
            if (inputStream2 == null) {
                i11 = -1;
            } else {
                byte[] bArr2 = this.f16267c;
                i11 = inputStream2.read(bArr2, i14, bArr2.length - i14);
            }
            if (i11 < 1) {
                if (i11 < 0) {
                    if (this.f16274j) {
                        d();
                    }
                    l(this.f16269e, 4);
                }
                k();
            }
            this.f16269e += i11;
        }
    }

    private void i(char[] cArr, int i10, int i11) {
        throw new ArrayIndexOutOfBoundsException("read(buf," + i10 + "," + i11 + "), cbuf[" + cArr.length + "]");
    }

    private void k() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    private void l(int i10, int i11) throws CharConversionException {
        int i12 = this.f16273i + i10;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i10 + ", needed " + i11 + ", at char #" + this.f16272h + ", byte #" + i12 + ")");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f16266b;
        if (inputStream != null) {
            this.f16266b = null;
            d();
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public int read() {
        if (this.f16275k == null) {
            this.f16275k = new char[1];
        }
        if (read(this.f16275k, 0, 1) < 1) {
            return -1;
        }
        return this.f16275k[0];
    }

    private void j(int i10, int i11, String str) throws CharConversionException {
        int i12 = (this.f16273i + this.f16268d) - 1;
        throw new CharConversionException(dOIDCKnIR.agtMhsmGTWB + Integer.toHexString(i10) + str + " at char #" + (this.f16272h + i11) + ", byte #" + i12 + ")");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ce A[LOOP:0: B:24:0x003e->B:42:0x00ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0 A[SYNTHETIC] */
    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws CharConversionException {
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f16267c == null) {
            return -1;
        }
        if (i11 < 1) {
            return i11;
        }
        if (i10 < 0 || i10 + i11 > cArr.length) {
            i(cArr, i10, i11);
        }
        int i16 = i11 + i10;
        char c10 = this.f16271g;
        if (c10 != 0) {
            i12 = i10 + 1;
            cArr[i10] = c10;
            this.f16271g = (char) 0;
        } else {
            int i17 = this.f16269e - this.f16268d;
            if (i17 < 4 && !h(i17)) {
                if (i17 == 0) {
                    return -1;
                }
                l(this.f16269e - this.f16268d, 4);
            }
            i12 = i10;
        }
        int i18 = this.f16269e - 4;
        while (i12 < i16) {
            int i19 = this.f16268d;
            if (this.f16270f) {
                byte[] bArr = this.f16267c;
                i13 = (bArr[i19] << 8) | (bArr[i19 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                i14 = (bArr[i19 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i19 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
            } else {
                byte[] bArr2 = this.f16267c;
                int i20 = (bArr2[i19] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr2[i19 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
                i13 = (bArr2[i19 + 3] << 8) | (bArr2[i19 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                i14 = i20;
            }
            this.f16268d = i19 + 4;
            if (i13 != 0) {
                int i21 = 65535 & i13;
                int i22 = i14 | ((i21 - 1) << 16);
                if (i21 > 16) {
                    j(i22, i12 - i10, String.format(" (above 0x%08x)", 1114111));
                }
                i15 = i12 + 1;
                cArr[i12] = (char) ((i22 >> 10) + 55296);
                int i23 = (i22 & 1023) | 56320;
                if (i15 >= i16) {
                    this.f16271g = (char) i22;
                } else {
                    i14 = i23;
                    i12 = i15;
                    i15 = i12 + 1;
                    cArr[i12] = (char) i14;
                    if (this.f16268d > i18) {
                        i12 = i15;
                    }
                }
            } else {
                i15 = i12 + 1;
                cArr[i12] = (char) i14;
                if (this.f16268d > i18) {
                    i12 = i15;
                }
            }
            i12 = i15;
            break;
        }
        int i24 = i12 - i10;
        this.f16272h += i24;
        return i24;
    }
}
