package com.bytedance.adsdk.ugeno.sk;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    int aq;
    int bug;
    int dkl;
    float dnm;
    int dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    int f12406fc;
    int jip;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    boolean f12408oj;
    int ojm;
    int orl;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    int f12409sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    float f12410ta;
    boolean uua;
    int hnj = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    int f12407hn = Integer.MAX_VALUE;
    int qor = Integer.MIN_VALUE;
    int gjv = Integer.MIN_VALUE;
    List<Integer> mjg = new ArrayList();

    qor() {
    }

    public int hn() {
        return this.aq - this.ojm;
    }

    public int hnj() {
        return this.dse;
    }

    void hnj(View view, int i10, int i11, int i12, int i13) {
        hn hnVar = (hn) view.getLayoutParams();
        this.hnj = Math.min(this.hnj, (view.getLeft() - hnVar.orl()) - i10);
        this.f12407hn = Math.min(this.f12407hn, (view.getTop() - hnVar.mjg()) - i11);
        this.qor = Math.max(this.qor, view.getRight() + hnVar.fc() + i12);
        this.gjv = Math.max(this.gjv, view.getBottom() + hnVar.jip() + i13);
    }
}
