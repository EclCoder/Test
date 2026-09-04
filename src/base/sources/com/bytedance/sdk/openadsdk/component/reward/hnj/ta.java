package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.R;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ta {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.qor.hn f13506hn;
    private final hnj hnj;
    private final com.bytedance.sdk.openadsdk.core.qor.sk qor;

    public ta(hnj hnjVar) {
        this.hnj = hnjVar;
        this.qor = hnj(hnjVar, hnjVar.f13456hn);
        this.f13506hn = new com.bytedance.sdk.openadsdk.core.qor.hn(hnjVar.orp, hnjVar.f13456hn, hnjVar.f13461sk, hnjVar.gjv ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.ta.1
            @Override // com.bytedance.sdk.openadsdk.core.qor.hn, com.bytedance.sdk.openadsdk.core.qor.qor
            public void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray, boolean z10) {
                try {
                    ta.this.hnj(view, f10, f11, f12, f13, sparseArray, this.f14172vf, this.tgn, this.xyo);
                } catch (Exception e10) {
                    apu.qor("TTAD.RFReportManager", "onClickReport error :" + e10.getMessage());
                }
                com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(ta.this.hnj.f13456hn, 9);
                ta.this.hnj.eum.cm();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject aq() {
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar;
        hnj hnjVar = this.hnj;
        if (!hnjVar.dy || (aqVar = hnjVar.f13463th) == null) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.gjv.qor.hnj(aqVar.dnm + 1);
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean dse() {
        hnj hnjVar = this.hnj;
        if (hnjVar == null) {
            return true;
        }
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar = hnjVar.f13463th;
        boolean z10 = aqVar != null && aqVar.ff().tgn();
        hnj hnjVar2 = this.hnj;
        boolean z11 = hnjVar2.pnz;
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar2 = hnjVar2.f13463th;
        return z10 && !z11 && (aqVar2 != null && !aqVar2.zt());
    }

    private boolean ojm() {
        as asVar = this.hnj.f13456hn;
        return asVar != null && asVar.yo() == 1;
    }

    private JSONObject ta() {
        try {
            long jAs = this.hnj.eum.as();
            int iM21do = this.hnj.eum.m21do();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", jAs);
                jSONObject.put("percent", iM21do);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public void dkl() {
        JSONObject jSONObject = new JSONObject();
        int i10 = 1;
        try {
            if (this.hnj.ojm.get()) {
                if (!this.hnj.nyv.qor()) {
                    if (this.hnj.pty.gjv()) {
                        i10 = 3;
                    } else {
                        i10 = this.hnj.nyv.gjv() ? 2 : 0;
                    }
                }
                jSONObject.put("endcard_content", i10);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        hnj hnjVar = this.hnj;
        com.bytedance.sdk.openadsdk.gjv.qor.hn(hnjVar.f13456hn, hnjVar.f13461sk, "click_close", jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.qor.hn gjv() {
        return this.f13506hn;
    }

    public com.bytedance.sdk.openadsdk.core.qor.sk qor() {
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar;
        this.qor.hn(this.hnj.orp.findViewById(R.id.content));
        if (this.hnj.wu.qor() != null) {
            this.qor.hnj(this.hnj.wu.qor());
        }
        this.hnj.as.hnj(this.qor);
        this.qor.hnj(new com.bytedance.sdk.openadsdk.core.qor.hnj.InterfaceC0232hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.ta.3
            @Override // com.bytedance.sdk.openadsdk.core.qor.hnj.InterfaceC0232hnj
            public long getVideoProgress() {
                return ta.this.hnj.eum.orl();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.dnm dnmVar = this.hnj.f13464ua;
        com.bytedance.sdk.openadsdk.core.qor.sk skVar = this.qor;
        dnmVar.hnj(skVar, skVar, this.f13506hn);
        this.hnj.f13465ul.hnj(this.qor);
        if (com.bytedance.sdk.openadsdk.core.model.apu.bug(this.hnj.f13456hn) && (qorVar = this.hnj.f13454gm.hnj) != null && qorVar.getITopLayout() != null) {
            sq.hnj(this.hnj.f13454gm.hnj.getITopLayout(), (View.OnClickListener) this.f13506hn, "LandPage#TopLayoutEmptyClick");
        }
        return this.qor;
    }

    public com.bytedance.sdk.openadsdk.core.qor.sk sk() {
        return this.qor;
    }

    public void hn() {
        if (dse()) {
            return;
        }
        as asVar = this.hnj.f13456hn;
        if (asVar == null || !asVar.cm()) {
            JSONObject jSONObject = new JSONObject();
            boolean z10 = false;
            int iDnm = -1;
            try {
                if (this.hnj.f13456hn.dkl()) {
                    hnj hnjVar = this.hnj;
                    if (hnjVar.f33do != null && hnjVar.f13456hn.th() == 2) {
                        jSONObject.put("dynamic_show_type", this.hnj.f33do.dnm());
                        this.hnj.f33do.hnj(jSONObject);
                        iDnm = this.hnj.f33do.dnm();
                        z10 = true;
                    }
                }
                View viewFindViewById = this.hnj.orp.findViewById(R.id.content);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", viewFindViewById.getWidth());
                jSONObject2.put("height", viewFindViewById.getHeight());
                jSONObject2.put("alpha", viewFindViewById.getAlpha());
                jSONObject.put("root_view", jSONObject2.toString());
            } catch (Throwable th2) {
                apu.hnj("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", th2);
            }
            hnj(jSONObject, aq(), z10, iDnm, false);
        }
    }

    public void hnj() {
        as asVar;
        if (dse() || (asVar = this.hnj.f13456hn) == null || asVar.cm()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectAq = aq();
        boolean z10 = false;
        int iDnm = -1;
        try {
            if (this.hnj.qor()) {
                if (jSONObjectAq == null) {
                    jSONObjectAq = new JSONObject();
                }
                int iHnj = this.hnj.hnj();
                if (1001 == iHnj) {
                    jSONObject.put("dynamic_show_type", iHnj + this.hnj.hn());
                } else {
                    jSONObject.put("dynamic_show_type", iHnj);
                }
            } else if (this.hnj.f13456hn.dkl()) {
                hnj hnjVar = this.hnj;
                if (hnjVar.f33do != null && hnjVar.f13456hn.th() == 2) {
                    jSONObject.put("dynamic_show_type", this.hnj.f33do.dnm());
                    this.hnj.f33do.hnj(jSONObject);
                    iDnm = this.hnj.f33do.dnm();
                    z10 = true;
                }
            }
        } catch (JSONException e10) {
            Log.e("TTAD.RFReportManager", "Inject render fail info to pagJsonData failed", e10);
        }
        hnj(jSONObject, jSONObjectAq, z10, iDnm, true);
    }

    public void qor(boolean z10) {
        hnj hnjVar = this.hnj;
        if (hnjVar != null && z10 && hnjVar.f13456hn.tl() && !this.hnj.f13456hn.xyo()) {
            this.hnj.f13456hn.dse(true);
            hnj hnjVar2 = this.hnj;
            as asVar = hnjVar2.f13456hn;
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, hnjVar2.f13461sk, asVar.mpa());
        }
    }

    public void hn(boolean z10) {
        as asVar;
        hnj hnjVar = this.hnj;
        if (hnjVar == null) {
            return;
        }
        if (!z10 && hnjVar.mkl > 0 && (asVar = hnjVar.f13456hn) != null && asVar.cm()) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.hnj.mkl);
            hnj hnjVar2 = this.hnj;
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(strValueOf, hnjVar2.f13456hn, hnjVar2.f13461sk, hnjVar2.eum.sk());
            this.hnj.mkl = 0L;
        } else {
            this.hnj.mkl = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(this.hnj.f13456hn, z10 ? 4 : 8);
        com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(this.hnj.f13456hn, z10 ? 4 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(JSONObject jSONObject, JSONObject jSONObject2, boolean z10, int i10, boolean z11) {
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx;
        hnj hnjVar = this.hnj;
        as asVar = hnjVar.f13456hn;
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, hnjVar.f13461sk, jSONObject, jSONObject2);
        this.hnj.sq.ta();
        if (!z10) {
            i10 = -1;
        }
        com.bytedance.sdk.openadsdk.do.hn.sk.hnj hnjVar2 = new com.bytedance.sdk.openadsdk.do.hn.sk.hnj(i10);
        hnj(hnjVar2);
        com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(this.hnj.orp.findViewById(R.id.content), asVar, hnjVar2);
        com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(asVar);
        if (!z11 || (gjvVarFvx = asVar.fvx()) == null) {
            return;
        }
        gjvVarFvx.hnj().hnj(0L);
    }

    private void hn(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray, int i10, int i11, int i12) {
        as asVar;
        if (!ojm() || (asVar = this.hnj.f13456hn) == null || view == null) {
            return;
        }
        boolean z10 = com.bytedance.sdk.openadsdk.core.model.apu.bug(asVar) && (view instanceof TopLayoutDislike2) && this.hnj.f13454gm.hnj.getITopLayout() == view;
        int id2 = view.getId();
        if (z10 || id2 == com.bytedance.sdk.openadsdk.utils.jip.dse || id2 == com.bytedance.sdk.openadsdk.utils.jip.dkl || id2 == com.bytedance.sdk.openadsdk.utils.jip.f14679sk || id2 == com.bytedance.sdk.openadsdk.utils.jip.gjv || id2 == com.bytedance.sdk.openadsdk.utils.jip.mjg || id2 == com.bytedance.sdk.openadsdk.utils.jip.f14675rd || id2 == com.bytedance.sdk.openadsdk.utils.jip.f14672oj || id2 == 520093705 || id2 == com.bytedance.sdk.openadsdk.utils.jip.orl || id2 == 520093707 || id2 == com.bytedance.sdk.openadsdk.utils.jip.ojm) {
            int iTa = sq.ta(oj.hnj());
            com.bytedance.sdk.openadsdk.core.model.bug bugVarHnj = new com.bytedance.sdk.openadsdk.core.model.bug.hnj().dkl(f10).sk(f11).gjv(f12).qor(f13).hn(System.currentTimeMillis()).hnj(0L).hnj(sq.hnj(this.hnj.f13464ua.dnm())).hn(sq.qor(this.hnj.f13464ua.dnm())).gjv(i11).sk(i12).dkl(i10).hnj(sparseArray).hn(com.bytedance.sdk.openadsdk.core.ta.hn().hnj() ? 1 : 2).qor(iTa).hnj(sq.aq(oj.hnj())).hn(sq.ojm(oj.hnj())).hnj();
            HashMap map = new HashMap();
            map.put("duration", Long.valueOf(this.hnj.eum.orl()));
            hnj hnjVar = this.hnj;
            String str = hnjVar.f13461sk;
            if (z10) {
                str = "landingpage_endcard";
            }
            com.bytedance.sdk.openadsdk.gjv.qor.hnj("click_other", hnjVar.f13456hn, bugVarHnj, str, true, (Map<String, Object>) map, -1);
        }
    }

    public void hnj(final Map<String, Object> map) {
        if (dse()) {
            return;
        }
        as asVar = this.hnj.f13456hn;
        if (asVar == null || !asVar.cm()) {
            final View viewFindViewById = this.hnj.orp.findViewById(R.id.content);
            if (viewFindViewById == null) {
                viewFindViewById = this.hnj.orp.getWindow().getDecorView();
            }
            int width = viewFindViewById.getWidth();
            int height = viewFindViewById.getHeight();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.ta.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean z10;
                    int iDnm;
                    Map map2;
                    hnj unused = ta.this.hnj;
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = map != null ? new JSONObject(map) : new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("width", viewFindViewById.getWidth());
                        jSONObject2.put("height", viewFindViewById.getHeight());
                        jSONObject2.put("alpha", viewFindViewById.getAlpha());
                        jSONObject.put("root_view", jSONObject2.toString());
                    } catch (Throwable th2) {
                        apu.hnj("TTAD.RFReportManager", "run: ", th2);
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (ta.this.hnj.f33do == null || (map2 = map) == null || !map2.containsKey("dynamic_show_type")) {
                        z10 = false;
                        iDnm = -1;
                    } else {
                        iDnm = ta.this.hnj.f33do.dnm();
                        z10 = true;
                    }
                    int i10 = iDnm;
                    boolean z11 = z10;
                    ta taVar = ta.this;
                    taVar.hnj(jSONObject3, taVar.aq(), z11, i10, false);
                }
            };
            Thread.currentThread().getName();
            if (width > 0 && height > 0) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    runnable.run();
                    return;
                } else {
                    viewFindViewById.post(runnable);
                    return;
                }
            }
            viewFindViewById.post(runnable);
        }
    }

    private void hnj(com.bytedance.sdk.openadsdk.do.hn.sk.hnj hnjVar) {
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar;
        hnj hnjVar2 = this.hnj;
        if (!hnjVar2.dy || (aqVar = hnjVar2.f13463th) == null) {
            return;
        }
        hnjVar.f14326hn = aqVar.dnm;
    }

    public void hnj(boolean z10) {
        as asVar = this.hnj.f13456hn;
        if (asVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.jip.hnj.gjv gjvVarSk = com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj(z10 ? 7 : 8).qor(String.valueOf(asVar.atw())).sk(this.hnj.f13456hn.jp());
        gjvVarSk.hn(this.hnj.nyv.oj()).dkl(this.hnj.nyv.xn());
        gjvVarSk.dse(this.hnj.f13456hn.ldn()).gjv(this.hnj.f13456hn.sp());
        com.bytedance.sdk.openadsdk.jip.gjv.hnj().hn(gjvVarSk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray, int i10, int i11, int i12) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.jip.dse) {
            hnj("click_play_star_level", (JSONObject) null);
        } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.jip.dkl && view.getId() != com.bytedance.sdk.openadsdk.utils.jip.ojm) {
            if (view.getId() == com.bytedance.sdk.openadsdk.utils.jip.f14679sk) {
                hnj(IAoPeRfJn.HTBBZ, (JSONObject) null);
            } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.jip.gjv) {
                hnj("click_play_logo", (JSONObject) null);
            } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.jip.mjg && view.getId() != com.bytedance.sdk.openadsdk.utils.jip.f14675rd && view.getId() != com.bytedance.sdk.openadsdk.utils.jip.f14672oj) {
                if (view.getId() == 520093705) {
                    hnj("click_start_play", ta());
                } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.jip.orl) {
                    hnj("click_video", ta());
                } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.jip.f14682ta) {
                    hnj("fallback_endcard_click", ta());
                }
            } else {
                hnj("click_start_play_bar", ta());
            }
        } else {
            hnj("click_play_star_nums", (JSONObject) null);
        }
        hn(view, f10, f11, f12, f13, sparseArray, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(String str, JSONObject jSONObject) {
        hnj hnjVar = this.hnj;
        as asVar = hnjVar.f13456hn;
        String str2 = hnjVar.f13461sk;
        if (!hnjVar.gjv) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, str2, str, jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.qor.sk hnj(final hnj hnjVar, final as asVar) {
        return new com.bytedance.sdk.openadsdk.core.qor.sk(hnjVar.orp, asVar, hnjVar.f13461sk, hnjVar.gjv ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.ta.4
            @Override // com.bytedance.sdk.openadsdk.core.qor.sk
            public void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray, int i10, int i11, int i12, boolean z10) {
                if (asVar.qs() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        hnj((String) tag);
                    }
                }
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(hnjVar.eum.orl()));
                if (hnjVar.ojm.get()) {
                    map.put("click_scence", 2);
                } else {
                    map.put("click_scence", 1);
                }
                com.bytedance.sdk.openadsdk.activity.single.aq aqVar = hnjVar.f13463th;
                if (aqVar != null) {
                    aqVar.hnj(map, f10, f11);
                }
                hnj(map);
                hnjVar.sq.ul();
                hnjVar.wu.hnj(view, f10, f11, f12, f13, sparseArray, i10, i11, i12, new gjv.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.ta.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.gjv.hnj
                    public void hnj(String str, JSONObject jSONObject) {
                        ta.this.hnj(str, jSONObject);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.gjv.hnj
                    public void hnj(View view2, float f14, float f15, float f16, float f17, SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray2, int i13, int i14, int i15) {
                        ta.this.hnj(view2, f14, f15, f16, f17, sparseArray2, i13, i14, i15);
                    }
                });
                com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(asVar, 9);
                hnjVar.eum.cm();
            }
        };
    }
}
