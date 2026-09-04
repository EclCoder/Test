package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.inmobi.sdk.SdkInitializationListener;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class j implements SdkInitializationListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static j f16315d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f16317b = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f16316a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f16318c = new o();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(AdError adError);

        void b();
    }

    private j() {
    }

    public static j a() {
        if (f16315d == null) {
            f16315d = new j();
        }
        return f16315d;
    }

    public void b(Context context, String str, a aVar) {
        if (this.f16316a == 2) {
            aVar.b();
            return;
        }
        this.f16317b.add(aVar);
        if (this.f16316a == 1) {
            return;
        }
        this.f16316a = 1;
        this.f16318c.c(context, str, f.a(), this);
    }

    @Override // com.inmobi.sdk.SdkInitializationListener
    public void onInitializationComplete(Error error) {
        int i10 = 0;
        if (error == null) {
            Log.d(InMobiMediationAdapter.TAG, "InMobi SDK initialized.");
            this.f16316a = 2;
            ArrayList arrayList = this.f16317b;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((a) obj).b();
            }
        } else {
            this.f16316a = 0;
            AdError adErrorA = g.a(101, error.getLocalizedMessage());
            ArrayList arrayList2 = this.f16317b;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                ((a) obj2).a(adErrorA);
            }
        }
        this.f16317b.clear();
    }
}
