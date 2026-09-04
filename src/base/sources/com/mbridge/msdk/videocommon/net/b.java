package com.mbridge.msdk.videocommon.net;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.same.net.wrapper.f;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.out.MBConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b extends com.mbridge.msdk.foundation.same.net.wrapper.c {
    public b(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        try {
            super.addExtraParams(str, eVar);
            eVar.a("platform", "1");
            eVar.a("os_version", Build.VERSION.RELEASE);
            eVar.a(CampaignEx.JSON_KEY_PACKAGE_NAME, m0.t(this.mContext));
            eVar.a("app_version_name", m0.C(this.mContext));
            eVar.a("app_version_code", m0.B(this.mContext) + "");
            eVar.a("orientation", m0.G(this.mContext) + "");
            eVar.a("model", m0.o());
            eVar.a("brand", m0.t());
            int iS = m0.s(this.mContext);
            eVar.a("network_type", iS + "");
            eVar.a("network_str", m0.a(this.mContext, iS) + "");
            eVar.a("language", m0.p(this.mContext));
            eVar.a("timezone", m0.y());
            eVar.a("useragent", m0.i());
            eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
            eVar.a("screen_size", m0.n(this.mContext) + "x" + m0.m(this.mContext));
            if (com.mbridge.msdk.util.b.a()) {
                eVar.a("gaid", "");
                eVar.a("gp_version", v.d(this.mContext));
                eVar.a("is_clever", com.mbridge.msdk.foundation.same.a.C);
            } else {
                eVar.a("gaid", g.d());
            }
            eVar.a("gaid2", g.c());
            f.h(eVar);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
