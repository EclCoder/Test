package com.bytedance.sdk.component.adexpress.hnj.hn;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.gjv.ojm;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    static Object hnj = new Object();

    private static String dkl() {
        com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVarGjv = gjv();
        if (hnjVarGjv == null) {
            return null;
        }
        return hnjVarGjv.gjv();
    }

    private static File dse(String str) {
        List<Pair<String, String>> listHn;
        com.bytedance.sdk.component.adexpress.hnj.qor.hnj.hn hnVarSk = gjv().sk();
        if (hnVarSk != null && (listHn = hnVarSk.hn()) != null && listHn.size() > 0) {
            for (Pair<String, String> pair : listHn) {
                Object obj = pair.second;
                if (obj != null && ((String) obj).equals(str)) {
                    return new File(sk.aq(), (String) pair.first);
                }
            }
        }
        return null;
    }

    public static com.bytedance.sdk.component.adexpress.hnj.qor.hnj gjv() {
        return sk.hn().dkl();
    }

    public static void hn() {
        try {
            aq.gjv();
            File fileAq = sk.aq();
            if (fileAq == null || !fileAq.exists()) {
                return;
            }
            if (fileAq.getParentFile() != null) {
                com.bytedance.sdk.component.utils.dse.qor(fileAq.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.dse.qor(fileAq);
            }
        } catch (Throwable unused) {
        }
    }

    public static void hnj() {
        sk.hn();
    }

    public static String qor() {
        return dkl.qor();
    }

    public static boolean sk() {
        return sk.hn().sk();
    }

    public static String gjv(String str) {
        com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar;
        com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVarGjv = gjv();
        if (hnjVarGjv == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return dkl();
        }
        Map<String, com.bytedance.sdk.component.adexpress.hnj.qor.hnj> mapHnj = hnjVarGjv.hnj();
        if (mapHnj == null || mapHnj.size() <= 0 || (hnjVar = mapHnj.get(str)) == null) {
            return null;
        }
        return hnjVar.gjv();
    }

    public static com.bytedance.sdk.component.adexpress.hnj.qor.hn hnj(String str) {
        return dse.hnj().hnj(str);
    }

    public static com.bytedance.sdk.component.adexpress.hnj.qor.hn qor(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.hnj.qor.hn hnVarHnj = dse.hnj().hnj(str);
        if (hnVarHnj != null) {
            hnVarHnj.hnj(Long.valueOf(System.currentTimeMillis()));
            hnj(hnVarHnj);
        }
        return hnVarHnj;
    }

    private static boolean sk(String str) {
        com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVarGjv;
        List<com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj> listDkl;
        if (!sk() || (hnjVarGjv = gjv()) == null || (listDkl = hnjVarGjv.dkl()) == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj c0184hnj : listDkl) {
            if (c0184hnj != null && TextUtils.equals(str, c0184hnj.hnj())) {
                return true;
            }
        }
        return false;
    }

    private static File dkl(String str) {
        if (sk()) {
            for (com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj c0184hnj : gjv().dkl()) {
                if (c0184hnj.hnj() != null && c0184hnj.hnj().equals(str)) {
                    File file = new File(sk.aq(), com.bytedance.sdk.component.utils.sk.hnj(c0184hnj.hnj()));
                    String strHnj = com.bytedance.sdk.component.utils.sk.hnj(file);
                    if (c0184hnj.hn() == null || !c0184hnj.hn().equals(strHnj)) {
                        break;
                    }
                    return file;
                }
            }
        }
        return null;
    }

    public static void hnj(com.bytedance.sdk.component.adexpress.hnj.qor.gjv gjvVar) {
        dse.hnj().hnj(gjvVar, gjvVar.dkl);
    }

    private static void hnj(final com.bytedance.sdk.component.adexpress.hnj.qor.hn hnVar) {
        com.bytedance.sdk.component.adexpress.gjv.gjv.hnj(new com.bytedance.sdk.component.aq.hn.qor("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.hnj.hn.hn.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (hn.hnj) {
                    dkl.hnj().hnj(hnVar, true);
                }
            }
        }, 10);
    }

    public static hnj hnj(String str, ojm.hnj hnjVar, String str2, String str3) {
        File fileDkl;
        hnj hnjVar2 = new hnj();
        if (TextUtils.isEmpty(str3)) {
            fileDkl = null;
        } else {
            fileDkl = hn(str3, str);
            if (fileDkl != null) {
                hnjVar2.hnj(1);
            }
        }
        if (fileDkl == null && (fileDkl = dse(str)) != null) {
            hnjVar2.hnj(3);
        }
        if (fileDkl == null && (fileDkl = dkl(str)) != null) {
            hnjVar2.hnj(2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!hnj(str, str3)) {
                hnjVar2.hnj(4);
            }
        } else if (!sk(str)) {
            hnjVar2.hnj(6);
        }
        hnjVar2.hn();
        if (fileDkl != null) {
            try {
                hnjVar2.hnj(new WebResourceResponse(hnjVar.hnj(), "utf-8", new FileInputStream(fileDkl)));
            } catch (Throwable unused) {
            }
        }
        return hnjVar2;
    }

    public static Set<String> hn(String str) {
        return dse.hnj().hn(str);
    }

    private static File hn(String str, String str2) {
        com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar;
        com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVarGjv = gjv();
        if (hnjVarGjv != null && sk()) {
            Map<String, com.bytedance.sdk.component.adexpress.hnj.qor.hnj> mapHnj = hnjVarGjv.hnj();
            if (mapHnj.size() != 0 && (hnjVar = mapHnj.get(str)) != null) {
                for (com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj c0184hnj : hnjVar.dkl()) {
                    if (c0184hnj.hnj() != null && c0184hnj.hnj().equals(str2)) {
                        File file = new File(sk.aq(), com.bytedance.sdk.component.utils.sk.hnj(c0184hnj.hnj()));
                        String strHnj = com.bytedance.sdk.component.utils.sk.hnj(file);
                        if (c0184hnj.hn() == null || !c0184hnj.hn().equals(strHnj)) {
                            break;
                        }
                        return file;
                    }
                }
            }
        }
        return null;
    }

    public static boolean hn(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    private static boolean hnj(String str, String str2) {
        com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVarGjv;
        com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar;
        if (!sk() || (hnjVarGjv = gjv()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.hnj.qor.hnj> mapHnj = hnjVarGjv.hnj();
        if (mapHnj.size() == 0 || (hnjVar = mapHnj.get(str2)) == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj c0184hnj : hnjVar.dkl()) {
            if (c0184hnj != null && TextUtils.equals(str, c0184hnj.hnj())) {
                return true;
            }
        }
        return false;
    }

    public static boolean hnj(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }
}
