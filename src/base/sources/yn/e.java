package yn;

import fl.g0;
import java.io.EOFException;
import java.util.ArrayList;
import xn.h0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final xn.h f58103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final xn.h f58104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final xn.h f58105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final xn.h f58106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final xn.h f58107e;

    static {
        xn.h.a aVar = xn.h.f56912d;
        f58103a = aVar.d("/");
        f58104b = aVar.d("\\");
        f58105c = aVar.d("/\\");
        f58106d = aVar.d(".");
        f58107e = aVar.d("..");
    }

    public static final h0 j(h0 h0Var, h0 child, boolean z10) {
        kotlin.jvm.internal.s.h(h0Var, "<this>");
        kotlin.jvm.internal.s.h(child, "child");
        if (child.isAbsolute() || child.m() != null) {
            return child;
        }
        xn.h hVarM = m(h0Var);
        if (hVarM == null && (hVarM = m(child)) == null) {
            hVarM = s(h0.f56918c);
        }
        xn.e eVar = new xn.e();
        eVar.k0(h0Var.b());
        if (eVar.size() > 0) {
            eVar.k0(hVarM);
        }
        eVar.k0(child.b());
        return q(eVar, z10);
    }

    public static final h0 k(String str, boolean z10) {
        kotlin.jvm.internal.s.h(str, "<this>");
        return q(new xn.e().N(str), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(h0 h0Var) {
        int iW = xn.h.w(h0Var.b(), f58103a, 0, 2, null);
        return iW != -1 ? iW : xn.h.w(h0Var.b(), f58104b, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn.h m(h0 h0Var) {
        xn.h hVarB = h0Var.b();
        xn.h hVar = f58103a;
        if (xn.h.r(hVarB, hVar, 0, 2, null) != -1) {
            return hVar;
        }
        xn.h hVarB2 = h0Var.b();
        xn.h hVar2 = f58104b;
        if (xn.h.r(hVarB2, hVar2, 0, 2, null) != -1) {
            return hVar2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(h0 h0Var) {
        return h0Var.b().i(f58107e) && (h0Var.b().D() == 2 || h0Var.b().y(h0Var.b().D() + (-3), f58103a, 0, 1) || h0Var.b().y(h0Var.b().D() + (-3), f58104b, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(h0 h0Var) {
        if (h0Var.b().D() == 0) {
            return -1;
        }
        if (h0Var.b().j(0) == 47) {
            return 1;
        }
        if (h0Var.b().j(0) == 92) {
            if (h0Var.b().D() <= 2 || h0Var.b().j(1) != 92) {
                return 1;
            }
            int iP = h0Var.b().p(f58104b, 2);
            return iP == -1 ? h0Var.b().D() : iP;
        }
        if (h0Var.b().D() > 2 && h0Var.b().j(1) == 58 && h0Var.b().j(2) == 92) {
            char cJ = (char) h0Var.b().j(0);
            if ('a' <= cJ && cJ < '{') {
                return 3;
            }
            if ('A' <= cJ && cJ < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean p(xn.e eVar, xn.h hVar) {
        if (!kotlin.jvm.internal.s.c(hVar, f58104b) || eVar.size() < 2 || eVar.c0(1L) != 58) {
            return false;
        }
        char cC0 = (char) eVar.c0(0L);
        if ('a' > cC0 || cC0 >= '{') {
            return 'A' <= cC0 && cC0 < '[';
        }
        return true;
    }

    public static final h0 q(xn.e eVar, boolean z10) throws EOFException {
        xn.h hVar;
        xn.h hVarF0;
        kotlin.jvm.internal.s.h(eVar, "<this>");
        xn.e eVar2 = new xn.e();
        xn.h hVarR = null;
        int i10 = 0;
        while (true) {
            if (!eVar.z0(0L, f58103a)) {
                hVar = f58104b;
                if (!eVar.z0(0L, hVar)) {
                    break;
                }
            }
            byte b10 = eVar.readByte();
            if (hVarR == null) {
                hVarR = r(b10);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && kotlin.jvm.internal.s.c(hVarR, hVar);
        if (z11) {
            kotlin.jvm.internal.s.e(hVarR);
            eVar2.k0(hVarR);
            eVar2.k0(hVarR);
        } else if (i10 > 0) {
            kotlin.jvm.internal.s.e(hVarR);
            eVar2.k0(hVarR);
        } else {
            long jO0 = eVar.o0(f58105c);
            if (hVarR == null) {
                hVarR = jO0 == -1 ? s(h0.f56918c) : r(eVar.c0(jO0));
            }
            if (p(eVar, hVarR)) {
                if (jO0 == 2) {
                    eVar2.W(eVar, 3L);
                } else {
                    eVar2.W(eVar, 2L);
                }
            }
            g0 g0Var = g0.f38750a;
        }
        boolean z12 = eVar2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!eVar.n0()) {
            long jO1 = eVar.o0(f58105c);
            if (jO1 == -1) {
                hVarF0 = eVar.B0();
            } else {
                hVarF0 = eVar.f0(jO1);
                eVar.readByte();
            }
            xn.h hVar2 = f58107e;
            if (kotlin.jvm.internal.s.c(hVarF0, hVar2)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || kotlin.jvm.internal.s.c(gl.r.n0(arrayList), hVar2)))) {
                        arrayList.add(hVarF0);
                    } else if (!z11 || arrayList.size() != 1) {
                        gl.r.I(arrayList);
                    }
                }
            } else if (!kotlin.jvm.internal.s.c(hVarF0, f58106d) && !kotlin.jvm.internal.s.c(hVarF0, xn.h.f56913e)) {
                arrayList.add(hVarF0);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                eVar2.k0(hVarR);
            }
            eVar2.k0((xn.h) arrayList.get(i11));
        }
        if (eVar2.size() == 0) {
            eVar2.k0(f58106d);
        }
        return new h0(eVar2.B0());
    }

    private static final xn.h r(byte b10) {
        if (b10 == 47) {
            return f58103a;
        }
        if (b10 == 92) {
            return f58104b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn.h s(String str) {
        if (kotlin.jvm.internal.s.c(str, "/")) {
            return f58103a;
        }
        if (kotlin.jvm.internal.s.c(str, "\\")) {
            return f58104b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
