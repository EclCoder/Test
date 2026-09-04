package com.bytedance.sdk.openadsdk.component.dkl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements Handler.Callback {
    private boolean bug;
    private long dnm;
    private boolean dse;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.aq.hnj f13342hn;
    private hnj qor;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private long f13344ta;
    private Handler hnj = new Handler(Looper.myLooper(), this);
    private int gjv = 0;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f13343sk = 5;
    private int dkl = 0;
    private final int aq = 1000;
    private int ojm = 1000;

    public hn(com.bytedance.sdk.openadsdk.component.aq.hnj hnjVar) {
        this.f13342hn = hnjVar;
    }

    public void gjv() {
        Handler handler = this.hnj;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 100 && this.hnj != null) {
            int i10 = message.arg1;
            hnj(i10);
            if (i10 > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i10 - 1;
                this.hnj.sendMessageDelayed(messageObtain, this.ojm);
            }
        }
        return true;
    }

    public void hn(int i10) {
        this.dkl = Math.min(i10, this.f13343sk);
    }

    public void hnj(int i10) {
        this.gjv = i10;
        int i11 = this.f13343sk - i10;
        this.f13342hn.hn(((long) i11) * 1000);
        boolean z10 = true;
        if (i10 <= 0) {
            hnj hnjVar = this.qor;
            if (hnjVar != null && !this.dse) {
                hnjVar.hn();
                this.dse = true;
            }
            i10 = 0;
        }
        hnj hnjVar2 = this.qor;
        if (hnjVar2 != null) {
            int iMax = Math.max(this.dkl - i11, 0);
            if (i10 != 0 && i11 < this.dkl) {
                z10 = false;
            }
            hnjVar2.hnj(iMax, z10);
        }
    }

    public void qor() {
        if (this.hnj != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.gjv;
            this.hnj.sendMessage(messageObtain);
        }
    }

    public void sk() {
        this.hnj.removeCallbacksAndMessages(null);
        this.hnj = null;
    }

    public void hn() {
        Handler handler = this.hnj;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.f13343sk, 0));
        }
    }

    public void hnj(float f10) {
        int i10 = (int) f10;
        this.f13343sk = i10;
        if (i10 <= 0) {
            this.f13343sk = 5;
        }
    }

    public void hnj(hnj hnjVar) {
        this.qor = hnjVar;
    }

    public int hnj() {
        return this.dkl;
    }

    public void hnj(int i10, float f10, boolean z10) {
        com.bytedance.sdk.openadsdk.component.aq.hnj hnjVar;
        if ((i10 == 1 || i10 == 2) && this.bug != z10) {
            this.bug = z10;
            if (i10 == 1 && (hnjVar = this.f13342hn) != null) {
                hnjVar.hnj(z10);
            }
            if (z10) {
                try {
                    this.ojm = (int) (1000.0f / f10);
                    this.dnm = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long jCurrentTimeMillis = this.f13344ta + (System.currentTimeMillis() - this.dnm);
                this.f13344ta = jCurrentTimeMillis;
                com.bytedance.sdk.openadsdk.component.aq.hnj hnjVar2 = this.f13342hn;
                if (hnjVar2 != null) {
                    hnjVar2.hnj(jCurrentTimeMillis);
                }
            }
            this.ojm = 1000;
        }
    }
}
