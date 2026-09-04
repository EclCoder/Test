package com.bytedance.sdk.openadsdk.jip.hnj;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.orp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private String dkl;
    private int dse;
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private as f14544hn;
    private String hnj;
    private String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f14545sk;
    private int aq = 0;
    private int ojm = 0;

    public int aq() {
        return this.aq;
    }

    public String dkl() {
        return this.dkl;
    }

    public int dse() {
        return this.dse;
    }

    public int gjv() {
        return this.gjv;
    }

    public as hn() {
        return this.f14544hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public int ojm() {
        return this.ojm;
    }

    public String qor() {
        as asVar;
        if (TextUtils.isEmpty(this.qor) && (asVar = this.f14544hn) != null) {
            this.qor = orp.hnj(asVar);
        }
        return this.qor;
    }

    public boolean sk() {
        return this.f14545sk;
    }

    public void hn(String str) {
        this.qor = str;
    }

    public void hnj(String str) {
        this.hnj = str;
    }

    public void hn(int i10) {
        this.dse = i10;
    }

    public void hnj(as asVar) {
        this.f14544hn = asVar;
    }

    public void hnj(int i10) {
        this.gjv = i10;
    }

    public void hnj(boolean z10) {
        this.f14545sk = z10;
    }

    public void qor(String str) {
        this.dkl = str;
    }
}
