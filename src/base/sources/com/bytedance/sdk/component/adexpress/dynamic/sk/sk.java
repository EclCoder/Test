package com.bytedance.sdk.component.adexpress.dynamic.sk;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.hn.orl;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {
    private hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected hn f12674hn;
    public com.bytedance.sdk.component.adexpress.dynamic.gjv.hn hnj;
    private com.bytedance.sdk.component.adexpress.dynamic.gjv.aq qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        float f12675hn;
        float hnj;
        float qor;

        hnj() {
        }
    }

    public sk(double d10, int i10, double d11, String str, orl orlVar) {
        this.f12674hn = new hn(d10, i10, d11, str, orlVar);
    }

    public void hnj(hnj hnjVar) {
        this.gjv = hnjVar;
    }

    public void hnj() {
        this.f12674hn.hnj();
    }

    public void hnj(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar, float f10, float f11) {
        if (aqVar != null) {
            this.qor = aqVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar2 = this.qor;
        float fAq = aqVar2.aq();
        float fOjm = aqVar2.ojm();
        float f12 = TextUtils.equals(aqVar2.ta().sk().xyo(), "fixed") ? fOjm : 65536.0f;
        this.f12674hn.hnj();
        this.f12674hn.qor(aqVar2, fAq, f12);
        hn.qor qorVarHnj = this.f12674hn.hnj(aqVar2);
        com.bytedance.sdk.component.adexpress.dynamic.gjv.hn hnVar = new com.bytedance.sdk.component.adexpress.dynamic.gjv.hn();
        hnVar.hnj = f10;
        hnVar.f12603hn = f11;
        if (qorVarHnj != null) {
            fAq = qorVarHnj.hnj;
        }
        hnVar.qor = fAq;
        if (qorVarHnj != null) {
            fOjm = qorVarHnj.f12673hn;
        }
        hnVar.gjv = fOjm;
        hnVar.f12604sk = "root";
        hnVar.ojm = 1280.0f;
        hnVar.dkl = aqVar2;
        aqVar2.qor(f10);
        hnVar.dkl.gjv(hnVar.f12603hn);
        hnVar.dkl.sk(hnVar.qor);
        hnVar.dkl.dkl(hnVar.gjv);
        com.bytedance.sdk.component.adexpress.dynamic.gjv.hn hnVarHnj = hnj(hnVar, 0.0f);
        this.hnj = hnVarHnj;
        hnj(hnVarHnj);
    }

    public void hnj(com.bytedance.sdk.component.adexpress.dynamic.gjv.hn hnVar) {
        if (hnVar == null) {
            return;
        }
        hnVar.dkl.ta().hn();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.gjv.hn>> list = hnVar.dse;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.gjv.hn> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.gjv.hn> it = list2.iterator();
                while (it.hasNext()) {
                    hnj(it.next());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0340  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0219  */
    public com.bytedance.sdk.component.adexpress.dynamic.gjv.hn hnj(com.bytedance.sdk.component.adexpress.dynamic.gjv.hn hnVar, float f10) {
        float fHnj;
        float fHnj2;
        float fHnj3;
        float fHnj4;
        float f11;
        com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar = hnVar.dkl;
        if (aqVar != null) {
            aqVar.eum();
            List<List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq>> listUua = aqVar.uua();
            if (listUua != null && listUua.size() > 0) {
                com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk = aqVar.ta().sk();
                float fUua = dklVarSk.uua();
                float fJip = dklVarSk.jip();
                float fMjg = dklVarSk.mjg();
                float fFc = dklVarSk.fc();
                float fBug = dklVarSk.bug();
                String strFf = dklVarSk.ff();
                String strXad = dklVarSk.xad();
                float f12 = hnVar.hnj + fFc;
                float f13 = hnVar.f12603hn + fUua;
                float f14 = (hnVar.qor - fFc) - fJip;
                float f15 = 2.0f;
                float f16 = fBug * 2.0f;
                float f17 = f14 - f16;
                float f18 = ((hnVar.gjv - fUua) - fMjg) - f16;
                com.bytedance.sdk.component.adexpress.dynamic.gjv.ojm ojmVar = new com.bytedance.sdk.component.adexpress.dynamic.gjv.ojm(f12, f13);
                if (hnVar.dse == null) {
                    hnVar.dse = new ArrayList();
                }
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq>> it = listUua.iterator();
                float f19 = 0.0f;
                while (it.hasNext()) {
                    float f20 = f15;
                    hn.qor qorVarHnj = this.f12674hn.hnj(it.next());
                    if (qorVarHnj != null) {
                        f19 += qorVarHnj.f12673hn;
                    }
                    f15 = f20;
                }
                float f21 = f15;
                String str = "space-between";
                String str2 = "space-around";
                int i10 = 1;
                if (f19 >= f18) {
                    fHnj = 0.0f;
                    fHnj2 = 0.0f;
                } else {
                    if (TextUtils.equals(strXad, TtmlNode.CENTER)) {
                        fHnj2 = (f18 - f19) / f21;
                    } else if (TextUtils.equals(strXad, "flex-end")) {
                        fHnj2 = f18 - f19;
                    } else if (TextUtils.equals(strXad, "space-around")) {
                        fHnj2 = ta.hnj((f18 - f19) / (listUua.size() + 1));
                        fHnj = fHnj2;
                    } else {
                        if (!TextUtils.equals(strXad, "space-between") || listUua.size() <= 1) {
                            fHnj = 0.0f;
                        } else {
                            fHnj = ta.hnj((f18 - f19) / (listUua.size() - 1));
                        }
                        fHnj2 = 0.0f;
                    }
                    fHnj = 0.0f;
                }
                ojmVar.f12612hn += fHnj2;
                float f22 = f10;
                int i11 = 0;
                while (i11 < listUua.size()) {
                    List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> list = listUua.get(i11);
                    i11++;
                    int i12 = i10;
                    if (i11 >= hnVar.dse.size()) {
                        int i13 = 0;
                        for (int size = (i11 - hnVar.dse.size()) + 1; i13 < size; size = size) {
                            hnVar.dse.add(new ArrayList());
                            i13++;
                        }
                    }
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> it2 = list.iterator();
                    float f23 = 0.0f;
                    while (true) {
                        it2 = it2;
                        if (!it2.hasNext()) {
                            break;
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.gjv.aq next = it2.next();
                        com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk2 = next.ta().sk();
                        float f24 = f23;
                        String strVf = dklVarSk2.vf();
                        float f25 = fHnj;
                        int iMkl = dklVarSk2.mkl();
                        f22 = f22;
                        if (TextUtils.equals(strVf, "flex") || iMkl == i12 || iMkl == 2) {
                            f23 = f24;
                        } else {
                            hn.qor qorVarHnj2 = this.f12674hn.hnj(next);
                            f23 = qorVarHnj2 != null ? f24 + qorVarHnj2.hnj : f24;
                        }
                        fHnj = f25;
                        i12 = 1;
                    }
                    float f26 = fHnj;
                    float f27 = f22;
                    float fMax = Math.max(f17 - f23, 0.0f);
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> it3 = list.iterator();
                    float f28 = 0.0f;
                    while (it3.hasNext()) {
                        com.bytedance.sdk.component.adexpress.dynamic.gjv.aq next2 = it3.next();
                        com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk3 = next2.ta().sk();
                        it3 = it3;
                        float f29 = f28;
                        if (dklVarSk3.mkl() == 1 || dklVarSk3.mkl() == 2) {
                            f28 = f29;
                        } else {
                            hn.qor qorVarHnj3 = this.f12674hn.hnj(next2);
                            f28 = qorVarHnj3 != null ? f29 + qorVarHnj3.hnj : f29;
                        }
                    }
                    float f30 = f28;
                    if (f30 >= f17) {
                        fHnj3 = 0.0f;
                        fHnj4 = 0.0f;
                    } else {
                        if (TextUtils.equals(strFf, TtmlNode.CENTER)) {
                            fHnj3 = (f17 - f30) / f21;
                        } else if (TextUtils.equals(strFf, "flex-end")) {
                            fHnj3 = f17 - f30;
                        } else if (TextUtils.equals(strFf, str2)) {
                            fHnj3 = ta.hnj((f17 - f30) / (list.size() + 1));
                            fHnj4 = fHnj3;
                        } else if (!TextUtils.equals(strFf, str) || list.size() <= 1) {
                            fHnj3 = 0.0f;
                        } else {
                            fHnj4 = ta.hnj((f17 - f30) / (list.size() - 1.0f));
                            fHnj3 = 0.0f;
                        }
                        fHnj4 = 0.0f;
                    }
                    ojmVar.hnj += fHnj3;
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> it4 = list.iterator();
                    float fMax2 = 0.0f;
                    while (it4.hasNext()) {
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> it5 = it4;
                        com.bytedance.sdk.component.adexpress.dynamic.gjv.aq next3 = it4.next();
                        float f31 = fHnj4;
                        float f32 = this.f12674hn.hnj(next3) != null ? this.f12674hn.hnj(next3).f12673hn : 0.0f;
                        com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk4 = next3.ta().sk();
                        fMax2 = Math.max(fMax2, (dklVarSk4.mkl() == 1 || dklVarSk4.mkl() == 2) ? 0.0f : f32);
                        it4 = it5;
                        fHnj4 = f31;
                    }
                    float f33 = fHnj4;
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> it6 = list.iterator();
                    while (it6.hasNext()) {
                        com.bytedance.sdk.component.adexpress.dynamic.gjv.aq next4 = it6.next();
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> it7 = it6;
                        hn.qor qorVarHnj4 = this.f12674hn.hnj(next4);
                        String str3 = str;
                        com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk5 = next4.ta().sk();
                        String str4 = strFf;
                        float fPnz = dklVarSk5.pnz();
                        float fLu = dklVarSk5.lu();
                        float fPv = dklVarSk5.pv();
                        float fXo = dklVarSk5.xo();
                        float f34 = qorVarHnj4 == null ? 0.0f : qorVarHnj4.hnj;
                        float f35 = qorVarHnj4 == null ? 0.0f : qorVarHnj4.f12673hn;
                        float f36 = f34;
                        float f37 = TextUtils.equals(aqVar.qor(), "root") ? i11 : f27;
                        float f38 = fMax2;
                        com.bytedance.sdk.component.adexpress.dynamic.gjv.ojm ojmVarHnj = dklVarSk5.mkl() == 2 ? hnj(dklVarSk5, this.f12674hn.hnj(this.qor), new hn.qor((f36 - fLu) - fXo, (f35 - fPnz) - fPv)) : dklVarSk5.mkl() == 1 ? hnj(hnVar, dklVarSk5, (f36 - fLu) - fXo, (f35 - fPnz) - fPv) : ojmVar;
                        String strKrm = dklVarSk.krm();
                        if (f38 <= f35 || TextUtils.equals(strKrm, "flex-start")) {
                            f11 = 0.0f;
                        } else {
                            strKrm.getClass();
                            if (strKrm.equals(TtmlNode.CENTER)) {
                                f11 = (f38 - f35) / f21;
                            } else if (strKrm.equals("flex-end")) {
                                f11 = f38 - f35;
                            } else {
                                f11 = 0.0f;
                            }
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.gjv.hn hnVar2 = new com.bytedance.sdk.component.adexpress.dynamic.gjv.hn();
                        hnVar2.hnj = ojmVarHnj.hnj + fXo;
                        hnVar2.f12603hn = ojmVarHnj.f12612hn + fPnz + f11;
                        hnVar2.qor = (f36 - fLu) - fXo;
                        hnVar2.gjv = (f35 - fPnz) - fPv;
                        hnVar2.f12604sk = hnVar.f12604sk + "." + next4.qor();
                        hnVar2.aq = hnVar;
                        hnVar2.dkl = next4;
                        hnVar2.ojm = fMax;
                        hnVar2.f12605ta = list;
                        next4.qor(hnVar2.hnj);
                        hnVar2.dkl.gjv(hnVar2.f12603hn);
                        hnVar2.dkl.sk(hnVar2.qor);
                        hnVar2.dkl.dkl(hnVar2.gjv);
                        hnVar.dse.get(i11).add(hnj(hnVar2, f37));
                        if (dklVarSk5.mkl() != 1 && dklVarSk5.mkl() != 2) {
                            ojmVar.hnj += f36 + f33;
                        }
                        f27 = f37;
                        strFf = str4;
                        str = str3;
                        fMax2 = f38;
                        f17 = f17;
                        str2 = str2;
                        it6 = it7;
                    }
                    ojmVar.hnj = f12;
                    ojmVar.f12612hn += fMax2 + f26;
                    i10 = 1;
                    listUua = listUua;
                    f22 = f27;
                    fHnj = f26;
                }
            }
        }
        return hnVar;
    }

    private com.bytedance.sdk.component.adexpress.dynamic.gjv.ojm hnj(com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVar, hn.qor qorVar, hn.qor qorVar2) {
        float fZnr = dklVar.znr();
        float fLko = dklVar.lko();
        float fRq = dklVar.rq();
        float fMeb = dklVar.meb();
        boolean zQb = dklVar.qb();
        boolean zFr = dklVar.fr();
        boolean zGn = dklVar.gn();
        boolean zDy = dklVar.dy();
        if (!zQb) {
            if (zFr) {
                float f10 = this.gjv.hnj;
                fZnr = ((f10 != 0.0f ? Math.min(f10, qorVar.hnj) : qorVar.hnj) - fRq) - qorVar2.hnj;
            } else {
                fZnr = 0.0f;
            }
        }
        if (!zGn) {
            if (zDy) {
                float f11 = this.gjv.f12675hn;
                if (f11 == 0.0f) {
                    f11 = qorVar.f12673hn;
                }
                fLko = (f11 - fMeb) - qorVar2.f12673hn;
            } else {
                fLko = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.gjv.ojm(fZnr, fLko);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.gjv.ojm hnj(com.bytedance.sdk.component.adexpress.dynamic.gjv.hn hnVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVar, float f10, float f11) {
        float f12;
        float f13;
        float f14 = hnVar.hnj;
        float f15 = hnVar.f12603hn;
        float fZnr = dklVar.znr();
        float fLko = dklVar.lko();
        float fRq = dklVar.rq();
        float fMeb = dklVar.meb();
        boolean zQb = dklVar.qb();
        boolean zFr = dklVar.fr();
        boolean zGn = dklVar.gn();
        boolean zDy = dklVar.dy();
        String strLhi = dklVar.lhi();
        float f16 = hnVar.qor;
        float f17 = hnVar.gjv;
        if (TextUtils.equals(strLhi, MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
            if (zQb) {
                f14 = hnVar.hnj + fZnr;
            } else if (zFr) {
                f14 = ((hnVar.hnj + f16) - fRq) - f10;
            }
            if (zGn) {
                f13 = hnVar.f12603hn;
                f15 = f13 + fLko;
            } else if (zDy) {
                f12 = hnVar.f12603hn;
                f15 = ((f12 + f17) - fMeb) - f11;
            }
        } else if (TextUtils.equals(strLhi, "1")) {
            f14 = hnVar.hnj + ((f16 - f10) / 2.0f);
            if (zGn) {
                f13 = hnVar.f12603hn;
                f15 = f13 + fLko;
            } else if (zDy) {
                f12 = hnVar.f12603hn;
                f15 = ((f12 + f17) - fMeb) - f11;
            }
        } else if (TextUtils.equals(strLhi, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            f15 = hnVar.f12603hn + ((f17 - f11) / 2.0f);
            if (zQb) {
                f14 = hnVar.hnj + fZnr;
            } else if (zFr) {
                f14 = ((hnVar.hnj + f16) - fRq) - f10;
            }
        } else if (TextUtils.equals(strLhi, "3")) {
            f14 = hnVar.hnj + ((f16 - f10) / 2.0f);
            f15 = hnVar.f12603hn + ((f17 - f11) / 2.0f);
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.gjv.ojm(f14, f15);
    }
}
