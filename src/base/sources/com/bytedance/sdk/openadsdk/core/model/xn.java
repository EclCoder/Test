package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class xn {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static int f14014hn = 2;
    public static int hnj = 1;
    private int qor = 5;
    private int gjv = 30;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f14015sk = 70;
    private int dkl = 1;
    private int dse = hnj;
    private int aq = 0;
    private int ojm = 0;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f14016ta = 3;

    public int aq() {
        return this.dse;
    }

    public int dkl() {
        return this.f14015sk;
    }

    public int dse() {
        return this.dkl;
    }

    public int gjv() {
        return this.qor;
    }

    public int hn() {
        return this.ojm;
    }

    public int hnj() {
        return this.f14016ta;
    }

    public int qor() {
        return this.aq;
    }

    public int sk() {
        return this.gjv;
    }

    public void aq(int i10) {
        this.dse = i10;
    }

    public void dkl(int i10) {
        this.f14015sk = i10;
    }

    public void dse(int i10) {
        this.dkl = i10;
    }

    public void gjv(int i10) {
        this.qor = i10;
    }

    public void hn(int i10) {
        this.ojm = i10;
    }

    public void hnj(int i10) {
        this.f14016ta = i10;
    }

    public void qor(int i10) {
        this.aq = i10;
    }

    public void sk(int i10) {
        this.gjv = i10;
    }

    public boolean hnj(boolean z10) {
        if (z10) {
            int i10 = this.aq;
            return i10 == 1 || i10 == 3;
        }
        int i11 = this.aq;
        return i11 == 3 || i11 == 2;
    }
}
