package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.fvt;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class pty {
    private long aq;
    private long bug;
    private long dkl;
    private int dnm;
    private long dse;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public long f13986hn;
    public boolean hnj;
    private long ojm;
    private int orl;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f13987sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private long f13988ta;
    private fvt qor = fvt.qor();
    private fvt gjv = fvt.qor();

    public int aq() {
        return this.dnm;
    }

    public long dkl() {
        return this.ojm;
    }

    public long dse() {
        return this.f13988ta;
    }

    public long gjv() {
        return this.dse;
    }

    public void hn(fvt fvtVar) {
        this.gjv = fvtVar;
        this.ojm = fvtVar.hnj(this.qor);
    }

    public void hnj(fvt fvtVar, fvt fvtVar2, int i10, fvt fvtVar3) {
        this.f13987sk = fvtVar.hnj(this.qor);
        this.dkl = fvtVar2.hnj(fvtVar);
        this.dse = i10;
        this.aq = fvtVar3.hnj(fvtVar2);
    }

    public long ojm() {
        return this.bug;
    }

    public long qor() {
        return this.dkl;
    }

    public long sk() {
        return this.aq;
    }

    public synchronized int ta() {
        return this.orl;
    }

    public long hn() {
        return this.f13987sk;
    }

    public void hn(long j10) {
        this.bug = j10;
    }

    public synchronized void hn(int i10) {
        this.orl = i10;
    }

    public void hnj(fvt fvtVar) {
        this.qor = fvtVar;
    }

    public fvt hnj() {
        return this.qor;
    }

    public void hnj(long j10) {
        this.f13988ta = j10;
    }

    public void hnj(int i10) {
        this.dnm = i10;
    }
}
