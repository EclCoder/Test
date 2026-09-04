package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import f8.Ygx.FuoITeVPeXAj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class c extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile c f30177j;

    private c() {
        h();
    }

    public static void c(boolean z10) {
    }

    public static boolean l() {
        return true;
    }

    public static c m() {
        if (f30177j == null) {
            synchronized (c.class) {
                try {
                    if (f30177j == null) {
                        f30177j = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f30177j;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.b
    public int a(g gVar, String str) {
        if (gVar == null) {
            gVar = h.b().a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return gVar.x0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return gVar.w0();
        }
        if (str.equals(FuoITeVPeXAj.rbPcdCs)) {
            return gVar.y0();
        }
        return -1;
    }

    public boolean c(String str) {
        boolean z10;
        g gVarF = h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarF == null) {
            gVarF = h.b().a();
            z10 = true;
        } else {
            z10 = false;
        }
        int iL0 = gVarF.l0();
        boolean z11 = iL0 != 0 ? iL0 == 1 && a(gVarF, str) == 1 : a(str) == 1 && a(gVarF, str) == 1;
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z11 = a(str) == 1;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) && m().e() == 2) {
            return (gVarF.I0() || z10 || a(str) != 1) ? false : true;
        }
        return z11;
    }
}
