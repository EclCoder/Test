package com.bytedance.sdk.component.hnj;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class mjg {
    public final String aq;
    public final String dkl;
    public final String dse;
    public final String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public final String f12899hn;
    public final int hnj;
    public final String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public final String f12900sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class hnj {
        private String dkl;
        private String dse;
        private String gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private String f12901hn;
        private String hnj;
        private String qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private String f12902sk;

        private hnj() {
        }

        public hnj dkl(String str) {
            this.dkl = str;
            return this;
        }

        public hnj dse(String str) {
            this.dse = str;
            return this;
        }

        public hnj gjv(String str) {
            this.gjv = str;
            return this;
        }

        public hnj hn(String str) {
            this.f12901hn = str;
            return this;
        }

        public hnj hnj(String str) {
            this.hnj = str;
            return this;
        }

        public hnj qor(String str) {
            this.qor = str;
            return this;
        }

        public hnj sk(String str) {
            this.f12902sk = str;
            return this;
        }

        public mjg hnj() {
            return new mjg(this);
        }
    }

    public static hnj hnj() {
        return new hnj();
    }

    public String toString() {
        return "methodName: " + this.gjv + ", params: " + this.f12900sk + ", callbackId: " + this.dkl + ", type: " + this.qor + ", version: " + this.f12899hn + ", ";
    }

    private mjg(String str, int i10) {
        this.f12899hn = null;
        this.qor = null;
        this.gjv = null;
        this.f12900sk = null;
        this.dkl = str;
        this.dse = null;
        this.hnj = i10;
        this.aq = null;
    }

    public static mjg hnj(String str, int i10) {
        return new mjg(str, i10);
    }

    public static boolean hnj(mjg mjgVar) {
        return mjgVar == null || mjgVar.hnj != 1 || TextUtils.isEmpty(mjgVar.gjv) || TextUtils.isEmpty(mjgVar.f12900sk);
    }

    private mjg(hnj hnjVar) {
        this.f12899hn = hnjVar.hnj;
        this.qor = hnjVar.f12901hn;
        this.gjv = hnjVar.qor;
        this.f12900sk = hnjVar.gjv;
        this.dkl = hnjVar.f12902sk;
        this.dse = hnjVar.dkl;
        this.hnj = 1;
        this.aq = hnjVar.dse;
    }
}
