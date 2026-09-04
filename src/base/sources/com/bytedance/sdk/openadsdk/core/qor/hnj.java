package com.bytedance.sdk.openadsdk.core.qor;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.bug;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.model.ojm;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ojm.apu;
import com.bytedance.sdk.openadsdk.core.ojm.aq;
import com.bytedance.sdk.openadsdk.core.orp;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hnj extends hn {
    private int fvt;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private boolean f14166hn;
    private boolean hnj;
    private boolean qor;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private boolean f14167ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private WeakReference<InterfaceC0232hnj> f14168ul;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.qor.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public interface InterfaceC0232hnj {
        long getVideoProgress();
    }

    public hnj(Context context, as asVar, String str, int i10) {
        super(context, asVar, str, i10);
        this.hnj = true;
        this.f14166hn = false;
        this.qor = false;
        this.f14167ua = false;
    }

    private boolean aq() {
        return this instanceof aq;
    }

    private boolean dse() {
        as asVar = ((hn) this).dkl;
        return as.sk(asVar) && asVar.znr() == 1;
    }

    private boolean gjv(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof com.bytedance.sdk.openadsdk.core.mjg.hn.dkl) || view.getId() == jip.f14676rg || view.getId() == jip.xad || view.getId() == jip.f14654cm || view.getId() == jip.dzo || view.getId() == jip.pnz || view.getId() == 520093726 || view.getId() == jip.tq) {
            return true;
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                if (gjv(viewGroup.getChildAt(i10))) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    private boolean ojm() {
        as asVar = ((hn) this).dkl;
        if (asVar == null || aq()) {
            return false;
        }
        if (asVar.qri() != 5 && asVar.qri() != 15) {
            return false;
        }
        if (this.fvt == 0) {
            this.fvt = asVar.iz();
        }
        hn();
        hnj();
        qor();
        if (this.fvt == 5 && dse() && hnj() && !hn() && !qor()) {
            return false;
        }
        int i10 = this.fvt;
        return i10 == 1 || i10 == 2 || i10 == 5;
    }

    public boolean hn() {
        return false;
    }

    public void hnj(boolean z10) {
        this.hnj = z10;
    }

    public boolean qor() {
        return false;
    }

    public void hn(boolean z10) {
        this.f14166hn = z10;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0216  */
    /* JADX WARN: Code duplicated, block: B:167:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:175:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:177:0x0302  */
    /* JADX WARN: Code duplicated, block: B:178:0x0305  */
    /* JADX WARN: Code duplicated, block: B:184:0x0316  */
    /* JADX WARN: Code duplicated, block: B:186:0x031e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0321  */
    /* JADX WARN: Code duplicated, block: B:190:0x032a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0334  */
    /* JADX WARN: Code duplicated, block: B:202:0x0354  */
    /* JADX WARN: Code duplicated, block: B:204:0x035a  */
    /* JADX WARN: Code duplicated, block: B:205:0x035e  */
    /* JADX WARN: Code duplicated, block: B:211:0x036c  */
    /* JADX WARN: Code duplicated, block: B:214:0x038c  */
    /* JADX WARN: Code duplicated, block: B:216:0x0394  */
    /* JADX WARN: Code duplicated, block: B:217:0x0397  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    @Override // com.bytedance.sdk.openadsdk.core.qor.hn, com.bytedance.sdk.openadsdk.core.qor.qor
    public void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<qor.hnj> sparseArray, boolean z10) {
        String str;
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        boolean z11;
        JSONObject jSONObject;
        int i10;
        JSONObject jSONObject2;
        int i11;
        View view2;
        Object tag;
        Activity activityHnj;
        Context context;
        boolean z12;
        int i12;
        String strXe;
        int i13;
        if (!hnj(view, 2, f10, f11, f12, f13, sparseArray, z10)) {
            as asVar = ((hn) this).dkl;
            asVar.fc(true);
            asVar.mfh();
            if (!asVar.apu()) {
                asVar.gjv(true);
            }
            if (as.sk(asVar)) {
                com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, ((hn) this).dse, asVar.zxr());
            }
            if (this.orl != null) {
                if (this.jip == null) {
                    this.jip = new HashMap();
                }
                this.jip.put(KPtaxpyICj.xDbcbtomwCLQ, Long.valueOf(this.orl.dkl()));
            }
            int iOoh = asVar.ooh();
            asVar.xo(0);
            com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor qorVar = this.f14160fc;
            if (qorVar != null) {
                qorVar.hnj(iOoh > 0 ? iOoh : 0);
            }
            Map<String, Object> map = this.jip;
            if (map != null) {
                map.remove("dsp_click_type");
                this.jip.remove("click_probability_jump");
                this.jip.remove("auto_click");
            }
            boolean zQs = asVar.qs();
            if (iOoh > 0) {
                if (this.jip == null) {
                    this.jip = new HashMap();
                }
                if (zQs && iOoh < 11) {
                    this.jip.put("dsp_click_type", Integer.valueOf(iOoh));
                }
                if (iOoh >= 11 && asVar.vz() == 0) {
                    this.jip.put("click_probability_jump", Integer.valueOf(ojm.hnj(iOoh)));
                }
            }
            com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = asVar.fvx();
            if (zQs || gjvVarFvx != null) {
                WeakReference<InterfaceC0232hnj> weakReference = this.f14168ul;
                long videoProgress = (weakReference == null || weakReference.get() == null) ? 0L : this.f14168ul.get().getVideoProgress();
                if (!zQs && gjvVarFvx != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
                    gjvVarHnj.dse(videoProgress);
                }
                if (zQs) {
                    if (view != null) {
                        Object tag2 = view.getTag(570425345);
                        if (tag2 instanceof String) {
                            str = (String) tag2;
                        } else {
                            str = "VAST_ACTION_BUTTON";
                        }
                    } else {
                        str = "VAST_ACTION_BUTTON";
                    }
                    com.bytedance.sdk.openadsdk.core.orl.hnj hnjVarMzt = asVar.mzt();
                    if (hnjVarMzt != null) {
                        hnjVarMzt.sk(str);
                        if (!TextUtils.isEmpty(str)) {
                            hnj(str);
                        }
                        if ("VAST_ICON".equals(str)) {
                            com.bytedance.sdk.openadsdk.core.orl.hn hnVarHn = hnjVarMzt.hn();
                            if (hnVarHn != null) {
                                hnVarHn.hnj(videoProgress);
                            }
                        } else if (mTFeqtajA.HTvqQ.equals(str)) {
                            com.bytedance.sdk.openadsdk.core.orl.qor qorVarQor = hnjVarMzt.qor();
                            if (qorVarQor != null) {
                                qorVarQor.hnj(videoProgress);
                            }
                        } else {
                            com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj2 = hnjVarMzt.hnj();
                            if (gjvVarHnj2 != null) {
                                gjvVarHnj2.dse(videoProgress);
                            }
                        }
                    }
                }
            }
            if (ojm() && gjv(view) && !this.qor) {
                super.hnj(view, f10, f11, f12, f13, sparseArray, z10);
                return;
            }
            if (((hn) this).gjv == null) {
                ((hn) this).gjv = oj.hnj();
            }
            if (((hn) this).gjv != null && hnj(view, z10)) {
                JSONObject jSONObjectHnj = apu.hnj(view);
                com.bytedance.sdk.openadsdk.core.model.jip jipVar = ((hn) this).f14163sk;
                if (jipVar != null) {
                    int i14 = jipVar.aq;
                    JSONObject jSONObject3 = jipVar.ojm;
                    JSONObject jSONObject4 = jipVar.orl;
                    i10 = i14;
                    z11 = jipVar.mjg;
                    jSONObject = jSONObject3;
                    jSONObject2 = jSONObject4;
                } else {
                    z11 = false;
                    jSONObject = jSONObjectHnj;
                    i10 = -1;
                    jSONObject2 = null;
                }
                long j10 = this.f44do;
                long j11 = this.tu;
                WeakReference<View> weakReference2 = this.ojm;
                bug bugVarHnj = hnj(f10, f11, f12, f13, sparseArray, j10, j11, weakReference2 == null ? gjv() : weakReference2.get(), sk(), sq.aq(((hn) this).gjv), sq.ta(((hn) this).gjv), sq.ojm(((hn) this).gjv), i10, jSONObject, jSONObject2);
                this.f14164ta = bugVarHnj;
                if (z11) {
                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(CampaignEx.JSON_NATIVE_VIDEO_CLICK, asVar, bugVarHnj, ((hn) this).dse, true, this.jip, z10 ? 1 : 2);
                    return;
                }
                int iRg = asVar.rg();
                if (iRg == 2 || iRg == 3) {
                    if (iRg == 3) {
                        strXe = asVar.xe();
                        if (!TextUtils.isEmpty(strXe) && strXe.contains("play.google.com/store")) {
                            if (com.bytedance.sdk.openadsdk.eum.hnj.hnj.hn.hnj(((hn) this).gjv, strXe, strXe.substring(strXe.indexOf("?id=") + 4), ((hn) this).dse, asVar)) {
                                if (this.hnj) {
                                    bug bugVar = this.f14164ta;
                                    String str2 = ((hn) this).dse;
                                    Map<String, Object> map2 = this.jip;
                                    if (z10) {
                                        i13 = 1;
                                    } else {
                                        i13 = 2;
                                    }
                                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(CampaignEx.JSON_NATIVE_VIDEO_CLICK, asVar, bugVar, str2, true, map2, i13);
                                }
                                view2 = view;
                            }
                        }
                    }
                    if (this.bug == null || this.f14166hn) {
                        bug bugVar2 = this.f14164ta;
                        String str3 = ((hn) this).dse;
                        Map<String, Object> map3 = this.jip;
                        if (z10) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        com.bytedance.sdk.openadsdk.gjv.qor.hnj("click_button", asVar, bugVar2, str3, true, map3, i11);
                    }
                    if (view != null) {
                        view2 = view;
                        try {
                            tag = view2.getTag(520093762);
                        } catch (Exception unused) {
                        }
                    } else {
                        view2 = view;
                        tag = null;
                    }
                    if ((view2 == null && (view2.getId() == 520093726 || (view2 instanceof com.bytedance.sdk.openadsdk.core.mjg.hn.dkl))) || Boolean.TRUE.equals(tag)) {
                        orp.hnj(true);
                    }
                    activityHnj = view2 != null ? com.bytedance.sdk.component.utils.hn.hnj(view2) : null;
                    if (activityHnj == null) {
                        context = ((hn) this).gjv;
                    } else {
                        context = activityHnj;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.apu.qor(asVar) || !this.f14167ua) {
                        boolean zHnj = orp.hnj(context, asVar, this.aq, this.bug, this.uua, ((hn) this).dse, this.f14160fc, true, iOoh);
                        asVar.dkl(SystemClock.elapsedRealtime());
                        orp.hnj(false);
                        z12 = zHnj;
                    } else {
                        z12 = false;
                    }
                    if (this.hnj) {
                        bug bugVar3 = this.f14164ta;
                        String str4 = ((hn) this).dse;
                        Map<String, Object> map4 = this.jip;
                        if (z10) {
                            i12 = 1;
                        } else {
                            i12 = 2;
                        }
                        com.bytedance.sdk.openadsdk.gjv.qor.hnj(CampaignEx.JSON_NATIVE_VIDEO_CLICK, asVar, bugVar3, str4, z12, map4, i12);
                    }
                } else {
                    if (iRg != 4) {
                        if (iRg == 5) {
                            String strHn = hn(((hn) this).dse);
                            if (!TextUtils.isEmpty(strHn)) {
                                com.bytedance.sdk.openadsdk.gjv.qor.hnj("click_call", asVar, this.f14164ta, strHn, true, this.jip, z10 ? 1 : 2);
                            }
                            com.bytedance.sdk.openadsdk.gjv.qor.hnj(CampaignEx.JSON_NATIVE_VIDEO_CLICK, asVar, this.f14164ta, ((hn) this).dse, com.bytedance.sdk.openadsdk.utils.orp.hn(view.getContext(), asVar.sh()), this.jip, z10 ? 1 : 2);
                        } else if (iRg != 8) {
                            view2 = view;
                            iRg = -1;
                        } else {
                            if (iRg == 3) {
                                strXe = asVar.xe();
                                if (!TextUtils.isEmpty(strXe)) {
                                    if (com.bytedance.sdk.openadsdk.eum.hnj.hnj.hn.hnj(((hn) this).gjv, strXe, strXe.substring(strXe.indexOf("?id=") + 4), ((hn) this).dse, asVar)) {
                                        if (this.hnj) {
                                            bug bugVar4 = this.f14164ta;
                                            String str5 = ((hn) this).dse;
                                            Map<String, Object> map5 = this.jip;
                                            if (z10) {
                                                i13 = 1;
                                            } else {
                                                i13 = 2;
                                            }
                                            com.bytedance.sdk.openadsdk.gjv.qor.hnj(CampaignEx.JSON_NATIVE_VIDEO_CLICK, asVar, bugVar4, str5, true, map5, i13);
                                        }
                                    }
                                }
                            }
                            if (this.bug == null) {
                                bug bugVar5 = this.f14164ta;
                                String str6 = ((hn) this).dse;
                                Map<String, Object> map6 = this.jip;
                                if (z10) {
                                    i11 = 1;
                                } else {
                                    i11 = 2;
                                }
                                com.bytedance.sdk.openadsdk.gjv.qor.hnj("click_button", asVar, bugVar5, str6, true, map6, i11);
                            } else {
                                bug bugVar6 = this.f14164ta;
                                String str7 = ((hn) this).dse;
                                Map<String, Object> map7 = this.jip;
                                if (z10) {
                                    i11 = 1;
                                } else {
                                    i11 = 2;
                                }
                                com.bytedance.sdk.openadsdk.gjv.qor.hnj("click_button", asVar, bugVar6, str7, true, map7, i11);
                            }
                            if (view != null) {
                                view2 = view;
                                tag = view2.getTag(520093762);
                            } else {
                                view2 = view;
                                tag = null;
                            }
                            if (view2 == null) {
                                orp.hnj(true);
                            } else {
                                orp.hnj(true);
                            }
                            if (view2 != null) {
                            }
                            if (activityHnj == null) {
                                context = ((hn) this).gjv;
                            } else {
                                context = activityHnj;
                            }
                            if (com.bytedance.sdk.openadsdk.core.model.apu.qor(asVar)) {
                                boolean zHnj2 = orp.hnj(context, asVar, this.aq, this.bug, this.uua, ((hn) this).dse, this.f14160fc, true, iOoh);
                                asVar.dkl(SystemClock.elapsedRealtime());
                                orp.hnj(false);
                                z12 = zHnj2;
                            } else {
                                boolean zHnj3 = orp.hnj(context, asVar, this.aq, this.bug, this.uua, ((hn) this).dse, this.f14160fc, true, iOoh);
                                asVar.dkl(SystemClock.elapsedRealtime());
                                orp.hnj(false);
                                z12 = zHnj3;
                            }
                            if (this.hnj) {
                                bug bugVar7 = this.f14164ta;
                                String str8 = ((hn) this).dse;
                                Map<String, Object> map8 = this.jip;
                                if (z10) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                com.bytedance.sdk.openadsdk.gjv.qor.hnj(CampaignEx.JSON_NATIVE_VIDEO_CLICK, asVar, bugVar7, str8, z12, map8, i12);
                            }
                        }
                    } else if (!hqh.hn(asVar) || (this.bug == null && this.uua == null)) {
                        com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor qorVar2 = this.f14160fc;
                        if (qorVar2 != null) {
                            qorVar2.hnj(asVar);
                            Map<String, Object> map9 = this.jip;
                            if (asVar.apu() && !asVar.xn()) {
                                map9.put("auto_click", Boolean.TRUE);
                                asVar.sk(false);
                            }
                            if (this.hnj) {
                                com.bytedance.sdk.openadsdk.gjv.qor.hnj(CampaignEx.JSON_NATIVE_VIDEO_CLICK, asVar, this.f14164ta, ((hn) this).dse, true, map9, z10 ? 1 : 2);
                            }
                        }
                    } else {
                        activityHnj = view != null ? com.bytedance.sdk.component.utils.hn.hnj(view) : null;
                        boolean zHnj4 = orp.hnj(activityHnj == null ? ((hn) this).gjv : activityHnj, asVar, this.aq, this.bug, this.uua, ((hn) this).dse, this.f14160fc, true, iOoh);
                        if (this.hnj) {
                            com.bytedance.sdk.openadsdk.gjv.qor.hnj(CampaignEx.JSON_NATIVE_VIDEO_CLICK, asVar, this.f14164ta, ((hn) this).dse, zHnj4, this.jip, z10 ? 1 : 2);
                        }
                    }
                    view2 = view;
                }
                hn.hnj hnjVar = this.dnm;
                if (hnjVar != null) {
                    hnjVar.hnj(view2, iRg);
                }
            }
        }
    }

    public void qor(boolean z10) {
        this.qor = z10;
    }

    private String hn(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return "banner_call";
            case "open_ad":
                return "open_ad";
            case "embeded_ad":
                return "feed_call";
            case "interaction":
                return "interaction_call";
            case "slide_banner_ad":
                return "banner_call";
            default:
                return "";
        }
    }

    public void gjv(boolean z10) {
        this.f14167ua = z10;
    }

    protected boolean hnj() {
        as asVar = ((hn) this).dkl;
        if (asVar == null) {
            return true;
        }
        int iHn = oj.gjv().hn(asVar.atw());
        int iQor = com.bytedance.sdk.component.utils.oj.qor(oj.hnj());
        if (iHn == 1) {
            return com.bytedance.sdk.openadsdk.utils.orp.gjv(iQor);
        }
        if (iHn == 2) {
            return com.bytedance.sdk.openadsdk.utils.orp.sk(iQor) || com.bytedance.sdk.openadsdk.utils.orp.gjv(iQor) || com.bytedance.sdk.openadsdk.utils.orp.dkl(iQor);
        }
        if (iHn != 3) {
            return iHn != 5 || com.bytedance.sdk.openadsdk.utils.orp.gjv(iQor) || com.bytedance.sdk.openadsdk.utils.orp.dkl(iQor);
        }
        return false;
    }

    public void hnj(InterfaceC0232hnj interfaceC0232hnj) {
        this.f14168ul = new WeakReference<>(interfaceC0232hnj);
    }

    public void hnj(View view) {
        hnj(view, this.apu, this.eum, this.wu, this.as, this.f14169gm, this.nyv);
    }
}
