package com.bytedance.sdk.openadsdk.p000do.hn;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.aq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static HandlerThread f14320hn;
    private static hnj hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj extends Handler {
        public hnj(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            hn hnVar = (hn) message.obj;
            if (hnVar == null) {
                return;
            }
            int iHn = hnVar.hn();
            if (iHn == 1) {
                hnVar.dse();
            } else {
                if (iHn != 2) {
                    sk.hn(hnVar.dnm());
                    return;
                }
                hnVar.aq();
            }
            if (hnVar.ojm()) {
                sk.hn(hnVar.dnm());
            } else if (hnVar.bug()) {
                hnj(hnVar);
            }
        }

        public void hnj(hn hnVar) {
            if (hnVar == null) {
                return;
            }
            int iIntValue = hnVar.dnm().intValue();
            if (hasMessages(iIntValue)) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = iIntValue;
            messageObtain.obj = hnVar;
            sendMessageDelayed(messageObtain, hnVar.dkl());
        }
    }

    public static void hn(hn hnVar) {
        if (hnVar == null || hnj == null) {
            return;
        }
        try {
            int iIntValue = hnVar.dnm().intValue();
            if (hnj.hasMessages(iIntValue)) {
                hnj.removeMessages(iIntValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void hnj() {
    }

    public static void hnj(hn hnVar) {
        if (hnVar == null) {
            return;
        }
        hn();
        hnj hnjVar = hnj;
        if (hnjVar != null) {
            hnjVar.hnj(hnVar);
        }
    }

    public static void hn() {
        if (hnj != null) {
            return;
        }
        try {
            HandlerThread handlerThread = f14320hn;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (dse.class) {
                try {
                    HandlerThread handlerThread2 = f14320hn;
                    if (handlerThread2 == null || !handlerThread2.isAlive()) {
                        f14320hn = aq.hnj("pag_MRC");
                        hnj = new hnj(f14320hn.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            apu.qor("MRC", th3.getMessage());
        }
    }
}
