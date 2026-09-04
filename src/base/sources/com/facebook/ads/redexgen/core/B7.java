package com.facebook.ads.redexgen.core;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class B7 {
    public static byte[] A06;
    public static String[] A07 = {"eoBlep8s1FBIN6Rt", "z5PVad8lFvymSbVcRUVN6mCVOAyUTpZZ", "CSzRbjHFCczJ9I", "vibjkM4Umklha9WpeyLj2yq757BqeZSZ", "UWrS", "", "nE8lp", "HlO2gnmnWOpwEq19Q9DE2Hcik4TJ8nc9"};
    public static final B7 A08;

    @Nullable
    public MediaCodecPoolTracker A01;

    @Nullable
    public Boolean A02;
    public volatile Map<String, Set<B0>> A04 = new HashMap();
    public final B6 A03 = new B6(this);
    public int A00 = 0;
    public volatile long A05 = -1;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A06 = new byte[]{-63, -71, -56, -75, -126, -72, -75, -54, -123, -72, -126, -75, -54, -123, -126, -72, -71, -73, -61, -72, -71, -58};
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0082 A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #3 {all -> 0x009f, blocks: (B:41:0x0078, B:44:0x007e, B:46:0x0082), top: B:56:0x0078 }] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0C(boolean z10, C2354jQ c2354jQ, EnumC2351jL enumC2351jL, String str, B0 b10) {
        if (A0I(z10, c2354jQ) && A0G(str, c2354jQ)) {
            boolean z11 = true;
            synchronized (this) {
                if (this.A00 < c2354jQ.A07) {
                    Set<B0> setA06 = this.A04.get(str);
                    if (setA06 == null) {
                        setA06 = A06();
                        this.A04.put(str, setA06);
                    }
                    if (setA06.contains(b10)) {
                        z11 = false;
                    } else if (((z10 && c2354jQ.A0N) || (!z10 && c2354jQ.A0M)) && setA06.size() < c2354jQ.A06) {
                        setA06.add(b10);
                        this.A00++;
                        z11 = false;
                    }
                }
                if (!z11) {
                    try {
                        try {
                            this.A05 = SystemClock.elapsedRealtime();
                            b10.reset();
                            A03().A09(enumC2351jL, b10.hashCode());
                            this.A05 = -1L;
                            return;
                        } catch (IllegalStateException unused) {
                            A0B(str, b10);
                            this.A05 = -1L;
                            if (c2354jQ.A0R) {
                                b10.stop();
                            } else {
                                b10.stop();
                            }
                        }
                    } catch (Throwable th2) {
                        this.A05 = -1L;
                        throw th2;
                    }
                }
            }
        }
        try {
            if (c2354jQ.A0R || (!z10 && !c2354jQ.A0Q)) {
                b10.stop();
            }
        } finally {
            A03().A08(enumC2351jL, b10.hashCode());
            b10.AHb();
            A03().A07(enumC2351jL, b10.hashCode());
        }
    }

    static {
        A08();
        A08 = new B7();
    }

    private B0 A01(boolean z10, C2354jQ c2354jQ, EnumC2351jL enumC2351jL, String str) throws Exception {
        if (A0I(z10, c2354jQ) && A0G(str, c2354jQ)) {
            synchronized (this) {
                Set<B0> set = this.A04.get(str);
                if (set != null && !set.isEmpty()) {
                    this.A00--;
                    Iterator<B0> it = set.iterator();
                    B0 ret = it.next();
                    it.remove();
                    A03().A0A(z10, str, enumC2351jL, ret.hashCode());
                    return ret;
                }
            }
        }
        try {
            C2349jJ c2349jJA05 = A03().A05(z10, str, enumC2351jL);
            B0 b0A03 = this.A03.A03(z10, str);
            A03().A06(c2349jJA05, b0A03.hashCode());
            return b0A03;
        } catch (Exception e10) {
            throw new MediaCodecInitializationException(str, e10);
        }
    }

    public static B7 A02() {
        B7 b10 = A08;
        String[] strArr = A07;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "gdX1n";
        strArr2[4] = "uqN6";
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaCodecPoolTracker A03() {
        if (this.A01 != null) {
            return this.A01;
        }
        return NoOpMediaCodecPoolTracker.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<B0> A06() {
        if (this.A02 != null && this.A02.booleanValue()) {
            return new CopyOnWriteArraySet();
        }
        return new HashSet();
    }

    private void A09(MediaCodecPoolTracker mediaCodecPoolTracker) {
        if (this.A01 == null) {
            this.A01 = mediaCodecPoolTracker;
        }
    }

    private void A0A(C2354jQ c2354jQ) {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(c2354jQ.A0S);
                    if (this.A02.booleanValue()) {
                        this.A04 = new ConcurrentHashMap();
                    }
                }
            }
        }
    }

    private void A0B(String str, B0 b10) {
        Set<B0> set = this.A04.get(str);
        if (set != null && set.remove(b10)) {
            int i10 = this.A00;
            String[] strArr = A07;
            if (strArr[3].charAt(31) != strArr[1].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "FxBrmOrzGAHEl951IE67fieu752sH0JZ";
            strArr2[1] = "QwM4isUBZzXVsf3PyxWpFGvjBfZOcOMZ";
            this.A00 = i10 - 1;
        }
    }

    public static boolean A0E(String str) {
        return str.equals(A05(0, 22, 10));
    }

    public static boolean A0G(String str, C2354jQ c2354jQ) {
        if (A0E(str) && c2354jQ.A0C) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0I(boolean z10, C2354jQ c2354jQ) {
        if (c2354jQ.A0E && this.A05 != -1 && SystemClock.elapsedRealtime() - this.A05 > 5000) {
            return false;
        }
        return A0J(z10, c2354jQ);
    }

    public static boolean A0J(boolean z10, C2354jQ c2354jQ) {
        return (z10 && c2354jQ.A0N) || (!z10 && c2354jQ.A0M);
    }

    public final B0 A0K(boolean z10, C2354jQ c2354jQ, MediaCodecPoolTracker mediaCodecPoolTracker, EnumC2351jL enumC2351jL, String str) throws Exception {
        A09(mediaCodecPoolTracker);
        A0A(c2354jQ);
        if (c2354jQ.A0K) {
            B0 b0A02 = this.A03.A02(z10, c2354jQ, enumC2351jL, str);
            String[] strArr = A07;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "ttyEUrXfsAwEm9Eniby4AXTGkmRMb34Z";
            strArr2[1] = "BAFCEyHtTeugEvQpUcdazZ0OUcRhptwZ";
            return b0A02;
        }
        return A01(z10, c2354jQ, enumC2351jL, str);
    }

    public final void A0L(boolean z10, C2354jQ c2354jQ, MediaCodecPoolTracker mediaCodecPoolTracker, EnumC2351jL enumC2351jL, String str, B0 b10) throws Throwable {
        A09(mediaCodecPoolTracker);
        if (c2354jQ.A0K) {
            this.A03.A0A(z10, c2354jQ, enumC2351jL, str, b10);
        } else {
            A0C(z10, c2354jQ, enumC2351jL, str, b10);
        }
    }
}
