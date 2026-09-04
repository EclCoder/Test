package com.bytedance.sdk.openadsdk.core.orl.hn;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.tgn;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.orp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private boolean dkl;
    private final boolean gjv;
    private final String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private EnumC0230qor f14113sk;
    private static final Map<String, hn> hnj = new ConcurrentHashMap();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final AtomicBoolean f14112hn = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hn {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        String f14118hn;
        final as hnj;
        float qor;

        public hn(String str, as asVar) {
            this(str, asVar, -1.0f);
        }

        public String toString() {
            return super.toString();
        }

        public hn(String str, as asVar, float f10) {
            this.f14118hn = str;
            this.hnj = asVar;
            this.qor = f10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        private final String hnj;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private EnumC0230qor f14119hn = EnumC0230qor.TRACKING_URL;
        private boolean qor = false;

        public hnj(String str) {
            this.hnj = str;
        }

        public hnj hnj(boolean z10) {
            this.qor = z10;
            return this;
        }

        public qor hnj() {
            return new qor(this.hnj, this.f14119hn, Boolean.valueOf(this.qor));
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.orl.hn.qor$qor, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    enum EnumC0230qor {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    static {
        tgn.hnj(new tgn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.orl.hn.qor.1
            @Override // com.bytedance.sdk.component.utils.tgn.hnj
            public void hnj(Context context, Intent intent, boolean z10, int i10) {
                if (i10 == 0 || qor.hnj.size() <= 0) {
                    return;
                }
                qor.dse();
            }
        }, oj.hnj());
    }

    protected qor(String str, EnumC0230qor enumC0230qor, Boolean bool) {
        this.qor = str;
        this.f14113sk = enumC0230qor;
        this.gjv = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dse() {
        if (f14112hn.compareAndSet(false, true)) {
            Map<String, hn> map = hnj;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    hnj((String) entry.getKey(), (hn) entry.getValue(), true);
                }
            }
            f14112hn.set(false);
        }
    }

    public static void hn(as asVar, List<qor> list, com.bytedance.sdk.openadsdk.core.orl.hnj.hnj hnjVar, long j10, String str, String str2) {
        hnj(asVar, list, hnjVar, j10, str, null, str2);
    }

    public static List<com.bytedance.sdk.openadsdk.core.orl.hn.hnj> qor(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.orl.hn.hnj.C0229hnj(jSONObjectOptJSONObject.optString("content"), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).hnj());
                }
            }
        }
        return arrayList;
    }

    public boolean gjv() {
        return this.dkl;
    }

    public void l_() {
        this.dkl = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hn(final boolean z10, final String str, final String str2, final hn hnVar, final String str3, final boolean z11) {
        as asVar;
        if (hnVar == null || (asVar = hnVar.hnj) == null) {
            return;
        }
        final boolean zQs = asVar.qs();
        final String str4 = zQs ? "dsp_track_link_result" : "track_link_result";
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(new com.bytedance.sdk.component.aq.hn.qor(str4) { // from class: com.bytedance.sdk.openadsdk.core.orl.hn.qor.3
            @Override // java.lang.Runnable
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", hnVar.f14118hn);
                    jSONObject.put("success", z10);
                    jSONObject.put("url", str3);
                    if (zQs) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("description", str);
                        }
                        float f10 = hnVar.qor;
                        if (f10 >= 0.0f) {
                            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, ((double) Math.round(f10 * 100.0f)) / 100.0d);
                        }
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), hnVar.hnj, str2, str4, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.orl.hn.qor.3.1
                    @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                    public JSONObject hnj() {
                        if (!z11) {
                            return null;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("retry", true);
                            return jSONObject2;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                    public JSONObject qor() {
                        return jSONObject;
                    }
                });
            }
        });
    }

    public static List<String> hnj(as asVar, List<qor> list, com.bytedance.sdk.openadsdk.core.orl.hnj.hnj hnjVar, long j10, String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (qor qorVar : list) {
            if (qorVar != null && (!qorVar.gjv() || qorVar.qor())) {
                arrayList.add(qorVar.hn());
                qorVar.l_();
            }
        }
        return arrayList.isEmpty() ? arrayList : new com.bytedance.sdk.openadsdk.core.orl.qor.qor(arrayList, asVar).hnj(hnjVar).hnj(j10).hn(str).hnj(str2).hnj();
    }

    public static List<com.bytedance.sdk.openadsdk.core.orl.hn.hn> hn(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.orl.hn.hn.hnj(jSONObjectOptJSONObject.optString("content"), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", 0.0d)).hnj());
                }
            }
        }
        return arrayList;
    }

    public boolean qor() {
        return this.gjv;
    }

    public String hn() {
        return this.qor;
    }

    public static boolean hnj(as asVar, List<qor> list, com.bytedance.sdk.openadsdk.core.orl.hnj.hnj hnjVar, long j10, String str, hn hnVar, String str2) {
        List<String> listHnj = hnj(asVar, list, hnjVar, j10, str, str2);
        hnj(listHnj, hnVar);
        return !listHnj.isEmpty();
    }

    public static void hnj(List<String> list, hn hnVar) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (!TextUtils.isEmpty(str)) {
                hnj(str, hnVar, false);
            }
        }
    }

    private static void hnj(final String str, final hn hnVar, final boolean z10) {
        com.bytedance.sdk.component.dse.hn.hn hnVarQor = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().qor();
        if (hnVarQor == null) {
            return;
        }
        hnVarQor.hnj(true);
        hnVarQor.qor(str);
        hnVarQor.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.core.orl.hn.qor.2
            @Override // com.bytedance.sdk.component.dse.hnj.hnj
            public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar2) {
                String str2;
                boolean z11;
                hn hnVar3 = hnVar;
                if (hnVar3 == null || hnVar3.hnj == null) {
                    return;
                }
                String str3 = null;
                if (hnVar2 == null || !hnVar2.dkl()) {
                    if (hnVar2 != null) {
                        str3 = hnVar2.hnj() + ":" + hnVar2.hn();
                        if (!z10 && (hnVar2.hnj() <= 300 || hnVar2.hnj() >= 400)) {
                            qor.hnj.put(str, hnVar);
                        }
                    }
                    str2 = str3;
                    z11 = false;
                } else {
                    str2 = null;
                    z11 = true;
                }
                qor.hn(z11, str2, orp.qor(hnVar.hnj.iz()), hnVar, str, z10);
                if (!z11 || qor.hnj.isEmpty()) {
                    return;
                }
                qor.dse();
            }

            @Override // com.bytedance.sdk.component.dse.hnj.hnj
            public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
                as asVar;
                hn hnVar2 = hnVar;
                if (hnVar2 != null && (asVar = hnVar2.hnj) != null) {
                    qor.hn(false, iOException != null ? iOException.getMessage() : null, orp.qor(asVar.iz()), hnVar, str, z10);
                }
                if (z10 || hnVar == null) {
                    return;
                }
                qor.hnj.put(str, hnVar);
            }
        });
    }

    public static List<qor> hnj(JSONArray jSONArray) {
        return hnj(jSONArray, false);
    }

    public static List<qor> hnj(JSONArray jSONArray, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new hnj(strOptString).hnj(z10).hnj());
                }
            }
        }
        return arrayList;
    }
}
