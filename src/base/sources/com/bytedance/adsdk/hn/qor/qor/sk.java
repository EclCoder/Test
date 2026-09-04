package com.bytedance.adsdk.hn.qor.qor;

import com.bytedance.adsdk.hn.qor.hnj.bug;
import com.bytedance.adsdk.hn.qor.hnj.dnm;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {
    private final List<com.bytedance.adsdk.hn.dse.hnj<Float>> apu;
    private final List<com.bytedance.adsdk.hn.qor.hn.aq> aq;
    private final com.bytedance.adsdk.hn.qor.hn.hnj as;
    private final int bug;
    private final long dkl;
    private final int dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private final com.bytedance.adsdk.hn.sk.ta f6do;
    private final String dse;
    private final hn eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final float f12115fc;
    private final long gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.dse f12116hn;
    private final List<com.bytedance.adsdk.hn.qor.hn.qor> hnj;
    private final float jip;
    private final float mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private final dnm f12117oj;
    private final bug ojm;
    private final float orl;
    private final String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final hnj f12118sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final int f12119ta;
    private final com.bytedance.adsdk.hn.qor.hnj.ta uua;
    private final boolean wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.qor.hnj.hn f12120xn;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum hn {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum hnj {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public sk(List<com.bytedance.adsdk.hn.qor.hn.qor> list, com.bytedance.adsdk.hn.dse dseVar, String str, long j10, hnj hnjVar, long j11, String str2, List<com.bytedance.adsdk.hn.qor.hn.aq> list2, bug bugVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, com.bytedance.adsdk.hn.qor.hnj.ta taVar, dnm dnmVar, List<com.bytedance.adsdk.hn.dse.hnj<Float>> list3, hn hnVar, com.bytedance.adsdk.hn.qor.hnj.hn hnVar2, boolean z10, com.bytedance.adsdk.hn.qor.hn.hnj hnjVar2, com.bytedance.adsdk.hn.sk.ta taVar2) {
        this.hnj = list;
        this.f12116hn = dseVar;
        this.qor = str;
        this.gjv = j10;
        this.f12118sk = hnjVar;
        this.dkl = j11;
        this.dse = str2;
        this.aq = list2;
        this.ojm = bugVar;
        this.f12119ta = i10;
        this.dnm = i11;
        this.bug = i12;
        this.orl = f10;
        this.mjg = f11;
        this.f12115fc = f12;
        this.jip = f13;
        this.uua = taVar;
        this.f12117oj = dnmVar;
        this.apu = list3;
        this.eum = hnVar;
        this.f12120xn = hnVar2;
        this.wu = z10;
        this.as = hnjVar2;
        this.f6do = taVar2;
    }

    dnm apu() {
        return this.f12117oj;
    }

    float aq() {
        return this.f12115fc;
    }

    public com.bytedance.adsdk.hn.qor.hn.hnj as() {
        return this.as;
    }

    hn bug() {
        return this.eum;
    }

    public String dkl() {
        return this.qor;
    }

    public hnj dnm() {
        return this.f12118sk;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public com.bytedance.adsdk.hn.sk.ta m2do() {
        return this.f6do;
    }

    public String dse() {
        return this.dse;
    }

    com.bytedance.adsdk.hn.qor.hnj.hn eum() {
        return this.f12120xn;
    }

    bug fc() {
        return this.ojm;
    }

    List<com.bytedance.adsdk.hn.dse.hnj<Float>> gjv() {
        return this.apu;
    }

    float hn() {
        return this.orl;
    }

    com.bytedance.adsdk.hn.dse hnj() {
        return this.f12116hn;
    }

    int jip() {
        return this.bug;
    }

    List<com.bytedance.adsdk.hn.qor.hn.qor> mjg() {
        return this.hnj;
    }

    int oj() {
        return this.f12119ta;
    }

    float ojm() {
        return this.jip;
    }

    long orl() {
        return this.dkl;
    }

    float qor() {
        return this.mjg / this.f12116hn.uua();
    }

    public long sk() {
        return this.gjv;
    }

    List<com.bytedance.adsdk.hn.qor.hn.aq> ta() {
        return this.aq;
    }

    public String toString() {
        return hnj("");
    }

    int uua() {
        return this.dnm;
    }

    public boolean wu() {
        return this.wu;
    }

    com.bytedance.adsdk.hn.qor.hnj.ta xn() {
        return this.uua;
    }

    public String hnj(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(dkl());
        sb2.append("\n");
        sk skVarHnj = this.f12116hn.hnj(orl());
        if (skVarHnj != null) {
            sb2.append("\t\tParents: ");
            sb2.append(skVarHnj.dkl());
            sk skVarHnj2 = this.f12116hn.hnj(skVarHnj.orl());
            while (skVarHnj2 != null) {
                sb2.append("->");
                sb2.append(skVarHnj2.dkl());
                skVarHnj2 = this.f12116hn.hnj(skVarHnj2.orl());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!ta().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(ta().size());
            sb2.append("\n");
        }
        if (oj() != 0 && uua() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(oj()), Integer.valueOf(uua()), Integer.valueOf(jip())));
        }
        if (!this.hnj.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (com.bytedance.adsdk.hn.qor.hn.qor qorVar : this.hnj) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(qorVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
