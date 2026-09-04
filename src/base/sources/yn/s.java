package yn;

import c1.pGX.geAgcEazw;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import fl.g0;
import fl.w;
import gl.l0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.k0;
import xn.c0;
import xn.h0;
import xn.t0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return jl.a.a(((o) obj).b(), ((o) obj2).b());
        }
    }

    private static final Map d(List list) {
        h0 h0VarE = h0.a.e(h0.f56917b, "/", false, 1, null);
        Map mapM = l0.m(w.a(h0VarE, new o(h0VarE, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (o oVar : gl.r.z0(list, new a())) {
            if (((o) mapM.put(oVar.b(), oVar)) == null) {
                while (true) {
                    h0 h0VarG = oVar.b().g();
                    if (h0VarG == null) {
                        break;
                    }
                    o oVar2 = (o) mapM.get(h0VarG);
                    if (oVar2 != null) {
                        oVar2.c().add(oVar.b());
                        break;
                    }
                    o oVar3 = new o(h0VarG, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                    mapM.put(h0VarG, oVar3);
                    oVar3.c().add(oVar.b());
                    oVar = oVar3;
                }
            }
        }
        return mapM;
    }

    public static final Long e(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        return Long.valueOf(v.a(((i10 >> 9) & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + 1980, (i10 >> 5) & 15, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1));
    }

    public static final long f(long j10) {
        return (j10 / ((long) 10000)) - 11644473600000L;
    }

    private static final String g(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String string = Integer.toString(i10, bm.a.a(16));
        kotlin.jvm.internal.s.g(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    public static final t0 h(h0 zipPath, xn.l fileSystem, Function1 predicate) {
        Throwable th2;
        Throwable th3;
        Throwable th4;
        kotlin.jvm.internal.s.h(zipPath, "zipPath");
        kotlin.jvm.internal.s.h(fileSystem, "fileSystem");
        kotlin.jvm.internal.s.h(predicate, "predicate");
        xn.j jVarC0 = fileSystem.c0(zipPath);
        try {
            long size = jVarC0.size() - ((long) 22);
            if (size < 0) {
                throw new IOException("not a zip: size=" + jVarC0.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            do {
                xn.g gVarC = c0.c(jVarC0.s(size));
                try {
                    if (gVarC.H0() == 101010256) {
                        i iVarL = l(gVarC);
                        String strE0 = gVarC.e0(iVarL.b());
                        gVarC.close();
                        long j10 = size - ((long) 20);
                        Throwable th5 = null;
                        if (j10 > 0) {
                            xn.g gVarC2 = c0.c(jVarC0.s(j10));
                            try {
                                if (gVarC2.H0() == 117853008) {
                                    int iH0 = gVarC2.H0();
                                    long jV = gVarC2.V();
                                    if (gVarC2.H0() != 1 || iH0 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    xn.g gVarC3 = c0.c(jVarC0.s(jV));
                                    try {
                                        int iH1 = gVarC3.H0();
                                        if (iH1 != 101075792) {
                                            throw new IOException("bad zip: expected " + g(101075792) + " but was " + g(iH1));
                                        }
                                        iVarL = q(gVarC3, iVarL);
                                        g0 g0Var = g0.f38750a;
                                        if (gVarC3 != null) {
                                            try {
                                                gVarC3.close();
                                            } catch (Throwable th6) {
                                                th4 = th6;
                                            }
                                        }
                                        th4 = null;
                                        if (th4 != null) {
                                            throw th4;
                                        }
                                    } catch (Throwable th7) {
                                        if (gVarC3 != null) {
                                            try {
                                                gVarC3.close();
                                                g0 g0Var2 = g0.f38750a;
                                            } catch (Throwable th8) {
                                                try {
                                                    fl.e.a(th7, th8);
                                                } catch (Throwable th9) {
                                                    th2 = th9;
                                                    iVarL = iVarL;
                                                    if (gVarC2 != null) {
                                                        try {
                                                            gVarC2.close();
                                                            g0 g0Var3 = g0.f38750a;
                                                        } catch (Throwable th10) {
                                                            fl.e.a(th2, th10);
                                                        }
                                                    }
                                                    th3 = th2;
                                                }
                                            }
                                        }
                                        th4 = th7;
                                        iVarL = iVarL;
                                    }
                                }
                                g0 g0Var4 = g0.f38750a;
                                if (gVarC2 != null) {
                                    try {
                                        gVarC2.close();
                                    } catch (Throwable th11) {
                                        th3 = th11;
                                    }
                                }
                                th3 = null;
                            } catch (Throwable th12) {
                                th2 = th12;
                            }
                            if (th3 != null) {
                                throw th3;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        xn.g gVarC4 = c0.c(jVarC0.s(iVarL.a()));
                        try {
                            long jC = iVarL.c();
                            for (long j11 = 0; j11 < jC; j11++) {
                                o oVarI = i(gVarC4);
                                if (oVarI.i() >= iVarL.a()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) predicate.invoke(oVarI)).booleanValue()) {
                                    arrayList.add(oVarI);
                                }
                            }
                            g0 g0Var5 = g0.f38750a;
                            if (gVarC4 != null) {
                                try {
                                    gVarC4.close();
                                } catch (Throwable th13) {
                                    th5 = th13;
                                }
                            }
                        } catch (Throwable th14) {
                            if (gVarC4 != null) {
                                try {
                                    gVarC4.close();
                                    g0 g0Var6 = g0.f38750a;
                                } catch (Throwable th15) {
                                    fl.e.a(th14, th15);
                                }
                            }
                            th5 = th14;
                        }
                        if (th5 != null) {
                            throw th5;
                        }
                        t0 t0Var = new t0(zipPath, fileSystem, d(arrayList), strE0);
                        if (jVarC0 != null) {
                            try {
                                jVarC0.close();
                                g0 g0Var7 = g0.f38750a;
                            } catch (Throwable unused) {
                            }
                        }
                        return t0Var;
                    }
                    gVarC.close();
                    size--;
                } catch (Throwable th16) {
                    gVarC.close();
                    throw th16;
                }
            } while (size >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th17) {
            if (jVarC0 == null) {
                throw th17;
            }
            try {
                jVarC0.close();
                g0 g0Var8 = g0.f38750a;
                throw th17;
            } catch (Throwable th18) {
                fl.e.a(th17, th18);
                throw th17;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 j(kotlin.jvm.internal.g0 g0Var, long j10, j0 j0Var, final xn.g gVar, j0 j0Var2, j0 j0Var3, final k0 k0Var, final k0 k0Var2, final k0 k0Var3, int i10, long j11) throws IOException {
        if (i10 != 1) {
            if (i10 == 10) {
                if (j11 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                gVar.skip(4L);
                m(gVar, (int) (j11 - 4), new tl.o() { // from class: yn.r
                    @Override // tl.o
                    public final Object invoke(Object obj, Object obj2) {
                        return s.k(k0Var, gVar, k0Var2, k0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                    }
                });
            }
        } else {
            if (g0Var.f43588a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            g0Var.f43588a = true;
            if (j11 < j10) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            long jV = j0Var.f43595a;
            if (jV == 4294967295L) {
                jV = gVar.V();
            }
            j0Var.f43595a = jV;
            j0Var2.f43595a = j0Var2.f43595a == 4294967295L ? gVar.V() : 0L;
            j0Var3.f43595a = j0Var3.f43595a == 4294967295L ? gVar.V() : 0L;
        }
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 k(k0 k0Var, xn.g gVar, k0 k0Var2, k0 k0Var3, int i10, long j10) throws IOException {
        if (i10 == 1) {
            if (k0Var.f43597a != null) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (j10 != 24) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            k0Var.f43597a = Long.valueOf(gVar.V());
            k0Var2.f43597a = Long.valueOf(gVar.V());
            k0Var3.f43597a = Long.valueOf(gVar.V());
        }
        return g0.f38750a;
    }

    private static final i l(xn.g gVar) throws IOException {
        int iS = gVar.S() & 65535;
        int iS2 = gVar.S() & 65535;
        long jS = gVar.S() & 65535;
        if (jS != (gVar.S() & 65535) || iS != 0 || iS2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        gVar.skip(4L);
        return new i(jS, 4294967295L & ((long) gVar.H0()), gVar.S() & 65535);
    }

    private static final void m(xn.g gVar, int i10, tl.o oVar) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iS = gVar.S() & 65535;
            long jS = ((long) gVar.S()) & 65535;
            long j11 = j10 - ((long) 4);
            if (j11 < jS) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            gVar.Z(jS);
            long size = gVar.u().size();
            oVar.invoke(Integer.valueOf(iS), Long.valueOf(jS));
            long size2 = (gVar.u().size() + jS) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iS);
            }
            if (size2 > 0) {
                gVar.u().skip(size2);
            }
            j10 = j11 - jS;
        }
    }

    public static final o n(xn.g gVar, o centralDirectoryZipEntry) throws IOException {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        kotlin.jvm.internal.s.h(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        o oVarO = o(gVar, centralDirectoryZipEntry);
        kotlin.jvm.internal.s.e(oVarO);
        return oVarO;
    }

    private static final o o(final xn.g gVar, o oVar) throws IOException {
        int iH0 = gVar.H0();
        if (iH0 != 67324752) {
            throw new IOException("bad zip: expected " + g(67324752) + " but was " + g(iH0));
        }
        gVar.skip(2L);
        short S = gVar.S();
        int i10 = S & 65535;
        if ((S & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + g(i10));
        }
        gVar.skip(18L);
        long jS = ((long) gVar.S()) & 65535;
        int iS = gVar.S() & 65535;
        gVar.skip(jS);
        if (oVar == null) {
            gVar.skip(iS);
            return null;
        }
        final k0 k0Var = new k0();
        final k0 k0Var2 = new k0();
        final k0 k0Var3 = new k0();
        m(gVar, iS, new tl.o() { // from class: yn.p
            @Override // tl.o
            public final Object invoke(Object obj, Object obj2) {
                return s.p(gVar, k0Var, k0Var2, k0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        return oVar.a((Integer) k0Var.f43597a, (Integer) k0Var2.f43597a, (Integer) k0Var3.f43597a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 p(xn.g gVar, k0 k0Var, k0 k0Var2, k0 k0Var3, int i10, long j10) throws IOException {
        if (i10 == 21589) {
            if (j10 < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte b10 = gVar.readByte();
            boolean z10 = (b10 & 1) == 1;
            boolean z11 = (b10 & 2) == 2;
            boolean z12 = (b10 & 4) == 4;
            long j11 = z10 ? 5L : 1L;
            if (z11) {
                j11 += 4;
            }
            if (z12) {
                j11 += 4;
            }
            if (j10 < j11) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z10) {
                k0Var.f43597a = Integer.valueOf(gVar.H0());
            }
            if (z11) {
                k0Var2.f43597a = Integer.valueOf(gVar.H0());
            }
            if (z12) {
                k0Var3.f43597a = Integer.valueOf(gVar.H0());
            }
        }
        return g0.f38750a;
    }

    private static final i q(xn.g gVar, i iVar) throws IOException {
        gVar.skip(12L);
        int iH0 = gVar.H0();
        int iH1 = gVar.H0();
        long jV = gVar.V();
        if (jV != gVar.V() || iH0 != 0 || iH1 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        gVar.skip(8L);
        return new i(jV, gVar.V(), iVar.b());
    }

    public static final void r(xn.g gVar) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        o(gVar, null);
    }

    public static final o i(final xn.g gVar) throws IOException {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        int iH0 = gVar.H0();
        if (iH0 != 33639248) {
            throw new IOException(geAgcEazw.fFeepwPR + g(33639248) + " but was " + g(iH0));
        }
        gVar.skip(4L);
        short S = gVar.S();
        int i10 = S & 65535;
        if ((S & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + g(i10));
        }
        int iS = gVar.S() & 65535;
        int iS2 = gVar.S() & 65535;
        int iS3 = gVar.S() & 65535;
        long jH0 = ((long) gVar.H0()) & 4294967295L;
        final j0 j0Var = new j0();
        j0Var.f43595a = ((long) gVar.H0()) & 4294967295L;
        final j0 j0Var2 = new j0();
        j0Var2.f43595a = ((long) gVar.H0()) & 4294967295L;
        int iS4 = gVar.S() & 65535;
        int iS5 = gVar.S() & 65535;
        int iS6 = gVar.S() & 65535;
        gVar.skip(8L);
        final j0 j0Var3 = new j0();
        j0Var3.f43595a = ((long) gVar.H0()) & 4294967295L;
        String strE0 = gVar.e0(iS4);
        if (bm.r.S(strE0, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = j0Var2.f43595a == 4294967295L ? 8 : 0L;
        if (j0Var.f43595a == 4294967295L) {
            j10 += (long) 8;
        }
        if (j0Var3.f43595a == 4294967295L) {
            j10 += (long) 8;
        }
        final long j11 = j10;
        final k0 k0Var = new k0();
        final k0 k0Var2 = new k0();
        final k0 k0Var3 = new k0();
        final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        m(gVar, iS5, new tl.o() { // from class: yn.q
            @Override // tl.o
            public final Object invoke(Object obj, Object obj2) {
                return s.j(g0Var, j11, j0Var2, gVar, j0Var, j0Var3, k0Var, k0Var2, k0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        if (j11 <= 0 || g0Var.f43588a) {
            return new o(h0.a.e(h0.f56917b, "/", false, 1, null).i(strE0), bm.r.z(strE0, "/", false, 2, null), gVar.e0(iS6), jH0, j0Var.f43595a, j0Var2.f43595a, iS, j0Var3.f43595a, iS3, iS2, (Long) k0Var.f43597a, (Long) k0Var2.f43597a, (Long) k0Var3.f43597a, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }
}
