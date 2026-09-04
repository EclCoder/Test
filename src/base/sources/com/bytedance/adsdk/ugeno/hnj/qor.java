package com.bytedance.adsdk.ugeno.hnj;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private String aq;
    private hnj dkl;
    private String dse;
    private String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f12331hn;
    private Map<String, TreeMap<Float, String>> hnj;
    private int ojm = 1;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f12332sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private JSONObject f12333ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public String f12334hn;
        public String hnj;
    }

    public String aq() {
        return this.dse;
    }

    public long dkl() {
        return this.f12332sk;
    }

    public hnj dse() {
        return this.dkl;
    }

    public int gjv() {
        return this.qor;
    }

    public Map<String, TreeMap<Float, String>> hn() {
        return this.hnj;
    }

    public JSONObject hnj() {
        return this.f12333ta;
    }

    public String ojm() {
        return this.aq;
    }

    public long qor() {
        return this.f12331hn;
    }

    public String sk() {
        return this.gjv;
    }

    public int ta() {
        return this.ojm;
    }

    public String toString() {
        return "AnimationModel{mKeyFramesMap=" + this.hnj + ", mDuration=" + this.f12331hn + ", mPlayCount=" + this.qor + ", mPlayDirection=" + this.gjv + ", mDelay=" + this.f12332sk + ", mName=" + this.aq + ", mPlayState=" + this.ojm + ", mTransformOrigin='" + this.dkl + "', mTimingFunction='" + this.dse + "'}";
    }

    public void hn(long j10) {
        this.f12332sk = j10;
    }

    public void hnj(JSONObject jSONObject) {
        this.f12333ta = jSONObject;
    }

    public void qor(String str) {
        this.aq = str;
    }

    public void hn(String str) {
        this.dse = str;
    }

    public void hnj(Map<String, TreeMap<Float, String>> map) {
        this.hnj = map;
    }

    public void hn(int i10) {
        this.ojm = i10;
    }

    public void hnj(long j10) {
        this.f12331hn = j10;
    }

    public void hnj(int i10) {
        this.qor = i10;
    }

    public void hnj(String str) {
        this.gjv = str;
    }

    public void hnj(hnj hnjVar) {
        this.dkl = hnjVar;
    }
}
