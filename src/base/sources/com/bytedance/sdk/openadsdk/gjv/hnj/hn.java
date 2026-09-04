package com.bytedance.sdk.openadsdk.gjv.hnj;

import android.content.Context;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.orl;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    public static AtomicInteger hnj = new AtomicInteger(0);

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static final AtomicBoolean f14371hn = new AtomicBoolean(false);

    public static void hn() {
        com.bytedance.sdk.component.dkl.hnj.hn.qor();
    }

    public static void hnj(Context context) {
        try {
            if (f14371hn.compareAndSet(false, true)) {
                com.bytedance.sdk.component.dkl.hnj.hn.hnj(new com.bytedance.sdk.component.dkl.hnj.hnj.C0186hnj().hnj(new dkl()).hn(com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj.qor()).qor(com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj.sk()).hnj(com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj.gjv()).hnj(new dse()).hnj(gjv.hnj).hn(oj.gjv().mjg()).hnj(oj.gjv().fc()).hnj(oj.gjv().meb()).hnj(), context);
                hn();
            }
        } catch (Throwable unused) {
            f14371hn.set(false);
        }
    }

    public static void qor() {
        try {
            com.bytedance.sdk.component.dkl.hnj.hn.gjv();
            com.bytedance.sdk.component.dkl.hnj.hn.sk();
        } catch (Throwable th2) {
            apu.qor("AdLogSwitchUtils", th2.getMessage());
        }
    }

    public static void hnj(com.bytedance.sdk.openadsdk.gjv.hnj hnjVar) {
        com.bytedance.sdk.component.dkl.hnj.gjv.hnj.hnj hnjVar2 = new com.bytedance.sdk.component.dkl.hnj.gjv.hnj.hnj(hnjVar.sk(), hnjVar);
        hnjVar2.qor(hnjVar.dkl() ? (byte) 1 : (byte) 2);
        hnjVar2.hn((byte) 0);
        if (com.bytedance.sdk.component.dkl.hnj.hn.hn()) {
            hnj(oj.hnj());
        }
        com.bytedance.sdk.component.dkl.hnj.hn.hnj(hnjVar2);
    }

    public static com.bytedance.sdk.openadsdk.jip.hn.qor hnj() {
        return aq.hnj;
    }

    public static void hnj(final List<String> list, final int i10, final String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(new com.bytedance.sdk.component.aq.hn.qor("track") { // from class: com.bytedance.sdk.openadsdk.gjv.hnj.hn.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.dkl.hnj.hn.hn()) {
                    hn.hnj(oj.hnj());
                }
                com.bytedance.sdk.component.dkl.hnj.hn.hnj(orl.hnj(oj.hnj()), list, true, i10, str);
            }
        });
    }

    public static void hnj(String str) {
        hnj(str, false);
    }

    public static void hnj(String str, boolean z10) {
        if (com.bytedance.sdk.component.dkl.hnj.hn.hn()) {
            hnj(oj.hnj());
        }
        com.bytedance.sdk.component.dkl.hnj.hn.hnj(str, z10);
    }
}
