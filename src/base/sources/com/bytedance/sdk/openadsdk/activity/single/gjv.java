package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.c;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.reward.hnj.dnm;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.gm;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.model.tgn;
import com.bytedance.sdk.openadsdk.core.model.tu;
import com.bytedance.sdk.openadsdk.core.model.xyo;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.coremedia.iso.boxes.FreeSpaceBox;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends com.bytedance.sdk.openadsdk.activity.single.qor implements Handler.Callback {
    private final boolean apu;
    private final LinearLayoutManager aq;
    private int as;
    private final boolean bug;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private FrameLayout f13142cm;
    private final RecyclerView dkl;
    private final FrameLayout dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private boolean f24do;
    private final hnj dse;
    private boolean dzo;
    private boolean eta;
    private boolean eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final boolean f13143fc;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private JSONObject f13144ff;
    private long fr;
    private com.bytedance.sdk.openadsdk.activity.single.sk fvt;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.activity.single.hn.sk f13145gm;

    /* JADX INFO: renamed from: gn, reason: collision with root package name */
    private boolean f13146gn;
    private boolean hqh;
    private dkl izk;
    private int jbd;
    private final boolean jip;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    private Message f13147ka;
    private View lhi;
    private long lu;
    private final HashSet<String> mjg;
    private boolean mkl;
    private int nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private final PAGLogoView f13148oj;
    private final TopLayoutDislike2 ojm;
    private final AtomicBoolean orl;
    private boolean orp;
    private JSONObject pnz;
    private aq pty;
    private JSONObject pv;

    /* JADX INFO: renamed from: qb, reason: collision with root package name */
    private boolean f13149qb;
    private boolean rmr;
    private tu.hnj sq;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final Handler f13150ta;
    private boolean tgn;
    private int tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private int f13151ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private int f13152ul;
    private final HashSet<Integer> uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private boolean f13153vf;
    private int wu;
    private boolean xad;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private final ArrayList<Message> f13154xn;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    private long f13155xo;
    private int xyo;
    private boolean zt;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class dkl implements Runnable {
        private long gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final long f13167hn;
        private final Handler hnj = new Handler(Looper.getMainLooper());
        private long qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private long f13168sk;

        public dkl(long j10) {
            this.f13167hn = j10;
        }

        public long dkl() {
            long jElapsedRealtime;
            long j10;
            if (this.qor > this.f13168sk) {
                jElapsedRealtime = this.f13167hn - (SystemClock.elapsedRealtime() - this.qor);
                j10 = this.gjv;
            } else {
                jElapsedRealtime = this.f13167hn;
                j10 = this.gjv;
            }
            long j11 = jElapsedRealtime - j10;
            if (j11 < 0) {
                return 0L;
            }
            return j11;
        }

        public void gjv() {
            this.hnj.removeCallbacks(this);
        }

        public void hn() {
            this.hnj.removeCallbacks(this);
            if (this.f13168sk > this.qor) {
                return;
            }
            this.gjv += SystemClock.elapsedRealtime() - this.qor;
            this.f13168sk = SystemClock.elapsedRealtime();
        }

        public abstract void hnj();

        public void qor() {
            long j10 = this.f13167hn - this.gjv;
            if (j10 < 0) {
                return;
            }
            this.hnj.removeCallbacks(this);
            this.hnj.postDelayed(this, j10);
            this.qor = SystemClock.elapsedRealtime();
        }

        @Override // java.lang.Runnable
        public void run() {
            hnj();
        }

        public void sk() {
            this.hnj.postDelayed(this, this.f13167hn);
            this.qor = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hn extends sk {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final com.bytedance.sdk.openadsdk.component.reward.view.hn f13170hn;
        private final hnj hnj;
        private com.bytedance.sdk.openadsdk.activity.single.hnj qor;

        public hn(hnj hnjVar, View view) {
            super(view);
            this.hnj = hnjVar;
            this.f13170hn = (com.bytedance.sdk.openadsdk.component.reward.view.hn) view;
        }

        public aq hnj() {
            return this.qor;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.gjv.sk
        public void hnj(gjv gjvVar, C0198gjv c0198gjv, int i10) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            Activity activity = gjvVar.hnj;
            if (com.bytedance.sdk.component.utils.hn.hnj(activity)) {
                return;
            }
            as asVar = c0198gjv.f13169hn;
            com.bytedance.sdk.openadsdk.activity.single.hnj hnjVar = this.qor;
            if (hnjVar != null) {
                if (hnj(hnjVar, asVar)) {
                    this.qor.hnj(asVar, bindingAdapterPosition, i10);
                } else {
                    this.hnj.hnj(this, false);
                }
            }
            com.bytedance.sdk.openadsdk.activity.single.hn hnVar = gjvVar.gjv;
            if (this.qor == null) {
                this.qor = asVar.hhw() ? new dse(hnVar, asVar, bindingAdapterPosition, i10, false) : new com.bytedance.sdk.openadsdk.activity.single.dkl(hnVar, asVar, bindingAdapterPosition, i10, false);
            }
            com.bytedance.sdk.openadsdk.activity.single.hn.sk skVar = new com.bytedance.sdk.openadsdk.activity.single.hn.sk(1, null);
            skVar.gjv = gjvVar.hqh;
            this.qor.hn(activity, skVar);
            this.hnj.hnj(this.qor);
            com.bytedance.sdk.openadsdk.component.reward.view.aq aqVarHnj = this.qor.hnj();
            if (aqVarHnj == null) {
                return;
            }
            ViewParent parent = aqVarHnj.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(aqVarHnj);
            }
            if (!gjvVar.f13143fc) {
                float fWxh = asVar.wxh();
                if (fWxh > 0.0f) {
                    this.f13170hn.setWidthAndHeightRatio(fWxh);
                } else {
                    this.f13170hn.setWidthOrHeightInParentRatio(0.8f);
                }
            }
            this.f13170hn.hnj(aqVarHnj, new FrameLayout.LayoutParams(-1, -1));
            this.f13170hn.setScene(this.qor);
        }

        private boolean hnj(aq aqVar, as asVar) {
            gm gmVarVk;
            if (aqVar.pty() && (gmVarVk = aqVar.dkl.vk()) != null) {
                gm gmVarVk2 = asVar.vk();
                if (TextUtils.equals(gmVarVk.hnj(), gmVarVk2.hnj()) && TextUtils.equals(gmVarVk.hn(), gmVarVk2.hn()) && aqVar.gm()) {
                    return true;
                }
            }
            return false;
        }

        public void hnj(boolean z10) {
            com.bytedance.sdk.openadsdk.activity.single.hnj hnjVar = this.qor;
            if (hnjVar == null) {
                return;
            }
            hnjVar.dkl(z10);
            this.qor.xn();
            if (!z10) {
                this.qor = null;
            }
            this.f13170hn.hnj();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class qor extends sk {
        private final TextView hnj;

        public qor(View view) {
            super(view);
            com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(view.getContext());
            this.hnj = aqVar;
            aqVar.setTextColor(Color.parseColor("#99FFFFFF"));
            aqVar.setTextSize(14.0f);
            aqVar.setGravity(17);
            aqVar.setPadding(0, 24, 0, 24);
            ((FrameLayout) view).addView(aqVar, new FrameLayout.LayoutParams(-1, -2));
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.gjv.sk
        public void hnj(gjv gjvVar, C0198gjv c0198gjv, int i10) {
            this.hnj.setText(c0198gjv.qor);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class sk extends RecyclerView.g0 {
        public sk(View view) {
            super(view);
        }

        public abstract void hnj(gjv gjvVar, C0198gjv c0198gjv, int i10);
    }

    public gjv(final Activity activity, final as asVar, final com.bytedance.sdk.openadsdk.activity.single.hn hnVar) {
        tu tuVarTa;
        super(activity, asVar, hnVar);
        this.f13150ta = new Handler(Looper.getMainLooper(), this);
        boolean z10 = false;
        this.orl = new AtomicBoolean(false);
        this.mjg = new HashSet<>();
        this.uua = new HashSet<>();
        this.f13154xn = new ArrayList<>();
        this.wu = 5;
        this.as = 3;
        this.nyv = -1;
        int i10 = 1;
        this.f13145gm = new com.bytedance.sdk.openadsdk.activity.single.hn.sk(1, null);
        boolean z11 = asVar.qb() == 44;
        this.f13143fc = z11;
        boolean zHhw = asVar.hhw();
        this.bug = zHhw;
        this.jip = dnm.hnj(activity, asVar) == 1;
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(activity) { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                gjv.this.pnz = null;
                try {
                    return super.dispatchTouchEvent(motionEvent);
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        this.dnm = qorVar;
        if (Build.VERSION.SDK_INT >= 35) {
            qorVar.setFitsSystemWindows(true);
        }
        activity.setContentView(qorVar);
        this.f13206sk = String.valueOf(activity.hashCode());
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVarGjv = asVar.gjv();
        if (hnjVarGjv != null && (tuVarTa = hnjVarGjv.ta()) != null) {
            this.orp = tuVarTa.fc();
            this.sq = tuVarTa.dkl();
            int iMax = Math.max(0, tuVarTa.ojm());
            this.f13152ul = iMax;
            this.f13151ua = iMax;
            this.f13153vf = tuVarTa.mjg();
            this.tgn = tuVarTa.dnm();
            this.tu = tuVarTa.aq();
            this.f13144ff = tuVarTa.bug();
            this.f24do = tuVarTa.ta();
            this.eum = tuVarTa.hnj();
            this.xad = this.tu > 0;
            this.wu = tuVarTa.gjv();
            this.as = tuVarTa.sk();
            this.pnz = tuVarTa.hn();
            this.pv = tuVarTa.qor();
            if (!this.tgn) {
                this.orp = false;
            }
        }
        if (zHhw) {
            int iJo = asVar.jo();
            this.xyo = (int) ((1.0f - (Math.max(0, Math.min(100, iJo < 0 ? oj.gjv().tgn(String.valueOf(asVar.atw())).dkl : iJo)) / 100.0f)) * this.f13152ul);
        }
        RecyclerView recyclerView = new RecyclerView(activity);
        this.dkl = recyclerView;
        tu.hnj hnjVar = this.sq;
        if (hnjVar != null) {
            int iQor = hnjVar.qor();
            int iGjv = this.sq.gjv();
            if (iQor > 0 || iGjv > 0) {
                recyclerView.setPadding(sq.hn(activity, iQor), 0, sq.hn(activity, iGjv), 0);
            }
            int iHn = this.sq.hn();
            int iHnj = this.sq.hnj();
            int iSk = this.sq.sk();
            if (iHn > 0 || iSk > 0 || iHnj > 0) {
                final int iHn2 = sq.hn(activity, iHn);
                final int iHn3 = sq.hn(activity, iHnj);
                final int iHn4 = sq.hn(activity, iSk);
                recyclerView.j(new RecyclerView.p() { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.11
                    @Override // androidx.recyclerview.widget.RecyclerView.p
                    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView2, RecyclerView.c0 c0Var) {
                        int iM0 = recyclerView2.m0(view);
                        int itemCount = recyclerView2.getAdapter().getItemCount();
                        if (iM0 == 0) {
                            rect.top = iHn2;
                        } else {
                            rect.top = iHn4 / 2;
                        }
                        if (iM0 == itemCount - 1) {
                            rect.bottom = iHn3;
                        } else {
                            rect.bottom = iHn4 / 2;
                        }
                    }
                });
            }
        }
        qorVar.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        TopLayoutDislike2 topLayoutDislike2 = new TopLayoutDislike2(activity);
        this.ojm = topLayoutDislike2;
        qorVar.addView(topLayoutDislike2, new FrameLayout.LayoutParams(-1, -2));
        topLayoutDislike2.load(asVar);
        topLayoutDislike2.setShowDislike(true);
        topLayoutDislike2.setShowSound(true);
        boolean zUua = oj.gjv().uua(String.valueOf(asVar.atw()));
        this.hqh = zUua;
        topLayoutDislike2.setSoundMute(zUua);
        topLayoutDislike2.setListener(new com.bytedance.sdk.openadsdk.component.reward.top.hn() { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.12
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hn(View view) {
                if (gjv.this.pty != null) {
                    gjv.this.pty.e_();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hnj(View view) {
                com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
                as asVar2 = asVar;
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(FreeSpaceBox.TYPE, asVar2, asVar2.sk(), (Map<String, Object>) null);
                com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = asVar.fvx();
                if (gjvVarFvx != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
                    gjvVarHnj.dkl(0L);
                    gjvVarHnj.sk(0L);
                }
                gjv.this.tu();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void qor(View view) {
                hnVar.dse();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hnj(View view, String str) {
                if (gjv.this.pty != null) {
                    gjv.this.pty.hnj(str);
                    gjv gjvVar = gjv.this;
                    gjvVar.hqh = !gjvVar.hqh;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void gjv(View view) {
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity, i10, z10) { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.13
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            protected void calculateExtraLayoutSpace(RecyclerView.c0 c0Var, int[] iArr) {
                super.calculateExtraLayoutSpace(c0Var, iArr);
                int height = gjv.this.dkl.getHeight();
                iArr[0] = height;
                iArr[1] = height;
            }
        };
        this.aq = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        hnj hnjVar2 = new hnj(this, asVar.mr());
        this.dse = hnjVar2;
        recyclerView.setAdapter(hnjVar2);
        if (!this.xad && !this.f24do) {
            hnjVar2.hnj(wu.hnj(activity, "tt_list_end_tip"));
        }
        if (z11) {
            new t().attachToRecyclerView(recyclerView);
        } else if (this.tgn) {
            new com.bytedance.sdk.openadsdk.component.reward.view.hnj().attachToRecyclerView(recyclerView);
        }
        recyclerView.n(new RecyclerView.v() { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.14

            /* JADX INFO: renamed from: sk, reason: collision with root package name */
            private int f13160sk;
            private final Rect qor = new Rect();
            private int gjv = -1;

            /* JADX WARN: Code duplicated, block: B:22:0x006d  */
            /* JADX WARN: Code duplicated, block: B:24:0x007b  */
            /* JADX WARN: Code duplicated, block: B:26:0x0083  */
            /* JADX WARN: Code duplicated, block: B:29:0x008e  */
            /* JADX WARN: Code duplicated, block: B:37:0x0090 A[SYNTHETIC] */
            private void hnj() {
                int iGjv2;
                View viewFindViewByPosition;
                RecyclerView.g0 g0VarE0;
                hn hnVar2;
                if (gjv.this.eum && (iGjv2 = gjv.this.dse.gjv()) != 0) {
                    int iFindFirstVisibleItemPosition = gjv.this.aq.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = gjv.this.aq.findLastVisibleItemPosition();
                    if (iFindLastVisibleItemPosition % iGjv2 > this.gjv) {
                        for (int i11 = iFindFirstVisibleItemPosition; i11 <= iFindLastVisibleItemPosition; i11++) {
                            int i12 = i11 % iGjv2;
                            if (i12 > this.gjv) {
                                if ((i11 == iFindFirstVisibleItemPosition || i11 == iFindLastVisibleItemPosition) && (viewFindViewByPosition = gjv.this.aq.findViewByPosition(i11)) != null) {
                                    this.qor.setEmpty();
                                    viewFindViewByPosition.getGlobalVisibleRect(this.qor);
                                    int height = viewFindViewByPosition.getHeight();
                                    if (height > 0 && (this.qor.height() * 1.0f) / height >= 0.5f) {
                                        g0VarE0 = gjv.this.dkl.e0(i11);
                                        if (g0VarE0 instanceof hn) {
                                            hnVar2 = (hn) g0VarE0;
                                            if (hnVar2.qor != null) {
                                                hnVar2.qor.fr();
                                            }
                                        }
                                        if (i12 > this.gjv) {
                                            this.gjv = i12;
                                        }
                                    }
                                } else {
                                    g0VarE0 = gjv.this.dkl.e0(i11);
                                    if (g0VarE0 instanceof hn) {
                                        hnVar2 = (hn) g0VarE0;
                                        if (hnVar2.qor != null) {
                                            hnVar2.qor.fr();
                                        }
                                    }
                                    if (i12 > this.gjv) {
                                        this.gjv = i12;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.v
            public void onScrollStateChanged(RecyclerView recyclerView2, int i11) {
                super.onScrollStateChanged(recyclerView2, i11);
                if (com.bytedance.sdk.component.utils.hn.hnj(activity)) {
                    return;
                }
                int iFindFirstCompletelyVisibleItemPosition = gjv.this.aq.findFirstCompletelyVisibleItemPosition();
                gjv.this.aq.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = gjv.this.aq.findLastVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition < 0) {
                    return;
                }
                if (i11 == 0 && iFindFirstCompletelyVisibleItemPosition != gjv.this.nyv) {
                    boolean z12 = iFindFirstCompletelyVisibleItemPosition == gjv.this.jbd;
                    gjv gjvVar = gjv.this;
                    gjvVar.hnj(iFindFirstCompletelyVisibleItemPosition, gjvVar.orp && z12);
                    if (gjv.this.orp && !z12 && gjv.this.f13153vf) {
                        gjv.this.orp = false;
                    }
                    if (gjv.this.izk != null) {
                        gjv.this.izk.gjv();
                        gjv.this.izk = null;
                    }
                }
                if (i11 == 0) {
                    gjv.this.jbd = -1;
                }
                if (!gjv.this.xad || gjv.this.tu <= 0 || iFindLastVisibleItemPosition < gjv.this.dse.hnj() - gjv.this.tu) {
                    return;
                }
                gjv.this.wu();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.v
            public void onScrolled(RecyclerView recyclerView2, int i11, int i12) {
                super.onScrolled(recyclerView2, i11, i12);
                if (i12 == 0 || com.bytedance.sdk.component.utils.hn.hnj(activity)) {
                    return;
                }
                hnj();
                int iFindLastVisibleItemPosition = gjv.this.aq.findLastVisibleItemPosition();
                if (i12 > 0 && gjv.this.xad && gjv.this.tu > 0 && iFindLastVisibleItemPosition >= gjv.this.dse.hnj() - gjv.this.tu) {
                    gjv.this.wu();
                }
                if (this.f13160sk != iFindLastVisibleItemPosition) {
                    this.f13160sk = iFindLastVisibleItemPosition;
                    if (!gjv.this.uua.isEmpty() && gjv.this.uua.contains(Integer.valueOf(iFindLastVisibleItemPosition))) {
                        gjv.this.uua.remove(Integer.valueOf(iFindLastVisibleItemPosition));
                        RecyclerView.g0 g0VarE0 = recyclerView2.e0(iFindLastVisibleItemPosition);
                        if (g0VarE0 instanceof hn) {
                            hn hnVar2 = (hn) g0VarE0;
                            hnVar2.qor.sk(true);
                            hnVar2.qor.xyo();
                            return;
                        }
                        return;
                    }
                    if (gjv.this.eta) {
                        gjv.this.eta = false;
                        RecyclerView.g0 g0VarE1 = recyclerView2.e0(iFindLastVisibleItemPosition);
                        if (g0VarE1 instanceof hn) {
                            hn hnVar3 = (hn) g0VarE1;
                            if (hnVar3.qor != null) {
                                hnVar3.qor.sk(true);
                                hnVar3.qor.tgn();
                            }
                        }
                    }
                }
            }
        });
        pty();
        final int iEum = eum();
        recyclerView.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.15
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.hn.hnj(activity)) {
                    return;
                }
                gjv.this.hnj(iEum, true);
            }
        });
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(activity, asVar);
        this.f13148oj = pAGLogoViewCreatePAGLogoViewByMaterial;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.leftMargin = sq.hn(activity, 16.0f);
        qorVar.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams);
        pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context context = view.getContext();
                as asVar2 = asVar;
                TTWebsiteActivity.hnj(context, asVar2, asVar2.sk());
            }
        });
        this.apu = com.bytedance.sdk.openadsdk.as.sk.hnj("draw_feed_item_reuse", 0) == 1;
    }

    private boolean gm() {
        FrameLayout frameLayout = this.f13142cm;
        return (frameLayout == null || frameLayout.getParent() == null) ? false : true;
    }

    private void hqh() {
        if (this.pnz == null) {
            return;
        }
        new com.bytedance.sdk.openadsdk.core.bug.ojm.hnj(this.hnj).hnj(this.pnz, com.bytedance.sdk.openadsdk.core.ojm.hnj.hn.hn(), this.pv, new com.bytedance.sdk.openadsdk.core.bug.dse.gjv() { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.8
            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.gjv
            public void hnj(int i10, String str) {
                gjv.this.f13149qb = true;
            }

            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.gjv
            public void hnj(com.bytedance.adsdk.ugeno.hn.qor<View> qorVar) {
                View viewDnm = qorVar.dnm();
                ViewGroup viewGroup = (ViewGroup) viewDnm.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewDnm);
                }
                gjv.this.lhi = viewDnm;
                if (gjv.this.f13142cm != null) {
                    gjv.this.f13142cm.addView(viewDnm, new FrameLayout.LayoutParams(-1, -1));
                }
            }
        });
    }

    private void nyv() {
        if (this.f13142cm != null || this.pnz == null || this.f13149qb) {
            return;
        }
        this.dzo = true;
        this.f13142cm = new com.bytedance.sdk.openadsdk.core.dkl.qor(this.hnj) { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.9
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                gjv.this.f13150ta.removeMessages(4);
                gjv.this.f13150ta.sendEmptyMessage(4);
                try {
                    return super.dispatchTouchEvent(motionEvent);
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        View view = this.lhi;
        if (view != null && view.getParent() == null) {
            this.f13142cm.addView(this.lhi, new FrameLayout.LayoutParams(-1, -1));
        }
        this.dnm.addView(this.f13142cm, new FrameLayout.LayoutParams(-1, -1));
        this.f13150ta.sendEmptyMessageDelayed(4, ((long) this.as) * 1000);
        aq aqVar = this.pty;
        if (aqVar instanceof com.bytedance.sdk.openadsdk.activity.single.hnj) {
            ((com.bytedance.sdk.openadsdk.activity.single.hnj) aqVar).vf();
        }
        ua();
    }

    private void pty() {
        tu tuVarTa;
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVarGjv = this.f13205hn.gjv();
        if (hnjVarGjv == null || (tuVarTa = hnjVarGjv.ta()) == null || TextUtils.isEmpty(tuVarTa.dse())) {
            return;
        }
        this.fvt = new com.bytedance.sdk.openadsdk.activity.single.sk(this.gjv, this.f13205hn, -1, 1, false, false, true);
    }

    private void tgn() {
        FrameLayout frameLayout = this.f13142cm;
        if (frameLayout == null) {
            return;
        }
        ViewParent parent = frameLayout.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f13142cm);
        }
        this.f13142cm = null;
        aq aqVar = this.pty;
        if (aqVar instanceof com.bytedance.sdk.openadsdk.activity.single.hnj) {
            ((com.bytedance.sdk.openadsdk.activity.single.hnj) aqVar).hqh();
        }
        ul();
        Message message = this.f13147ka;
        if (message != null) {
            handleMessage(message);
            this.f13147ka = null;
        }
    }

    private void ua() {
        if (this.f13146gn) {
            this.fr = System.currentTimeMillis();
        }
        this.f13150ta.removeMessages(1);
        dkl dklVar = this.izk;
        if (dklVar != null) {
            dklVar.hn();
        }
    }

    private void ul() {
        if (this.fr != 0) {
            aq aqVar = this.pty;
            if (aqVar != null && hqh.hn(aqVar.dkl)) {
                int iCurrentTimeMillis = this.f13152ul - ((int) ((System.currentTimeMillis() - this.fr) / 1000));
                this.f13152ul = iCurrentTimeMillis;
                if (iCurrentTimeMillis < 0) {
                    this.f13152ul = 0;
                }
            }
            this.fr = 0L;
        }
        if (this.f13152ul >= 0) {
            this.f13150ta.removeMessages(1);
            this.f13150ta.sendEmptyMessage(1);
        }
        dkl dklVar = this.izk;
        if (dklVar != null) {
            dklVar.qor();
        }
    }

    private void vf() {
        if (this.dzo || this.pnz == null) {
            return;
        }
        this.f13150ta.removeMessages(3);
        this.f13150ta.sendEmptyMessageDelayed(3, ((long) this.wu) * 1000);
    }

    private void xyo() {
        aq aqVar;
        if (!this.bug || this.gjv.uua() || (aqVar = this.pty) == null) {
            return;
        }
        aqVar.lu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public com.bytedance.sdk.openadsdk.component.reward.top.qor bug() {
        return null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.zt) {
            this.f13154xn.add(this.f13150ta.obtainMessage(message.what, message.arg1, message.arg2, message.obj));
            return false;
        }
        int i10 = message.what;
        if (i10 == 1) {
            int i11 = this.f13152ul;
            if (i11 > 0) {
                if (i11 <= this.xyo) {
                    xyo();
                }
                int i12 = this.f13151ua;
                int i13 = (int) ((((double) (i12 - this.f13152ul)) * 100.0d) / ((double) i12));
                TopLayoutDislike2 topLayoutDislike2 = this.ojm;
                StringBuilder sb2 = new StringBuilder();
                int i14 = this.f13152ul;
                this.f13152ul = i14 - 1;
                sb2.append(i14);
                sb2.append("s");
                topLayoutDislike2.setCountDownFor1InN(sb2.toString(), i13);
                if (this.f13152ul >= 0) {
                    this.f13150ta.removeMessages(message.what);
                    this.f13150ta.sendEmptyMessageDelayed(message.what, 1000L);
                }
            } else {
                xyo();
                if (gjv()) {
                    this.ojm.showSkipButton();
                } else {
                    this.ojm.showCloseButton();
                }
            }
        } else if (i10 == 3) {
            nyv();
        } else if (i10 == 4) {
            tgn();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void oj() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void xn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void as() {
        if (this.xad) {
            return;
        }
        if (this.f24do) {
            eum();
        } else {
            ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.18
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.component.utils.hn.hnj(gjv.this.hnj)) {
                        return;
                    }
                    gjv.this.dse.hnj(wu.hnj(oj.hnj(), "tt_list_end_tip"));
                }
            });
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private void m17do() {
        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.hn.hnj(gjv.this.hnj)) {
                    return;
                }
                gjv.this.orl.set(false);
                if (!gjv.this.f24do) {
                    gjv.this.dse.hnj(wu.hnj(oj.hnj(), "tt_list_end_tip"));
                } else {
                    gjv.this.dse.hnj("");
                    gjv.this.as();
                }
            }
        });
    }

    private int eum() {
        if (!this.f24do || this.dse.qor() || this.orl.get() || this.xad) {
            return 0;
        }
        int iHnj = hnj(this.nyv, this.dse.gjv(), 1073741823);
        this.dse.hnj(this.nyv, iHnj);
        if (this.nyv < 0) {
            this.dkl.v1(iHnj);
            return iHnj;
        }
        this.nyv = iHnj;
        return iHnj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tu() {
        com.bytedance.sdk.openadsdk.activity.single.sk skVar = this.fvt;
        if (skVar == null || !skVar.as()) {
            this.gjv.dse();
            return;
        }
        hn(this.fvt);
        this.dnm.removeView(this.dkl);
        this.ojm.setVisibility(8);
        this.f13148oj.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wu() {
        if (this.orl.compareAndSet(false, true)) {
            AdSlot adSlotAip = this.f13205hn.aip();
            xyo xyoVar = new xyo();
            xyoVar.dkl = true;
            if (this.f13205hn.zd() != null || this.f13205hn.vk() != null) {
                xyoVar.ojm = 2;
            }
            xyoVar.dse = this.f13144ff;
            this.dse.hnj(wu.hnj(this.hnj, "tt_loading_more"));
            oj.qor().hnj(adSlotAip, xyoVar, this.f13205hn.xf(), new com.bytedance.sdk.openadsdk.core.wu() { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.17
                @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
                public void hnj(int i10, String str) {
                    gjv.this.hnj(i10, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
                public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar) {
                    gjv.this.hnj(hnjVar, qorVar);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    /* JADX INFO: renamed from: apu, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.activity.single.hnj orl() {
        RecyclerView.g0 g0VarE0 = this.dkl.e0(this.nyv + 1);
        if (!(g0VarE0 instanceof hn)) {
            return null;
        }
        aq aqVarHnj = ((hn) g0VarE0).hnj();
        if (aqVarHnj instanceof com.bytedance.sdk.openadsdk.activity.single.hnj) {
            return (com.bytedance.sdk.openadsdk.activity.single.hnj) aqVarHnj;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public int aq() {
        return this.f13152ul;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public aq dnm() {
        return this.pty;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public List<as> fc() {
        return this.dse.sk();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void jip() {
        if (this.rmr) {
            return;
        }
        this.rmr = true;
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.lu;
        long jCurrentTimeMillis = System.currentTimeMillis();
        as asVar = this.f13205hn;
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(jCurrentTimeMillis, asVar, asVar.sk(), "first_ad_loaded", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.10
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", jElapsedRealtime);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public boolean sk() {
        return this.hqh;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public int ta() {
        return this.mjg.size();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void uua() {
        super.uua();
        this.f13146gn = true;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.gjv$gjv, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0198gjv {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public as f13169hn;
        public int hnj = 0;
        public String qor;

        public C0198gjv(as asVar) {
            this.f13169hn = asVar;
        }

        public C0198gjv(String str) {
            this.qor = str;
        }
    }

    private void hn(aq aqVar) {
        ArrayList<aq> arrayListHn = this.dse.hn();
        int size = arrayListHn.size();
        int i10 = 0;
        while (i10 < size) {
            aq aqVar2 = arrayListHn.get(i10);
            i10++;
            aq aqVar3 = aqVar2;
            if (aqVar3 != aqVar) {
                aqVar3.hnj(this.pty, aqVar, this.f13145gm);
            }
        }
        com.bytedance.sdk.openadsdk.activity.single.sk skVar = this.fvt;
        if (skVar != null && skVar != aqVar) {
            skVar.hnj(this.pty, aqVar, this.f13145gm);
        }
        aq aqVar4 = this.pty;
        this.pty = aqVar;
        if (aqVar4 != null) {
            aqVar4.bug = false;
            aqVar4.mjg();
            aqVar4.gjv();
        }
        aqVar.bug = true;
        aqVar.hn(this.hnj, new com.bytedance.sdk.openadsdk.activity.single.hn.sk(1, null));
        com.bytedance.sdk.openadsdk.component.reward.view.aq aqVarHnj = aqVar.hnj();
        if (aqVarHnj.getVisibility() != 0) {
            aqVarHnj.setVisibility(0);
        }
        if (aqVarHnj.getParent() == null) {
            this.dnm.addView(aqVarHnj, new FrameLayout.LayoutParams(-1, -1));
        }
        this.gjv.hn(aqVar);
        if (aqVar.f_() != this.hqh) {
            aqVar.hnj("card_sync");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor(aq aqVar) {
        aq aqVar2 = this.pty;
        if (aqVar != aqVar2) {
            return;
        }
        if (this.orp) {
            if (this.nyv < this.dse.hnj() - 1) {
                int i10 = this.nyv + 1;
                this.jbd = i10;
                if (this.f13143fc) {
                    this.dkl.E1(i10);
                } else {
                    hn(i10);
                }
            } else {
                this.jbd = 0;
                this.dkl.v1(0);
                this.dkl.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.utils.hn.hnj(gjv.this.hnj)) {
                            return;
                        }
                        gjv gjvVar = gjv.this;
                        gjvVar.hnj(gjvVar.jbd, true);
                    }
                });
            }
        } else if (this.mkl) {
            aqVar2.qor();
        } else {
            aqVar2.fvt();
        }
        this.izk = null;
        this.mkl = false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public boolean gjv() {
        return this.fvt != null;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj extends RecyclerView.h {
        private boolean gjv;
        private final gjv qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private boolean f13172sk;
        private final ArrayList<C0198gjv> hnj = new ArrayList<>();

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final ArrayList<aq> f13171hn = new ArrayList<>();

        public hnj(gjv gjvVar, List<as> list) {
            this.qor = gjvVar;
            for (int i10 = 0; i10 < list.size(); i10++) {
                as asVar = list.get(i10);
                if (asVar != null && gjvVar != null) {
                    asVar.orp(gjvVar.f13206sk);
                }
                this.hnj.add(new C0198gjv(asVar));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (this.f13172sk) {
                return Integer.MAX_VALUE;
            }
            return this.hnj.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i10) {
            C0198gjv c0198gjv = this.hnj.get(i10 % this.hnj.size());
            if (c0198gjv.hnj != 0) {
                return -1;
            }
            gm gmVarVk = c0198gjv.f13169hn.vk();
            if (gmVarVk == null) {
                return 1;
            }
            return (gmVarVk.hnj() + gmVarVk.hn()).hashCode();
        }

        public int gjv() {
            return this.gjv ? this.hnj.size() - 1 : this.hnj.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
        public void onViewDetachedFromWindow(sk skVar) {
            com.bytedance.sdk.openadsdk.activity.single.hnj hnjVar;
            super.onViewDetachedFromWindow(skVar);
            if (!(skVar instanceof hn) || (hnjVar = ((hn) skVar).qor) == null) {
                return;
            }
            hnjVar.mo16do().eum.pnz();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public sk onCreateViewHolder(ViewGroup viewGroup, int i10) {
            if (i10 == -1) {
                com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(viewGroup.getContext());
                qorVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return new qor(qorVar);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.hn hnVar = new com.bytedance.sdk.openadsdk.component.reward.view.hn(viewGroup.getContext(), this.qor.jip, this.qor.f13143fc, sq.hn(viewGroup.getContext(), 10.0f));
            hnVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return new hn(this, hnVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: qor, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(sk skVar) {
            super.onViewRecycled(skVar);
            if (skVar instanceof hn) {
                hn hnVar = (hn) skVar;
                com.bytedance.sdk.openadsdk.activity.single.hnj hnjVar = hnVar.qor;
                if (!this.qor.apu) {
                    hnj(hnVar, false);
                    return;
                }
                boolean zHn = hn(hnjVar);
                if (hnjVar != null) {
                    hnj(hnVar, zHn);
                }
            }
        }

        public List<as> sk() {
            ArrayList arrayList = new ArrayList();
            ArrayList<C0198gjv> arrayList2 = this.hnj;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                C0198gjv c0198gjv = arrayList2.get(i10);
                i10++;
                C0198gjv c0198gjv2 = c0198gjv;
                if (c0198gjv2.hnj == 0) {
                    arrayList.add(c0198gjv2.f13169hn);
                }
            }
            return arrayList;
        }

        private boolean hn(aq aqVar) {
            return aqVar != null && aqVar.pty();
        }

        public ArrayList<aq> hn() {
            return this.f13171hn;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(sk skVar, int i10) {
            if (i10 >= this.hnj.size()) {
                i10 %= this.hnj.size();
            }
            skVar.hnj(this.qor, this.hnj.get(i10), i10);
        }

        public boolean qor() {
            return this.f13172sk;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public void onViewAttachedToWindow(sk skVar) {
            super.onViewAttachedToWindow(skVar);
        }

        public int hnj() {
            int itemCount = getItemCount();
            return this.gjv ? itemCount - 1 : itemCount;
        }

        public void hnj(String str) {
            int size = this.hnj.size();
            C0198gjv c0198gjv = size > 0 ? this.hnj.get(size - 1) : null;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            if (c0198gjv == null || c0198gjv.hnj != 1) {
                if (zIsEmpty) {
                    return;
                }
                this.hnj.add(new C0198gjv(str));
                notifyItemInserted(size);
                this.gjv = true;
                return;
            }
            if (!zIsEmpty) {
                c0198gjv.qor = str;
                notifyItemChanged(size - 1);
            } else {
                this.hnj.remove(c0198gjv);
                notifyItemRemoved(size - 1);
                this.gjv = false;
            }
        }

        public void hnj(aq aqVar) {
            this.f13171hn.add(aqVar);
        }

        public void hnj(List<as> list) {
            gjv gjvVar;
            int size = this.hnj.size();
            if (this.gjv) {
                size--;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                as asVar = list.get(i10);
                if (asVar != null && (gjvVar = this.qor) != null) {
                    asVar.orp(gjvVar.f13206sk);
                }
                this.hnj.add(size + i10, new C0198gjv(asVar));
                asVar.res();
            }
            notifyItemRangeInserted(size, list.size());
        }

        public void hnj(int i10, int i11) {
            if (this.f13172sk) {
                return;
            }
            this.f13172sk = true;
            if (i10 < 0) {
                i10 = 0;
            }
            int size = this.hnj.size();
            notifyItemRangeInserted(size, (Integer.MAX_VALUE - i11) - (size - i10));
            notifyItemRangeInserted(0, i11 - i10);
        }

        public void hnj(hn hnVar, boolean z10) {
            if (hnVar.qor == null) {
                return;
            }
            this.f13171hn.remove(hnVar.qor);
            hnVar.hnj(z10);
        }
    }

    private static int hnj(int i10, int i11, int i12) {
        if (i10 < 0) {
            i10 = 0;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i12 + i13;
            if (i14 % i11 == i10) {
                return i14;
            }
            int i15 = i12 - i13;
            if (i15 % i11 == i10) {
                return i15;
            }
        }
        return i12;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(Bundle bundle) {
        super.hnj(bundle);
        hqh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(int i10, String str) {
        this.xad = false;
        m17do();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar) {
        this.xad = false;
        if (hnjVar.gjv() != null && !hnjVar.gjv().isEmpty()) {
            hnj(hnjVar);
            return;
        }
        qorVar.hnj(-3);
        qorVar.qor(1);
        com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar);
        m17do();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void qor() {
        super.qor();
        this.zt = true;
        aq aqVar = this.pty;
        if (aqVar != null) {
            aqVar.mjg();
        }
        ua();
        this.mkl = this.izk != null;
        this.f13150ta.removeMessages(3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hn(Activity activity) {
        super.hn(activity);
        sq.hnj(activity);
    }

    private void hn(int i10) {
        RecyclerView.g0 g0VarE0;
        int iFindFirstVisibleItemPosition = this.aq.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.aq.findLastVisibleItemPosition();
        if (i10 < iFindFirstVisibleItemPosition) {
            this.dkl.E1(i10);
            return;
        }
        if (i10 <= iFindLastVisibleItemPosition) {
            int i11 = i10 - iFindFirstVisibleItemPosition;
            int childCount = this.dkl.getChildCount();
            if (i11 <= 0 || i11 >= childCount || (g0VarE0 = this.dkl.e0(i10 - 1)) == null) {
                return;
            }
            this.dkl.A1(0, g0VarE0.itemView.getBottom());
            return;
        }
        this.dkl.E1(this.jbd);
    }

    private void hnj(final com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        tu tuVarTa = hnjVar.ta();
        if (tuVarTa != null) {
            this.f13144ff = tuVarTa.bug();
            this.xad = tuVarTa.orl();
        }
        if (!this.f13143fc) {
            for (as asVar : hnjVar.gjv()) {
                if (asVar.pwt() != null && as.sk(asVar)) {
                    com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVarHnj = as.hnj(CacheDirFactory.getICacheDir(asVar.gkx()).hnj(), asVar);
                    hnVarHnj.hnj("material_meta", asVar);
                    hnVarHnj.hnj("ad_slot", asVar.aip());
                    com.bytedance.sdk.openadsdk.core.mjg.sk.hnj.hnj(hnVarHnj, new a7.a() { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.2
                        @Override // a7.b.a
                        public void hnj(c cVar, int i10) {
                        }

                        @Override // a7.b.a
                        public void hnj(c cVar, int i10, String str) {
                        }
                    });
                }
            }
        }
        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.hn.hnj(gjv.this.hnj)) {
                    return;
                }
                gjv.this.orl.set(false);
                gjv.this.dse.hnj("");
                gjv.this.dse.hnj(hnjVar.gjv());
                gjv.this.as();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hn() {
        super.hn();
        int i10 = 0;
        this.zt = false;
        this.f13146gn = false;
        aq aqVar = this.pty;
        if (aqVar != null && !this.mkl) {
            aqVar.qor();
        }
        if (this.lu == 0) {
            this.lu = SystemClock.elapsedRealtime();
        }
        ul();
        vf();
        ArrayList<Message> arrayList = this.f13154xn;
        int size = arrayList.size();
        while (i10 < size) {
            Message message = arrayList.get(i10);
            i10++;
            handleMessage(message);
        }
        this.f13154xn.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(int i10, boolean z10) {
        int i11;
        RecyclerView.g0 g0VarE0 = this.dkl.e0(i10);
        if (g0VarE0 == null || !(g0VarE0 instanceof hn) || (i11 = this.nyv) == i10) {
            return;
        }
        hnj(i11, i10, z10);
        this.nyv = i10;
        this.f13155xo = SystemClock.elapsedRealtime();
        aq aqVarHnj = ((hn) g0VarE0).hnj();
        if (aqVarHnj == null) {
            return;
        }
        hn(aqVarHnj);
        this.mjg.add(aqVarHnj.dkl.pv());
        if (this.xad && this.tu > 0 && this.nyv >= this.dse.hnj() - this.tu) {
            wu();
        }
        com.bytedance.sdk.openadsdk.activity.single.hnj hnjVarOrl = orl();
        if (hnjVarOrl != null) {
            if (!this.f13143fc && this.aq.findLastVisibleItemPosition() >= this.nyv + 1) {
                hnjVarOrl.sk(true);
            }
            this.uua.add(Integer.valueOf(this.nyv + 1));
            hnjVarOrl.tgn();
            this.eta = false;
            return;
        }
        this.eta = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hn(aq aqVar, int i10) {
        aq aqVar2 = this.pty;
        if (aqVar != aqVar2) {
            return;
        }
        if (i10 == 2) {
            ua();
            return;
        }
        if (i10 == 1) {
            if (gm()) {
                aq aqVar3 = this.pty;
                if (aqVar3 instanceof com.bytedance.sdk.openadsdk.activity.single.hnj) {
                    ((com.bytedance.sdk.openadsdk.activity.single.hnj) aqVar3).vf();
                    return;
                }
                return;
            }
            ul();
            return;
        }
        if (i10 == 3 || i10 == 4) {
            try {
                aqVar2.mo16do().eum.gm();
            } catch (Throwable th2) {
                apu.qor("CardsLayoutManager", th2);
            }
        }
    }

    private void hnj(int i10, int i11, boolean z10) {
        String str;
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return;
        }
        if (z10) {
            str = "auto_down";
        } else {
            str = i11 > i10 ? "down" : "up";
        }
        final String str2 = str;
        final long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.f13155xo) / 1000;
        List<as> listSk = this.dse.sk();
        final int size = i10 % listSk.size();
        final int size2 = i11 % listSk.size();
        as asVar = listSk.get(size);
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVar, asVar.sk(), "slide", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.5
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("from", size + 1);
                    jSONObject.put("to", size2 + 1);
                    jSONObject.put("direction", str2);
                    jSONObject.put("click_user_remaining", jElapsedRealtime);
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(final aq aqVar, aq aqVar2, com.bytedance.sdk.openadsdk.activity.single.hn.sk skVar) {
        long jGjv;
        if (aqVar != this.pty) {
            return;
        }
        if (aqVar.tu() || hqh.hn(aqVar.dkl)) {
            jGjv = 500;
        } else {
            tgn tgnVarJlw = aqVar.dkl.jlw();
            jGjv = tgnVarJlw != null ? ((long) tgnVarJlw.gjv()) * 1000 : 0L;
        }
        dkl dklVar = this.izk;
        if (dklVar != null) {
            dklVar.gjv();
        }
        dkl dklVar2 = new dkl(Math.max(500L, jGjv)) { // from class: com.bytedance.sdk.openadsdk.activity.single.gjv.6
            @Override // com.bytedance.sdk.openadsdk.activity.single.gjv.dkl
            public void hnj() {
                if (com.bytedance.sdk.component.utils.hn.hnj(gjv.this.hnj)) {
                    return;
                }
                gjv.this.qor(aqVar);
            }
        };
        this.izk = dklVar2;
        dklVar2.sk();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(boolean z10) {
        super.hnj(z10);
        aq aqVar = this.pty;
        if (aqVar != null) {
            aqVar.qor(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public boolean hnj(aq aqVar, int i10) {
        com.bytedance.sdk.openadsdk.activity.single.sk skVar = this.fvt;
        return skVar != null && skVar == aqVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(View view) {
        super.hnj(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.dnm.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(Activity activity) {
        super.hnj(activity);
        aq aqVar = this.pty;
        if (aqVar != null) {
            aqVar.hn(activity);
        }
        com.bytedance.sdk.openadsdk.activity.single.sk skVar = this.fvt;
        if (skVar != null) {
            skVar.xn();
        }
        ArrayList<aq> arrayListHn = this.dse.hn();
        int size = arrayListHn.size();
        int i10 = 0;
        while (i10 < size) {
            aq aqVar2 = arrayListHn.get(i10);
            i10++;
            aqVar2.xn();
        }
        this.f13150ta.removeCallbacksAndMessages(null);
        dkl dklVar = this.izk;
        if (dklVar != null) {
            dklVar.gjv();
            this.izk = null;
        }
        aq aqVar3 = this.pty;
        if (aqVar3 == null || aqVar3.wu() || this.f13205hn.era()) {
            return;
        }
        fc.hn().post(new com.bytedance.sdk.openadsdk.activity.single.hn.qor(this.f13205hn));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(Map<String, Object> map, aq aqVar, float f10, float f11) {
        Object jSONObject = map.get("pag_json_data");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject instanceof JSONObject) {
            try {
                com.bytedance.sdk.openadsdk.component.reward.view.aq aqVarHnj = aqVar.hnj();
                ((JSONObject) jSONObject).put("width", aqVarHnj.getWidth());
                ((JSONObject) jSONObject).put("height", aqVarHnj.getHeight());
                int i10 = aqVar.f13131ta;
                ((JSONObject) jSONObject).put("click_feed_top", i10 == this.aq.findFirstVisibleItemPosition() ? 1 : 0);
                ((JSONObject) jSONObject).put("click_on_final", i10 == this.dse.gjv() ? 1 : 0);
                ((JSONObject) jSONObject).put("click_countdown_remaining", this.f13152ul);
                ((JSONObject) jSONObject).put("click_user_remaining", i10 == this.nyv ? (SystemClock.elapsedRealtime() - this.f13155xo) / 1000 : 0L);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }
}
