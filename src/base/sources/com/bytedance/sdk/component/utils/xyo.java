package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class xyo extends Handler {
    protected WeakReference<hnj> hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj(Message message);
    }

    public xyo(hnj hnjVar) {
        if (hnjVar != null) {
            this.hnj = new WeakReference<>(hnjVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        hnj hnjVar;
        WeakReference<hnj> weakReference = this.hnj;
        if (weakReference == null || (hnjVar = weakReference.get()) == null || message == null) {
            return;
        }
        hnjVar.hnj(message);
    }

    public xyo(Looper looper, hnj hnjVar) {
        super(looper);
        if (hnjVar != null) {
            this.hnj = new WeakReference<>(hnjVar);
        }
    }
}
