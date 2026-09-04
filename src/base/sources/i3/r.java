package i3;

import o2.n0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f40957a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f40957a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static n0 b(o2.q qVar) {
        return c(qVar, true, false);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:78:0x012f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0132  */
    /* JADX WARN: Code duplicated, block: B:82:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0138  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x013e A[RETURN] */
    private static n0 c(o2.q qVar, boolean z10, boolean z11) {
        n0 n0Var;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        long length = qVar.getLength();
        long j10 = -1;
        long j11 = 4096;
        if (length != -1 && length <= 4096) {
            j11 = length;
        }
        int i13 = (int) j11;
        w1.u uVar = new w1.u(64);
        int i14 = 0;
        int i15 = 0;
        boolean z12 = false;
        while (true) {
            if (i15 < i13) {
                uVar.P(8);
                boolean z13 = true;
                if (qVar.peekFully(uVar.e(), i14, 8, true)) {
                    long jI = uVar.I();
                    int iP = uVar.p();
                    if (jI == 1) {
                        j10 = j10;
                        qVar.peekFully(uVar.e(), 8, 8);
                        i11 = 16;
                        uVar.S(16);
                        jI = uVar.z();
                        i15 = i15;
                    } else {
                        j10 = j10;
                        if (jI == 0) {
                            long length2 = qVar.getLength();
                            if (length2 != j10) {
                                jI = (length2 - qVar.getPeekPosition()) + ((long) 8);
                            }
                        }
                        i11 = 8;
                    }
                    long j12 = jI;
                    long j13 = i11;
                    if (j12 < j13) {
                        return new c(iP, j12, i11);
                    }
                    int i16 = i15 + i11;
                    n0Var = null;
                    if (iP == 1836019574) {
                        i13 += (int) j12;
                        if (length != -1 && i13 > length) {
                            i13 = (int) length;
                        }
                        i15 = i16;
                        i14 = 0;
                    } else if (iP == 1836019558 || iP == 1836475768) {
                        i10 = 1;
                    } else {
                        if (iP == 1835295092) {
                            z12 = true;
                        }
                        long j14 = length;
                        if ((((long) i16) + j12) - j13 >= i13) {
                            i10 = 0;
                        } else {
                            int i17 = (int) (j12 - j13);
                            i15 = i16 + i17;
                            if (iP != 1718909296) {
                                i12 = 0;
                                if (i17 != 0) {
                                    qVar.advancePeekPosition(i17);
                                }
                            } else {
                                if (i17 < 8) {
                                    return new c(iP, i17, 8);
                                }
                                uVar.P(i17);
                                i12 = 0;
                                qVar.peekFully(uVar.e(), 0, i17);
                                int iP2 = uVar.p();
                                if (a(iP2, z11)) {
                                    z12 = true;
                                }
                                uVar.U(4);
                                int iA = uVar.a() / 4;
                                if (!z12 && iA > 0) {
                                    iArr = new int[iA];
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= iA) {
                                            z13 = z12;
                                            break;
                                        }
                                        int iP3 = uVar.p();
                                        iArr[i18] = iP3;
                                        if (a(iP3, z11)) {
                                            break;
                                        }
                                        i18++;
                                    }
                                } else {
                                    z13 = z12;
                                    iArr = null;
                                }
                                if (!z13) {
                                    return new w(iP2, iArr);
                                }
                                z12 = z13;
                            }
                            i14 = i12;
                            length = j14;
                        }
                    }
                }
                if (!z12) {
                    return n.f40944a;
                }
                if (z10 != i10) {
                    return i10 != 0 ? i.f40910b : i.f40911c;
                }
                return n0Var;
            }
            n0Var = null;
            i10 = i14;
            if (!z12) {
                return n.f40944a;
            }
            if (z10 != i10) {
                if (i10 != 0) {
                }
            }
            return n0Var;
        }
    }

    public static n0 d(o2.q qVar, boolean z10) {
        return c(qVar, false, z10);
    }
}
