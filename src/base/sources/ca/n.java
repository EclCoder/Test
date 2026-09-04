package ca;

import ob.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f9822a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f9822a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(u9.l lVar) {
        return c(lVar, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean c(u9.l lVar, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        long length = lVar.getLength();
        long j10 = -1;
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j11 = 4096;
        if (i11 != 0 && length <= 4096) {
            j11 = length;
        }
        int i12 = (int) j11;
        d0 d0Var = new d0(64);
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        while (true) {
            if (i14 < i12) {
                d0Var.Q(8);
                if (lVar.peekFully(d0Var.e(), i13, 8, true)) {
                    long J = d0Var.J();
                    int iQ = d0Var.q();
                    if (J == 1) {
                        lVar.peekFully(d0Var.e(), 8, 8);
                        d0Var.T(16);
                        i10 = 16;
                        J = d0Var.A();
                    } else {
                        if (J == 0) {
                            long length2 = lVar.getLength();
                            if (length2 != j10) {
                                J = (length2 - lVar.getPeekPosition()) + ((long) 8);
                            }
                        }
                        i10 = 8;
                    }
                    long j12 = i10;
                    if (J < j12) {
                        return i13;
                    }
                    int i15 = i14 + i10;
                    boolean z14 = i13;
                    if (iQ == 1836019574) {
                        i12 += (int) J;
                        if (i11 != 0 && i12 > length) {
                            i12 = (int) length;
                        }
                        i14 = i15;
                        i13 = z14 ? 1 : 0;
                        j10 = -1;
                    } else {
                        if (iQ == 1836019558 || iQ == 1836475768) {
                            z12 = true;
                            return z13 && z10 == z12;
                        }
                        int i16 = i11;
                        if ((((long) i15) + J) - j12 < i12) {
                            int i17 = (int) (J - j12);
                            i14 = i15 + i17;
                            if (iQ == 1718909296) {
                                if (i17 < 8) {
                                    return z14;
                                }
                                d0Var.Q(i17);
                                lVar.peekFully(d0Var.e(), z14 ? 1 : 0, i17);
                                int i18 = i17 / 4;
                                for (int i19 = 0; i19 < i18; i19++) {
                                    if (i19 != 1) {
                                        if (a(d0Var.q(), z11)) {
                                            z13 = true;
                                            break;
                                        }
                                    } else {
                                        d0Var.V(4);
                                    }
                                }
                                if (!z13) {
                                    return false;
                                }
                            } else if (i17 != 0) {
                                lVar.advancePeekPosition(i17);
                            }
                            i11 = i16;
                            j10 = -1;
                            i13 = 0;
                        }
                    }
                }
            }
            z12 = false;
            if (z13) {
                return false;
            }
        }
    }

    public static boolean d(u9.l lVar, boolean z10) {
        return c(lVar, false, z10);
    }
}
