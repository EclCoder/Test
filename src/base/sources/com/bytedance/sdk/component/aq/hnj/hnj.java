package com.bytedance.sdk.component.aq.hnj;

import android.os.Handler;
import com.bytedance.sdk.component.utils.aq;
import com.bytedance.sdk.component.utils.xyo;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Handler f12750hn;
    private final gjv<hn> hnj;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.aq.hnj.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0185hnj {
        private static final hnj hnj = new hnj();
    }

    public Handler hn() {
        if (this.f12750hn == null) {
            synchronized (hnj.class) {
                try {
                    if (this.f12750hn == null) {
                        this.f12750hn = hnj("csj_io_handler");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f12750hn;
    }

    private hnj() {
        this.hnj = gjv.hnj(2);
    }

    public static hnj hnj() {
        return C0185hnj.hnj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.aq.hnj.hnj.1
                @Override // java.lang.Runnable
                public void run() {
                    hnj.this.hnj(handler, handler2);
                }
            }, 1000L);
        }
    }

    private hn hn(xyo.hnj hnjVar, String str) {
        return new hn(aq.hnj(str), hnjVar);
    }

    public xyo hnj(xyo.hnj hnjVar, final String str) {
        hn hnVar = (hn) this.hnj.hnj();
        if (hnVar != null) {
            hnVar.hnj(hnjVar);
            hnVar.post(new Runnable() { // from class: com.bytedance.sdk.component.aq.hnj.hnj.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return hnVar;
        }
        return hn(hnjVar, str);
    }

    public xyo hnj(String str) {
        return hnj((xyo.hnj) null, str);
    }

    public boolean hnj(xyo xyoVar) {
        if (!(xyoVar instanceof hn)) {
            return false;
        }
        hn hnVar = (hn) xyoVar;
        if (this.hnj.hnj(hnVar)) {
            return true;
        }
        hnVar.hn();
        return true;
    }
}
