package com.bytedance.sdk.openadsdk.core.bug.hnj;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private static volatile hn hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj(int i10, String str, String str2);

        void hnj(JSONObject jSONObject, String str);
    }

    private void hn(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.bug.hnj.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.bug.hnj.hnj();
        hnjVar.qor(str).sk(str3).gjv(str4).hn(str2).hnj(str5).hnj(Long.valueOf(System.currentTimeMillis()));
        qor.hnj().hnj(hnjVar);
        hn();
    }

    public static hn hnj() {
        if (hnj == null) {
            synchronized (hn.class) {
                try {
                    if (hnj == null) {
                        hnj = new hn();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.bug.aq.hnj hnjVar, String str) {
        if (hnjVar == null || TextUtils.isEmpty(hnjVar.hnj())) {
            return;
        }
        final String str2 = str + "_" + hnjVar.hnj();
        final String strQor = hnjVar.qor();
        final String strHn = hnjVar.hn();
        final String strGjv = hnjVar.gjv();
        String strSk = hnjVar.sk();
        if (TextUtils.isEmpty(strSk)) {
            if (str.equals("ad")) {
                strSk = ta.hn().gjv();
            } else if (str.equals("adv3")) {
                strSk = ta.hn().gjv() + "_v3";
            }
        }
        final String str3 = strSk;
        ua.hnj(new com.bytedance.sdk.component.aq.hn.qor("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.bug.hnj.hn.1
            @Override // java.lang.Runnable
            public void run() {
                hn.this.hnj(str2, strQor, strHn, strGjv, str3);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn() {
        int iSk = oj.gjv().sk();
        if (iSk <= 0) {
            iSk = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.bug.hnj.hnj> listHn = qor.hnj().hn();
        if (listHn == null || listHn.isEmpty() || iSk >= listHn.size()) {
            if (listHn == null) {
                return;
            }
            listHn.size();
            return;
        }
        int size = (int) (listHn.size() - (iSk * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.bug.hnj.hnj hnjVar : listHn) {
            treeMap.put(hnjVar.gjv(), hnjVar);
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i10 < size) {
                i10++;
                com.bytedance.sdk.openadsdk.core.bug.hnj.hnj hnjVar2 = (com.bytedance.sdk.openadsdk.core.bug.hnj.hnj) entry.getValue();
                if (hnjVar2 != null) {
                    hashSet.add(hnjVar2.hnj());
                }
            }
        }
        hnj(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(String str, String str2, String str3, String str4, String str5) {
        if (hnj(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            hn(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            hnj(str2, str, str3, str5, (hnj) null);
        } else {
            hn(str2, str3, str5, str4, str);
        }
    }

    public void hnj(String str, String str2, String str3, String str4, String str5, final hnj hnjVar) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (hnjVar != null) {
                hnjVar.hnj(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String str6 = str + "_" + str3;
        com.bytedance.sdk.openadsdk.core.bug.hnj.hnj hnjVarHnj = hnj(str6, str4);
        if (hnjVarHnj != null && !TextUtils.isEmpty(hnjVarHnj.sk())) {
            hnj(hnjVarHnj);
            if (hnjVar != null) {
                try {
                    hnjVar.hnj(new JSONObject(hnjVarHnj.sk()), ImagesContract.LOCAL);
                    return;
                } catch (JSONException unused) {
                    hnjVar.hnj(2, "parse json exception data is " + hnjVarHnj.sk(), ImagesContract.LOCAL);
                    return;
                }
            }
            return;
        }
        hnj(str2, str6, str4, str5, new hnj() { // from class: com.bytedance.sdk.openadsdk.core.bug.hnj.hn.2
            @Override // com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj
            public void hnj(JSONObject jSONObject, String str7) {
                hnj hnjVar2 = hnjVar;
                if (hnjVar2 != null) {
                    hnjVar2.hnj(jSONObject, str7);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj
            public void hnj(int i10, String str7, String str8) {
                hnj hnjVar2 = hnjVar;
                if (hnjVar2 != null) {
                    hnjVar2.hnj(i10, str7, str8);
                }
            }
        });
    }

    private void hnj(final String str, final String str2, final String str3, final String str4, final hnj hnjVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (hnjVar != null) {
                hnjVar.hnj(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.dse.hn.hn hnVarQor = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().qor();
            hnVarQor.qor(str);
            hnVarQor.hnj(7);
            hnVarQor.hn("load_ug_t");
            hnVarQor.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.core.bug.hnj.hn.3
                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar) {
                    if (hnVar == null) {
                        return;
                    }
                    if (!hnVar.dkl()) {
                        hnj hnjVar2 = hnjVar;
                        if (hnjVar2 != null) {
                            hnjVar2.hnj(3, "net code error code is " + hnVar.hnj() + " message is " + hnVar.hn(), "net");
                            return;
                        }
                        return;
                    }
                    String strGjv = hnVar.gjv();
                    if (TextUtils.isEmpty(strGjv)) {
                        hnj hnjVar3 = hnjVar;
                        if (hnjVar3 != null) {
                            hnjVar3.hnj(3, "net data is null", "net");
                            return;
                        }
                        return;
                    }
                    qor.hnj().hnj(new com.bytedance.sdk.openadsdk.core.bug.hnj.hnj().hnj(str2).hn(str3).qor(str).sk(str4).gjv(strGjv).hnj(Long.valueOf(System.currentTimeMillis())));
                    hn.this.hn();
                    if (hnjVar != null) {
                        try {
                            hnjVar.hnj(new JSONObject(strGjv), "net");
                        } catch (JSONException unused) {
                            hnjVar.hnj(2, "parse json exception data is".concat(String.valueOf(strGjv)), "net");
                        }
                    }
                }

                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
                    hnj hnjVar2 = hnjVar;
                    if (hnjVar2 != null) {
                        hnjVar2.hnj(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.bug.hnj.hnj> hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return qor.hnj().hnj(str);
    }

    public String hnj(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.bug.hnj.hnj hnjVarHnj = hnj(str + "_" + str2, str3);
        if (hnjVarHnj == null) {
            return null;
        }
        hnj(hnjVarHnj);
        return hnjVarHnj.sk();
    }

    private com.bytedance.sdk.openadsdk.core.bug.hnj.hnj hnj(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return qor.hnj().hnj(str, str2);
    }

    private void hnj(final com.bytedance.sdk.openadsdk.core.bug.hnj.hnj hnjVar) {
        hnjVar.hnj(Long.valueOf(System.currentTimeMillis()));
        ua.hnj(new com.bytedance.sdk.component.aq.hn.qor("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.bug.hnj.hn.4
            @Override // java.lang.Runnable
            public void run() {
                qor.hnj().hnj(hnjVar);
            }
        }, 10);
    }

    public void hnj(Set<String> set) {
        try {
            qor.hnj().hnj(set);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
