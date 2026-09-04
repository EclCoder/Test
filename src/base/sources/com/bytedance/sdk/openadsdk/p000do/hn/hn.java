package com.bytedance.sdk.openadsdk.p000do.hn;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.as;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hn {
    private final Integer aq;
    private final sk.hnj dkl;
    private final int dse;
    private final AtomicLong gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected as f14323hn;
    protected WeakReference<View> hnj;
    private volatile boolean ojm = false;
    protected final AtomicBoolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final AtomicBoolean f14324sk;

    public hn(Integer num, View view, as asVar, int i10, sk.hnj hnjVar) {
        this.aq = num;
        this.dse = i10;
        this.f14323hn = asVar;
        this.dkl = hnjVar;
        hnj(view);
        this.qor = new AtomicBoolean(false);
        this.gjv = new AtomicLong(-1L);
        this.f14324sk = new AtomicBoolean(false);
    }

    public static hn hnj(boolean z10, Integer num, View view, as asVar, sk.hnj hnjVar) {
        return z10 ? new aq(num, view, asVar, hnjVar) : new qor(num, view, asVar, hnjVar);
    }

    public void aq() {
        this.gjv.set(-1L);
    }

    public boolean bug() {
        return this.qor.get();
    }

    public abstract int dkl();

    public Integer dnm() {
        return this.aq;
    }

    public void dse() {
        if (ojm()) {
            return;
        }
        if (!this.qor.get()) {
            aq();
        } else if (!this.gjv.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.gjv.get() >= this.dse) {
            gjv();
        }
    }

    protected void gjv() {
        if (this.f14324sk.compareAndSet(false, true)) {
            gjv.hnj(this.f14323hn, sk(), this.dkl);
        }
    }

    public int hn() {
        if (ojm()) {
            return 1;
        }
        WeakReference<View> weakReference = this.hnj;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.ojm) {
            return 3;
        }
        if (dnm().equals(view.getTag(33554433))) {
            return (dnm().equals(view.getTag(33554433)) && qor()) ? 1 : 2;
        }
        ta();
        sk.hn(dnm());
        return 3;
    }

    protected abstract void hn(int i10);

    public boolean ojm() {
        return this.f14324sk.get();
    }

    public void orl() {
        this.qor.set(false);
        aq();
    }

    protected abstract boolean qor();

    protected hnj sk() {
        WeakReference<View> weakReference = this.hnj;
        if (weakReference == null) {
            return new hnj(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        return view == null ? new hnj(0, 0, 0.0f) : new hnj(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public void ta() {
        this.ojm = true;
        dse.hn(this);
    }

    public void hnj() {
        if (this.qor.compareAndSet(false, true)) {
            dse.hnj(this);
        }
    }

    public void hnj(int i10) {
        if (i10 == 4) {
            hnj();
            return;
        }
        if (i10 == 8) {
            orl();
        } else if (i10 == 9) {
            gjv();
        } else {
            hn(i10);
        }
    }

    public void hnj(View view) {
        if (view != null) {
            view.setTag(33554433, dnm());
        }
        this.hnj = new WeakReference<>(view);
    }
}
