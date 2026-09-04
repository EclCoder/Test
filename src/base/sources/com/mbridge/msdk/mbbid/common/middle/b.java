package com.mbridge.msdk.mbbid.common.middle;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31363c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BidListennning f31365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BidResponsedEx f31366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f31367g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f31369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f31370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f31371k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f31372l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f31368h = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f31364d = com.mbridge.msdk.foundation.controller.c.n().d();

    public b(String str, String str2, String str3) {
        this.f31361a = str;
        this.f31362b = str2;
        this.f31363c = str3;
    }

    public void b(boolean z10) {
        this.f31371k = z10;
    }

    public void b(int i10) {
        this.f31372l = i10;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends com.mbridge.msdk.mbbid.common.middle.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31373b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, String str3) {
            super(str, str2);
            this.f31373b = str3;
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(BidResponsedEx bidResponsedEx) {
            b.this.f31368h = false;
            b.this.f31366f = bidResponsedEx;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f31364d, b.this.f31362b, bidResponsedEx.getBidId(), this.f31373b, bidResponsedEx.getBidToken());
            b.this.a(bidResponsedEx);
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(int i10, String str) {
            b.this.f31368h = false;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f31364d, b.this.f31362b, str, this.f31373b);
            b.this.a(str);
        }
    }

    public void b(long j10) {
        this.f31370j = j10;
    }

    public void a(int i10) {
        this.f31367g = i10;
    }

    public void a(long j10) {
        this.f31369i = j10;
    }

    public void a(boolean z10) {
        try {
            if (!this.f31368h) {
                this.f31368h = true;
                if (this.f31364d == null) {
                    a("context is null");
                }
                com.mbridge.msdk.mbbid.common.net.a aVar = new com.mbridge.msdk.mbbid.common.net.a(this.f31364d);
                e eVar = new e();
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                eVar.a(MBridgeConstans.APP_ID, strB);
                eVar.a("sign", SameMD5.getMD5(strB + com.mbridge.msdk.foundation.controller.c.n().c()));
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f31362b);
                if (TextUtils.isEmpty(this.f31361a)) {
                    this.f31361a = "";
                }
                eVar.a(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, this.f31361a);
                if (com.mbridge.msdk.util.b.a()) {
                    eVar.a("install_ids", c.a());
                }
                eVar.a("bid_floor", this.f31363c);
                eVar.a(e.f30651h, v0.a(this.f31364d, this.f31362b));
                eVar.a(e.f30650g, com.mbridge.msdk.foundation.same.buffer.b.a(this.f31362b, ""));
                String str = "1";
                eVar.a("req_type", this.f31371k ? "1" : MBridgeConstans.API_REUQEST_CATEGORY_APP);
                eVar.a("orientation", m0.G(this.f31364d) + "");
                int i10 = this.f31367g;
                if (i10 == 296) {
                    if (this.f31369i > 0 && this.f31370j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f31370j + "x" + this.f31369i);
                        try {
                            int i11 = BannerUtils.f31307a;
                            Method method = BannerUtils.class.getMethod("getCloseIds", String.class);
                            if (method.invoke(null, this.f31362b) instanceof String) {
                                eVar.a("close_id", method.invoke(null, this.f31362b).toString());
                            }
                        } catch (Exception unused) {
                            a("banner module is miss");
                            return;
                        }
                    } else {
                        a("bid required param is missing or error");
                        return;
                    }
                } else if (i10 == 297) {
                    if (this.f31369i > 0 && this.f31370j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f31370j + "x" + this.f31369i);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f31372l);
                        sb2.append("");
                        eVar.a("orientation", sb2.toString());
                    } else {
                        a("ad display area is too small");
                        return;
                    }
                } else if (i10 != 298) {
                    if (!z10) {
                        str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                    }
                    eVar.a("rw_plus", str);
                } else if (this.f31369i > 0 && this.f31370j > 0) {
                    eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f31370j + "x" + this.f31369i);
                } else {
                    a("bid required param is missing or error");
                    return;
                }
                String md5 = SameMD5.getMD5(v0.d());
                eVar.a(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, md5);
                a aVar2 = new a(this.f31361a, this.f31362b, md5);
                aVar2.setUnitId(this.f31362b);
                aVar2.setPlacementId(this.f31361a);
                aVar.get(1, d.h().a(false, ""), eVar, aVar2, "bid_request", CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
                return;
            }
            a("current unit is biding");
        } catch (Throwable th2) {
            a(th2.getMessage());
        }
    }

    public void a(BidListennning bidListennning) {
        this.f31365e = bidListennning;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        BidListennning bidListennning = this.f31365e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BidResponsed bidResponsed) {
        BidListennning bidListennning = this.f31365e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }
}
