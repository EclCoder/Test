package com.bytedance.adsdk.hn;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta {
    private final String aq;
    private final String dkl;
    private Bitmap dnm;
    private final List<hnj> dse;
    private final String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final int f12135hn;
    private final int hnj;
    private final int[][] ojm;
    private final String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final String f12136sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final JSONArray f12137ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        public int dkl;
        public String dse;
        public String gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public int f12138hn;
        public int hnj;
        public String qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        public int f12139sk;
    }

    public ta(int i10, int i11, String str, String str2, String str3, String str4, List<hnj> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.hnj = i10;
        this.f12135hn = i11;
        this.qor = str;
        this.gjv = str2;
        this.f12136sk = str3;
        this.dkl = str4;
        this.dse = list;
        this.aq = str5;
        this.ojm = iArr;
        this.f12137ta = jSONArray;
    }

    public String aq() {
        return this.qor;
    }

    public int[][] dkl() {
        return this.ojm;
    }

    public Bitmap dnm() {
        return this.dnm;
    }

    public JSONArray dse() {
        return this.f12137ta;
    }

    public String gjv() {
        return this.dkl;
    }

    public int hn() {
        return this.f12135hn;
    }

    public int hnj() {
        return this.hnj;
    }

    public String ojm() {
        return this.gjv;
    }

    public List<hnj> qor() {
        return this.dse;
    }

    public String sk() {
        return this.aq;
    }

    public String ta() {
        return this.f12136sk;
    }

    public void hnj(Bitmap bitmap) {
        this.dnm = bitmap;
    }
}
