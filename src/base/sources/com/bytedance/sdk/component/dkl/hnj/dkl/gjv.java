package com.bytedance.sdk.component.dkl.hnj.dkl;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    private String aq;
    private final String dkl;
    private boolean dnm;
    private String dse;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f12753hn;
    private final String hnj;
    private final boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final int f12754sk;
    private int gjv = -1;
    private int ojm = 0;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private String f12755ta = null;

    gjv(String str, String str2, boolean z10, int i10, String str3) {
        this.hnj = str;
        this.f12753hn = str2;
        this.qor = z10;
        this.f12754sk = i10;
        this.dkl = str3;
    }

    public int aq() {
        return this.ojm;
    }

    public String dkl() {
        return this.dkl;
    }

    public boolean dnm() {
        return this.gjv == -1;
    }

    public String dse() {
        return this.dse;
    }

    public int gjv() {
        return this.gjv;
    }

    public String hn() {
        return this.f12753hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public String ojm() {
        return this.aq;
    }

    public boolean qor() {
        return this.qor;
    }

    public int sk() {
        return this.f12754sk;
    }

    public boolean ta() {
        return this.dnm;
    }

    public void hn(int i10) {
        this.ojm = i10;
        if (i10 == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.dse)) {
            this.dse = String.valueOf(this.ojm);
            return;
        }
        this.dse += "," + this.ojm;
    }

    public void hnj(int i10) {
        this.gjv = i10;
    }

    public void qor(String str) {
        this.f12755ta = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.aq)) {
            this.aq = String.valueOf(this.f12755ta);
            return;
        }
        this.aq += "," + this.f12755ta;
    }

    public void hnj(String str) {
        this.dse = str;
    }

    public void hnj(boolean z10) {
        this.dnm = z10;
    }

    public Runnable hnj(String str, Map<String, String> map) {
        return hnj.hnj().hnj(this, str, map);
    }

    public void hn(String str) {
        this.aq = str;
    }
}
