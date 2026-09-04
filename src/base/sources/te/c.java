package te;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f53319a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int[] a(ue.a aVar, int i10, int i11) {
        int[] iArr = new int[i11];
        int i12 = aVar.i() / i10;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                i14 |= aVar.g((i13 * i10) + i15) ? 1 << ((i10 - i15) - 1) : 0;
            }
            iArr[i13] = i14;
        }
        return iArr;
    }

    private static void b(ue.b bVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    bVar.j(i14, i13);
                    bVar.j(i14, i15);
                    bVar.j(i13, i14);
                    bVar.j(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        bVar.j(i16, i16);
        int i17 = i16 + 1;
        bVar.j(i17, i16);
        bVar.j(i16, i17);
        int i18 = i10 + i11;
        bVar.j(i18, i16);
        bVar.j(i18, i17);
        bVar.j(i18, i18 - 1);
    }

    private static void c(ue.b bVar, boolean z10, int i10, ue.a aVar) {
        int i11 = i10 / 2;
        int i12 = 0;
        if (z10) {
            while (i12 < 7) {
                int i13 = (i11 - 3) + i12;
                if (aVar.g(i12)) {
                    bVar.j(i13, i11 - 5);
                }
                if (aVar.g(i12 + 7)) {
                    bVar.j(i11 + 5, i13);
                }
                if (aVar.g(20 - i12)) {
                    bVar.j(i13, i11 + 5);
                }
                if (aVar.g(27 - i12)) {
                    bVar.j(i11 - 5, i13);
                }
                i12++;
            }
            return;
        }
        while (i12 < 10) {
            int i14 = (i11 - 5) + i12 + (i12 / 5);
            if (aVar.g(i12)) {
                bVar.j(i14, i11 - 7);
            }
            if (aVar.g(i12 + 10)) {
                bVar.j(i11 + 7, i14);
            }
            if (aVar.g(29 - i12)) {
                bVar.j(i14, i11 + 7);
            }
            if (aVar.g(39 - i12)) {
                bVar.j(i11 - 7, i14);
            }
            i12++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a d(byte[] bArr, int i10, int i11) {
        ue.a aVarH;
        int i12;
        boolean z10;
        int iAbs;
        int i13;
        int i14;
        ue.a aVarA = new d(bArr).a();
        int i15 = ((aVarA.i() * i10) / 100) + 11;
        int i16 = aVarA.i() + i15;
        int i17 = 1;
        if (i11 != 0) {
            boolean z11 = i11 < 0;
            iAbs = Math.abs(i11);
            if (iAbs > (z11 ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i11)));
            }
            i13 = i(iAbs, z11);
            i12 = f53319a[iAbs];
            int i18 = i13 - (i13 % i12);
            aVarH = h(aVarA, i12);
            if (aVarH.i() + i15 > i18) {
                z10 = z11;
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z11) {
                z10 = z11;
                if (aVarH.i() > (i12 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            }
        } else {
            ue.a aVarH2 = null;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (i19 > 32) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                boolean z12 = i19 <= 3 ? i17 : 0;
                int i21 = z12 != 0 ? i19 + 1 : i19;
                int i22 = i(i21, z12);
                if (i16 <= i22) {
                    if (aVarH2 == null || i20 != f53319a[i21]) {
                        int i23 = f53319a[i21];
                        i20 = i23;
                        aVarH2 = h(aVarA, i23);
                    }
                    int i24 = i22 - (i22 % i20);
                    if ((z12 == 0 || aVarH2.i() <= (i20 << 6)) && aVarH2.i() + i15 <= i24) {
                        aVarH = aVarH2;
                        i12 = i20;
                        z10 = z12;
                        iAbs = i21;
                        i13 = i22;
                        break;
                    }
                }
                i19++;
                i17 = i17;
            }
        }
        ue.a aVarE = e(aVarH, i13, i12);
        int i25 = aVarH.i() / i12;
        ue.a aVarF = f(z10, iAbs, i25);
        int i26 = (z10 ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i26];
        int i27 = 2;
        if (z10) {
            for (int i28 = 0; i28 < i26; i28++) {
                iArr[i28] = i28;
            }
            i14 = i26;
        } else {
            int i29 = i26 / 2;
            i14 = i26 + 1 + (((i29 - 1) / 15) * 2);
            int i30 = i14 / 2;
            for (int i31 = 0; i31 < i29; i31++) {
                int i32 = (i31 / 15) + i31;
                iArr[(i29 - i31) - i17] = (i30 - i32) - 1;
                iArr[i29 + i31] = i32 + i30 + i17;
            }
        }
        ue.b bVar = new ue.b(i14);
        int i33 = 0;
        for (int i34 = 0; i34 < iAbs; i34++) {
            int i35 = ((iAbs - i34) << i27) + (z10 ? 9 : 12);
            for (int i36 = 0; i36 < i35; i36++) {
                int i37 = i36 << 1;
                int i38 = 0;
                while (i38 < i27) {
                    int i39 = i17;
                    if (aVarE.g(i33 + i37 + i38)) {
                        int i40 = i34 << 1;
                        bVar.j(iArr[i40 + i38], iArr[i40 + i36]);
                    }
                    if (aVarE.g((i35 << 1) + i33 + i37 + i38)) {
                        int i41 = i34 << 1;
                        bVar.j(iArr[i41 + i36], iArr[((i26 - 1) - i41) - i38]);
                    }
                    if (aVarE.g((i35 << 2) + i33 + i37 + i38)) {
                        int i42 = (i26 - 1) - (i34 << 1);
                        bVar.j(iArr[i42 - i38], iArr[i42 - i36]);
                    }
                    if (aVarE.g((i35 * 6) + i33 + i37 + i38)) {
                        int i43 = i34 << 1;
                        bVar.j(iArr[((i26 - 1) - i43) - i36], iArr[i43 + i38]);
                    }
                    i38++;
                    i17 = i39;
                    i27 = i27;
                }
            }
            i33 += i35 << 3;
        }
        c(bVar, z10, i14, aVarF);
        if (z10) {
            b(bVar, i14 / 2, 5);
        } else {
            int i44 = i14 / 2;
            b(bVar, i44, 7);
            int i45 = 0;
            int i46 = 0;
            while (i46 < (i26 / 2) - 1) {
                for (int i47 = i44 & 1; i47 < i14; i47 += 2) {
                    int i48 = i44 - i45;
                    bVar.j(i48, i47);
                    int i49 = i44 + i45;
                    bVar.j(i49, i47);
                    bVar.j(i47, i48);
                    bVar.j(i47, i49);
                }
                i46 += 15;
                i45 += 16;
            }
        }
        a aVar = new a();
        aVar.c(z10);
        aVar.f(i14);
        aVar.d(iAbs);
        aVar.b(i25);
        aVar.e(bVar);
        return aVar;
    }

    private static ue.a e(ue.a aVar, int i10, int i11) {
        int i12 = aVar.i() / i11;
        ve.c cVar = new ve.c(g(i11));
        int i13 = i10 / i11;
        int[] iArrA = a(aVar, i11, i13);
        cVar.b(iArrA, i13 - i12);
        ue.a aVar2 = new ue.a();
        aVar2.d(0, i10 % i11);
        for (int i14 : iArrA) {
            aVar2.d(i14, i11);
        }
        return aVar2;
    }

    static ue.a f(boolean z10, int i10, int i11) {
        ue.a aVar = new ue.a();
        if (z10) {
            aVar.d(i10 - 1, 2);
            aVar.d(i11 - 1, 6);
            return e(aVar, 28, 4);
        }
        aVar.d(i10 - 1, 5);
        aVar.d(i11 - 1, 11);
        return e(aVar, 40, 4);
    }

    private static ve.a g(int i10) {
        if (i10 == 4) {
            return ve.a.f55404k;
        }
        if (i10 == 6) {
            return ve.a.f55403j;
        }
        if (i10 == 8) {
            return ve.a.f55407n;
        }
        if (i10 == 10) {
            return ve.a.f55402i;
        }
        if (i10 == 12) {
            return ve.a.f55401h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i10)));
    }

    static ue.a h(ue.a aVar, int i10) {
        ue.a aVar2 = new ue.a();
        int i11 = aVar.i();
        int i12 = (1 << i10) - 2;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                int i16 = i13 + i15;
                if (i16 >= i11 || aVar.g(i16)) {
                    i14 |= 1 << ((i10 - 1) - i15);
                }
            }
            int i17 = i14 & i12;
            if (i17 == i12) {
                aVar2.d(i17, i10);
            } else {
                if (i17 == 0) {
                    aVar2.d(i14 | 1, i10);
                } else {
                    aVar2.d(i14, i10);
                }
                i13 += i10;
            }
            i13--;
            i13 += i10;
        }
        return aVar2;
    }

    private static int i(int i10, boolean z10) {
        return ((z10 ? 88 : Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE) + (i10 << 4)) * i10;
    }
}
