package x;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Code duplicated, block: B:100:0x016d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0173  */
    /* JADX WARN: Code duplicated, block: B:104:0x0194  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[PHI: r15 r16
      0x0033: PHI (r15v26 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[PHI: r15 r16
      0x0035: PHI (r15v3 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:218:0x038a  */
    /* JADX WARN: Code duplicated, block: B:289:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:293:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:296:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:297:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:301:0x04da  */
    /* JADX WARN: Code duplicated, block: B:304:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:317:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [u.d] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [u.d] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [x.e] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [u.i] */
    static void a(f fVar, u.d dVar, int i10, int i11, c cVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        ?? r10;
        u.d dVar2;
        d dVar3;
        u.i iVar;
        u.i iVar2;
        int i12;
        d dVar4;
        u.i iVar3;
        int i13;
        d[] dVarArr;
        int i14;
        d dVar5;
        d dVar6;
        u.i iVar4;
        d dVar7;
        Object obj;
        int size;
        d dVar8;
        int i15;
        int i16 = i10;
        e eVar = cVar.f56390a;
        e eVar2 = cVar.f56392c;
        e eVar3 = cVar.f56391b;
        e eVar4 = cVar.f56393d;
        e eVar5 = cVar.f56394e;
        float f11 = cVar.f56400k;
        boolean z13 = fVar.f56434b0[i16] == e.b.WRAP_CONTENT;
        if (i16 == 0) {
            int i17 = eVar5.J0;
            z10 = i17 == 0;
            z11 = i17 == 1;
            if (i17 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            int i18 = eVar5.K0;
            z10 = i18 == 0;
            z11 = i18 == 1;
            if (i18 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        ?? r14 = eVar;
        boolean z14 = false;
        while (true) {
            f10 = f11;
            Object obj2 = null;
            if (z14) {
                break;
            }
            d dVar9 = r14.Y[i11];
            int i19 = z12 ? 1 : 4;
            int iF = dVar9.f();
            e.b bVar = r14.f56434b0[i16];
            boolean z15 = z13;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            boolean z16 = bVar == bVar2 && r14.f56479y[i16] == 0;
            boolean z17 = z12;
            d dVar10 = dVar9.f56417f;
            if (dVar10 != null && r14 != eVar) {
                iF += dVar10.f();
            }
            int i20 = iF;
            if (z17 && r14 != eVar && r14 != eVar3) {
                i19 = 8;
            }
            boolean z18 = z16;
            d dVar11 = dVar9.f56417f;
            if (dVar11 != null) {
                if (r14 == eVar3) {
                    dVar.h(dVar9.f56420i, dVar11.f56420i, i20, 6);
                } else {
                    dVar.h(dVar9.f56420i, dVar11.f56420i, i20, 8);
                }
                if (z18 && !z17) {
                    i19 = 5;
                }
                dVar.e(dVar9.f56420i, dVar9.f56417f.f56420i, i20, (r14 == eVar3 && z17 && r14.j0(i16)) ? 5 : i19);
            } else {
                z14 = z14;
                z10 = z10;
            }
            if (z15) {
                if (r14.X() == 8 || r14.f56434b0[i16] != bVar2) {
                    i15 = 0;
                } else {
                    d[] dVarArr2 = r14.Y;
                    i15 = 0;
                    dVar.h(dVarArr2[i11 + 1].f56420i, dVarArr2[i11].f56420i, 0, 5);
                }
                dVar.h(r14.Y[i11].f56420i, fVar.Y[i11].f56420i, i15, 8);
            }
            d dVar12 = r14.Y[i11 + 1].f56417f;
            if (dVar12 != null) {
                e eVar6 = dVar12.f56415d;
                d dVar13 = eVar6.Y[i11].f56417f;
                if (dVar13 != null && dVar13.f56415d == r14) {
                    obj2 = eVar6;
                }
            }
            if (obj2 != null) {
                r14 = obj2;
                z14 = z14;
            } else {
                z14 = true;
            }
            f11 = f10;
            z13 = z15;
            z12 = z17;
            z10 = z10;
            r14 = r14;
        }
        boolean z19 = z13;
        boolean z20 = z12;
        boolean z21 = z10;
        if (eVar4 != null) {
            int i21 = i11 + 1;
            if (eVar2.Y[i21].f56417f != null) {
                d dVar14 = eVar4.Y[i21];
                if (eVar4.f56434b0[i16] == e.b.MATCH_CONSTRAINT && eVar4.f56479y[i16] == 0 && !z20) {
                    d dVar15 = dVar14.f56417f;
                    if (dVar15.f56415d == fVar) {
                        dVar.e(dVar14.f56420i, dVar15.f56420i, -dVar14.f(), 5);
                    } else if (z20) {
                        dVar8 = dVar14.f56417f;
                        if (dVar8.f56415d == fVar) {
                            dVar.e(dVar14.f56420i, dVar8.f56420i, -dVar14.f(), 4);
                        }
                    }
                } else if (z20) {
                    dVar8 = dVar14.f56417f;
                    if (dVar8.f56415d == fVar) {
                        dVar.e(dVar14.f56420i, dVar8.f56420i, -dVar14.f(), 4);
                    }
                }
                dVar.j(dVar14.f56420i, eVar2.Y[i21].f56417f.f56420i, -dVar14.f(), 6);
            }
        }
        if (z19) {
            int i22 = i11 + 1;
            u.i iVar5 = fVar.Y[i22].f56420i;
            d dVar16 = eVar2.Y[i22];
            dVar.h(iVar5, dVar16.f56420i, dVar16.f(), 8);
        }
        ArrayList arrayList = cVar.f56397h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f12 = (!cVar.f56407r || cVar.f56409t) ? f10 : cVar.f56399j;
            float f13 = 0.0f;
            float f14 = 0.0f;
            e eVar7 = null;
            int i23 = 0;
            while (i23 < size) {
                e eVar8 = (e) arrayList.get(i23);
                float f15 = eVar8.N0[i16];
                if (f15 < f13) {
                    if (cVar.f56409t) {
                        d[] dVarArr3 = eVar8.Y;
                        f13 = f13;
                        dVar.e(dVarArr3[i11 + 1].f56420i, dVarArr3[i11].f56420i, 0, 4);
                    } else {
                        f15 = 1.0f;
                    }
                    arrayList = arrayList;
                    i23++;
                    f13 = f13;
                    arrayList = arrayList;
                }
                float f16 = f15;
                if (f16 == f13) {
                    d[] dVarArr4 = eVar8.Y;
                    dVar.e(dVarArr4[i11 + 1].f56420i, dVarArr4[i11].f56420i, 0, 8);
                    arrayList = arrayList;
                } else {
                    if (eVar7 != null) {
                        d[] dVarArr5 = eVar7.Y;
                        u.i iVar6 = dVarArr5[i11].f56420i;
                        int i24 = i11 + 1;
                        u.i iVar7 = dVarArr5[i24].f56420i;
                        d[] dVarArr6 = eVar8.Y;
                        u.i iVar8 = dVarArr6[i11].f56420i;
                        u.i iVar9 = dVarArr6[i24].f56420i;
                        u.b bVarR = dVar.r();
                        bVarR.l(f14, f12, f16, iVar6, iVar7, iVar8, iVar9);
                        dVar.d(bVarR);
                    }
                    eVar7 = eVar8;
                    f14 = f16;
                }
                i23++;
                f13 = f13;
                arrayList = arrayList;
            }
        }
        if (eVar3 != null && (eVar3 == eVar4 || z20)) {
            d dVar17 = eVar.Y[i11];
            int i25 = i11 + 1;
            d dVar18 = eVar2.Y[i25];
            d dVar19 = dVar17.f56417f;
            u.i iVar10 = dVar19 != null ? dVar19.f56420i : null;
            d dVar20 = dVar18.f56417f;
            u.i iVar11 = dVar20 != null ? dVar20.f56420i : null;
            d dVar21 = eVar3.Y[i11];
            if (eVar4 != null) {
                dVar18 = eVar4.Y[i25];
            }
            if (iVar10 != null && iVar11 != null) {
                dVar.c(dVar21.f56420i, iVar10, dVar21.f(), i16 == 0 ? eVar5.f56464q0 : eVar5.f56466r0, iVar11, dVar18.f56420i, dVar18.f(), 7);
            }
        } else {
            if (!z21 || eVar3 == null) {
                if (z11 && eVar3 != null) {
                    int i26 = cVar.f56399j;
                    boolean z22 = i26 > 0 && cVar.f56398i == i26;
                    e eVar9 = eVar3;
                    e eVar10 = eVar9;
                    while (eVar9 != null) {
                        e eVar11 = eVar9.P0[i10];
                        while (eVar11 != null && eVar11.X() == 8) {
                            eVar11 = eVar11.P0[i10];
                        }
                        if (eVar9 != eVar3 && eVar9 != eVar4 && eVar11 != null) {
                            if (eVar11 == eVar4) {
                                eVar11 = null;
                            }
                            d dVar22 = eVar9.Y[i11];
                            u.i iVar12 = dVar22.f56420i;
                            d dVar23 = dVar22.f56417f;
                            if (dVar23 != null) {
                                u.i iVar13 = dVar23.f56420i;
                            }
                            int i27 = i11 + 1;
                            u.i iVar14 = eVar10.Y[i27].f56420i;
                            int iF2 = dVar22.f();
                            int iF3 = eVar9.Y[i27].f();
                            if (eVar11 != null) {
                                dVar3 = eVar11.Y[i11];
                                iVar = dVar3.f56420i;
                                d dVar24 = dVar3.f56417f;
                                iVar2 = dVar24 != null ? dVar24.f56420i : null;
                            } else {
                                dVar3 = eVar4.Y[i11];
                                iVar = dVar3 != null ? dVar3.f56420i : null;
                                iVar2 = eVar9.Y[i27].f56420i;
                            }
                            if (dVar3 != null) {
                                iF3 += dVar3.f();
                            }
                            int iF4 = iF2 + eVar10.Y[i27].f();
                            int i28 = z22 ? 8 : 4;
                            if (iVar12 != null && iVar14 != null && iVar != null && iVar2 != null) {
                                dVar.c(iVar12, iVar14, iF4, 0.5f, iVar, iVar2, iF3, i28);
                            }
                            eVar11 = eVar11;
                        }
                        if (eVar9.X() != 8) {
                            eVar10 = eVar9;
                        }
                        eVar9 = eVar11;
                    }
                    d dVar25 = eVar3.Y[i11];
                    d dVar26 = eVar.Y[i11].f56417f;
                    int i29 = i11 + 1;
                    d dVar27 = eVar4.Y[i29];
                    d dVar28 = eVar2.Y[i29].f56417f;
                    if (dVar26 == null) {
                        r10 = dVar;
                    } else {
                        if (eVar3 != eVar4) {
                            dVar.e(dVar25.f56420i, dVar26.f56420i, dVar25.f(), 5);
                        } else if (dVar28 != null) {
                            dVar2 = dVar;
                            dVar2.c(dVar25.f56420i, dVar26.f56420i, dVar25.f(), 0.5f, dVar27.f56420i, dVar28.f56420i, dVar27.f(), 5);
                        }
                        r10 = dVar;
                    }
                    if (dVar28 != null && eVar3 != eVar4) {
                        r10.e(dVar27.f56420i, dVar28.f56420i, -dVar27.f(), 5);
                    }
                }
                if ((z21 && !z11) || eVar3 == null || eVar3 == eVar4) {
                    return;
                }
                dVarArr = eVar3.Y;
                d dVar29 = dVarArr[i11];
                if (eVar4 == null) {
                    eVar4 = eVar3;
                }
                i14 = i11 + 1;
                dVar5 = eVar4.Y[i14];
                dVar6 = dVar29.f56417f;
                if (dVar6 != null) {
                    iVar4 = dVar6.f56420i;
                } else {
                    iVar4 = null;
                }
                dVar7 = dVar5.f56417f;
                if (dVar7 != null) {
                    obj = dVar7.f56420i;
                } else {
                    obj = null;
                }
                if (eVar2 != eVar4) {
                    d dVar30 = eVar2.Y[i14].f56417f;
                    obj = dVar30 != null ? dVar30.f56420i : null;
                }
                if (eVar3 == eVar4) {
                    dVar5 = dVarArr[i14];
                }
                if (iVar4 != null || obj == null) {
                }
                r10.c(dVar29.f56420i, iVar4, dVar29.f(), 0.5f, obj, dVar5.f56420i, eVar4.Y[i14].f(), 5);
                return;
            }
            int i30 = cVar.f56399j;
            boolean z23 = i30 > 0 && cVar.f56398i == i30;
            e eVar12 = eVar3;
            e eVar13 = eVar12;
            while (eVar12 != null) {
                e eVar14 = eVar12.P0[i16];
                while (true) {
                    if (eVar14 == null) {
                        i12 = 8;
                        break;
                    }
                    i12 = 8;
                    if (eVar14.X() != 8) {
                        break;
                    } else {
                        eVar14 = eVar14.P0[i16];
                    }
                }
                if (eVar14 != null || eVar12 == eVar4) {
                    d dVar31 = eVar12.Y[i11];
                    u.i iVar15 = dVar31.f56420i;
                    d dVar32 = dVar31.f56417f;
                    u.i iVar16 = dVar32 != null ? dVar32.f56420i : null;
                    if (eVar13 != eVar12) {
                        iVar16 = eVar13.Y[i11 + 1].f56420i;
                    } else if (eVar12 == eVar3) {
                        d dVar33 = eVar.Y[i11].f56417f;
                        iVar16 = dVar33 != null ? dVar33.f56420i : null;
                    }
                    int iF5 = dVar31.f();
                    int i31 = i11 + 1;
                    int iF6 = eVar12.Y[i31].f();
                    if (eVar14 != null) {
                        dVar4 = eVar14.Y[i11];
                        iVar3 = dVar4.f56420i;
                    } else {
                        dVar4 = eVar2.Y[i31].f56417f;
                        iVar3 = dVar4 != null ? dVar4.f56420i : null;
                    }
                    u.i iVar17 = eVar12.Y[i31].f56420i;
                    if (dVar4 != null) {
                        iF6 += dVar4.f();
                    }
                    int iF7 = iF5 + eVar13.Y[i31].f();
                    if (iVar15 == null || iVar16 == null || iVar3 == null || iVar17 == null) {
                        i13 = 8;
                    } else {
                        if (eVar12 == eVar3) {
                            iF7 = eVar3.Y[i11].f();
                        }
                        if (eVar12 == eVar4) {
                            iF6 = eVar4.Y[i31].f();
                        }
                        eVar14 = eVar14;
                        i13 = 8;
                        dVar.c(iVar15, iVar16, iF7, 0.5f, iVar3, iVar17, iF6, z23 ? 8 : 5);
                    }
                    if (eVar12.X() != i13) {
                        eVar13 = eVar12;
                    }
                    i16 = i10;
                    eVar12 = eVar14;
                } else {
                    i13 = i12;
                }
                if (eVar12.X() != i13) {
                    eVar13 = eVar12;
                }
                i16 = i10;
                eVar12 = eVar14;
            }
        }
        r10 = dVar;
        if (z21) {
        }
        dVarArr = eVar3.Y;
        d dVar210 = dVarArr[i11];
        if (eVar4 == null) {
            eVar4 = eVar3;
        }
        i14 = i11 + 1;
        dVar5 = eVar4.Y[i14];
        dVar6 = dVar210.f56417f;
        if (dVar6 != null) {
            iVar4 = dVar6.f56420i;
        } else {
            iVar4 = null;
        }
        dVar7 = dVar5.f56417f;
        if (dVar7 != null) {
            obj = dVar7.f56420i;
        } else {
            obj = null;
        }
        if (eVar2 != eVar4) {
            d dVar34 = eVar2.Y[i14].f56417f;
            obj = dVar34 != null ? dVar34.f56420i : null;
        }
        if (eVar3 == eVar4) {
            dVar5 = dVarArr[i14];
        }
        if (iVar4 != null) {
        }
    }

    public static void b(f fVar, u.d dVar, ArrayList arrayList, int i10) {
        int i11;
        c[] cVarArr;
        int i12;
        if (i10 == 0) {
            i11 = fVar.f56495g1;
            cVarArr = fVar.f56498j1;
            i12 = 0;
        } else {
            i11 = fVar.f56496h1;
            cVarArr = fVar.f56497i1;
            i12 = 2;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            c cVar = cVarArr[i13];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f56390a)) {
                a(fVar, dVar, i10, i12, cVar);
            }
        }
    }
}
