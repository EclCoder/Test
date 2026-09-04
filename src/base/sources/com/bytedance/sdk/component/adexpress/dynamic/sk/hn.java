package com.bytedance.sdk.component.adexpress.dynamic.sk;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.hn.orl;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private String aq;
    private int dkl;
    private double dse;
    private orl ojm;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private double f12669sk;
    public Map<String, qor> hnj = new HashMap();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public Map<String, qor> f12668hn = new HashMap();
    public Map<String, qor> qor = new HashMap();
    private double gjv = Math.random();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.sk.hn$hn, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class C0183hn {
        double gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        int f12670hn;
        float hnj;
        int qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        float f12671sk;

        C0183hn() {
        }

        static JSONObject hnj(C0183hn c0183hn) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_SIZE, c0183hn.hnj);
                jSONObject.put("letterSpacing", c0183hn.f12670hn);
                jSONObject.put("lineHeight", c0183hn.gjv);
                jSONObject.put("maxWidth", c0183hn.f12671sk);
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_WEIGHT, c0183hn.qor);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class hnj implements Cloneable {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        boolean f12672hn;
        float hnj;
        float qor;

        hnj() {
        }

        public Object clone() {
            try {
                return (hnj) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class qor {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        float f12673hn;
        float hnj;

        public qor() {
        }

        public String toString() {
            return "UnitSize{width=" + this.hnj + ", height=" + this.f12673hn + '}';
        }

        public qor(float f10, float f11) {
            this.hnj = f10;
            this.f12673hn = f11;
        }
    }

    public hn(double d10, int i10, double d11, String str, orl orlVar) {
        this.f12669sk = d10;
        this.dkl = i10;
        this.dse = d11;
        this.aq = str;
        this.ojm = orlVar;
    }

    private qor dkl(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar, float f10, float f11) {
        new qor();
        com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk = aqVar.ta().sk();
        aqVar.ta().qor();
        dklVarSk.zt();
        float fOj = dklVarSk.oj();
        int iEta = dklVarSk.eta();
        double dRmr = dklVarSk.rmr();
        int iKa = dklVarSk.ka();
        boolean zCm = dklVarSk.cm();
        boolean zIzk = dklVarSk.izk();
        int iDzo = dklVarSk.dzo();
        C0183hn c0183hn = new C0183hn();
        c0183hn.hnj = fOj;
        c0183hn.f12670hn = iEta;
        c0183hn.qor = iKa;
        c0183hn.gjv = dRmr;
        c0183hn.f12671sk = f10;
        return hnj(aqVar.ta().qor(), c0183hn, zCm, zIzk, iDzo, aqVar);
    }

    private qor sk(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar, float f10, float f11) {
        String str = aqVar.qor() + "_" + f10 + "_" + f11;
        if (this.qor.containsKey(str)) {
            return this.qor.get(str);
        }
        qor qorVarDkl = dkl(aqVar, f10, f11);
        this.qor.put(str, qorVarDkl);
        return qorVarDkl;
    }

    public qor gjv(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar, float f10, float f11) {
        float fMin;
        float f12;
        float f13;
        qor qorVar = new qor();
        float f14 = 0.0f;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            qorVar.hnj = 0.0f;
            qorVar.f12673hn = 0.0f;
            return qorVar;
        }
        if (aqVar.oj()) {
            return hnj(aqVar, f10, f11);
        }
        float fAq = aqVar.aq();
        float fOjm = aqVar.ojm();
        float fFc = aqVar.fc();
        float fJip = aqVar.jip();
        com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk = aqVar.ta().sk();
        String strVf = dklVarSk.vf();
        String strXyo = dklVarSk.xyo();
        float fMin2 = ((TextUtils.equals(strVf, "flex") || TextUtils.equals(strVf, "auto")) ? f10 : Math.min(fAq, f10)) - fFc;
        if (TextUtils.equals(strXyo, "scale")) {
            fMin = Math.round(fMin2 / fOjm) + fJip;
            if (fMin > f11) {
                fMin2 = Math.round((f11 - fJip) * fOjm);
            }
        } else {
            fMin = (TextUtils.equals(strXyo, "auto") || TextUtils.equals(strXyo, "flex")) ? f11 : Math.min(fOjm, f11);
        }
        float f15 = fMin - fJip;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq>> listUua = aqVar.uua();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> list : listUua) {
            float f16 = f14;
            float f17 = fFc;
            qor qorVarHn = hn(list, fMin2, f15);
            if (hn(list)) {
                f13 = f16 + 1.0f;
            } else {
                fMax = Math.max(fMax, qorVarHn.hnj);
                f13 = f16;
            }
            float f18 = f13;
            float f19 = fMin2;
            fMax2 = aqVar.ta().hn().equals("carousel") ? Math.max(aqVar.ojm(), qorVarHn.f12673hn) : fMax2 + qorVarHn.f12673hn;
            fFc = f17;
            f14 = f18;
            fMin2 = f19;
        }
        float f20 = f14;
        float f21 = fMin2;
        float f22 = fFc;
        if (!TextUtils.equals(strVf, "auto")) {
            f12 = f21;
        } else if (f20 == listUua.size()) {
            f12 = f10;
        } else {
            for (List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> list2 : listUua) {
                qor(list2);
                hn(list2, fMax, f15);
            }
            f12 = fMax;
        }
        if (TextUtils.equals(strXyo, "auto")) {
            if (fMax2 <= f11) {
                f15 = fMax2;
            } else {
                hnj(listUua, f12, f15);
            }
        } else if ((TextUtils.equals(strXyo, "fixed") || TextUtils.equals(strXyo, "flex")) && f15 < fMax2) {
            hnj(listUua, f12, f15);
        }
        qorVar.hnj = Math.min(f12 + f22, f10);
        qorVar.f12673hn = Math.min(f15 + fJip, f11);
        return qorVar;
    }

    public qor hn(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar, float f10, float f11) {
        qor qorVar = new qor();
        if (aqVar.ta().sk() == null) {
            return qorVar;
        }
        qor qorVarSk = sk(aqVar, f10, f11);
        float f12 = qorVarSk.hnj;
        float f13 = qorVarSk.f12673hn;
        qorVar.hnj = Math.min(f12, f10);
        qorVar.f12673hn = Math.min(f13, f11);
        return qorVar;
    }

    public qor hnj(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar, float f10, float f11) {
        float f12;
        if (TextUtils.isEmpty(aqVar.ta().qor()) && aqVar.ta().sk().idl() == null) {
            return new qor(0.0f, 0.0f);
        }
        if (TextUtils.equals(aqVar.ta().hn(), "creative-playable-bait")) {
            return new qor(0.0f, 0.0f);
        }
        float fAq = aqVar.aq();
        float fOjm = aqVar.ojm();
        com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk = aqVar.ta().sk();
        String strVf = dklVarSk.vf();
        String strXyo = dklVarSk.xyo();
        float fOrl = aqVar.orl();
        float fMjg = aqVar.mjg();
        float fFc = aqVar.fc();
        float fJip = aqVar.jip();
        if (TextUtils.equals(strVf, "fixed")) {
            f10 = Math.min(fAq, f10);
            if (TextUtils.equals(strXyo, "auto")) {
                f12 = hn(aqVar, f10 - fFc, f11 - fJip).f12673hn;
                fOjm = f12 + fJip;
            }
        } else if (TextUtils.equals(strVf, "auto")) {
            qor qorVarHn = hn(aqVar, f10 - fFc, f11 - fJip);
            f10 = qorVarHn.hnj + fFc;
            if (TextUtils.equals(strXyo, "auto")) {
                f12 = qorVarHn.f12673hn;
                fOjm = f12 + fJip;
            }
        } else if (!TextUtils.equals(strVf, "flex")) {
            f10 = fAq;
        } else if (TextUtils.equals(strXyo, "auto")) {
            f12 = hn(aqVar, f10 - fFc, f11 - fJip).f12673hn;
            fOjm = f12 + fJip;
        }
        if (TextUtils.equals(strXyo, "scale")) {
            float fRound = Math.round((f10 - fOrl) / fOjm) + fMjg;
            if (fRound > f11) {
                f10 = Math.round((f11 - fMjg) * fOjm) + fOrl;
            } else {
                f11 = fRound;
            }
        } else if (TextUtils.equals(strXyo, "fixed")) {
            f11 = Math.min(fOjm + fMjg, f11);
        } else if (!TextUtils.equals(strXyo, "flex")) {
            f11 = fOjm;
        }
        qor qorVar = new qor();
        qorVar.hnj = f10;
        qorVar.f12673hn = f11;
        return qorVar;
    }

    public qor qor(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar, float f10, float f11) {
        if (aqVar == null) {
            return null;
        }
        qor qorVarHnj = hnj(aqVar);
        if (qorVarHnj != null && (qorVarHnj.hnj != 0.0f || qorVarHnj.f12673hn != 0.0f)) {
            return qorVarHnj;
        }
        qor qorVarGjv = gjv(aqVar, f10, f11);
        hnj(aqVar, qorVarGjv);
        return qorVarGjv;
    }

    private qor qor(List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> list, float f10, float f11) {
        float fMax;
        gjv(list);
        qor qorVar = new qor();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk = aqVar.ta().sk();
            if (dklVarSk.mkl() == 1 || dklVarSk.mkl() == 2) {
                arrayList.add(aqVar);
            }
            if (dklVarSk.mkl() != 1 && dklVarSk.mkl() != 2) {
                arrayList2.add(aqVar);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            qor((com.bytedance.sdk.component.adexpress.dynamic.gjv.aq) obj, f10, f11);
        }
        if (arrayList2.size() <= 0) {
            return qorVar;
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            arrayList3.add(Float.valueOf(qor((com.bytedance.sdk.component.adexpress.dynamic.gjv.aq) obj2, f10, f11).hnj));
        }
        List<hnj> arrayList4 = new ArrayList<>();
        int i12 = 0;
        while (true) {
            fMax = 0.0f;
            if (i12 >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar2 = (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq) arrayList2.get(i12);
            String strVf = aqVar2.ta().sk().vf();
            float fAq = aqVar2.aq();
            boolean zEquals = TextUtils.equals(strVf, "flex");
            if (TextUtils.equals(strVf, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq>> listUua = aqVar2.uua();
                if (listUua == null || listUua.size() <= 0) {
                    zEquals = false;
                    break;
                }
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq>> it = listUua.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zEquals = false;
                        break;
                    }
                    if (hn(it.next())) {
                        zEquals = true;
                        break;
                    }
                }
            }
            hnj hnjVar = new hnj();
            if (!zEquals) {
                fAq = ((Float) arrayList3.get(i12)).floatValue();
            }
            hnjVar.hnj = fAq;
            hnjVar.f12672hn = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i12)).floatValue();
            }
            hnjVar.qor = fMax;
            arrayList4.add(hnjVar);
            i12++;
        }
        hnj(arrayList4, f10, arrayList2);
        List<hnj> listHnj = ta.hnj(f10, arrayList4);
        float f12 = 0.0f;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            f12 += listHnj.get(i13).hnj;
            if (((Float) arrayList3.get(i13)).floatValue() != listHnj.get(i13).hnj) {
                gjv((com.bytedance.sdk.component.adexpress.dynamic.gjv.aq) arrayList2.get(i13));
            }
        }
        int size3 = arrayList2.size();
        int i14 = 0;
        boolean z10 = false;
        int i15 = 0;
        while (i15 < size3) {
            Object obj3 = arrayList2.get(i15);
            i15++;
            i14++;
            if (!hn((com.bytedance.sdk.component.adexpress.dynamic.gjv.aq) obj3)) {
                z10 = false;
                break;
            }
            if (i14 == arrayList2.size()) {
                z10 = true;
            }
        }
        fMax = z10 ? f11 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar3 = (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq) arrayList2.get(i16);
            qor qorVarQor = qor(aqVar3, listHnj.get(i16).hnj, f11);
            if (!hn(aqVar3)) {
                fMax = Math.max(fMax, qorVarQor.f12673hn);
            }
            arrayList5.add(qorVarQor);
        }
        ArrayList arrayList6 = new ArrayList();
        int size4 = arrayList5.size();
        int i17 = 0;
        while (i17 < size4) {
            Object obj4 = arrayList5.get(i17);
            i17++;
            arrayList6.add(Float.valueOf(((qor) obj4).f12673hn));
        }
        if (!z10) {
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar4 = (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq) arrayList2.get(i18);
                if (hn(aqVar4) && ((Float) arrayList6.get(i18)).floatValue() != fMax) {
                    gjv(aqVar4);
                    qor(aqVar4, listHnj.get(i18).hnj, fMax);
                }
            }
        }
        qorVar.hnj = f12;
        qorVar.f12673hn = fMax;
        return qorVar;
    }

    private boolean hn(List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq>> listUua;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().ta().sk().vf(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z10 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar : list) {
                if (TextUtils.equals(aqVar.ta().sk().vf(), "auto") && (listUua = aqVar.uua()) != null) {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq>> it2 = listUua.iterator();
                    int i10 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> next = it2.next();
                            i10++;
                            if (hn(next)) {
                                if (i10 == next.size()) {
                                    z10 = true;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return z10;
        }
    }

    private String sk(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        return aqVar.qor();
    }

    private qor hn(List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> list, float f10, float f11) {
        qor qorVarHnj = hnj(list);
        if (qorVarHnj != null && (qorVarHnj.hnj != 0.0f || qorVarHnj.f12673hn != 0.0f)) {
            return qorVarHnj;
        }
        qor qorVarQor = qor(list, f10, f11);
        hnj(list, qorVarQor);
        return qorVarQor;
    }

    private boolean hn(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        if (aqVar == null) {
            return false;
        }
        if (TextUtils.equals(aqVar.ta().sk().xyo(), "flex")) {
            return true;
        }
        return qor(aqVar);
    }

    private qor hnj(String str, C0183hn c0183hn, boolean z10, boolean z11, int i10, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        return dnm.hnj(str, aqVar.ta().hn(), C0183hn.hnj(c0183hn).toString(), z10, z11, i10, aqVar, this.f12669sk, this.dkl, this.dse, this.aq, this.ojm);
    }

    private void hnj(List<List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq>> list, float f10, float f11) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq>> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (hnj(it.next(), false)) {
                z10 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> list2 : list) {
            hnj hnjVar = new hnj();
            boolean zHnj = hnj(list2, !z10);
            hnjVar.hnj = zHnj ? 1.0f : hn(list2, f10, f11).f12673hn;
            hnjVar.f12672hn = !zHnj;
            arrayList.add(hnjVar);
        }
        List<hnj> listHnj = ta.hnj(f11, arrayList);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((hnj) arrayList.get(i10)).hnj != listHnj.get(i10).hnj) {
                List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> list3 = list.get(i10);
                qor(list3);
                hn(list3, f10, listHnj.get(i10).hnj);
            }
        }
    }

    private void gjv(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        this.hnj.remove(sk(aqVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq>> listUua = aqVar.uua();
        if (listUua == null || listUua.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq>> it = listUua.iterator();
        while (it.hasNext()) {
            qor(it.next());
        }
    }

    private String gjv(List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String strQor = list.get(i10).qor();
            if (i10 < list.size() - 1) {
                sb2.append(strQor);
                sb2.append("-");
            } else {
                sb2.append(strQor);
            }
        }
        return sb2.toString();
    }

    private boolean hnj(List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> list, boolean z10) {
        for (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk = aqVar.ta().sk();
            String strXyo = dklVarSk.xyo();
            if (TextUtils.equals(strXyo, "flex") || (z10 && ((TextUtils.equals(dklVarSk.vf(), "flex") && TextUtils.equals(dklVarSk.xyo(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.gjv.sk.hnj.get(aqVar.ta().hn()).intValue() == 7) || TextUtils.equals(strXyo, "flex")))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> it = list.iterator();
        while (it.hasNext()) {
            if (qor(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean qor(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq>> listUua;
        if (!aqVar.oj() && TextUtils.equals(aqVar.ta().sk().xyo(), "auto") && (listUua = aqVar.uua()) != null && listUua.size() > 0) {
            if (listUua.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> it = listUua.get(0).iterator();
                while (it.hasNext()) {
                    if (!hn(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq>> it2 = listUua.iterator();
            while (it2.hasNext()) {
                if (hnj(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void hnj(List<hnj> list, float f10, List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> list2) {
        float f11 = 0.0f;
        for (hnj hnjVar : list) {
            if (hnjVar.f12672hn) {
                f11 += hnjVar.hnj;
            }
        }
        if (f11 > f10) {
            int i10 = 0;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (list.get(i11).f12672hn && list2.get(i11).wu()) {
                    i10++;
                }
            }
            if (i10 > 0) {
                float fCeil = (float) (Math.ceil(((f11 - f10) / i10) * 1000.0f) / 1000.0d);
                for (int i12 = 0; i12 < list2.size(); i12++) {
                    hnj hnjVar2 = list.get(i12);
                    if (hnjVar2.f12672hn && list2.get(i12).wu()) {
                        hnjVar2.hnj -= fCeil;
                    }
                }
            }
        }
    }

    private void qor(List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f12668hn.remove(gjv(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> it = list.iterator();
        while (it.hasNext()) {
            gjv(it.next());
        }
    }

    public void hnj() {
        this.qor.clear();
        this.hnj.clear();
        this.f12668hn.clear();
    }

    public qor hnj(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        return this.hnj.get(sk(aqVar));
    }

    public qor hnj(List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> list) {
        return this.f12668hn.get(gjv(list));
    }

    private void hnj(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar, qor qorVar) {
        this.hnj.put(sk(aqVar), qorVar);
    }

    private void hnj(List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> list, qor qorVar) {
        this.f12668hn.put(gjv(list), qorVar);
    }
}
