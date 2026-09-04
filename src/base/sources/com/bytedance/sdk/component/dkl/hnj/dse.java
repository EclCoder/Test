package com.bytedance.sdk.component.dkl.hnj;

import android.content.Context;
import com.vungle.ads.internal.signals.b;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse {
    private static dse bug;
    private static volatile com.bytedance.sdk.component.dkl.hnj.sk.hnj ojm;
    private volatile sk aq;
    private volatile com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj dkl;
    private volatile Map<Integer, com.bytedance.sdk.component.dkl.hnj.hn.qor> dnm;
    private volatile com.bytedance.sdk.component.dkl.hnj.hnj.sk dse;
    private volatile com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj f12760hn;
    private volatile Context hnj;
    private long mjg;
    private final AtomicBoolean orl = new AtomicBoolean(false);
    private volatile com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj f12761sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.dkl.hnj.hn.qor f12762ta;

    private dse() {
    }

    public static synchronized dse dkl() {
        try {
            if (bug == null) {
                bug = new dse();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return bug;
    }

    public static com.bytedance.sdk.component.dkl.hnj.sk.hnj gjv() {
        if (ojm == null) {
            synchronized (dse.class) {
                try {
                    if (ojm == null) {
                        ojm = new com.bytedance.sdk.component.dkl.hnj.sk.hn();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ojm;
    }

    public void aq() {
        com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj.hn();
    }

    public com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj bug() {
        return this.qor;
    }

    public com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj dnm() {
        return this.f12760hn;
    }

    public com.bytedance.sdk.component.dkl.hnj.hn.qor dse() {
        return this.f12762ta;
    }

    public sk fc() {
        return this.aq;
    }

    public Map<Integer, com.bytedance.sdk.component.dkl.hnj.hn.qor> hn() {
        return this.dnm;
    }

    public boolean hnj() {
        return this.orl.get();
    }

    public long jip() {
        return this.mjg * b.TWENTY_FOUR_HOURS_MILLIS;
    }

    public com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj mjg() {
        return this.f12761sk;
    }

    public com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj ojm() {
        return this.dkl;
    }

    public com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj orl() {
        return this.gjv;
    }

    public com.bytedance.sdk.component.dkl.hnj.hnj.sk qor() {
        return this.dse;
    }

    public Context sk() {
        return this.hnj;
    }

    public void ta() {
        com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj.qor();
    }

    public void hn(com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar) {
        this.f12760hn = hnjVar;
    }

    public void hnj(boolean z10) {
        this.orl.set(z10);
    }

    public void qor(com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar) {
        this.qor = hnjVar;
    }

    public void sk(com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar) {
        this.f12761sk = hnjVar;
    }

    public void hnj(com.bytedance.sdk.component.dkl.hnj.hnj.sk skVar) {
        this.dse = skVar;
    }

    public void hnj(Context context) {
        this.hnj = context;
    }

    public void hnj(com.bytedance.sdk.component.dkl.hnj.hn.qor qorVar) {
        this.f12762ta = qorVar;
    }

    public void hnj(com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar) {
        this.dkl = hnjVar;
    }

    public void gjv(com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar) {
        this.gjv = hnjVar;
    }

    public void hnj(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        if (hnjVar == null) {
            return;
        }
        hnjVar.hnj(System.currentTimeMillis());
        com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj.hnj(hnjVar, hnjVar.gjv());
    }

    public void hnj(String str, boolean z10) {
        com.bytedance.sdk.component.dkl.hnj.dkl.hnj.hnj().hnj(str, z10);
    }

    public void hnj(String str, List<String> list, boolean z10, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.dkl.hnj.dkl.hnj.hnj().hnj(str, list, z10, map, i10, str2);
    }

    public void hnj(sk skVar) {
        this.aq = skVar;
    }

    public void hnj(long j10) {
        this.mjg = j10;
    }
}
