package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.core.as;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.model.pty;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ojm;
import com.bytedance.sdk.openadsdk.core.wu;
import com.bytedance.sdk.openadsdk.utils.fvt;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse implements xyo.hnj {
    private int aq;
    private AdSlot dkl;
    private boolean dnm;
    private PAGAppOpenAdLoadListener dse;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final as<com.bytedance.sdk.openadsdk.gjv.hnj> f13345hn;
    private final Context hnj;
    private final dkl qor;
    private final AtomicBoolean gjv = new AtomicBoolean(false);

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f13346sk = 0;
    private volatile int ojm = 0;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final pty f13347ta = new pty();

    public dse(Context context) {
        if (context != null) {
            this.hnj = context.getApplicationContext();
        } else {
            this.hnj = oj.hnj();
        }
        this.f13345hn = oj.qor();
        this.qor = dkl.hnj(this.hnj);
    }

    private void hn(AdSlot adSlot) {
        this.ojm = 1;
        qor(adSlot);
    }

    private void qor(final AdSlot adSlot) {
        final fvt fvtVarHn = fvt.hn();
        com.bytedance.sdk.openadsdk.core.model.xyo xyoVar = new com.bytedance.sdk.openadsdk.core.model.xyo();
        xyoVar.dnm = this.f13347ta;
        xyoVar.gjv = 1;
        xyoVar.ojm = 2;
        this.f13345hn.hnj(adSlot, xyoVar, 3, new wu() { // from class: com.bytedance.sdk.openadsdk.component.dse.1
            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(int i10, String str) {
                dse.this.ojm = 3;
                dse.this.hnj(new com.bytedance.sdk.openadsdk.component.sk.qor(2, 100, i10, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar) {
                dse.this.hnj(hnjVar, qorVar, adSlot, fvtVarHn);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn() {
        final fvt fvtVarHn = fvt.hn();
        com.bytedance.sdk.openadsdk.core.model.xyo xyoVar = new com.bytedance.sdk.openadsdk.core.model.xyo();
        xyoVar.dnm = this.f13347ta;
        xyoVar.gjv = 1;
        xyoVar.ojm = 2;
        this.ojm = 1;
        this.f13345hn.hnj(this.dkl, xyoVar, 3, new wu() { // from class: com.bytedance.sdk.openadsdk.component.dse.4
            boolean hnj = false;

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.eum
            public String hnj() {
                if (!com.bytedance.sdk.openadsdk.component.dse.hnj.sk()) {
                    return dse.this.qor.qor(dse.this.f13346sk);
                }
                com.bytedance.sdk.openadsdk.component.sk.hn hnVarHnj = com.bytedance.sdk.openadsdk.common.oj.hnj().hnj(dse.this.dkl);
                if (hnVarHnj == null) {
                    return null;
                }
                dse.this.dkl.setCacheTime(hnVarHnj.gjv());
                return hnVarHnj.hn();
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.eum
            public boolean hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
                com.bytedance.sdk.openadsdk.core.model.as asVarDkl;
                if (hnjVar != null && hnjVar.sk() && (asVarDkl = hnjVar.dkl()) != null) {
                    boolean zSk = com.bytedance.sdk.openadsdk.core.model.as.sk(asVarDkl);
                    if (asVarDkl.nyv() || !zSk || com.bytedance.sdk.openadsdk.component.dse.hnj.dkl() || !TextUtils.isEmpty(dse.this.qor.hnj(asVarDkl))) {
                        this.hnj = !dse.this.qor.hn(asVarDkl.aip());
                    } else {
                        this.hnj = false;
                        com.bytedance.sdk.openadsdk.component.gjv.hnj.hn(hnjVar.dkl());
                    }
                    com.bytedance.sdk.openadsdk.core.orl.qor.gjv.hnj(asVarDkl);
                }
                return this.hnj;
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(int i10, String str) {
                dse.this.ojm = 3;
                dse.this.hnj(new com.bytedance.sdk.openadsdk.component.sk.qor(2, 100, i10, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar) {
                com.bytedance.sdk.openadsdk.core.model.as asVarDkl;
                if (hnjVar == null || (asVarDkl = hnjVar.dkl()) == null) {
                    return;
                }
                asVarDkl.qor(dse.this.f13347ta.ta());
                if (this.hnj) {
                    dse.this.qor.hnj(asVarDkl.aip(), asVarDkl.jp());
                    dse.this.hnj(new com.bytedance.sdk.openadsdk.component.sk.qor(1, 101, asVarDkl, (com.bytedance.sdk.openadsdk.core.model.hnj) null));
                } else {
                    dse dseVar = dse.this;
                    dseVar.hnj(hnjVar, qorVar, dseVar.dkl, fvtVarHn);
                }
            }
        });
    }

    public static dse hnj(Context context) {
        return new dse(context);
    }

    public void hnj(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.dse dseVar, int i10) {
        if (dseVar == null) {
            return;
        }
        if (i10 <= 0) {
            i10 = com.bytedance.sdk.openadsdk.component.dse.hnj.dse();
        }
        this.dkl = adSlot;
        adSlot.setCacheScene(0);
        this.f13347ta.hnj = !TextUtils.isEmpty(this.dkl.getBidAdm());
        if (dseVar instanceof PAGAppOpenAdLoadListener) {
            this.dse = (PAGAppOpenAdLoadListener) dseVar;
        }
        this.f13346sk = hnj(this.dkl);
        this.aq = i10;
        this.f13347ta.hnj(fvt.hn());
        this.f13347ta.hn(com.bytedance.sdk.openadsdk.component.dse.hnj.hn());
        this.f13347ta.hn(com.bytedance.sdk.openadsdk.component.dse.hnj.qor());
        if (this.f13347ta.hnj) {
            hn(this.dkl);
        } else {
            new xyo(fc.hn().getLooper(), this).sendEmptyMessageDelayed(1, i10);
            hnj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(final com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar, AdSlot adSlot, fvt fvtVar) {
        this.ojm = 2;
        if (hnjVar != null && hnjVar.gjv() != null && hnjVar.gjv().size() != 0) {
            final com.bytedance.sdk.openadsdk.core.model.as asVar = hnjVar.gjv().get(0);
            long jMkl = asVar.mkl();
            pty ptyVar = this.f13347ta;
            ptyVar.f13986hn = jMkl;
            asVar.qor(ptyVar.ta());
            boolean zDkl = com.bytedance.sdk.openadsdk.core.model.as.dkl(asVar);
            if (asVar.nyv()) {
                hnj(new com.bytedance.sdk.openadsdk.component.sk.qor(1, 100, asVar, hnjVar));
                return;
            }
            if (!zDkl && !asVar.era()) {
                if (com.bytedance.sdk.openadsdk.core.model.as.sk(asVar)) {
                    if (com.bytedance.sdk.openadsdk.component.dse.hnj.dkl()) {
                        pty ptyVar2 = this.f13347ta;
                        ptyVar2.f13986hn = -1L;
                        ptyVar2.hnj(3);
                        hnj(new com.bytedance.sdk.openadsdk.component.sk.qor(1, 100, asVar, hnjVar));
                        hnj(asVar, adSlot, false, hnjVar);
                        return;
                    }
                    hnj(asVar, adSlot, !this.f13347ta.hnj, hnjVar);
                    if (this.f13347ta.hnj) {
                        com.bytedance.sdk.openadsdk.jip.gjv.hnj(asVar, fvtVar.gjv());
                        if (jMkl == 0) {
                            this.f13347ta.hnj(2);
                            hnj(new com.bytedance.sdk.openadsdk.component.sk.qor(1, 100, asVar, hnjVar));
                            return;
                        } else {
                            fc.hn().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.dse.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    dse.this.f13347ta.hnj(2);
                                    dse.this.hnj(new com.bytedance.sdk.openadsdk.component.sk.qor(1, 100, asVar, hnjVar));
                                }
                            }, jMkl);
                            return;
                        }
                    }
                    return;
                }
                pty ptyVar3 = this.f13347ta;
                ptyVar3.f13986hn = -1L;
                ptyVar3.hnj(3);
                hnj(new com.bytedance.sdk.openadsdk.component.sk.qor(1, 100, asVar, hnjVar));
                hnj(asVar, false, hnjVar);
                return;
            }
            hnj(new com.bytedance.sdk.openadsdk.component.sk.qor(1, 100, asVar, hnjVar));
            if (com.bytedance.sdk.openadsdk.core.model.as.sk(asVar)) {
                hnj(asVar, adSlot, false, hnjVar);
                return;
            } else {
                hnj(asVar, false, hnjVar);
                return;
            }
        }
        this.ojm = 3;
        hnj(new com.bytedance.sdk.openadsdk.component.sk.qor(2, 100, Sdk$SDKError.b.AD_SERVER_ERROR_VALUE, ojm.hnj(Sdk$SDKError.b.AD_SERVER_ERROR_VALUE)));
        qorVar.hnj(-3);
        qorVar.qor(3);
        com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar);
    }

    private void hnj() {
        ua.qor((Runnable) new com.bytedance.sdk.component.aq.hn.qor("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.dse.3
            @Override // java.lang.Runnable
            public void run() {
                dse.this.hn();
            }
        });
    }

    private void hnj(final com.bytedance.sdk.openadsdk.core.model.as asVar, AdSlot adSlot, final boolean z10, final com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        this.qor.hnj(asVar, adSlot, this.f13347ta, new dkl.hn() { // from class: com.bytedance.sdk.openadsdk.component.dse.5
            @Override // com.bytedance.sdk.openadsdk.component.dkl.hn
            public void hnj() {
                if (z10) {
                    dse.this.ojm = 4;
                    com.bytedance.sdk.openadsdk.component.sk.qor qorVar = new com.bytedance.sdk.openadsdk.component.sk.qor(1, 100, asVar, hnjVar);
                    qorVar.hnj(true);
                    dse.this.hnj(qorVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.dkl.hn
            public void hnj(int i10, String str) {
                if (z10) {
                    dse.this.ojm = 5;
                    dse.this.hnj(new com.bytedance.sdk.openadsdk.component.sk.qor(2, 100, 10003, ojm.hnj(10003)));
                }
            }
        });
    }

    private void hnj(final com.bytedance.sdk.openadsdk.core.model.as asVar, final boolean z10, final com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        this.qor.hnj(asVar, this.f13347ta, new dkl.hnj() { // from class: com.bytedance.sdk.openadsdk.component.dse.6
            @Override // com.bytedance.sdk.openadsdk.component.dkl.hnj
            public void hnj(com.bytedance.sdk.openadsdk.apu.hnj.hn hnVar) {
                if (z10) {
                    dse.this.ojm = 4;
                    com.bytedance.sdk.openadsdk.component.sk.qor qorVar = new com.bytedance.sdk.openadsdk.component.sk.qor(1, 100, asVar, hnjVar);
                    qorVar.hnj(true);
                    dse.this.hnj(qorVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.dkl.hnj
            public void hnj() {
                if (z10) {
                    dse.this.ojm = 5;
                    dse.this.hnj(new com.bytedance.sdk.openadsdk.component.sk.qor(2, 100, 10003, ojm.hnj(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(com.bytedance.sdk.openadsdk.component.sk.qor qorVar) {
        int iHn = qorVar.hn();
        int iQor = qorVar.qor();
        com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(this.f13347ta, iQor, iHn);
        if (!this.gjv.compareAndSet(false, true)) {
            if (iHn == 1 && iQor == 100 && !this.f13347ta.hnj) {
                dkl.hnj(oj.hnj()).hnj(new com.bytedance.sdk.openadsdk.component.sk.hnj(this.f13346sk, qorVar.gjv(), qorVar.hnj()));
                if (this.dnm) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(qorVar.gjv(), 1, this.f13347ta);
                return;
            }
            return;
        }
        if (iHn != 1) {
            if (iHn == 2 || iHn == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.dse;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(qorVar.sk(), qorVar.dkl());
                }
                if (iHn == 3) {
                    com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(this.ojm, this.aq, this.f13347ta);
                    return;
                }
                return;
            }
            return;
        }
        if (iQor == 100 && !this.f13347ta.hnj) {
            this.qor.hnj(new com.bytedance.sdk.openadsdk.component.sk.hnj(this.f13346sk, qorVar.gjv(), qorVar.hnj()));
        }
        if (this.dse != null) {
            this.dse.onAdLoaded(new gjv(this.hnj, qorVar.gjv(), iQor == 101, this.dkl));
        }
        if (iQor == 101) {
            com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(qorVar.gjv(), this.f13347ta.hnj().gjv());
        } else if (iQor == 100) {
            com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(qorVar.gjv(), 0, this.f13347ta);
            this.dnm = true;
        }
    }

    public int hnj(AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
        if (message.what != 1 || this.gjv.get()) {
            return;
        }
        hnj(new com.bytedance.sdk.openadsdk.component.sk.qor(3, 102, Sdk$SDKError.b.AD_LOAD_TOO_FREQUENTLY_VALUE, ojm.hnj(Sdk$SDKError.b.AD_LOAD_TOO_FREQUENTLY_VALUE)));
    }
}
