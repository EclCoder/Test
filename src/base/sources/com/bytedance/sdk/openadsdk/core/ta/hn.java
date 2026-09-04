package com.bytedance.sdk.openadsdk.core.ta;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.as.sk;
import com.bytedance.sdk.openadsdk.core.ojm.bug;
import com.bytedance.sdk.openadsdk.core.settings.dnm;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    public static final Long hnj = 0L;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private AtomicBoolean f14209hn;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class hnj {
        static final hn hnj = new hn();
    }

    public static hn hnj() {
        return hnj.hnj;
    }

    private void jip() {
        if (hnj().sk() || this.f14209hn.getAndSet(true)) {
            return;
        }
        ApmHelper.initAPM();
        sk.hnj();
        bug.hn();
        com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj().hn();
    }

    public int aq() {
        return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_compliance_file", "user_compliance_status", -1);
    }

    public boolean bug() {
        return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_compliance_file", "user_compliance_status", -1) == 3;
    }

    public boolean dkl() {
        return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_compliance_file", "app_reg", -1) == 1;
    }

    public boolean dnm() {
        return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_compliance_file", "user_compliance_status", -1) == 1;
    }

    public boolean dse() {
        return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_compliance_file", "app_reg", -1) == -1;
    }

    public void fc() {
        jip();
    }

    public boolean gjv() {
        long jOrl = orl();
        return bug() && jOrl != 0 && System.currentTimeMillis() < jOrl;
    }

    public void hn() {
        String strMkl = dnm.hn().mkl();
        if (TextUtils.isEmpty(strMkl)) {
            return;
        }
        if (TextUtils.equals("true", strMkl)) {
            hnj(1);
        } else if (TextUtils.equals("false", strMkl)) {
            hnj(0);
        }
    }

    public void mjg() {
        hnj().hn();
    }

    public boolean ojm() {
        int iHnj = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_compliance_file", "user_compliance_status", -1);
        return iHnj == 1 || iHnj == 2;
    }

    public long orl() {
        return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_compliance_file", "allow_req_time", hnj.longValue());
    }

    public int qor() {
        return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_compliance_file", "app_reg", -1);
    }

    public boolean sk() {
        return (!gjv() && dkl() && ojm()) ? false : true;
    }

    public boolean ta() {
        return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_compliance_file", "user_compliance_status", -1) == -1;
    }

    private hn() {
        this.f14209hn = new AtomicBoolean(false);
    }

    public void hnj(int i10) {
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_compliance_file", "app_reg", Integer.valueOf(i10));
    }

    public void hnj(long j10) {
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_compliance_file", "allow_req_time", Long.valueOf(j10));
    }

    public void hnj(String str) {
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_compliance_file", "user_compliance_status_reason", str);
    }

    public void hnj(final gjv gjvVar, final boolean z10) {
        qor qorVar = new qor();
        qorVar.hnj(new gjv() { // from class: com.bytedance.sdk.openadsdk.core.ta.hn.1
            @Override // com.bytedance.sdk.openadsdk.core.ta.gjv
            public void hnj(boolean z11) {
                if (!z11) {
                    gjvVar.hnj(false);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.ta.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.ta.hnj(z10);
                hnjVar.hnj(new gjv() { // from class: com.bytedance.sdk.openadsdk.core.ta.hn.1.1
                    @Override // com.bytedance.sdk.openadsdk.core.ta.gjv
                    public void hnj(boolean z12) {
                        gjvVar.hnj(z12);
                    }
                });
                hnjVar.hnj();
            }
        });
        qorVar.hnj();
    }

    public void hn(int i10) {
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_compliance_file", "user_compliance_status", Integer.valueOf(i10));
    }
}
