package com.bytedance.sdk.openadsdk.core.ojm;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.gm;
import com.bytedance.sdk.openadsdk.utils.ua;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class mjg {
    /* JADX INFO: Access modifiers changed from: private */
    public static void gjv(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            if (!TextUtils.isEmpty(strOptString)) {
                String strHnj = com.bytedance.sdk.openadsdk.core.bug.gjv.hnj(strOptString, str);
                File fileHnj = hnj(strHnj);
                if (fileHnj != null && fileHnj.exists() && fileHnj.length() > 0) {
                    return;
                } else {
                    qor(strHnj);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void qor(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            if (!TextUtils.isEmpty(strOptString)) {
                String strHnj = com.bytedance.sdk.openadsdk.core.bug.gjv.hnj(strOptString, str);
                File fileHnj = hnj(strHnj);
                if (fileHnj != null && fileHnj.exists() && fileHnj.length() > 0) {
                    return;
                } else {
                    qor(strHnj);
                }
            }
        }
    }

    public static boolean hn(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        gm gmVarVk;
        return (asVar == null || (gmVarVk = asVar.vk()) == null || gmVarVk.dkl() == null) ? false : true;
    }

    public static void hnj(final com.bytedance.sdk.openadsdk.core.model.as asVar) {
        ua.qor((Runnable) new com.bytedance.sdk.component.aq.hn.qor("preloadStaticRes") { // from class: com.bytedance.sdk.openadsdk.core.ojm.mjg.1
            @Override // java.lang.Runnable
            public void run() {
                gm gmVarVk;
                gm.hnj hnjVarDkl;
                com.bytedance.sdk.openadsdk.core.model.as asVar2 = asVar;
                if (asVar2 == null || (gmVarVk = asVar2.vk()) == null || (hnjVarDkl = gmVarVk.dkl()) == null) {
                    return;
                }
                String strApu = com.bytedance.sdk.openadsdk.core.settings.dnm.hn().apu();
                mjg.hnj(asVar, hnjVarDkl.hnj(), strApu);
                mjg.qor(hnjVarDkl.hn(), strApu);
                mjg.gjv(hnjVarDkl.qor(), strApu);
            }
        });
    }

    public static void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            if (!TextUtils.isEmpty(strOptString)) {
                String strHnj = com.bytedance.sdk.openadsdk.core.bug.gjv.hnj(strOptString, str);
                String strHnj2 = com.bytedance.sdk.component.utils.sk.hnj(strHnj);
                InputStream inputStreamHnj = com.bytedance.sdk.openadsdk.ta.gjv.hnj(strHnj, strHnj2);
                if (inputStreamHnj != null) {
                    try {
                        inputStreamHnj.close();
                    } catch (IOException unused) {
                    }
                } else {
                    com.bytedance.sdk.openadsdk.ta.gjv.hnj(strHnj).qor(1).hnj(strHnj2).hnj(new com.bytedance.sdk.openadsdk.ta.hn(asVar, strHnj, new com.bytedance.sdk.component.sk.jip() { // from class: com.bytedance.sdk.openadsdk.core.ojm.mjg.2
                        @Override // com.bytedance.sdk.component.sk.jip
                        public void hnj(int i11, String str2, Throwable th2) {
                        }

                        @Override // com.bytedance.sdk.component.sk.jip
                        public void hnj(com.bytedance.sdk.component.sk.dnm dnmVar) {
                            dnmVar.hnj();
                        }
                    }), 4);
                }
            }
        }
    }

    public static InputStream hn(String str) {
        File fileHnj = hnj(str);
        if (fileHnj == null || !fileHnj.exists() || fileHnj.length() <= 0) {
            return null;
        }
        try {
            return new FileInputStream(fileHnj);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("ExpressStaticResPreload", th2.getMessage());
            return null;
        }
    }

    private static void qor(String str) {
        File fileHnj = hnj(str);
        if (fileHnj == null) {
            return;
        }
        File file = new File(fileHnj + ".tmp");
        com.bytedance.sdk.component.dse.hn.hnj hnjVarGjv = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().gjv();
        hnjVarGjv.hnj(8);
        hnjVarGjv.hn("preloadStaticRes");
        hnjVarGjv.qor(str);
        hnjVarGjv.hnj(fileHnj.getParent(), fileHnj.getName());
        com.bytedance.sdk.component.dse.hn hnVarHnj = hnjVarGjv.hnj();
        if (hnVarHnj != null && hnVarHnj.dkl() && hnVarHnj.sk() != null && hnVarHnj.sk().exists()) {
            com.bytedance.sdk.component.utils.apu.hnj("ExpressStaticResPreload", "downloadFile: success url=".concat(String.valueOf(str)));
            return;
        }
        if (fileHnj.exists()) {
            try {
                fileHnj.delete();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.qor("ExpressStaticResPreload", th2.getMessage());
            }
        }
        if (file.exists()) {
            try {
                file.delete();
            } catch (Throwable th3) {
                com.bytedance.sdk.component.utils.apu.qor("ExpressStaticResPreload", th3.getMessage());
            }
        }
    }

    public static File hnj(String str) {
        String strHnj = com.bytedance.sdk.component.utils.sk.hnj(str);
        if (strHnj == null) {
            return null;
        }
        return new File(com.bytedance.sdk.component.utils.dse.hn(com.bytedance.sdk.openadsdk.core.oj.hnj(), new File(CacheDirFactory.getRootDir()).getName() + "/express_static_res"), strHnj);
    }
}
