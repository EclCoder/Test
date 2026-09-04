package com.bytedance.sdk.openadsdk.core.qor;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.bug;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.model.jip;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends qor {

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private static int f14159ul = Integer.MIN_VALUE;
    protected final int aq;
    protected PAGNativeAd bug;
    protected final as dkl;
    protected hnj dnm;
    protected final String dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor f14160fc;
    protected Context gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private WeakReference<Activity> f14161hn;
    private String hnj;
    protected Map<String, Object> jip;
    protected boolean mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.ojm.hn f14162oj;
    protected WeakReference<View> ojm;
    protected c orl;
    private boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public jip f14163sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    protected bug f14164ta;
    protected com.bytedance.sdk.openadsdk.core.gjv.hnj uua;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    protected int f14165xn;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj(View view, int i10);
    }

    public hn(Context context, as asVar, String str, int i10) {
        this.mjg = false;
        this.f14165xn = 0;
        this.qor = false;
        this.gjv = context;
        this.dkl = asVar;
        this.dse = str;
        this.aq = i10;
    }

    public View gjv() {
        WeakReference<Activity> weakReference = this.f14161hn;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f14161hn.get().findViewById(R.id.content);
    }

    public void hn(View view) {
        if (view == null) {
            return;
        }
        this.ojm = new WeakReference<>(view);
    }

    public boolean hnj(bug bugVar, Map<String, Object> map) {
        return false;
    }

    public void qor(int i10) {
        this.tgn = i10;
    }

    public void sk(boolean z10) {
        this.mjg = z10;
    }

    public static boolean qor(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || hnj(view.getContext()) == view.getId() || com.bytedance.sdk.openadsdk.utils.jip.f14652af == view.getId() || com.bytedance.sdk.openadsdk.utils.jip.f14663jd == view.getId();
    }

    public void hn(int i10) {
        this.xyo = i10;
    }

    public void hnj(com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor qorVar) {
        this.f14160fc = qorVar;
    }

    public String sk() {
        return this.hnj;
    }

    public void gjv(int i10) {
        this.f14165xn = i10;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.ojm.hn hnVar) {
        this.f14162oj = hnVar;
    }

    public void hnj(PAGNativeAd pAGNativeAd) {
        this.bug = pAGNativeAd;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.gjv.hnj hnjVar) {
        this.uua = hnjVar;
    }

    public void hnj(c cVar) {
        this.orl = cVar;
    }

    public void hnj(hnj hnjVar) {
        this.dnm = hnjVar;
    }

    public void hnj(Activity activity) {
        if (activity == null) {
            return;
        }
        this.f14161hn = new WeakReference<>(activity);
    }

    public hn(Context context, as asVar, String str, int i10, boolean z10) {
        this(context, asVar, str, i10);
        this.qor = z10;
    }

    public void hnj(Map<String, Object> map) {
        Map<String, Object> map2 = this.jip;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.jip);
        }
        this.jip = map;
    }

    public void hnj(int i10) {
        this.f14172vf = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qor.qor
    public void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<qor.hnj> sparseArray, boolean z10) {
        int i10;
        boolean z11;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        if (this.gjv == null) {
            this.gjv = oj.hnj();
        }
        if ((this.qor || !hnj(view, 1, f10, f11, f12, f13, sparseArray, z10)) && this.gjv != null) {
            jip jipVar = this.f14163sk;
            if (jipVar != null) {
                int i11 = jipVar.aq;
                JSONObject jSONObject3 = jipVar.ojm;
                JSONObject jSONObject4 = jipVar.orl;
                z11 = jipVar.mjg;
                i10 = i11;
                jSONObject = jSONObject3;
                jSONObject2 = jSONObject4;
            } else {
                i10 = -1;
                z11 = false;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j10 = this.f44do;
            long j11 = this.tu;
            WeakReference<View> weakReference = this.ojm;
            bug bugVarHnj = hnj(f10, f11, f12, f13, sparseArray, j10, j11, weakReference == null ? null : weakReference.get(), sk(), sq.aq(this.gjv), sq.ta(this.gjv), sq.ojm(this.gjv), i10, jSONObject, jSONObject2);
            this.f14164ta = bugVarHnj;
            if (hnj(bugVarHnj, this.jip)) {
                return;
            }
            if (this.orl != null) {
                if (this.jip == null) {
                    this.jip = new HashMap();
                }
                this.jip.put("duration", Long.valueOf(this.orl.dkl()));
            }
            as asVar = this.dkl;
            if (!this.qor && !z11) {
                hnj hnjVar = this.dnm;
                if (hnjVar != null) {
                    hnjVar.hnj(view, -1);
                }
                if (hnj(view, z10)) {
                    boolean zHn = hqh.hn(asVar);
                    String strHnj = zHn ? this.dse : orp.hnj(this.aq);
                    if (view != null) {
                        try {
                            if (Boolean.TRUE.equals(view.getTag(520093762))) {
                                com.bytedance.sdk.openadsdk.core.orp.hnj(true);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    Activity activityHnj = view != null ? com.bytedance.sdk.component.utils.hn.hnj(view) : null;
                    boolean zHnj = com.bytedance.sdk.openadsdk.core.orp.hnj(activityHnj == null ? this.gjv : activityHnj, asVar, this.aq, this.bug, this.uua, strHnj, this.f14160fc, zHn, 0);
                    com.bytedance.sdk.openadsdk.core.orp.hnj(false);
                    if (zHnj || asVar == null || asVar.pdc() == null || asVar.pdc().qor() != 2) {
                        if (asVar != null && !zHnj && TextUtils.isEmpty(asVar.xe()) && com.bytedance.sdk.openadsdk.gjv.hn.hnj(this.dse)) {
                            com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(this.gjv, this.dse).hnj(asVar);
                        }
                        com.bytedance.sdk.openadsdk.gjv.qor.hnj(CampaignEx.JSON_NATIVE_VIDEO_CLICK, asVar, this.f14164ta, this.dse, zHnj, this.jip, z10 ? 1 : 2);
                        return;
                    }
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(CampaignEx.JSON_NATIVE_VIDEO_CLICK, asVar, this.f14164ta, this.dse, true, this.jip, z10 ? 1 : 2);
            com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = asVar.fvx();
            if (gjvVarFvx == null || asVar.qs() || (gjvVarHnj = gjvVarFvx.hnj()) == null) {
                return;
            }
            c cVar = this.orl;
            gjvVarHnj.dse(cVar != null ? cVar.dkl() : 0L);
        }
    }

    public boolean hnj(View view, boolean z10) {
        return hnj(view, this.dkl, z10);
    }

    public static boolean hnj(View view, as asVar, boolean z10) {
        if (view != null && asVar != null) {
            try {
                int i10 = com.bytedance.sdk.component.adexpress.dynamic.hnj.apu;
                String strValueOf = String.valueOf(view.getTag(i10));
                if (view.getTag(i10) != null && !TextUtils.isEmpty(strValueOf)) {
                    if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(strValueOf)) {
                        return z10;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (qor(view)) {
                return asVar.idl() != 1 || z10;
            }
            if (asVar.dy() == 1 && !z10) {
                return false;
            }
        }
        return true;
    }

    protected bug hnj(float f10, float f11, float f12, float f13, SparseArray<qor.hnj> sparseArray, long j10, long j11, View view, String str, float f14, int i10, float f15, int i11, JSONObject jSONObject, JSONObject jSONObject2) {
        return new bug.hnj().dkl(f10).sk(f11).gjv(f12).qor(f13).hn(j10).hnj(j11).hnj(sq.hnj(view)).hn(sq.qor(view)).gjv(this.tgn).sk(this.xyo).dkl(this.f14172vf).hnj(sparseArray).hn(ta.hn().hnj() ? 1 : 2).hnj(str).hnj(f14).qor(i10).hn(f15).hnj(i11).hnj(jSONObject).hn(jSONObject2).hnj();
    }

    protected boolean hnj(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<qor.hnj> sparseArray, boolean z10) {
        if (this.f14162oj == null) {
            return false;
        }
        this.f14162oj.hnj(view, i10, new jip.hnj().gjv(f10).qor(f11).hn(f12).hnj(f13).hn(this.f44do).hnj(this.tu).hnj(sparseArray).hnj(z10).hnj());
        return true;
    }

    private static int hnj(Context context) {
        if (f14159ul == Integer.MIN_VALUE) {
            f14159ul = wu.sk(context, "btn_native_creative");
        }
        return f14159ul;
    }

    public void hnj(String str) {
        this.hnj = str;
    }
}
