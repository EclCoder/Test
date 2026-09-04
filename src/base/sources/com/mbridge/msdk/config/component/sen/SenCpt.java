package com.mbridge.msdk.config.component.sen;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class SenCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static b f29084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Map<String, a> f29085l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f29086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f29087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f29088j;

    private String c(String str) {
        if (com.mbridge.msdk.config.component.common.util.c.c("331").equals(str)) {
            return "accelerometer";
        }
        if (com.mbridge.msdk.config.component.common.util.c.c("332").equals(str)) {
            return "magnetic";
        }
        if (com.mbridge.msdk.config.component.common.util.c.c("333").equals(str)) {
            return "gyroscope";
        }
        return com.mbridge.msdk.config.component.common.util.c.c("334").equals(str) ? "rotation" : str;
    }

    private void h() {
        if (f29084k == null) {
            f29084k = new b();
        }
        if (f29085l == null) {
            f29085l = new HashMap();
        }
        a aVar = new a() { // from class: com.mbridge.msdk.config.component.sen.c
            @Override // com.mbridge.msdk.config.component.sen.a
            public final void a(com.mbridge.msdk.config.component.base.b bVar) {
                this.f29093a.b(bVar);
            }
        };
        f29085l.put(this.f29087i, aVar);
        f29084k.a(aVar);
        f29084k.a(g(), c(this.f29087i), this.f29088j);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f28523f = "917001";
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                if (key.equals(com.mbridge.msdk.config.component.common.util.c.c("149"))) {
                    this.f29087i = String.valueOf(entry.getValue());
                } else if (key.equals(com.mbridge.msdk.config.component.common.util.c.c("150"))) {
                    double d10 = Double.parseDouble(String.valueOf(entry.getValue()));
                    if (d10 > 0.0d) {
                        this.f29088j = (int) (d10 * 1000.0d * 1000.0d);
                    }
                } else if (key.equals(com.mbridge.msdk.config.component.common.util.c.c(StatisticData.ERROR_CODE_NOT_FOUND))) {
                    this.f29086h = String.valueOf(entry.getValue());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Map<String, a> map;
        super.d();
        if (this.f29086h.equals(com.mbridge.msdk.config.component.common.util.c.c("310"))) {
            h();
        }
        if (this.f29086h.equals(com.mbridge.msdk.config.component.common.util.c.c("318")) && f29084k != null && (map = f29085l) != null) {
            f29084k.b(map.get(this.f29087i));
            f29085l.remove(this.f29087i);
            if (f29085l.isEmpty()) {
                f29084k.a();
                f29084k = null;
            }
        }
        a("917003", (HashMap<String, Object>) null);
    }

    private int g() {
        if (com.mbridge.msdk.config.component.common.util.c.c("331").equals(this.f29087i)) {
            return 1;
        }
        if (com.mbridge.msdk.config.component.common.util.c.c("332").equals(this.f29087i)) {
            return 2;
        }
        if (com.mbridge.msdk.config.component.common.util.c.c("333").equals(this.f29087i)) {
            return 4;
        }
        return com.mbridge.msdk.config.component.common.util.c.c("334").equals(this.f29087i) ? 11 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.base.b bVar) {
        a(a(bVar.c(), bVar.b()));
    }
}
