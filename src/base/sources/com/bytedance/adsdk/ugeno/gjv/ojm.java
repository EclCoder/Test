package com.bytedance.adsdk.ugeno.gjv;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm implements dnm {
    private boolean aq;
    private orl dkl;
    private com.bytedance.adsdk.ugeno.core.hn.hnj dse;
    private com.bytedance.adsdk.ugeno.hn.qor gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Map<String, List<com.bytedance.adsdk.ugeno.gjv.gjv.qor>> f12250hn;
    private hnj hnj;
    private boolean ojm;
    private Map<String, List<com.bytedance.adsdk.ugeno.gjv.gjv.qor>> qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.core.sk f12251sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private boolean f12252ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public Map<String, List<com.bytedance.adsdk.ugeno.gjv.gjv.qor>> f12253hn;
        public Map<String, List<com.bytedance.adsdk.ugeno.gjv.gjv.qor>> hnj;
        public Map<String, com.bytedance.adsdk.ugeno.gjv.gjv.qor> qor;

        public hnj(Map<String, List<com.bytedance.adsdk.ugeno.gjv.gjv.qor>> map, Map<String, com.bytedance.adsdk.ugeno.gjv.gjv.qor> map2, Map<String, List<com.bytedance.adsdk.ugeno.gjv.gjv.qor>> map3) {
            this.hnj = map;
            this.qor = map2;
            this.f12253hn = map3;
        }
    }

    public ojm(com.bytedance.adsdk.ugeno.hn.qor qorVar, hnj hnjVar) {
        this.gjv = qorVar;
        this.hnj = hnjVar;
        if (hnjVar != null) {
            this.f12250hn = hnjVar.hnj;
            this.qor = hnjVar.f12253hn;
        }
        if (qorVar != null && qorVar.eta() && this.dse == null) {
            this.dse = new com.bytedance.adsdk.ugeno.core.hn.hnj();
        }
    }

    public void gjv() {
        List<com.bytedance.adsdk.ugeno.gjv.gjv.qor> listHnj = hnj("animateState");
        if (listHnj == null || listHnj.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.gjv.gjv.qor qorVar : listHnj) {
            if (qorVar != null) {
                qorVar.hnj(this);
                qorVar.hnj(new Object[0]);
            }
        }
    }

    public void hn() {
        List<com.bytedance.adsdk.ugeno.gjv.gjv.qor> listHnj = hnj("twist");
        if (listHnj == null || listHnj.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.gjv.gjv.qor qorVar : listHnj) {
            if (qorVar != null) {
                qorVar.hnj(this);
                qorVar.hnj(new Object[0]);
            }
        }
    }

    public void hnj(com.bytedance.adsdk.ugeno.core.sk skVar) {
        this.f12251sk = skVar;
    }

    public void qor() {
        List<com.bytedance.adsdk.ugeno.gjv.gjv.qor> value;
        hnj hnjVar = this.hnj;
        if (hnjVar == null) {
            return;
        }
        for (Map.Entry<String, List<com.bytedance.adsdk.ugeno.gjv.gjv.qor>> entry : hnjVar.hnj.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null && !value.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.gjv.gjv.qor qorVar : value) {
                    if (qorVar instanceof com.bytedance.adsdk.ugeno.gjv.gjv.gjv) {
                        qorVar.hnj(this);
                        qorVar.hnj(new Object[0]);
                    }
                }
            }
        }
    }

    public void sk() {
        List<com.bytedance.adsdk.ugeno.gjv.gjv.qor> listHnj = hnj("timer");
        if (listHnj == null || listHnj.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.gjv.gjv.qor qorVar : listHnj) {
            if (qorVar != null) {
                qorVar.hnj(this);
                qorVar.hnj(new Object[0]);
            }
        }
    }

    public void hnj(orl orlVar) {
        this.dkl = orlVar;
    }

    public void hnj() {
        List<com.bytedance.adsdk.ugeno.gjv.gjv.qor> listHnj = hnj("shake");
        if (listHnj == null || listHnj.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.gjv.gjv.qor qorVar : listHnj) {
            if (qorVar != null) {
                qorVar.hnj(this);
                qorVar.hnj(new Object[0]);
            }
        }
    }

    public List<com.bytedance.adsdk.ugeno.gjv.gjv.qor> hn(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.gjv.gjv.qor>> map;
        Map<String, List<com.bytedance.adsdk.ugeno.gjv.gjv.qor>> map2 = this.qor;
        if (map2 == null || map2.isEmpty() || TextUtils.isEmpty(str) || (map = this.qor) == null || !map.containsKey(str)) {
            return null;
        }
        return this.qor.get(str);
    }

    public boolean hnj(MotionEvent motionEvent) {
        List<com.bytedance.adsdk.ugeno.gjv.gjv.qor> listHnj = hnj("touchStart");
        if (listHnj != null && !listHnj.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.gjv.gjv.qor qorVar : listHnj) {
                if (qorVar instanceof com.bytedance.adsdk.ugeno.gjv.gjv.bug) {
                    qorVar.hnj(this);
                    qorVar.hnj(motionEvent);
                }
            }
        }
        List<com.bytedance.adsdk.ugeno.gjv.gjv.qor> listHnj2 = hnj("touchEnd");
        List<com.bytedance.adsdk.ugeno.gjv.gjv.qor> listHnj3 = hnj("tap");
        List<com.bytedance.adsdk.ugeno.gjv.gjv.qor> listHnj4 = hnj("slide");
        if (listHnj != null && !listHnj.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.gjv.gjv.qor qorVar2 : listHnj2) {
                if (qorVar2 instanceof com.bytedance.adsdk.ugeno.gjv.gjv.dnm) {
                    qorVar2.hnj(this);
                    this.f12252ta = qorVar2.hnj(motionEvent);
                }
            }
        }
        if ((listHnj3 != null && !listHnj3.isEmpty()) || (listHnj4 != null && !listHnj4.isEmpty())) {
            if (this.f12252ta && motionEvent.getAction() == 1) {
                return true;
            }
            com.bytedance.adsdk.ugeno.core.hn.hnj hnjVar = this.dse;
            if (hnjVar != null) {
                if (hnjVar.hnj(motionEvent)) {
                    Log.d("GesThrough_UGEveFacade", "mockEvent，skip");
                    return false;
                }
                this.dse.hnj(this.gjv, motionEvent);
            }
            if (listHnj3 != null && !listHnj3.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.gjv.gjv.qor qorVar3 : listHnj3) {
                    if (qorVar3 instanceof com.bytedance.adsdk.ugeno.gjv.gjv.ojm) {
                        ((com.bytedance.adsdk.ugeno.gjv.gjv.ojm) qorVar3).hnj(this.dkl);
                        qorVar3.hnj(this);
                        this.aq = qorVar3.hnj(motionEvent);
                    }
                }
            }
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && this.aq) {
                return true;
            }
            if (listHnj4 != null && !listHnj4.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.gjv.gjv.qor qorVar4 : listHnj4) {
                    if (qorVar4 instanceof com.bytedance.adsdk.ugeno.gjv.gjv.sk) {
                        qorVar4.hnj(this);
                        this.ojm = qorVar4.hnj(motionEvent);
                    }
                }
            }
            if ((action == 1 || action == 3) && !this.aq && !this.ojm && this.dse != null) {
                Log.d("GesThrough_UGEveFacade", "Non-tap event & not satisfy slide requirements, need gesture through");
                this.dse.hnj(this.gjv);
            }
            return this.aq || this.ojm;
        }
        return this.f12252ta;
    }

    private void hnj(String str, List<dkl.hnj> list) {
        com.bytedance.adsdk.ugeno.gjv.hn.hnj hnjVarHnj;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (dkl.hnj hnjVar : list) {
            if (hnjVar != null && (hnjVarHnj = com.bytedance.adsdk.ugeno.gjv.hn.hnj.C0168hnj.hnj(this.gjv, str, hnjVar)) != null) {
                hnjVarHnj.hnj();
                hnjVarHnj.hn();
            }
        }
    }

    public List<com.bytedance.adsdk.ugeno.gjv.gjv.qor> hnj(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.gjv.gjv.qor>> map;
        Map<String, List<com.bytedance.adsdk.ugeno.gjv.gjv.qor>> map2 = this.f12250hn;
        if (((map2 == null || map2.isEmpty()) && ((map = this.qor) == null || map.isEmpty())) || TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, List<com.bytedance.adsdk.ugeno.gjv.gjv.qor>> map3 = this.f12250hn;
        if (map3 != null && map3.containsKey(str)) {
            return this.f12250hn.get(str);
        }
        Map<String, List<com.bytedance.adsdk.ugeno.gjv.gjv.qor>> map4 = this.qor;
        if (map4 != null && map4.containsKey(str)) {
            return this.qor.get(str);
        }
        return null;
    }

    public void hnj(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.gjv.gjv.qor> listHn = hn(str);
        if (listHn == null || listHn.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.gjv.gjv.qor qorVar : listHn) {
            qorVar.hnj(this);
            qorVar.hnj(objArr);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.dnm
    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, List<dkl.hnj> list) {
        com.bytedance.adsdk.ugeno.core.sk skVar = this.f12251sk;
        if (skVar != null) {
            skVar.hnj(qorVar, str, list);
        }
        hnj(str, list);
    }

    public static ojm hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, String str) {
        com.bytedance.adsdk.ugeno.gjv.gjv.qor qorVarHnj;
        if (qorVar != null && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return null;
                }
                hnj hnjVar = new hnj(new HashMap(), new HashMap(), new HashMap());
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null && (qorVarHnj = com.bytedance.adsdk.ugeno.gjv.gjv.qor.hnj.hnj(qorVar.dnm().getContext(), qorVar, jSONObjectOptJSONObject, qorVar.bug())) != null) {
                        if (hnjVar.hnj.containsKey(qorVarHnj.gjv())) {
                            List<com.bytedance.adsdk.ugeno.gjv.gjv.qor> list = hnjVar.hnj.get(qorVarHnj.gjv());
                            if (list == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(qorVarHnj);
                                hnjVar.hnj.put(qorVarHnj.gjv(), arrayList);
                                hnjVar.f12253hn.put(qorVarHnj.dkl(), arrayList);
                            } else {
                                list.add(qorVarHnj);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(qorVarHnj);
                            hnjVar.hnj.put(qorVarHnj.gjv(), arrayList2);
                            hnjVar.f12253hn.put(qorVarHnj.dkl(), arrayList2);
                        }
                        hnjVar.qor.put(qorVarHnj.sk(), qorVarHnj);
                    }
                }
                return new ojm(qorVar, hnjVar);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
