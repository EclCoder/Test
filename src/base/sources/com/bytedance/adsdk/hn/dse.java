package com.bytedance.adsdk.hn;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse {
    private LongSparseArray<com.bytedance.adsdk.hn.qor.qor.sk> aq;
    private float bug;
    private List<com.bytedance.adsdk.hn.qor.dkl> dkl;
    private float dnm;
    private SparseArray<com.bytedance.adsdk.hn.qor.gjv> dse;
    private Map<String, ta> gjv;
    private qor jip;
    private boolean mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private hnj f11936oj;
    private List<com.bytedance.adsdk.hn.qor.qor.sk> ojm;
    private float orl;
    private Map<String, List<com.bytedance.adsdk.hn.qor.qor.sk>> qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Map<String, com.bytedance.adsdk.hn.qor.qor> f11937sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private Rect f11938ta;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private hn f11939xn;
    private final oj hnj = new oj();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final HashSet<String> f11935hn = new HashSet<>();

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private int f11934fc = 0;
    private String uua = "";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hn {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public int[][] f11940hn;
        public String hnj;
        public JSONArray qor;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        public String dkl;
        public JSONArray dse;
        public int gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public Map<String, Object> f11941hn;
        public int hnj;
        public Map<String, Object> qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        public int f11942sk;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class qor {
        public String dkl;
        public JSONArray dse;
        public String gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public String f11943hn;
        public int hnj;
        public String qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        public int[] f11944sk;
    }

    public qor aq() {
        return this.jip;
    }

    public float bug() {
        return this.orl;
    }

    public float dkl() {
        return this.dnm;
    }

    public hnj dnm() {
        return this.f11936oj;
    }

    public float dse() {
        return this.bug;
    }

    public Map<String, com.bytedance.adsdk.hn.qor.qor> fc() {
        return this.f11937sk;
    }

    public Rect gjv() {
        return this.f11938ta;
    }

    public int hn() {
        return this.f11934fc;
    }

    public void hnj(Rect rect, float f10, float f11, float f12, List<com.bytedance.adsdk.hn.qor.qor.sk> list, LongSparseArray<com.bytedance.adsdk.hn.qor.qor.sk> longSparseArray, Map<String, List<com.bytedance.adsdk.hn.qor.qor.sk>> map, Map<String, ta> map2, SparseArray<com.bytedance.adsdk.hn.qor.gjv> sparseArray, Map<String, com.bytedance.adsdk.hn.qor.qor> map3, List<com.bytedance.adsdk.hn.qor.dkl> list2, qor qorVar, String str, hnj hnjVar, hn hnVar) {
        this.f11938ta = rect;
        this.dnm = f10;
        this.bug = f11;
        this.orl = f12;
        this.ojm = list;
        this.aq = longSparseArray;
        this.qor = map;
        this.gjv = map2;
        this.dse = sparseArray;
        this.f11937sk = map3;
        this.dkl = list2;
        this.jip = qorVar;
        this.uua = str;
        this.f11936oj = hnjVar;
        this.f11939xn = hnVar;
    }

    public Map<String, ta> jip() {
        return this.gjv;
    }

    public SparseArray<com.bytedance.adsdk.hn.qor.gjv> mjg() {
        return this.dse;
    }

    public String ojm() {
        return this.uua;
    }

    public List<com.bytedance.adsdk.hn.qor.qor.sk> orl() {
        return this.ojm;
    }

    public oj qor() {
        return this.hnj;
    }

    public float sk() {
        return (long) ((uua() / this.orl) * 1000.0f);
    }

    public hn ta() {
        return this.f11939xn;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.hn.qor.qor.sk> it = this.ojm.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().hnj("\t"));
        }
        return sb2.toString();
    }

    public float uua() {
        return this.bug - this.dnm;
    }

    public void hn(boolean z10) {
        this.hnj.hnj(z10);
    }

    public com.bytedance.adsdk.hn.qor.dkl qor(String str) {
        int size = this.dkl.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.bytedance.adsdk.hn.qor.dkl dklVar = this.dkl.get(i10);
            if (dklVar.hnj(str)) {
                return dklVar;
            }
        }
        return null;
    }

    public List<com.bytedance.adsdk.hn.qor.qor.sk> hn(String str) {
        return this.qor.get(str);
    }

    public void hnj(String str) {
        this.f11935hn.add(str);
    }

    public void hnj(boolean z10) {
        this.mjg = z10;
    }

    public void hnj(int i10) {
        this.f11934fc += i10;
    }

    public boolean hnj() {
        return this.mjg;
    }

    public com.bytedance.adsdk.hn.qor.qor.sk hnj(long j10) {
        return this.aq.get(j10);
    }

    public float hnj(float f10) {
        return com.bytedance.adsdk.hn.dkl.sk.hnj(this.dnm, this.bug, f10);
    }
}
