package com.bytedance.sdk.component.adexpress.dynamic.gjv;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta {
    private JSONObject aq;
    private JSONObject dkl;
    private JSONObject dse;
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12616hn;
    private int hnj;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12617sk;

    public JSONObject aq() {
        return this.aq;
    }

    public JSONObject dkl() {
        return this.dkl;
    }

    public JSONObject dse() {
        return this.dse;
    }

    public int gjv() {
        return this.gjv;
    }

    public int hn() {
        return this.f12616hn;
    }

    public int hnj() {
        return this.hnj;
    }

    public int qor() {
        return this.qor;
    }

    public int sk() {
        return this.f12617sk;
    }

    public void gjv(int i10) {
        this.gjv = i10;
    }

    public void hn(int i10) {
        this.f12616hn = i10;
    }

    public void hnj(int i10) {
        this.hnj = i10;
    }

    public void qor(int i10) {
        this.qor = i10;
    }

    public void sk(int i10) {
        this.f12617sk = i10;
    }

    public void hn(JSONObject jSONObject) {
        this.dse = jSONObject;
    }

    public void hnj(JSONObject jSONObject) {
        this.dkl = jSONObject;
    }

    public void qor(JSONObject jSONObject) {
        this.aq = jSONObject;
    }
}
