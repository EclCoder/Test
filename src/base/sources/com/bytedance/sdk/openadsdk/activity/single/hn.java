package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.sdk.openadsdk.component.reward.bug;
import com.bytedance.sdk.openadsdk.component.reward.hnj.dnm;
import com.bytedance.sdk.openadsdk.component.reward.jip;
import com.bytedance.sdk.openadsdk.component.reward.uua;
import com.bytedance.sdk.openadsdk.core.model.Cdo;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.gjv.ta;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.hnj.sk.hnj f13173hn;
    private static com.bytedance.sdk.openadsdk.hnj.qor.hn qor;
    private final boolean apu;
    private com.bytedance.sdk.openadsdk.hnj.qor.hn aq;
    private final boolean bug;
    private final com.bytedance.sdk.openadsdk.orl.ojm dkl;
    private com.bytedance.sdk.openadsdk.activity.single.qor dnm;
    private com.bytedance.sdk.openadsdk.hnj.sk.hnj dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private Bundle f13174fc;
    private final as gjv;
    public bug hnj;
    private Runnable jip;
    private int mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private boolean f13175oj;
    private final boolean ojm;
    private Activity orl;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final boolean f13177ta;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private boolean f13178xn;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final Bundle f13176sk = new Bundle();
    private final dnm.hn uua = new dnm.hn();
    private final boolean eum = com.bytedance.sdk.openadsdk.as.sk.ta();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class gjv extends AbstractC0199hn {
        private boolean bug;
        private int dnm;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private final int f13183ta;

        public gjv(hn hnVar, as asVar, com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar) {
            super(hnVar, asVar, qorVar);
            if (asVar == null) {
                this.f13183ta = 100;
            } else if (asVar.jo() >= 0) {
                this.f13183ta = Math.min(100, asVar.jo());
            } else {
                this.f13183ta = oj.gjv().tgn(String.valueOf(asVar.atw())).dkl;
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.hn.AbstractC0199hn, android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (!this.bug && this.gjv <= this.dnm) {
                this.bug = true;
                aq aqVarDnm = this.hnj.dnm();
                if (aqVarDnm != null) {
                    aqVarDnm.lu();
                }
            }
            super.handleMessage(message);
            return true;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.hn.AbstractC0199hn
        protected int hnj(as asVar) {
            if (asVar != null) {
                return asVar.fgi();
            }
            return 30;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.hn.AbstractC0199hn
        public void hnj(int i10, as asVar) {
            boolean z10 = this.dkl == 0;
            int i11 = this.gjv;
            super.hnj(i10, asVar);
            if (!z10) {
                if (this.qor < i11) {
                    this.dnm = (int) ((1.0f - (this.f13183ta / 100.0f)) * this.gjv);
                    return;
                }
                return;
            }
            if (this.dkl == 1) {
                this.dnm = 3;
            } else {
                this.dnm = (int) ((1.0f - (this.f13183ta / 100.0f)) * this.qor);
            }
            bug bugVar = this.hnj.hnj;
            if (bugVar != null) {
                bugVar.hnj(this.gjv);
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.hn$hn, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class AbstractC0199hn implements Handler.Callback {
        private int apu;
        private int as;
        private final Context bug;

        /* JADX INFO: renamed from: cm, reason: collision with root package name */
        private boolean f13184cm;
        protected int dkl;
        private final com.bytedance.sdk.openadsdk.component.reward.top.qor dnm;

        /* JADX INFO: renamed from: do, reason: not valid java name */
        private int f25do;
        private boolean dzo;
        private int eum;

        /* JADX INFO: renamed from: fc, reason: collision with root package name */
        private boolean f13185fc;

        /* JADX INFO: renamed from: ff, reason: collision with root package name */
        private int f13186ff;
        private boolean fvt;
        protected int gjv;

        /* JADX INFO: renamed from: gm, reason: collision with root package name */
        private int f13187gm;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        protected as f13188hn;
        protected final hn hnj;
        private boolean hqh;
        private int jbd;
        private boolean jip;
        private boolean mjg;
        private int nyv;

        /* JADX INFO: renamed from: oj, reason: collision with root package name */
        private float f13189oj;
        private boolean orp;
        private boolean pnz;
        protected float qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        protected int f13190sk;
        private boolean sq;
        private boolean tgn;
        private int tu;

        /* JADX INFO: renamed from: ua, reason: collision with root package name */
        private int f13192ua;

        /* JADX INFO: renamed from: ul, reason: collision with root package name */
        private int f13193ul;
        private boolean uua;

        /* JADX INFO: renamed from: vf, reason: collision with root package name */
        private int f13194vf;
        private int wu;
        private int xad;
        private boolean xyo;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private final Handler f13191ta = new Handler(Looper.getMainLooper(), this);
        private final int orl = 1000;
        protected int dse = -1;

        /* JADX INFO: renamed from: xn, reason: collision with root package name */
        private int f13195xn = 1000;
        private boolean pty = false;
        boolean aq = false;
        public int ojm = -1;

        public AbstractC0199hn(hn hnVar, as asVar, com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar) {
            this.hnj = hnVar;
            this.f13188hn = asVar;
            this.dnm = qorVar;
            this.bug = qorVar.getContext();
            this.gjv = hnj(asVar);
        }

        private void bug() {
            com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar;
            if (this.hqh || this.f13185fc || this.jip || (qorVar = this.dnm) == null) {
                return;
            }
            qorVar.setShowEndCardNextAd(true, this.f13188hn);
        }

        private void dnm() {
            if (this.hnj.apu()) {
                this.dnm.showSkipButton();
                this.f13185fc = true;
            } else {
                this.jip = true;
                this.dnm.showCloseButton();
            }
            this.dnm.setShowPlayableNextAd(false, this.f13188hn);
        }

        private void gjv(int i10) {
            if (this.dse > 0 && this.uua && i10 == 3) {
                this.dkl = i10;
                hnj(i10, 1000);
            }
        }

        private void mjg() {
            aq aqVarDnm;
            this.dzo = true;
            this.f13193ul = 0;
            hn hnVar = this.hnj;
            if (hnVar == null || (aqVarDnm = hnVar.dnm()) == null || aqVarDnm.lhi()) {
                return;
            }
            bug();
        }

        private void orl() {
            int i10 = this.f13193ul;
            int i11 = this.jbd;
            boolean z10 = this.dzo;
            int i12 = this.xad;
            int i13 = this.f13186ff;
            if (i10 < i11 || z10) {
                return;
            }
            if (i12 >= i13) {
                this.f13184cm = false;
            } else {
                this.xad = i12 + 1;
                mjg();
            }
        }

        private void sk(int i10) {
            if (this.pnz && i10 == 4) {
                this.dkl = i10;
                hnj(i10, 1000);
            }
        }

        private void ta() {
            int i10 = this.dse;
            if (i10 > 0) {
                this.dse = i10 - 1;
            }
            if (this.dse == 0 && this.uua) {
                this.uua = false;
                hn hnVar = this.hnj;
                if (hnVar == null || hnVar.dnm() == null) {
                    return;
                }
                aq aqVarDnm = this.hnj.dnm();
                if (aqVarDnm instanceof com.bytedance.sdk.openadsdk.activity.single.sk) {
                    ((com.bytedance.sdk.openadsdk.activity.single.sk) aqVarDnm).eum();
                }
            }
        }

        public void aq() {
            if (this.f13184cm) {
                bug();
                this.dzo = false;
            }
        }

        public void dkl() {
            this.xyo = true;
        }

        public void dse() {
            if (this.xyo && this.f13184cm && !this.hqh) {
                int i10 = this.f13187gm;
                int i11 = this.f13193ul;
                boolean z10 = this.tgn;
                int i12 = i10 + 1;
                this.f13187gm = i12;
                this.f13193ul = i11 + 1;
                if (z10 && i12 >= this.f13192ua) {
                    bug();
                }
                if (this.orp || this.fvt) {
                    orl();
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1 || i10 == 2) {
                hnj(message);
            } else if (i10 == 3) {
                if (this.dse > 0) {
                    ta();
                    if (this.dse >= 0) {
                        hnj(message.what, 1000);
                    }
                }
            } else if (i10 == 4) {
                if (this.pnz) {
                    sk();
                    if (this.pnz && !this.hqh) {
                        hnj(message.what, 1000);
                    }
                }
            } else if (i10 == 5 && this.f13184cm) {
                dse();
                if (this.f13184cm && !this.hqh) {
                    hnj(message.what, 1000);
                }
            }
            return true;
        }

        public void hn() {
            this.pnz = false;
            this.f13184cm = false;
            this.aq = false;
            this.nyv = 0;
            this.ojm = -1;
            this.dzo = false;
            this.f13186ff = 0;
            this.f13193ul = 0;
            this.f13187gm = 0;
            this.tgn = false;
            this.xad = 0;
            this.pty = false;
            com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar = this.dnm;
            if (qorVar != null) {
                qorVar.setShowPlayableNextAd(false, this.f13188hn);
            }
        }

        public int hnj() {
            return this.gjv;
        }

        protected abstract int hnj(as asVar);

        public void ojm() {
            if (this.f13184cm) {
                this.dzo = true;
            }
        }

        public void qor() {
            this.f13191ta.removeMessages(this.dkl);
        }

        public void hnj(boolean z10) {
            this.tgn = z10;
            this.f13193ul = 0;
            if (z10) {
                int i10 = this.as;
                int i11 = this.eum;
                this.apu = i10 - i11;
                this.tu = i11;
                this.f25do = i10;
            }
        }

        public void qor(int i10) {
            this.dse = i10;
            if (i10 > 0) {
                this.uua = true;
                if (this.gjv <= 0 || this.f13185fc) {
                    gjv(3);
                }
            }
        }

        public void gjv() {
            if (this.f13185fc || this.jip) {
                return;
            }
            hnj(-1);
            this.pty = true;
            com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar = this.dnm;
            if (qorVar != null) {
                qorVar.setCountDownFor1InN("", -1);
                this.dnm.setShowEndCardNextAd(true, this.f13188hn);
            }
        }

        public void sk() {
            if (this.xyo && this.pnz) {
                if (this.jip) {
                    this.pnz = false;
                }
                if (this.hqh) {
                    return;
                }
                int i10 = this.f13194vf;
                boolean z10 = this.tgn;
                int i11 = i10 + 1;
                this.f13194vf = i11;
                if (z10) {
                    this.f25do = this.as;
                } else {
                    this.f25do = this.apu + this.eum;
                }
                if (i11 >= this.apu) {
                    if (!this.aq) {
                        this.nyv++;
                        this.aq = true;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("click_countdown_remaining", this.gjv);
                            jSONObject.put("hint_sequence", this.nyv);
                            com.bytedance.sdk.openadsdk.gjv.qor.gjv(this.f13188hn, this.hnj.dnm().d_(), jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                    com.bytedance.sdk.openadsdk.activity.single.qor qorVar = this.hnj.dnm;
                    int i12 = this.tu;
                    this.tu = i12 - 1;
                    qorVar.hnj(i12, this.gjv);
                } else {
                    this.aq = false;
                    this.hnj.dnm.hnj(-1, this.gjv);
                }
                if (this.tgn && this.f13194vf >= this.wu) {
                    boolean z11 = this.f13185fc;
                    boolean z12 = this.jip;
                    if (!z11 && !z12) {
                        this.dnm.setShowPlayableNextAd(true, this.f13188hn);
                    }
                }
                if (this.f13194vf < this.f25do || this.hnj.dnm() == null) {
                    return;
                }
                aq aqVarDnm = this.hnj.dnm();
                if (aqVarDnm instanceof com.bytedance.sdk.openadsdk.activity.single.sk) {
                    this.f13191ta.removeMessages(4);
                    ((com.bytedance.sdk.openadsdk.activity.single.sk) aqVarDnm).eum();
                }
            }
        }

        public void hnj(int i10) {
            int i11 = this.dkl;
            if (i10 != -1) {
                this.ojm = i10;
            }
            this.f13191ta.removeMessages(i11);
        }

        private void hnj(Message message) {
            int i10 = this.gjv;
            if (i10 > 0) {
                int i11 = this.f13190sk;
                int i12 = (int) ((((double) (i11 - i10)) * 100.0d) / ((double) i11));
                com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar = this.dnm;
                StringBuilder sb2 = new StringBuilder();
                int i13 = this.gjv;
                this.gjv = i13 - 1;
                sb2.append(i13);
                sb2.append("s");
                qorVar.setCountDownFor1InN(sb2.toString(), i12);
                ta();
                sk();
                if (this.gjv >= 0) {
                    hnj(message.what, this.f13195xn);
                }
                dse();
                return;
            }
            gjv(3);
            sk(4);
            hnj(5, true);
            dnm();
        }

        public void hn(int i10) {
            if (this.ojm != 2 || i10 == 1) {
                if (i10 != -1) {
                    this.ojm = i10;
                }
                if (this.f13191ta.hasMessages(this.dkl) || this.pty) {
                    return;
                }
                hn hnVar = this.hnj;
                if (hnVar == null || hnVar.dnm() == null || this.hnj.dnm().mo16do() == null || !this.hnj.dnm().mo16do().f13462ta.get()) {
                    int i11 = this.gjv;
                    boolean z10 = this.f13185fc;
                    int i12 = this.dkl;
                    if (i12 == 1 || i12 == 2) {
                        if (i11 < 0 || z10 || this.jip) {
                            return;
                        }
                        this.f13191ta.sendEmptyMessageDelayed(i12, this.f13195xn);
                        return;
                    }
                    if (i12 == 3) {
                        gjv(3);
                    } else if (i12 == 4) {
                        sk(4);
                    } else if (i12 == 5) {
                        hnj(5, true);
                    }
                }
            }
        }

        private void hnj(int i10, int i11) {
            if (this.pty) {
                return;
            }
            this.f13191ta.removeMessages(i10);
            this.f13191ta.sendEmptyMessageDelayed(i10, i11);
        }

        private void hnj(int i10, boolean z10) {
            if (this.f13184cm && i10 == 5) {
                this.dkl = i10;
                if (z10) {
                    hnj(i10, 1000);
                } else {
                    this.f13191ta.sendEmptyMessage(i10);
                }
            }
        }

        public void hn(boolean z10) {
            if (z10) {
                this.f13195xn = (int) (1000.0f / this.f13189oj);
            } else {
                this.f13195xn = 1000;
            }
        }

        public void hnj(as asVar, boolean z10) {
            this.apu = hqh.eum(asVar);
            this.eum = hqh.tu(asVar);
            this.wu = hqh.tgn(asVar);
            this.as = hqh.xyo(asVar);
            this.tu = this.eum;
            this.xyo = false;
            this.tgn = false;
            this.f13194vf = 0;
            this.pnz = true;
            com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar = this.dnm;
            if (qorVar != null) {
                qorVar.setShowPlayableNextAd(false, asVar);
            }
            this.hqh = z10;
            if (this.gjv <= 0 || this.f13185fc) {
                sk(4);
            }
        }

        public void hnj(int i10, as asVar) {
            if (asVar != null && asVar.lq() != null) {
                this.f13189oj = asVar.lq().hnj();
                this.f13188hn = asVar;
            }
            int i11 = this.gjv;
            boolean z10 = this.f13185fc;
            boolean z11 = this.jip;
            int i12 = this.dkl;
            if (z10 || z11) {
                return;
            }
            float f10 = i10;
            this.qor = f10;
            if (f10 <= i11) {
                this.dkl = 2;
                this.gjv = (int) f10;
            } else if (i12 == 0) {
                this.dkl = 1;
            }
            if (!this.mjg) {
                this.f13190sk = this.gjv;
                this.mjg = true;
            }
            int i13 = this.dkl;
            if (i12 == i13 && this.f13191ta.hasMessages(i13)) {
                return;
            }
            this.f13191ta.removeCallbacksAndMessages(null);
            this.f13191ta.sendEmptyMessage(this.dkl);
        }

        public void hnj(aq aqVar) {
            as asVar;
            Cdo cdoHnj;
            if (aqVar == null || (asVar = aqVar.dkl) == null || (cdoHnj = asVar.hnj()) == null) {
                return;
            }
            this.f13192ua = cdoHnj.qor();
            this.hqh = aqVar.uua;
            this.f13186ff = cdoHnj.hnj();
            this.sq = aqVar.jip;
            this.jbd = cdoHnj.hn();
            this.fvt = apu.dkl(aqVar.dkl);
            this.orp = apu.sk(aqVar.dkl);
            this.f13184cm = true;
            if ((this.gjv <= 0 || this.f13185fc) && !this.f13191ta.hasMessages(5)) {
                hnj(5, false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class hnj extends AbstractC0199hn {
        public hnj(hn hnVar, as asVar, com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar) {
            super(hnVar, asVar, qorVar);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.hn.AbstractC0199hn
        protected int hnj(as asVar) {
            if (asVar != null) {
                return asVar.ltp();
            }
            return 5;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class qor implements Runnable {
        private final as hnj;

        public qor(as asVar) {
            this.hnj = asVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.hnj.era()) {
                return;
            }
            if (this.hnj.hhw()) {
                if (com.bytedance.sdk.openadsdk.utils.hn.hn()) {
                    uua.hnj(oj.hnj()).hnj(this.hnj.aip());
                    return;
                } else {
                    jip.hnj(oj.hnj()).hnj(this.hnj.aip());
                    return;
                }
            }
            if (com.bytedance.sdk.openadsdk.utils.hn.hn()) {
                com.bytedance.sdk.openadsdk.component.reward.dse.hnj(oj.hnj()).hnj(this.hnj.aip());
            } else {
                com.bytedance.sdk.openadsdk.component.reward.dkl.hnj(oj.hnj()).hnj(this.hnj.aip());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class sk {
        public boolean gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public final int f13196hn;
        public final Bundle hnj = new Bundle();
        public final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        public boolean f13197sk;

        public sk(int i10, com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
            this.f13196hn = i10;
            this.qor = hnjVar;
        }

        public String toString() {
            return super.toString();
        }
    }

    public hn(Activity activity, as asVar, boolean z10) {
        this.gjv = asVar;
        this.f13178xn = z10;
        this.orl = activity;
        this.dkl = new com.bytedance.sdk.openadsdk.orl.ojm(activity.getApplicationContext());
        boolean zDzo = asVar.dzo();
        this.ojm = zDzo;
        this.f13177ta = zDzo && 39 == asVar.qb();
        this.bug = zDzo && 40 == asVar.qb();
        int iQb = asVar.qb();
        if (iQb == 43 || iQb == 44) {
            this.dnm = new com.bytedance.sdk.openadsdk.activity.single.gjv(this.orl, asVar, this);
        } else {
            this.dnm = new ojm(this.orl, asVar, this);
        }
        this.apu = com.bytedance.sdk.openadsdk.as.sk.hnj("adapt_decor_size", 0) == 1;
        this.dnm.hnj();
        ul();
    }

    private void ul() {
        if (this.gjv.hhw()) {
            this.hnj = new bug(new bug.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.hn.1
                @Override // com.bytedance.sdk.openadsdk.component.reward.bug.hnj
                public void hnj(int i10) {
                    aq aqVarDnm;
                    if (hn.this.bug().getBoolean("reward_verify", false) || hn.this.uua() || hn.this.orl() || (aqVarDnm = hn.this.dnm()) == null) {
                        return;
                    }
                    aqVarDnm.qor(i10);
                }
            });
        }
    }

    public boolean apu() {
        return this.dnm.gjv();
    }

    public Activity aq() {
        com.bytedance.sdk.openadsdk.activity.single.qor qorVar = this.dnm;
        return qorVar == null ? this.orl : qorVar.hnj;
    }

    public boolean as() {
        return this.dnm.sk();
    }

    public Bundle bug() {
        return this.f13176sk;
    }

    public boolean dkl() {
        return this.ojm;
    }

    public aq dnm() {
        return this.dnm.dnm();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public com.bytedance.sdk.openadsdk.component.reward.top.qor m19do() {
        return this.dnm.bug();
    }

    public void dse() {
        Activity activity = this.orl;
        if (activity != null) {
            activity.finish();
        }
    }

    public void eum() {
        this.gjv.aq(true);
        this.dnm.jip();
    }

    public void fc() {
        com.bytedance.sdk.openadsdk.hnj.sk.hnj hnjVar = this.dse;
        if (hnjVar != null) {
            hnjVar.hn();
            return;
        }
        com.bytedance.sdk.openadsdk.hnj.qor.hn hnVar = this.aq;
        if (hnVar != null) {
            hnVar.hn();
        } else {
            aq aqVarDnm = dnm();
            ta.hnj(this.gjv, "close", aqVarDnm != null ? aqVarDnm.jbd() : 0);
        }
    }

    public boolean gjv() {
        return this.bug;
    }

    public int gm() {
        return this.dnm.aq();
    }

    public void hqh() {
        this.dnm.uua();
    }

    public void jip() {
        if (xn()) {
            return;
        }
        eum();
        Objects.toString(this.dse);
        Objects.toString(this.aq);
        com.bytedance.sdk.openadsdk.hnj.sk.hnj hnjVar = this.dse;
        if (hnjVar != null) {
            hnjVar.hnj();
        } else {
            com.bytedance.sdk.openadsdk.hnj.qor.hn hnVar = this.aq;
            if (hnVar != null) {
                hnVar.hnj();
            } else {
                aq aqVarDnm = dnm();
                ta.hnj(this.gjv, "show", aqVarDnm != null ? aqVarDnm.jbd() : 0);
            }
        }
        Runnable runnable = this.jip;
        if (runnable != null) {
            runnable.run();
            this.jip = null;
        }
    }

    public void mjg() {
        com.bytedance.sdk.openadsdk.hnj.sk.hnj hnjVar = this.dse;
        if (hnjVar != null) {
            hnjVar.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.hnj.qor.hn hnVar = this.aq;
        if (hnVar != null) {
            hnVar.onAdClicked();
        }
    }

    public void nyv() {
        this.dnm.oj();
    }

    public void oj() {
        as asVar = this.gjv;
        if (asVar != null) {
            asVar.ojm(true);
        }
        bug bugVar = this.hnj;
        if (bugVar != null) {
            bugVar.qor();
        }
    }

    public void ojm() {
        this.dnm.ojm();
    }

    public boolean orl() {
        return this.gjv.jip();
    }

    public void pty() {
        this.dnm.xn();
    }

    public boolean qor() {
        return this.eum;
    }

    public boolean sk() {
        if (this.gjv != null && this.ojm) {
            return this.f13177ta || this.bug;
        }
        return false;
    }

    public int ta() {
        return this.dnm.ta();
    }

    public boolean tgn() {
        return this.dnm instanceof com.bytedance.sdk.openadsdk.activity.single.gjv;
    }

    public aq tu() {
        return this.dnm.orl();
    }

    public boolean uua() {
        as asVar = this.gjv;
        return asVar != null && asVar.ff();
    }

    public List<as> vf() {
        return this.dnm.fc();
    }

    public com.bytedance.sdk.openadsdk.orl.ojm wu() {
        return this.dkl;
    }

    public boolean xn() {
        return this.gjv.jbd();
    }

    public boolean xyo() {
        return this.f13175oj;
    }

    public void gjv(TTAdActivity tTAdActivity) {
        this.mjg = 5;
        this.dnm.dse();
    }

    public boolean hn() {
        return this.apu;
    }

    public as hnj() {
        return this.gjv;
    }

    public void qor(TTAdActivity tTAdActivity) {
        this.mjg = 4;
        this.dnm.qor();
        bug bugVar = this.hnj;
        if (bugVar != null) {
            bugVar.hnj();
        }
    }

    public void hn(TTAdActivity tTAdActivity) {
        this.mjg = 3;
        this.dnm.hn();
        bug bugVar = this.hnj;
        if (bugVar != null) {
            bugVar.hn();
        }
        this.uua.hnj(tTAdActivity, this.gjv.zf(), this.gjv.m34if(), this.apu);
    }

    public boolean hnj(as asVar) {
        return (asVar == null || apu.orl(asVar) || asVar.btk() || asVar.jlw() == null || asVar.jlw().gjv() <= 0) ? false : true;
    }

    public void sk(TTAdActivity tTAdActivity) {
        this.mjg = 6;
        this.dnm.hnj(tTAdActivity);
        this.uua.hnj(tTAdActivity);
        this.orl = null;
    }

    public void hnj(TTAdActivity tTAdActivity, Bundle bundle, com.bytedance.sdk.openadsdk.hnj.sk.hnj hnjVar, com.bytedance.sdk.openadsdk.hnj.qor.hn hnVar) {
        this.f13174fc = bundle;
        this.mjg = 1;
        this.dse = hnjVar;
        this.aq = hnVar;
        if (!this.f13178xn && bundle != null) {
            if (hnjVar == null) {
                this.dse = f13173hn;
                f13173hn = null;
            }
            if (hnVar == null) {
                this.aq = qor;
                qor = null;
            }
        }
        this.dnm.hnj(bundle);
    }

    public void qor(boolean z10) {
        this.f13175oj = z10;
    }

    public void hn(boolean z10) {
        try {
            as asVar = this.gjv;
            if (asVar != null) {
                asVar.qor(z10);
            }
            bug.hnj(this.gjv, false, 3);
        } catch (Throwable unused) {
        }
    }

    public void hn(aq aqVar) {
        aqVar.hnj(this.orl, this.f13174fc);
        int i10 = this.mjg;
        if (i10 == 2) {
            aqVar.orl();
            return;
        }
        if (i10 == 3) {
            aqVar.orl();
            aqVar.qor();
            aqVar.qor(true);
        } else if (i10 == 4) {
            aqVar.qor(false);
            aqVar.mjg();
        } else {
            if (i10 != 5) {
                return;
            }
            aqVar.gjv();
        }
    }

    public void hnj(TTAdActivity tTAdActivity) {
        this.mjg = 2;
        this.dnm.dkl();
    }

    public void hnj(boolean z10) {
        this.dnm.hnj(z10);
    }

    public void hnj(TTAdActivity tTAdActivity, Bundle bundle, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hn.hnj(this.gjv, tTAdActivity != null ? tTAdActivity.getIntent() : null, bundle, i10);
        if (this.f13178xn) {
            return;
        }
        com.bytedance.sdk.openadsdk.hnj.sk.hnj hnjVar = this.dse;
        if (hnjVar != null) {
            f13173hn = hnjVar;
            return;
        }
        com.bytedance.sdk.openadsdk.hnj.qor.hn hnVar = this.aq;
        if (hnVar != null) {
            qor = hnVar;
        }
    }

    public void hn(aq aqVar, sk skVar) {
        this.dnm.hnj(aqVar, skVar);
    }

    public void hn(aq aqVar, int i10) {
        this.dnm.hn(aqVar, i10);
    }

    public void hnj(aq aqVar, sk skVar) {
        this.dnm.hnj(aqVar, null, skVar);
    }

    public void hnj(Activity activity) {
        this.dnm.hn(activity);
    }

    public void hnj(final aq aqVar, final boolean z10, final int i10, final String str, final int i11, final String str2, final int i12) {
        Activity activity;
        if (!xn()) {
            this.jip = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.hn.2
                @Override // java.lang.Runnable
                public void run() {
                    hn.this.hnj(aqVar, z10, i10, str, i11, str2, i12);
                }
            };
            return;
        }
        if (uua()) {
            return;
        }
        oj();
        if (this.dse != null && (activity = this.orl) != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.hn.3
                @Override // java.lang.Runnable
                public void run() {
                    hn.this.dse.hnj(z10, i10, str, i11, str2);
                }
            });
            bug.hnj(this.gjv, z10, i12);
        } else {
            bug.hnj(this.gjv, false, i12);
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.activity.single.hnj hnjVar, boolean z10) {
        this.dnm.hnj(hnjVar, z10);
    }

    public void hnj(aq aqVar) {
        com.bytedance.sdk.openadsdk.activity.single.qor qorVar = this.dnm;
        if (qorVar == null) {
            return;
        }
        qorVar.hnj(aqVar);
    }

    public void hnj(aq aqVar, boolean z10) {
        com.bytedance.sdk.openadsdk.activity.single.qor qorVar = this.dnm;
        if (qorVar == null) {
            return;
        }
        qorVar.hnj(aqVar, z10);
    }

    public void hnj(View view) {
        this.dnm.hnj(view);
    }

    public void hnj(View view, boolean z10) {
        this.dnm.hnj(view, z10);
    }

    public boolean hnj(aq aqVar, int i10) {
        return this.dnm.hnj(aqVar, i10);
    }

    public void hnj(float f10) {
        this.dnm.hnj(f10);
    }

    public void hnj(Map<String, Object> map, aq aqVar, float f10, float f11) {
        this.dnm.hnj(map, aqVar, f10, f11);
    }

    public void hnj(int i10) {
        this.dnm.hnj(i10);
    }

    public void hnj(aq aqVar, boolean z10, boolean z11, boolean z12, int i10) {
        this.dnm.hnj(aqVar, z10, z11, z12, i10);
    }
}
