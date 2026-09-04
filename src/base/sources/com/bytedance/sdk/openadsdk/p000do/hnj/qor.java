package com.bytedance.sdk.openadsdk.p000do.hnj;

import com.bytedance.sdk.openadsdk.core.model.as;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static int f14332hn = 6;
    public static boolean hnj = false;
    public static String qor = "engaged_view";

    public static void hn(as asVar) {
        hn hnVarQor = qor(asVar);
        if (hnVarQor == null) {
            return;
        }
        hnVarQor.hn();
    }

    public static void hnj(as asVar) {
        hn hnVarQor = qor(asVar);
        if (hnVarQor == null) {
            return;
        }
        hnVarQor.hnj();
    }

    private static hn qor(as asVar) {
        if (asVar == null || !asVar.udr()) {
            return null;
        }
        return asVar.xht();
    }

    public static void hnj(as asVar, int i10) {
        hn hnVarQor = qor(asVar);
        if (hnVarQor == null || hnVarQor.qor()) {
            return;
        }
        hnVarQor.hnj(i10);
    }

    public static void hnj(as asVar, boolean z10) {
        hn hnVarQor = qor(asVar);
        if (hnVarQor == null || hnVarQor.qor()) {
            return;
        }
        hnVarQor.hnj(z10);
        hnVarQor.hnj(z10 ? 4 : 8);
    }
}
