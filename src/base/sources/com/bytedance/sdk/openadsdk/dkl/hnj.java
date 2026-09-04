package com.bytedance.sdk.openadsdk.dkl;

import com.bytedance.sdk.openadsdk.as.sk;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.qor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private static volatile hnj hnj;
    private int[] aq;
    private int[] bug;
    private int[] dkl;
    private boolean dnm;
    private int[] dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private int f14315fc;
    private boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private boolean f14316hn;
    private boolean jip;
    private boolean mjg;
    private int[] ojm;
    private boolean orl;
    private boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int[] f14317sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private boolean f14318ta;
    private boolean uua;

    private hnj() {
        hn();
    }

    public int[] bug() {
        return this.aq;
    }

    public int[] dnm() {
        return this.dse;
    }

    public boolean fc() {
        return this.dnm;
    }

    public int[] jip() {
        return this.bug;
    }

    public boolean mjg() {
        return this.f14318ta;
    }

    public boolean oj() {
        return this.uua;
    }

    public int[] orl() {
        return this.ojm;
    }

    public int[] ta() {
        return this.dkl;
    }

    public boolean uua() {
        return this.orl;
    }

    public boolean aq() {
        return this.gjv;
    }

    public boolean dse() {
        return this.qor;
    }

    public int[] ojm() {
        return this.f14317sk;
    }

    public boolean dkl() {
        return this.f14316hn;
    }

    public int gjv() {
        return this.f14315fc;
    }

    public boolean sk() {
        return this.jip;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] qor(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i10 = 0;
        for (String str : strArr) {
            try {
                int i11 = Integer.parseInt(str);
                iArr[i10] = i11;
                if (i11 > 0) {
                    i10++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i10 == length) {
            return iArr;
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }

    public void hn() {
        fc.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dkl.hnj.1
            @Override // java.lang.Runnable
            public void run() {
                hnj.this.mjg = sk.hnj("feature_switch", false);
                if (hnj.this.mjg) {
                    try {
                        hnj.this.uua = sk.hnj("exclude_banner_native", false);
                        hnj.this.f14315fc = sk.hnj("feature_timer_interval", 10000);
                        hnj.this.jip = sk.hnj("enable_feature_cids", true);
                        String[] strArrSplit = sk.hnj("pag_ad_show_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit2 = sk.hnj("pag_ad_click_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit3 = sk.hnj("pag_video_play_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit4 = sk.hnj("pag_dislike_cnt", "1,3,5session").split(",");
                        hnj hnjVar = hnj.this;
                        hnjVar.f14316hn = hnjVar.hnj(strArrSplit);
                        hnj hnjVar2 = hnj.this;
                        hnjVar2.qor = hnjVar2.hnj(strArrSplit2);
                        hnj hnjVar3 = hnj.this;
                        hnjVar3.gjv = hnjVar3.hnj(strArrSplit3);
                        hnj hnjVar4 = hnj.this;
                        hnjVar4.f14317sk = hnjVar4.hn(strArrSplit);
                        hnj hnjVar5 = hnj.this;
                        hnjVar5.dkl = hnjVar5.hn(strArrSplit2);
                        hnj hnjVar6 = hnj.this;
                        hnjVar6.dse = hnjVar6.hn(strArrSplit3);
                        hnj hnjVar7 = hnj.this;
                        hnjVar7.bug = hnjVar7.qor(strArrSplit4);
                        String[] strArrSplit5 = sk.hnj("pag_landingPage_stay_time", "1,3,5&session").split("&");
                        String[] strArrSplit6 = sk.hnj("pag_video_stay_time", "1,3,5&session").split("&");
                        hnj hnjVar8 = hnj.this;
                        hnjVar8.f14318ta = hnjVar8.hnj(strArrSplit5);
                        hnj hnjVar9 = hnj.this;
                        hnjVar9.dnm = hnjVar9.hnj(strArrSplit6);
                        hnj hnjVar10 = hnj.this;
                        hnjVar10.aq = hnjVar10.hn(strArrSplit5);
                        hnj hnjVar11 = hnj.this;
                        hnjVar11.ojm = hnjVar11.hn(strArrSplit6);
                        hnj.this.orl = sk.hnj("pag_video_30p_session", true);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] hn(String[] strArr) {
        if (strArr.length > 0) {
            return qor(strArr[0].split(","));
        }
        return new int[0];
    }

    public static hnj hnj() {
        if (hnj == null) {
            synchronized (qor.class) {
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

    public boolean qor() {
        return this.mjg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hnj(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }
}
