package zo;

import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class i implements uo.b {
    static boolean e(String str, String str2) {
        if (str2 == null) {
            str2 = "/";
        }
        if (str2.length() > 1 && str2.endsWith("/")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        return str.startsWith(str2) && (str2.equals("/") || str.length() == str2.length() || str.charAt(str2.length()) == '/');
    }

    @Override // uo.b
    public String b() {
        return MBridgeConstans.DYNAMIC_VIEW_WX_PATH;
    }

    @Override // uo.d
    public void c(uo.l lVar, String str) {
        ip.a.h(lVar, "Cookie");
        if (ip.g.b(str)) {
            str = "/";
        }
        lVar.h(str);
    }

    public boolean d(uo.c cVar, uo.f fVar) {
        ip.a.h(cVar, "Cookie");
        ip.a.h(fVar, "Cookie origin");
        return e(fVar.b(), cVar.w());
    }

    @Override // uo.d
    public void a(uo.c cVar, uo.f fVar) {
    }
}
