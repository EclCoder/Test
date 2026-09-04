package com.bytedance.adsdk.ugeno.dse;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends Handler {
    private final WeakReference<hnj> hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj(Message message);
    }

    public ojm(Looper looper, hnj hnjVar) {
        super(looper);
        this.hnj = new WeakReference<>(hnjVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        hnj hnjVar = this.hnj.get();
        if (hnjVar == null || message == null) {
            return;
        }
        hnjVar.hnj(message);
    }
}
