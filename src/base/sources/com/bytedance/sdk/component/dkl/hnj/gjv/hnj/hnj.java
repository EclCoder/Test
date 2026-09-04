package com.bytedance.sdk.component.dkl.hnj.gjv.hnj;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements com.bytedance.sdk.component.dkl.hnj.gjv.hnj {
    private String aq;
    private long dkl;
    private int dnm;
    private long dse;
    private byte gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private hn f12766hn;
    protected JSONObject hnj;
    private byte ojm;
    private byte qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f12767sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private String f12768ta;

    public hnj(String str, JSONObject jSONObject) {
        this.aq = str;
        this.hnj = jSONObject;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.gjv.hnj
    public long aq() {
        return this.dkl;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.gjv.hnj
    public synchronized JSONObject dkl() {
        hn hnVar;
        try {
            if (this.hnj == null && (hnVar = this.f12766hn) != null) {
                this.hnj = hnVar.hnj(ta());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.hnj;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.gjv.hnj
    public long dse() {
        return this.f12767sk;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.gjv.hnj
    public byte gjv() {
        return this.qor;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.gjv.hnj
    public byte hn() {
        return this.ojm;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.gjv.hnj
    public hn hnj() {
        return this.f12766hn;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.gjv.hnj
    public int ojm() {
        return this.dnm;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.gjv.hnj
    public String qor() {
        return this.aq;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.gjv.hnj
    public byte sk() {
        return this.gjv;
    }

    public String ta() {
        return this.f12768ta;
    }

    public void hn(byte b10) {
        this.qor = b10;
    }

    public void hnj(byte b10) {
        this.ojm = b10;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.gjv.hnj
    public void qor(long j10) {
        this.dse = j10;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.gjv.hnj
    public void hn(long j10) {
        this.dkl = j10;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.gjv.hnj
    public void hnj(long j10) {
        this.f12767sk = j10;
    }

    public void qor(byte b10) {
        this.gjv = b10;
    }

    public hnj(String str, hn hnVar) {
        this.aq = str;
        this.f12766hn = hnVar;
    }

    public void hnj(int i10) {
        this.dnm = i10;
    }

    private hnj() {
    }
}
