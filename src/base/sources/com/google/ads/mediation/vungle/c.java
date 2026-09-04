package com.google.ads.mediation.vungle;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.VungleError;
import com.vungle.ads.g0;
import com.vungle.ads.k0;
import com.vungle.ads.p;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f16376c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f16377a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f16378b = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(AdError adError);

        void b();
    }

    private c() {
        g0.setIntegrationName("admob", "7.7.2.0".replace('.', '_'));
    }

    public static c a() {
        return f16376c;
    }

    public void b(String str, Context context, a aVar) {
        if (d.f16380b.isInitialized()) {
            aVar.b();
        } else {
            if (this.f16377a.getAndSet(true)) {
                this.f16378b.add(aVar);
                return;
            }
            c(MobileAds.getRequestConfiguration());
            d.f16380b.a(context, str, this);
            this.f16378b.add(aVar);
        }
    }

    public void c(RequestConfiguration requestConfiguration) {
        if (requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1) {
            k0.setCOPPAStatus(true);
        } else if (requestConfiguration.getTagForChildDirectedTreatment() == 0 || requestConfiguration.getTagForUnderAgeOfConsent() == 0) {
            k0.setCOPPAStatus(false);
        }
    }

    @Override // com.vungle.ads.p
    public void onError(VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        ArrayList arrayList = this.f16378b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((a) obj).a(adError);
        }
        this.f16378b.clear();
        this.f16377a.set(false);
    }

    @Override // com.vungle.ads.p
    public void onSuccess() {
        ArrayList arrayList = this.f16378b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((a) obj).b();
        }
        this.f16378b.clear();
        this.f16377a.set(false);
    }
}
