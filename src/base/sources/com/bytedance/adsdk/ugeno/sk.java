package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.gjv.aq;
import com.bytedance.adsdk.ugeno.gjv.ta;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {
    private static volatile sk hnj;
    private com.bytedance.adsdk.ugeno.core.hn.gjv dkl;
    private com.bytedance.adsdk.ugeno.core.hnj.hnj dse;
    private hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private List<com.bytedance.adsdk.ugeno.core.hn> f12393hn;
    private com.bytedance.adsdk.ugeno.core.qor qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.qor.hnj f12394sk;

    private sk() {
    }

    private void dkl() {
        ArrayList arrayList = new ArrayList();
        this.f12393hn = arrayList;
        com.bytedance.adsdk.ugeno.core.qor qorVar = this.qor;
        if (qorVar != null) {
            arrayList.addAll(qorVar.hnj());
        }
        com.bytedance.adsdk.ugeno.core.gjv.hnj(this.f12393hn);
    }

    public static sk hnj() {
        if (hnj == null) {
            synchronized (sk.class) {
                try {
                    if (hnj == null) {
                        hnj = new sk();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public com.bytedance.adsdk.ugeno.core.hn.gjv gjv() {
        return this.dkl;
    }

    public hnj hn() {
        return this.gjv;
    }

    public com.bytedance.adsdk.ugeno.qor.hnj qor() {
        return this.f12394sk;
    }

    public com.bytedance.adsdk.ugeno.core.hnj.hnj sk() {
        return this.dse;
    }

    public void hnj(Context context, com.bytedance.adsdk.ugeno.core.qor qorVar, hnj hnjVar) {
        this.qor = qorVar;
        this.gjv = hnjVar;
        dkl();
    }

    public void hnj(com.bytedance.adsdk.ugeno.qor.hnj hnjVar) {
        this.f12394sk = hnjVar;
    }

    public void hnj(aq aqVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.gjv.hnj().hnj());
        if (aqVar != null) {
            arrayList.addAll(aqVar.hnj());
        }
        ta.hnj(arrayList);
    }

    public void hnj(com.bytedance.adsdk.ugeno.gjv.qor qorVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.gjv.sk().hnj());
        if (qorVar != null) {
            arrayList.addAll(qorVar.hnj());
        }
        com.bytedance.adsdk.ugeno.gjv.gjv.hnj(arrayList);
    }
}
