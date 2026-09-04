package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class K2 {
    public static byte[] A07;
    public static String[] A08 = {"kwH2IgvZBGVpLaminurwcFHn", "J6e0tkh1Ff6tZSOwzR7AwbvIu8fVWeGQ", "bmiWbLOqDwiyYFUNe9As1QTlUgH4xYog", "dMXPCdyZdj7A6mfCnV5k3qiAvM2EcvhL", "upBvpVjUbbd4tW9uVknw3ChYtDg3XaKB", "lx9xVZ51GyjZV5dkAVxa", "4OpeXOwoxJhsdURDQeyl4TBKgN5cofiY", "16zjJfNWedSO35u1fMpvBODfGSUbEH9B"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02 = new Paint();
    public final Paint A03;
    public final C1373Ju A04;
    public final C1374Jv A05;
    public final K1 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1373Ju A04(C10044u c10044u, int i10) {
        int[] iArr;
        int iA04;
        int iA05;
        int iA06;
        int iA07;
        int i11 = 8;
        int iA08 = c10044u.A04(8);
        c10044u.A09(8);
        int i12 = i10 - 2;
        int[] iArrA0F = A0F();
        int[] iArrA0G = A0G();
        int[] iArrA0H = A0H();
        while (i12 > 0) {
            int iA09 = c10044u.A04(i11);
            int iA010 = c10044u.A04(i11);
            int i13 = i12 - 2;
            if ((iA010 & 128) != 0) {
                iArr = iArrA0F;
            } else {
                iArr = (iA010 & 64) != 0 ? iArrA0G : iArrA0H;
            }
            int i14 = iA010 & 1;
            String[] strArr = A08;
            if (strArr[2].charAt(19) == strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            A08[3] = "yhDNrhcDigDR24Kxe5BS389mQBs2ZM2v";
            if (i14 != 0) {
                iA04 = c10044u.A04(i11);
                iA05 = c10044u.A04(i11);
                iA06 = c10044u.A04(i11);
                iA07 = c10044u.A04(i11);
                i12 = i13 - 4;
            } else {
                iA04 = c10044u.A04(6) << 2;
                iA05 = c10044u.A04(4) << 4;
                iA06 = c10044u.A04(4) << 4;
                iA07 = c10044u.A04(2) << 6;
                i12 = i13 - 2;
            }
            if (iA04 == 0) {
                iA05 = 0;
                if (A08[3].charAt(20) != '3') {
                    throw new RuntimeException();
                }
                A08[7] = "NRFOfVblegIP33K9RsgAL0VferudmJOb";
                iA06 = 0;
                iA07 = 255;
            }
            iArr[iA09] = A00(255 - (iA07 & 255), C5C.A07((int) (((double) iA04) + (((double) (iA05 - 128)) * 1.402d)), 0, 255), C5C.A07((int) ((((double) iA04) - (((double) (iA06 - 128)) * 0.34414d)) - (((double) (iA05 - 128)) * 0.71414d)), 0, 255), C5C.A07((int) (((double) iA04) + (((double) (iA06 - 128)) * 1.772d)), 0, 255));
            i11 = 8;
        }
        return new C1373Ju(iA08, iArrA0F, iArrA0G, iArrA0H);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1374Jv A05(C10044u c10044u) {
        int iA04;
        int iA05;
        int iA06;
        int iA07;
        c10044u.A09(4);
        boolean zA0H = c10044u.A0H();
        c10044u.A09(3);
        int iA08 = c10044u.A04(16);
        int iA09 = c10044u.A04(16);
        if (zA0H) {
            iA04 = c10044u.A04(16);
            iA07 = c10044u.A04(16);
            iA05 = c10044u.A04(16);
            iA06 = c10044u.A04(16);
        } else {
            iA04 = 0;
            iA05 = 0;
            iA06 = iA09;
            iA07 = iA08;
        }
        return new C1374Jv(iA08, iA09, iA04, iA07, iA05, iA06);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1378Jz A08(C10044u c10044u, int i10) {
        int i11 = 8;
        int iA04 = c10044u.A04(8);
        c10044u.A09(4);
        boolean zA0H = c10044u.A0H();
        c10044u.A09(3);
        int iA05 = c10044u.A04(16);
        int iA06 = c10044u.A04(16);
        int iA07 = c10044u.A04(3);
        int iA08 = c10044u.A04(3);
        c10044u.A09(2);
        int iA09 = c10044u.A04(8);
        int iA010 = c10044u.A04(8);
        int iA011 = c10044u.A04(4);
        int iA012 = c10044u.A04(2);
        c10044u.A09(2);
        int i12 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i12 > 0) {
            int iA013 = c10044u.A04(16);
            int iA014 = c10044u.A04(2);
            int iA015 = c10044u.A04(2);
            int iA016 = c10044u.A04(12);
            c10044u.A09(4);
            int iA017 = c10044u.A04(12);
            i12 -= 6;
            int iA018 = 0;
            int iA019 = 0;
            if (iA014 == 1 || iA014 == 2) {
                iA018 = c10044u.A04(i11);
                iA019 = c10044u.A04(i11);
                i12 -= 2;
            }
            sparseArray.put(iA013, new K0(iA014, iA015, iA016, iA017, iA018, iA019));
            i11 = 8;
        }
        return new C1378Jz(iA04, zA0H, iA05, iA06, iA07, iA08, iA09, iA010, iA011, iA012, sparseArray);
    }

    public static String A09(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{63, 26, 15, 26, 91, 29, 18, 30, 23, 31, 91, 23, 30, 21, 28, 15, 19, 91, 30, 3, 24, 30, 30, 31, 8, 91, 23, 18, 22, 18, 15, 98, 80, 68, 118, 71, 84, 85, 67, 84};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final List<C2708pT> A0I(byte[] bArr, int i10) {
        C10044u c10044u = new C10044u(bArr, i10);
        while (c10044u.A01() >= 48 && c10044u.A04(8) == 15) {
            A0B(c10044u, this.A06);
        }
        C1376Jx c1376Jx = this.A06.A01;
        if (c1376Jx == null) {
            return Collections.emptyList();
        }
        C1374Jv c1374Jv = this.A06.A00 != null ? this.A06.A00 : this.A05;
        if (this.A00 == null || c1374Jv.A05 + 1 != this.A00.getWidth() || c1374Jv.A00 + 1 != this.A00.getHeight()) {
            this.A00 = Bitmap.createBitmap(c1374Jv.A05 + 1, c1374Jv.A00 + 1, Bitmap.Config.ARGB_8888);
            this.A01.setBitmap(this.A00);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C1377Jy> sparseArray = c1376Jx.A03;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            this.A01.save();
            C1377Jy c1377JyValueAt = sparseArray.valueAt(i11);
            C1378Jz c1378Jz = this.A06.A08.get(sparseArray.keyAt(i11));
            int i12 = c1377JyValueAt.A00 + c1374Jv.A02;
            int i13 = c1377JyValueAt.A01 + c1374Jv.A04;
            this.A01.clipRect(i12, i13, Math.min(c1378Jz.A08 + i12, c1374Jv.A01), Math.min(c1378Jz.A02 + i13, c1374Jv.A03));
            C1373Ju c1373Ju = this.A06.A06.get(c1378Jz.A00);
            if (c1373Ju == null && (c1373Ju = this.A06.A04.get(c1378Jz.A00)) == null) {
                c1373Ju = this.A04;
            }
            SparseArray<K0> sparseArray2 = c1378Jz.A09;
            for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                int iKeyAt = sparseArray2.keyAt(i14);
                K0 k0ValueAt = sparseArray2.valueAt(i14);
                C1375Jw c1375Jw = this.A06.A07.get(iKeyAt);
                if (c1375Jw == null) {
                    c1375Jw = this.A06.A05.get(iKeyAt);
                }
                if (c1375Jw != null) {
                    A0C(c1375Jw, c1373Ju, c1378Jz.A01, i12 + k0ValueAt.A02, i13 + k0ValueAt.A05, c1375Jw.A01 ? null : this.A02, this.A01);
                }
            }
            if (A08[4].charAt(14) != '9') {
                throw new RuntimeException();
            }
            A08[0] = "Y9Cu9eZ8R7HUBmBBCZ1DilUT";
            if (c1378Jz.A0A) {
                this.A03.setColor(c1378Jz.A01 == 3 ? c1373Ju.A03[c1378Jz.A07] : c1378Jz.A01 == 2 ? c1373Ju.A02[c1378Jz.A06] : c1373Ju.A01[c1378Jz.A05]);
                this.A01.drawRect(i12, i13, c1378Jz.A08 + i12, c1378Jz.A02 + i13, this.A03);
            }
            arrayList.add(new C09723o().A0D(Bitmap.createBitmap(this.A00, i12, i13, c1378Jz.A08, c1378Jz.A02)).A04(i12 / c1374Jv.A05).A0A(0).A07(i13 / c1374Jv.A00, 0).A09(0).A06(c1378Jz.A08 / c1374Jv.A05).A03(c1378Jz.A02 / c1374Jv.A00).A0H());
            this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
            this.A01.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, 15};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public K2(int i10, int i11) {
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        this.A03 = new Paint();
        this.A03.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new C1374Jv(719, 575, 0, 719, 0, 575);
        this.A04 = new C1373Ju(0, A0F(), A0G(), A0H());
        this.A06 = new K1(i10, i11);
    }

    public static int A00(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static int A01(C10044u c10044u, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10 = false;
        do {
            int iA04 = 0;
            int iA05 = c10044u.A04(2);
            if (iA05 != 0) {
                iA04 = 1;
            } else if (c10044u.A0H()) {
                iA04 = c10044u.A04(3) + 3;
                iA05 = c10044u.A04(2);
            } else if (c10044u.A0H()) {
                iA04 = 1;
                iA05 = 0;
            } else {
                switch (c10044u.A04(2)) {
                    case 0:
                        z10 = true;
                        iA05 = 0;
                        break;
                    case 1:
                        iA04 = 2;
                        iA05 = 0;
                        break;
                    case 2:
                        int iA06 = c10044u.A04(4);
                        if (A08[7].charAt(9) != 'e') {
                            A08[7] = "PWQusWjmzTX1R8w37TeIuijcGSqhz46U";
                            iA04 = iA06 + 12;
                            iA05 = c10044u.A04(2);
                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 3:
                        iA04 = c10044u.A04(8) + 29;
                        iA05 = c10044u.A04(2);
                        break;
                    default:
                        iA05 = 0;
                        break;
                }
            }
            if (iA04 != 0 && paint != null) {
                if (bArr != null) {
                    iA05 = bArr[iA05];
                }
                paint.setColor(iArr[iA05]);
                canvas.drawRect(i10, i11, i10 + iA04, i11 + 1, paint);
            }
            i10 += iA04;
        } while (!z10);
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071 A[PHI: r0
      0x0071: PHI (r0v20 int) = (r0v18 int), (r0v23 int) binds: [B:25:0x0080, B:22:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    public static int A02(C10044u c10044u, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int iA04;
        int i12 = i10;
        boolean z10 = false;
        do {
            int peek = 0;
            int iA05 = c10044u.A04(4);
            if (iA05 != 0) {
                peek = 1;
            } else if (c10044u.A0H()) {
                if (!c10044u.A0H()) {
                    peek = c10044u.A04(2) + 4;
                    iA05 = c10044u.A04(4);
                } else {
                    switch (c10044u.A04(2)) {
                        case 0:
                            peek = 1;
                            iA05 = 0;
                            break;
                        case 1:
                            peek = 2;
                            iA05 = 0;
                            break;
                        case 2:
                            peek = c10044u.A04(4) + 9;
                            iA05 = c10044u.A04(4);
                            break;
                        case 3:
                            peek = c10044u.A04(8) + 25;
                            iA05 = c10044u.A04(4);
                            break;
                        default:
                            iA05 = 0;
                            break;
                    }
                }
            } else if (A08[0].length() != 24) {
                A08[1] = "Jb849HVzYsbrcyVvorQRSzDXgxwzOwbS";
                iA04 = c10044u.A04(3);
                if (iA04 != 0) {
                    peek = iA04 + 2;
                    iA05 = 0;
                } else {
                    z10 = true;
                    iA05 = 0;
                }
            } else {
                A08[3] = "lCytI93sja9tcovqvw8Z3JcTVPPUQzad";
                iA04 = c10044u.A04(3);
                if (iA04 != 0) {
                    peek = iA04 + 2;
                    iA05 = 0;
                } else {
                    z10 = true;
                    iA05 = 0;
                }
            }
            if (peek != 0 && paint != null) {
                if (bArr != null) {
                    iA05 = bArr[iA05];
                }
                paint.setColor(iArr[iA05]);
                float f10 = i12;
                float f11 = i11;
                String[] strArr = A08;
                if (strArr[2].charAt(19) == strArr[6].charAt(19)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[2] = "7zyAW2neZYMKALasLQ64ygc21beBnsUa";
                strArr2[6] = "CykdyJVKnOvIvZ1RH2gJr9pO2NNGsRyJ";
                canvas.drawRect(f10, f11, i12 + peek, i11 + 1, paint);
            }
            i12 += peek;
        } while (!z10);
        return i12;
    }

    public static int A03(C10044u c10044u, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int runLength;
        int i12 = i10;
        boolean z10 = false;
        do {
            int iA04 = c10044u.A04(8);
            if (iA04 != 0) {
                runLength = 1;
            } else if (!c10044u.A0H()) {
                runLength = c10044u.A04(7);
                if (runLength != 0) {
                    iA04 = 0;
                } else {
                    z10 = true;
                    runLength = 0;
                    iA04 = 0;
                }
            } else {
                runLength = c10044u.A04(7);
                iA04 = c10044u.A04(8);
            }
            if (runLength != 0 && paint != null) {
                if (bArr != null) {
                    iA04 = bArr[iA04];
                }
                paint.setColor(iArr[iA04]);
                if (A08[3].charAt(20) != '3') {
                    throw new RuntimeException();
                }
                A08[3] = "mqxvpcZRbZaRJOXRSA703vBu0XWYN9Vd";
                canvas.drawRect(i12, i11, i12 + runLength, i11 + 1, paint);
            }
            i12 += runLength;
        } while (!z10);
        return i12;
    }

    public static C1375Jw A06(C10044u c10044u) {
        int iA04 = c10044u.A04(16);
        c10044u.A09(4);
        int objectCodingMethod = c10044u.A04(2);
        boolean zA0H = c10044u.A0H();
        c10044u.A09(1);
        byte[] bottomFieldData = C5C.A07;
        byte[] bArr = C5C.A07;
        if (objectCodingMethod == 1) {
            int numberOfCodes = c10044u.A04(8);
            c10044u.A09(numberOfCodes * 16);
        } else if (objectCodingMethod == 0) {
            int iA05 = c10044u.A04(16);
            int topFieldDataLength = c10044u.A04(16);
            int objectId = A08[4].charAt(14);
            if (objectId != 57) {
                throw new RuntimeException();
            }
            A08[7] = "H05iJqDXaQUoFjCcOPsdhLa69PYGJoEl";
            if (iA05 > 0) {
                bottomFieldData = new byte[iA05];
                c10044u.A0G(bottomFieldData, 0, iA05);
            }
            if (topFieldDataLength > 0) {
                bArr = new byte[topFieldDataLength];
                c10044u.A0G(bArr, 0, topFieldDataLength);
            } else {
                bArr = bottomFieldData;
            }
        }
        return new C1375Jw(iA04, zA0H, bottomFieldData, bArr);
    }

    public static C1376Jx A07(C10044u c10044u, int i10) {
        int iA04 = c10044u.A04(8);
        int iA05 = c10044u.A04(4);
        int iA06 = c10044u.A04(2);
        c10044u.A09(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int remainingLength = c10044u.A04(8);
            c10044u.A09(8);
            int version = c10044u.A04(16);
            int timeoutSecs = c10044u.A04(16);
            i11 -= 6;
            sparseArray.put(remainingLength, new C1377Jy(version, timeoutSecs));
        }
        return new C1376Jx(iA04, iA05, iA06, sparseArray);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x0111  */
    /* JADX WARN: Code duplicated, block: B:48:0x011b  */
    /* JADX WARN: Code duplicated, block: B:52:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x013f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0145  */
    public static void A0B(C10044u c10044u, K1 k10) {
        C1376Jx c1376Jx;
        C1376Jx c1376JxA07;
        int segmentType;
        int dataFieldLength;
        int segmentType2;
        C1378Jz c1378Jz;
        int pageId = c10044u.A04(8);
        int iA04 = c10044u.A04(16);
        int iA05 = c10044u.A04(16);
        int dataFieldLimit = c10044u.A02() + iA05;
        int dataFieldLength2 = iA05 * 8;
        int segmentType3 = c10044u.A01();
        if (dataFieldLength2 > segmentType3) {
            AbstractC09904g.A07(A09(31, 9, 48), A09(0, 31, 109));
            int segmentType4 = c10044u.A01();
            c10044u.A09(segmentType4);
            return;
        }
        switch (pageId) {
            case 16:
                int i10 = k10.A03;
                int dataFieldLength3 = A08[0].length();
                if (dataFieldLength3 == 24) {
                    String[] strArr = A08;
                    strArr[2] = "8IE5rQcmaz5UZt5DB4HgynTP0JDS9G2L";
                    strArr[6] = "0jBafq8KrrfMTCoyXHA3EFrvXh6eCdvZ";
                    if (iA04 == i10) {
                        c1376Jx = k10.A01;
                        c1376JxA07 = A07(c10044u, iA05);
                        segmentType = c1376JxA07.A00;
                        if (segmentType != 0) {
                            k10.A01 = c1376JxA07;
                            k10.A08.clear();
                            k10.A06.clear();
                            k10.A07.clear();
                        } else if (c1376Jx != null) {
                            dataFieldLength = c1376Jx.A02;
                            segmentType2 = c1376JxA07.A02;
                            if (dataFieldLength != segmentType2) {
                                k10.A01 = c1376JxA07;
                            }
                        }
                    }
                } else {
                    A08[0] = "Hq1l6D9egrnTUyhluyir9I8C";
                    if (iA04 == i10) {
                        c1376Jx = k10.A01;
                        c1376JxA07 = A07(c10044u, iA05);
                        segmentType = c1376JxA07.A00;
                        if (segmentType != 0) {
                            k10.A01 = c1376JxA07;
                            k10.A08.clear();
                            k10.A06.clear();
                            k10.A07.clear();
                        } else if (c1376Jx != null) {
                            dataFieldLength = c1376Jx.A02;
                            segmentType2 = c1376JxA07.A02;
                            if (dataFieldLength != segmentType2) {
                                k10.A01 = c1376JxA07;
                            }
                        }
                    }
                }
                break;
            case 17:
                C1376Jx c1376Jx2 = k10.A01;
                int segmentType5 = k10.A03;
                if (iA04 == segmentType5 && c1376Jx2 != null) {
                    C1378Jz c1378JzA08 = A08(c10044u, iA05);
                    int i11 = c1376Jx2.A00;
                    int dataFieldLength4 = A08[4].charAt(14);
                    if (dataFieldLength4 != 57) {
                        String[] strArr2 = A08;
                        strArr2[2] = "Zbq5EbbYoVc51AepmzNMcu8RWeX9tFKS";
                        strArr2[6] = "SzpXTRUgh7e1fMrIr1mTDXGfSUuiig9T";
                        if (i11 == 0) {
                            SparseArray<C1378Jz> sparseArray = k10.A08;
                            int segmentType6 = c1378JzA08.A03;
                            c1378Jz = sparseArray.get(segmentType6);
                            if (c1378Jz != null) {
                                c1378JzA08.A00(c1378Jz);
                            }
                        }
                    } else {
                        A08[0] = "ijH7h91dhg9QFNoxZPsrwXGu";
                        if (i11 == 0) {
                            SparseArray<C1378Jz> sparseArray2 = k10.A08;
                            int segmentType7 = c1378JzA08.A03;
                            c1378Jz = sparseArray2.get(segmentType7);
                            if (c1378Jz != null) {
                                c1378JzA08.A00(c1378Jz);
                            }
                        }
                    }
                    SparseArray<C1378Jz> sparseArray3 = k10.A08;
                    int segmentType8 = c1378JzA08.A03;
                    sparseArray3.put(segmentType8, c1378JzA08);
                }
                break;
            case 18:
                int segmentType9 = k10.A03;
                if (iA04 == segmentType9) {
                    C1373Ju c1373JuA04 = A04(c10044u, iA05);
                    SparseArray<C1373Ju> sparseArray4 = k10.A06;
                    int segmentType10 = c1373JuA04.A00;
                    sparseArray4.put(segmentType10, c1373JuA04);
                } else {
                    int segmentType11 = k10.A02;
                    if (iA04 == segmentType11) {
                        C1373Ju c1373JuA05 = A04(c10044u, iA05);
                        SparseArray<C1373Ju> sparseArray5 = k10.A04;
                        int segmentType12 = c1373JuA05.A00;
                        sparseArray5.put(segmentType12, c1373JuA05);
                    }
                }
                break;
            case 19:
                int segmentType13 = k10.A03;
                if (iA04 == segmentType13) {
                    C1375Jw c1375JwA06 = A06(c10044u);
                    SparseArray<C1375Jw> sparseArray6 = k10.A07;
                    int segmentType14 = c1375JwA06.A00;
                    sparseArray6.put(segmentType14, c1375JwA06);
                } else {
                    int segmentType15 = k10.A02;
                    if (iA04 == segmentType15) {
                        C1375Jw c1375JwA07 = A06(c10044u);
                        SparseArray<C1375Jw> sparseArray7 = k10.A05;
                        int i12 = c1375JwA07.A00;
                        int dataFieldLength5 = A08[0].length();
                        if (dataFieldLength5 != 24) {
                            throw new RuntimeException();
                        }
                        A08[3] = "cNAVN6CCWtYeoU1m0uPi3L7jVIjjgAwx";
                        sparseArray7.put(i12, c1375JwA07);
                    }
                }
                break;
            case 20:
                int segmentType16 = k10.A03;
                if (iA04 == segmentType16) {
                    k10.A00 = A05(c10044u);
                }
                break;
        }
        int segmentType17 = c10044u.A02();
        c10044u.A0A(dataFieldLimit - segmentType17);
    }

    public static void A0C(C1375Jw c1375Jw, C1373Ju c1373Ju, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = c1373Ju.A03;
        } else if (i10 == 2) {
            iArr = c1373Ju.A02;
        } else {
            iArr = c1373Ju.A01;
        }
        A0D(c1375Jw.A03, iArr, i10, i11, i12, paint, canvas);
        A0D(c1375Jw.A02, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    public static void A0D(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i13 = i12;
        C10044u c10044u = new C10044u(bArr);
        byte[] clutMapTable2To8 = null;
        byte[] clutMapTable2To4 = null;
        byte[] bArrA0E = null;
        int line = i11;
        while (c10044u.A01() != 0) {
            switch (c10044u.A04(8)) {
                case 16:
                    if (i10 == 3) {
                        bArr2 = clutMapTable2To4 == null ? A0A : clutMapTable2To4;
                    } else if (i10 == 2) {
                        bArr2 = clutMapTable2To8 == null ? A09 : clutMapTable2To8;
                    } else {
                        bArr2 = null;
                    }
                    line = A01(c10044u, iArr, bArr2, line, i13, paint, canvas);
                    c10044u.A06();
                    break;
                case 17:
                    if (i10 == 3) {
                        bArr3 = bArrA0E == null ? A0B : bArrA0E;
                    } else {
                        bArr3 = null;
                    }
                    line = A02(c10044u, iArr, bArr3, line, i13, paint, canvas);
                    c10044u.A06();
                    break;
                case 18:
                    line = A03(c10044u, iArr, null, line, i13, paint, canvas);
                    break;
                case 32:
                    clutMapTable2To8 = A0E(4, 4, c10044u);
                    break;
                case 33:
                    clutMapTable2To4 = A0E(4, 8, c10044u);
                    break;
                case 34:
                    bArrA0E = A0E(16, 8, c10044u);
                    break;
                case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                    i13 += 2;
                    line = i11;
                    break;
            }
        }
    }

    public static byte[] A0E(int i10, int i11, C10044u c10044u) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) c10044u.A04(i11);
        }
        return bArr;
    }

    public static int[] A0F() {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = -1;
        iArr[2] = -16777216;
        String[] strArr = A08;
        if (strArr[2].charAt(19) == strArr[6].charAt(19)) {
            throw new RuntimeException();
        }
        A08[1] = "Jw8cEdbjQQjFC79Gk6sPH9AUdvvWBQg4";
        iArr[3] = -8421505;
        return iArr;
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < iArr.length; i10++) {
            if (i10 < 8) {
                int i11 = (i10 & 1) != 0 ? 255 : 0;
                iArr[i10] = A00(255, i11, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                int i12 = i10 & 1;
                int i13 = Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                int i14 = i12 != 0 ? Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE : 0;
                int i15 = (i10 & 2) != 0 ? Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE : 0;
                int i16 = i10 & 4;
                if (A08[4].charAt(14) != '9') {
                    throw new RuntimeException();
                }
                A08[3] = "UrHD9QQTZDyJKzMppguU3aPtXoZ0irSR";
                if (i16 == 0) {
                    i13 = 0;
                }
                iArr[i10] = A00(255, i14, i15, i13);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    public static int[] A0H() {
        int i10;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (i11 < 8) {
                int i12 = (i11 & 1) != 0 ? 255 : 0;
                iArr[i11] = A00(63, i12, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) == 0 ? 0 : 255);
            } else {
                switch (i11 & Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE) {
                    case 0:
                        int i13 = (i11 & 1) != 0 ? 85 : 0;
                        iArr[i11] = A00(255, i13 + ((i11 & 16) != 0 ? 170 : 0), ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0), ((i11 & 4) == 0 ? 0 : 85) + ((i11 & 64) == 0 ? 0 : 170));
                        break;
                    case 8:
                        int i14 = ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0);
                        int i15 = i11 & 2;
                        if (A08[4].charAt(14) == '9') {
                            A08[0] = "s2RCWxPvpwpJ3GpvuxZigl51";
                            if (i15 != 0) {
                                i10 = 85;
                            } else {
                                i10 = 0;
                            }
                        } else if (i15 != 0) {
                            i10 = 85;
                        } else {
                            i10 = 0;
                        }
                        iArr[i11] = A00(Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, i14, i10 + ((i11 & 32) != 0 ? 170 : 0), ((i11 & 4) == 0 ? 0 : 85) + ((i11 & 64) == 0 ? 0 : 170));
                        break;
                    case 128:
                        int i16 = ((i11 & 1) != 0 ? 43 : 0) + Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i11 & 16) != 0 ? 85 : 0);
                        int i17 = ((i11 & 2) != 0 ? 43 : 0) + Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i11 & 32) != 0 ? 85 : 0);
                        int i18 = ((i11 & 4) == 0 ? 0 : 43) + Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                        int i19 = i11 & 64;
                        if (A08[7].charAt(9) != 'e') {
                            A08[3] = "e63e4cS46GPtzp0vrxC333RpnvVdNaZZ";
                            iArr[i11] = A00(255, i16, i17, i18 + (i19 == 0 ? 0 : 85));
                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case PRIVACY_URL_ERROR_VALUE:
                        int i20 = (i11 & 1) != 0 ? 43 : 0;
                        iArr[i11] = A00(255, i20 + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + ((i11 & 64) == 0 ? 0 : 85));
                        break;
                }
            }
        }
        return iArr;
    }

    public final void A0J() {
        this.A06.A00();
    }
}
