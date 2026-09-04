package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class oj {
    private String dkl;
    private double gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f13983hn;
    private String hnj;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f13984sk;

    public boolean dkl() {
        return this.f13984sk;
    }

    public String dse() {
        return this.dkl;
    }

    public double gjv() {
        return this.gjv;
    }

    public int hn() {
        return this.f13983hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public int qor() {
        return this.qor;
    }

    public boolean sk() {
        return !TextUtils.isEmpty(this.hnj) && this.f13983hn > 0 && this.qor > 0;
    }

    public void hn(int i10) {
        this.qor = i10;
    }

    public void hnj(String str) {
        this.hnj = str;
    }

    public void hn(String str) {
        this.dkl = str;
    }

    public void hnj(int i10) {
        this.f13983hn = i10;
    }

    public void hnj(boolean z10) {
        this.f13984sk = z10;
    }
}
