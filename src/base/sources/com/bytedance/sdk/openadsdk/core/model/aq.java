package com.bytedance.sdk.openadsdk.core.model;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq {
    private int dkl;
    private int dse;
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f13878hn;
    private int hnj;
    private List<Integer> qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private List<String> f13879sk;

    public List<Integer> dkl() {
        return this.qor;
    }

    public int dse() {
        return this.gjv;
    }

    public int gjv() {
        return this.hnj;
    }

    public int hn() {
        int i10 = this.dse;
        if (i10 >= 2) {
            return i10;
        }
        return 0;
    }

    public boolean hnj() {
        return this.dkl == 1;
    }

    public List<String> qor() {
        return this.f13879sk;
    }

    public int sk() {
        return this.f13878hn;
    }

    public void gjv(int i10) {
        this.f13878hn = i10;
    }

    public void hn(int i10) {
        this.dse = i10;
    }

    public void hnj(int i10) {
        this.dkl = i10;
    }

    public void qor(int i10) {
        this.hnj = i10;
    }

    public void sk(int i10) {
        this.gjv = i10;
    }

    public void hn(List<Integer> list) {
        this.qor = list;
    }

    public void hnj(List<String> list) {
        this.f13879sk = list;
    }
}
