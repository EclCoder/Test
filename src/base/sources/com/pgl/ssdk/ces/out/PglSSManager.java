package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.view.MotionEvent;
import com.pgl.ssdk.ces.b;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    public static final String REPORT_SCENE_ADSHOW = "AdShow";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile PglSSManager f35384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f35385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f35386c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile PglSSCallBack f35387d;

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.f35385b = b.a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersion());
    }

    public static int getInitStatus() {
        return b.d();
    }

    public static PglSSManager getInstance() {
        return f35384a;
    }

    public static String getLoadError() {
        if (b.f() != null) {
            return b.f().f35352b;
        }
        return null;
    }

    @DungeonFlag
    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (f35384a == null) {
            synchronized (PglSSManager.class) {
                try {
                    if (f35384a == null) {
                        f35384a = new PglSSManager(context, pglSSConfig);
                        if (b.d() == 0) {
                            f35384a.f35387d = pglSSConfig.getCallBack();
                            f35384a.f35385b.a(pglSSConfig.getCustomInfo());
                            f35384a.f35385b.a(str, str3, str2, str4);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f35384a;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (b.d() == 0) {
            this.f35385b.a(motionEvent);
        }
    }

    public long getECForBidding() {
        return 0L;
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        if (b.d() == 0) {
            return this.f35385b.a(str, bArr);
        }
        return null;
    }

    public PglSSCallBack getPglCallBack() {
        return this.f35387d;
    }

    public String getSofChara() {
        return null;
    }

    public String getToken() {
        if (b.d() == 0) {
            return this.f35385b.g();
        }
        return null;
    }

    public void reportNow(String str, Map<String, Object> map) {
        if (b.d() == 0) {
            this.f35385b.a(str);
            int i10 = this.f35386c;
            b bVar = this.f35385b;
            if (i10 % bVar.f35368o == 0) {
                bVar.a(str, map);
            }
            this.f35386c++;
        }
    }

    public void setCustomInfo(Map<String, Object> map) {
        if (b.d() == 0) {
            this.f35385b.a(map);
        }
    }

    public void setDeviceId(String str) {
        if (b.d() == 0) {
            this.f35385b.c(str);
        }
    }

    public void setGaid(String str) {
        if (b.d() == 0) {
            this.f35385b.d(str);
        }
    }
}
