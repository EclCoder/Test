package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class jip implements com.bytedance.sdk.component.adexpress.qor {
    public int aq;
    public int bug;
    public final long dkl;
    public final boolean dnm;
    public final String dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    public int f13974fc;
    public final float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public final float f13975hn;
    public final float hnj;
    public boolean mjg;
    public JSONObject ojm;
    public JSONObject orl;
    public final float qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public final long f13976sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> f13977ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        private int aq;
        private int bug;
        private float dkl;
        private JSONObject dnm;
        private float dse;

        /* JADX INFO: renamed from: fc, reason: collision with root package name */
        private boolean f13978fc;
        private float gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private long f13979hn;
        private String ojm;
        private JSONObject orl;
        private long qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private float f13980sk;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private int f13981ta;
        private boolean mjg = false;
        protected SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> hnj = new SparseArray<>();

        public hnj gjv(float f10) {
            this.dse = f10;
            return this;
        }

        public hnj hn(int i10) {
            this.f13981ta = i10;
            return this;
        }

        public hnj hnj(int i10) {
            this.bug = i10;
            return this;
        }

        public hnj qor(int i10) {
            this.aq = i10;
            return this;
        }

        public hnj hn(long j10) {
            this.qor = j10;
            return this;
        }

        public hnj hnj(JSONObject jSONObject) {
            this.dnm = jSONObject;
            return this;
        }

        public hnj qor(float f10) {
            this.dkl = f10;
            return this;
        }

        public hnj hn(float f10) {
            this.f13980sk = f10;
            return this;
        }

        public hnj hnj(boolean z10) {
            this.f13978fc = z10;
            return this;
        }

        public hnj hn(JSONObject jSONObject) {
            this.orl = jSONObject;
            return this;
        }

        public hnj hnj(long j10) {
            this.f13979hn = j10;
            return this;
        }

        public hnj hn(boolean z10) {
            this.mjg = z10;
            return this;
        }

        public hnj hnj(float f10) {
            this.gjv = f10;
            return this;
        }

        public hnj hnj(String str) {
            this.ojm = str;
            return this;
        }

        public hnj hnj(SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray) {
            this.hnj = sparseArray;
            return this;
        }

        public jip hnj() {
            return new jip(this);
        }
    }

    private jip(hnj hnjVar) {
        this.mjg = false;
        this.hnj = hnjVar.dse;
        this.f13975hn = hnjVar.dkl;
        this.qor = hnjVar.f13980sk;
        this.gjv = hnjVar.gjv;
        this.f13976sk = hnjVar.qor;
        this.dkl = hnjVar.f13979hn;
        this.dse = hnjVar.ojm;
        this.f13977ta = hnjVar.hnj;
        this.dnm = hnjVar.f13978fc;
        this.aq = hnjVar.f13981ta;
        this.ojm = hnjVar.dnm;
        this.bug = hnjVar.bug;
        this.orl = hnjVar.orl;
        this.mjg = hnjVar.mjg;
        this.f13974fc = hnjVar.aq;
    }
}
