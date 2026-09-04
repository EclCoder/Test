package com.bytedance.sdk.openadsdk.core.mjg.hn;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.fvt;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ojm.Cdo;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.gjv.dse;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends com.bytedance.sdk.openadsdk.core.dkl.qor implements c.InterfaceC0870c, xyo.hnj, qor.hnj {
    private boolean apu;
    protected ImageView aq;
    protected String bug;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private final AtomicBoolean f13787cm;
    public dse dkl;
    protected boolean dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private String f37do;
    protected RelativeLayout dse;
    private final ViewTreeObserver.OnScrollChangedListener dzo;
    private String eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    protected boolean f13788fc;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private final AtomicBoolean f13789ff;
    private final String fvt;
    protected boolean gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private boolean f13790gm;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected qor f13791hn;
    protected final as hnj;
    private long hqh;
    private ViewTreeObserver.OnGlobalLayoutListener jbd;
    public hn jip;
    boolean mjg;
    private final boolean nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private ViewGroup f13792oj;
    protected ImageView ojm;
    protected int orl;
    private View orp;
    private final Handler pty;
    protected FrameLayout qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public boolean f13793sk;
    private c.d sq;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    protected ImageView f13794ta;
    private boolean tgn;
    private boolean tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private boolean f13795ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private long f13796ul;
    private final Context uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private boolean f13797vf;
    private final Runnable xad;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private boolean f13798xn;
    private boolean xyo;
    private static final Integer wu = 0;
    private static final Integer as = 1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
        void hnj(boolean z10, long j10, long j11, long j12, boolean z11);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj(View view, int i10);
    }

    public dkl(Context context, as asVar, boolean z10, dse dseVar) {
        this(context, asVar, z10, "embeded_ad", false, false, dseVar);
    }

    private void apu() {
        qor qorVar = this.f13791hn;
        if (qorVar == null) {
            return;
        }
        qorVar.gjv(this.f13798xn);
        this.f13791hn.hnj((qor.hnj) this);
        this.f13791hn.hnj((c.InterfaceC0870c) this);
    }

    private void as() {
        if (!this.f13789ff.get()) {
            this.f13789ff.set(true);
            qor qorVar = this.f13791hn;
            if (qorVar != null) {
                qorVar.hnj(true, 3);
            }
        }
        this.f13787cm.set(false);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private void m26do() {
        this.f13790gm = bug();
        ua.hnj(this.xad);
    }

    private void eum() {
        qor qorVar = this.f13791hn;
        if (qorVar == null) {
            xn();
        } else if (qorVar != null && !gm()) {
            this.f13791hn.jip();
        }
        if (this.f13791hn == null || !this.f13789ff.get()) {
            return;
        }
        this.f13789ff.set(false);
        hn();
        if (!aq()) {
            if (this.f13791hn.orl()) {
                this.f13791hn.orl();
                hn(true);
                return;
            } else {
                dse();
                sq.hnj((View) this.dse, 0);
                return;
            }
        }
        sq.hnj((View) this.dse, 8);
        ImageView imageView = this.ojm;
        if (imageView != null) {
            sq.hnj((View) imageView, 8);
        }
        as asVar = this.hnj;
        if (asVar == null || asVar.pwt() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVarHnj = as.hnj(CacheDirFactory.getICacheDir(this.hnj.gkx()).qor(), this.hnj);
        hnVarHnj.hn(this.hnj.sp());
        hnVarHnj.hn(this.f13792oj.getWidth());
        hnVarHnj.qor(this.f13792oj.getHeight());
        hnVarHnj.qor(this.hnj.ldn());
        hnVarHnj.hnj(0L);
        hnVarHnj.hnj(ojm());
        hnj(hnVarHnj);
        this.f13791hn.hnj(hnVarHnj);
        this.f13791hn.hn(false);
    }

    private void gjv() {
        hnj(0L, 0);
        this.sq = null;
    }

    private boolean gm() {
        return this.apu;
    }

    private void hqh() {
        if (this.f13791hn == null || gm()) {
            return;
        }
        if ((!tu() || com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_video_is_update_flag", false)) && tu()) {
            long jOjm = this.f13791hn.ojm();
            long jDse = this.f13791hn.dse() + jOjm;
            boolean zHnj = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_native_video_complete", false);
            long jHnj = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            long jHnj2 = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_video_total_play_duration", jDse);
            long jHnj3 = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_video_duration", jOjm);
            com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            this.f13791hn.hn(zHnj);
            this.f13791hn.hn(jHnj);
            this.f13791hn.qor(jHnj2);
            this.f13791hn.gjv(jHnj3);
        }
    }

    private boolean nyv() {
        return 2 == oj.gjv().hn(this.hnj.atw());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oj() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = this.pty;
        if (handler == null || jElapsedRealtime - this.f13796ul <= 500) {
            return;
        }
        this.f13796ul = jElapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }

    private boolean pty() {
        return 5 == oj.gjv().hn(this.hnj.atw());
    }

    private void sk() {
        addView(hnj(this.uua));
        xn();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                dkl.this.oj();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                dkl.this.oj();
            }
        });
    }

    private boolean tgn() {
        if (gm() || !tu()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private boolean tu() {
        as asVar = this.hnj;
        if (asVar == null) {
            return false;
        }
        return asVar.vj();
    }

    private void ul() {
        sq.sk(this.ojm);
        sq.sk(this.dse);
    }

    private void vf() {
        this.pty.removeMessages(1);
        fc.qor().removeCallbacks(this.xad);
    }

    private void wu() {
        this.jip = null;
        if (this.f13791hn != null && !gm()) {
            this.f13791hn.ua();
        }
        dnm();
        hnj(false);
        as();
    }

    private void xn() {
        this.f13791hn = new qor(this.uua, this.qor, this.hnj, this.bug, !gm(), this.tgn, this.xyo, this.dkl);
        apu();
        if (this.jbd == null) {
            this.jbd = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    dkl dklVar;
                    qor qorVar;
                    if (dkl.this.f13792oj == null || dkl.this.f13792oj.getViewTreeObserver() == null || (qorVar = (dklVar = dkl.this).f13791hn) == null) {
                        return;
                    }
                    qorVar.hnj(dklVar.f13792oj.getWidth(), dkl.this.f13792oj.getHeight());
                    dkl.this.f13792oj.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    dkl.this.jbd = null;
                }
            };
            this.f13792oj.getViewTreeObserver().addOnGlobalLayoutListener(this.jbd);
        }
    }

    private void xyo() {
        if (gm() || !tu()) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_video_is_from_detail_page", bool);
    }

    public boolean aq() {
        return this.f13798xn;
    }

    boolean bug() {
        return fvt.hnj(this, 50, Cdo.hn(this.bug) ? 1 : 5, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.qor.hnj
    public void dkl() {
        c.d dVar = this.sq;
        if (dVar != null) {
            dVar.g_();
        }
    }

    public void dnm() {
        sk skVarBug;
        qor qorVar = this.f13791hn;
        if (qorVar == null || (skVarBug = qorVar.bug()) == null) {
            return;
        }
        skVarBug.hnj();
        View viewQor = skVarBug.qor();
        if (viewQor != null) {
            viewQor.setVisibility(8);
            if (viewQor.getParent() != null) {
                ((ViewGroup) viewQor.getParent()).removeView(viewQor);
            }
        }
    }

    public void dse() {
        View view;
        if (this.uua == null || (view = this.orp) == null || view.getParent() == null || this.hnj == null || this.dse != null) {
            return;
        }
        ViewParent parent = this.orp.getParent();
        RelativeLayout relativeLayoutHn = hn(this.uua);
        if (parent != null && (parent instanceof ViewGroup)) {
            hnj(relativeLayoutHn, (ViewGroup) parent, this.orp);
        }
        this.dse = relativeLayoutHn;
        if (this.dnm) {
            sq.hnj((View) this.f13794ta, 0);
        }
        if (this.hnj.pwt() != null && this.hnj.pwt().J() != null) {
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.hnj.pwt().J(), this.hnj.pwt().D(), this.hnj.pwt().p(), this.aq, this.hnj);
        }
        ImageView imageView = this.f13794ta;
        if (imageView != null) {
            imageView.setClickable(true);
            this.f13794ta.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    dkl.this.qor();
                }
            });
        }
    }

    public void fc() {
        if (com.bytedance.sdk.component.utils.oj.qor(oj.hnj()) != 0 && bug()) {
            if (this.f13791hn.dnm() != null) {
                if (this.f13791hn.dnm().dse()) {
                    hnj(true, as.intValue());
                    hn();
                    Handler handler = this.pty;
                    if (handler != null) {
                        handler.sendEmptyMessageDelayed(1, 500L);
                        return;
                    }
                    return;
                }
                if (this.f13791hn.dnm().hn() && !this.f13788fc) {
                    ta();
                    if (this.f13791hn != null) {
                        this.f13791hn.orp();
                        return;
                    }
                    return;
                }
            }
            if (aq() || this.f13787cm.get()) {
                return;
            }
            this.f13787cm.set(true);
            ul();
            as asVar = this.hnj;
            if (asVar != null && asVar.pwt() != null) {
                ul();
                this.hnj.pwt();
                com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVarHnj = as.hnj(CacheDirFactory.getICacheDir(this.hnj.gkx()).qor(), this.hnj);
                hnVarHnj.hn(this.hnj.sp());
                hnVarHnj.hn(this.f13792oj.getWidth());
                hnVarHnj.qor(this.f13792oj.getHeight());
                hnVarHnj.qor(this.hnj.ldn());
                hnVarHnj.hnj(this.hqh);
                hnVarHnj.hnj(ojm());
                hnVarHnj.hnj(CacheDirFactory.getICacheDir(this.hnj.gkx()).qor());
                hnj(hnVarHnj);
                this.f13791hn.hnj(hnVarHnj);
            }
            Handler handler2 = this.pty;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            hnj(false);
        }
    }

    public double getCurrentPlayTime() {
        qor qorVar = this.f13791hn;
        if (qorVar != null) {
            return (qorVar.dkl() * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public qor getNativeVideoController() {
        return this.f13791hn;
    }

    @Override // x6.c.InterfaceC0870c
    public void hn(long j10, int i10) {
    }

    @Override // x6.c.InterfaceC0870c
    public void hnj() {
    }

    public void jip() {
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx;
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        as asVar = this.hnj;
        if (asVar == null || (gjvVarFvx = asVar.fvx()) == null || (gjvVarHnj = gjvVarFvx.hnj()) == null) {
            return;
        }
        gjvVarHnj.sk(this.hqh);
    }

    public void mjg() {
        if (getNativeVideoController() == null || getNativeVideoController() == null) {
            return;
        }
        qor nativeVideoController = getNativeVideoController();
        nativeVideoController.hnj(nativeVideoController.bug(), this);
    }

    public boolean ojm() {
        return this.gjv;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        eum();
        if (this.f13788fc) {
            getViewTreeObserver().addOnScrollChangedListener(this.dzo);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wu();
        if (this.f13788fc) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.dzo);
            }
            ViewGroup viewGroup = this.f13792oj;
            if (viewGroup == null || this.jbd == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.jbd);
                this.jbd = null;
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        eum();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hn hnVar;
        qor qorVar;
        if (!this.apu && (hnVar = this.jip) != null && (qorVar = this.f13791hn) != null) {
            hnVar.hnj(qorVar.orl(), this.f13791hn.ojm(), this.f13791hn.gm(), this.f13791hn.dkl(), this.f13798xn);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        wu();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        qor qorVar;
        qor qorVar2;
        qor qorVar3;
        qor qorVar4;
        if ("open_ad".equals(this.bug)) {
            vf();
            return;
        }
        this.tu = z10;
        super.onWindowFocusChanged(z10);
        com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(this.hnj, z10);
        hqh();
        if (this.f13788fc) {
            if (tgn() && (qorVar4 = this.f13791hn) != null && qorVar4.orl()) {
                xyo();
                sq.hnj((View) this.dse, 8);
                hn(true);
                gjv();
                return;
            }
            hn();
            if (!gm() && aq() && (qorVar2 = this.f13791hn) != null && !qorVar2.as()) {
                if (this.pty != null) {
                    if (z10 && (qorVar3 = this.f13791hn) != null && !qorVar3.orl()) {
                        this.pty.obtainMessage(1).sendToTarget();
                        return;
                    } else {
                        vf();
                        hnj(false, wu.intValue());
                        return;
                    }
                }
                return;
            }
            if (aq()) {
                return;
            }
            if (!z10 && (qorVar = this.f13791hn) != null && qorVar.dnm() != null && this.f13791hn.dnm().dkl()) {
                vf();
                hnj(false, wu.intValue());
            } else if (z10) {
                this.pty.obtainMessage(1).sendToTarget();
            }
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        qor qorVar;
        as asVar;
        qor qorVar2;
        qor qorVar3;
        super.onWindowVisibilityChanged(i10);
        hqh();
        if (tgn() && (qorVar3 = this.f13791hn) != null && qorVar3.orl()) {
            xyo();
            sq.hnj((View) this.dse, 8);
            hn(true);
            gjv();
            return;
        }
        hn();
        if (gm() || !aq() || (qorVar = this.f13791hn) == null || qorVar.as() || (asVar = this.hnj) == null) {
            return;
        }
        if (this.f13797vf && asVar.pwt() != null) {
            this.hnj.pwt();
            com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVarHnj = as.hnj(CacheDirFactory.getICacheDir(this.hnj.gkx()).qor(), this.hnj);
            hnVarHnj.hn(this.hnj.sp());
            hnVarHnj.hn(this.f13792oj.getWidth());
            hnVarHnj.qor(this.f13792oj.getHeight());
            hnVarHnj.qor(this.hnj.ldn());
            hnVarHnj.hnj(this.hqh);
            hnVarHnj.hnj(ojm());
            hnj(hnVarHnj);
            this.f13791hn.hnj(hnVarHnj);
            this.f13797vf = false;
            sq.hnj((View) this.dse, 8);
        }
        if (i10 != 0 || !this.f13788fc || this.pty == null || (qorVar2 = this.f13791hn) == null || qorVar2.orl()) {
            return;
        }
        this.pty.obtainMessage(1).sendToTarget();
    }

    public boolean orl() {
        boolean z10 = false;
        if (com.bytedance.sdk.component.utils.oj.qor(oj.hnj()) == 0) {
            return false;
        }
        if (this.f13791hn.dnm() != null && this.f13791hn.dnm().dkl()) {
            hnj(false, wu.intValue());
            Handler handler = this.pty;
            z10 = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z10;
    }

    public void setAdCreativeClickListener(hnj hnjVar) {
        qor qorVar = this.f13791hn;
        if (qorVar != null) {
            qorVar.hnj(hnjVar);
        }
    }

    public void setControllerStatusCallBack(hn hnVar) {
        this.jip = hnVar;
    }

    public void setIsAutoPlay(boolean z10) {
        if (this.f13795ua) {
            return;
        }
        int iHn = oj.gjv().hn(this.hnj.atw());
        if (z10 && iHn != 4 && (!com.bytedance.sdk.component.utils.oj.sk(this.uua) ? !(!com.bytedance.sdk.component.utils.oj.dkl(this.uua) ? com.bytedance.sdk.component.utils.oj.gjv(this.uua) : nyv() || pty()) : !nyv())) {
            z10 = false;
        }
        this.f13798xn = z10;
        qor qorVar = this.f13791hn;
        if (qorVar != null) {
            qorVar.gjv(z10);
        }
        if (this.f13798xn) {
            sq.hnj((View) this.dse, 8);
        } else {
            dse();
            RelativeLayout relativeLayout = this.dse;
            if (relativeLayout != null) {
                sq.hnj((View) relativeLayout, 0);
                as asVar = this.hnj;
                if (asVar != null && asVar.pwt() != null) {
                    com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.hnj.pwt().J(), this.hnj.pwt().D(), this.hnj.pwt().p(), this.aq, this.hnj);
                }
            }
        }
        this.f13795ua = true;
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z10) {
        this.dnm = z10;
    }

    public void setNeedSelfManagerVideo(boolean z10) {
        this.f13788fc = z10;
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        qor qorVar = this.f13791hn;
        if (qorVar != null) {
            qorVar.hnj(pAGNativeAd);
        }
    }

    public void setVideoAdInteractionListener(c.d dVar) {
        this.sq = dVar;
    }

    public void setVideoAdLoadListener(c.a aVar) {
        qor qorVar = this.f13791hn;
        if (qorVar != null) {
            qorVar.hnj(aVar);
        }
    }

    public void setVideoCacheUrl(String str) {
        this.eum = str;
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.mjg.hn.hn hnVar) {
        qor qorVar = this.f13791hn;
        if (qorVar != null) {
            qorVar.hnj(hnVar);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 4 || i10 == 8) {
            as();
        }
    }

    public void ta() {
        qor qorVar = this.f13791hn;
        if (qorVar != null) {
            sk skVarBug = qorVar.bug();
            if (skVarBug != null) {
                skVarBug.hnj();
            }
            ul();
        }
    }

    public dkl(Context context, as asVar, String str, boolean z10, boolean z11, dse dseVar) {
        this(context, asVar, false, str, z10, z11, dseVar);
    }

    protected void qor() {
        if (orl()) {
            return;
        }
        fc();
    }

    public dkl(Context context, as asVar, dse dseVar) {
        this(context, asVar, false, dseVar);
    }

    protected void hn() {
        as asVar = this.hnj;
        if (asVar == null) {
            return;
        }
        int iAtw = asVar.atw();
        int iHn = oj.gjv().hn(iAtw);
        int iQor = com.bytedance.sdk.component.utils.oj.qor(oj.hnj());
        if (iHn == 1) {
            this.f13798xn = orp.gjv(iQor);
        } else if (iHn == 2) {
            this.f13798xn = orp.sk(iQor) || orp.gjv(iQor) || orp.dkl(iQor);
        } else if (iHn == 3) {
            this.f13798xn = false;
        } else if (iHn == 4) {
            this.mjg = true;
        } else if (iHn == 5) {
            this.f13798xn = orp.gjv(iQor) || orp.dkl(iQor);
        }
        if (!this.apu) {
            if (!this.f13793sk || !Cdo.hn(this.bug)) {
                this.gjv = oj.gjv().qor(String.valueOf(iAtw));
            }
        } else {
            this.gjv = false;
        }
        if ("open_ad".equals(this.bug)) {
            this.f13798xn = true;
            this.gjv = true;
        }
        if (Cdo.hn(this.bug)) {
            this.gjv = true;
        }
        qor qorVar = this.f13791hn;
        if (qorVar != null) {
            qorVar.gjv(this.f13798xn);
        }
        this.f13793sk = true;
    }

    public dkl(Context context, as asVar, boolean z10, String str, boolean z11, boolean z12, dse dseVar) {
        super(context);
        this.f13798xn = true;
        this.gjv = true;
        this.apu = false;
        this.f13793sk = false;
        this.tu = true;
        this.tgn = false;
        this.xyo = true;
        this.dnm = true;
        this.bug = "embeded_ad";
        this.orl = 50;
        this.f13797vf = true;
        this.nyv = false;
        this.pty = new xyo(fc.hn().getLooper(), this);
        this.f13795ua = false;
        this.fvt = Build.MODEL;
        this.mjg = false;
        this.f13788fc = true;
        this.f13789ff = new AtomicBoolean(false);
        this.xad = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.4
            @Override // java.lang.Runnable
            public void run() {
                dkl dklVar = dkl.this;
                dklVar.hnj(dklVar.f13790gm, dkl.wu.intValue());
            }
        };
        this.f13787cm = new AtomicBoolean(false);
        this.dzo = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                dkl.this.oj();
            }
        };
        try {
            if (asVar.bsm()) {
                this.f37do = CacheDirFactory.getICacheDir(0).hn();
            }
        } catch (Throwable unused) {
        }
        if (dseVar != null) {
            this.dkl = dseVar;
        }
        this.bug = str;
        this.uua = context;
        this.hnj = asVar;
        this.apu = z10;
        setContentDescription("NativeVideoTsView");
        this.tgn = z11;
        this.xyo = z12;
        hn();
        sk();
    }

    @Override // x6.c.InterfaceC0870c
    public void hnj(long j10, int i10) {
        c.d dVar = this.sq;
        if (dVar != null) {
            dVar.j_();
        }
    }

    @Override // x6.c.InterfaceC0870c
    public void hnj(long j10, long j11) {
        c.d dVar = this.sq;
        if (dVar != null) {
            dVar.hnj(j10, j11);
        }
    }

    private View hnj(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.f13792oj = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.qor = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.orp = view;
        return frameLayout;
    }

    private RelativeLayout hn(Context context) {
        com.bytedance.sdk.openadsdk.core.dkl.dse dseVar = new com.bytedance.sdk.openadsdk.core.dkl.dse(context);
        dseVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dseVar.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        gjvVar.setLayoutParams(layoutParams);
        gjvVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.aq = gjvVar;
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar2 = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        gjvVar2.setLayoutParams(layoutParams2);
        gjvVar2.setVisibility(8);
        gjvVar2.setBackground(wu.qor(context, "tt_new_play_video"));
        this.f13794ta = gjvVar2;
        dseVar.addView(gjvVar);
        dseVar.addView(gjvVar2);
        return dseVar;
    }

    private void hnj(View view, ViewGroup viewGroup, View view2) {
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    public boolean hnj(long j10, boolean z10, boolean z11) {
        boolean zHnj = false;
        this.f13792oj.setVisibility(0);
        this.hqh = j10;
        if (!gm()) {
            return true;
        }
        this.f13791hn.hnj(false);
        as asVar = this.hnj;
        if (asVar != null && asVar.pwt() != null) {
            com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVarHnj = as.hnj(CacheDirFactory.getICacheDir(this.hnj.gkx()).qor(), this.hnj);
            hnVarHnj.hn(this.hnj.sp());
            hnVarHnj.hn(this.f13792oj.getWidth());
            hnVarHnj.qor(this.f13792oj.getHeight());
            hnVarHnj.qor(this.hnj.ldn());
            hnVarHnj.hnj(j10);
            hnVarHnj.hnj(ojm());
            hnj(hnVarHnj);
            if (z11) {
                this.f13791hn.hn(hnVarHnj);
                return true;
            }
            zHnj = this.f13791hn.hnj(hnVarHnj);
        }
        if (((j10 > 0 && !z10 && !z11) || (j10 > 0 && z10)) && this.f13791hn != null) {
            com.bytedance.sdk.openadsdk.gjv.sk.hn.fc.hnj hnjVar = new com.bytedance.sdk.openadsdk.gjv.sk.hn.fc.hnj();
            hnjVar.hn(this.f13791hn.dkl());
            hnjVar.gjv(this.f13791hn.ojm());
            hnjVar.qor(this.f13791hn.dse());
            com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hn(this.f13791hn.bug(), hnjVar);
        }
        return zHnj;
    }

    public void hn(boolean z10) {
        qor qorVar = this.f13791hn;
        if (qorVar != null) {
            qorVar.hn(z10);
            sk skVarBug = this.f13791hn.bug();
            if (skVarBug != null) {
                skVarBug.hn();
                View viewQor = skVarBug.qor();
                if (viewQor != null) {
                    if (viewQor.getParent() != null) {
                        ((ViewGroup) viewQor.getParent()).removeView(viewQor);
                    }
                    viewQor.setVisibility(0);
                    addView(viewQor);
                    skVarBug.hnj((Object) this.hnj, new WeakReference(this.uua), false);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
        if (message.what == 1) {
            m26do();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(boolean z10, int i10) {
        if (this.hnj == null || this.f13791hn == null) {
            return;
        }
        boolean zTgn = tgn();
        xyo();
        if (zTgn && this.f13791hn.orl()) {
            this.f13791hn.orl();
            hn(true);
            gjv();
            return;
        }
        if (z10 && this.tu && !this.f13791hn.orl() && !this.f13791hn.as()) {
            if (this.f13791hn.dnm() != null && this.f13791hn.dnm().dse()) {
                if (this.f13798xn || i10 == 1) {
                    qor qorVar = this.f13791hn;
                    if (qorVar != null) {
                        hnj(qorVar.m29do(), "changeVideoStatus");
                    }
                    if ("ALP-AL00".equals(this.fvt)) {
                        this.f13791hn.qor();
                    } else {
                        if (!ta.hn().mjg()) {
                            zTgn = true;
                        }
                        this.f13791hn.dse(zTgn);
                    }
                    hnj(false);
                    c.d dVar = this.sq;
                    if (dVar != null) {
                        dVar.i_();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.f13798xn && this.f13791hn.dnm() == null) {
                if (!this.f13789ff.get()) {
                    this.f13789ff.set(true);
                }
                this.f13787cm.set(false);
                eum();
                return;
            }
            return;
        }
        if (this.f13791hn.dnm() == null || !this.f13791hn.dnm().dkl()) {
            return;
        }
        this.f13791hn.hn();
        hnj(true);
        c.d dVar2 = this.sq;
        if (dVar2 != null) {
            dVar2.h_();
        }
    }

    public void hnj(boolean z10, String str) {
        if (Cdo.hn(this.bug)) {
            z10 = true;
        }
        this.gjv = z10;
        qor qorVar = this.f13791hn;
        if (qorVar != null) {
            qorVar.hnj(z10, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.qor.hnj
    public void hnj(int i10) {
        hn();
    }

    protected void hnj(boolean z10) {
        if (this.ojm == null) {
            ImageView imageView = new ImageView(getContext());
            this.ojm = imageView;
            imageView.setImageResource(wu.gjv(oj.hnj(), "tt_new_play_video"));
            this.ojm.setScaleType(ImageView.ScaleType.FIT_XY);
            int iHn = sq.hn(getContext(), this.orl);
            int iHn2 = sq.hn(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iHn, iHn);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = iHn2;
            layoutParams.bottomMargin = iHn2;
            this.f13792oj.addView(this.ojm, layoutParams);
            this.ojm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    dkl.this.fc();
                }
            });
        }
        if (z10) {
            this.ojm.setVisibility(0);
        } else {
            this.ojm.setVisibility(8);
        }
    }

    public com.bytedance.sdk.openadsdk.core.orl.dkl hnj(List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (this.f13791hn != null) {
            return this.f13791hn.hnj(this, list);
        }
        return null;
    }

    private void hnj(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        try {
            if (this.hnj.bsm()) {
                cVar.hnj(this.f37do);
            }
        } catch (Throwable unused) {
        }
    }
}
