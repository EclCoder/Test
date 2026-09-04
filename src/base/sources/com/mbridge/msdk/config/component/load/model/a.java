package com.mbridge.msdk.config.component.load.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URL;
import java.util.Map;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28953a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28955c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f28959g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f28954b = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28956d = 30;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28957e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f28960h = MBridgeConstans.ENDCARD_URL_TYPE_PL;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("116"));
            if (obj != null) {
                this.f28953a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.c("191"));
            if (obj2 != null) {
                try {
                    float f10 = Float.parseFloat(String.valueOf(obj2));
                    if (f10 <= 0.0f || f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    this.f28954b = f10;
                } catch (Throwable th2) {
                    q0.b("DownloadModel", th2.getMessage());
                    this.f28954b = 1.0f;
                }
            }
            Object obj3 = map.get(c.c(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj3 != null) {
                this.f28955c = String.valueOf(obj3);
            }
            Object obj4 = map.get(c.c("162"));
            if (obj4 != null) {
                try {
                    int i10 = Integer.parseInt(String.valueOf(obj4));
                    if (i10 == 0) {
                        i10 = 30;
                    }
                    this.f28956d = i10;
                } catch (Throwable th3) {
                    q0.b("DownloadModel", th3.getMessage());
                    this.f28956d = 30;
                }
            }
            Object obj5 = map.get(c.c("174"));
            if (obj5 != null) {
                try {
                    this.f28957e = Integer.parseInt(String.valueOf(obj5));
                } catch (Throwable th4) {
                    q0.b("DownloadModel", th4.getMessage());
                    this.f28957e = 0;
                }
            }
            Object obj6 = map.get(c.c("192"));
            if (obj6 != null) {
                try {
                    this.f28958f = Integer.parseInt(String.valueOf(obj6));
                } catch (Throwable th5) {
                    q0.b("DownloadModel", th5.getMessage());
                    this.f28958f = 15;
                }
            }
            Object obj7 = map.get(c.c("201"));
            if (obj7 != null) {
                this.f28959g = String.valueOf(obj7);
            } else {
                try {
                    URL url = new URL(f());
                    this.f28959g = url.getProtocol() + "://" + url.getHost() + url.getPath();
                } catch (Throwable th6) {
                    q0.b("DownloadModel", th6.getMessage());
                }
            }
            Object obj8 = map.get(c.c(NpmRNZ.ZqUNjNvknecBEcE));
            if (obj8 != null) {
                this.f28960h = String.valueOf(obj8);
            }
        }
    }

    public String b() {
        return this.f28959g;
    }

    public String c() {
        return this.f28955c;
    }

    public float d() {
        return this.f28954b;
    }

    public int e() {
        return this.f28958f;
    }

    public String f() {
        return this.f28953a;
    }

    public int g() {
        return this.f28957e;
    }

    public int h() {
        return this.f28956d * 1000;
    }

    public String a() {
        return this.f28960h;
    }
}
