package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class vf {
    public static ConcurrentHashMap<Integer, vf> hnj = new ConcurrentHashMap<>();
    private String dkl;
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f14251hn = "";
    private String qor = "";

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f14252sk;

    private void dkl() {
        this.f14251hn = "";
        this.qor = "";
        this.gjv = 0;
        this.f14252sk = 0;
    }

    public int gjv() {
        return this.gjv;
    }

    public String hn() {
        return this.f14251hn;
    }

    public String hnj() {
        return this.dkl;
    }

    public String qor() {
        return this.qor;
    }

    public int sk() {
        return this.f14252sk;
    }

    public static void qor(int i10) {
        vf vfVar;
        if (i10 == 0) {
            return;
        }
        if (hnj == null) {
            hnj = new ConcurrentHashMap<>();
        }
        if (!hnj.containsKey(Integer.valueOf(i10)) || (vfVar = hnj.get(Integer.valueOf(i10))) == null) {
            return;
        }
        vfVar.hn(1);
    }

    public void hn(int i10) {
        this.f14252sk = i10;
    }

    public void hnj(int i10) {
        this.gjv = i10;
    }

    public static void hn(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (asVar == null || TextUtils.isEmpty(asVar.ldn())) {
            return;
        }
        int iAtw = asVar.atw();
        Integer numValueOf = Integer.valueOf(iAtw);
        if (iAtw == 0) {
            return;
        }
        if (hnj == null) {
            hnj = new ConcurrentHashMap<>();
        }
        vf vfVar = hnj.containsKey(numValueOf) ? hnj.get(numValueOf) : null;
        if (vfVar == null) {
            vfVar = new vf();
        }
        String strJp = asVar.jp();
        if (TextUtils.isEmpty(strJp) || !strJp.equals(vfVar.hnj())) {
            vfVar.dkl();
            vfVar.hnj(asVar);
            hnj.put(numValueOf, vfVar);
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (asVar != null) {
            String strJp = asVar.jp();
            if (!TextUtils.isEmpty(strJp)) {
                this.dkl = strJp;
            }
            String strXe = asVar.xe();
            if (TextUtils.isEmpty(strXe) && asVar.qs()) {
                strXe = asVar.mzt().ojm();
            }
            if (!TextUtils.isEmpty(strXe)) {
                String[] strArrSplit = strXe.split("/");
                if (strArrSplit.length >= 3) {
                    this.f14251hn = strArrSplit[2];
                }
            }
            if (asVar.zyh() == null || TextUtils.isEmpty(asVar.zyh().qor())) {
                return;
            }
            this.qor = asVar.zyh().qor();
        }
    }

    public static void qor(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        vf vfVar;
        if (asVar == null) {
            return;
        }
        int iAtw = asVar.atw();
        Integer numValueOf = Integer.valueOf(iAtw);
        if (iAtw == 0) {
            return;
        }
        if (hnj == null) {
            hnj = new ConcurrentHashMap<>();
        }
        if (!hnj.containsKey(numValueOf) || (vfVar = hnj.get(numValueOf)) == null) {
            return;
        }
        vfVar.hnj(1);
    }
}
