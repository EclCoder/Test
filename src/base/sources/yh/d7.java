package yh;

import android.content.Context;
import android.content.Intent;
import com.inmobi.media.C2842ak;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f57662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f57663b;

    public /* synthetic */ d7(Intent intent, Context context) {
        this.f57662a = intent;
        this.f57663b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2842ak.a(this.f57662a, this.f57663b);
    }
}
