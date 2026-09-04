package com.mbridge.msdk.config.component.status;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class StatusCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static c f29094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static e f29095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static d f29096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static a f29097n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f29098h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Map<String, Object> f29099i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Map<String, Object> f29100j = null;

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f28523f = "916001";
        if (map == null) {
            return;
        }
        this.f29100j = map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void c(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f29099i = map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        String strValueOf;
        List<String> list;
        super.d();
        Map<String, Object> map = this.f29099i;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (f29097n == null) {
            f29097n = new a() { // from class: com.mbridge.msdk.config.component.status.f
                @Override // com.mbridge.msdk.config.component.status.a
                public final void a(com.mbridge.msdk.config.component.base.b bVar) {
                    this.f29125a.b(bVar);
                }
            };
        }
        if (d("916002")) {
            if (!c("916002")) {
                c cVar = f29094k;
                if (cVar != null) {
                    cVar.b(f29097n);
                    f29094k.d();
                }
                f29094k = null;
            } else if (f29094k == null) {
                c cVar2 = new c();
                f29094k = cVar2;
                cVar2.a(f29097n);
            }
        }
        if (d("916003") || d("916004")) {
            if (c("916003") || c("916004")) {
                b bVar = com.mbridge.msdk.foundation.controller.a.f30139s;
                if (bVar != null) {
                    bVar.a(f29097n);
                }
            } else {
                b bVar2 = com.mbridge.msdk.foundation.controller.a.f30139s;
                if (bVar2 != null) {
                    bVar2.b(f29097n);
                }
            }
        }
        if (d("916005")) {
            if (!c("916005")) {
                e eVar = f29095l;
                if (eVar != null) {
                    eVar.b(f29097n);
                    f29095l.d();
                }
                f29095l = null;
            } else if (f29095l == null) {
                e eVar2 = new e();
                f29095l = eVar2;
                eVar2.a(f29097n);
            }
        }
        if (d("916006")) {
            Map<String, Object> map2 = this.f29100j;
            if (map2 != null) {
                Object obj = map2.get(com.mbridge.msdk.config.component.common.util.c.c(DownloadModel.FILE_NAME));
                if (obj == null) {
                    obj = lkCBSIFlvmyGX.IZAmzp;
                }
                strValueOf = String.valueOf(obj);
                list = (this.f29100j.containsKey(com.mbridge.msdk.config.component.common.util.c.c("key_list")) && (this.f29100j.get(com.mbridge.msdk.config.component.common.util.c.c("key_list")) instanceof List)) ? (List) this.f29100j.get(com.mbridge.msdk.config.component.common.util.c.c("key_list")) : null;
            } else {
                strValueOf = null;
                list = null;
            }
            if (!c("916006")) {
                d dVar = f29096m;
                if (dVar != null) {
                    dVar.b(f29097n);
                }
                f29096m = null;
            } else if (f29096m == null) {
                d dVar2 = new d(strValueOf);
                f29096m = dVar2;
                dVar2.a(list);
                f29096m.a(f29097n);
            }
        }
        g();
        a(a("916007", (Map<String, Object>) null));
    }

    private boolean c(String str) {
        Object obj = this.f29099i.get(str);
        if (obj instanceof Map) {
            return String.valueOf(((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.c("17"))).equals("1");
        }
        return false;
    }

    private void g() {
        boolean zC = c("916002");
        boolean zC2 = c("916005");
        boolean z10 = c("916004") || c("916003");
        boolean zC3 = c("916006");
        if (zC || zC2 || z10 || zC3) {
            return;
        }
        f29097n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.base.b bVar) {
        String strC = bVar.c();
        strC.getClass();
        switch (strC) {
            case "916002":
                String strValueOf = String.valueOf(bVar.b().get("networkType"));
                if (TextUtils.isEmpty(this.f29098h)) {
                    this.f29098h = strValueOf;
                    break;
                } else if (!this.f29098h.equals(strValueOf)) {
                    this.f29098h = strValueOf;
                    a(a(bVar.c(), bVar.b()));
                    break;
                }
                break;
            case "916003":
            case "916004":
            case "916005":
            case "916006":
                a(a(bVar.c(), bVar.b()));
                break;
        }
    }

    private boolean d(String str) {
        Object obj;
        Object obj2 = this.f29099i.get(str);
        if (!(obj2 instanceof Map) || (obj = ((Map) obj2).get(com.mbridge.msdk.config.component.common.util.c.c("17"))) == null) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        return strValueOf.equals("1") || strValueOf.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }
}
