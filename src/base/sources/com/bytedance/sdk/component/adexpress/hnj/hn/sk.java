package com.bytedance.sdk.component.adexpress.hnj.hn;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.eum;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static volatile sk f12718hn;
    private static File hnj;
    private AtomicBoolean qor = new AtomicBoolean(true);
    private AtomicBoolean gjv = new AtomicBoolean(false);

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f12719sk = false;
    private AtomicBoolean dkl = new AtomicBoolean(false);
    private AtomicInteger dse = new AtomicInteger(0);
    private AtomicLong aq = new AtomicLong();

    private sk() {
        ojm();
    }

    public static File aq() {
        if (hnj == null) {
            try {
                File fileHnj = gjv.hnj();
                Context contextHn = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().hn();
                File file = new File(contextHn != null ? com.bytedance.sdk.component.utils.dse.hnj(contextHn, "tt_tmpl_pkg") : new File(fileHnj, "tt_tmpl_pkg"), "template");
                file.mkdirs();
                hnj = file;
            } catch (Throwable unused) {
            }
        }
        return hnj;
    }

    public static sk hn() {
        if (f12718hn == null) {
            synchronized (sk.class) {
                try {
                    if (f12718hn == null) {
                        f12718hn = new sk();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f12718hn;
    }

    private void ojm() {
        com.bytedance.sdk.component.adexpress.gjv.gjv.hn(new com.bytedance.sdk.component.aq.hn.qor("init") { // from class: com.bytedance.sdk.component.adexpress.hnj.hn.sk.1
            @Override // java.lang.Runnable
            public void run() {
                aq.hnj();
                sk.this.qor.set(false);
                sk.this.gjv();
                sk.this.dse();
                if (com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor() == null || !eum.hnj(com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().hn()) || com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor() == null) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().gjv();
            }
        }, 10);
    }

    private void ta() {
        if (this.dse.getAndSet(0) <= 0 || System.currentTimeMillis() - this.aq.get() <= TTAdConstant.AD_MAX_EVENT_TIME) {
            return;
        }
        dse();
    }

    public com.bytedance.sdk.component.adexpress.hnj.qor.hnj dkl() {
        return aq.hn();
    }

    public void dse() {
        hnj(false);
    }

    public void gjv() {
        com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVarHn = aq.hn();
        if (hnjVarHn == null || !hnjVarHn.aq()) {
            return;
        }
        boolean zHnj = hnj(hnjVarHn);
        if (!zHnj) {
            aq.gjv();
        }
        this.f12719sk = zHnj;
    }

    public void qor() {
        ojm();
    }

    public boolean sk() {
        return this.f12719sk;
    }

    public boolean hnj(com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar) {
        if (hnjVar == null) {
            return false;
        }
        return hnj(hnjVar.hnj()) || hnj(hnjVar.sk()) || hnj(hnjVar.dkl());
    }

    @Override // com.bytedance.sdk.component.adexpress.hnj.hn.qor
    public File hnj() {
        return aq();
    }

    public void hnj(boolean z10) {
        List<com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj> listHnj;
        boolean z11;
        if (this.qor.get()) {
            return;
        }
        try {
            if (this.gjv.get()) {
                if (z10) {
                    this.dse.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z12 = true;
            this.gjv.set(true);
            com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVarSk = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().sk();
            com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVarHn = aq.hn();
            if (hnjVarSk != null && hnjVarSk.aq()) {
                if (!aq.hn(hnjVarSk)) {
                    this.gjv.set(false);
                    this.aq.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor() != null) {
                    com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().qor().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hnj.hn.sk.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.sk.sk.hnj().hn();
                        }
                    });
                }
                aq.hnj(hnjVarSk);
                boolean zHnj = (hnjVarSk.sk() == null || TextUtils.isEmpty(hnjVarSk.sk().hnj())) ? false : hnj(hnjVarSk.sk().hnj());
                if (hnjVarSk.hnj().size() != 0) {
                    listHnj = hnj(hnjVarSk, hnjVarHn);
                    z11 = listHnj != null;
                } else {
                    listHnj = null;
                    z11 = zHnj;
                }
                if (!zHnj) {
                    List<com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj> listHn = hn(hnjVarSk, hnjVarHn);
                    if (listHnj == null || listHn == null) {
                        listHnj = listHn;
                    } else {
                        listHnj.addAll(listHn);
                    }
                    if (listHn == null) {
                        z12 = false;
                    }
                    if (listHn == null) {
                        this.gjv.set(false);
                    }
                    z11 = z12;
                }
                if (z11 && hnj(hnjVarSk)) {
                    aq.hnj(hnjVarSk);
                    aq.qor();
                    hn(listHnj);
                }
                gjv();
                this.gjv.set(false);
                this.aq.set(System.currentTimeMillis());
                ta();
                return;
            }
            this.gjv.set(false);
            hnj(109);
        } catch (Throwable unused) {
        }
    }
}
