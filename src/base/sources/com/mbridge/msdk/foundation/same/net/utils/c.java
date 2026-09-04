package com.mbridge.msdk.foundation.same.net.utils;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, b> f30606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<Integer> f30607d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f30610c;

        public b(long j10, int i10, String str) {
            this.f30610c = j10;
            this.f30608a = i10;
            this.f30609b = str;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.utils.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0398c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f30611a = new c();
    }

    private List<Integer> a() {
        return Arrays.asList(-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616);
    }

    public static c b() {
        return C0398c.f30611a;
    }

    private c() {
        this.f30604a = "IDErrorUtil";
        this.f30606c = new ConcurrentHashMap<>();
        this.f30607d = new ArrayList<>();
        g gVarF = h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        gVarF = gVarF == null ? h.b().a() : gVarF;
        this.f30605b = gVarF.u() * 1000;
        if (gVarF.y() == null || gVarF.y().size() <= 0) {
            q0.b("IDErrorUtil", "Setting ercd is EMPTY and use default code list.");
            this.f30607d.addAll(a());
        } else {
            q0.b("IDErrorUtil", "Setting ercd not EMPTY will use setting.");
            this.f30607d.addAll(gVarF.y());
        }
    }

    public synchronized void a(String str, int i10, String str2, long j10) {
        if (this.f30606c.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f30607d.contains(Integer.valueOf(i10))) {
            q0.b("IDErrorUtil", "addErrorInfo : " + str + " " + str2);
            this.f30606c.put(str, new b(j10, i10, str2));
        }
    }

    public e a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar) {
        String str = eVar.a().get(MBridgeConstans.APP_ID);
        String str2 = eVar.a().get(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String str3 = TextUtils.isEmpty(str2) ? "" : str2;
        String strReplace = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (TextUtils.isEmpty(strReplace)) {
            strReplace = eVar.a().get("unit_ids");
            if (!TextUtils.isEmpty(strReplace)) {
                strReplace = strReplace.replace("[", "").replace("]", "");
            }
        }
        String str4 = strReplace;
        String str5 = eVar.a().get("ad_type");
        if (TextUtils.isEmpty(str5)) {
            str5 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        return a(str, str4, str3, eVar.a().get(BidResponsed.KEY_TOKEN), str5);
    }

    private e a(String str, String str2, String str3, String str4, String str5) {
        int i10;
        String str6 = str + "_" + str3 + "_" + str2 + "_" + str5;
        b bVarA = a(str6);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.mbridge.msdk.tracker.network.g("data_res_type", "1"));
        if (bVarA != null && !TextUtils.isEmpty(bVarA.f30609b)) {
            try {
                if (bVarA.f30608a != -1) {
                    return e.a(new JSONObject(bVarA.f30609b), new com.mbridge.msdk.foundation.same.net.toolbox.a(200, bVarA.f30609b.getBytes(), arrayList));
                }
                if (!TextUtils.isEmpty(str4)) {
                    return null;
                }
                if (str5 != null && !TextUtils.isEmpty(str5) && (i10 = Integer.parseInt(str5)) != 287 && i10 != 94) {
                    if (System.currentTimeMillis() < ((long) (h.b().c(str, str2).u() * 1000)) + bVarA.f30610c) {
                        return e.a(new JSONObject(bVarA.f30609b), new com.mbridge.msdk.foundation.same.net.toolbox.a(200, bVarA.f30609b.getBytes(), arrayList));
                    }
                    this.f30606c.remove(str6);
                    return null;
                }
            } catch (Exception e10) {
                q0.b("IDErrorUtil", e10.getMessage());
            }
        }
        q0.b("IDErrorUtil", "getErrorInfo RETURN NULL");
        return null;
    }

    private synchronized b a(String str) {
        b bVar;
        q0.b("IDErrorUtil", "getErrorInfo : " + str);
        if (!this.f30606c.containsKey(str) || (bVar = this.f30606c.get(str)) == null) {
            return null;
        }
        if (bVar.f30608a == -1) {
            return bVar;
        }
        if (System.currentTimeMillis() > bVar.f30610c + ((long) this.f30605b)) {
            this.f30606c.remove(str);
            if (this.f30606c.size() > 0) {
                for (Map.Entry<String, b> entry : this.f30606c.entrySet()) {
                    q0.b("IDErrorUtil", "getErrorInfo : delete timeout entry");
                    if (System.currentTimeMillis() - entry.getValue().f30610c > this.f30605b) {
                        this.f30606c.remove(entry.getKey());
                    }
                }
            }
            return null;
        }
        q0.b("IDErrorUtil", "getErrorInfo : " + bVar.f30609b);
        return bVar;
    }
}
