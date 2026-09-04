package com.mbridge.msdk.config.component.cal;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.nori.NoriCpt;
import com.mbridge.msdk.config.manager.callback.b;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class CalCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.cal.model.a f28529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBridgeIds f28530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f28531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f28532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f28533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f28534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f28535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f28536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f28537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Object f28538q;

    private void a(boolean z10, String str, String str2) {
        HashMap map = new HashMap();
        map.put(c.c("500"), z10 ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        if (!z10) {
            map.put(c.c("code"), str);
            map.put(c.c("reason"), str2);
        }
        a(a("910002", (Map<String, Object>) map));
    }

    private String h() {
        Map<String, Object> mapF = this.f28529h.f();
        this.f28531j = String.valueOf(mapF.get(c.c("107")));
        this.f28532k = String.valueOf(mapF.get(c.c("cbType")));
        this.f28533l = String.valueOf(mapF.get(c.c("110")));
        this.f28534m = String.valueOf(mapF.get(c.c("111")));
        this.f28535n = String.valueOf(mapF.get(c.c("106")));
        this.f28536o = String.valueOf(mapF.get(c.c("108")));
        this.f28537p = String.valueOf(mapF.get(c.c("109")));
        Object objB = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) this.f28521d.b((Object) "adModel")).b((Object) "host");
        StringBuilder sb2 = new StringBuilder();
        if (objB instanceof String) {
            sb2.append(objB);
            sb2.append("/addReward?");
            sb2.append("user_id=");
            sb2.append(this.f28531j);
            sb2.append("&cb_type=");
            sb2.append(this.f28532k);
            sb2.append("&reward_name=");
            sb2.append(this.f28533l);
            sb2.append("&reward_amount=");
            sb2.append(this.f28534m);
            sb2.append("&unit_id=");
            sb2.append(this.f28535n);
            sb2.append("&click_id=");
            sb2.append(this.f28536o);
            sb2.append("&extra=");
            sb2.append(this.f28537p);
        }
        return sb2.toString();
    }

    private void i() {
        Map<String, Object> mapF = this.f28529h.f();
        this.f28533l = String.valueOf(mapF.get(c.c("110")));
        this.f28534m = String.valueOf(mapF.get(c.c("111")));
        RewardInfo rewardInfo = new RewardInfo(mapF.get(c.c("112")).equals("1"), 1);
        rewardInfo.setRewardName(this.f28533l);
        rewardInfo.setRewardAmount(this.f28534m);
        Object obj = this.f28538q;
        if (obj instanceof b) {
            ((b) obj).onAdClose(this.f28530i, rewardInfo);
        }
    }

    private void j() {
        if (this.f28538q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put(c.c("buyer_id"), this.f28529h.a());
            ((com.mbridge.msdk.config.manager.callback.a) this.f28538q).a(map);
        }
    }

    private void k() {
        Object obj = this.f28538q;
        if (obj instanceof b) {
            ((b) obj).onEndCardShow(this.f28530i);
        }
    }

    private void l() {
        if (this.f28538q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put(c.c(MBridgeConstans.PROPERTIES_UNIT_ID), this.f28529h.g());
            map.put(c.c("ready_state"), Boolean.valueOf(this.f28529h.e() == 1));
            ((com.mbridge.msdk.config.manager.callback.a) this.f28538q).a(map);
        }
    }

    private void m() {
        Object obj = this.f28538q;
        if (obj instanceof b) {
            ((b) obj).onVideoLoadFail(this.f28530i, this.f28529h.c() == null ? "" : this.f28529h.c());
        }
    }

    private void n() {
        Object obj = this.f28538q;
        if (obj instanceof b) {
            ((b) obj).onLoadSuccess(this.f28530i);
        }
    }

    private void o() {
        Object obj = this.f28538q;
        if (obj instanceof b) {
            ((b) obj).onVideoLoadSuccess(this.f28530i);
        }
    }

    private void q() {
        String strH = h();
        NoriCpt noriCpt = new NoriCpt();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("URLs", strH);
        map2.put("scheme", "HTTP");
        map2.put("method", HttpMethods.GET);
        map.put("componentConfig", map2);
        noriCpt.a(map, this.f28521d, "");
        noriCpt.d();
    }

    private void r() {
        Object obj = this.f28538q;
        if (obj instanceof b) {
            ((b) obj).onShowFail(this.f28530i, this.f28529h.c() == null ? "" : this.f28529h.c());
        }
    }

    private void s() {
        Object obj = this.f28538q;
        if (obj instanceof b) {
            ((b) obj).onAdShow(this.f28530i);
        }
    }

    private void t() {
        Object obj = this.f28538q;
        if (obj instanceof b) {
            ((b) obj).onVideoAdClicked(this.f28530i);
        }
    }

    private void u() {
        Object obj = this.f28538q;
        if (obj instanceof b) {
            ((b) obj).onVideoComplete(this.f28530i);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f28523f = "910001";
        this.f28529h = new com.mbridge.msdk.config.component.cal.model.a(map);
        MBridgeIds mBridgeIds = new MBridgeIds();
        this.f28530i = mBridgeIds;
        mBridgeIds.setUnitId(this.f28529h.g());
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f28521d;
            if (aVar != null && aVar.a((Object) c.c("sdk_context"))) {
                Object objB = this.f28521d.b((Object) c.c("sdk_context"));
                if (objB instanceof Map) {
                    this.f28538q = ((Map) objB).get(c.c("callback"));
                }
            }
            if (this.f28538q == null) {
                a(false, "", "Callback Listener is NULL");
            }
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = this.f28521d;
            if (aVar2 != null && aVar2.a((Object) c.c("51"))) {
                Object objB2 = this.f28521d.b((Object) c.c("51"));
                if (objB2 instanceof Map) {
                    String strValueOf = String.valueOf(((Map) objB2).get("id"));
                    if (!TextUtils.isEmpty(strValueOf) && strValueOf.contains("-")) {
                        this.f28530i.setContextId(strValueOf);
                    }
                }
            }
        } catch (Throwable th2) {
            q0.b("CalCpt", th2.getMessage(), th2);
        }
        g();
    }

    public void g() {
        String strB = this.f28529h.b();
        if (strB == null) {
            a(false, "900001", "command is null");
            return;
        }
        try {
            if (c.c("loadV3Success").equals(strB)) {
                n();
            } else if (c.c("loadSuccess").equals(strB)) {
                o();
            } else if (c.c("loadFailed").equals(strB)) {
                m();
            } else if (c.c("301").equals(strB)) {
                s();
            } else if (c.c("302").equals(strB)) {
                r();
            } else if (c.c("304").equals(strB)) {
                k();
            } else if (c.c("305").equals(strB)) {
                t();
            } else if (c.c("306").equals(strB)) {
                i();
            } else if (c.c("303").equals(strB)) {
                u();
            } else if (c.c("308").equals(strB)) {
                q();
            } else if (c.c("300").equals(strB)) {
                l();
            } else if (c.c("sdkInit").equals(strB)) {
                p();
            } else if (c.c("309").equals(strB)) {
                j();
            }
        } catch (Exception e10) {
            q0.b("CalCpt", e10.getMessage(), e10);
            a(false, "900002", "callback type failed");
        }
        a(true, "", "");
    }

    private void p() {
        if (this.f28538q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put(c.c("init_status"), Integer.valueOf(this.f28529h.d()));
            map.put(c.c(vHmGJpUTWNVV.gnlQHqJfFz), this.f28529h.c());
            ((com.mbridge.msdk.config.manager.callback.a) this.f28538q).a(map);
        }
    }
}
