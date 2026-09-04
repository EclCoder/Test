package com.bytedance.sdk.openadsdk.core.bug.dkl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.bug;
import com.bytedance.adsdk.ugeno.core.fc;
import com.bytedance.adsdk.ugeno.core.jip;
import com.bytedance.adsdk.ugeno.core.orl;
import com.bytedance.sdk.component.adexpress.hn.mjg;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ojm.apu;
import com.bytedance.sdk.openadsdk.core.settings.dnm;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv implements fc, jip, com.bytedance.sdk.component.adexpress.dynamic.gjv, com.bytedance.sdk.component.adexpress.hn.gjv<View> {
    protected static int eum = 24;
    protected com.bytedance.sdk.component.adexpress.hn.aq aq;
    protected com.bytedance.adsdk.ugeno.hn.qor bug;
    protected hnj dkl;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    protected JSONObject f35do;
    protected FrameLayout dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    protected float f13588fc;
    protected JSONObject gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private sk f13589gm;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected Context f13590hn;
    protected bug hnj;
    protected float jip;
    protected float mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    protected long f13591oj;
    protected com.bytedance.sdk.openadsdk.core.ojm.fc ojm;
    protected com.bytedance.adsdk.ugeno.hn.qor orl;
    protected com.bytedance.adsdk.ugeno.hn.qor<View> qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected as f13592sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    protected mjg f13593ta;
    private boolean tgn;
    private com.bytedance.sdk.component.adexpress.hn.dse tu;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private apu f13595ul;
    protected float uua;
    protected String wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    protected long f13597xn;
    protected boolean apu = true;
    private long xyo = 0;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private float f13596vf = 0.0f;
    private float hqh = 0.0f;
    private float nyv = 0.0f;
    private float pty = 0.0f;
    public SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> as = new SparseArray<>();

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private String f13594ua = "";
    private final com.bytedance.sdk.component.aq.hn.qor fvt = new com.bytedance.sdk.component.aq.hn.qor("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.bug.dkl.gjv.1
        @Override // java.lang.Runnable
        public void run() {
            gjv gjvVar = gjv.this;
            gjvVar.gjv = gjvVar.hnj();
            gjv gjvVar2 = gjv.this;
            gjvVar2.f35do = gjvVar2.hn();
            gjv gjvVar3 = gjv.this;
            gjvVar3.f13589gm = new sk(gjvVar3.f13590hn, gjvVar3.f13592sk, gjvVar3.wu, gjvVar3.f35do);
            if (gjv.this.f13595ul != null) {
                gjv gjvVar4 = gjv.this;
                gjvVar4.f13594ua = gjvVar4.f13595ul.getUgenTemplateErrorReason();
            } else {
                gjv.this.f13594ua = "expressView is null";
            }
            com.bytedance.sdk.openadsdk.core.fc.qor().post(gjv.this.orp);
        }
    };
    private final Runnable orp = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bug.dkl.gjv.2
        @Override // java.lang.Runnable
        public void run() {
            if (gjv.this.tu != null) {
                gjv gjvVar = gjv.this;
                gjvVar.hn(gjvVar.tu);
            }
        }
    };
    private boolean sq = false;
    protected AtomicBoolean dnm = new AtomicBoolean(false);

    static {
        if (oj.hnj() != null) {
            eum = oj.hn();
        }
    }

    public gjv(Context context, as asVar, boolean z10, hnj hnjVar, ViewGroup viewGroup) {
        this.f13590hn = context;
        this.tgn = z10;
        this.hnj = new bug(context);
        this.f13592sk = asVar;
        this.dkl = hnjVar;
        this.dse = new FrameLayout(context);
        if (viewGroup instanceof apu) {
            this.f13595ul = (apu) viewGroup;
        }
        this.wu = hnjVar.gjv();
    }

    private void ojm() {
        com.bytedance.adsdk.ugeno.hn.qor<T> qorVarSk;
        if (this.qor == null) {
            return;
        }
        if (this.f13592sk.bsm() && (qorVarSk = this.qor.sk("tvskip")) != 0) {
            qorVarSk.qor(8);
        }
        com.bytedance.adsdk.ugeno.hn.qor<T> qorVarSk2 = this.qor.sk(FreeSpaceBox.TYPE);
        if (qorVarSk2 != 0 && (qorVarSk2 instanceof com.bytedance.adsdk.ugeno.ojm.gjv.qor)) {
            if (!dnm.hn().mjg(String.valueOf(this.f13592sk.atw())) || this.f13592sk.qb() == 5 || this.f13592sk.qb() == 6 || this.f13592sk.xf() == 3) {
                ((com.bytedance.adsdk.ugeno.ojm.gjv.qor) qorVarSk2).mjg("local://tt_close_btn");
                qorVarSk2.hn();
            }
        }
    }

    protected com.bytedance.adsdk.ugeno.hn.qor aq() {
        com.bytedance.adsdk.ugeno.hn.qor<View> qorVar = this.qor;
        if (qorVar == null) {
            return null;
        }
        return qorVar.sk(MimeTypes.BASE_TYPE_VIDEO);
    }

    public com.bytedance.adsdk.ugeno.hn.qor dkl() {
        com.bytedance.adsdk.ugeno.hn.qor<View> qorVar = this.qor;
        if (qorVar == null) {
            return null;
        }
        return qorVar.dkl("PlayableComponent");
    }

    public com.bytedance.adsdk.ugeno.hn.qor dse() {
        return null;
    }

    protected int gjv() {
        this.hnj.hnj((fc) this);
        this.hnj.hnj((jip) this);
        com.bytedance.adsdk.ugeno.hn.qor<View> qorVarHnj = this.hnj.hnj(this.gjv);
        this.qor = qorVarHnj;
        sk skVar = this.f13589gm;
        if (skVar != null && qorVarHnj != null) {
            skVar.hnj(qorVarHnj);
        }
        if (!(this instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.dkl)) {
            this.dkl.gm().hn();
            this.dkl.gm().qor();
        }
        this.hnj.hn(this.f35do);
        return 0;
    }

    public void hnj(long j10, long j11) {
    }

    public void setSoundMute(boolean z10) {
        com.bytedance.adsdk.ugeno.hn.qor<T> qorVarSk;
        com.bytedance.adsdk.ugeno.hn.qor<View> qorVar = this.qor;
        if (qorVar == null || (qorVarSk = qorVar.sk(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) == 0) {
            return;
        }
        if (z10) {
            ((com.bytedance.adsdk.ugeno.ojm.gjv.qor) qorVarSk).mjg("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.ojm.gjv.qor) qorVarSk).mjg("local://tt_reward_full_unmute");
        }
        qorVarSk.hn();
    }

    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        if (this.qor == null) {
            return;
        }
        boolean z11 = i10 == 1;
        hnj(charSequence, z11, i11, z10);
        hn(charSequence, z11, i11, z10);
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.gjv
    public View sk() {
        return this.dse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(com.bytedance.sdk.component.adexpress.hn.dse dseVar) {
        if (this instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.dkl) {
            this.dkl.sk().dse(1);
        } else {
            this.dkl.gm().hnj();
        }
        if (this.gjv == null) {
            dseVar.hnj(Sdk$SDKError.b.OMSDK_JS_WRITE_FAILED_VALUE, "ugen template is null real reason is " + this.f13594ua);
            return;
        }
        if (this.f35do == null) {
            dseVar.hnj(Sdk$SDKError.b.OMSDK_JS_WRITE_FAILED_VALUE, "ugen data is null");
            return;
        }
        int iGjv = gjv();
        if (this.hnj.hnj()) {
            List<String> listHn = this.hnj.hn();
            if (listHn == null) {
                dseVar.hnj(138, "unknow widget");
                return;
            }
            dseVar.hnj(138, "unknow widget;" + listHn.toString());
            return;
        }
        if (iGjv != 0) {
            dseVar.hnj(iGjv, "ugen render fail");
            return;
        }
        if (this.qor == null) {
            dseVar.hnj(138, "ugen render error");
            return;
        }
        hn hnVar = new hn();
        this.f13593ta = hnVar;
        hnVar.hnj(true);
        this.f13593ta.hnj(qor());
        setSoundMute(this.tgn);
        ojm();
        com.bytedance.adsdk.ugeno.hn.qor qorVarAq = aq();
        this.bug = qorVarAq;
        if (qorVarAq != null && (qorVarAq instanceof com.bytedance.sdk.openadsdk.core.bug.hn.dkl.hn)) {
            ((hn) this.f13593ta).hnj((FrameLayout) ((com.bytedance.sdk.openadsdk.core.bug.hn.dkl.hn) qorVarAq).gjv());
        }
        sk skVar = this.f13589gm;
        if (skVar != null) {
            skVar.hnj();
        }
        com.bytedance.adsdk.ugeno.hn.qor qorVarDkl = dkl();
        this.orl = qorVarDkl;
        if (qorVarDkl != null && (qorVarDkl instanceof com.bytedance.adsdk.ugeno.ojm.hn.hn)) {
            ((hn) this.f13593ta).hn((FrameLayout) qorVarDkl.dnm());
        }
        if (hqh.qor(this.f13592sk)) {
            com.bytedance.adsdk.ugeno.hn.qor qorVarDse = dse();
            if (qorVarDse instanceof com.bytedance.sdk.openadsdk.core.bug.hn.qor.hn) {
                ((hn) this.f13593ta).qor(((com.bytedance.sdk.openadsdk.core.bug.hn.qor.hn) qorVarDse).gjv());
            }
        }
        int iFvt = this.qor.fvt();
        int iOrp = this.qor.orp();
        this.dse.removeAllViews();
        this.dse.addView(this.qor.dnm(), new FrameLayout.LayoutParams(iFvt, iOrp));
        float fHqh = this.dkl.hqh();
        float fNyv = this.dkl.nyv();
        float fHn = sq.hn(this.f13590hn, fHqh);
        float fHn2 = sq.hn(this.f13590hn, fNyv);
        if (qor() != 7) {
            this.dse.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else if (fNyv <= 0.0f) {
            this.dse.setLayoutParams(new FrameLayout.LayoutParams((int) fHn, -2));
        } else {
            this.dse.setLayoutParams(new FrameLayout.LayoutParams((int) fHn, (int) fHn2));
        }
        if (fNyv <= 0.0f || fHqh <= 0.0f) {
            this.dse.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int iQor = sq.qor(this.f13590hn, this.dse.getMeasuredWidth());
            int iQor2 = sq.qor(this.f13590hn, this.dse.getMeasuredHeight());
            this.f13593ta.hnj(iQor);
            this.f13593ta.hn(iQor2);
        } else {
            this.f13593ta.hnj(fHqh);
            this.f13593ta.hn(fNyv);
        }
        if (this.dnm.get()) {
            dseVar.hnj(Sdk$SDKError.b.TPAT_RETRY_FAILED_VALUE, "ugen render timeout");
        } else {
            this.hnj.hnj(this.qor, "renderDidFinish", new Object[0]);
            dseVar.hnj(this.dse, this.f13593ta);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.fc
    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, com.bytedance.adsdk.ugeno.gjv.dkl.hnj hnjVar) {
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.gjv
    public int qor() {
        return this.f13592sk.rq();
    }

    public void hnj(as asVar, boolean z10, hnj hnjVar, ViewGroup viewGroup) {
        this.f13592sk = asVar;
        this.dkl = hnjVar;
        this.wu = hnjVar.gjv();
        if (viewGroup instanceof apu) {
            this.f13595ul = (apu) viewGroup;
        }
        this.tgn = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.gjv
    public void hnj(com.bytedance.sdk.component.adexpress.hn.dse dseVar) {
        this.tu = dseVar;
        ua.qor((Runnable) this.fvt);
    }

    protected JSONObject hnj() {
        return this.dkl.qor();
    }

    public void hnj(boolean z10) {
        this.dnm.set(z10);
    }

    public void hnj(com.bytedance.sdk.component.adexpress.hn.aq aqVar) {
        this.aq = aqVar;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.ojm.fc fcVar) {
        this.ojm = fcVar;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.widget.sk skVar) {
        sk skVar2 = this.f13589gm;
        if (skVar2 != null) {
            skVar2.hnj(skVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.fc
    public void hnj(orl orlVar, fc.hn hnVar, fc.hnj hnjVar) {
        if (orlVar == null) {
            return;
        }
        if (orlVar.hn() == 1 || orlVar.hn() == 4) {
            hnj(orlVar);
        }
        if (orlVar.hn() == 10) {
            hnj(orlVar.qor());
        }
        if (hnVar == null || orlVar.gjv() == null) {
            return;
        }
        hnVar.hnj(orlVar.gjv());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gjv
    public void onvideoComplate() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gjv
    public void setTimeUpdate(int i10) {
    }

    private void hnj(JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.hn.qor<T> qorVarSk;
        if (this.qor == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(strOptString2) || (qorVarSk = this.qor.sk(strOptString2)) == 0) {
            return;
        }
        if (TextUtils.equals(strOptString, "onShow")) {
            qorVarSk.qor(0);
        } else if (TextUtils.equals(strOptString, "onDismiss")) {
            qorVarSk.qor(8);
        }
    }

    private void hnj(orl orlVar) {
        JSONObject jSONObjectGjv;
        boolean zHnj;
        int i10;
        String str;
        sk skVar;
        sk skVar2;
        sk skVar3;
        if (this.aq == null) {
            return;
        }
        String strOptString = orlVar.qor().optString("type");
        if ("swiperLeft".equals(strOptString) && (skVar3 = this.f13589gm) != null) {
            skVar3.hn();
            return;
        }
        if ("swiperRight".equals(strOptString) && (skVar2 = this.f13589gm) != null) {
            skVar2.qor();
            return;
        }
        int i11 = 2;
        if (!"swiperClick".equals(strOptString) || (skVar = this.f13589gm) == null) {
            jSONObjectGjv = null;
            zHnj = false;
            i10 = 0;
        } else {
            zHnj = skVar.hnj(orlVar);
            jSONObjectGjv = this.f13589gm.gjv();
            i10 = 2;
        }
        strOptString.getClass();
        switch (strOptString) {
            case "privacy":
                i11 = 7;
                break;
            case "feedback":
                i11 = 3;
                break;
            case "mute":
                i11 = 5;
                break;
            case "skip":
                i11 = 6;
                break;
            case "video":
                i11 = 4;
                break;
            case "creative":
                break;
            default:
                i11 = i10;
                break;
        }
        com.bytedance.adsdk.ugeno.hn.qor qorVarHnj = orlVar.hnj();
        com.bytedance.sdk.openadsdk.core.model.jip.hnj hnjVarHnj = new com.bytedance.sdk.openadsdk.core.model.jip.hnj().gjv(this.mjg).qor(this.f13588fc).hn(this.jip).hnj(this.uua).hn(this.f13591oj).hnj(this.f13597xn).hnj(this.as).hnj(orlVar.hn() != 1 || this.apu);
        if (qorVarHnj == null) {
            str = "";
        } else {
            str = qorVarHnj.ua() + "_" + qorVarHnj.ul();
        }
        this.aq.hnj(orlVar.hnj().dnm(), i11, hnjVarHnj.hnj(str).hn(zHnj).hn(jSONObjectGjv).hnj());
    }

    protected JSONObject hn() {
        return this.dkl.pty();
    }

    private void hn(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        com.bytedance.adsdk.ugeno.hn.qor<T> qorVarSk;
        View viewDnm;
        com.bytedance.adsdk.ugeno.hn.qor<View> qorVar = this.qor;
        if (qorVar == null || (qorVarSk = qorVar.sk(FreeSpaceBox.TYPE)) == 0 || (viewDnm = qorVarSk.dnm()) == null) {
            return;
        }
        int i11 = 0;
        if (!z10 && !z11) {
            i11 = 8;
        }
        viewDnm.setVisibility(i11);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0059  */
    @Override // com.bytedance.adsdk.ugeno.core.jip
    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, MotionEvent motionEvent) {
        int i10;
        int action = motionEvent.getAction();
        int i11 = 0;
        int i12 = 1;
        if (action != 0) {
            if (action == 1) {
                this.jip = motionEvent.getRawX();
                this.uua = motionEvent.getRawY();
                if (Math.abs(this.jip - this.mjg) >= eum || Math.abs(this.uua - this.f13588fc) >= eum) {
                    this.apu = false;
                }
                this.f13597xn = System.currentTimeMillis();
            } else {
                if (action == 2) {
                    this.nyv += Math.abs(motionEvent.getX() - this.f13596vf);
                    this.pty += Math.abs(motionEvent.getY() - this.hqh);
                    this.f13596vf = motionEvent.getX();
                    this.hqh = motionEvent.getY();
                    if (System.currentTimeMillis() - this.xyo > 200) {
                        float f10 = this.nyv;
                        int i13 = eum;
                        if (f10 <= i13 && this.pty <= i13) {
                            i12 = 2;
                        }
                    } else {
                        i12 = 2;
                    }
                    if (Math.abs(motionEvent.getRawX() - this.mjg) >= eum || Math.abs(motionEvent.getRawY() - this.f13588fc) >= eum) {
                        this.apu = false;
                    }
                    i10 = i12;
                }
                this.as.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.qor.qor.hnj(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
            }
            i11 = -1;
        } else {
            this.f13591oj = System.currentTimeMillis();
            this.mjg = motionEvent.getRawX();
            this.f13588fc = motionEvent.getRawY();
            this.apu = true;
            this.nyv = 0.0f;
            this.pty = 0.0f;
            this.xyo = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.dnm.qor.hnj(motionEvent);
            this.f13596vf = motionEvent.getX();
            this.hqh = motionEvent.getY();
        }
        i10 = i11;
        this.as.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.qor.qor.hnj(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }

    private void hnj(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        com.bytedance.adsdk.ugeno.hn.qor<T> qorVarSk;
        int i11;
        com.bytedance.adsdk.ugeno.hn.qor<View> qorVar = this.qor;
        if (qorVar == null || (qorVarSk = qorVar.sk("countdown")) == 0) {
            return;
        }
        View viewDnm = qorVarSk.dnm();
        if (viewDnm instanceof TextView) {
            try {
                i11 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                com.bytedance.sdk.component.utils.apu.qor("UGenRender", "parse duration exception", charSequence);
                i11 = 0;
            }
            if (!z11 && i11 > 0 && !this.sq) {
                viewDnm.setVisibility(0);
                if (!z10 && this.dkl.hnj() && com.bytedance.sdk.component.adexpress.gjv.dkl.hn(this.dkl.gjv())) {
                    ((TextView) viewDnm).setText(String.format(wu.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), "tt_reward_full_skip"), Integer.valueOf(i10)));
                    return;
                }
                if (!"open_ad".equals(this.dkl.gjv()) && this.dkl.hnj()) {
                    this.sq = true;
                    viewDnm.setVisibility(8);
                    return;
                } else {
                    ((TextView) viewDnm).setText(((Object) charSequence) + "s");
                    return;
                }
            }
            viewDnm.setVisibility(8);
        }
    }
}
