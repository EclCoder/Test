package com.bytedance.sdk.openadsdk.core.mjg.qor;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.dse;
import com.bytedance.sdk.component.utils.nyv;
import com.bytedance.sdk.openadsdk.as.sk;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.bytedance.sdk.openadsdk.wu.hnj.gjv;
import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hnj {
    private static volatile hnj hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f13845hn;
    private final Map<as, hn> qor = new ConcurrentHashMap();
    private final Map<String, JSONObject> gjv = new ConcurrentHashMap();

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final AtomicBoolean f13846sk = new AtomicBoolean(false);
    private final Set<String> dkl = Collections.synchronizedSet(new HashSet());
    private final ConcurrentHashMap<String, com.bytedance.sdk.component.dse.hn.hnj> dse = new ConcurrentHashMap<>();
    private final Map<String, String> aq = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class hn {
        long gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        long f13851hn;
        long hnj;
        long qor;

        private hn() {
        }

        public hn gjv(long j10) {
            this.gjv = j10;
            return this;
        }

        public long hn() {
            return this.gjv - this.qor;
        }

        public long hnj() {
            return this.f13851hn - this.hnj;
        }

        public hn qor(long j10) {
            this.qor = j10;
            return this;
        }

        public hn hn(long j10) {
            this.f13851hn = j10;
            return this;
        }

        public hn hnj(long j10) {
            this.hnj = j10;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mjg.qor.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public interface InterfaceC0224hnj {
        void hnj(boolean z10);
    }

    private hnj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File gjv(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return sk(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    public static void qor(File file) {
        try {
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (Throwable unused) {
        }
    }

    private boolean sk(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    public void hn() {
        if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk() || this.f13846sk.get()) {
            return;
        }
        ua.hnj(new com.bytedance.sdk.component.aq.hn.qor("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.1
            @Override // java.lang.Runnable
            public void run() {
                File[] fileArrListFiles;
                try {
                    String strGjv = hnj.this.gjv();
                    if (!TextUtils.isEmpty(strGjv)) {
                        File file = new File(strGjv);
                        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    try {
                                        File fileHnj = hnj.hnj(file2);
                                        if (fileHnj != null && fileHnj.exists()) {
                                            hnj.this.aq.put(file2.getName(), fileHnj.getAbsolutePath());
                                        }
                                        hnj.this.hnj(hnj.this.gjv(fileHnj), true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                com.bytedance.sdk.openadsdk.wu.hnj.qor.hnj().hnj(hnj.this.aq);
                hnj.this.f13846sk.set(true);
            }
        });
    }

    private String sk() {
        if (TextUtils.isEmpty(this.f13845hn)) {
            try {
                File fileHnj = dse.hnj(oj.hnj(), oj.hnj().getCacheDir(), "playable");
                if (!fileHnj.exists()) {
                    fileHnj.mkdirs();
                }
                this.f13845hn = fileHnj.getAbsolutePath();
            } catch (Throwable th2) {
                apu.qor("PlayableCache", "init root path error: ".concat(String.valueOf(th2)));
            }
        }
        return this.f13845hn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String gjv() {
        File file = new File(sk(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static void hn(File file) {
        qor(file);
        try {
            ta.hn().orl().hnj(file);
        } catch (Throwable unused) {
        }
    }

    public static hnj hnj() {
        if (hnj == null) {
            synchronized (hnj.class) {
                try {
                    if (hnj == null) {
                        hnj = new hnj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public void hn(as asVar) {
        if (asVar == null || asVar.pwt() == null || TextUtils.isEmpty(asVar.pwt().C()) || !sk.hnj("can_cancel_playable", false)) {
            return;
        }
        com.bytedance.sdk.component.dse.hn.hnj hnjVar = this.dse.get(asVar.pwt().C());
        if (hnjVar != null) {
            hnjVar.hn();
        }
    }

    public Map<String, String> qor() {
        return this.aq;
    }

    public boolean hnj(as asVar) {
        if (this.f13846sk.get() && asVar != null && asVar.pwt() != null && asVar.pwt().C() != null) {
            try {
                if (!TextUtils.isEmpty(this.aq.get(com.bytedance.sdk.component.utils.sk.hnj(asVar.pwt().C())))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject hnj(File file, boolean z10) {
        byte[] bArrGjv;
        String strHn;
        try {
            if (!sk(file) || (bArrGjv = dse.gjv(file)) == null || bArrGjv.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                strHn = com.bytedance.sdk.component.utils.hnj.qor(new String(bArrGjv));
            } else {
                strHn = com.bytedance.sdk.component.gjv.hnj.hn(new String(bArrGjv), com.bytedance.sdk.openadsdk.core.hnj.hn());
            }
            if (TextUtils.isEmpty(strHn)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strHn);
            if (z10 && jSONObject.length() > 0) {
                this.gjv.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public WebResourceResponse hnj(String str, String str2, String str3) {
        String mimeTypeFromExtension;
        File fileHnj;
        try {
            WebResourceResponse webResourceResponseHnj = com.bytedance.sdk.openadsdk.wu.hnj.qor.hnj().hnj(str3);
            if (webResourceResponseHnj != null) {
                return webResourceResponseHnj;
            }
            if (this.f13846sk.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                try {
                    if ((str3.startsWith("http://") || str3.startsWith("https://")) && str3.contains("?")) {
                        str3 = str3.split("\\?")[0];
                        if (str3.endsWith("/")) {
                            str3 = str3.substring(0, str3.length() - 1);
                        }
                    }
                    mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str3));
                } catch (Throwable unused) {
                    mimeTypeFromExtension = null;
                }
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    return null;
                }
                String strHnj = com.bytedance.sdk.component.utils.sk.hnj(str);
                if (TextUtils.isEmpty(strHnj)) {
                    return null;
                }
                String str4 = this.aq.get(strHnj);
                if (!TextUtils.isEmpty(str4)) {
                    fileHnj = new File(str4);
                } else {
                    fileHnj = hnj(new File(gjv(), strHnj));
                    if (fileHnj != null && fileHnj.exists()) {
                        this.aq.put(strHnj, fileHnj.getAbsolutePath());
                    }
                }
                if (fileHnj != null && fileHnj.exists()) {
                    String strHnj2 = hnj(str2);
                    if (TextUtils.isEmpty(strHnj2)) {
                        return null;
                    }
                    String strReplace = str3.replace(strHnj2, "");
                    if (!TextUtils.isEmpty(strReplace) && !strReplace.startsWith("https://") && !strReplace.startsWith("http://")) {
                        File file = new File(fileHnj, strReplace);
                        if (file.exists() && hnj(strHnj, strReplace, file) && file.getCanonicalPath().startsWith(fileHnj.getCanonicalPath())) {
                            return new WebResourceResponse(mimeTypeFromExtension, "utf-8", new FileInputStream(file));
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            apu.hnj("PlayableCache", "playable intercept error: ", th2);
        }
        return null;
    }

    public static File hnj(File file) {
        File[] fileArrListFiles;
        if (file != null && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (file2 != null && file2.isFile() && "index.html".equals(file2.getName())) {
                    return file;
                }
            }
            for (File file3 : fileArrListFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return hnj(file3);
                }
            }
        }
        return null;
    }

    private String hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("\\?");
        if (strArrSplit != null && strArrSplit.length == 2) {
            String str2 = strArrSplit[0];
            if (str2 != null && str2.endsWith("/")) {
                str = str.substring(0, strArrSplit.length - 1);
            }
            String str3 = strArrSplit[0];
            if (str3 != null && str3.endsWith("index.html")) {
                str = strArrSplit[0];
            }
        }
        return str.replace("index.html", "");
    }

    private boolean hnj(String str, String str2, File file) {
        if (file != null && file.exists()) {
            JSONObject jSONObject = this.gjv.get(str);
            if (jSONObject == null) {
                return true;
            }
            String strOptString = jSONObject.optString(str2);
            if (strOptString != null && strOptString.equalsIgnoreCase(com.bytedance.sdk.component.utils.sk.hnj(file))) {
                return true;
            }
        }
        return false;
    }

    public void hnj(final as asVar, final InterfaceC0224hnj interfaceC0224hnj) {
        File file;
        if (gjv.hnj().hn() && asVar != null && hqh.dkl(asVar) && asVar.aip() != null && !TextUtils.isEmpty(asVar.aip().getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.mjg.qor.hn.hnj(asVar, -705, trPLwhKZgZ.iHyKCujZu);
            hnj(interfaceC0224hnj, false);
            return;
        }
        if (asVar != null && asVar.pwt() != null && !TextUtils.isEmpty(asVar.pwt().C())) {
            final String strC = asVar.pwt().C();
            if (this.dkl.contains(strC)) {
                return;
            }
            this.qor.put(asVar, new hn().hnj(System.currentTimeMillis()));
            com.bytedance.sdk.openadsdk.core.mjg.qor.hn.hnj(asVar);
            String strHnj = com.bytedance.sdk.component.utils.sk.hnj(strC);
            final File file2 = new File(gjv(), strHnj);
            String str = this.aq.get(strHnj);
            if (TextUtils.isEmpty(str)) {
                file = hnj(file2);
                if (file != null && file.exists()) {
                    this.aq.put(strHnj, file.getAbsolutePath());
                }
            } else {
                file = new File(str);
            }
            if (file != null && file.exists()) {
                com.bytedance.sdk.openadsdk.core.mjg.qor.hn.hnj(asVar, -702, (String) null);
                qor(file2);
                this.qor.remove(asVar);
                hnj(interfaceC0224hnj, true);
                return;
            }
            try {
                dse.qor(file2);
            } catch (Throwable unused) {
            }
            this.dkl.add(strC);
            File file3 = new File(sk(), strHnj + ".zip");
            com.bytedance.sdk.component.dse.hn.hnj hnjVarGjv = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().gjv();
            this.dse.put(strC, hnjVarGjv);
            hnjVarGjv.qor(strC);
            hnjVarGjv.hnj(file3.getParent(), file3.getName());
            hnjVarGjv.hnj(7);
            hnjVarGjv.hn("playable_download");
            hnjVarGjv.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.2
                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, final com.bytedance.sdk.component.dse.hn hnVar) {
                    hnj.this.dkl.remove(strC);
                    hnj.this.dse.remove(strC);
                    final hn hnVar2 = (hn) hnj.this.qor.remove(asVar);
                    if (hnVar2 != null) {
                        hnVar2.hn(System.currentTimeMillis());
                    }
                    if (hnVar.dkl() && hnVar.sk() != null && hnVar.sk().exists()) {
                        ua.qor((Runnable) new com.bytedance.sdk.component.aq.hn.qor("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean z10;
                                long jHnj;
                                long jHn;
                                try {
                                    hn hnVar3 = hnVar2;
                                    if (hnVar3 != null) {
                                        hnVar3.qor(System.currentTimeMillis());
                                    }
                                    nyv.hnj(hnVar.sk().getAbsolutePath(), file2.getAbsolutePath());
                                    hn hnVar4 = hnVar2;
                                    if (hnVar4 != null) {
                                        hnVar4.gjv(System.currentTimeMillis());
                                    }
                                    hn hnVar5 = hnVar2;
                                    if (hnVar5 != null) {
                                        jHnj = hnVar5.hnj();
                                        jHn = hnVar2.hn();
                                    } else {
                                        jHnj = 0;
                                        jHn = 0;
                                    }
                                    com.bytedance.sdk.openadsdk.core.mjg.qor.hn.hnj(asVar, jHnj, jHn);
                                    hnj.hn(file2);
                                    z10 = true;
                                    try {
                                        File fileHnj = hnj.hnj(file2);
                                        if (fileHnj != null && fileHnj.exists()) {
                                            hnj.this.aq.put(file2.getName(), fileHnj.getAbsolutePath());
                                        }
                                        hnj.this.hnj(hnj.this.gjv(fileHnj), true);
                                    } catch (Throwable unused2) {
                                    }
                                } catch (Throwable th2) {
                                    apu.hnj("PlayableCache", "unzip error: ", th2);
                                    com.bytedance.sdk.openadsdk.core.mjg.qor.hn.hnj(asVar, -704, th2.getMessage());
                                    z10 = false;
                                }
                                try {
                                    hnVar.sk().delete();
                                } catch (Throwable unused3) {
                                }
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                hnj.this.hnj(interfaceC0224hnj, z10);
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.core.mjg.qor.hn.hnj(asVar, hnVar.hnj() != 0 ? hnVar.hnj() : -700, (String) null);
                        hnj.this.hnj(interfaceC0224hnj, false);
                    }
                }

                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
                    hnj.this.dkl.remove(strC);
                    hnj.this.dse.remove(strC);
                    hnj.this.qor.remove(asVar);
                    com.bytedance.sdk.openadsdk.core.mjg.qor.hn.hnj(asVar, -700, iOException.getMessage());
                    hnj.this.hnj(interfaceC0224hnj, false);
                }
            });
            return;
        }
        com.bytedance.sdk.openadsdk.core.mjg.qor.hn.hnj(asVar, -701, (String) null);
        hnj(interfaceC0224hnj, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(final InterfaceC0224hnj interfaceC0224hnj, final boolean z10) {
        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.3
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC0224hnj interfaceC0224hnj2 = interfaceC0224hnj;
                if (interfaceC0224hnj2 != null) {
                    interfaceC0224hnj2.hnj(z10);
                }
            }
        });
    }
}
