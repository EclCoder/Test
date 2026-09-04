package com.bytedance.adsdk.ugeno.hnj;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {
    private com.bytedance.adsdk.ugeno.hn.qor gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private List<hnj> f12315hn;
    private List<qor> hnj;
    private Context qor;

    public dkl(Context context, com.bytedance.adsdk.ugeno.hn.qor qorVar, List<qor> list) {
        this.gjv = qorVar;
        this.qor = context;
        this.hnj = list;
        gjv();
    }

    private void gjv() {
        this.f12315hn = new ArrayList();
        List<qor> list = this.hnj;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.hnj.size(); i10++) {
            qor qorVar = this.hnj.get(i10);
            if (qorVar != null) {
                this.f12315hn.add(new hnj(this.qor, this.gjv, qorVar));
            }
        }
    }

    public void hn() {
        List<hnj> list = this.f12315hn;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (hnj hnjVar : this.f12315hn) {
            if (hnjVar != null) {
                hnjVar.hnj();
            }
        }
    }

    public void hnj() {
        List<hnj> list = this.f12315hn;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (hnj hnjVar : this.f12315hn) {
            if (hnjVar != null) {
                hnjVar.gjv();
            }
        }
    }

    public void qor() {
        List<hnj> list = this.f12315hn;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (hnj hnjVar : this.f12315hn) {
            if (hnjVar != null) {
                hnjVar.qor();
            }
        }
    }

    public void hn(Canvas canvas) {
        List<hnj> list = this.f12315hn;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (hnj hnjVar : this.f12315hn) {
            if (hnjVar != null) {
                hnjVar.hn(canvas);
            }
        }
    }

    public void hnj(Canvas canvas) {
        List<hnj> list = this.f12315hn;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (hnj hnjVar : this.f12315hn) {
            if (hnjVar != null) {
                hnjVar.hnj(canvas);
            }
        }
    }

    public void hnj(int i10, int i11) {
        List<hnj> list = this.f12315hn;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (hnj hnjVar : this.f12315hn) {
            if (hnjVar != null) {
                hnjVar.hnj(i10, i11);
            }
        }
    }

    public hnj hnj(String str) {
        List<hnj> list = this.f12315hn;
        if (list != null && !list.isEmpty()) {
            for (hnj hnjVar : this.f12315hn) {
                if (hnjVar != null && TextUtils.equals(hnjVar.sk(), str)) {
                    return hnjVar;
                }
            }
        }
        return null;
    }
}
