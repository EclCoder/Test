package com.bytedance.sdk.openadsdk.p000do.hn;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.utils.orp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {
    private static final Map<Integer, hn> hnj = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public int f14326hn = -1;
        public int hnj;

        public hnj(int i10) {
            this.hnj = i10;
        }
    }

    public static void hn(Integer num) {
        hnj.remove(num);
    }

    public static void hnj(View view, as asVar, hnj hnjVar) {
        if (view == null || asVar == null || asVar.nn()) {
            return;
        }
        boolean zQor = qor(asVar);
        if (hqh.hn(asVar) && hnjVar != null) {
            hnjVar.hnj = -1;
        }
        hnj(hnj(view, asVar, zQor, hnjVar));
    }

    private static boolean qor(as asVar) {
        if (asVar == null) {
            return false;
        }
        String strHnj = orp.hnj(asVar);
        return ((!"open_ad".equals(strHnj) && !"fullscreen_interstitial_ad".equals(strHnj) && !"rewarded_video".equals(strHnj)) || hqh.hn(asVar) || asVar.qb() == 5 || asVar.qb() == 33 || !as.sk(asVar) || asVar.pwt() == null) ? false : true;
    }

    public static Integer hn(as asVar) {
        return Integer.valueOf((asVar.jp() + asVar.sp()).hashCode());
    }

    private static hn hnj(View view, as asVar, boolean z10, hnj hnjVar) {
        if (view == null || asVar == null || asVar.sp() == null) {
            return null;
        }
        Integer numHn = hn(asVar);
        Map<Integer, hn> map = hnj;
        if (map.containsKey(numHn)) {
            hn hnVar = map.get(numHn);
            if (hnVar != null) {
                hnVar.hnj(view);
            }
            return hnVar;
        }
        hn hnVarHnj = hn.hnj(z10, numHn, view, asVar, hnjVar);
        map.put(numHn, hnVarHnj);
        return hnVarHnj;
    }

    private static void hnj(hn hnVar) {
        if (hnVar == null) {
            return;
        }
        hnVar.hnj();
    }

    public static void hnj(as asVar, int i10) {
        if (asVar == null || asVar.sp() == null) {
            return;
        }
        hnj(hnj.get(hn(asVar)), i10);
    }

    public static void hnj(hn hnVar, int i10) {
        if (hnVar == null) {
            return;
        }
        hnVar.hnj(i10);
    }

    public static void hnj(as asVar) {
        if (asVar == null || asVar.sp() == null) {
            return;
        }
        Integer numHn = hn(asVar);
        Map<Integer, hn> map = hnj;
        hn hnVar = map.get(numHn);
        if (hnVar != null) {
            hnVar.ta();
        }
        hn(numHn);
        if (map.size() <= 0) {
            dse.hnj();
        }
    }

    public static hn hnj(Integer num) {
        return hnj.get(num);
    }
}
