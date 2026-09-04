package com.bytedance.adsdk.ugeno.gjv.hn;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.gjv.dkl;
import com.coremedia.iso.boxes.FreeSpaceBox;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class hnj {
    public static final HashSet<String> hnj = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", NpmRNZ.JSDcNKbOemiN, "openAppFunction", "close", FreeSpaceBox.TYPE, "videoControl", "pauseVideo", "resumeVideo", "muteVideo", "preventEvent"));
    protected String aq;
    protected Map<String, String> dkl;
    protected String dse;
    protected String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected dkl.hnj f12248hn;
    protected com.bytedance.adsdk.ugeno.hn.qor qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected String f12249sk;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.gjv.hn.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class C0168hnj {
        public static hnj hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, dkl.hnj hnjVar) {
            if (hnjVar == null) {
                return null;
            }
            String strHn = hnjVar.hn();
            hnjVar.hnj();
            com.bytedance.adsdk.ugeno.gjv.hn hnVarHnj = com.bytedance.adsdk.ugeno.gjv.gjv.hnj(strHn);
            if (hnVarHnj == null && (TextUtils.isEmpty(hnjVar.hnj()) || !TextUtils.equals(hnjVar.hnj(), "global"))) {
                hnVarHnj = com.bytedance.adsdk.ugeno.gjv.gjv.hnj(hnjVar.sk());
            }
            if (hnVarHnj == null) {
                return new qor(qorVar, str, hnjVar);
            }
            hnj hnjVarHnj = hnVarHnj.hnj(qorVar, str, hnjVar);
            return hnjVarHnj == null ? new qor(qorVar, str, hnjVar) : hnjVarHnj;
        }
    }

    public hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, dkl.hnj hnjVar) {
        this.qor = qorVar;
        this.f12248hn = hnjVar;
        this.dse = str;
        sk();
    }

    private void sk() {
        dkl.hnj hnjVar = this.f12248hn;
        if (hnjVar == null) {
            return;
        }
        this.gjv = hnjVar.hnj();
        this.f12249sk = this.f12248hn.hn();
        Map<String, String> mapQor = this.f12248hn.qor();
        this.dkl = mapQor;
        if (mapQor == null || mapQor.isEmpty() || !this.dkl.containsKey("emitCustomEvent")) {
            return;
        }
        this.aq = this.dkl.get("emitCustomEvent");
    }

    public boolean gjv() {
        return !TextUtils.isEmpty(this.aq);
    }

    public void hn() {
        qor();
    }

    public abstract void hnj();

    public void qor() {
        if (gjv()) {
            dkl.hnj hnjVar = new dkl.hnj();
            hnjVar.hnj("custom");
            hnjVar.hn("emit");
            HashMap map = new HashMap();
            map.put("name", this.aq);
            hnjVar.hnj(map);
            new hn(this.qor, this.f12249sk, hnjVar).hnj();
        }
    }
}
