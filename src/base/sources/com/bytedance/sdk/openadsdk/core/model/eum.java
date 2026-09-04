package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class eum {
    private long hnj = 10000;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f13957hn = 10000;
    private long qor = 10;
    private long gjv = 20;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f13958sk = "";

    public long gjv() {
        return this.gjv;
    }

    public long hn() {
        return this.f13957hn;
    }

    public long hnj() {
        return this.hnj;
    }

    public long qor() {
        return this.qor;
    }

    public String sk() {
        return this.f13958sk;
    }

    public void gjv(long j10) {
        if (j10 < 0) {
            this.gjv = 20L;
        } else {
            this.gjv = j10;
        }
    }

    public void hn(long j10) {
        if (j10 < 0) {
            this.f13957hn = 20L;
        } else {
            this.f13957hn = j10;
        }
    }

    public void hnj(long j10) {
        if (j10 <= 0) {
            this.hnj = 10L;
        } else {
            this.hnj = j10;
        }
    }

    public void qor(long j10) {
        if (j10 <= 0) {
            this.qor = 10L;
        } else {
            this.qor = j10;
        }
    }

    public void hnj(String str) {
        this.f13958sk = str;
    }
}
