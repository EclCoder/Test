package com.bytedance.sdk.openadsdk.gjv.hnj;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.tgn;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl implements com.bytedance.sdk.component.dkl.hnj.hn.qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final hnj f14366hn = hnj.hnj();
    public as<com.bytedance.sdk.openadsdk.gjv.hnj> hnj;

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj>> gjv(List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list) {
        HashMap<String, List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj>> map = new HashMap<>();
        new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar = list.get(i10);
            JSONObject jSONObjectDkl = hnjVar.dkl();
            if (jSONObjectDkl != null) {
                String strOptString = jSONObjectDkl.optString("app_log_url");
                List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> arrayList = map.get(strOptString);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put(strOptString, arrayList);
                }
                arrayList.add(hnjVar);
            }
        }
        return map;
    }

    private boolean qor(List<com.bytedance.sdk.openadsdk.gjv.hnj> list) {
        JSONObject jSONObjectQor;
        if (list == null || list.size() == 0 || (jSONObjectQor = list.get(0).qor()) == null) {
            return true;
        }
        return TextUtils.isEmpty(jSONObjectQor.optString("app_log_url"));
    }

    public com.bytedance.sdk.openadsdk.gjv.sk hn(List<com.bytedance.sdk.openadsdk.jip.hn.gjv.hnj> list) {
        if (this.hnj == null) {
            this.hnj = oj.qor();
        }
        if (list != null && list.size() != 0 && com.bytedance.sdk.openadsdk.core.settings.dse.hnj()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator<com.bytedance.sdk.openadsdk.jip.hn.gjv.hnj> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().f14540hn);
                }
                jSONObject.put("stats_list", jSONArray);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = jCurrentTimeMillis / 1000;
                jSONObject.put(CampaignEx.JSON_KEY_ST_TS, j10);
                jSONObject.put("ts_ms", jCurrentTimeMillis);
                String strGjv = com.bytedance.sdk.openadsdk.core.ta.hn().gjv();
                if (strGjv == null) {
                    strGjv = "";
                }
                StringBuilder sb2 = new StringBuilder(tgn.hnj());
                sb2.append("-");
                sb2.append(jCurrentTimeMillis);
                jSONObject.put("req_sign", com.bytedance.sdk.component.utils.sk.hnj(strGjv + j10 + BuildConfig.VERSION_NAME));
                jSONObject.put("req_uniq", com.bytedance.sdk.component.utils.sk.hnj(sb2.toString()));
                return this.hnj.hn(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hn.qor
    public void hnj(final List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list, final com.bytedance.sdk.component.dkl.hnj.hn.hn hnVar) {
        com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar;
        if (list == null || list.isEmpty() || com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk() || (hnjVar = list.get(0)) == null) {
            return;
        }
        byte bGjv = hnjVar.gjv();
        final ArrayList arrayList = new ArrayList();
        if (bGjv == 0) {
            com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.gjv.hnj.dkl.1
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar2 = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar2.hn("applog");
                    return hnjVar2;
                }
            });
            ua.sk(new com.bytedance.sdk.component.aq.hn.qor("upload_ad_event", 7) { // from class: com.bytedance.sdk.openadsdk.gjv.hnj.dkl.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = dkl.this.gjv(list).entrySet().iterator();
                    } catch (Throwable th2) {
                        apu.qor("OverSeaEventUploadImp", th2.getMessage());
                        it = null;
                    }
                    Iterator it2 = it;
                    if (it2 == null) {
                        com.bytedance.sdk.component.dkl.hnj.hn.hn hnVar2 = hnVar;
                        if (hnVar2 != null) {
                            hnVar2.hnj(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it2.hasNext()) {
                        try {
                            List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list2 = (List) ((Map.Entry) it2.next()).getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar2 : list2) {
                                arrayList2.add(new com.bytedance.sdk.openadsdk.gjv.hnj(hnjVar2.qor(), hnjVar2.dkl()));
                            }
                            com.bytedance.sdk.openadsdk.gjv.sk skVarHnj = dkl.this.hnj(arrayList2);
                            if (hnVar != null && skVarHnj != null) {
                                boolean z10 = skVarHnj.gjv;
                                if (dkl.this.hnj(arrayList2, skVarHnj)) {
                                    z10 = true;
                                }
                                boolean z11 = z10;
                                arrayList.add(new com.bytedance.sdk.component.dkl.hnj.hn.hn.hnj(new com.bytedance.sdk.component.dkl.hnj.hn.hn.hn(skVarHnj.hnj, skVarHnj.f14455hn, skVarHnj.qor, z11, ""), list2));
                                if (skVarHnj.f14455hn == 200) {
                                    com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.gjv.hnj.dkl.2.1
                                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar3 = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                            hnjVar3.hn("applog");
                                            return hnjVar3;
                                        }
                                    });
                                } else if (z11) {
                                    com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.gjv.hnj.dkl.2.2
                                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar3 = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                            hnjVar3.hn("applog");
                                            return hnjVar3;
                                        }
                                    });
                                } else {
                                    com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.gjv.hnj.dkl.2.3
                                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar3 = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                            hnjVar3.hn("applog");
                                            return hnjVar3;
                                        }
                                    });
                                }
                            }
                            if (hnVar != null && skVarHnj == null) {
                                com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.gjv.hnj.dkl.2.4
                                    @Override // com.bytedance.sdk.openadsdk.oj.gjv
                                    public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                        com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar3 = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                        hnjVar3.hn("applog");
                                        return hnjVar3;
                                    }
                                });
                            }
                        } catch (Throwable th3) {
                            apu.qor("OverSeaEventUploadImp", th3.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.dkl.hnj.hn.hn hnVar3 = hnVar;
                    if (hnVar3 != null) {
                        hnVar3.hnj(arrayList);
                    }
                }
            });
            return;
        }
        if (bGjv == 1) {
            if (com.bytedance.sdk.openadsdk.jip.qor.hn()) {
                if (hnVar != null) {
                    arrayList.add(new com.bytedance.sdk.component.dkl.hnj.hn.hn.hnj(new com.bytedance.sdk.component.dkl.hnj.hn.hn.hn(true, 200, "", false, ""), list));
                    hnVar.hnj(arrayList);
                    return;
                }
                return;
            }
            final ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar2 : list) {
                arrayList2.add(new com.bytedance.sdk.openadsdk.jip.hn.gjv.hnj(hnjVar2.qor(), hnjVar2.dkl()));
            }
            if (arrayList2.size() > 0) {
                com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.gjv.hnj.dkl.3
                    @Override // com.bytedance.sdk.openadsdk.oj.gjv
                    public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                        com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar3 = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                        hnjVar3.hn("stats");
                        return hnjVar3;
                    }
                });
                ua.sk(new com.bytedance.sdk.component.aq.hn.qor("upload_stats_event", 6) { // from class: com.bytedance.sdk.openadsdk.gjv.hnj.dkl.4
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.gjv.sk skVarHn = dkl.this.hn(arrayList2);
                        if (hnVar != null && skVarHn != null) {
                            arrayList.add(new com.bytedance.sdk.component.dkl.hnj.hn.hn.hnj(new com.bytedance.sdk.component.dkl.hnj.hn.hn.hn(skVarHn.hnj, skVarHn.f14455hn, skVarHn.qor, skVarHn.gjv, ""), list));
                            hnVar.hnj(arrayList);
                            if (skVarHn.f14455hn == 200) {
                                com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.gjv.hnj.dkl.4.1
                                    @Override // com.bytedance.sdk.openadsdk.oj.gjv
                                    public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                        com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar3 = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                        hnjVar3.hn("stats");
                                        return hnjVar3;
                                    }
                                });
                            } else if (skVarHn.gjv) {
                                com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.gjv.hnj.dkl.4.2
                                    @Override // com.bytedance.sdk.openadsdk.oj.gjv
                                    public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                        com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar3 = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                        hnjVar3.hn("stats");
                                        return hnjVar3;
                                    }
                                });
                            } else {
                                com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.gjv.hnj.dkl.4.3
                                    @Override // com.bytedance.sdk.openadsdk.oj.gjv
                                    public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                        com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar3 = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                        hnjVar3.hn("stats");
                                        return hnjVar3;
                                    }
                                });
                            }
                        }
                        if (hnVar == null || skVarHn != null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.gjv.hnj.dkl.4.4
                            @Override // com.bytedance.sdk.openadsdk.oj.gjv
                            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar3 = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                hnjVar3.hn("stats");
                                return hnjVar3;
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hnj(List<com.bytedance.sdk.openadsdk.gjv.hnj> list, com.bytedance.sdk.openadsdk.gjv.sk skVar) {
        int i10;
        return !qor(list) && (i10 = skVar.f14455hn) >= 400 && i10 < 500;
    }

    public com.bytedance.sdk.openadsdk.gjv.sk hnj(List<com.bytedance.sdk.openadsdk.gjv.hnj> list) {
        if (this.hnj == null) {
            this.hnj = oj.qor();
        }
        if (this.hnj == null) {
            return null;
        }
        return this.hnj.hnj(this.f14366hn.hnj(this.f14366hn.qor(list), System.currentTimeMillis(), this.f14366hn.hn()), this.f14366hn.hnj(list), this.f14366hn.hn(list));
    }
}
