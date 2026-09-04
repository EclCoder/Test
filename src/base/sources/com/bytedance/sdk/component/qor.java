package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static volatile Handler f12941hn;
    private static final Object hnj = new Object();
    private static final LinkedList<Runnable> qor = new LinkedList<>();
    private static Object gjv = new Object();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj extends Handler {
        hnj(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    qor.qor();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    private static Handler hn() {
        Handler handler;
        if (f12941hn != null) {
            return f12941hn;
        }
        synchronized (hnj) {
            try {
                if (f12941hn == null) {
                    hn.hnj hnjVar = hn.hnj;
                    HandlerThread handlerThreadHnj = hnjVar != null ? hnjVar.hnj("queued-work-looper", -2) : null;
                    if (handlerThreadHnj == null) {
                        handlerThreadHnj = new HandlerThread("queued-work-looper", -2);
                        handlerThreadHnj.start();
                    }
                    f12941hn = new hnj(handlerThreadHnj.getLooper());
                }
                handler = f12941hn;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void qor() {
        LinkedList linkedList;
        synchronized (gjv) {
            try {
                synchronized (hnj) {
                    LinkedList<Runnable> linkedList2 = qor;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    hn().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void hnj(Runnable runnable, boolean z10) {
        try {
            Handler handlerHn = hn();
            synchronized (hnj) {
                try {
                    qor.add(runnable);
                    if (z10) {
                        handlerHn.sendEmptyMessageDelayed(1, 100L);
                    } else {
                        handlerHn.sendEmptyMessage(1);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }
}
