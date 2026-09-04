package com.google.common.io;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseEncoding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final BaseEncoding f21902a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BaseEncoding f21903b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BaseEncoding f21904c = new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BaseEncoding f21905d = new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BaseEncoding f21906e = new b("base16()", "0123456789ABCDEF");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f21907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char[] f21908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f21909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f21910d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f21911e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f21912f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f21913g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean[] f21914h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f21915i;

        a(String str, char[] cArr) {
            this(str, cArr, b(cArr), false);
        }

        private static byte[] b(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 < cArr.length; i10++) {
                char c10 = cArr[i10];
                boolean z10 = true;
                p.f(c10 < 128, "Non-ASCII character: %s", c10);
                if (bArr[c10] != -1) {
                    z10 = false;
                }
                p.f(z10, "Duplicate character: %s", c10);
                bArr[c10] = (byte) i10;
            }
            return bArr;
        }

        int c(char c10) throws DecodingException {
            if (c10 > 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c10));
            }
            byte b10 = this.f21913g[c10];
            if (b10 != -1) {
                return b10;
            }
            if (c10 <= ' ' || c10 == 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c10));
            }
            throw new DecodingException("Unrecognized character: " + c10);
        }

        char d(int i10) {
            return this.f21908b[i10];
        }

        boolean e(int i10) {
            return this.f21914h[i10 % this.f21911e];
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f21915i == aVar.f21915i && Arrays.equals(this.f21908b, aVar.f21908b)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f(char c10) {
            byte[] bArr = this.f21913g;
            return c10 < bArr.length && bArr[c10] != -1;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f21908b) + (this.f21915i ? 1231 : 1237);
        }

        public String toString() {
            return this.f21907a;
        }

        private a(String str, char[] cArr, byte[] bArr, boolean z10) {
            this.f21907a = (String) p.o(str);
            this.f21908b = (char[]) p.o(cArr);
            try {
                int iE = wc.d.e(cArr.length, RoundingMode.UNNECESSARY);
                this.f21910d = iE;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iE);
                int i10 = 1 << (3 - iNumberOfTrailingZeros);
                this.f21911e = i10;
                this.f21912f = iE >> iNumberOfTrailingZeros;
                this.f21909c = cArr.length - 1;
                this.f21913g = bArr;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 < this.f21912f; i11++) {
                    zArr[wc.d.b(i11 * 8, this.f21910d, RoundingMode.CEILING)] = true;
                }
                this.f21914h = zArr;
                this.f21915i = z10;
            } catch (ArithmeticException e10) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final char[] f21916h;

        b(String str, String str2) {
            this(new a(str, str2.toCharArray()));
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        int e(byte[] bArr, CharSequence charSequence) throws DecodingException {
            p.o(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new DecodingException("Invalid input length " + charSequence.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.f21917f.c(charSequence.charAt(i10)) << 4) | this.f21917f.c(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        void h(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            p.o(appendable);
            p.u(i10, i10 + i11, bArr.length);
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = bArr[i10 + i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                appendable.append(this.f21916h[i13]);
                appendable.append(this.f21916h[i13 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.d
        BaseEncoding o(a aVar, Character ch2) {
            return new b(aVar);
        }

        private b(a aVar) {
            super(aVar, null);
            this.f21916h = new char[512];
            p.d(aVar.f21908b.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                this.f21916h[i10] = aVar.d(i10 >>> 4);
                this.f21916h[i10 | 256] = aVar.d(i10 & 15);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends d {
        c(String str, String str2, Character ch2) {
            this(new a(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        int e(byte[] bArr, CharSequence charSequence) throws DecodingException {
            p.o(bArr);
            CharSequence charSequenceM = m(charSequence);
            if (!this.f21917f.e(charSequenceM.length())) {
                throw new DecodingException("Invalid input length " + charSequenceM.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceM.length()) {
                int i12 = i10 + 2;
                int iC = (this.f21917f.c(charSequenceM.charAt(i10)) << 18) | (this.f21917f.c(charSequenceM.charAt(i10 + 1)) << 12);
                int i13 = i11 + 1;
                bArr[i11] = (byte) (iC >>> 16);
                if (i12 < charSequenceM.length()) {
                    int i14 = i10 + 3;
                    int iC2 = iC | (this.f21917f.c(charSequenceM.charAt(i12)) << 6);
                    int i15 = i11 + 2;
                    bArr[i13] = (byte) ((iC2 >>> 8) & 255);
                    if (i14 < charSequenceM.length()) {
                        i10 += 4;
                        i11 += 3;
                        bArr[i15] = (byte) ((iC2 | this.f21917f.c(charSequenceM.charAt(i14))) & 255);
                    } else {
                        i11 = i15;
                        i10 = i14;
                    }
                } else {
                    i11 = i13;
                    i10 = i12;
                }
            }
            return i11;
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        void h(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            p.o(appendable);
            int i12 = i10 + i11;
            p.u(i10, i12, bArr.length);
            while (i11 >= 3) {
                int i13 = i10 + 2;
                int i14 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                i10 += 3;
                int i15 = i14 | (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                appendable.append(this.f21917f.d(i15 >>> 18));
                appendable.append(this.f21917f.d((i15 >>> 12) & 63));
                appendable.append(this.f21917f.d((i15 >>> 6) & 63));
                appendable.append(this.f21917f.d(i15 & 63));
                i11 -= 3;
            }
            if (i10 < i12) {
                n(appendable, bArr, i10, i12 - i10);
            }
        }

        @Override // com.google.common.io.BaseEncoding.d
        BaseEncoding o(a aVar, Character ch2) {
            return new c(aVar, ch2);
        }

        private c(a aVar, Character ch2) {
            super(aVar, ch2);
            p.d(aVar.f21908b.length == 64);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d extends BaseEncoding {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final a f21917f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Character f21918g;

        d(String str, String str2, Character ch2) {
            this(new a(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.io.BaseEncoding
        int e(byte[] bArr, CharSequence charSequence) throws DecodingException {
            a aVar;
            p.o(bArr);
            CharSequence charSequenceM = m(charSequence);
            if (!this.f21917f.e(charSequenceM.length())) {
                throw new DecodingException("Invalid input length " + charSequenceM.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceM.length()) {
                long jC = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    aVar = this.f21917f;
                    if (i12 >= aVar.f21911e) {
                        break;
                    }
                    jC <<= aVar.f21910d;
                    if (i10 + i12 < charSequenceM.length()) {
                        jC |= (long) this.f21917f.c(charSequenceM.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = aVar.f21912f;
                int i15 = (i14 * 8) - (i13 * aVar.f21910d);
                int i16 = (i14 - 1) * 8;
                while (i16 >= i15) {
                    bArr[i11] = (byte) ((jC >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.f21917f.f21911e;
            }
            return i11;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f21917f.equals(dVar.f21917f) && Objects.equals(this.f21918g, dVar.f21918g)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.io.BaseEncoding
        void h(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            p.o(appendable);
            p.u(i10, i10 + i11, bArr.length);
            int i12 = 0;
            while (i12 < i11) {
                n(appendable, bArr, i10 + i12, Math.min(this.f21917f.f21912f, i11 - i12));
                i12 += this.f21917f.f21912f;
            }
        }

        public int hashCode() {
            return this.f21917f.hashCode() ^ Objects.hashCode(this.f21918g);
        }

        @Override // com.google.common.io.BaseEncoding
        int j(int i10) {
            return (int) (((((long) this.f21917f.f21910d) * ((long) i10)) + 7) / 8);
        }

        @Override // com.google.common.io.BaseEncoding
        int k(int i10) {
            a aVar = this.f21917f;
            return aVar.f21911e * wc.d.b(i10, aVar.f21912f, RoundingMode.CEILING);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding l() {
            return this.f21918g == null ? this : o(this.f21917f, null);
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence m(CharSequence charSequence) {
            p.o(charSequence);
            Character ch2 = this.f21918g;
            if (ch2 == null) {
                return charSequence;
            }
            char cCharValue = ch2.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        void n(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            p.o(appendable);
            p.u(i10, i10 + i11, bArr.length);
            int i12 = 0;
            p.d(i11 <= this.f21917f.f21912f);
            long j10 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                j10 = (j10 | ((long) (bArr[i10 + i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) << 8;
            }
            int i14 = ((i11 + 1) * 8) - this.f21917f.f21910d;
            while (i12 < i11 * 8) {
                a aVar = this.f21917f;
                appendable.append(aVar.d(((int) (j10 >>> (i14 - i12))) & aVar.f21909c));
                i12 += this.f21917f.f21910d;
            }
            if (this.f21918g != null) {
                while (i12 < this.f21917f.f21912f * 8) {
                    appendable.append(this.f21918g.charValue());
                    i12 += this.f21917f.f21910d;
                }
            }
        }

        BaseEncoding o(a aVar, Character ch2) {
            return new d(aVar, ch2);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f21917f);
            if (8 % this.f21917f.f21910d != 0) {
                if (this.f21918g == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f21918g);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        d(a aVar, Character ch2) {
            this.f21917f = (a) p.o(aVar);
            p.j(ch2 == null || !aVar.f(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.f21918g = ch2;
        }
    }

    BaseEncoding() {
    }

    public static BaseEncoding a() {
        return f21902a;
    }

    public static BaseEncoding b() {
        return f21903b;
    }

    private static byte[] i(byte[] bArr, int i10) {
        if (i10 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    public final byte[] c(CharSequence charSequence) {
        try {
            return d(charSequence);
        } catch (DecodingException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    final byte[] d(CharSequence charSequence) {
        CharSequence charSequenceM = m(charSequence);
        byte[] bArr = new byte[j(charSequenceM.length())];
        return i(bArr, e(bArr, charSequenceM));
    }

    abstract int e(byte[] bArr, CharSequence charSequence);

    public String f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public final String g(byte[] bArr, int i10, int i11) {
        p.u(i10, i10 + i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(k(i11));
        try {
            h(sb2, bArr, i10, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    abstract void h(Appendable appendable, byte[] bArr, int i10, int i11);

    abstract int j(int i10);

    abstract int k(int i10);

    public abstract BaseEncoding l();

    abstract CharSequence m(CharSequence charSequence);
}
