package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzazn implements Runnable {
    private zzazn() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzazo.zzd = MessageDigest.getInstance(SameMD5.TAG);
            countDownLatch = zzazo.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzazo.zzb;
        } catch (Throwable th2) {
            zzazo.zzb.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }

    /* synthetic */ zzazn(byte[] bArr) {
    }
}
