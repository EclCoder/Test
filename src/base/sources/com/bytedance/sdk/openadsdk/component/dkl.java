package com.bytedance.sdk.openadsdk.component;

import a7.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.a;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.c;
import com.bytedance.sdk.component.sk.aq;
import com.bytedance.sdk.component.sk.dnm;
import com.bytedance.sdk.component.sk.jip;
import com.bytedance.sdk.component.sk.ta;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.as;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.model.pty;
import com.bytedance.sdk.openadsdk.core.model.xyo;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.wu;
import com.bytedance.sdk.openadsdk.utils.fvt;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.bytedance.sdk.openadsdk.utils.uua;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static volatile dkl f13329hn = null;
    private static String hnj = "openad_image_cache";
    private final Map<String, AtomicInteger> dkl = new ConcurrentHashMap();
    private final Map<String, String> dse = new ConcurrentHashMap();
    private final as<com.bytedance.sdk.openadsdk.gjv.hnj> gjv;
    private final com.bytedance.sdk.openadsdk.hn.hn qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final Context f13330sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface hn {
        void hnj();

        void hnj(int i10, String str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj();

        void hnj(com.bytedance.sdk.openadsdk.apu.hnj.hn hnVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface qor {
        void hnj(Object obj);
    }

    private dkl(Context context) {
        if (context != null) {
            this.f13330sk = context.getApplicationContext();
        } else {
            this.f13330sk = oj.hnj();
        }
        this.qor = new com.bytedance.sdk.openadsdk.hn.hn(10, 8, true);
        this.gjv = oj.qor();
        hnj += "_p";
        com.bytedance.sdk.openadsdk.common.hn.hnj("tt_openad_materialMeta_new", new com.bytedance.sdk.openadsdk.common.hn.hnj("tt_openad_materialMeta_new") { // from class: com.bytedance.sdk.openadsdk.component.dkl.1
            @Override // com.bytedance.sdk.openadsdk.common.hn.hnj
            public String hn(String str) {
                return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)), (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.common.hn.hnj
            protected String hnj(String str) {
                return "tt_openad_materialMeta_new";
            }

            @Override // com.bytedance.sdk.openadsdk.common.hn.hnj
            public void hnj(AdSlot adSlot, String str, String str2) {
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad_materialMeta_new", "material".concat(String.valueOf(adSlot.getCodeId())), str);
            }
        });
    }

    private int gjv(AdSlot adSlot) {
        StringBuilder sb2 = new StringBuilder("material_expiration_time");
        sb2.append(adSlot.getCodeId());
        return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad", sb2.toString(), -1L) == -1 ? 0 : 1;
    }

    private void hn(final com.bytedance.sdk.openadsdk.core.model.as asVar, final AdSlot adSlot, final pty ptyVar, final com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        if (com.bytedance.sdk.openadsdk.component.dse.hnj.sk()) {
            hnj(asVar, adSlot, ptyVar, hnjVar);
        }
        hnj(asVar, adSlot, ptyVar, new hn() { // from class: com.bytedance.sdk.openadsdk.component.dkl.7
            @Override // com.bytedance.sdk.openadsdk.component.dkl.hn
            public void hnj() {
                if (com.bytedance.sdk.openadsdk.component.dse.hnj.sk()) {
                    return;
                }
                dkl.this.hnj(asVar, adSlot, ptyVar, hnjVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.dkl.hn
            public void hnj(int i10, String str) {
                dkl.this.qor(adSlot);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor(AdSlot adSlot) {
        AtomicInteger atomicInteger = this.dkl.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.dkl.put(adSlot.getCodeId(), atomicInteger);
    }

    public static dkl hnj(Context context) {
        if (f13329hn == null) {
            synchronized (dkl.class) {
                try {
                    if (f13329hn == null) {
                        f13329hn = new dkl(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f13329hn;
    }

    public void hn(int i10) {
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad", "image_has_cached".concat(String.valueOf(i10)), Boolean.TRUE);
    }

    public boolean hn(AdSlot adSlot) {
        if (!com.bytedance.sdk.openadsdk.component.dse.hnj.sk() && adSlot != null) {
            String codeId = adSlot.getCodeId();
            if (com.bytedance.sdk.openadsdk.component.dse.hnj.hnj(adSlot) && !TextUtils.isEmpty(codeId)) {
                return this.dse.containsKey(codeId);
            }
        }
        return false;
    }

    private void qor(final com.bytedance.sdk.openadsdk.core.model.as asVar, final AdSlot adSlot, final pty ptyVar, final com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        if (com.bytedance.sdk.openadsdk.component.dse.hnj.sk()) {
            hnj(asVar, adSlot, ptyVar, hnjVar);
        }
        hnj(asVar, ptyVar, new hnj() { // from class: com.bytedance.sdk.openadsdk.component.dkl.8
            @Override // com.bytedance.sdk.openadsdk.component.dkl.hnj
            public void hnj(com.bytedance.sdk.openadsdk.apu.hnj.hn hnVar) {
                if (com.bytedance.sdk.openadsdk.component.dse.hnj.sk()) {
                    return;
                }
                dkl.this.hnj(asVar, adSlot, ptyVar, hnjVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.dkl.hnj
            public void hnj() {
                dkl.this.qor(adSlot);
            }
        });
    }

    private void hn(String str) {
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad_materialMeta", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad", "material_expiration_time".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad", "video_has_cached".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad", "image_has_cached".concat(String.valueOf(str)));
    }

    public static void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, qor qorVar) {
        hnj(asVar, qorVar, 0);
    }

    public String qor(int i10) {
        String strHn = com.bytedance.sdk.openadsdk.common.hn.hnj("tt_openad_materialMeta_new").hn(String.valueOf(i10));
        long jHnj = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad", "material_expiration_time".concat(String.valueOf(i10)), -1L);
        if (System.currentTimeMillis() / 1000 < jHnj) {
            return strHn;
        }
        if (jHnj != -1) {
            hnj(i10, (String) null);
            hnj(strHn);
        }
        return null;
    }

    public static void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, final qor qorVar, final int i10) {
        String strJ = asVar.pwt().J();
        if (TextUtils.isEmpty(strJ)) {
            return;
        }
        ta taVarGjv = com.bytedance.sdk.openadsdk.ta.gjv.hnj(strJ).hnj(asVar.pwt().D()).hn(asVar.pwt().p()).sk(sq.sk(oj.hnj())).gjv(sq.qor(oj.hnj()));
        if (i10 > 0 && Build.VERSION.SDK_INT >= 26) {
            taVarGjv.qor(2).hnj(new aq() { // from class: com.bytedance.sdk.openadsdk.component.dkl.4
                @Override // com.bytedance.sdk.component.sk.aq
                public Bitmap hnj(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.gjv.hnj.hnj(oj.hnj(), bitmap, i10);
                }
            });
        } else {
            taVarGjv.qor(1);
        }
        taVarGjv.hnj(new com.bytedance.sdk.openadsdk.ta.hn(asVar, strJ, new jip() { // from class: com.bytedance.sdk.openadsdk.component.dkl.5
            @Override // com.bytedance.sdk.component.sk.jip
            public void hnj(int i11, String str, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.sk.jip
            public void hnj(dnm dnmVar) {
                qor qorVar2;
                if (dnmVar == null || dnmVar.hn() == null || dnmVar.qor() == null || (qorVar2 = qorVar) == null) {
                    return;
                }
                qorVar2.hnj(dnmVar.hn());
            }
        }));
    }

    public File hn() {
        return com.bytedance.sdk.component.utils.dse.hn(oj.hnj(), new File(CacheDirFactory.getRootDir()).getName() + "/" + hnj);
    }

    public void hnj(final AdSlot adSlot) {
        Objects.toString(adSlot);
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        AtomicInteger atomicInteger = this.dkl.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        }
        if (!com.bytedance.sdk.openadsdk.common.oj.hnj().hnj(adSlot.getCodeId(), atomicInteger.get(), atomicInteger.get() + gjv(adSlot))) {
            com.bytedance.sdk.openadsdk.component.dse.hnj.aq();
            return;
        }
        atomicInteger.incrementAndGet();
        this.dkl.put(adSlot.getCodeId(), atomicInteger);
        final pty ptyVar = new pty();
        ptyVar.hnj(fvt.hn());
        ptyVar.hn(com.bytedance.sdk.openadsdk.component.dse.hnj.hn());
        ptyVar.hn(com.bytedance.sdk.openadsdk.component.dse.hnj.qor());
        xyo xyoVar = new xyo();
        xyoVar.dnm = ptyVar;
        xyoVar.gjv = 2;
        xyoVar.ojm = 2;
        this.gjv.hnj(adSlot, xyoVar, 3, new wu() { // from class: com.bytedance.sdk.openadsdk.component.dkl.6
            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(int i10, String str) {
                dkl.this.qor(adSlot);
                com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(ptyVar, 100, 2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar) {
                dkl.this.hnj(hnjVar, qorVar, adSlot, ptyVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar, AdSlot adSlot, pty ptyVar) {
        com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(ptyVar, 100, 1);
        if (hnjVar != null && hnjVar.gjv() != null && !hnjVar.gjv().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.as asVar = hnjVar.gjv().get(0);
            if (asVar == null) {
                return;
            }
            if (asVar.nyv()) {
                hnj(asVar, adSlot, ptyVar, hnjVar);
                return;
            } else if (com.bytedance.sdk.openadsdk.core.model.as.sk(asVar)) {
                hn(asVar, adSlot, ptyVar, hnjVar);
                return;
            } else {
                qor(asVar, adSlot, ptyVar, hnjVar);
                return;
            }
        }
        qorVar.hnj(-3);
        qorVar.qor(2);
        com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar);
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, AdSlot adSlot, pty ptyVar, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        if (ptyVar != null) {
            asVar.qor(ptyVar.ta());
        }
        hnj(new com.bytedance.sdk.openadsdk.component.sk.hnj(asVar.atw(), asVar, hnjVar));
        com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(asVar, 1, ptyVar);
        qor(adSlot);
    }

    public void hnj(final com.bytedance.sdk.openadsdk.core.model.as asVar, AdSlot adSlot, final pty ptyVar, final hn hnVar) {
        final fvt fvtVarHn = fvt.hn();
        final int iAtw = asVar.atw();
        a aVarPwt = asVar.pwt();
        String strH = aVarPwt.h();
        String strY = aVarPwt.y();
        if (TextUtils.isEmpty(strY)) {
            strY = com.bytedance.sdk.component.utils.sk.hnj(strH);
        }
        final File fileHnj = com.bytedance.sdk.openadsdk.component.dse.hnj.hnj(strY);
        if (fileHnj.exists()) {
            com.bytedance.sdk.openadsdk.component.dse.hnj.hnj(fileHnj);
            hnj(iAtw);
            long jGjv = fvtVarHn.gjv();
            if (ptyVar != null) {
                ptyVar.hnj(jGjv);
                ptyVar.hnj(1);
            }
            hnVar.hnj();
            hnj(asVar, (qor) null);
            return;
        }
        if (oj.gjv().tu(String.valueOf(iAtw)) && !com.bytedance.sdk.component.utils.oj.gjv(oj.hnj())) {
            hnVar.hnj(100, "OnlyWifi");
            return;
        }
        com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVarHnj = com.bytedance.sdk.openadsdk.core.model.as.hnj(fileHnj.getParent(), asVar);
        hnVarHnj.hnj("material_meta", asVar);
        hnVarHnj.hnj("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.mjg.sk.hnj.hnj(hnVarHnj, new b.a() { // from class: com.bytedance.sdk.openadsdk.component.dkl.9
            @Override // a7.b.a
            public void hnj(c cVar, int i10) {
                dkl.this.hnj(iAtw);
                long jGjv2 = fvtVarHn.gjv();
                com.bytedance.sdk.openadsdk.component.gjv.hnj.hn(asVar, jGjv2, true);
                pty ptyVar2 = ptyVar;
                if (ptyVar2 != null) {
                    ptyVar2.hnj(jGjv2);
                    ptyVar.hnj(2);
                }
                hnVar.hnj();
                dkl.hnj(asVar, (qor) null);
            }

            @Override // a7.b.a
            public void hnj(c cVar, int i10, String str) {
                long jGjv2 = fvtVarHn.gjv();
                com.bytedance.sdk.openadsdk.component.gjv.hnj.hn(asVar, jGjv2, false);
                pty ptyVar2 = ptyVar;
                if (ptyVar2 != null) {
                    ptyVar2.hnj(jGjv2);
                }
                hnVar.hnj(i10, str);
                try {
                    if (fileHnj.exists() && fileHnj.isFile()) {
                        com.bytedance.sdk.component.utils.dse.qor(fileHnj);
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // a7.b.a
            public void hn(c cVar, int i10) {
            }
        });
    }

    public void hnj(final com.bytedance.sdk.openadsdk.core.model.as asVar, final pty ptyVar, final hnj hnjVar) {
        final fvt fvtVarHn = fvt.hn();
        final int iAtw = asVar.atw();
        com.bytedance.sdk.openadsdk.core.model.oj ojVar = asVar.lx().get(0);
        String strDse = ojVar.dse();
        String strHnj = ojVar.hnj();
        int iHn = ojVar.hn();
        int iQor = ojVar.qor();
        String strHnj2 = TextUtils.isEmpty(strDse) ? com.bytedance.sdk.component.utils.sk.hnj(strHnj) : strDse;
        if (TextUtils.isEmpty(strHnj2)) {
            if (hnjVar != null) {
                hnjVar.hnj();
                return;
            }
            return;
        }
        File fileHn = com.bytedance.sdk.openadsdk.component.dse.hnj.hn(strHnj2);
        if (hnj(strHnj, strDse)) {
            hn(iAtw);
            long jGjv = fvtVarHn.gjv();
            if (ptyVar != null) {
                ptyVar.hnj(jGjv);
                ptyVar.hnj(1);
            }
            hnjVar.hnj(null);
            return;
        }
        uua.hnj(new com.bytedance.sdk.openadsdk.apu.hnj(strHnj, ojVar.dse()), iHn, iQor, new uua.hnj() { // from class: com.bytedance.sdk.openadsdk.component.dkl.10
            @Override // com.bytedance.sdk.openadsdk.utils.uua.hnj
            public void hnj(com.bytedance.sdk.openadsdk.apu.hnj.hn hnVar) {
                if (!hnVar.sk()) {
                    com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(asVar, fvtVarHn.gjv(), false);
                    hnjVar.hnj();
                    return;
                }
                dkl.this.hn(iAtw);
                long jGjv2 = fvtVarHn.gjv();
                com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(asVar, jGjv2, true);
                pty ptyVar2 = ptyVar;
                if (ptyVar2 != null) {
                    ptyVar2.hnj(jGjv2);
                    ptyVar.hnj(2);
                }
                hnjVar.hnj(hnVar);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.uua.hnj
            public void hnj() {
                com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(asVar, fvtVarHn.gjv(), false);
                hnjVar.hnj();
            }
        }, fileHn.getParent());
    }

    public void hnj(int i10) {
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad", "video_has_cached".concat(String.valueOf(i10)), Boolean.TRUE);
    }

    public void hnj(final com.bytedance.sdk.openadsdk.component.sk.hnj hnjVar) {
        fc.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.dkl.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.core.model.as asVarHn = hnjVar.hn();
                    if (asVarHn == null || com.bytedance.sdk.openadsdk.core.model.as.dkl(asVarHn) || asVarHn.era()) {
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.component.dse.hnj.sk()) {
                        com.bytedance.sdk.openadsdk.common.oj.hnj().hnj(asVarHn, hnjVar.qor());
                        return;
                    }
                    if (dkl.this.hn(asVarHn.aip())) {
                        return;
                    }
                    dkl.this.hnj(asVarHn.aip(), asVarHn.jp());
                    com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad", "material_expiration_time" + hnjVar.hnj(), Long.valueOf(asVarHn.jpm()));
                    com.bytedance.sdk.openadsdk.common.hn.hnj("tt_openad_materialMeta_new").hnj(hnjVar.hn().aip(), hnjVar.qor());
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void hnj(final String str) {
        ua.hnj(new com.bytedance.sdk.component.aq.hn.qor("opencache") { // from class: com.bytedance.sdk.openadsdk.component.dkl.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.model.hnj hnjVarHn;
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("cypher")) {
                        jSONObject = oj.qor().hnj(jSONObject);
                    }
                    if (jSONObject == null || !jSONObject.has("creatives") || (hnjVarHn = com.bytedance.sdk.openadsdk.core.model.hnj.hn(jSONObject)) == null || !hnjVarHn.sk()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(hnjVarHn.dkl());
                } catch (Throwable unused) {
                }
            }
        });
    }

    public String hnj(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (asVar != null && asVar.pwt() != null && !TextUtils.isEmpty(asVar.pwt().h())) {
            String strH = asVar.pwt().h();
            String strY = asVar.pwt().y();
            if (TextUtils.isEmpty(strY)) {
                strY = com.bytedance.sdk.component.utils.sk.hnj(strH);
            }
            File fileHnj = com.bytedance.sdk.openadsdk.component.dse.hnj.hnj(strY);
            if (fileHnj.exists() && fileHnj.isFile()) {
                return fileHnj.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean hnj(String str, String str2) {
        boolean z10;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.sk.hnj(str);
            }
            File fileHn = com.bytedance.sdk.openadsdk.component.dse.hnj.hn(str2);
            InputStream inputStreamHnj = com.bytedance.sdk.openadsdk.ta.gjv.hnj(str, str2);
            if (inputStreamHnj != null) {
                try {
                    inputStreamHnj.close();
                } catch (IOException e10) {
                    apu.qor("TTAppOpenAdCacheManager", e10.getMessage());
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || !(com.bytedance.sdk.openadsdk.ta.gjv.hnj(str, str2, fileHn.getParent()) || new File(fileHn.getPath()).exists())) {
                return z10;
            }
            return true;
        } catch (Exception e11) {
            apu.qor("TTAppOpenAdCacheManager", e11.getMessage());
            return false;
        }
    }

    public void hnj(AdSlot adSlot, String str) {
        if (com.bytedance.sdk.openadsdk.component.dse.hnj.sk() || adSlot == null || TextUtils.isEmpty(str)) {
            return;
        }
        String codeId = adSlot.getCodeId();
        boolean z10 = adSlot.getCacheScene() != 0;
        if (!com.bytedance.sdk.openadsdk.component.dse.hnj.hnj(adSlot) || z10 || TextUtils.isEmpty(codeId)) {
            return;
        }
        this.dse.put(codeId, str);
    }

    public void hnj(int i10, String str) {
        String strValueOf = String.valueOf(i10);
        if (com.bytedance.sdk.openadsdk.component.dse.hnj.sk()) {
            com.bytedance.sdk.openadsdk.common.oj.hnj().hnj(strValueOf, str);
            return;
        }
        if (this.dse.size() != 0 && !TextUtils.isEmpty(str) && this.dse.containsKey(strValueOf)) {
            if (this.dse.containsValue(str)) {
                this.dse.remove(strValueOf);
                hn(strValueOf);
                return;
            }
            return;
        }
        hn(strValueOf);
    }

    public void hnj() {
        File[] fileArrListFiles;
        try {
            com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad_materialMeta");
            com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad_materialMeta_new");
            com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad");
        } catch (Throwable unused) {
        }
        try {
            File file = new File(CacheDirFactory.getRootDir());
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.dkl.3
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 == null) {
                        return false;
                    }
                    String name = file2.getName();
                    return name.contains(dkl.hnj) || name.contains("openad_video_cache");
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    try {
                        com.bytedance.sdk.component.utils.dse.qor(file2);
                    } catch (Throwable unused2) {
                    }
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
