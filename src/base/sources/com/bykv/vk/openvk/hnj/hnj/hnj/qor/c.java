package com.bykv.vk.openvk.hnj.hnj.hnj.qor;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Serializable {
    private boolean apu;
    private String aq;
    private a dkl;
    private a dse;
    private int eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private int f11661fc;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public String f11662hn;
    private int jip;
    private String mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private long f11663oj;
    private boolean ojm;
    public int qor;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private boolean f11665ta;
    private String uua;
    private int wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private boolean f11667xn;
    private int xyo;
    private int dnm = 204800;
    private int bug = 0;
    private int orl = 0;
    protected float hnj = -1.0f;
    public final HashMap<String, Object> gjv = new HashMap<>();
    private int as = 10000;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private int f1do = 10000;
    private int tu = 10000;
    private int tgn = 0;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public int f11664sk = 1;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private JSONObject f11666vf = new JSONObject();

    public c(String str, a aVar, a aVar2, int i10, int i11) {
        this.eum = 0;
        this.wu = 0;
        this.aq = str;
        this.dkl = aVar;
        this.dse = aVar2;
        this.eum = i10;
        this.wu = i11;
    }

    public int apu() {
        return this.f1do;
    }

    public int aq() {
        return this.f11661fc;
    }

    public a as() {
        return this.dkl;
    }

    public long bug() {
        if (mjg()) {
            return this.dse.G();
        }
        a aVar = this.dkl;
        if (aVar != null) {
            return aVar.G();
        }
        return 0L;
    }

    public int dkl() {
        if (mjg()) {
            return this.dse.l();
        }
        a aVar = this.dkl;
        if (aVar != null) {
            return aVar.l();
        }
        return 0;
    }

    public boolean dnm() {
        return this.f11667xn;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public a m0do() {
        return this.dse;
    }

    public boolean dse() {
        return this.apu;
    }

    public int eum() {
        return this.tu;
    }

    public float fc() {
        float f10 = this.hnj;
        if (f10 != -1.0f) {
            return f10;
        }
        if (mjg()) {
            return this.dse.b();
        }
        a aVar = this.dkl;
        if (aVar != null) {
            return aVar.b();
        }
        return -1.0f;
    }

    public int gjv() {
        return this.f11666vf.optInt("pitaya_cache_size", 0);
    }

    public boolean hn() {
        return this.xyo == 2;
    }

    public void hnj(int i10) {
        this.xyo = i10;
    }

    public String jip() {
        if (mjg()) {
            return this.dse.h();
        }
        a aVar = this.dkl;
        if (aVar != null) {
            return aVar.h();
        }
        return null;
    }

    public boolean mjg() {
        a aVar;
        if (this.wu != 1 || (aVar = this.dse) == null || TextUtils.isEmpty(aVar.h())) {
            return false;
        }
        if (u6.c.h() == 2) {
            return Build.VERSION.SDK_INT >= 26;
        }
        return this.eum == 1;
    }

    public int oj() {
        return this.eum;
    }

    public int ojm() {
        return this.jip;
    }

    public boolean orl() {
        if (mjg()) {
            return this.dse.k();
        }
        a aVar = this.dkl;
        if (aVar != null) {
            return aVar.k();
        }
        return true;
    }

    public JSONObject qor() {
        return this.f11666vf;
    }

    public String sk() {
        return this.aq;
    }

    public long ta() {
        return this.f11663oj;
    }

    public boolean tgn() {
        return this.f11665ta;
    }

    public boolean tu() {
        return this.ojm;
    }

    public String uua() {
        if (mjg()) {
            return this.dse.y();
        }
        a aVar = this.dkl;
        if (aVar != null) {
            return aVar.y();
        }
        return null;
    }

    public int wu() {
        return this.tgn;
    }

    public int xn() {
        return this.as;
    }

    public void aq(int i10) {
        this.tgn = i10;
    }

    public void dse(int i10) {
        this.tu = i10;
    }

    public void gjv(String str) {
        this.f11662hn = str;
    }

    public void hn(String str) {
        this.mjg = str;
    }

    public boolean hnj() {
        int i10 = this.xyo;
        return i10 == 1 || i10 == 2;
    }

    public void qor(int i10) {
        this.jip = i10;
    }

    public synchronized Object sk(String str) {
        return this.gjv.get(str);
    }

    public void gjv(int i10) {
        this.qor = i10;
    }

    public void hn(int i10) {
        this.f11661fc = i10;
    }

    public void hnj(String str) {
        this.aq = str;
    }

    public void qor(String str) {
        this.uua = str;
    }

    public void sk(int i10) {
        this.as = i10;
    }

    public void hn(boolean z10) {
        this.ojm = z10;
    }

    public void hnj(long j10) {
        this.f11663oj = j10;
    }

    public void qor(boolean z10) {
        this.f11665ta = z10;
    }

    public void dkl(int i10) {
        this.f1do = i10;
    }

    public void hnj(boolean z10) {
        this.f11667xn = z10;
    }

    public synchronized void hnj(String str, Object obj) {
        this.gjv.put(str, obj);
    }
}
