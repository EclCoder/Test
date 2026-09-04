package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.inmobi.sdk.InMobiSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class f {
    public static void a(e eVar, Context context) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", m0.E() + "");
            eVar.a("has_wx", m0.E(context) + "");
            eVar.a("integrated_wx", m0.G() + "");
            eVar.a("opensdk_ver", m0.D() + "");
            eVar.a("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
            eVar.a("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
            eVar.a(WwUgngZLNA.dfmVkte, m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
            String strJ = m0.j();
            if (!TextUtils.isEmpty(strJ)) {
                eVar.a("hardware", strJ);
            }
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().d() == 1) {
                eVar.a("dnt", "1");
            }
            eVar.a(e.f30649f, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c() + "");
            eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.g.a() + "");
            eVar.a("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
            eVar.a("emu", String.valueOf(m0.F()));
            eVar.a("gp_version", m0.v());
            eVar.a("os_api_version", String.valueOf(Build.VERSION.SDK_INT));
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.f30647d, t0.c() + "");
            eVar.a(e.f30648e, t0.a() + "");
            eVar.a(e.f30653j, m0.w());
        }
        eVar.a("pkg_source", m0.a(m0.t(context), context));
        if (com.mbridge.msdk.foundation.controller.c.n().k() != null) {
            eVar.a(KPtaxpyICj.STtNMNFTJcp, com.mbridge.msdk.foundation.controller.c.n().k().toString());
        }
        eVar.a(WwUgngZLNA.rxDfNL, MBridgeConstans.API_REUQEST_CATEGORY_APP);
        g.a(eVar, context);
        g(eVar);
    }

    public static void b(e eVar) {
        eVar.a("api_version", com.mbridge.msdk.foundation.same.a.f30482d);
    }

    public static void c(e eVar) {
        String str = com.mbridge.msdk.util.c.f33970b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        eVar.a("cronet_env", str);
    }

    public static void d(e eVar) {
        eVar.a("dyview_type", com.mbridge.msdk.foundation.same.a.f30501w);
    }

    public static void e(e eVar) {
        com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarF == null) {
            gVarF = com.mbridge.msdk.setting.h.b().a();
        }
        if (gVarF.E() == 1) {
            eVar.a(InMobiSdk.IM_GDPR_CONSENT_IAB, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().e() + "");
        } else if (gVarF.I0()) {
            eVar.a(InMobiSdk.IM_GDPR_CONSENT_IAB, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().e() + "");
        }
        String strF = com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().f();
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        eVar.a("tc_string", strF);
    }

    public static void f(e eVar) {
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                eVar.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f30485g)) {
                com.mbridge.msdk.foundation.same.a.f30485g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c");
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f30485g)) {
                return;
            }
            eVar.a("c", com.mbridge.msdk.foundation.same.a.f30485g);
        } catch (Exception e10) {
            q0.b("CommonRequestParamsForAdd", e10.getMessage());
        }
    }

    public static void g(e eVar) {
        a(eVar, true);
        i(eVar);
        f(eVar);
        e(eVar);
        a(eVar);
        c(eVar);
        g.a(eVar);
    }

    public static void h(e eVar) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", m0.E() + "");
            eVar.a("has_wx", m0.E(com.mbridge.msdk.foundation.controller.c.n().d()) + "");
            eVar.a("integrated_wx", m0.G() + "");
            eVar.a("opensdk_ver", m0.D() + "");
            eVar.a("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
            eVar.a("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
            eVar.a("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
            String strJ = m0.j();
            if (!TextUtils.isEmpty(strJ)) {
                eVar.a("hardware", strJ);
            }
            eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.g.a() + "");
            eVar.a("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
            eVar.a("emu", String.valueOf(m0.F()));
            eVar.a("gp_version", m0.v());
            eVar.a("os_api_version", String.valueOf(Build.VERSION.SDK_INT));
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.f30653j, m0.w());
        }
        g.b(eVar);
        a(eVar, false);
        i(eVar);
        f(eVar);
        a(eVar);
        c(eVar);
    }

    public static void i(e eVar) {
        int iC = m0.C();
        if (iC != -1) {
            eVar.a("unknown_source", iC + "");
        }
    }

    public static void j(e eVar) {
        if (m0.A() == 0) {
            return;
        }
        eVar.a("tun", m0.A() + "");
    }

    public static void k(e eVar) {
        if (eVar != null) {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                eVar.a("model");
                eVar.a("brand");
                eVar.a("screen_size");
                eVar.a("sub_ip");
                eVar.a("network_type");
                eVar.a("useragent");
                eVar.a("ua");
                eVar.a("language");
                eVar.a("network_str");
                eVar.a("os_version");
                eVar.a("country_code");
                eVar.a("cronet_env");
                eVar.a("adid_limit");
                eVar.a("adid_limit_dev");
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                eVar.a(e.f30647d);
                eVar.a(e.f30648e);
                eVar.a("power_rate");
                eVar.a("charging");
                eVar.a("timezone");
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                eVar.a("gaid");
                eVar.a("gaid2");
                eVar.a("az_aid_info");
            }
            g.c(eVar);
        }
    }

    public static void a(e eVar, boolean z10) {
        com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (gVarF != null) {
            if (!TextUtils.isEmpty(gVarF.a()) && z10) {
                eVar.a("a_stid", gVarF.a());
            }
            try {
                g.a(eVar, contextD, z10, gVarF);
            } catch (Exception e10) {
                q0.b("CommonRequestParamsForAdd", e10.getMessage());
            }
        }
    }

    public static void a(e eVar) {
        String strB = com.mbridge.msdk.foundation.tools.g.b();
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        eVar.a("az_aid_info", strB);
    }
}
