package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class RS {
    public static byte[] A02;
    public static String[] A03 = {"TTkBeT", "dgqPpyxawDBTokVKz6usds7DGGljbLlG", "Om", "1", "lOfLhIubd0jJyTpTkNltmpZf14oHCLV9", "yX0qRkYxaN2cv8t3SuJSwpxSeia", "n9D4XHOOTGgVdLWa6Wuko3wZCERnKgc", "NKR9b6EIrIhl49GaATLNKeLdYiLud"};
    public final C2282i7<RK, RQ> A00 = new C2282i7<>();
    public final P6<RK> A01 = new P6<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {78, 118, 112, 119, 35, 115, 113, 108, 117, 106, 103, 102, 35, 101, 111, 98, 100, 35, 83, 81, 70, 35, 108, 113, 35, 83, 76, 80, 87};
        if (A03[1].charAt(27) != 'j') {
            throw new RuntimeException();
        }
        A03[0] = "DMTuNl";
        A02 = bArr;
    }

    static {
        A02();
    }

    private C1553Qx A00(RK rk2, int i10) {
        RQ rqA0B;
        C1553Qx info;
        int iA08 = this.A00.A08(rk2);
        if (iA08 >= 0 && (rqA0B = this.A00.A0B(iA08)) != null) {
            int i11 = rqA0B.A00;
            if (A03[2].length() != 2) {
                throw new RuntimeException();
            }
            A03[2] = "6x";
            if ((i11 & i10) != 0) {
                int i12 = rqA0B.A00;
                int index = ~i10;
                rqA0B.A00 = i12 & index;
                if (i10 == 4) {
                    info = rqA0B.A02;
                } else if (i10 == 8) {
                    info = rqA0B.A01;
                } else {
                    throw new IllegalArgumentException(A01(0, 29, 14));
                }
                int index2 = rqA0B.A00;
                if ((index2 & 12) == 0) {
                    this.A00.A0A(iA08);
                    RQ.A02(rqA0B);
                }
                return info;
            }
        }
        return null;
    }

    public final C1553Qx A03(RK rk2) {
        return A00(rk2, 8);
    }

    public final C1553Qx A04(RK rk2) {
        return A00(rk2, 4);
    }

    public final RK A05(long j10) {
        return this.A01.A08(j10);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        RQ.A01();
    }

    public final void A08(long j10, RK rk2) {
        this.A01.A0B(j10, rk2);
    }

    public final void A09(RK rk2) {
        RQ rqA00 = this.A00.get(rk2);
        if (rqA00 == null) {
            rqA00 = RQ.A00();
            this.A00.put(rk2, rqA00);
        }
        rqA00.A00 |= 1;
    }

    public final void A0A(RK rk2) {
        RQ rq = this.A00.get(rk2);
        if (rq == null) {
            return;
        }
        rq.A00 &= -2;
    }

    public final void A0B(RK rk2) {
        for (int iA06 = this.A01.A06() - 1; iA06 >= 0; iA06--) {
            if (rk2 == this.A01.A07(iA06)) {
                this.A01.A0A(iA06);
                break;
            }
        }
        RQ info = this.A00.remove(rk2);
        if (info != null) {
            RQ.A02(info);
        }
    }

    public final void A0C(RK rk2) {
        A0A(rk2);
    }

    public final void A0D(RK rk2, C1553Qx c1553Qx) {
        RQ rqA00 = this.A00.get(rk2);
        if (rqA00 == null) {
            rqA00 = RQ.A00();
            this.A00.put(rk2, rqA00);
        }
        rqA00.A00 |= 2;
        rqA00.A02 = c1553Qx;
    }

    public final void A0E(RK rk2, C1553Qx c1553Qx) {
        RQ rqA00 = this.A00.get(rk2);
        if (rqA00 == null) {
            rqA00 = RQ.A00();
            this.A00.put(rk2, rqA00);
        }
        rqA00.A01 = c1553Qx;
        rqA00.A00 |= 8;
    }

    public final void A0F(RK rk2, C1553Qx c1553Qx) {
        RQ rqA00 = this.A00.get(rk2);
        if (rqA00 == null) {
            rqA00 = RQ.A00();
            this.A00.put(rk2, rqA00);
        }
        rqA00.A02 = c1553Qx;
        rqA00.A00 |= 4;
    }

    public final void A0G(RR rr) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            RK rkA09 = this.A00.A09(size);
            RQ rqA0A = this.A00.A0A(size);
            if ((rqA0A.A00 & 3) == 3) {
                rr.AKZ(rkA09);
            } else {
                int index = rqA0A.A00;
                if ((index & 1) != 0) {
                    if (rqA0A.A02 == null) {
                        rr.AKZ(rkA09);
                    } else {
                        rr.AHB(rkA09, rqA0A.A02, rqA0A.A01);
                    }
                } else if ((rqA0A.A00 & 14) == 14) {
                    rr.AH9(rkA09, rqA0A.A02, rqA0A.A01);
                } else if ((rqA0A.A00 & 12) == 12) {
                    rr.AHD(rkA09, rqA0A.A02, rqA0A.A01);
                } else {
                    int index2 = rqA0A.A00;
                    if ((index2 & 4) != 0) {
                        rr.AHB(rkA09, rqA0A.A02, null);
                    } else {
                        int index3 = rqA0A.A00;
                        if ((index3 & 8) != 0) {
                            C1553Qx c1553Qx = rqA0A.A02;
                            if (A03[4].charAt(6) == 'y') {
                                throw new RuntimeException();
                            }
                            A03[7] = "pRTOxDzzIVV0VuKMKqyuKOShfW9n8";
                            rr.AH9(rkA09, c1553Qx, rqA0A.A01);
                        } else {
                            continue;
                        }
                    }
                }
            }
            RQ.A02(rqA0A);
        }
    }

    public final boolean A0H(RK rk2) {
        RQ record = this.A00.get(rk2);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(RK rk2) {
        RQ record = this.A00.get(rk2);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
