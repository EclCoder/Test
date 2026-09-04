package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CallableC1599Ss implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C1604Sx A01;

    public CallableC1599Ss(C1604Sx c1604Sx, C1600St c1600St) {
        this.A01 = c1604Sx;
        new Handler(Looper.getMainLooper()).post(new C2201gl(this, c1604Sx, c1600St));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C1600St c1600St) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2129fb c2129fbA06 = C2129fb.A06(this.A01.A04.A02());
        Uri uriA00 = XB.A00(c1600St.A08);
        long jA0S = c1600St.A00;
        if (jA0S == -1) {
            jA0S = C1648Up.A0S(this.A01.A04);
        }
        c2129fbA06.A0I(uriA00, new C2200gk(this, c1600St, jA0S, jCurrentTimeMillis), jA0S);
    }
}
