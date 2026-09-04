package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class uua {
    private long aq;
    private final String dkl;
    private c dnm;
    private com.bytedance.sdk.openadsdk.hnj.hn.dkl dse;
    private final PAGNativeAd gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor f14245hn;
    private final com.bytedance.sdk.openadsdk.core.model.as hnj;
    private com.bytedance.sdk.openadsdk.core.qor.hnj mjg;
    private com.bytedance.sdk.openadsdk.core.qor.hn orl;
    private final Context qor;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.hnj.hn.hnj f14247ta;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private List<View> f14246sk = new ArrayList();
    private final com.bytedance.sdk.openadsdk.gjv.dse ojm = new com.bytedance.sdk.openadsdk.gjv.dse();
    private final AtomicBoolean bug = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final ViewGroup f14250hn;
        private final com.bytedance.sdk.openadsdk.gjv.dse hnj;

        public hnj(com.bytedance.sdk.openadsdk.gjv.dse dseVar, ViewGroup viewGroup) {
            this.hnj = dseVar;
            this.f14250hn = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.hnj.hnj(System.currentTimeMillis(), fvt.hnj(this.f14250hn));
        }
    }

    public uua(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.as asVar, String str, com.bytedance.sdk.openadsdk.hnj.hn.hnj hnjVar) {
        this.gjv = pAGNativeAd;
        this.hnj = asVar;
        this.qor = context;
        this.dkl = str;
        this.f14247ta = hnjVar;
        if (asVar.rg() == 4) {
            this.f14245hn = com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(context, str);
        }
    }

    private aq sk(ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof aq) {
                return (aq) childAt;
            }
        }
        return null;
    }

    private void gjv(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.core.model.as asVar;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f14246sk != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : this.f14246sk) {
                    if (view != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("width", view.getWidth());
                            jSONObject2.put("height", view.getHeight());
                            jSONObject2.put("alpha", view.getAlpha());
                        } catch (Throwable unused) {
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("image_view", jSONArray.toString());
            }
            if (viewGroup != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("width", viewGroup.getWidth());
                    jSONObject3.put("height", viewGroup.getHeight());
                    jSONObject3.put("alpha", viewGroup.getAlpha());
                } catch (Throwable unused2) {
                }
                jSONObject.put("root_view", jSONObject3.toString());
            }
            PAGMediaView pAGMediaViewAq = this.f14247ta.aq();
            if (pAGMediaViewAq != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("width", com.bytedance.sdk.openadsdk.utils.sq.qor(this.qor, pAGMediaViewAq.getWidth()) * 1.0f);
                    jSONObject4.put("height", com.bytedance.sdk.openadsdk.utils.sq.qor(this.qor, pAGMediaViewAq.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            com.bytedance.sdk.openadsdk.core.ojm.apu apuVarHn = this.f14247ta.hn();
            if (apuVarHn != null && (asVar = this.hnj) != null) {
                jSONObject.put("dynamic_show_type", asVar.rq());
                apuVarHn.hnj(jSONObject, this.hnj);
            }
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(this.hnj, this.dkl, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(this.hnj);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.apu.hnj("InteractionManager", "onShowFun json error", e10);
        }
    }

    private void hn(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.hnj.hn.dkl dklVar) {
        this.dse = dklVar;
        viewGroup.addOnLayoutChangeListener(new hnj(this.ojm, viewGroup));
        this.f14246sk = list;
        hnj(list2, (com.bytedance.sdk.openadsdk.core.qor.qor) null);
        if (list != null) {
            for (View view : this.f14246sk) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        hnj(list3, (com.bytedance.sdk.openadsdk.core.qor.qor) null);
    }

    private aq qor(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.hnj.hn.dkl dklVar) {
        this.dse = dklVar;
        viewGroup.addOnLayoutChangeListener(new hnj(this.ojm, viewGroup));
        this.f14246sk = list;
        aq aqVarSk = sk(viewGroup);
        if (aqVarSk == null) {
            aqVarSk = new aq(this.qor, viewGroup, false);
            viewGroup.addView(aqVarSk);
        }
        aqVarSk.hnj();
        aqVarSk.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.f14246sk) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        aqVarSk.setRefCreativeViews(list3);
        return aqVarSk;
    }

    public com.bytedance.sdk.openadsdk.gjv.dse hnj() {
        return this.ojm;
    }

    public void hnj(View view, int i10) {
        com.bytedance.sdk.openadsdk.hnj.hn.dkl dklVar = this.dse;
        if (dklVar != null) {
            dklVar.onAdClicked();
        }
    }

    public void hnj(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.hnj.hn.dkl dklVar) {
        hn(viewGroup, list, list2, list3, dklVar);
        hnj(viewGroup);
        hnj(viewGroup, list2, list3);
    }

    private void hn(com.bytedance.sdk.openadsdk.core.qor.hn hnVar, com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar) {
        com.bytedance.sdk.openadsdk.hnj.hn.hnj hnjVar2 = this.f14247ta;
        if (hnjVar2 != null && hnjVar2.hn() != null) {
            com.bytedance.sdk.openadsdk.core.ojm.apu apuVarHn = this.f14247ta.hn();
            if ((hnVar instanceof com.bytedance.sdk.openadsdk.core.ojm.ojm) && (hnjVar instanceof com.bytedance.sdk.openadsdk.core.ojm.aq)) {
                apuVarHn.setClickListener((com.bytedance.sdk.openadsdk.core.ojm.ojm) hnVar);
                apuVarHn.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.ojm.aq) hnjVar);
            }
            apuVarHn.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.sk() { // from class: com.bytedance.sdk.openadsdk.core.uua.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.sk
                public void hnj() {
                    if (uua.this.dse != null) {
                        uua.this.dse.onAdClicked();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.hnj.hn.hnj hnjVar3 = this.f14247ta;
        if (hnjVar3 != null && hnjVar3.hnj() != null) {
            this.f14247ta.hnj().setOnClickListener(hnjVar);
            this.f14247ta.hnj().setOnTouchListener(hnjVar);
        }
        com.bytedance.sdk.openadsdk.hnj.hn.hnj hnjVar4 = this.f14247ta;
        if (hnjVar4 != null) {
            hnjVar4.hnj(hnjVar);
            this.f14247ta.hnj(hnVar);
        }
    }

    private void hnj(List<View> list, com.bytedance.sdk.openadsdk.core.qor.qor qorVar) {
        if (com.bytedance.sdk.component.utils.orl.hn(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(qorVar);
                    view.setOnTouchListener(qorVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor(ViewGroup viewGroup) {
        this.ojm.hnj(System.currentTimeMillis(), fvt.hnj(viewGroup));
    }

    public void hnj(c cVar) {
        this.dnm = cVar;
        com.bytedance.sdk.openadsdk.core.qor.hn hnVar = this.orl;
        if (hnVar != null) {
            hnVar.hnj(cVar);
        }
        com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar = this.mjg;
        if (hnjVar != null) {
            hnjVar.hnj(cVar);
        }
    }

    private void hnj(ViewGroup viewGroup) {
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        Context contextHnj = viewGroup != null ? com.bytedance.sdk.component.utils.hn.hnj(viewGroup) : null;
        if (contextHnj == null) {
            contextHnj = this.qor;
        }
        if (this.hnj.th() == 2) {
            com.bytedance.sdk.openadsdk.core.model.as asVar = this.hnj;
            String str = this.dkl;
            this.orl = new com.bytedance.sdk.openadsdk.core.ojm.ojm(contextHnj, asVar, str, com.bytedance.sdk.openadsdk.utils.orp.hnj(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.as asVar2 = this.hnj;
            String str2 = this.dkl;
            this.orl = new com.bytedance.sdk.openadsdk.core.qor.hn(contextHnj, asVar2, str2, com.bytedance.sdk.openadsdk.utils.orp.hnj(str2));
        }
        this.orl.hn(viewGroup);
        this.orl.hnj(this.dnm);
        this.orl.hnj(this.f14245hn);
        this.orl.hnj(this.gjv);
        this.orl.hnj(map);
        this.orl.hnj(new com.bytedance.sdk.openadsdk.core.qor.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.uua.1
            @Override // com.bytedance.sdk.openadsdk.core.qor.hn.hnj
            public void hnj(View view, int i10) {
                if (uua.this.dse != null) {
                    uua.this.dse.onAdClicked();
                }
            }
        });
        if (this.hnj.th() == 2) {
            Context context = this.qor;
            com.bytedance.sdk.openadsdk.core.model.as asVar3 = this.hnj;
            String str3 = this.dkl;
            this.mjg = new com.bytedance.sdk.openadsdk.core.ojm.aq(context, asVar3, str3, com.bytedance.sdk.openadsdk.utils.orp.hnj(str3));
        } else {
            Context context2 = this.qor;
            com.bytedance.sdk.openadsdk.core.model.as asVar4 = this.hnj;
            String str4 = this.dkl;
            this.mjg = new com.bytedance.sdk.openadsdk.core.qor.hnj(context2, asVar4, str4, com.bytedance.sdk.openadsdk.utils.orp.hnj(str4));
        }
        this.mjg.hn(viewGroup);
        this.mjg.hnj(this.dnm);
        this.mjg.hnj(this.f14245hn);
        this.mjg.hnj(this.gjv);
        this.mjg.hnj(map);
        this.mjg.hnj(new com.bytedance.sdk.openadsdk.core.qor.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.uua.2
            @Override // com.bytedance.sdk.openadsdk.core.qor.hn.hnj
            public void hnj(View view, int i10) {
                if (uua.this.dse != null) {
                    uua.this.dse.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(uua.this.hnj, 9);
                uua.this.f14247ta.orl();
            }
        });
    }

    private void hn(final ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.utils.jbd.hnj(viewGroup, true, 5, false, new com.bytedance.sdk.openadsdk.utils.jbd.hn() { // from class: com.bytedance.sdk.openadsdk.core.uua.6
            @Override // com.bytedance.sdk.openadsdk.utils.jbd.hn
            public void hn() {
                uua.this.hn();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jbd.hn
            public void hnj(boolean z10) {
                uua.this.hnj(z10, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jbd.hn
            public void hnj() {
                uua.this.qor(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jbd.hn
            public void hnj(View view, boolean z10) {
                if (!z10) {
                    com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(uua.this.hnj, 8);
                } else {
                    com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(uua.this.hnj, 4);
                    uua.this.hnj(viewGroup, view);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn() {
        if (this.aq > 0) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(String.valueOf(SystemClock.elapsedRealtime() - this.aq), this.hnj, this.dkl, this.ojm);
            this.aq = 0L;
        }
    }

    private void hnj(ViewGroup viewGroup, aq aqVar, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.qor.hn hnVar = this.orl;
        if (hnVar == null || this.mjg == null) {
            return;
        }
        aqVar.hnj(list, hnVar);
        aqVar.hnj(list2, this.mjg);
        hnj(this.orl, this.mjg);
        hnj(aqVar, viewGroup);
    }

    private void hnj(ViewGroup viewGroup, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.qor.hn hnVar = this.orl;
        if (hnVar == null || this.mjg == null) {
            return;
        }
        hnj(list, hnVar);
        hnj(list2, this.mjg);
        hnj(this.orl, this.mjg);
        hn(viewGroup);
    }

    private void hnj(com.bytedance.sdk.openadsdk.core.qor.hn hnVar, com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar) {
        if (this.hnj.th() == 2) {
            hn(hnVar, hnjVar);
        } else {
            hnj(hnjVar);
        }
    }

    private void hnj(com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar) {
        if (com.bytedance.sdk.openadsdk.core.settings.dnm.hn().gjv(String.valueOf(this.hnj.atw()))) {
            com.bytedance.sdk.openadsdk.hnj.hn.hnj hnjVar2 = this.f14247ta;
            if (hnjVar2 != null && hnjVar2.hnj() != null) {
                this.f14247ta.hnj().setOnClickListener(hnjVar);
                this.f14247ta.hnj().setOnTouchListener(hnjVar);
            }
            com.bytedance.sdk.openadsdk.hnj.hn.hnj hnjVar3 = this.f14247ta;
            if (hnjVar3 != null) {
                hnjVar3.hnj(hnjVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.hnj.hn.hnj hnjVar4 = this.f14247ta;
        if (hnjVar4 != null && hnjVar4.hnj() != null) {
            PAGMediaView pAGMediaViewHnj = this.f14247ta.hnj();
            com.bytedance.sdk.openadsdk.core.qor.qor qorVar = new com.bytedance.sdk.openadsdk.core.qor.qor() { // from class: com.bytedance.sdk.openadsdk.core.uua.4
                @Override // com.bytedance.sdk.openadsdk.core.qor.qor
                protected void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray, boolean z10) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            pAGMediaViewHnj.setOnClickListener(qorVar);
            pAGMediaViewHnj.setOnTouchListener(qorVar);
        }
        com.bytedance.sdk.openadsdk.hnj.hn.hnj hnjVar5 = this.f14247ta;
        if (hnjVar5 != null) {
            hnjVar5.hnj((com.bytedance.sdk.openadsdk.core.qor.hnj) null);
        }
    }

    private void hnj(aq aqVar, final ViewGroup viewGroup) {
        aqVar.setCallback(new aq.hnj() { // from class: com.bytedance.sdk.openadsdk.core.uua.5
            @Override // com.bytedance.sdk.openadsdk.core.aq.hnj
            public void hn() {
                uua.this.hn();
            }

            @Override // com.bytedance.sdk.openadsdk.core.aq.hnj
            public void hnj(boolean z10) {
                uua.this.hnj(z10, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.aq.hnj
            public void hnj() {
                uua.this.qor(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.aq.hnj
            public void hnj(View view) {
                uua.this.hnj(viewGroup, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(boolean z10, ViewGroup viewGroup) {
        if (z10 && this.hnj.tl() && !this.hnj.xyo()) {
            this.hnj.dse(true);
            com.bytedance.sdk.openadsdk.core.model.as asVar = this.hnj;
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, this.dkl, asVar.mpa());
        }
        if (!z10 && this.aq > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.aq);
            this.ojm.hnj(System.currentTimeMillis(), fvt.hnj(viewGroup));
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(strValueOf, this.hnj, this.dkl, this.ojm);
            this.aq = 0L;
            return;
        }
        this.ojm.hnj(System.currentTimeMillis(), fvt.hnj(viewGroup));
        this.aq = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(ViewGroup viewGroup, View view) {
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        if (this.bug.get()) {
            return;
        }
        this.bug.set(true);
        if (this.gjv instanceof com.bytedance.sdk.openadsdk.hnj.hn.hnj.qor) {
            com.bytedance.sdk.openadsdk.core.ojm.apu apuVarHn = this.f14247ta.hn();
            if (apuVarHn != null) {
                apuVarHn.oj();
            }
            ((com.bytedance.sdk.openadsdk.hnj.hn.hnj.qor) this.gjv).hnj(true);
        }
        this.ojm.hnj(System.currentTimeMillis(), fvt.hnj(viewGroup));
        this.aq = SystemClock.elapsedRealtime();
        gjv(viewGroup);
        com.bytedance.sdk.openadsdk.hnj.hn.dkl dklVar = this.dse;
        if (dklVar != null) {
            dklVar.hnj(this.gjv);
        }
        if (this.hnj.ll()) {
            com.bytedance.sdk.openadsdk.utils.orp.hnj(this.hnj, view);
        }
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = this.hnj.fvx();
        if (gjvVarFvx == null || (gjvVarHnj = gjvVarFvx.hnj()) == null) {
            return;
        }
        gjvVarHnj.hnj(0L);
    }
}
