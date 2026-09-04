package com.bytedance.sdk.openadsdk.core.orl;

import android.text.TextUtils;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.a;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class gjv {
    private boolean apu;
    private String eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private boolean f14102fc;
    private long jip;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private boolean f14104oj;
    private as uua;
    private String wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private boolean f14107xn;
    private final AtomicBoolean orl = new AtomicBoolean(false);
    private final AtomicBoolean mjg = new AtomicBoolean(false);
    public List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> hnj = new ArrayList();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> f14103hn = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> qor = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> gjv = new ArrayList();

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> f14105sk = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> dkl = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> dse = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> aq = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> ojm = new ArrayList();

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> f14106ta = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.orl.hn.hn> dnm = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.orl.hn.hnj> bug = new ArrayList();

    public void aq(long j10) {
        if (!hnj(j10, this.ojm, null, this.f14102fc ? null : new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn(CampaignEx.JSON_NATIVE_VIDEO_MUTE, this.uua, j10)) || this.f14102fc) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.eum, "track_mute", (JSONObject) null);
    }

    public void bug(List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list) {
        this.f14106ta.addAll(list);
    }

    public void dkl(long j10) {
        if (!hnj(j10, this.dse, null, this.f14102fc ? null : new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn(FreeSpaceBox.TYPE, this.uua)) || this.f14102fc) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.eum, "track_skip", (JSONObject) null);
    }

    public void dnm(List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list) {
        this.ojm.addAll(list);
    }

    public void dse(long j10) {
        if (!hnj(j10, this.aq, null, new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn(this.f14102fc ? CampaignEx.JSON_NATIVE_VIDEO_CLICK : "clickTracking", this.uua)) || this.f14102fc) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.eum, "track_video_click", (JSONObject) null);
    }

    public void gjv(long j10) {
        if (!hnj(j10, this.f14105sk, null, new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn(this.f14102fc ? "video_progress" : CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, this.uua, 1.0f)) || this.f14102fc) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.eum, "track_complete", (JSONObject) null);
    }

    public void hn(long j10) {
        if (!hnj(j10, this.qor, null, this.f14102fc ? null : new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, this.uua, j10)) || this.f14102fc) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.eum, "track_pause", (JSONObject) null);
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.orl.hnj.hnj hnjVar) {
        if (!hnj(-1L, this.hnj, hnjVar, this.f14102fc ? null : new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn("error", this.uua, 0.0f)) || this.f14102fc) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.eum, "track_error", (JSONObject) null);
    }

    public void ojm(long j10) {
        if (!hnj(j10, this.f14106ta, null, this.f14102fc ? null : new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, this.uua, j10)) || this.f14102fc) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.eum, "track_unmute", (JSONObject) null);
    }

    public void qor(long j10) {
        if (!hnj(j10, this.gjv, null, this.f14102fc ? null : new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn(CampaignEx.JSON_NATIVE_VIDEO_RESUME, this.uua, j10)) || this.f14102fc) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.eum, "track_resume", (JSONObject) null);
    }

    public void sk(long j10) {
        if (this.mjg.compareAndSet(false, true)) {
            hnj(j10, this.dkl, (com.bytedance.sdk.openadsdk.core.orl.hnj.hnj) null);
        }
    }

    public void ta(List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list) {
        this.hnj.addAll(list);
    }

    public void sk(List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list) {
        this.dkl.addAll(list);
    }

    public void aq(List<com.bytedance.sdk.openadsdk.core.orl.hn.hn> list) {
        this.dnm.addAll(list);
        Collections.sort(this.dnm);
    }

    public void dkl(List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list) {
        this.dse.addAll(list);
    }

    public void dse(List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list) {
        this.aq.addAll(list);
    }

    public void gjv(List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list) {
        this.f14105sk.addAll(list);
    }

    public void hn(List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list) {
        this.qor.addAll(list);
    }

    public void hnj(long j10) {
        if (this.orl.compareAndSet(false, true)) {
            if (!hnj(j10, this.f14103hn, null, new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn(this.f14102fc ? "show_impression" : "impression", this.uua)) || this.f14102fc) {
                return;
            }
            com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.eum, "track_impression", (JSONObject) null);
        }
    }

    public void ojm(List<com.bytedance.sdk.openadsdk.core.orl.hn.hnj> list) {
        this.bug.addAll(list);
        Collections.sort(this.bug);
    }

    public void qor(List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list) {
        this.gjv.addAll(list);
    }

    public void hnj(long j10, long j11, dkl dklVar) {
        com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn hnVar;
        if (System.currentTimeMillis() - this.jip >= 1000 && j10 >= 0 && j11 > 0) {
            this.jip = System.currentTimeMillis();
            float f10 = j10 / j11;
            List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> listHnj = hnj(j10, f10);
            float f11 = 0.25f;
            if (f10 >= 0.25f && !this.f14104oj) {
                hnj("firstQuartile");
                this.f14104oj = true;
                if (dklVar != null) {
                    hnj(dklVar, 6);
                }
                if (!this.f14102fc) {
                    hnVar = new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn("firstQuartile", this.uua, 0.25f);
                    f10 = f11;
                }
                f10 = f11;
                hnVar = null;
            } else {
                f11 = 0.5f;
                if (f10 >= 0.5f && !this.f14107xn) {
                    hnj(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
                    this.f14107xn = true;
                    if (dklVar != null) {
                        hnj(dklVar, 7);
                    }
                    if (!this.f14102fc) {
                        hnVar = new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, this.uua, 0.5f);
                        f10 = f11;
                    }
                    f10 = f11;
                    hnVar = null;
                } else {
                    f11 = 0.75f;
                    if (f10 < 0.75f || this.apu) {
                        hnVar = null;
                    } else {
                        hnj("thirdQuartile");
                        this.apu = true;
                        if (dklVar != null) {
                            hnj(dklVar, 8);
                        }
                        if (!this.f14102fc) {
                            hnVar = new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn("thirdQuartile", this.uua, 0.75f);
                            f10 = f11;
                        }
                        f10 = f11;
                        hnVar = null;
                    }
                }
            }
            if (f10 < 0.03f) {
                f10 = 0.0f;
            }
            if (!this.f14102fc && !listHnj.isEmpty()) {
                com.bytedance.sdk.openadsdk.core.orl.hn.qor qorVar = listHnj.get(0);
                if ((qorVar instanceof com.bytedance.sdk.openadsdk.core.orl.hn.hnj) && ((com.bytedance.sdk.openadsdk.core.orl.hn.hnj) qorVar).hnj() == 0) {
                    com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.eum, "track_start", (JSONObject) null);
                    hnVar = new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn("start", this.uua, f10);
                }
            }
            if (listHnj.isEmpty()) {
                return;
            }
            if (hnVar == null) {
                hnVar = new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn("video_progress", this.uua, f10);
            }
            hnj(j10, listHnj, null, hnVar);
        }
    }

    private void hnj(final dkl dklVar, final int i10) {
        com.bytedance.sdk.component.utils.ojm.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.orl.gjv.1
            @Override // java.lang.Runnable
            public void run() {
                dkl dklVar2 = dklVar;
                if (dklVar2 != null) {
                    dklVar2.hnj(i10);
                }
            }
        });
    }

    private void hnj(String str) {
        try {
            if (this.f14102fc) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(lkCBSIFlvmyGX.QUEDaQgzPKkvq, str);
                com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.eum, "vast_play_track", jSONObject);
            } else if ("firstQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.eum, "track_first_quartile", (JSONObject) null);
            } else if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equals(str)) {
                com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.eum, "track_midpoint", (JSONObject) null);
            } else if ("thirdQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.eum, "track_third_quartile", (JSONObject) null);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean hnj(long j10, List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list, com.bytedance.sdk.openadsdk.core.orl.hnj.hnj hnjVar, com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn hnVar) {
        a aVarPwt;
        as asVar = this.uua;
        String strH = null;
        if (asVar != null && (aVarPwt = asVar.pwt()) != null) {
            strH = aVarPwt.h();
        }
        return com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(this.uua, list, hnjVar, j10, strH, hnVar, hnj());
    }

    private String hnj() {
        if (this.wu == null) {
            this.wu = UUID.randomUUID().toString();
        }
        return this.wu;
    }

    private boolean hnj(long j10, List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list, com.bytedance.sdk.openadsdk.core.orl.hnj.hnj hnjVar) {
        return hnj(j10, list, hnjVar, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> hnj(long j10, float f10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.dnm.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.orl.hn.hn hnVar = this.dnm.get(i10);
            if (hnVar.hnj(f10)) {
                arrayList.add(hnVar);
            }
        }
        for (int i11 = 0; i11 < this.bug.size(); i11++) {
            com.bytedance.sdk.openadsdk.core.orl.hn.hnj hnjVar = this.bug.get(i11);
            if (hnjVar.hnj(j10)) {
                arrayList.add(hnjVar);
            }
        }
        return arrayList;
    }

    public void hnj(List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list) {
        this.f14103hn.addAll(list);
    }

    public void hnj(JSONObject jSONObject) {
        ta(com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(jSONObject.optJSONArray("errorTrackers")));
        hnj(com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(jSONObject.optJSONArray("impressionTrackers")));
        hn(com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(jSONObject.optJSONArray("pauseTrackers"), true));
        qor(com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(jSONObject.optJSONArray("resumeTrackers"), true));
        gjv(com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(jSONObject.optJSONArray("completeTrackers")));
        sk(com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(jSONObject.optJSONArray("closeTrackers")));
        dkl(com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(jSONObject.optJSONArray("skipTrackers")));
        dse(com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(jSONObject.optJSONArray("clickTrackers")));
        dnm(com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(jSONObject.optJSONArray("muteTrackers"), true));
        bug(com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(jSONObject.optJSONArray("unMuteTrackers"), true));
        aq(com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn(jSONObject.optJSONArray("fractionalTrackers")));
        ojm(com.bytedance.sdk.openadsdk.core.orl.hn.qor.qor(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void hnj(as asVar) {
        this.uua = asVar;
        this.eum = asVar.sk();
        this.f14102fc = asVar.qs();
    }

    public void hnj(String str, long j10) {
        if (TextUtils.isEmpty(str) || j10 < 0) {
            return;
        }
        ojm(Collections.singletonList(new com.bytedance.sdk.openadsdk.core.orl.hn.hnj.C0229hnj(str, j10).hnj()));
    }

    public void hnj(String str, float f10) {
        if (TextUtils.isEmpty(str) || f10 < 0.0f) {
            return;
        }
        aq(Collections.singletonList(new com.bytedance.sdk.openadsdk.core.orl.hn.hn.hnj(str, f10).hnj()));
    }

    public void hnj(gjv gjvVar) {
        ta(gjvVar.hnj);
        hnj(gjvVar.f14103hn);
        hn(gjvVar.qor);
        qor(gjvVar.gjv);
        gjv(gjvVar.f14105sk);
        sk(gjvVar.dkl);
        dkl(gjvVar.dse);
        dse(gjvVar.aq);
        dnm(gjvVar.ojm);
        bug(gjvVar.f14106ta);
        aq(gjvVar.dnm);
        ojm(gjvVar.bug);
    }
}
