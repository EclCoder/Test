package com.bytedance.sdk.openadsdk.wu.hnj;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.dse;
import com.bytedance.sdk.component.utils.jip;
import com.bytedance.sdk.component.utils.nyv;
import com.bytedance.sdk.openadsdk.as.sk;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private static volatile qor hnj;
    private String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f14798hn;
    private String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final Set<String> f14799sk = Collections.synchronizedSet(new HashSet());

    private String dkl() {
        if (TextUtils.isEmpty(this.gjv)) {
            String str = gjv() + File.separator + "pregames";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.gjv = str;
        }
        return this.gjv;
    }

    private String gjv() {
        if (TextUtils.isEmpty(this.f14798hn)) {
            try {
                File fileHnj = dse.hnj(oj.hnj(), oj.hnj().getCacheDir(), "playable");
                if (!fileHnj.exists()) {
                    fileHnj.mkdirs();
                }
                this.f14798hn = fileHnj.getAbsolutePath();
            } catch (Throwable th2) {
                apu.qor("PlayableResManager", "init root path error: ".concat(String.valueOf(th2)));
            }
        }
        return this.f14798hn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor() {
        ua.hnj(new com.bytedance.sdk.component.aq.hn.qor("pag_plb_res_check") { // from class: com.bytedance.sdk.openadsdk.wu.hnj.qor.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.wu.hn.hnj hnjVarHn = com.bytedance.sdk.openadsdk.wu.hn.hnj.hn(com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("pag_plb_config", "model", ""));
                if (hnjVarHn != null) {
                    qor.this.hnj(hnjVarHn, null, 0);
                }
            }
        });
    }

    private String sk() {
        if (TextUtils.isEmpty(this.qor)) {
            String str = gjv() + File.separator + "common";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.qor = str;
        }
        return this.qor;
    }

    public void hn() {
        if (!com.bytedance.sdk.openadsdk.core.settings.dse.hnj() || com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("pag_plb_config", "last_update_time", 0L);
        final String strHnj = sk.hnj("plb_res", "");
        long jHnj = sk.hnj("plb_res_fetch_interval", 3600000);
        if (jHnj <= 0 || jHnj > 259200000) {
            jHnj = 3600000;
        }
        if (jCurrentTimeMillis < jHnj || TextUtils.isEmpty(strHnj)) {
            return;
        }
        int iHnj = sk.hnj("plb_res_delay_fetch_time", 0);
        if (iHnj <= 0) {
            hn(strHnj);
        } else {
            fc.hn().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wu.hnj.qor.3
                @Override // java.lang.Runnable
                public void run() {
                    qor.this.hn(strHnj);
                }
            }, iHnj);
        }
    }

    private static String qor(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf == -1) {
            return "";
        }
        return "." + str.substring(iLastIndexOf + 1);
    }

    public static qor hnj() {
        if (hnj == null) {
            synchronized (qor.class) {
                try {
                    if (hnj == null) {
                        hnj = new qor();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(final String str) {
        ua.hnj(new com.bytedance.sdk.component.aq.hn.qor("pag_plb_update_config") { // from class: com.bytedance.sdk.openadsdk.wu.hnj.qor.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.dse.hn.hn hnVarQor = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().qor();
                try {
                    hnVarQor.qor(com.bytedance.sdk.openadsdk.ojm.gjv.hnj(hnVarQor, str));
                    com.bytedance.sdk.component.dse.hn hnVarHnj = hnVarQor.hnj();
                    if (hnVarHnj == null || !hnVarHnj.dkl()) {
                        return;
                    }
                    String strGjv = hnVarHnj.gjv();
                    com.bytedance.sdk.openadsdk.wu.hn.hnj hnjVarHn = com.bytedance.sdk.openadsdk.wu.hn.hnj.hn(strGjv);
                    com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("pag_plb_config", "last_update_time", Long.valueOf(System.currentTimeMillis()));
                    if (hnjVarHn != null) {
                        com.bytedance.sdk.openadsdk.wu.hn.hnj hnjVarHn2 = com.bytedance.sdk.openadsdk.wu.hn.hnj.hn(com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("pag_plb_config", "model", ""));
                        if (hnjVarHn2 != null && hnjVarHn.hnj().equals(hnjVarHn2.hnj())) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("pag_plb_config", "model", strGjv);
                        qor.this.hnj(hnjVarHn, hnjVarHn2, 1);
                    }
                } catch (Exception e10) {
                    apu.qor("PlayableResManager", e10.getMessage());
                }
            }
        });
    }

    public void hnj(Map<String, String> map) {
        File[] fileArrListFiles;
        if (com.bytedance.sdk.openadsdk.core.settings.dse.hnj()) {
            String strDkl = dkl();
            if (!TextUtils.isEmpty(strDkl)) {
                File file = new File(strDkl);
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null) {
                            try {
                                File fileHnj = com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj(file2);
                                if (fileHnj != null && fileHnj.exists()) {
                                    map.put(file2.getName(), fileHnj.getAbsolutePath());
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            int iHnj = sk.hnj("plb_res_delay_fetch_time", 0);
            if (iHnj <= 0) {
                qor();
            } else {
                fc.hn().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wu.hnj.qor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        qor.this.qor();
                    }
                }, iHnj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void hnj(com.bytedance.sdk.openadsdk.wu.hn.hnj hnjVar, com.bytedance.sdk.openadsdk.wu.hn.hnj hnjVar2, int i10) {
        List<com.bytedance.sdk.openadsdk.wu.hn.hnj.C0256hnj> listQor = null;
        hnj(hnjVar.hn(), hnjVar2 == null ? null : hnjVar2.hn(), 1, i10);
        List<com.bytedance.sdk.openadsdk.wu.hn.hnj.C0256hnj> listQor2 = hnjVar.qor();
        if (hnjVar2 != null) {
            listQor = hnjVar2.qor();
        }
        hnj(listQor2, listQor, 2, i10);
    }

    private void hnj(List<com.bytedance.sdk.openadsdk.wu.hn.hnj.C0256hnj> list, List<com.bytedance.sdk.openadsdk.wu.hn.hnj.C0256hnj> list2, int i10, int i11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String strSk = i10 == 1 ? sk() : dkl();
        for (com.bytedance.sdk.openadsdk.wu.hn.hnj.C0256hnj c0256hnj : list) {
            String strHnj = c0256hnj.hnj();
            String strHnj2 = jip.hnj(strHnj);
            if (!TextUtils.isEmpty(strHnj2)) {
                if (i10 == 1) {
                    strHnj2 = strHnj2 + qor(strHnj);
                }
                String str = strHnj2;
                File file = new File(strSk, str);
                boolean zExists = file.exists();
                if (i11 == 1) {
                    if (zExists && list2 != null && list2.contains(c0256hnj)) {
                        com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.qor(file);
                    } else {
                        int i12 = i10;
                        hnj(strHnj, strSk, str, i12, file, zExists);
                        i10 = i12;
                    }
                } else if (!zExists) {
                    int i13 = i10;
                    hnj(strHnj, strSk, str, i13, file, zExists);
                    i10 = i13;
                }
            }
        }
    }

    private void hnj(final String str, final String str2, final String str3, final int i10, final File file, final boolean z10) {
        String strConcat;
        if (this.f14799sk.contains(str)) {
            return;
        }
        if (i10 == 2) {
            strConcat = str3 + ".zip";
        } else {
            strConcat = z10 ? "tmp".concat(String.valueOf(str3)) : str3;
        }
        this.f14799sk.add(str);
        com.bytedance.sdk.component.dse.hn.hnj hnjVarGjv = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().gjv();
        hnjVarGjv.qor(str);
        hnjVarGjv.hnj(str2, strConcat);
        final com.bytedance.sdk.component.dse.hn hnVarHnj = hnjVarGjv.hnj();
        this.f14799sk.remove(str);
        if (hnVarHnj != null && hnVarHnj.dkl() && hnVarHnj.sk() != null && hnVarHnj.sk().exists()) {
            if (i10 == 2) {
                ua.qor((Runnable) new com.bytedance.sdk.component.aq.hn.qor("downloadZip") { // from class: com.bytedance.sdk.openadsdk.wu.hnj.qor.5
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (z10) {
                                file.delete();
                            }
                            String str4 = str2 + File.separator + str3;
                            nyv.hnj(hnVarHnj.sk().getAbsolutePath(), str4);
                            File file2 = new File(str4);
                            File fileHnj = com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj(file2);
                            if (fileHnj != null && fileHnj.exists()) {
                                com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj().qor().put(file2.getName(), fileHnj.getAbsolutePath());
                            }
                            com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hn(file2);
                        } catch (Throwable th2) {
                            apu.qor("PlayableResManager", "unzip error: ", th2, "tp=", Integer.valueOf(i10), ", url=", str);
                        }
                        try {
                            hnVarHnj.sk().delete();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            } else {
                if (z10) {
                    file.delete();
                    hnVarHnj.sk().renameTo(file);
                    return;
                }
                return;
            }
        }
        File file2 = new File(str2 + File.separator + str3 + ".tmp");
        if (file2.exists()) {
            try {
                file2.delete();
            } catch (Throwable unused) {
            }
        }
    }

    public WebResourceResponse hnj(String str) {
        if (!com.bytedance.sdk.openadsdk.core.settings.dse.hnj()) {
            return null;
        }
        String strHnj = jip.hnj(str);
        if (TextUtils.isEmpty(strHnj)) {
            return null;
        }
        File file = new File(sk(), strHnj + qor(str));
        if (file.exists()) {
            try {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    return null;
                }
                return new WebResourceResponse(mimeTypeFromExtension, C.UTF8_NAME, new FileInputStream(file));
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
