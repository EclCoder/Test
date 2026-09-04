package com.bytedance.sdk.openadsdk.core.mjg.hn;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.oj;
import com.bytedance.sdk.component.utils.ojm;
import com.bytedance.sdk.component.utils.tgn;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.ojm.Cdo;
import com.bytedance.sdk.openadsdk.gjv.dse;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.fc;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import u6.b;
import x6.a;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj {

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private WeakReference<c.a> f13811cm;
    private WeakReference<hnj> dzo;
    private final b.a eta;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private final boolean f13812ff;
    private long fvt;
    private final tgn.hnj izk;
    private final boolean jbd;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    private final Runnable f13813ka;
    private boolean lhi;
    private hn lu;
    private int mkl;
    private final boolean orp;
    private int pnz;
    private int pv;
    private int rmr;
    private final String sq;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private long f13814ua;
    private boolean xad;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    private dse f13815xo;
    private int zt;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void dkl();

        void hnj(int i10);
    }

    public qor(Context context, ViewGroup viewGroup, as asVar, String str, boolean z10, boolean z11, boolean z12, dse dseVar) {
        super(context, asVar, viewGroup);
        this.f13814ua = 0L;
        this.fvt = 0L;
        this.xad = true;
        this.pnz = 0;
        this.pv = 0;
        this.eta = new b.a() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.1
            @Override // u6.b.a
            public void gjv(b bVar) {
                com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
                com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).aq.fvx();
                if (gjvVarFvx != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
                    gjvVarHnj.hn(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).ojm);
                }
                com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).aq, 3);
                if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13842vf != null) {
                    ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13842vf.hnj(0);
                }
            }

            @Override // u6.b.a
            public void hn(b bVar) {
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).qor.removeCallbacks(qor.this.f13813ka);
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (qor.this.f13811cm != null && qor.this.f13811cm.get() != null) {
                            qor.this.f13811cm.get();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse != null) {
                            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse.hn();
                        }
                    }
                });
                if (qor.this.orp) {
                    return;
                }
                qor qorVar = qor.this;
                qorVar.hnj(qorVar.f13815xo);
            }

            @Override // u6.b.a
            public void hnj(b bVar) {
                com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).aq, 5);
                            com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).aq, 5);
                            if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13842vf != null) {
                                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13842vf.hnj(9);
                            }
                        } catch (Exception unused) {
                        }
                        qor.this.jbd();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).aq.fvx();
                if (gjvVarFvx == null || (gjvVarHnj = gjvVarFvx.hnj()) == null) {
                    return;
                }
                gjvVarHnj.gjv(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).ojm);
            }

            @Override // u6.b.a
            public void sk(b bVar) {
                com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
                com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).aq.fvx();
                if (gjvVarFvx != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
                    gjvVarHnj.qor(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).ojm);
                }
                if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13842vf != null) {
                    ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13842vf.hnj(1);
                }
            }

            @Override // u6.b.a
            public void hn(b bVar, int i10) {
            }

            @Override // u6.b.a
            public void hnj(b bVar, long j10) {
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f39do = false;
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).qor.removeCallbacks(qor.this.f13813ka);
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse != null) {
                            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse.hn();
                        }
                        if (!((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13834fc || qor.this.dzo == null || qor.this.dzo.get() == null) {
                            return;
                        }
                        ((hnj) qor.this.dzo.get()).dkl();
                    }
                });
                qor.this.ul();
                com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).aq, 0);
                if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13842vf != null) {
                    ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13842vf.qor();
                }
                qor qorVar = qor.this;
                qorVar.hnj(qorVar.f13815xo);
            }

            @Override // u6.b.a
            public void hnj(b bVar, final com.bykv.vk.openvk.hnj.hnj.hnj.qor.b bVar2) {
                com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
                String unused = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).hnj;
                bVar2.b();
                bVar2.a();
                bVar2.d();
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        int iB = bVar2.b();
                        int iA = bVar2.a();
                        if (!qor.this.xyo() || iA == -1004) {
                            if (qor.this.gjv(iB, iA)) {
                                String unused2 = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).hnj;
                                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).aq, (WeakReference<Context>) null, false);
                                qor.this.hn(true);
                                qor.this.sk();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse != null) {
                                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse.hn();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).xyo != null) {
                                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).xyo.hn(qor.this.fvt, p6.b.a(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).ojm, ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13835gm));
                            }
                            if (qor.this.f13811cm == null || qor.this.f13811cm.get() == null || qor.this.xyo()) {
                                return;
                            }
                            ((c.a) qor.this.f13811cm.get()).hnj(iB, iA);
                        }
                    }
                });
                qor.this.hnj(bVar2);
                com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).aq.fvx();
                if (gjvVarFvx != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
                    gjvVarHnj.hnj(com.bytedance.sdk.openadsdk.core.orl.hnj.hnj.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).aq, 6);
                com.bytedance.sdk.openadsdk.p000do.hnj.qor.hn(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).aq);
                if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13842vf != null) {
                    ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13842vf.hnj(14);
                }
            }

            @Override // u6.b.a
            public void hnj(b bVar, boolean z13) {
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse != null) {
                            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse.hn();
                        }
                    }
                });
            }

            @Override // u6.b.a
            public void qor(b bVar) {
            }

            @Override // u6.b.a
            public void hnj(b bVar, int i10, int i11) {
                ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        qor.this.xad();
                    }
                });
            }

            @Override // u6.b.a
            public void hnj(b bVar, int i10, int i11, int i12) {
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f39do = true;
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse != null) {
                            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse.uua();
                            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).qor.postDelayed(qor.this.f13813ka, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).aq, 2);
                if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13842vf != null) {
                    ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13842vf.hnj(4);
                }
            }

            @Override // u6.b.a
            public void hnj(b bVar, int i10) {
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f39do = false;
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).qor.removeCallbacks(qor.this.f13813ka);
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse.hn();
                    }
                });
                com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).aq, 0);
                if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13842vf != null) {
                    ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).f13842vf.hnj(5);
                }
            }

            @Override // u6.b.a
            public void hnj(b bVar, final long j10, final long j11) {
                if (Math.abs(j10 - ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).ojm) < 50) {
                    return;
                }
                qor qorVar = qor.this;
                qorVar.hnj(qorVar.f13815xo);
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        qor.this.hnj(j10, j11);
                        qor.this.hn(j10, j11);
                    }
                });
            }
        };
        this.zt = 0;
        this.f13813ka = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.4
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse != null) {
                    ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).aq, (WeakReference<Context>) null, false);
                    ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse.hn();
                    qor.this.hn(true);
                    String unused = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).hnj;
                }
            }
        };
        this.izk = new tgn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.6
            @Override // com.bytedance.sdk.component.utils.tgn.hnj
            public void hnj(Context context2, Intent intent, boolean z13, final int i10) {
                ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        qor.this.dkl(i10);
                    }
                });
            }
        };
        this.lhi = false;
        this.mkl = oj.qor(context);
        hnj(z10);
        this.sq = str;
        try {
            this.pnz = viewGroup.getWidth();
            this.pv = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        hnj(context);
        this.orp = true;
        this.jbd = z11;
        this.f13812ff = z12;
        if (dseVar != null) {
            this.f13815xo = dseVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean gjv(int i10, int i11) {
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v6.c cm() {
        sk skVar;
        if (this.dnm.getResources().getConfiguration().orientation != 1 || (skVar = this.dse) == null) {
            return null;
        }
        return skVar.orl();
    }

    private void ff() {
        com.bytedance.sdk.openadsdk.core.mjg.gjv.qor qorVar = this.dkl;
        if (qorVar != null) {
            if (!qorVar.dse()) {
                this.dkl.hnj(false, this.ojm, this.jip);
            } else if (this.orl) {
                apu();
            } else {
                hn(this.f13841ul);
            }
        }
        if (this.apu.get()) {
            vf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jbd() {
        this.zt++;
        sk skVar = this.dse;
        if (skVar == null) {
            return;
        }
        skVar.hn();
        c.InterfaceC0870c interfaceC0870c = this.xyo;
        if (interfaceC0870c != null) {
            interfaceC0870c.hnj(this.fvt, p6.b.a(this.ojm, this.f13835gm));
        }
        this.fvt = System.currentTimeMillis() - this.f13814ua;
        if (this.xad) {
            this.dse.hnj(this.aq, (WeakReference<Context>) null, true);
        }
        if (!this.eum) {
            this.eum = true;
            long j10 = this.f13835gm;
            hn(j10, j10);
            long j11 = this.f13835gm;
            this.ojm = j11;
            this.f13839ta = j11;
            hn(this.f13815xo);
        }
        if (!this.f13834fc && this.f13843xn) {
            sk(this.dse, null);
        }
        this.mjg = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xad() {
        com.bytedance.sdk.openadsdk.core.mjg.gjv.qor qorVar;
        int i10;
        int i11;
        try {
            if (cm() != null && (qorVar = this.dkl) != null && this.tu != null) {
                int iGjv = qorVar.gjv();
                int iSk = this.dkl.sk();
                final int width = this.tu.getWidth();
                final int height = this.tu.getHeight();
                if (width > 0 && height > 0 && iSk > 0 && iGjv > 0) {
                    if (iGjv == iSk) {
                        i11 = width > height ? height : width;
                        i10 = i11;
                    } else if (iGjv > iSk) {
                        i11 = (int) ((((double) width) * 1.0d) / ((double) ((iGjv * 1.0f) / iSk)));
                        i10 = width;
                    } else {
                        i10 = (int) ((((double) height) * 1.0d) / ((double) ((iSk * 1.0f) / iGjv)));
                        i11 = height;
                    }
                    if (i11 <= height && i11 > 0) {
                        height = i11;
                    }
                    if (i10 <= width && i10 > 0) {
                        width = i10;
                    }
                    this.qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.5
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (qor.this.cm() instanceof TextureView) {
                                    ((TextureView) qor.this.cm()).setLayoutParams(layoutParams);
                                    String unused = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).hnj;
                                } else if (qor.this.cm() instanceof SurfaceView) {
                                    ((SurfaceView) qor.this.cm()).setLayoutParams(layoutParams);
                                    String unused2 = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).hnj;
                                }
                            } catch (Throwable unused3) {
                                String unused4 = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).hnj;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            Objects.toString(this.dnm);
            Objects.toString(cm());
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public void dkl(boolean z10) {
        this.xad = z10;
    }

    public void dse(boolean z10) {
        sk skVar = this.dse;
        if (skVar != null) {
            skVar.hnj();
        }
        sk skVar2 = this.dse;
        if (skVar2 != null && z10) {
            skVar2.oj();
        }
        ff();
    }

    public void fvt() {
        com.bytedance.sdk.openadsdk.core.orl.dkl dklVar = this.f13842vf;
        if (dklVar != null) {
            dklVar.hnj(13);
        }
    }

    public void jip() {
        if (this.lhi || !this.wu) {
            return;
        }
        Context applicationContext = com.bytedance.sdk.openadsdk.core.oj.hnj().getApplicationContext();
        this.lhi = true;
        tgn.hnj(this.izk, applicationContext);
    }

    public void orp() {
        if (this.dkl != null) {
            hn(false);
            nyv();
            this.apu.set(false);
            this.eum = false;
            hnj(this.f13815xo);
            this.dkl.ojm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj, x6.c
    public void sk() {
        com.bytedance.sdk.openadsdk.core.mjg.gjv.qor qorVar = this.dkl;
        if (qorVar != null) {
            qorVar.bug();
            this.dkl = null;
        }
        if (this.xad) {
            if ("embeded_ad".equals(this.sq)) {
                this.dse.apu();
            } else {
                this.dse.hnj(this.aq, (WeakReference<Context>) null, true);
            }
            this.qor.removeCallbacksAndMessages(null);
            this.bug.clear();
            if (this.f13834fc) {
                ua();
            }
        }
    }

    public int sq() {
        return this.rmr;
    }

    public void ua() {
        if (this.lhi && this.wu) {
            this.lhi = false;
            tgn.hnj(this.izk);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dkl(int i10) {
        sk(i10);
        if (i10 == 4) {
            this.uua = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj, x6.c
    public void gjv() {
        hnj(true, 3);
    }

    private void qor(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        cVar.gjv(0);
        this.dkl.hnj(cVar);
        this.f13814ua = System.currentTimeMillis();
        this.dse.qor(8);
        this.dse.qor(0);
        hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dkl == null) {
                    return;
                }
                qor.this.f13814ua = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dse.gjv(0);
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).dkl.hnj(true, ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).ojm, ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) qor.this).jip);
            }
        });
        if (this.f13834fc) {
            jip();
        }
    }

    public void gjv(int i10) {
        this.rmr = i10;
    }

    public void hn(int i10, int i11) {
        hnj(i10, i11);
        sk skVar = this.dse;
        if (skVar == null || i10 <= 0 || i11 <= 0) {
            return;
        }
        skVar.qor(i10, i11);
        this.dse.hnj(i10, i11);
        xad();
    }

    public void hnj(final dkl.hnj hnjVar) {
        sk skVar;
        if (!this.f13834fc || (skVar = this.dse) == null) {
            return;
        }
        skVar.hnj(new dkl.hnj() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.qor.2
            @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.hnj
            public void hnj(View view, int i10) {
                dkl.hnj hnjVar2 = hnjVar;
                if (hnjVar2 != null) {
                    hnjVar2.hnj(view, i10);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(long j10, long j11) {
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        this.aq.gjv(j10);
        this.ojm = j10;
        this.f13835gm = j11;
        this.dse.hnj(j10, j11);
        this.dse.hnj(p6.b.a(j10, j11));
        try {
            c.InterfaceC0870c interfaceC0870c = this.xyo;
            if (interfaceC0870c != null) {
                interfaceC0870c.hnj(j10, j11);
            }
        } catch (Throwable th2) {
            apu.hnj(this.hnj, "onProgressUpdate error: ", th2);
        }
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = this.aq.fvx();
        if (gjvVarFvx == null || (gjvVarHnj = gjvVarFvx.hnj()) == null) {
            return;
        }
        gjvVarHnj.hnj(j10, j11, this.f13842vf);
    }

    public void hnj(PAGNativeAd pAGNativeAd) {
        sk skVar;
        if (!this.f13834fc || (skVar = this.dse) == null) {
            return;
        }
        skVar.hnj(pAGNativeAd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj, x6.c
    public void qor() {
        sk skVar = this.dse;
        if (skVar != null) {
            skVar.hnj();
        }
        sk skVar2 = this.dse;
        if (skVar2 != null) {
            skVar2.oj();
        }
        ff();
    }

    private void sk(int i10) {
        if (this.mkl == i10) {
            return;
        }
        this.mkl = i10;
        if (i10 != 4 && i10 != 0) {
            this.f13837oj = false;
        }
        if (!this.f13837oj && !orl() && this.jbd) {
            qor(2, i10);
        }
        WeakReference<hnj> weakReference = this.dzo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.dzo.get().hnj(this.mkl);
    }

    public void hnj(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        this.pnz = i10;
        this.pv = i11;
    }

    public void hnj(hn hnVar) {
        this.lu = hnVar;
    }

    private void hnj(Context context) {
        ViewGroup qorVar;
        qor qorVar2;
        if (this.f13834fc) {
            qorVar = new com.bytedance.sdk.openadsdk.fc.gjv(context);
        } else {
            qorVar = new com.bytedance.sdk.openadsdk.fc.qor(context);
        }
        ViewGroup viewGroup = qorVar;
        if (this.f13834fc) {
            qorVar2 = this;
            qorVar2.dse = new sk(context, viewGroup, true, 17, this.aq, qorVar2, wu());
        } else {
            qorVar2 = this;
            qorVar2.dse = new gjv(context, viewGroup, true, 17, qorVar2.aq, qorVar2, false);
        }
        qorVar2.dse.hnj(this);
    }

    private boolean qor(int i10, int i11) {
        if (i11 == 0) {
            hn();
            this.uua = true;
            sk skVar = this.dse;
            if (skVar != null) {
                skVar.hnj(this.aq, (WeakReference<Context>) null, false);
            }
        }
        if (i11 != 4 && i11 != 0) {
            sk skVar2 = this.dse;
            if (skVar2 != null) {
                skVar2.hnj();
            }
            hn();
            this.uua = true;
            this.f13837oj = false;
            sk skVar3 = this.dse;
            if (skVar3 != null) {
                return skVar3.hnj(i10, this.aq.pwt(), this.f13812ff);
            }
        } else if (i11 == 4) {
            this.uua = false;
            sk skVar4 = this.dse;
            if (skVar4 != null) {
                skVar4.fc();
            }
        }
        return true;
    }

    public com.bytedance.sdk.openadsdk.core.orl.dkl hnj(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.aq.da()) {
            return null;
        }
        if (this.f13842vf == null) {
            this.f13842vf = com.bytedance.sdk.openadsdk.core.orl.dkl.hnj();
        }
        this.f13842vf.hnj(view, this.aq);
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    Object obj = pair.second;
                    this.f13842vf.hnj((View) pair.first, obj == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) obj);
                }
            }
        }
        return this.f13842vf;
    }

    public void qor(int i10) {
        sk(i10);
        if (i10 == 4) {
            this.uua = false;
            qor();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj
    public void hnj(c.a aVar) {
        this.f13811cm = new WeakReference<>(aVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj, x6.c
    public void hnj() {
        com.bytedance.sdk.openadsdk.core.mjg.gjv.qor qorVar = this.dkl;
        if (qorVar != null) {
            qorVar.ojm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj, x6.c
    public boolean hnj(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        super.hnj(cVar);
        if (this.dkl != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(cVar.jip())) {
            return false;
        }
        hn(false);
        cVar.jip();
        cVar.hn(com.bytedance.sdk.openadsdk.as.sk.hnj("player_force_raw_url", 0) == 1);
        int i10 = this.rmr + 1;
        this.rmr = i10;
        cVar.f11664sk = i10;
        hn(cVar);
        nyv();
        com.bytedance.sdk.openadsdk.core.orl.dkl dklVar = this.f13842vf;
        if (dklVar != null) {
            dklVar.hnj(false, 0.0f);
        }
        if (!Cdo.hn(this.sq) || this.ojm <= 0) {
            this.ojm = cVar.ta();
        }
        if (Cdo.hn(this.sq) && this.ojm == this.f13835gm) {
            this.ojm = 0L;
        }
        if (cVar.ta() <= 0) {
            this.eum = false;
            this.apu.set(false);
        } else {
            long jTa = cVar.ta();
            this.ojm = jTa;
            this.f13839ta = Math.max(this.f13839ta, jTa);
        }
        sk skVar = this.dse;
        if (skVar != null) {
            skVar.hnj();
            if (this.zt == 0) {
                this.dse.dse();
            }
            this.dse.qor(cVar.aq(), cVar.ojm());
            this.dse.qor(this.tu);
            this.dse.hnj(cVar.aq(), cVar.ojm());
        }
        if (this.dkl == null) {
            com.bytedance.sdk.openadsdk.core.mjg.gjv.qor qorVar = new com.bytedance.sdk.openadsdk.core.mjg.gjv.qor();
            this.dkl = qorVar;
            qorVar.hnj(this.eta);
        }
        oj();
        this.fvt = 0L;
        try {
            qor(cVar);
            return true;
        } catch (Exception e10) {
            hnj(new com.bykv.vk.openvk.hnj.hnj.hnj.qor.b(-10, 0, e10.getMessage()));
            apu.qor(this.hnj, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e10)));
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj
    public void hnj(boolean z10, int i10) {
        if (!this.eum && this.apu.get()) {
            if (z10) {
                hnj(i10, false);
                this.eum = false;
            } else {
                hqh();
            }
        }
        sk();
        com.bytedance.sdk.openadsdk.core.orl.dkl dklVar = this.f13842vf;
        if (dklVar != null) {
            dklVar.gjv();
        }
    }

    public final void hnj(int i10, boolean z10) {
        if (z10 || this.pty) {
            if (z10) {
                this.pty = false;
            }
            if (this.eum || !this.apu.get()) {
                return;
            }
            fc.hnj hnjVar = new fc.hnj();
            hnjVar.hn(dkl());
            hnjVar.gjv(ojm());
            hnjVar.qor(dse());
            hnjVar.qor(i10);
            hnjVar.gjv(aq());
            com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(this.dse, hnjVar, this.f13815xo);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj, com.bytedance.sdk.openadsdk.core.mjg.hn.hnj
    public void hnj(a aVar, View view) {
        com.bytedance.sdk.openadsdk.core.mjg.gjv.qor qorVar = this.dkl;
        if (qorVar == null) {
            return;
        }
        if (qorVar.dkl()) {
            hn();
            this.dse.hn(true, false);
            this.dse.dkl();
            return;
        }
        if (!this.dkl.dse()) {
            sk skVar = this.dse;
            if (skVar != null) {
                skVar.qor(this.tu);
            }
            sk(this.ojm);
            sk skVar2 = this.dse;
            if (skVar2 != null) {
                skVar2.hn(false, false);
                return;
            }
            return;
        }
        dse(false);
        sk skVar3 = this.dse;
        if (skVar3 != null) {
            skVar3.hn(false, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj
    public void hnj(a aVar, View view, boolean z10) {
        qor(!this.f13843xn);
        if (this.dnm instanceof Activity) {
            sk skVar = this.dse;
            if (skVar != null) {
                skVar.hn(this.tu);
                this.dse.qor(false);
            }
            hnj(1);
            WeakReference<c.b> weakReference = this.tgn;
            c.b bVar = weakReference != null ? weakReference.get() : null;
            if (bVar != null) {
                bVar.hnj(this.f13843xn);
            }
        }
    }

    public void hnj(hnj hnjVar) {
        this.dzo = new WeakReference<>(hnjVar);
    }
}
