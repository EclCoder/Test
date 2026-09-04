package com.google.api.client.util.escape;

import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class PercentEscaper extends UnicodeEscaper {
    public static final String SAFECHARS_URLENCODER = "-_.*";
    public static final String SAFEPATHCHARS_URLENCODER = "-_.!~*'()@:$&,;=+";
    public static final String SAFEQUERYSTRINGCHARS_URLENCODER = "-_.!~*'()@:$,;/?:";
    public static final String SAFEUSERINFOCHARS_URLENCODER = "-_.!~*'():$&,;=";
    public static final String SAFE_PLUS_RESERVED_CHARS_URLENCODER = "-_.!~*'()@:$&,;=+/?";
    private final boolean plusForSpace;
    private final boolean[] safeOctets;
    private static final char[] URI_ESCAPED_SPACE = {'+'};
    private static final char[] UPPER_HEX_DIGITS = "0123456789ABCDEF".toCharArray();

    public PercentEscaper(String str) {
        this(str, false);
    }

    private static boolean[] createSafeOctets(String str) {
        char[] charArray = str.toCharArray();
        int iMax = 122;
        for (char c10 : charArray) {
            iMax = Math.max((int) c10, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (int i10 = 48; i10 <= 57; i10++) {
            zArr[i10] = true;
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            zArr[i11] = true;
        }
        for (int i12 = 97; i12 <= 122; i12++) {
            zArr[i12] = true;
        }
        for (char c11 : charArray) {
            zArr[c11] = true;
        }
        return zArr;
    }

    @Override // com.google.api.client.util.escape.UnicodeEscaper, com.google.api.client.util.escape.Escaper
    public String escape(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            boolean[] zArr = this.safeOctets;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return escapeSlow(str, i10);
            }
        }
        return str;
    }

    @Override // com.google.api.client.util.escape.UnicodeEscaper
    protected int nextEscapeIndex(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            boolean[] zArr = this.safeOctets;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            i10++;
        }
        return i10;
    }

    @Deprecated
    public PercentEscaper(String str, boolean z10) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric ASCII characters are always 'safe' and should not be escaped.");
        }
        if (z10 && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        if (str.contains("%")) {
            throw new IllegalArgumentException(IAoPeRfJn.TSCIviBlOVdZU);
        }
        this.plusForSpace = z10;
        this.safeOctets = createSafeOctets(str);
    }

    @Override // com.google.api.client.util.escape.UnicodeEscaper
    protected char[] escape(int i10) {
        boolean[] zArr = this.safeOctets;
        if (i10 < zArr.length && zArr[i10]) {
            return null;
        }
        if (i10 == 32 && this.plusForSpace) {
            return URI_ESCAPED_SPACE;
        }
        if (i10 <= 127) {
            char[] cArr = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr[i10 >>> 4], cArr[i10 & 15]};
        }
        if (i10 <= 2047) {
            char[] cArr2 = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr2[(i10 >>> 10) | 12], cArr2[(i10 >>> 6) & 15], '%', cArr2[((i10 >>> 4) & 3) | 8], cArr2[i10 & 15]};
        }
        if (i10 <= 65535) {
            char[] cArr3 = UPPER_HEX_DIGITS;
            return new char[]{'%', 'E', cArr3[i10 >>> 12], '%', cArr3[((i10 >>> 10) & 3) | 8], cArr3[(i10 >>> 6) & 15], '%', cArr3[((i10 >>> 4) & 3) | 8], cArr3[i10 & 15]};
        }
        if (i10 <= 1114111) {
            char[] cArr4 = UPPER_HEX_DIGITS;
            return new char[]{'%', 'F', cArr4[(i10 >>> 18) & 7], '%', cArr4[((i10 >>> 16) & 3) | 8], cArr4[(i10 >>> 12) & 15], '%', cArr4[((i10 >>> 10) & 3) | 8], cArr4[(i10 >>> 6) & 15], '%', cArr4[((i10 >>> 4) & 3) | 8], cArr4[i10 & 15]};
        }
        throw new IllegalArgumentException("Invalid unicode character value " + i10);
    }
}
