package com.bytedance.sdk.component.adexpress.hnj.hn;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse {
    private static volatile dse hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private AtomicBoolean f12714hn = new AtomicBoolean(false);

    private dse() {
    }

    private JSONObject qor(String str) {
        com.bytedance.sdk.component.adexpress.hnj.hnj.qor qorVarQor = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor();
        if (qorVarQor == null) {
            return null;
        }
        com.bytedance.sdk.component.dse.hn.hn hnVarDse = qorVarQor.dse();
        hnVarDse.qor(str);
        com.bytedance.sdk.component.dse.hn hnVarHnj = hnVarDse.hnj();
        if (hnVarHnj != null) {
            try {
                if (hnVarHnj.dkl() && hnVarHnj.gjv() != null) {
                    return new JSONObject(hnVarHnj.gjv());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Set<String> hn(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return dkl.hnj().hn(str);
    }

    public static dse hnj() {
        if (hnj == null) {
            synchronized (dse.class) {
                try {
                    if (hnj == null) {
                        hnj = new dse();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    private void hn() {
        if (com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor() == null) {
            return;
        }
        int iHnj = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().hnj();
        if (iHnj <= 0) {
            iHnj = 100;
        }
        List<com.bytedance.sdk.component.adexpress.hnj.qor.hn> listHn = dkl.hnj().hn();
        if (listHn == null || listHn.isEmpty() || iHnj >= listHn.size()) {
            if (listHn == null) {
                return;
            }
            listHn.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.hnj.qor.hn hnVar : listHn) {
            treeMap.put(hnVar.dse(), hnVar);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (listHn.size() - (iHnj * 0.75f));
        int i10 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i10 < size) {
                i10++;
                ((Long) entry.getKey()).getClass();
                com.bytedance.sdk.component.adexpress.hnj.qor.hn hnVar2 = (com.bytedance.sdk.component.adexpress.hnj.qor.hn) entry.getValue();
                if (hnVar2 != null) {
                    hashSet.add(hnVar2.hn());
                }
            }
        }
        hnj(hashSet);
        this.f12714hn.set(false);
    }

    public com.bytedance.sdk.component.adexpress.hnj.qor.hn hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return dkl.hnj().hnj(str);
    }

    public void hnj(com.bytedance.sdk.component.adexpress.hnj.qor.gjv gjvVar, String str) {
        String strAq;
        if (gjvVar == null) {
            return;
        }
        final String str2 = gjvVar.hnj;
        final String str3 = gjvVar.qor;
        final String str4 = gjvVar.f12722hn;
        final String str5 = gjvVar.gjv;
        final String str6 = gjvVar.f12723sk;
        if (com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor() != null) {
            strAq = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().aq();
        } else {
            strAq = "";
        }
        final String str7 = TextUtils.isEmpty(str) ? strAq : str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.gjv.gjv.hnj(new com.bytedance.sdk.component.aq.hn.qor("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.hnj.hn.dse.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                dse.this.hnj(str2, str3, str4, str5, str6, str7);
            }
        }, 10);
    }

    private void hn(String str, String str2, String str3, String str4, String str5, String str6) {
        dkl.hnj().hnj(new com.bytedance.sdk.component.adexpress.hnj.qor.hn().hnj(str).hn(str2).qor(str3).gjv(str4).sk(str5).dkl(str6).hnj(Long.valueOf(System.currentTimeMillis())), false);
        hn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void hnj(String str, String str2, String str3, String str4, String str5, String str6) throws Throwable {
        String str7;
        try {
            try {
                if (hnj(str) != null) {
                    if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                        return;
                    }
                    str7 = str5;
                    hn(str6, str, str3, str2, str4, str7);
                } else {
                    str7 = str5;
                    if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                        hnj(str2, str6, str);
                    } else {
                        hn(str6, str, str3, str2, str4, str7);
                    }
                }
                boolean zHnj = aq.hnj(str7);
                if (!hn.sk() || zHnj) {
                    sk.hn().hnj(true);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    private void hnj(String str, String str2, String str3) {
        JSONObject jSONObjectQor;
        if (TextUtils.isEmpty(str) || (jSONObjectQor = qor(str)) == null) {
            return;
        }
        String strOptString = jSONObjectQor.optString("md5");
        String strOptString2 = jSONObjectQor.optString("version");
        String strOptString3 = jSONObjectQor.optString(DataSchemeDataSource.SCHEME_DATA);
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.hnj.qor.hn hnVarHnj = new com.bytedance.sdk.component.adexpress.hnj.qor.hn().hnj(str2).hn(str3).qor(strOptString).gjv(str).sk(strOptString3).dkl(strOptString2).hnj(Long.valueOf(System.currentTimeMillis()));
        dkl.hnj().hnj(hnVarHnj, false);
        hn();
        if (aq.hnj(strOptString2)) {
            hnVarHnj.dkl(strOptString2);
            sk.hn().hnj(true);
        }
    }

    public void hnj(Set<String> set) {
        try {
            dkl.hnj().hnj(set);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
