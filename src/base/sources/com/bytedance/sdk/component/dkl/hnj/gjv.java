package com.bytedance.sdk.component.dkl.hnj;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    public static final gjv hnj = new gjv();

    private void hn(hnj hnjVar, Context context) {
        qor.hnj(context, "context == null");
        qor.hnj(hnjVar, "AdLogConfig == null");
        qor.hnj(hnjVar.gjv(), "AdLogDepend ==null");
    }

    public void hnj(hnj hnjVar, Context context) {
        hn(hnjVar, context);
        dse.dkl().hnj(context);
        dse.dkl().hnj(hnjVar.ta());
        dse.dkl().hn(hnjVar.dse());
        dse.dkl().qor(hnjVar.aq());
        dse.dkl().hnj(hnjVar.hn());
        dse.dkl().gjv(hnjVar.ojm());
        dse.dkl().sk(hnjVar.dkl());
        dse.dkl().hnj(hnjVar.hnj() == null ? com.bytedance.sdk.component.dkl.hnj.hnj.hnj.sk.hnj : hnjVar.hnj());
        dse.dkl().hnj(hnjVar.gjv());
        dse.dkl().hnj(hnjVar.qor());
        dse.dkl().hnj(hnjVar.sk());
        com.bytedance.sdk.component.dkl.hnj.hn.hn.qor.hnj(hnjVar.bug());
        com.bytedance.sdk.component.dkl.hnj.hn.hn.qor.hn(hnjVar.dnm());
        hnj(hnjVar);
    }

    public void hn() {
        sk skVarFc = dse.dkl().fc();
        if (skVarFc == null || dse.dkl().sk() == null || skVarFc.gjv() == null) {
            return;
        }
        dse.dkl().ta();
    }

    private void hn(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        sk skVarFc = dse.dkl().fc();
        if (hnjVar == null || skVarFc == null || dse.dkl().sk() == null || skVarFc.gjv() == null) {
            return;
        }
        dse.dkl().hnj(hnjVar);
    }

    private void hnj(hnj hnjVar) {
        Executor executorSk;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.dkl.hnj.qor.hnj.hn()) {
            com.bytedance.sdk.component.dkl.hnj.qor.hnj.hnj();
            return;
        }
        sk skVarGjv = hnjVar.gjv();
        if (skVarGjv == null || !com.bytedance.sdk.component.dkl.hnj.qor.hnj.hn() || (executorSk = skVarGjv.sk()) == null) {
            return;
        }
        executorSk.execute(new Runnable() { // from class: com.bytedance.sdk.component.dkl.hnj.gjv.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.dkl.hnj.qor.hnj.hnj();
            }
        });
    }

    public void hnj(boolean z10) {
        dse.dkl().hnj(z10);
    }

    public void hnj() {
        sk skVarFc = dse.dkl().fc();
        if (skVarFc == null || dse.dkl().sk() == null || skVarFc.gjv() == null) {
            return;
        }
        dse.dkl().aq();
    }

    public void hnj(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        hn(hnjVar);
    }

    public void hnj(String str, List<String> list, boolean z10, Map<String, String> map, int i10, String str2) {
        sk skVarFc = dse.dkl().fc();
        if (skVarFc == null || dse.dkl().sk() == null || skVarFc.gjv() == null || !skVarFc.aq()) {
            return;
        }
        if (skVarFc.dkl() == 1) {
            if (list == null || list.isEmpty()) {
                return;
            }
        } else if (skVarFc.dkl() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
            return;
        }
        dse.dkl().hnj(str, list, z10, map, i10, str2);
    }

    public void hnj(String str, boolean z10) {
        sk skVarFc = dse.dkl().fc();
        if (skVarFc == null || dse.dkl().sk() == null || skVarFc.gjv() == null || !skVarFc.aq()) {
            return;
        }
        if (skVarFc.dkl() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        dse.dkl().hnj(str, z10);
    }
}
