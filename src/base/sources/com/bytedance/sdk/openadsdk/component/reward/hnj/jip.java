package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.R;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.a;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.vf;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ua;
import com.bytedance.sdk.openadsdk.gjv.xn;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.wu;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class jip implements com.bytedance.sdk.openadsdk.orl.aq {
    private View apu;
    private float as;
    private final boolean bug;
    private int dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private long f34do;
    protected com.bytedance.sdk.openadsdk.gjv.gjv.sk dse;
    private String dzo;
    private com.bytedance.sdk.openadsdk.core.widget.hnj.dkl.hnj eta;
    private View eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private com.bytedance.sdk.component.ojm.dkl f13471fc;
    private boolean fvt;
    com.bytedance.sdk.openadsdk.gjv.orl gjv;
    ua hnj;
    private final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hqh;
    private boolean izk;
    private long jbd;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    private boolean f13475ka;
    private int mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private boolean f13476oj;
    private int orl;
    private boolean orp;
    private ILoader pnz;
    private com.bytedance.sdk.openadsdk.core.widget.hnj.sk pty;
    protected String qor;
    private boolean rmr;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final String f13478ta;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private boolean f13479ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private boolean f13480ul;
    private float wu;
    private int xad;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private boolean f13482xn;
    private com.bytedance.sdk.openadsdk.common.sk zt;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected boolean f13474hn = true;
    private boolean jip = false;
    private final AtomicBoolean uua = new AtomicBoolean(true);

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    int f13477sk = 0;
    String dkl = "";
    boolean aq = false;
    private SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> tu = new SparseArray<>();
    private boolean tgn = true;
    private float xyo = -1.0f;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private float f13481vf = -1.0f;
    private boolean nyv = false;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private long f13473gm = 0;
    private long sq = -1;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private volatile int f13472ff = 0;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private int f13470cm = -1;
    private volatile int pv = 0;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    private volatile int f13483xo = 0;
    private long lu = 0;
    public boolean ojm = false;
    private int mkl = -1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface gjv {
        void hnj(WebView webView, String str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hn implements com.bytedance.sdk.openadsdk.orl.hnj {
        private final View hnj;

        public hn(View view) {
            this.hnj = view;
        }

        @Override // com.bytedance.sdk.openadsdk.orl.hnj
        public int hn() {
            View view = this.hnj;
            int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
            return measuredWidth <= 0 ? sq.qor(oj.hnj()) : measuredWidth;
        }

        @Override // com.bytedance.sdk.openadsdk.orl.hnj
        public int hnj() {
            View view = this.hnj;
            int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
            return measuredHeight <= 0 ? sq.sk(oj.hnj()) : measuredHeight;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class qor implements com.bytedance.sdk.openadsdk.orl.ta {
        private final com.bytedance.sdk.component.ojm.dkl hnj;

        @Override // com.bytedance.sdk.openadsdk.orl.ta
        public void hn() {
            com.bytedance.sdk.component.ojm.dkl dklVar = this.hnj;
            if (dklVar == null) {
                return;
            }
            dklVar.oj();
        }

        @Override // com.bytedance.sdk.openadsdk.orl.ta
        public void hnj() {
            com.bytedance.sdk.component.ojm.dkl dklVar = this.hnj;
            if (dklVar == null) {
                return;
            }
            dklVar.fc();
        }

        private qor(com.bytedance.sdk.component.ojm.dkl dklVar) {
            this.hnj = dklVar;
        }
    }

    public jip(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        this.hqh = hnjVar;
        this.f13478ta = hnjVar.f13461sk;
        this.bug = hnjVar.gjv;
    }

    static /* synthetic */ int dnm(jip jipVar) {
        int i10 = jipVar.pv;
        jipVar.pv = i10 + 1;
        return i10;
    }

    static /* synthetic */ int mjg(jip jipVar) {
        int i10 = jipVar.f13472ff;
        jipVar.f13472ff = i10 + 1;
        return i10;
    }

    static /* synthetic */ int orl(jip jipVar) {
        int i10 = jipVar.f13483xo;
        jipVar.f13483xo = i10 + 1;
        return i10;
    }

    private com.bytedance.sdk.openadsdk.gjv.gjv.sk ua() {
        return new xn(2, this.bug ? "rewarded_video" : "fullscreen_interstitial_ad", this.hqh.f13456hn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ul() {
        this.f13480ul = true;
        this.izk = false;
        this.hqh.f13453ff.removeMessages(Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE);
        this.hqh.f13453ff.removeMessages(700);
        this.hqh.f13453ff.removeMessages(900);
        this.hqh.f13454gm.gjv(false);
        this.hqh.jip.set(true);
        this.hqh.f13460qb.orl();
        as asVar = this.hqh.f13456hn;
        asVar.tl();
        if (asVar.tl() || !orp.aq(hqh.hnj(asVar))) {
            return;
        }
        View viewTa = this.hqh.f13464ua.ta();
        View.OnClickListener onClickListener = (View.OnClickListener) viewTa.getTag(viewTa.getId());
        if (onClickListener != null) {
            hnj hnjVar = new hnj(this.hqh, viewTa, onClickListener);
            viewTa.setOnClickListener(hnjVar);
            viewTa.setOnTouchListener(hnjVar);
        }
    }

    public boolean gm() {
        return this.ojm;
    }

    public boolean hqh() {
        com.bytedance.sdk.component.ojm.dkl dklVar = this.f13471fc;
        return dklVar == null || dklVar.getWebView() == null;
    }

    public void nyv() {
        com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.gjv;
        if (orlVar != null) {
            orlVar.sk();
        }
    }

    public boolean pty() {
        return this.f13480ul;
    }

    public boolean vf() {
        return this.izk;
    }

    public boolean apu() {
        if (as.qor(this.hqh.f13456hn)) {
            return this.f13479ua && !this.fvt && this.hqh.pty.bug();
        }
        return this.f13479ua && !this.fvt && this.uua.get() && this.f13476oj;
    }

    public com.bytedance.sdk.component.ojm.dkl aq() {
        return this.f13471fc;
    }

    public void as() {
        com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.gjv;
        if (orlVar != null) {
            orlVar.hnj(System.currentTimeMillis());
        }
    }

    public boolean bug() {
        String str = this.qor;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public void dnm() {
        com.bytedance.sdk.component.ojm.dkl dklVar = this.f13471fc;
        if (dklVar != null) {
            vf.hnj(dklVar);
        }
        as asVar = this.hqh.f13456hn;
        long j10 = this.jbd;
        if (j10 > 0) {
            if (this.sq > 0) {
                this.jbd = j10 + (SystemClock.elapsedRealtime() - this.sq);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", as.qor(asVar) ? 7 : 0);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(this.hqh.f13456hn, this.f13478ta, "second_endcard_duration", jSONObject, this.jbd);
        }
        this.f13471fc = null;
        if (this.dse != null && !apu.gjv(asVar) && !apu.dse(asVar) && !as.qor(asVar)) {
            this.dse.hnj(true);
            this.dse.dnm();
        }
        ua uaVar = this.hnj;
        if (uaVar != null) {
            uaVar.bug();
        }
        com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.gjv;
        if (orlVar != null) {
            orlVar.gjv(asVar.ko());
        }
        DeviceUtils.AudioInfoReceiver.hn(this);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public boolean m23do() {
        return this.aq;
    }

    public void dse() {
        this.hnj.hnj("showPlayableEndCardOverlay", (JSONObject) null);
        this.hqh.f13453ff.sendEmptyMessageDelayed(Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE, 1000L);
        this.hqh.f13453ff.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.jip.10
            @Override // java.lang.Runnable
            public void run() {
                jip.this.ul();
            }
        }, 1000L);
        com.bytedance.sdk.openadsdk.utils.mjg mjgVar = this.hqh.f13455gn;
        if (mjgVar != null) {
            mjgVar.hnj(0L);
        }
    }

    public void eum() {
        com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar = this.dse;
        if (skVar != null) {
            skVar.dse();
        }
    }

    public void fc() {
        com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar = this.dse;
        if (skVar != null) {
            skVar.aq();
        }
        com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.gjv;
        if (orlVar != null) {
            orlVar.aq();
        }
    }

    public void jip() {
        com.bytedance.sdk.component.ojm.dkl dklVar = this.f13471fc;
        if (dklVar != null) {
            dklVar.fc();
        }
        if (this.sq > 0) {
            this.jbd += SystemClock.elapsedRealtime() - this.sq;
            this.sq = 0L;
        }
        ua uaVar = this.hnj;
        if (uaVar != null) {
            uaVar.hnj(false);
            hn(this.hnj, false);
            hnj(this.hnj, true, false);
        }
    }

    public boolean mjg() {
        return this.f13476oj;
    }

    public int oj() {
        return this.f13477sk;
    }

    public ua ojm() {
        return this.hnj;
    }

    public boolean orl() {
        return this.uua.get();
    }

    public void ta() {
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar;
        as asVar = this.hqh.f13456hn;
        String strAq = asVar.aq();
        if (!TextUtils.isEmpty(strAq) && (aqVar = this.hqh.f13463th) != null && (aqVar.orp() || this.hqh.f13463th.ff().tgn())) {
            this.qor = strAq;
        } else if (hqh.sk(asVar)) {
            a aVarPwt = asVar.pwt();
            if (aVarPwt != null) {
                this.qor = aVarPwt.d();
            }
        } else {
            this.qor = hqh.bug(asVar);
        }
        String strHnj = hnj(this.qor, asVar, this.dnm, this.mjg, this.orl);
        this.qor = strHnj;
        if (TextUtils.isEmpty(strHnj)) {
            return;
        }
        this.f13479ua = this.qor.contains("use_second_endcard=1");
    }

    public boolean tgn() {
        ua uaVar = this.hnj;
        if (uaVar == null) {
            return false;
        }
        return uaVar.ojm();
    }

    public void tu() {
        com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar = this.dse;
        if (skVar != null) {
            skVar.ojm();
        }
    }

    public void uua() {
        com.bytedance.sdk.component.ojm.dkl dklVar = this.f13471fc;
        if (dklVar != null) {
            dklVar.orl();
        }
        if (this.sq == 0) {
            this.sq = SystemClock.elapsedRealtime();
        }
        as asVar = this.hqh.f13456hn;
        ua uaVar = this.hnj;
        if (uaVar != null) {
            uaVar.dnm();
            com.bytedance.sdk.component.ojm.dkl dklVar2 = this.f13471fc;
            if (dklVar2 != null) {
                if (dklVar2.getVisibility() == 0) {
                    this.hnj.hnj(true);
                    hn(this.hnj, true);
                    hnj(this.hnj, false, true);
                    if (hqh.aq(asVar) && !this.f13480ul && this.hqh.f13456hn.tl()) {
                        dse();
                    }
                } else {
                    this.hnj.hnj(false);
                    hn(this.hnj, false);
                    hnj(this.hnj, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.gjv;
        if (orlVar != null) {
            orlVar.dse();
        }
    }

    public void wu() {
        com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar = this.dse;
        if (skVar != null) {
            skVar.dkl();
        }
    }

    public String xn() {
        return this.dkl;
    }

    public boolean xyo() {
        return this.f13476oj && this.uua.get();
    }

    public void dkl() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hqh;
        as asVar = hnjVar.f13456hn;
        if (TextUtils.isEmpty(as.hnj(hnjVar.jbd, asVar))) {
            if (asVar != null && !asVar.ua() && this.pnz == null && bug()) {
                this.dzo = asVar.rx();
                this.pnz = com.bytedance.sdk.openadsdk.dse.hn.hnj().hn();
                int iHnj = com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(this.pnz, this.dzo);
                this.xad = iHnj;
                this.f13470cm = iHnj > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.dzo)) {
                    com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.gjv;
                    if (orlVar != null) {
                        orlVar.hnj(this.f13470cm);
                    }
                    com.bytedance.sdk.openadsdk.gjv.qor.hnj.hnj(this.lu, asVar, "landingpage_endcard", this.pnz, this.dzo);
                }
            }
            if ((!TextUtils.isEmpty(this.qor) && this.qor.contains("play.google.com/store")) || ((asVar != null && !asVar.dzo() && apu.aq(asVar)) || apu.dse(asVar))) {
                this.aq = true;
                return;
            }
            Log.d("TTAD.RFWVM", "preLoadEndCardForce: return mShouldPreloadEndCard " + this.f13474hn + ",webViewIsLoading " + this.f13475ka);
            if (this.f13474hn) {
                boolean z10 = this.hqh.hkr;
                if (this.f13471fc != null && ((z10 || !TextUtils.isEmpty(this.qor)) && as.hn(asVar))) {
                    if (this.f13475ka) {
                        return;
                    }
                    String str = this.qor + "&is_pre_render=1";
                    com.bytedance.sdk.openadsdk.gjv.orl orlVar2 = this.gjv;
                    if (orlVar2 != null) {
                        orlVar2.gjv();
                    }
                    wu.hnj(this.f13471fc, str);
                    this.f13475ka = true;
                    return;
                }
                if (as.qor(asVar)) {
                    this.hqh.pty.qor();
                }
            }
        }
    }

    public void sk() {
        if (hqh.sk(this.hqh.f13456hn) && this.hqh.fzb) {
            return;
        }
        dkl();
    }

    public boolean gjv() {
        return this.fvt;
    }

    void hn() {
        this.apu = this.hqh.orp.findViewById(R.id.content);
        com.bytedance.sdk.component.ojm.dkl dklVar = (com.bytedance.sdk.component.ojm.dkl) this.hqh.fvt.findViewById(com.bytedance.sdk.openadsdk.utils.jip.jip);
        this.f13471fc = dklVar;
        if (dklVar != null && as.hn(this.hqh.f13456hn)) {
            this.f13471fc.sk();
        } else {
            sq.hnj((View) this.f13471fc, 8);
        }
        com.bytedance.sdk.component.ojm.dkl dklVar2 = this.f13471fc;
        if (dklVar2 != null) {
            dklVar2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.jip.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (jip.this.f13471fc == null || jip.this.f13471fc.getViewTreeObserver() == null) {
                        return;
                    }
                    jip.this.f13471fc.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = jip.this.f13471fc.getMeasuredWidth();
                    int measuredHeight = jip.this.f13471fc.getMeasuredHeight();
                    if (jip.this.f13471fc.getVisibility() == 0) {
                        jip.this.hnj(measuredWidth, measuredHeight);
                    }
                }
            });
        }
    }

    public boolean qor() {
        return this.orp;
    }

    public void gjv(boolean z10) {
        if (hqh.hn(this.hqh.f13456hn)) {
            return;
        }
        sk(z10);
    }

    public void qor(boolean z10) {
        hn(this.hnj, z10);
    }

    public void sk(boolean z10) {
        if (this.hnj == null || this.hqh.orp.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z10);
            this.hnj.hnj("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj extends com.bytedance.sdk.openadsdk.core.qor.hnj implements com.bytedance.sdk.openadsdk.core.qor.hn.hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final View f13491hn;
        private final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnj;
        private final View.OnClickListener qor;

        public hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar, View view, View.OnClickListener onClickListener) {
            super(hnjVar.orp, hnjVar.f13456hn, hnjVar.f13461sk, hnjVar.gjv ? 7 : 5);
            this.hnj = hnjVar;
            this.f13491hn = view;
            this.qor = onClickListener;
            HashMap map = new HashMap();
            map.put("close_auto_click", Boolean.TRUE);
            map.put("click_scence", 2);
            hnj(map);
            hnj(hnjVar.wu.qor());
            hnj(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.qor.hnj, com.bytedance.sdk.openadsdk.core.qor.hn, com.bytedance.sdk.openadsdk.core.qor.qor
        public void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray, boolean z10) {
            if (!this.hnj.f13456hn.tl()) {
                super.hnj(view, f10, f11, f12, f13, sparseArray, z10);
                this.hnj.sq.ul();
            } else {
                this.qor.onClick(view);
                this.f13491hn.setOnTouchListener(null);
                this.f13491hn.setOnClickListener(this.qor);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.qor.hn.hnj
        public void hnj(View view, int i10) {
            this.f13491hn.setOnTouchListener(null);
            this.f13491hn.setOnClickListener(this.qor);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.orl.aq
    public void qor(int i10) {
        int i11 = this.mkl;
        if (i11 <= 0 && i10 > 0) {
            gjv(false);
        } else if (i11 > 0 && i10 == 0) {
            gjv(true);
        }
        this.mkl = i10;
    }

    public void dse(boolean z10) {
        this.izk = z10;
    }

    public void hnj() {
        if (this.f13482xn) {
            return;
        }
        this.f13482xn = true;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hqh;
        this.dnm = hnjVar.lu;
        this.orl = hnjVar.eta;
        this.mjg = hnjVar.zt;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        hn();
        this.lu = SystemClock.elapsedRealtime() - jElapsedRealtime;
    }

    public void hn(boolean z10) {
        hnj(this.hnj, z10);
    }

    public void hn(ua uaVar, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z10 ? 1 : 0);
            uaVar.hnj("viewableChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void hn(int i10) {
        com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar = this.dse;
        if (skVar != null) {
            skVar.hnj(i10);
            this.dse.qor();
        }
    }

    public void hnj(String str, final com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar) {
        hnj(str, new gjv() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.jip.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.jip.gjv
            public void hnj(WebView webView, String str2) {
                if (jip.this.hqh.orp.isFinishing()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj unused = jip.this.hqh;
                jip.this.orl();
            }
        });
        hnj(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.jip.6
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j10) {
                jip.this.hqh.wu.hn();
                com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar2 = hnVar;
                if (hnVar2 != null) {
                    hnVar2.mkl();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(int i10, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar) {
        this.hqh.apu.get();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hqh;
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar = hnjVar.f13463th;
        if (aqVar == null || !aqVar.bug || hnjVar.apu.get()) {
            return;
        }
        this.hqh.apu.set(true);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.hqh;
        if (hnjVar2.dy && apu.orl(hnjVar2.f13456hn) && hnVar != null) {
            hnVar.sk();
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.orl.dkl dklVar, String str, final com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar) {
        if (this.f13471fc == null) {
            return;
        }
        HashMap map = new HashMap();
        final as asVar = this.hqh.f13456hn;
        map.put("click_scence", 2);
        this.dse = ua();
        ua uaVar = new ua(this.hqh.orp);
        this.hnj = uaVar;
        uaVar.hnj(this.hqh.sq);
        ua uaVarHnj = this.hnj.hn(this.f13471fc).hnj(asVar).hnj(com.bytedance.sdk.openadsdk.core.ojm.hnj.hn.hnj(asVar)).qor(asVar.sp()).gjv(asVar.ldn()).hn(asVar.hhw() ? 7 : 5).hnj(new hn(this.f13471fc)).sk(asVar.nl()).hnj(this.f13471fc);
        if (bug()) {
            str = "landingpage_endcard";
        }
        uaVarHnj.hn(str).hnj(map).hnj(this.dse).hnj(new com.bytedance.sdk.openadsdk.core.widget.sk() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.jip.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.sk
            public void hnj() {
                if (jip.this.pty != null) {
                    jip.this.pty.qor();
                }
                com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar2 = hnVar;
                if (hnVar2 != null) {
                    hnVar2.mkl();
                }
            }
        }).hnj(new ua.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.jip.7
            @Override // com.bytedance.sdk.openadsdk.core.ua.hnj
            public void hnj() {
                jip.this.ul();
            }
        });
        this.hnj.hnj(new qor(this.f13471fc));
        this.hnj.hnj(this.hqh.f13464ua.ta()).hnj(this.hqh.as.qor()).hnj(new com.bytedance.sdk.openadsdk.orl.qor() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.jip.9
            @Override // com.bytedance.sdk.openadsdk.orl.qor
            public void hnj(boolean z10, int i10, String str2) {
                if (z10) {
                    jip jipVar = jip.this;
                    jipVar.ojm = true;
                    if (jipVar.rmr) {
                        jip.this.rmr = false;
                        jip jipVar2 = jip.this;
                        jipVar2.hnj(jipVar2.hqh.dzo, true);
                    }
                }
                if (as.gjv(asVar)) {
                    jip.this.hnj(z10, i10, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.orl.qor
            public void hnj() {
                jip.this.orp = true;
                jip.this.hqh.f13464ua.ta().performClick();
            }
        });
        this.hnj.gjv(this.f13479ua);
    }

    public void dkl(boolean z10) {
        this.fvt = true;
        JSONObject jSONObject = new JSONObject();
        as asVar = this.hqh.f13456hn;
        try {
            jSONObject.put("endcard_overlay_render_type", as.qor(asVar) ? 7 : 0);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, this.f13478ta, "use_second_endcard", jSONObject);
        this.sq = SystemClock.elapsedRealtime();
        try {
            if (!as.qor(asVar)) {
                this.hnj.hnj("click_endcard_close", (JSONObject) null);
            } else if (z10) {
                this.hqh.pty.aq();
                com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, this.f13478ta, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hqh;
        hnjVar.f13455gn.hnj(hnjVar.dse);
    }

    public void hnj(int i10, int i11) {
        if (this.hnj == null || this.hqh.orp.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i10);
            jSONObject.put("height", i11);
            this.hnj.hnj("resize", jSONObject);
        } catch (Exception e10) {
            Log.e("TTAD.RFWVM", "", e10);
        }
    }

    public void hnj(boolean z10) {
        this.f13474hn = z10;
    }

    private static String hnj(String str, as asVar, int i10, int i11, int i12) {
        String str2;
        String str3;
        float fM34if = asVar.m34if();
        if (!TextUtils.isEmpty(str)) {
            if (i10 == 1) {
                if (str.contains("?")) {
                    str3 = str + "&";
                } else {
                    str3 = str + "?";
                }
                str = str3 + "orientation=portrait";
            }
            if (str.contains("?")) {
                str2 = str + "&";
            } else {
                str2 = str + "?";
            }
            str = str2 + "height=" + i11 + "&width=" + i12 + "&aspect_ratio=" + fM34if;
        }
        return !hqh.hn(asVar) ? com.bytedance.sdk.openadsdk.utils.dkl.hnj(str) : str;
    }

    public void hnj(int i10) {
        if (this.f13476oj || !this.uua.get()) {
            hnj(0, this.hqh.sq);
        }
        sq.hnj((View) this.f13471fc, i10);
        com.bytedance.sdk.component.ojm.dkl dklVar = this.f13471fc;
        if (dklVar != null) {
            sq.hnj((View) dklVar.getWebView(), i10);
        }
        as asVar = this.hqh.f13456hn;
        if (this.f13471fc == null || !asVar.ko()) {
            return;
        }
        this.f13471fc.setLandingPage(true);
        this.f13471fc.setTag("landingpage_endcard");
        this.f13471fc.setMaterialMeta(asVar.pf());
    }

    public void hnj(float f10) {
        sq.hnj(this.f13471fc, f10);
    }

    public void hnj(ua uaVar, boolean z10) {
        if (this.hnj == null || this.hqh.orp.isFinishing()) {
            return;
        }
        uaVar.hnj(z10);
    }

    private void hnj(String str, final gjv gjvVar) {
        com.bytedance.sdk.component.ojm.dkl dklVar;
        final as asVar = this.hqh.f13456hn;
        com.bytedance.sdk.component.ojm.dkl dklVar2 = this.f13471fc;
        if (dklVar2 == null || dklVar2.getWebView() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.orl orlVarHn = new com.bytedance.sdk.openadsdk.gjv.orl(asVar, this.f13471fc.getWebView(), new com.bytedance.sdk.openadsdk.gjv.bug() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.jip.11
            @Override // com.bytedance.sdk.openadsdk.gjv.bug
            public void hnj(int i10) {
                if (TextUtils.isEmpty(jip.this.dzo)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.gjv.qor.hnj.hnj(jip.this.xad, jip.this.f13472ff, jip.this.f13483xo, jip.this.pv - jip.this.f13483xo, asVar, "landingpage_endcard", i10);
            }
        }, this.f13470cm).hn(true);
        this.gjv = orlVarHn;
        this.eta = orlVarHn.hnj;
        orlVarHn.hnj(bug() ? "landingpage_endcard" : str);
        this.gjv.hn(this.f13478ta);
        this.gjv.qor(true);
        this.f13471fc.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.jip.12
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                com.bytedance.sdk.openadsdk.gjv.orl orlVar = jip.this.gjv;
                if (orlVar != null) {
                    orlVar.hn(i11);
                }
            }
        });
        aq aqVar = this.hqh.as;
        if (aqVar != null) {
            this.gjv.hnj(aqVar.hnj());
        }
        com.bytedance.sdk.openadsdk.common.sk skVarHnj = orp.hnj(asVar, this.f13471fc, this.hqh.orp, this.f13478ta);
        this.zt = skVarHnj;
        if (skVarHnj != null) {
            skVarHnj.hnj(bug() ? "landingpage_endcard" : str);
        }
        if (bug()) {
            orp.hnj(asVar, this.f13471fc);
        }
        com.bytedance.sdk.openadsdk.core.widget.hnj.sk skVar = new com.bytedance.sdk.openadsdk.core.widget.hnj.sk(oj.hnj(), this.hnj, asVar.sp(), this.zt, this.gjv, asVar.ko()) { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.jip.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                super.onPageFinished(webView, str2);
                jip.this.f13475ka = false;
                jip.this.f13476oj = true;
                jip jipVar = jip.this;
                jipVar.hnj(100, jipVar.hqh.sq);
                if (jip.this.hqh.nyv.apu()) {
                    View viewTa = jip.this.hqh.f13464ua.ta();
                    if (viewTa instanceof com.bytedance.sdk.openadsdk.core.dkl.gjv) {
                        ((com.bytedance.sdk.openadsdk.core.dkl.gjv) viewTa).setImageResource(com.bytedance.sdk.component.utils.wu.gjv(jip.this.hqh.jbd, "tt_skip_btn"));
                    }
                }
                DeviceUtils.AudioInfoReceiver.hnj(jip.this);
                jip.this.mkl = DeviceUtils.dse();
                com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar2 = jip.this.dse;
                if (skVar2 != null) {
                    skVar2.sk();
                }
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj unused = jip.this.hqh;
                gjv gjvVar2 = gjvVar;
                if (gjvVar2 != null) {
                    gjvVar2.hnj(webView, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                super.onPageStarted(webView, str2, bitmap);
                com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar2 = jip.this.dse;
                if (skVar2 != null) {
                    skVar2.gjv();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str2, String str3) {
                super.onReceivedError(webView, i10, str2, str3);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj unused = jip.this.hqh;
                webResourceRequest.isForMainFrame();
                webResourceRequest.getUrl();
                webResourceResponse.getStatusCode();
                if (webResourceRequest.getUrl() != null) {
                    Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                }
                if (webResourceRequest.isForMainFrame()) {
                    jip.this.uua.set(false);
                    jip.this.f13475ka = false;
                    jip.this.f13477sk = webResourceResponse.getStatusCode();
                    jip jipVar = jip.this;
                    jipVar.dkl = "onReceivedHttpError";
                    jipVar.hnj(jipVar.f13477sk, jipVar.hqh.sq);
                }
                if (jip.this.dse != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", webResourceResponse.getStatusCode());
                        jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                        jip.this.dse.hnj(jSONObject);
                    } catch (JSONException unused2) {
                    }
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                try {
                    if (TextUtils.isEmpty(jip.this.dzo)) {
                        return super.shouldInterceptRequest(webView, str2);
                    }
                    jip.dnm(jip.this);
                    WebResourceResponseModel webResourceResponseModelHnj = com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(jip.this.pnz, jip.this.dzo, str2);
                    if (webResourceResponseModelHnj != null && webResourceResponseModelHnj.getWebResourceResponse() != null) {
                        jip.orl(jip.this);
                        return webResourceResponseModelHnj.getWebResourceResponse();
                    }
                    if (webResourceResponseModelHnj != null && webResourceResponseModelHnj.getMsg() == 2) {
                        jip.mjg(jip.this);
                    }
                    return super.shouldInterceptRequest(webView, str2);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.apu.hnj("TTAD.RFWVM", "shouldInterceptRequest url error", th2);
                    return super.shouldInterceptRequest(webView, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                }
                if (webResourceRequest == null || webResourceRequest.getUrl() == null || !jip.this.hnj(webResourceRequest.getUrl().toString())) {
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj unused = jip.this.hqh;
                        webResourceError.getErrorCode();
                        String.valueOf(webResourceError.getDescription());
                        String.valueOf(webResourceRequest.getUrl());
                    }
                    if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                        jip.this.uua.set(false);
                        jip.this.f13475ka = false;
                        jip.this.hnj(webResourceError != null ? webResourceError.getErrorCode() : -1, jip.this.hqh.sq);
                    }
                    if (jip.this.dse != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (webResourceError != null) {
                                jSONObject.put("code", webResourceError.getErrorCode());
                                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                            }
                            jip.this.dse.hnj(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    if (webResourceError != null) {
                        jip.this.f13477sk = webResourceError.getErrorCode();
                        jip.this.dkl = String.valueOf(webResourceError.getDescription());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                try {
                    return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.apu.hnj("TTAD.RFWVM", "shouldInterceptRequest error1", th2);
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
            }
        };
        this.pty = skVar;
        this.f13471fc.setWebViewClient(skVar);
        this.pty.hnj(asVar);
        this.pty.hnj(this.bug ? "rewarded_video" : "fullscreen_interstitial_ad");
        if (asVar.ko() && (dklVar = this.f13471fc) != null && dklVar.getWebView() != null) {
            this.f13471fc.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.jip.3
                private final int qor = oj.hn();

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int i10;
                    com.bytedance.sdk.openadsdk.gjv.orl orlVar = jip.this.gjv;
                    if (orlVar != null) {
                        orlVar.hnj(motionEvent);
                    }
                    if (jip.this.zt != null) {
                        jip.this.zt.hnj(motionEvent);
                    }
                    try {
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked != 0) {
                            int i11 = 3;
                            if (actionMasked == 1) {
                                i10 = i11;
                            } else if (actionMasked != 2) {
                                i11 = actionMasked != 3 ? -1 : 4;
                                i10 = i11;
                            } else {
                                float rawX = motionEvent.getRawX();
                                float rawY = motionEvent.getRawY();
                                if (Math.abs(rawX - jip.this.wu) >= this.qor || Math.abs(rawY - jip.this.as) >= this.qor) {
                                    jip.this.tgn = false;
                                }
                                jip.this.xyo += Math.abs(motionEvent.getX() - jip.this.wu);
                                jip.this.f13481vf += Math.abs(motionEvent.getY() - jip.this.as);
                                i10 = (System.currentTimeMillis() - jip.this.f34do <= 200 || (jip.this.xyo <= 8.0f && jip.this.f13481vf <= 8.0f)) ? 2 : 1;
                            }
                        } else {
                            jip.this.tgn = true;
                            jip.this.tu = new SparseArray();
                            jip.this.wu = motionEvent.getRawX();
                            jip.this.as = motionEvent.getRawY();
                            jip.this.f34do = System.currentTimeMillis();
                            try {
                                long landingPageClickBegin = jip.this.f13471fc.getLandingPageClickBegin();
                                if (landingPageClickBegin > 0 && landingPageClickBegin < jip.this.f34do) {
                                    jip.this.f34do = landingPageClickBegin;
                                    jip.this.f13471fc.setLandingPageClickBegin(-1L);
                                }
                            } catch (Exception unused) {
                            }
                            jip.this.xyo = -1.0f;
                            jip.this.f13481vf = -1.0f;
                            i10 = 0;
                        }
                        jip.this.tu.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.qor.qor.hnj(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                        if (motionEvent.getAction() == 1 && apu.dkl(jip.this.hqh.f13456hn) && jip.this.hqh.sq != null) {
                            jip.this.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.jip.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    jip.this.hqh.sq.izk();
                                }
                            });
                        }
                        if (motionEvent.getAction() == 1 && view.getVisibility() == 0 && Float.valueOf(view.getAlpha()).intValue() == 1 && ((!jip.this.jip || apu.ta(asVar)) && jip.this.tgn)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("down_x", jip.this.wu);
                            jSONObject.put("down_y", jip.this.as);
                            jSONObject.put("down_time", jip.this.f34do);
                            jSONObject.put("up_x", motionEvent.getRawX());
                            jSONObject.put("up_y", motionEvent.getRawY());
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                long landingPageClickEnd = jip.this.f13471fc.getLandingPageClickEnd();
                                if (landingPageClickEnd > 0 && landingPageClickEnd < jCurrentTimeMillis) {
                                    try {
                                        jip.this.f13471fc.setLandingPageClickEnd(-1L);
                                    } catch (Exception unused2) {
                                    }
                                    jCurrentTimeMillis = landingPageClickEnd;
                                }
                            } catch (Exception unused3) {
                            }
                            jSONObject.put("up_time", jCurrentTimeMillis);
                            int[] iArr = new int[2];
                            jip jipVar = jip.this;
                            jipVar.eum = jipVar.hqh.fvt.findViewById(520093713);
                            if (jip.this.eum != null) {
                                jip.this.eum.getLocationOnScreen(iArr);
                                jSONObject.put("button_x", iArr[0]);
                                jSONObject.put("button_y", iArr[1]);
                                jSONObject.put("button_width", jip.this.eum.getWidth());
                                jSONObject.put("button_height", jip.this.eum.getHeight());
                            }
                            if (jip.this.apu != null) {
                                int[] iArr2 = new int[2];
                                jip.this.apu.getLocationOnScreen(iArr2);
                                jSONObject.put("ad_x", iArr2[0]);
                                jSONObject.put("ad_y", iArr2[1]);
                                jSONObject.put("width", jip.this.apu.getWidth());
                                jSONObject.put("height", jip.this.apu.getHeight());
                            }
                            jSONObject.put("toolType", motionEvent.getToolType(0));
                            jSONObject.put("deviceId", motionEvent.getDeviceId());
                            jSONObject.put("source", motionEvent.getSource());
                            jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.bug.hnj(jip.this.tu, com.bytedance.sdk.openadsdk.core.ta.hn().hnj() ? 1 : 2));
                            jSONObject.put("user_behavior_type", jip.this.tgn ? 1 : 2);
                            jSONObject.put("click_scence", 2);
                            if (jip.this.pty != null) {
                                jip.this.pty.hnj(jSONObject);
                            }
                            if (!jip.this.jip && !apu.ojm(asVar)) {
                                if (jip.this.bug) {
                                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, "rewarded_video", CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
                                } else {
                                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, "fullscreen_interstitial_ad", CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
                                }
                                jip.this.jip = true;
                            }
                            return false;
                        }
                    } catch (Throwable th2) {
                        Log.e("TTAD.RFWVM", "TouchRecordTool onTouch error", th2);
                    }
                    return false;
                }
            });
        }
        com.bytedance.sdk.component.ojm.dkl dklVar3 = this.f13471fc;
        if (dklVar3 != null) {
            dklVar3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.hnj.gjv(this.hnj, this.gjv, this.zt) { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.jip.4
                @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.gjv, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                }
            });
        }
        hnj(this.f13471fc);
        this.f13471fc.setLayerType(1, null);
        this.f13471fc.setBackgroundColor(-1);
        this.f13471fc.setDisplayZoomControls(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.hqh.f13456hn.ko() && str.endsWith(".mp4");
    }

    public void hnj(DownloadListener downloadListener) {
        com.bytedance.sdk.component.ojm.dkl dklVar = this.f13471fc;
        if (dklVar == null || downloadListener == null) {
            return;
        }
        dklVar.setDownloadListener(downloadListener);
    }

    public void hnj(com.bytedance.sdk.component.ojm.dkl dklVar) {
        if (dklVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.hnj.qor.hnj(this.hqh.orp).hnj(false).hn(false).hnj(dklVar.getWebView());
        dklVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.xn.hnj(dklVar.getWebView(), BuildConfig.VERSION_CODE));
        dklVar.setMixedContentMode(0);
    }

    public void hnj(boolean z10, boolean z11) {
        hnj(this.hnj, z10, z11);
    }

    public void hnj(ua uaVar, boolean z10, boolean z11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z10);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, z11);
            com.bytedance.sdk.openadsdk.activity.single.aq aqVar = this.hqh.f13463th;
            String str = TtmlNode.END;
            if (aqVar != null) {
                jSONObject.put("multi_ads_show", aqVar.ff().ta());
                if (!aqVar.uua) {
                    str = "mid";
                }
                jSONObject.put("endcard_type", str);
            } else {
                jSONObject.put("endcard_type", TtmlNode.END);
            }
            uaVar.hnj("endcard_control_event", jSONObject);
            if (z11) {
                if (this.f13476oj) {
                    return;
                }
                this.rmr = true;
                return;
            }
            this.rmr = false;
        } catch (Exception unused) {
        }
    }

    public void hnj(boolean z10, int i10, String str) {
        com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar = this.dse;
        if (skVar == null) {
            return;
        }
        if (z10) {
            skVar.hn();
        } else {
            skVar.hnj(i10, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hnj(Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f13473gm < 100) {
            return false;
        }
        this.f13473gm = jCurrentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
