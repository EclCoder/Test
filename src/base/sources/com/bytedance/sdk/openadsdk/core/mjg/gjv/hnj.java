package com.bytedance.sdk.openadsdk.core.mjg.gjv;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.ojm;
import com.bytedance.sdk.openadsdk.component.reward.view.aq;
import com.bytedance.sdk.openadsdk.core.mjg.hn.sk;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.orl.dkl;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.fc.gjv;
import com.bytedance.sdk.openadsdk.gjv.dse;
import com.bytedance.sdk.openadsdk.utils.jbd;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p6.b;
import x6.a;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj {

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private final int f13778cm;
    private final AtomicBoolean dzo;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private long f13779ff;
    protected boolean fvt;
    private long jbd;
    final qor.hn orp;
    private boolean pnz;
    private final Runnable pv;
    private final dse sq;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    protected long f13780ua;
    private boolean xad;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    private InterfaceC0222hnj f13781xo;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0222hnj {
        void hnj(int i10);
    }

    public hnj(Context context, ViewGroup viewGroup, as asVar, dse dseVar) {
        super(context, asVar, viewGroup);
        this.jbd = 0L;
        this.f13779ff = 0L;
        this.xad = false;
        this.f13780ua = 0L;
        this.fvt = false;
        this.dzo = new AtomicBoolean(false);
        this.orp = new AnonymousClass1();
        this.pv = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).xyo != null) {
                    hnj.this.jip();
                    ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).xyo.hnj();
                }
            }
        };
        this.sq = dseVar;
        this.f13778cm = asVar.atw();
        if (asVar.da() && this.tu != null) {
            if (this.f13842vf == null) {
                this.f13842vf = dkl.hnj();
            }
            this.f13842vf.hnj(this.tu, asVar);
        }
        sk skVar = new sk(context.getApplicationContext(), new gjv(context), true, 17, this.aq, this);
        this.dse = skVar;
        skVar.hnj(this);
    }

    protected void jip() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj
    public boolean tu() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        int iLu;
        int i10 = this.as.dkl;
        if (i10 == 2 || i10 == 1) {
            iLu = oj.gjv().lu() * 1000;
        } else {
            iLu = i10 == 4 ? oj.gjv().ojm(String.valueOf(this.f13778cm)) : 5000;
        }
        this.qor.removeCallbacks(this.pv);
        this.qor.postDelayed(this.pv, iLu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dzo() {
        if (this.dse == null) {
            return;
        }
        this.qor.removeCallbacks(this.pv);
        this.dse.hn();
        this.f13779ff = System.currentTimeMillis() - this.jbd;
        if (!this.xad) {
            this.xad = true;
            long j10 = this.f13835gm;
            hn(j10, j10);
            long j11 = this.f13835gm;
            this.ojm = j11;
            this.f13839ta = j11;
            hn(this.sq);
        }
        c.InterfaceC0870c interfaceC0870c = this.xyo;
        if (interfaceC0870c != null) {
            interfaceC0870c.hnj(this.f13779ff, b.a(this.ojm, this.f13835gm));
        }
        this.mjg = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ff() {
        hn(this.sq);
        this.as.f11664sk = this.dkl.eum();
        nyv();
        this.apu.set(false);
        this.dzo.set(false);
        hnj(this.sq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pnz() {
        return this.aq.m34if() == 100.0f;
    }

    private boolean pv() {
        return orp() == null || this.dkl == null || (!com.bytedance.sdk.openadsdk.core.bug.sk.hnj(this.aq.rq()) ? this.aq.zd() != null : this.aq.vk() != null) || this.aq.vh() == 1;
    }

    private void xad() {
        this.dkl.qor(pty());
        this.dkl.hnj(this.as);
        this.jbd = System.currentTimeMillis();
        this.dse.qor(8);
        this.dse.qor(0);
        hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dkl == null) {
                    return;
                }
                hnj.this.jbd = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dse.gjv(0);
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dkl.hnj(true, ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).ojm, ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).jip);
            }
        });
    }

    public void dkl(boolean z10) {
        this.pnz = z10;
    }

    public void fvt() {
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        if (this.xad || !this.apu.get()) {
            return;
        }
        vf();
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = this.aq.fvx();
        if (gjvVarFvx == null || (gjvVarHnj = gjvVarFvx.hnj()) == null) {
            return;
        }
        gjvVarHnj.qor(dkl());
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj, x6.c
    public void gjv() {
        qor qorVar = this.dkl;
        if (qorVar == null) {
            return;
        }
        qorVar.bug();
        this.dkl = null;
        sk skVar = this.dse;
        if (skVar != null) {
            skVar.ojm();
        }
        this.qor.removeCallbacks(this.pv);
        this.qor.removeCallbacksAndMessages(null);
        dkl dklVar = this.f13842vf;
        if (dklVar != null) {
            dklVar.gjv();
        }
    }

    public void jbd() {
        dkl dklVar = this.f13842vf;
        if (dklVar != null) {
            dklVar.hnj(13);
        }
    }

    public v6.c orp() {
        sk skVar = this.dse;
        if (skVar != null) {
            return skVar.orl();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj, x6.c
    public void sk() {
        gjv();
    }

    public void sq() {
        dkl dklVar = this.f13842vf;
        if (dklVar != null) {
            dklVar.hnj(2);
        }
    }

    public void ua() {
        this.orp.hnj((u6.b) null, 0, 0);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class AnonymousClass1 implements qor.hn {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private boolean f13782hn = true;

        AnonymousClass1() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.qor.hn, u6.b.a
        public void gjv(u6.b bVar) {
            com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
            com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq.fvx();
            if (gjvVarFvx != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
                gjvVarHnj.hn(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).ojm);
            }
            com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq, 3);
            if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13842vf != null) {
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13842vf.hnj(0);
            }
            if (hnj.this.f13781xo != null) {
                hnj.this.f13781xo.hnj(2);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.qor.hn, u6.b.a
        public void hn(u6.b bVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).hnj;
            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).qor.removeCallbacks(hnj.this.pv);
            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.1.3
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dse != null) {
                        ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dse.hn();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.qor.hn, u6.b.a
        public void hnj(u6.b bVar) {
            com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
            if (hnj.this.dzo.compareAndSet(false, true)) {
                String unused = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).hnj;
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13842vf != null) {
                            try {
                                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13842vf.hnj(9);
                            } catch (Exception unused2) {
                            }
                        }
                        hnj.this.dzo();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq.fvx();
                if (gjvVarFvx != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
                    long jDkl = hnj.this.dkl();
                    gjvVarHnj.gjv(jDkl);
                    gjvVarHnj.sk(jDkl);
                }
                com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq, 5);
                com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq, 5);
                if (hnj.this.f13781xo != null) {
                    hnj.this.f13781xo.hnj(3);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.qor.hn, u6.b.a
        public void qor(u6.b bVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).hnj;
        }

        @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.qor.hn, u6.b.a
        public void sk(u6.b bVar) {
            com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq, 0);
            if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13842vf != null) {
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13842vf.hnj(1);
            }
            if (hnj.this.f13781xo != null) {
                hnj.this.f13781xo.hnj(1);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.qor.hn, u6.b.a
        public void hn(u6.b bVar, int i10) {
        }

        @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.qor.hn, u6.b.a
        public void hnj(u6.b bVar, long j10) {
            String unused = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).hnj;
            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f39do = false;
            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).qor.removeCallbacks(hnj.this.pv);
            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.1.2
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dse != null) {
                        ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dse.hn();
                    }
                }
            });
            if (!((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).apu.get()) {
                hnj hnjVar = hnj.this;
                hnjVar.f13780ua = j10;
                hnjVar.hnj(hnjVar.sq);
                hnj.this.ul();
            }
            if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13842vf != null) {
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13842vf.qor();
            }
            com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq, 0);
            if (hnj.this.f13781xo != null) {
                hnj.this.f13781xo.hnj(1);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.qor.hn, u6.b.a
        public void hnj(u6.b bVar, com.bykv.vk.openvk.hnj.hnj.hnj.qor.b bVar2) {
            com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
            String unused = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).hnj;
            bVar2.b();
            bVar2.a();
            bVar2.d();
            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).qor.removeCallbacks(hnj.this.pv);
            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.1.4
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dse != null) {
                        ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dse.hn();
                    }
                    if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).xyo != null) {
                        ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).xyo.hn(hnj.this.f13779ff, b.a(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).ojm, ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13835gm));
                    }
                }
            });
            hnj.this.hnj(bVar2);
            com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq, 6);
            com.bytedance.sdk.openadsdk.p000do.hnj.qor.hn(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq);
            if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13842vf != null) {
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13842vf.hnj(14);
            }
            if (hnj.this.f13781xo != null) {
                hnj.this.f13781xo.hnj(4);
            }
            com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq.fvx();
            if (gjvVarFvx == null || (gjvVarHnj = gjvVarFvx.hnj()) == null) {
                return;
            }
            gjvVarHnj.hnj(com.bytedance.sdk.openadsdk.core.orl.hnj.hnj.GENERAL_LINEAR_AD_ERROR);
        }

        @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.qor.hn, u6.b.a
        public void hnj(u6.b bVar, boolean z10) {
            String unused = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).hnj;
            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).qor.removeCallbacks(hnj.this.pv);
            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.1.5
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dse != null) {
                        ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dse.hn();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.qor.hn, u6.b.a
        public void hnj(u6.b bVar, int i10, int i11) {
            String unused = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).hnj;
            ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.1.6
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dkl == null) {
                        return;
                    }
                    try {
                        final float fGjv = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dkl.gjv();
                        final float fSk = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dkl.sk();
                        if (fGjv == 0.0f || fSk == 0.0f) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.1.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (!hnj.this.pnz()) {
                                    hnj.this.hnj(fGjv, fSk);
                                    return;
                                }
                                if (apu.hn(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq) || ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).as.dkl == 4) {
                                    hnj.this.hnj(true, fGjv, fSk);
                                    return;
                                }
                                if (apu.qor(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq)) {
                                    hnj.this.hnj(true, fGjv, fSk);
                                    return;
                                }
                                if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq.krm() == 3) {
                                    hnj.this.hnj(true, fGjv, fSk);
                                } else if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq.krm() == 0) {
                                    hnj.this.qor(fGjv, fSk);
                                } else {
                                    hnj.this.hn(fGjv, fSk);
                                }
                            }
                        });
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.apu.qor(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).hnj, th2.getMessage());
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.qor.hn, u6.b.a
        public void hnj(u6.b bVar, int i10, int i11, int i12) {
            String unused = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).hnj;
            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f39do = true;
            hnj.this.cm();
            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.1.7
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dse != null) {
                        ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dse.uua();
                    }
                }
            });
            com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq, 3);
            if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13842vf != null) {
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13842vf.hnj(4);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.qor.hn, u6.b.a
        public void hnj(u6.b bVar, int i10) {
            String unused = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).hnj;
            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f39do = false;
            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).qor.removeCallbacks(hnj.this.pv);
            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.1.8
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dse != null) {
                        ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dse.hn();
                    }
                }
            });
            com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq, 0);
            if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13842vf != null) {
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13842vf.hnj(5);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.qor.hn, u6.b.a
        public void hnj(final u6.b bVar, long j10, long j11) {
            long j12;
            long j13;
            com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
            if (Math.abs(j10 - ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).ojm) < 50) {
                return;
            }
            hnj hnjVar = hnj.this;
            hnjVar.hnj(hnjVar.sq);
            hnj.this.hnj(j10, j11);
            hnj.this.hn(j10, j11);
            com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).aq.fvx();
            if (gjvVarFvx == null || (gjvVarHnj = gjvVarFvx.hnj()) == null) {
                j12 = j10;
                j13 = j11;
            } else {
                j12 = j10;
                j13 = j11;
                gjvVarHnj.hnj(j12, j13, ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).f13842vf);
            }
            if (!this.f13782hn || j13 - j12 >= 500) {
                return;
            }
            this.f13782hn = false;
            ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).qor.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.1.9
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass1.this.hnj(bVar);
                }
            }, 1000L);
        }

        @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.qor.hn
        public void hnj(int i10, int i11) {
            hnj.this.ff();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj, x6.c
    public void qor() {
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        sk skVar = this.dse;
        if (skVar != null) {
            skVar.hnj();
            this.dse.fc();
            this.dse.oj();
        }
        qor qorVar = this.dkl;
        if (qorVar != null) {
            if (qorVar.dse()) {
                if (this.orl) {
                    if (ta.apu()) {
                        this.dkl.hn(3);
                        qor qorVar2 = this.dkl;
                        qorVar2.hnj(false, qorVar2.oj(), this.jip);
                    } else {
                        apu();
                    }
                } else {
                    hn(this.f13841ul);
                }
            } else {
                this.dkl.hnj(false, this.ojm, this.jip);
            }
        }
        if (this.xad || !this.apu.get()) {
            return;
        }
        vf();
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = this.aq.fvx();
        if (gjvVarFvx == null || (gjvVarHnj = gjvVarFvx.hnj()) == null) {
            return;
        }
        gjvVarHnj.qor(dkl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    public void hn(float f10, float f11) {
        Throwable th2;
        float f12;
        float f13;
        float f14;
        float f15;
        try {
            Objects.toString(this.aq.aip());
            if (pv()) {
                return;
            }
            int[] iArrHn = sq.hn(oj.hnj());
            boolean z10 = false;
            boolean z11 = this.aq.zf() == 1;
            float f16 = iArrHn[0];
            float f17 = iArrHn[1];
            try {
                if (!z11) {
                    f12 = f10;
                    f13 = f11;
                    if (f12 < f13) {
                        hnj(f16, f17, f12, f13, false);
                        return;
                    }
                } else if (f10 > f11) {
                    try {
                        hnj(f16, f17, f10, f11, true);
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } else {
                    f12 = f10;
                    f13 = f11;
                }
                float f18 = f12 / f13;
                float f19 = f16 / f17;
                if (z11) {
                    if (f19 >= 0.5625f || f18 != 0.5625f) {
                        f15 = f12;
                        f14 = f13;
                    } else {
                        f15 = (f17 * 9.0f) / 16.0f;
                        z10 = true;
                        f14 = f17;
                    }
                } else if (f19 <= 1.7777778f || f18 != 1.7777778f) {
                    f15 = f12;
                    f14 = f13;
                } else {
                    f14 = (f16 * 9.0f) / 16.0f;
                    z10 = true;
                    f15 = f16;
                }
                if (z10) {
                    f16 = f15;
                    f17 = f14;
                }
                int i10 = (int) f16;
                int i11 = (int) f17;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i11);
                layoutParams.addRule(13);
                if (orp() != null) {
                    if (orp() instanceof TextureView) {
                        ((TextureView) orp()).setLayoutParams(layoutParams);
                    } else if (orp() instanceof SurfaceView) {
                        ((SurfaceView) orp()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.tu.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = i11;
                        layoutParams2.width = i10;
                        this.tu.setLayoutParams(layoutParams2);
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        com.bytedance.sdk.component.utils.apu.hnj(this.hnj, "changeSize error", th2);
    }

    protected void hnj(boolean z10, float f10, float f11) {
        try {
            Objects.toString(this.aq.aip());
            if (!pv() || z10) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) f11);
                layoutParams.addRule(13);
                if (orp() != null) {
                    if (orp() instanceof TextureView) {
                        ((TextureView) orp()).setLayoutParams(layoutParams);
                    } else if (orp() instanceof SurfaceView) {
                        ((SurfaceView) orp()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.tu.getLayoutParams();
                    if (this.tu.getHeight() > 0) {
                        float fMin = Math.min(this.tu.getWidth() / f10, this.tu.getHeight() / f11);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (f10 * fMin);
                            layoutParams.height = (int) (f11 * fMin);
                            if (orp() instanceof TextureView) {
                                ((TextureView) orp()).setLayoutParams(layoutParams);
                            } else if (orp() instanceof SurfaceView) {
                                ((SurfaceView) orp()).setLayoutParams(layoutParams);
                            }
                            if (this.as.dkl == 4) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.tu.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.hnj(this.hnj, "changeSize error", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor(float f10, float f11) {
        try {
            if (orp() != null && this.dkl != null) {
                boolean z10 = this.aq.zf() == 1;
                int[] iArrHn = sq.hn(oj.hnj());
                hnj(iArrHn[0], iArrHn[1], f10, f11, z10);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(final long j10, final long j11) {
        this.aq.gjv(j10);
        this.ojm = j10;
        this.f13835gm = j11;
        final int iA = b.a(j10, j11);
        this.qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.4
            @Override // java.lang.Runnable
            public void run() {
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dse.hnj(j10, j11);
                ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).dse.hnj(iA);
                try {
                    if (((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).xyo != null) {
                        ((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).xyo.hnj(j10, j11);
                    }
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.apu.hnj(((com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj) hnj.this).hnj, "onProgressUpdate error: ", th2);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj, x6.c
    public boolean hnj(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        int iKht;
        super.hnj(cVar);
        if (this.dkl != null) {
            return false;
        }
        cVar.jip();
        if (TextUtils.isEmpty(cVar.jip())) {
            return false;
        }
        cVar.hn(com.bytedance.sdk.openadsdk.as.sk.hnj("player_force_raw_url", 0) == 1);
        hn(cVar);
        cVar.gjv(1);
        this.fvt = !cVar.jip().startsWith("http");
        if (this.f13842vf != null) {
            if (this.as.dkl == 1) {
                iKht = this.aq.qlh();
            } else {
                iKht = this.aq.kht();
            }
            if (this.tu != null) {
                try {
                    int iXf = this.aq.xf();
                    if (iXf == 7 || iXf == 8) {
                        View viewHnj = jbd.hnj(this.tu, (Class<? extends View>) aq.class);
                        if (viewHnj != null) {
                            View viewFindViewById = viewHnj.findViewById(jip.mjg);
                            View viewFindViewById2 = viewHnj.findViewById(jip.sz);
                            View viewFindViewById3 = viewHnj.findViewById(jip.ajq);
                            dkl dklVar = this.f13842vf;
                            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                            dklVar.hnj(viewFindViewById2, friendlyObstructionPurpose);
                            this.f13842vf.hnj(viewFindViewById, friendlyObstructionPurpose);
                            this.f13842vf.hnj(viewFindViewById3, friendlyObstructionPurpose);
                            if (this.pnz) {
                                View viewHnj2 = jbd.hnj(this.tu, (Class<? extends View>) com.bytedance.sdk.openadsdk.core.bug.hn.dkl.hnj.class);
                                if (viewHnj2 instanceof com.bytedance.sdk.openadsdk.core.bug.hn.dkl.hnj) {
                                    this.f13842vf.hnj(((com.bytedance.sdk.openadsdk.core.bug.hn.dkl.hnj) viewHnj2).getMarkView(), friendlyObstructionPurpose);
                                }
                            }
                        }
                        ArrayList<View> arrayListHnj = jbd.hnj(this.tu, 1);
                        int size = arrayListHnj.size();
                        int i10 = 0;
                        while (i10 < size) {
                            View view = arrayListHnj.get(i10);
                            i10++;
                            this.f13842vf.hnj(view, FriendlyObstructionPurpose.OTHER);
                        }
                    } else if (iXf == 3) {
                        ArrayList<View> arrayListHnj2 = jbd.hnj(this.tu, 2);
                        int size2 = arrayListHnj2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            View view2 = arrayListHnj2.get(i11);
                            i11++;
                            this.f13842vf.hnj(view2, FriendlyObstructionPurpose.OTHER);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            this.f13842vf.hnj(iKht > 0, iKht / 1000.0f);
        }
        nyv();
        if (cVar.ta() > 0) {
            long jTa = cVar.ta();
            this.ojm = jTa;
            this.f13839ta = Math.max(this.f13839ta, jTa);
        }
        if (this.ojm == this.f13835gm) {
            this.ojm = 0L;
        }
        sk skVar = this.dse;
        if (skVar != null) {
            skVar.hnj();
            this.dse.dse();
            this.dse.qor(cVar.aq(), cVar.ojm());
            this.dse.qor(this.tu);
        }
        qor qorVar = new qor();
        this.dkl = qorVar;
        qorVar.hnj(this.orp);
        oj();
        this.f13779ff = 0L;
        xad();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj
    public void hnj(boolean z10, int i10) {
        gjv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(float f10, float f11) {
        ViewGroup viewGroup;
        try {
            if (orp() != null && this.dkl != null && (viewGroup = this.tu) != null) {
                float width = viewGroup.getWidth();
                float f12 = f10 / (width * 1.0f);
                float height = this.tu.getHeight();
                if (f12 <= f11 / (1.0f * height)) {
                    width = f10 * (height / f11);
                } else {
                    height = f11 * (width / f10);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) width, (int) height);
                layoutParams.addRule(13);
                if (orp() instanceof TextureView) {
                    ((TextureView) orp()).setLayoutParams(layoutParams);
                } else if (orp() instanceof SurfaceView) {
                    ((SurfaceView) orp()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.hnj(this.hnj, "changeVideoSizeSupportInteraction error", th2);
        }
    }

    private void hnj(float f10, float f11, float f12, float f13, boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        if (f12 <= 0.0f || f13 <= 0.0f) {
            try {
                f12 = this.aq.pwt().D();
                f13 = this.aq.pwt().p();
            } catch (Throwable unused) {
                return;
            }
        }
        if (f13 > 0.0f && f12 > 0.0f) {
            if (z10) {
                if (f12 < f13) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) ((f13 * f10) / f12));
            } else if (f12 > f13) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f12 * f11) / f13), (int) f11);
            }
            layoutParams.addRule(13);
            if (orp() != null) {
                if (orp() instanceof TextureView) {
                    ((TextureView) orp()).setLayoutParams(layoutParams);
                } else if (orp() instanceof SurfaceView) {
                    ((SurfaceView) orp()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.tu.getLayoutParams();
                if (!com.bytedance.sdk.component.adexpress.gjv.hn.hnj(oj.hnj()) || this.tu.getHeight() <= 0 || layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.tu.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj, com.bytedance.sdk.openadsdk.core.mjg.hn.hnj
    public void hnj(a aVar, View view) {
        qor qorVar = this.dkl;
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
        qor();
        sk skVar3 = this.dse;
        if (skVar3 != null) {
            skVar3.hn(false, false);
        }
    }

    public void hnj(InterfaceC0222hnj interfaceC0222hnj) {
        this.f13781xo = interfaceC0222hnj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj, x6.c
    public void hnj() {
        if (this.dkl != null) {
            ff();
            this.dkl.ojm();
        }
    }
}
