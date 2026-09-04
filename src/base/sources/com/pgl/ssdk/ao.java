package com.pgl.ssdk;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ao implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f35339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f35341c;

    public ao(Context context, int i10, Object[] objArr) {
        this.f35339a = context;
        this.f35340b = i10;
        this.f35341c = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f35340b == 222) {
                ak.a(this.f35339a).a();
            }
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(this.f35340b, this.f35339a, this.f35341c);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            new ap(this.f35339a, this.f35340b).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
