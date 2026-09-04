package com.bytedance.sdk.openadsdk.component.reward;

import android.graphics.SurfaceTexture;
import android.os.CountDownTimer;
import com.bytedance.sdk.openadsdk.core.model.as;
import u6.b;
import x6.c;
import y6.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv implements c {
    private com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.InterfaceC0222hnj aq;
    private long dse;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final as f13404hn;
    private final hnj hnj;
    private final a qor;
    private boolean gjv = true;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f13405sk = 0;
    private boolean dkl = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements b {
        private long aq;
        private CountDownTimer dkl;
        private c.InterfaceC0870c dse;
        private long gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final a f13406hn;
        private final long hnj;
        private long ojm;
        private final com.bytedance.sdk.openadsdk.gjv.dse qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private int f13407sk = 0;

        public hnj(long j10, a aVar, com.bytedance.sdk.openadsdk.gjv.dse dseVar) {
            this.hnj = j10;
            this.f13406hn = aVar;
            this.qor = dseVar;
        }

        @Override // u6.b
        public boolean aq() {
            return this.f13407sk == 0;
        }

        public void bug() {
            this.f13407sk = 2;
            this.gjv = this.aq;
            CountDownTimer countDownTimer = this.dkl;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.dkl = null;
            }
        }

        public void dnm() {
            if (this.f13407sk == 1) {
                return;
            }
            this.f13407sk = 1;
            final long jJip = jip();
            if (this.gjv >= jJip) {
                this.gjv = 0L;
            }
            final long j10 = jJip - this.gjv;
            CountDownTimer countDownTimer = new CountDownTimer(j10, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.gjv.hnj.1
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    if (hnj.this.dse != null) {
                        c.InterfaceC0870c interfaceC0870c = hnj.this.dse;
                        long j11 = jJip;
                        interfaceC0870c.hnj(j11, j11);
                    }
                    hnj.this.f13407sk = 4;
                    hnj.this.aq = jJip;
                    hnj.this.gjv = jJip;
                    if (hnj.this.dse != null) {
                        hnj.this.dse.hnj(hnj.this.uua(), 100);
                    }
                    com.bytedance.sdk.openadsdk.gjv.sk.hn.fc.hnj hnjVar = new com.bytedance.sdk.openadsdk.gjv.sk.hn.fc.hnj();
                    hnjVar.hn(jJip);
                    hnjVar.gjv(jJip);
                    hnjVar.qor(hnj.this.mjg());
                    hnjVar.gjv(hnj.this.fc());
                    hnjVar.hnj(hnj.this.ojm());
                    com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hn(hnj.this.f13406hn, hnjVar, hnj.this.qor);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j11) {
                    long j12 = (j10 - j11) + hnj.this.gjv;
                    hnj.this.aq = j12;
                    if (hnj.this.dse != null) {
                        hnj.this.dse.hnj(j12, jJip);
                    }
                }
            };
            this.dkl = countDownTimer;
            countDownTimer.start();
        }

        @Override // u6.b
        public boolean dse() {
            return this.f13407sk == 2;
        }

        public int fc() {
            return 0;
        }

        @Override // u6.b
        public int gjv() {
            return 0;
        }

        @Override // u6.b
        public boolean hnj() {
            return false;
        }

        public long jip() {
            return this.hnj;
        }

        public long mjg() {
            return 0L;
        }

        public long ojm() {
            return this.ojm;
        }

        public void orl() {
            this.f13407sk = 0;
            CountDownTimer countDownTimer = this.dkl;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.dkl = null;
            }
            if (this.dse != null) {
                this.dse = null;
            }
        }

        @Override // u6.b
        public boolean qor() {
            return false;
        }

        @Override // u6.b
        public int sk() {
            return 0;
        }

        public void ta() {
            this.aq = 0L;
            dnm();
        }

        public long uua() {
            return this.aq;
        }

        @Override // u6.b
        public boolean dkl() {
            return this.f13407sk == 1;
        }

        @Override // u6.b
        public boolean hn() {
            return this.f13407sk == 4;
        }

        public void hn(long j10) {
            this.gjv = j10;
        }

        public void hnj(long j10) {
            this.ojm = j10;
        }

        public void hnj(c.InterfaceC0870c interfaceC0870c) {
            this.dse = interfaceC0870c;
        }
    }

    public gjv(as asVar, com.bytedance.sdk.openadsdk.gjv.dse dseVar) {
        a aVar = new a() { // from class: com.bytedance.sdk.openadsdk.component.reward.gjv.1
        };
        this.qor = aVar;
        this.f13404hn = asVar;
        com.bykv.vk.openvk.hnj.hnj.hnj.qor.a aVarPwt = asVar.pwt();
        long j10 = 10;
        long jE = aVarPwt != null ? (long) aVarPwt.e() : 10L;
        if (jE <= 0) {
            aVarPwt.t(10.0d);
        } else {
            j10 = jE;
        }
        this.hnj = new hnj(j10 * 1000, aVar, dseVar);
    }

    @Override // x6.c
    public int aq() {
        return 0;
    }

    @Override // x6.c
    public x6.a bug() {
        return null;
    }

    @Override // x6.c
    public long dkl() {
        return this.hnj.uua();
    }

    @Override // x6.c
    public b dnm() {
        return this.hnj;
    }

    @Override // x6.c
    public long dse() {
        return 0L;
    }

    @Override // x6.c
    public boolean fc() {
        return false;
    }

    @Override // x6.c
    public void gjv() {
        this.hnj.orl();
    }

    @Override // x6.c
    public void hn() {
        this.hnj.bug();
        com.bytedance.sdk.openadsdk.gjv.sk.hn.fc.hnj hnjVar = new com.bytedance.sdk.openadsdk.gjv.sk.hn.fc.hnj();
        hnjVar.hn(dkl());
        hnjVar.gjv(ojm());
        hnjVar.qor(dse());
        hnjVar.hnj(jip());
        com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(this.qor, hnjVar);
        com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.InterfaceC0222hnj interfaceC0222hnj = this.aq;
        if (interfaceC0222hnj != null) {
            interfaceC0222hnj.hnj(2);
        }
    }

    @Override // x6.c
    public void hnj(SurfaceTexture surfaceTexture) {
    }

    public long jip() {
        return this.dse;
    }

    @Override // x6.c
    public boolean mjg() {
        return false;
    }

    @Override // x6.c
    public long ojm() {
        return this.hnj.jip();
    }

    @Override // x6.c
    public boolean orl() {
        return this.hnj.hn();
    }

    @Override // x6.c
    public void qor() {
        this.hnj.dnm();
        com.bytedance.sdk.openadsdk.gjv.sk.hn.fc.hnj hnjVar = new com.bytedance.sdk.openadsdk.gjv.sk.hn.fc.hnj();
        hnjVar.hn(dkl());
        hnjVar.gjv(ojm());
        hnjVar.qor(dse());
        com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hn(this.qor, hnjVar);
        com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.InterfaceC0222hnj interfaceC0222hnj = this.aq;
        if (interfaceC0222hnj != null) {
            interfaceC0222hnj.hnj(1);
        }
    }

    @Override // x6.c
    public void sk() {
        gjv();
    }

    @Override // x6.c
    public int ta() {
        return p6.b.a(this.hnj.aq, this.hnj.hnj);
    }

    public a uua() {
        return this.qor;
    }

    @Override // x6.c
    public boolean hnj(float f10) {
        return false;
    }

    @Override // x6.c
    public void hnj(long j10) {
        this.dse = j10;
        hnj hnjVar = this.hnj;
        if (hnjVar != null) {
            hnjVar.hnj(j10);
        }
    }

    public void hnj(boolean z10, int i10) {
        gjv();
    }

    @Override // x6.c
    public boolean hnj(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        this.dkl = cVar.dnm();
        if (cVar.ta() > 0) {
            this.hnj.hn(cVar.ta());
        }
        cVar.hn(com.bytedance.sdk.openadsdk.as.sk.hnj("player_force_raw_url", 0) == 1);
        com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(this.f13404hn, this.qor, cVar);
        this.hnj.dnm();
        com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.InterfaceC0222hnj interfaceC0222hnj = this.aq;
        if (interfaceC0222hnj != null) {
            interfaceC0222hnj.hnj(1);
        }
        return true;
    }

    @Override // x6.c
    public void hnj(boolean z10, String str) {
        this.dkl = z10;
    }

    @Override // x6.c
    public void hnj(c.InterfaceC0870c interfaceC0870c) {
        this.hnj.hnj(interfaceC0870c);
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.InterfaceC0222hnj interfaceC0222hnj) {
        this.aq = interfaceC0222hnj;
    }

    @Override // x6.c
    public void hnj() {
        this.hnj.ta();
    }
}
