package com.bytedance.sdk.openadsdk.gjv.hnj;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta {
    public static ta hnj = new ta();
    private volatile boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private hnj f14376hn;
    private final Map<String, hnj> qor = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final int f14377hn;
        private final int hnj;

        public hnj(int i10, int i11) {
            this.hnj = (i10 < 0 || i10 > 5) ? 3 : i10;
            this.f14377hn = i11 < 10 ? 30 : i11;
        }

        public int hn() {
            return this.f14377hn;
        }

        public int hnj() {
            return this.hnj;
        }
    }

    private int hn() {
        hnj hnjVar = this.f14376hn;
        if (hnjVar != null) {
            return hnjVar.hnj();
        }
        return 3;
    }

    private int qor() {
        hnj hnjVar = this.f14376hn;
        if (hnjVar != null) {
            return hnjVar.hn();
        }
        return 30;
    }

    public void hnj(hnj hnjVar) {
        this.f14376hn = hnjVar;
    }

    public void hnj(String str, hnj hnjVar) {
        if (TextUtils.isEmpty(str) || hnjVar == null) {
            return;
        }
        this.qor.put(str, hnjVar);
    }

    public int hn(String str) {
        hnj hnjVar = this.qor.get(str);
        if (hnjVar == null) {
            return qor();
        }
        return hnjVar.hn();
    }

    public int hnj(String str) {
        if (!hnj()) {
            return 4;
        }
        hnj hnjVar = this.qor.get(str);
        if (hnjVar == null) {
            return hn();
        }
        return hnjVar.hnj();
    }

    public boolean hnj() {
        return this.gjv;
    }

    public void hnj(boolean z10) {
        this.gjv = z10;
    }
}
