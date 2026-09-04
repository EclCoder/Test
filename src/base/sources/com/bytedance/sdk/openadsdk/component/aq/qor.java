package com.bytedance.sdk.openadsdk.component.aq;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.fc;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements com.bytedance.sdk.openadsdk.core.qor.hnj.InterfaceC0232hnj {
    private hn gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private FrameLayout f13327hn;
    private Context hnj;
    private as qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f13328sk = false;

    public qor(Context context) {
        this.hnj = context.getApplicationContext();
    }

    public void aq() {
        try {
            if (sk()) {
                this.gjv.hn();
            }
        } catch (Throwable th2) {
            apu.qor("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th2.getMessage());
        }
    }

    public void bug() {
        hn hnVar = this.gjv;
        if (hnVar == null) {
            return;
        }
        this.hnj = null;
        hnVar.gjv();
        this.gjv = null;
    }

    public boolean dkl() {
        hn hnVar = this.gjv;
        return (hnVar == null || hnVar.dnm() == null || !this.gjv.dnm().dse()) ? false : true;
    }

    public void dnm() {
        hn hnVar = this.gjv;
        if (hnVar != null) {
            hnVar.qor();
        }
    }

    public boolean dse() {
        hn hnVar = this.gjv;
        return hnVar != null && hnVar.mjg();
    }

    public long fc() {
        hn hnVar = this.gjv;
        if (hnVar != null) {
            return hnVar.ojm() + this.gjv.dse();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qor.hnj.InterfaceC0232hnj
    public long getVideoProgress() {
        return orl();
    }

    public boolean gjv() {
        hn hnVar = this.gjv;
        return (hnVar == null || hnVar.dnm() == null || !this.gjv.dnm().hn()) ? false : true;
    }

    public hn hn() {
        return this.gjv;
    }

    public void hnj(FrameLayout frameLayout, as asVar) {
        this.f13327hn = frameLayout;
        this.qor = asVar;
        this.gjv = new hn(this.hnj, frameLayout, asVar);
    }

    public void jip() {
        hn hnVar = this.gjv;
        if (hnVar != null) {
            hnVar.jbd();
        }
    }

    public long mjg() {
        hn hnVar = this.gjv;
        if (hnVar != null) {
            return hnVar.dse();
        }
        return 0L;
    }

    public void ojm() {
        try {
            if (dkl()) {
                dnm();
            }
        } catch (Throwable th2) {
            apu.qor("TTAppOpenVideoManager", "onContinue throw Exception :" + th2.getMessage());
        }
    }

    public long orl() {
        hn hnVar = this.gjv;
        if (hnVar != null) {
            return hnVar.dkl();
        }
        return 0L;
    }

    public boolean qor() {
        return this.f13328sk;
    }

    public boolean sk() {
        hn hnVar = this.gjv;
        return (hnVar == null || hnVar.dnm() == null || !this.gjv.dnm().dkl()) ? false : true;
    }

    public void ta() {
        hn hnVar = this.gjv;
        if (hnVar == null) {
            return;
        }
        hnVar.gjv();
        this.gjv = null;
    }

    public boolean hnj() {
        com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVarHnj = as.hnj(CacheDirFactory.getICacheDir(0).hn(), this.qor);
        hnVarHnj.hn(this.qor.sp());
        hnVarHnj.hn(this.f13327hn.getWidth());
        hnVarHnj.qor(this.f13327hn.getHeight());
        hnVarHnj.qor(this.qor.ldn());
        hnVarHnj.hnj(0L);
        hnVarHnj.hnj(true);
        return this.gjv.hnj(hnVarHnj);
    }

    public void hnj(boolean z10) {
        this.f13328sk = z10;
    }

    public void hnj(c.InterfaceC0870c interfaceC0870c) {
        hn hnVar = this.gjv;
        if (hnVar != null) {
            hnVar.hnj(interfaceC0870c);
        }
    }

    public boolean hnj(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.hnj hnjVar, as asVar) {
        hnj(frameLayout, asVar);
        hnj(hnjVar);
        try {
            return hnj();
        } catch (Throwable th2) {
            apu.qor("TTAppOpenVideoManager", "open_ad", "ttAppOpenAd playVideo error: " + th2.getMessage());
            return false;
        }
    }

    public boolean hnj(float f10) {
        try {
            hn hnVar = this.gjv;
            if (hnVar != null) {
                return hnVar.hnj(f10);
            }
            return false;
        } catch (Throwable th2) {
            apu.qor("TTAppOpenVideoManager", "open_ad", "setPlaybackSpeed error: " + th2.getMessage());
            return false;
        }
    }

    public void hnj(int i10) {
        if (this.gjv != null) {
            fc.hnj hnjVar = new fc.hnj();
            hnjVar.hn(orl());
            hnjVar.gjv(fc());
            hnjVar.qor(mjg());
            hnjVar.qor(i10);
            hnjVar.gjv(this.gjv.aq());
            hnjVar.hnj(this.gjv.uua());
            this.gjv.hnj(hnjVar);
        }
    }
}
