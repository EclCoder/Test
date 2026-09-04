package mn;

import bm.r;
import com.google.api.client.http.HttpMethods;
import gl.l0;
import gn.f0;
import gn.n;
import gn.o;
import gn.x;
import gn.y;
import hn.m;
import hn.p;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final xn.h f46481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final xn.h f46482b;

    public static final List a(x xVar, String headerName) {
        s.h(xVar, "<this>");
        s.h(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = xVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (r.A(headerName, xVar.d(i10), true)) {
                try {
                    c(new xn.e().N(xVar.h(i10)), arrayList);
                } catch (EOFException e10) {
                    okhttp3.internal.platform.c.f48992a.e().m("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(f0 f0Var) {
        s.h(f0Var, "<this>");
        if (s.c(f0Var.U0().i(), HttpMethods.HEAD)) {
            return false;
        }
        int iM = f0Var.m();
        return (((iM >= 100 && iM < 200) || iM == 204 || iM == 304) && p.k(f0Var) == -1 && !r.A("chunked", f0.c0(f0Var, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[EDGE_INSN: B:59:0x00bc->B:48:0x00bc BREAK  A[LOOP:2: B:22:0x0073->B:47:0x00ba], SYNTHETIC] */
    private static final void c(xn.e eVar, List list) throws EOFException {
        String strE;
        while (true) {
            String strE2 = null;
            while (true) {
                if (strE2 == null) {
                    g(eVar);
                    strE2 = e(eVar);
                    if (strE2 == null) {
                        return;
                    }
                }
                boolean zG = g(eVar);
                String strE3 = e(eVar);
                if (strE3 == null) {
                    if (eVar.n0()) {
                        list.add(new gn.i(strE2, l0.h()));
                        return;
                    }
                    return;
                }
                int iB = m.B(eVar, (byte) 61);
                boolean zG2 = g(eVar);
                if (zG || !(zG2 || eVar.n0())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iB2 = iB + m.B(eVar, (byte) 61);
                    while (true) {
                        if (strE3 != null) {
                            if (iB2 != 0) {
                                break;
                                break;
                            }
                            if (iB2 <= 1) {
                                return;
                            }
                            if (h(eVar, (byte) 34)) {
                                strE = d(eVar);
                            } else {
                                strE = e(eVar);
                            }
                            if (strE != null) {
                                return;
                            }
                            if (g(eVar)) {
                            }
                            strE3 = null;
                        } else {
                            strE3 = e(eVar);
                            if (!g(eVar)) {
                                iB2 = m.B(eVar, (byte) 61);
                                if (iB2 != 0) {
                                    break;
                                }
                                if (iB2 <= 1 || g(eVar)) {
                                    return;
                                }
                                if (h(eVar, (byte) 34)) {
                                    strE = d(eVar);
                                } else {
                                    strE = e(eVar);
                                }
                                if (strE != null || ((String) linkedHashMap.put(strE3, strE)) != null) {
                                    return;
                                }
                                if (g(eVar) && !eVar.n0()) {
                                    return;
                                } else {
                                    strE3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new gn.i(strE2, linkedHashMap));
                    strE2 = strE3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, strE3 + r.E("=", iB));
                    s.g(mapSingletonMap, "singletonMap(...)");
                    list.add(new gn.i(strE2, mapSingletonMap));
                }
            }
        }
    }

    private static final String d(xn.e eVar) throws EOFException {
        if (eVar.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        xn.e eVar2 = new xn.e();
        while (true) {
            long jO0 = eVar.o0(f46481a);
            if (jO0 == -1) {
                return null;
            }
            if (eVar.c0(jO0) == 34) {
                eVar2.W(eVar, jO0);
                eVar.readByte();
                return eVar2.X0();
            }
            if (eVar.size() == jO0 + 1) {
                return null;
            }
            eVar2.W(eVar, jO0);
            eVar.readByte();
            eVar2.W(eVar, 1L);
        }
    }

    private static final String e(xn.e eVar) {
        long jO0 = eVar.o0(f46482b);
        if (jO0 == -1) {
            jO0 = eVar.size();
        }
        if (jO0 != 0) {
            return eVar.e0(jO0);
        }
        return null;
    }

    public static final void f(o oVar, y url, x headers) {
        s.h(oVar, "<this>");
        s.h(url, "url");
        s.h(headers, "headers");
        if (oVar == o.f39747b) {
            return;
        }
        List listE = n.f39731k.e(url, headers);
        if (listE.isEmpty()) {
            return;
        }
        oVar.a(url, listE);
    }

    private static final boolean g(xn.e eVar) throws EOFException {
        boolean z10 = false;
        while (!eVar.n0()) {
            byte bC0 = eVar.c0(0L);
            if (bC0 != 44) {
                if (bC0 != 32 && bC0 != 9) {
                    break;
                }
                eVar.readByte();
            } else {
                eVar.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    private static final boolean h(xn.e eVar, byte b10) {
        return !eVar.n0() && eVar.c0(0L) == b10;
    }

    static {
        xn.h.a aVar = xn.h.f56912d;
        f46481a = aVar.d("\"\\");
        f46482b = aVar.d(Saucuwx.sBbeXJZljp);
    }
}
