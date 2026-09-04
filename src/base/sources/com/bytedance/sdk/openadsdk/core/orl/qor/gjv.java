package com.bytedance.sdk.openadsdk.core.orl.qor;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dse;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.sk;
import com.bytedance.sdk.openadsdk.core.oj;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    public static final List<String> hnj = Arrays.asList(MimeTypes.VIDEO_MP4, MimeTypes.VIDEO_H263);

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final ConcurrentHashMap<String, Boolean> f14135hn = new ConcurrentHashMap<>();

    private static double hn(String str) {
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1664118616) {
            return (iHashCode == 1331848029 && str.equals(MimeTypes.VIDEO_MP4)) ? 1.5d : 1.0d;
        }
        str.equals(MimeTypes.VIDEO_H263);
        return 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hn(as asVar, File file, sk.hnj hnjVar, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.core.orl.hnj.hnj.sk skVar = new com.bytedance.sdk.openadsdk.core.orl.hnj.hnj.sk(oj.hnj(), 0, 0);
        com.bytedance.sdk.openadsdk.core.orl.hnj hnjVarHnj = skVar.hnj((String) null, file, new ArrayList());
        if (hnjVarHnj != null) {
            hnjVar.hnj(hnjVarHnj.hnj());
            hnjVar.hnj(hnjVarHnj.bug());
        }
        hn(asVar, hnjVar.qor(), true, j10);
        hnj(asVar, "vast_url", hnjVarHnj, jElapsedRealtime, skVar.dkl);
        hn();
    }

    public static double hnj(int i10, double d10, int i11, int i12, int i13, String str) {
        double dHnj = hnj(i10, d10, i11, i12);
        return hn(str) * (1.0d / ((dHnj + 1.0d) + hnj(i13)));
    }

    private static double hnj(int i10, double d10, int i11, int i12) {
        return (d10 > 0.0d ? Math.abs(d10 - (i12 > 0 ? ((double) i11) / ((double) i12) : 0.0d)) : 0.0d) + (i10 > 0 ? Math.abs((i10 - i11) / i10) : 0.0d);
    }

    private static double hnj(int i10) {
        int iMax = Math.max(i10, 0);
        if (700 > iMax || iMax > 1500) {
            return Math.min(Math.abs(700 - iMax) / 700.0f, Math.abs(1500 - iMax) / 1500.0f);
        }
        return 0.0d;
    }

    private static void hn() {
        File[] fileArrListFiles;
        File fileHnj = hnj(oj.hnj());
        if (fileHnj == null || (fileArrListFiles = fileHnj.listFiles()) == null || fileArrListFiles.length <= 5) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.bytedance.sdk.openadsdk.core.orl.qor.gjv.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public int compare(File file, File file2) {
                if (file.lastModified() < file2.lastModified()) {
                    return -1;
                }
                return file.lastModified() > file2.lastModified() ? 1 : 0;
            }
        });
        int length = fileArrListFiles.length - 5;
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < length; i10++) {
            File file = fileArrListFiles[i10];
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static void hnj(as asVar) {
        sk skVarSa;
        ArrayList<sk.hnj> arrayListHnj;
        as asVar2;
        if (asVar == null || !sk.hnj(asVar) || (skVarSa = asVar.sa()) == null || (arrayListHnj = skVarSa.hnj()) == null || arrayListHnj.isEmpty()) {
            return;
        }
        int size = arrayListHnj.size();
        int i10 = 0;
        while (i10 < size) {
            sk.hnj hnjVar = arrayListHnj.get(i10);
            i10++;
            sk.hnj hnjVar2 = hnjVar;
            String strGjv = hnjVar2.gjv();
            if (TextUtils.isEmpty(strGjv)) {
                asVar2 = asVar;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                com.bytedance.sdk.openadsdk.core.orl.hnj.hnj.sk skVar = new com.bytedance.sdk.openadsdk.core.orl.hnj.hnj.sk(oj.hnj(), 0, 0);
                com.bytedance.sdk.openadsdk.core.orl.hnj hnjVarHnj = skVar.hnj(strGjv, (File) null, new ArrayList());
                if (hnjVarHnj != null) {
                    hnjVar2.hnj(hnjVarHnj.hnj());
                    hnjVar2.hnj(hnjVarHnj.bug());
                }
                asVar2 = asVar;
                hnj(asVar2, "vast_content", hnjVarHnj, jElapsedRealtime, skVar.dkl);
            }
            hnj(asVar2, hnjVar2);
            asVar = asVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hn(as asVar, final String str, final boolean z10, final long j10) {
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVar, asVar.sk(), "track_url_request_result", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.orl.qor.gjv.3
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", str);
                    jSONObject.put("duration", j10);
                    jSONObject.put("success", z10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void hn(final as asVar, final String str, final com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar, final long j10, final com.bytedance.sdk.openadsdk.core.orl.hnj.hn.hnj hnjVar2) {
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(new com.bytedance.sdk.component.aq.hn.qor("vast_parser2") { // from class: com.bytedance.sdk.openadsdk.core.orl.qor.gjv.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j10);
                    com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar3 = hnjVar;
                    String str2 = "load_vast_fail";
                    if (hnjVar3 == null) {
                        com.bytedance.sdk.openadsdk.core.orl.hnj.hn.hnj hnjVar4 = hnjVar2;
                        if (hnjVar4 != null) {
                            jSONObject.put("error_code", hnjVar4.hnj);
                        }
                    } else if (TextUtils.isEmpty(hnjVar3.ojm()) || TextUtils.isEmpty(hnjVar.dkl()) || hnjVar.aq() <= 0.0d) {
                        jSONObject.put("error_code", -3);
                    } else {
                        str2 = "load_vast_success";
                    }
                    com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar5 = hnjVar;
                    if (hnjVar5 == null || hnjVar5.hn() == null || !TextUtils.isEmpty(hnjVar.hn().sk())) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", 1000);
                        jSONObject2.put("description", "1000:Image url is null");
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, str, "load_vast_icon_fail", jSONObject2);
                    hnjVar.hnj((com.bytedance.sdk.openadsdk.core.orl.hn) null);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public static void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        List<as> listGjv = hnjVar.gjv();
        if (listGjv != null) {
            Iterator<as> it = listGjv.iterator();
            while (it.hasNext()) {
                hnj(it.next());
            }
        }
    }

    private static void hnj(final as asVar, final sk.hnj hnjVar) {
        File fileHnj;
        String strQor = hnjVar.qor();
        if (TextUtils.isEmpty(strQor)) {
            return;
        }
        final String str = strQor + asVar.jp();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = f14135hn;
        if (concurrentHashMap.containsKey(str) || (fileHnj = hnj(str)) == null) {
            return;
        }
        if (fileHnj.exists() && fileHnj.length() > 0) {
            hn(asVar, fileHnj, hnjVar, 0L);
            return;
        }
        concurrentHashMap.put(str, Boolean.TRUE);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.dse.hn.hnj hnjVarGjv = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().gjv();
        hnjVarGjv.qor(strQor);
        hnjVarGjv.hnj(fileHnj.getParent(), fileHnj.getName());
        hnjVarGjv.gjv(strQor);
        hnjVarGjv.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.core.orl.qor.gjv.1
            @Override // com.bytedance.sdk.component.dse.hnj.hnj
            public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar) {
                if (hnVar.dkl() && hnVar.sk() != null && hnVar.sk().exists()) {
                    gjv.hn(asVar, hnVar.sk(), hnjVar, SystemClock.elapsedRealtime() - jElapsedRealtime);
                } else {
                    gjv.hn(asVar, hnjVar.qor(), false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                }
                gjv.f14135hn.remove(str);
            }

            @Override // com.bytedance.sdk.component.dse.hnj.hnj
            public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
                gjv.hn(asVar, hnjVar.qor(), false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                gjv.f14135hn.remove(str);
            }
        });
    }

    public static File hnj(String str) {
        String strHnj = com.bytedance.sdk.component.utils.sk.hnj(str);
        if (strHnj == null) {
            return null;
        }
        return new File(hnj(oj.hnj()), strHnj);
    }

    private static File hnj(Context context) {
        return dse.hn(context, new File(CacheDirFactory.getRootDir()).getName() + "/vast");
    }

    public static void hnj(final as asVar, final String str, final com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar, final long j10, final com.bytedance.sdk.openadsdk.core.orl.hnj.hn.hnj hnjVar2) {
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(new com.bytedance.sdk.component.aq.hn.qor("vast_parser1") { // from class: com.bytedance.sdk.openadsdk.core.orl.qor.gjv.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j10);
                    jSONObject.put("from", str);
                    if (hnjVar != null) {
                        as asVar2 = asVar;
                        com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar2, asVar2.sk(), "track_load_vast_success", jSONObject);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.orl.hnj.hn.hnj hnjVar3 = hnjVar2;
                    if (hnjVar3 != null) {
                        jSONObject.put("error_code", hnjVar3.hnj);
                    }
                    as asVar3 = asVar;
                    com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar3, asVar3.sk(), "track_load_vast_fail", jSONObject);
                } catch (Exception unused) {
                }
            }
        });
    }
}
