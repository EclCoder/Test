package com.bytedance.sdk.openadsdk.core.sk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.dse;
import com.bytedance.sdk.component.utils.sk;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.mjg.qor.qor;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.jip.gjv;
import com.bytedance.sdk.openadsdk.jip.hn;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private final List<String> hnj = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final qor f14199hn = new qor(5, 5, true);
    private final ConcurrentHashMap<String, Long> qor = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.sk.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0234hnj {
        private static final hnj hnj = new hnj();
    }

    private boolean qor(String str) {
        return !this.hnj.contains(str);
    }

    public File hn(String str) {
        String strHnj = sk.hnj(str);
        if (strHnj == null) {
            return null;
        }
        File fileHnj = hnj(oj.hnj());
        fileHnj.getAbsoluteFile();
        return new File(fileHnj, strHnj);
    }

    public void qor() {
        gjv.hnj("music_preload_start", false, new hn() { // from class: com.bytedance.sdk.openadsdk.core.sk.hnj.2
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                com.bytedance.sdk.openadsdk.jip.hnj.gjv gjvVarHnj = com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("music_preload_start");
                gjvVarHnj.hnj();
                return gjvVarHnj;
            }
        });
    }

    public static hnj hnj() {
        return C0234hnj.hnj;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        List<as> listGjv = hnjVar.gjv();
        if (listGjv == null || listGjv.size() == 0) {
            return;
        }
        for (int i10 = 0; i10 < listGjv.size(); i10++) {
            as asVar = listGjv.get(i10);
            if (asVar != null) {
                hnj(asVar);
            }
        }
    }

    public void hn() {
        File fileHnj = hnj(oj.hnj());
        fileHnj.getAbsolutePath();
        try {
            this.f14199hn.hnj(fileHnj);
        } catch (IOException e10) {
            apu.hnj("MusicCacheManager", "trimFileCache fail", e10);
        }
    }

    public InputStream hnj(String str) {
        File fileHn = hn(str);
        if (fileHn == null || !hnj(fileHn)) {
            return null;
        }
        try {
            return new FileInputStream(fileHn);
        } catch (Exception e10) {
            apu.qor("MusicCacheManager", e10.getMessage());
            return null;
        }
    }

    private void hnj(as asVar) {
        as.hnj hnjVarZd;
        String strOjm;
        if (asVar == null || (hnjVarZd = asVar.zd()) == null || (strOjm = hnjVarZd.ojm()) == null || !strOjm.contains("music_url")) {
            return;
        }
        qor();
        String strHn = hnjVarZd.hn();
        if (TextUtils.isEmpty(strHn)) {
            try {
                new JSONObject().put("result", 0);
            } catch (JSONException e10) {
                apu.qor("MusicCacheManager", e10.getMessage());
            }
            hnj(0, -1L, 10001, "music url string is null");
            return;
        }
        File fileHn = hn(strHn);
        if (fileHn == null) {
            return;
        }
        fileHn.getPath();
        if (hnj(fileHn)) {
            hnj(2, -1L, -1, null);
        } else {
            hnj(asVar, strHn, fileHn);
        }
    }

    private File hnj(Context context) {
        return dse.hn(context, new File(CacheDirFactory.getRootDir()).getName() + "/music");
    }

    private boolean hnj(File file) {
        return file.exists() && file.length() != 0;
    }

    private void hnj(as asVar, String str, File file) {
        if (qor(str)) {
            this.qor.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            com.bytedance.sdk.component.dse.hn.hnj hnjVarGjv = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().gjv();
            hnjVarGjv.qor(str);
            hnjVarGjv.hnj(file.getParent(), file.getName());
            hnjVarGjv.gjv(str);
            this.hnj.add(str);
            hnjVarGjv.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.core.sk.hnj.1
                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar) {
                    hnVar.qor();
                    hnVar.hnj();
                    String strGjv = qorVar.gjv();
                    Long l10 = (Long) hnj.this.qor.get(strGjv);
                    if (hnVar.dkl() && hnVar.sk() != null && hnVar.sk().exists()) {
                        hnVar.sk();
                        if (l10 != null) {
                            hnj.this.qor.remove(strGjv);
                            hnj.this.hnj(1, SystemClock.elapsedRealtime() - l10.longValue(), -1, null);
                        }
                        try {
                            dse.hn(hnVar.sk());
                        } catch (IOException e10) {
                            apu.qor("MusicCacheManager", e10.getMessage());
                        }
                    }
                    if (hnVar.dkl() || l10 == null) {
                        return;
                    }
                    hnj.this.hnj(0, SystemClock.elapsedRealtime() - l10.longValue(), -2, "http response status code isn't 200");
                }

                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
                    Long l10 = (Long) hnj.this.qor.get(qorVar.gjv());
                    if (l10 != null) {
                        hnj.this.hnj(0, SystemClock.elapsedRealtime() - l10.longValue(), -2, "http response status code isn't 200");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(final int i10, final long j10, final int i11, final String str) {
        gjv.hnj("music_preload_finish", false, new hn() { // from class: com.bytedance.sdk.openadsdk.core.sk.hnj.3
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", i10);
                long j11 = j10;
                if (j11 != -1) {
                    jSONObject.put("load_duration", j11);
                }
                com.bytedance.sdk.openadsdk.jip.hnj.gjv gjvVarHn = com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("music_preload_finish").hn(jSONObject.toString());
                if (!TextUtils.isEmpty(str)) {
                    gjvVarHn.hn(i11);
                    gjvVarHn.dkl(str);
                }
                gjvVarHn.hnj();
                return gjvVarHn;
            }
        });
    }

    public void hnj(final boolean z10) {
        gjv.hnj("music_cache", false, new hn() { // from class: com.bytedance.sdk.openadsdk.core.sk.hnj.4
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", z10);
                com.bytedance.sdk.openadsdk.jip.hnj.gjv gjvVarHn = com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("music_cache").hn(jSONObject.toString());
                gjvVarHn.hnj();
                return gjvVarHn;
            }
        });
    }
}
