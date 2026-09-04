package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class bug {
    private ojm apu;
    private com.bytedance.adsdk.ugeno.gjv.orl aq;
    private oj dkl;
    private dnm dnm;
    private jip dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private boolean f12186fc;
    private aq gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private JSONObject f12187hn;
    private Context hnj;
    private List<String> jip;
    private com.bytedance.adsdk.ugeno.gjv.hnj.hnj mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private float f12188oj;
    private dse ojm;
    private com.bytedance.adsdk.ugeno.hn.qor<View> qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private fc f12189sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private String f12190ta;
    private sk uua;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private float f12191xn;
    private boolean bug = true;
    private boolean orl = false;

    public bug(Context context) {
        this.hnj = context;
    }

    public com.bytedance.adsdk.ugeno.hn.qor<View> hn(dse.hnj hnjVar, com.bytedance.adsdk.ugeno.hn.qor<View> qorVar) {
        List<dse.hnj> listQor;
        com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj c0169hnjTa = null;
        if (!dse.gjv(hnjVar)) {
            return null;
        }
        String strQor = hnjVar.qor();
        hn hnVarHnj = gjv.hnj(strQor);
        if (hnVarHnj == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(strQor)));
            this.f12186fc = true;
            if (this.jip == null) {
                this.jip = new ArrayList();
            }
            this.jip.add(strQor);
            return null;
        }
        com.bytedance.adsdk.ugeno.hn.qor qorVarHnj = hnVarHnj.hnj(this.hnj);
        if (qorVarHnj == null) {
            return null;
        }
        qorVarHnj.ojm(com.bytedance.adsdk.ugeno.qor.hn.hnj(hnjVar.hnj(), this.f12187hn));
        qorVarHnj.ta(strQor);
        qorVarHnj.qor(hnjVar.gjv());
        qorVarHnj.hnj(hnjVar);
        qorVarHnj.hnj(this.dnm);
        if (qorVar instanceof com.bytedance.adsdk.ugeno.hn.hnj) {
            com.bytedance.adsdk.ugeno.hn.hnj hnjVar2 = (com.bytedance.adsdk.ugeno.hn.hnj) qorVar;
            qorVarHnj.hnj(hnjVar2);
            c0169hnjTa = hnjVar2.ta();
        }
        Iterator<String> itKeys = hnjVar.gjv().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strHnj = com.bytedance.adsdk.ugeno.qor.hn.hnj(hnjVar.gjv().optString(next), this.f12187hn);
            qorVarHnj.hnj(next, strHnj);
            if (c0169hnjTa != null) {
                c0169hnjTa.hnj(this.hnj, next, strHnj);
            }
        }
        if (qorVarHnj instanceof com.bytedance.adsdk.ugeno.hn.hnj) {
            List<dse.hnj> listSk = hnjVar.sk();
            if (listSk == null || listSk.size() <= 0) {
                if (TextUtils.equals(qorVarHnj.ua(), "RecyclerLayout") && (listQor = this.ojm.qor()) != null && listQor.size() > 0) {
                    Iterator<dse.hnj> it = listQor.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.hn.qor<View> qorVarHn = hn(it.next(), (com.bytedance.adsdk.ugeno.hn.qor<View>) qorVarHnj);
                        if (qorVarHn != null && qorVarHn.sq()) {
                            ((com.bytedance.adsdk.ugeno.hn.hnj) qorVarHnj).hnj(qorVarHn);
                        }
                    }
                }
                return qorVarHnj;
            }
            if (TextUtils.equals(qorVarHnj.ua(), "Swiper") && listSk.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            Iterator<dse.hnj> it2 = listSk.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.hn.qor<View> qorVarHn2 = hn(it2.next(), (com.bytedance.adsdk.ugeno.hn.qor<View>) qorVarHnj);
                if (qorVarHn2 != null && qorVarHn2.sq()) {
                    ((com.bytedance.adsdk.ugeno.hn.hnj) qorVarHnj).hnj(qorVarHn2);
                }
            }
        }
        if (c0169hnjTa != null) {
            qorVarHnj.hnj(c0169hnjTa.hnj());
        }
        this.qor = qorVarHnj;
        return qorVarHnj;
    }

    public void hnj(String str, dnm dnmVar) {
        this.dnm = dnmVar;
        this.f12190ta = str;
        if (dnmVar != null) {
            this.f12187hn = dnmVar.hnj();
        }
    }

    public com.bytedance.adsdk.ugeno.hn.qor<View> hnj(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f12187hn = jSONObject2;
        oj ojVar = this.dkl;
        if (ojVar != null) {
            ojVar.hnj();
        }
        dse dseVar = new dse(jSONObject, jSONObject2, jSONObject3);
        this.ojm = dseVar;
        dseVar.hnj(this.f12188oj, this.f12191xn);
        this.mjg = new com.bytedance.adsdk.ugeno.gjv.hnj.hnj();
        if (!(this.f12189sk instanceof com.bytedance.adsdk.ugeno.core.hnj.hn)) {
            this.qor = hnj(this.ojm.hnj(), (com.bytedance.adsdk.ugeno.hn.qor<View>) null);
            if (this.apu == null) {
                oj ojVar2 = this.dkl;
                if (ojVar2 != null) {
                    ojVar2.hn();
                    this.qor.hnj(this.dkl);
                    this.dkl.qor();
                }
                hnj(this.qor);
                if (this.dkl != null) {
                    uua uuaVar = new uua();
                    uuaVar.hnj(0);
                    uuaVar.hnj(this.qor);
                    this.dkl.hnj(uuaVar);
                }
                return this.qor;
            }
            throw null;
        }
        this.ojm.hn();
        throw null;
    }

    public com.bytedance.adsdk.ugeno.hn.qor<View> hnj(dse.hnj hnjVar, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f12187hn = jSONObject;
        oj ojVar = this.dkl;
        if (ojVar != null) {
            ojVar.hnj();
        }
        this.mjg = new com.bytedance.adsdk.ugeno.gjv.hnj.hnj();
        if (!(this.f12189sk instanceof com.bytedance.adsdk.ugeno.core.hnj.hn)) {
            this.qor = hnj(hnjVar, (com.bytedance.adsdk.ugeno.hn.qor<View>) null);
            oj ojVar2 = this.dkl;
            if (ojVar2 != null) {
                ojVar2.hn();
                this.qor.hnj(this.dkl);
            }
            hnj(this.qor);
            return this.qor;
        }
        throw null;
    }

    public com.bytedance.adsdk.ugeno.hn.qor<View> hnj(dse.hnj hnjVar, com.bytedance.adsdk.ugeno.hn.qor<View> qorVar) {
        hn hnVar;
        com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj c0169hnjTa;
        List<dse.hnj> listQor;
        if (!dse.gjv(hnjVar)) {
            return null;
        }
        String strQor = hnjVar.qor();
        hn hnVarHnj = gjv.hnj(strQor);
        if (hnVarHnj == null) {
            this.f12186fc = true;
            if (this.jip == null) {
                hnVar = hnVarHnj;
                this.jip = new ArrayList();
            }
            hnVar = hnVarHnj;
            this.jip.add(strQor);
            strQor = WwUgngZLNA.XLfdeMGzilRro;
            hnjVar.hnj(strQor);
            hn hnVarHnj2 = gjv.hnj(strQor);
            Log.d("UGTemplateEngine", "unknown component; use view widget");
            hnVar = hnVarHnj2;
            if (hnVarHnj2 == null) {
                Log.d("UGTemplateEngine", "not found component ".concat(strQor));
                return null;
            }
        }
        hnVar = hnVarHnj;
        com.bytedance.adsdk.ugeno.hn.qor qorVarHnj = hnVar.hnj(this.hnj);
        if (qorVarHnj == null) {
            return null;
        }
        JSONObject jSONObjectGjv = hnjVar.gjv();
        qorVarHnj.ojm(com.bytedance.adsdk.ugeno.qor.hn.hnj(hnjVar.hnj(), this.f12187hn));
        qorVarHnj.ta(strQor);
        qorVarHnj.qor(jSONObjectGjv);
        qorVarHnj.hnj(hnjVar);
        qorVarHnj.hn(this.f12187hn);
        dse dseVar = this.ojm;
        if (dseVar == null) {
            qorVarHnj.hnj(true);
        } else {
            qorVarHnj.hnj(dseVar.gjv());
        }
        qorVarHnj.hnj(this.dnm);
        qorVarHnj.hnj(this.mjg);
        Iterator<String> itKeys = jSONObjectGjv.keys();
        if (qorVar instanceof com.bytedance.adsdk.ugeno.hn.hnj) {
            com.bytedance.adsdk.ugeno.hn.hnj hnjVar2 = (com.bytedance.adsdk.ugeno.hn.hnj) qorVar;
            c0169hnjTa = hnjVar2.ta();
            qorVarHnj.hnj(hnjVar2);
        } else {
            c0169hnjTa = null;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strHnj = com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObjectGjv.optString(next), this.f12187hn);
            qorVarHnj.hnj(next, strHnj);
            if (this.apu != null) {
                throw null;
            }
            if (c0169hnjTa != null) {
                c0169hnjTa.hnj(this.hnj, next, strHnj);
            }
        }
        if (c0169hnjTa != null) {
            qorVarHnj.hnj(c0169hnjTa.hnj());
        }
        if (qorVarHnj instanceof com.bytedance.adsdk.ugeno.hn.hnj) {
            List<dse.hnj> listSk = hnjVar.sk();
            if (listSk != null && listSk.size() > 0) {
                if (TextUtils.equals(qorVarHnj.ua(), "Swiper") && listSk.size() != 1) {
                    Log.e("UGTemplateEngine", "Swiper must be only one widget");
                }
                try {
                    Collections.sort(listSk, new Comparator<dse.hnj>() { // from class: com.bytedance.adsdk.ugeno.core.bug.1
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
                        public int compare(dse.hnj hnjVar3, dse.hnj hnjVar4) {
                            return hnjVar3.gjv().optInt("order", 0) - hnjVar4.gjv().optInt("order", 0);
                        }
                    });
                } catch (Throwable unused) {
                }
                Iterator<dse.hnj> it = listSk.iterator();
                while (it.hasNext()) {
                    com.bytedance.adsdk.ugeno.hn.qor<View> qorVarHnj2 = hnj(it.next(), (com.bytedance.adsdk.ugeno.hn.qor<View>) qorVarHnj);
                    if (qorVarHnj2 != null && !qorVarHnj2.rmr()) {
                        ((com.bytedance.adsdk.ugeno.hn.hnj) qorVarHnj).hnj(qorVarHnj2, qorVarHnj2.hqh());
                    }
                }
            } else {
                if (TextUtils.equals(qorVarHnj.ua(), "RecyclerLayout") && (listQor = this.ojm.qor()) != null && listQor.size() > 0) {
                    Iterator<dse.hnj> it2 = listQor.iterator();
                    while (it2.hasNext()) {
                        com.bytedance.adsdk.ugeno.hn.qor<View> qorVarHnj3 = hnj(it2.next(), (com.bytedance.adsdk.ugeno.hn.qor<View>) qorVarHnj);
                        if (qorVarHnj3 != null && qorVarHnj3.sq()) {
                            ((com.bytedance.adsdk.ugeno.hn.hnj) qorVarHnj).hnj(qorVarHnj3);
                        }
                    }
                }
                return qorVarHnj;
            }
        }
        this.qor = qorVarHnj;
        return qorVarHnj;
    }

    public void hn(JSONObject jSONObject) {
        oj ojVar = this.dkl;
        if (ojVar != null) {
            ojVar.qor();
        }
        this.f12187hn = jSONObject;
        hnj(this.qor, jSONObject);
        hnj(this.qor);
        if (this.dkl != null) {
            uua uuaVar = new uua();
            uuaVar.hnj(0);
            uuaVar.hnj(this.qor);
            this.dkl.hnj(uuaVar);
        }
    }

    private void hn(com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        try {
            if (!qorVar.pty() || qorVar.nyv() == null || qorVar.nyv().dkl() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i18n", qorVar.nyv().dkl());
            this.f12187hn.put("xNode", jSONObject);
        } catch (Exception unused) {
        }
    }

    public List<String> hn() {
        return this.jip;
    }

    private void hn(JSONObject jSONObject, com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        List<com.bytedance.adsdk.ugeno.hn.qor<View>> listOjm;
        if (qorVar == null) {
            return;
        }
        this.f12187hn = jSONObject;
        qorVar.hn(jSONObject);
        qorVar.hnj(this.dnm);
        com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj c0169hnjTa = qorVar.gm() != null ? qorVar.gm().ta() : null;
        Iterator<String> itKeys = qorVar.tgn().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strHnj = com.bytedance.adsdk.ugeno.qor.hn.hnj(qorVar.tgn().optString(next), jSONObject);
            qorVar.hnj(next, strHnj);
            if (c0169hnjTa != null) {
                c0169hnjTa.hnj(this.hnj, next, strHnj);
            }
        }
        if ((qorVar instanceof com.bytedance.adsdk.ugeno.hn.hnj) && (listOjm = ((com.bytedance.adsdk.ugeno.hn.hnj) qorVar).ojm()) != null && !listOjm.isEmpty()) {
            Iterator<com.bytedance.adsdk.ugeno.hn.qor<View>> it = listOjm.iterator();
            while (it.hasNext()) {
                hn(jSONObject, it.next());
            }
        }
        if (c0169hnjTa != null) {
            qorVar.hnj(c0169hnjTa.hnj());
        }
    }

    public com.bytedance.adsdk.ugeno.hn.qor<View> hnj(JSONObject jSONObject) {
        oj ojVar = this.dkl;
        if (ojVar != null) {
            ojVar.hnj();
        }
        dse dseVar = new dse(jSONObject, this.f12187hn);
        this.ojm = dseVar;
        if (!(this.f12189sk instanceof com.bytedance.adsdk.ugeno.core.hnj.hn)) {
            this.qor = hn(dseVar.hnj(), (com.bytedance.adsdk.ugeno.hn.qor<View>) null);
            oj ojVar2 = this.dkl;
            if (ojVar2 != null) {
                ojVar2.hn();
                this.qor.hnj(this.dkl);
            }
            return this.qor;
        }
        dseVar.hn();
        throw null;
    }

    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, JSONObject jSONObject) {
        if (qorVar == null) {
            return;
        }
        if (qorVar instanceof com.bytedance.adsdk.ugeno.hn.hnj) {
            qorVar.hnj(jSONObject);
            List<com.bytedance.adsdk.ugeno.hn.qor<View>> listOjm = ((com.bytedance.adsdk.ugeno.hn.hnj) qorVar).ojm();
            if (listOjm == null || listOjm.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.hn.qor<View>> it = listOjm.iterator();
            while (it.hasNext()) {
                hnj(it.next(), jSONObject);
            }
            return;
        }
        qorVar.hnj(jSONObject);
    }

    private void hnj(com.bytedance.adsdk.ugeno.hn.qor<View> qorVar) {
        List<com.bytedance.adsdk.ugeno.hn.qor<View>> listOjm;
        if (qorVar == null) {
            return;
        }
        JSONObject jSONObjectTgn = qorVar.tgn();
        Iterator<String> itKeys = jSONObjectTgn.keys();
        com.bytedance.adsdk.ugeno.hn.hnj hnjVarGm = qorVar.gm();
        com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj c0169hnjTa = hnjVarGm != null ? hnjVarGm.ta() : null;
        hn(qorVar);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strHnj = com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObjectTgn.optString(next), this.f12187hn);
            qorVar.hnj(next, strHnj);
            if (c0169hnjTa != null) {
                c0169hnjTa.hnj(this.hnj, next, strHnj);
            }
        }
        qorVar.hnj(this.gjv);
        qorVar.hnj(this.f12189sk);
        qorVar.hnj(this.dse);
        ojm ojmVar = this.apu;
        if (ojmVar != null) {
            qorVar.hnj(ojmVar);
        }
        sk skVar = this.uua;
        if (skVar != null) {
            qorVar.hnj(skVar);
        }
        com.bytedance.adsdk.ugeno.gjv.orl orlVar = this.aq;
        if (orlVar != null) {
            qorVar.hnj(orlVar);
        }
        if ((qorVar instanceof com.bytedance.adsdk.ugeno.hn.hnj) && (listOjm = ((com.bytedance.adsdk.ugeno.hn.hnj) qorVar).ojm()) != null && listOjm.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.hn.qor<View>> it = listOjm.iterator();
            while (it.hasNext()) {
                hnj(it.next());
            }
        }
        if (c0169hnjTa != null) {
            qorVar.hnj(c0169hnjTa.hnj());
        }
        qorVar.hn();
    }

    public void hnj(fc fcVar) {
        com.bytedance.adsdk.ugeno.core.hnj.hnj hnjVarSk = com.bytedance.adsdk.ugeno.sk.hnj().sk();
        if (hnjVarSk == null) {
            this.f12189sk = fcVar;
        } else {
            if (hnjVarSk.hnj(fcVar) == null) {
                this.f12189sk = fcVar;
                return;
            }
            throw null;
        }
    }

    public void hnj(jip jipVar) {
        this.dse = jipVar;
    }

    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.hn.qor<View>> listOjm;
        if (qorVar == null) {
            return;
        }
        qorVar.hnj(str, objArr);
        if (!(qorVar instanceof com.bytedance.adsdk.ugeno.hn.hnj) || (listOjm = ((com.bytedance.adsdk.ugeno.hn.hnj) qorVar).ojm()) == null || listOjm.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.hn.qor<View>> it = listOjm.iterator();
        while (it.hasNext()) {
            hnj(it.next(), str, objArr);
        }
    }

    public boolean hnj() {
        return this.f12186fc;
    }

    public void hnj(sk skVar) {
        this.uua = skVar;
    }

    public void hnj(JSONObject jSONObject, com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        hn(jSONObject, qorVar);
        hnj((com.bytedance.adsdk.ugeno.hn.qor<View>) qorVar);
    }

    public void hnj(com.bytedance.adsdk.ugeno.gjv.orl orlVar) {
        this.aq = orlVar;
    }
}
