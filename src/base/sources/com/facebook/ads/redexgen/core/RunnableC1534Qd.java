package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class RunnableC1534Qd implements Runnable {
    public static Comparator<C1533Qc> A04;
    public static byte[] A05;
    public static String[] A06 = {"ZWObiMwNkhaZGfEgqHenCxQvRQCezgXM", "iKaB5ntiNbaiz6tgW", "JplxjEE1IYbCInXXNCkbxZV0", "UEoPOy6vCmPnpiXEMXmcZKvRtDoHf0nN", "JvUlYJe7lgtJoJN1gtwvhyIs", "RcG3r4ysor4dcgCWVGn8CFYsdgQ7jZkt", "cxmAjzJ", "EyohaYHYoMvb6y9gFGiucolIeU60NsdM"};
    public static final ThreadLocal<RunnableC1534Qd> A07;
    public long A00;
    public long A01;
    public ArrayList<C7M> A02 = new ArrayList<>();
    public ArrayList<C1533Qc> A03 = new ArrayList<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{105, 109, 27, 117, 94, 72, 79, 94, 95, 27, 107, 73, 94, 93, 94, 79, 88, 83, 100, 96, 22, 102, 68, 83, 80, 83, 66, 85, 94};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new C1532Qb();
    }

    private RK A00(C7M c7m, int i10, long j10) {
        if (A08(c7m, i10)) {
            return null;
        }
        RA ra2 = c7m.A0r;
        try {
            c7m.A1M();
            RK rkA0I = ra2.A0I(i10, false, j10);
            if (rkA0I != null) {
                if (rkA0I.A0e() && !rkA0I.A0f()) {
                    ra2.A0T(rkA0I.A0H);
                } else {
                    ra2.A0Z(rkA0I, false);
                }
            }
            return rkA0I;
        } finally {
            c7m.A1o(false);
        }
    }

    private void A02() {
        C1533Qc c1533Qc;
        int size = this.A02.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C7M c7m = this.A02.get(i11);
            int viewCount = c7m.getWindowVisibility();
            if (viewCount == 0) {
                c7m.A02.A04(c7m, false);
                int viewCount2 = c7m.A02.A00;
                i10 += viewCount2;
            }
        }
        this.A03.ensureCapacity(i10);
        int j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            C7M c7m2 = this.A02.get(i12);
            int viewCount3 = c7m2.getWindowVisibility();
            if (viewCount3 == 0) {
                C2269hs c2269hs = c7m2.A02;
                int viewCount4 = c2269hs.A01;
                int i13 = Math.abs(viewCount4);
                int viewCount5 = c2269hs.A02;
                int i14 = i13 + Math.abs(viewCount5);
                for (int i15 = 0; i15 < viewCount * 2; i15 += 2) {
                    int viewCount6 = this.A03.size();
                    if (j10 >= viewCount6) {
                        c1533Qc = new C1533Qc();
                        this.A03.add(c1533Qc);
                    } else {
                        c1533Qc = this.A03.get(j10);
                    }
                    int totalTaskCount = i15 + 1;
                    int totalTaskIndex = c2269hs.A03[totalTaskCount];
                    c1533Qc.A04 = totalTaskIndex <= i14;
                    c1533Qc.A02 = i14;
                    c1533Qc.A00 = totalTaskIndex;
                    c1533Qc.A03 = c7m2;
                    int totalTaskCount2 = c2269hs.A03[i15];
                    c1533Qc.A01 = totalTaskCount2;
                    j10++;
                }
            }
        }
        Collections.sort(this.A03, A04);
    }

    private void A04(long j10) {
        for (int i10 = 0; i10 < i; i10++) {
            C1533Qc c1533Qc = this.A03.get(i10);
            if (A06[7].charAt(15) != 'g') {
                throw new RuntimeException();
            }
            A06[6] = "gpZ2KV2";
            C1533Qc c1533Qc2 = c1533Qc;
            if (c1533Qc2.A03 == null) {
                return;
            }
            A06(c1533Qc2, j10);
            c1533Qc2.A00();
        }
    }

    private final void A05(long j10) {
        A02();
        A04(j10);
    }

    private void A06(C1533Qc c1533Qc, long j10) {
        RK rkA00 = A00(c1533Qc.A03, c1533Qc.A01, c1533Qc.A04 ? Long.MAX_VALUE : j10);
        if (rkA00 != null && rkA00.A09 != null && rkA00.A0e() && !rkA00.A0f()) {
            C7M c7m = rkA00.A09.get();
            if (A06[3].charAt(4) != 'O') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[0] = "y01bdO2VJYUoPT1JEr7HCeGbjhjinZRt";
            strArr[5] = "ogbTL45N3M3fzw26YptkCantwmvhDLLM";
            A07(c7m, j10);
        }
    }

    private void A07(C7M c7m, long j10) {
        if (c7m == null) {
            return;
        }
        if (c7m.A0C && c7m.A01.A06() != 0) {
            c7m.A1P();
        }
        C2269hs c2269hs = c7m.A02;
        c2269hs.A04(c7m, true);
        if (c2269hs.A00 != 0) {
            try {
                P4.A01(A01(0, 18, 83));
                c7m.A0s.A05(c7m.A04);
                for (int i10 = 0; i10 < c2269hs.A00 * 2; i10 += 2) {
                    A00(c7m, c2269hs.A03[i10], j10);
                }
                P4.A00();
            } catch (Throwable th2) {
                P4.A00();
                throw th2;
            }
        }
    }

    public static boolean A08(C7M c7m, int i10) {
        int iA06 = c7m.A01.A06();
        for (int i11 = 0; i11 < iA06; i11++) {
            RK rkA0F = C7M.A0F(c7m.A01.A0A(i11));
            int childCount = rkA0F.A03;
            if (childCount == i10 && !rkA0F.A0f()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(C7M c7m) {
        this.A02.add(c7m);
    }

    public final void A0A(C7M c7m) {
        this.A02.remove(c7m);
    }

    public final void A0B(C7M c7m, int i10, int i11) {
        if (c7m.isAttachedToWindow()) {
            long j10 = this.A01;
            String[] strArr = A06;
            if (strArr[0].charAt(20) != strArr[5].charAt(20)) {
                throw new RuntimeException();
            }
            A06[6] = "T8Y6UBY";
            if (j10 == 0) {
                this.A01 = c7m.getNanoTime();
                c7m.post(this);
            }
        }
        c7m.A02.A03(i10, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            P4.A01(A01(18, 11, 94));
            if (this.A02.isEmpty()) {
                this.A01 = 0L;
                if (A06[6].length() != 7) {
                    throw new RuntimeException();
                }
                A06[7] = "jOxF3Mzmcdx8L8GgZmI4I6pGAsyGGZV3";
                P4.A00();
                return;
            }
            int size = this.A02.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                C7M c7m = this.A02.get(i10);
                if (c7m.getWindowVisibility() == 0) {
                    jMax = Math.max(c7m.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.A01 = 0L;
                P4.A00();
            } else {
                A05(TimeUnit.MILLISECONDS.toNanos(jMax) + this.A00);
                this.A01 = 0L;
                P4.A00();
            }
        } catch (Throwable th2) {
            this.A01 = 0L;
            P4.A00();
            throw th2;
        }
    }
}
