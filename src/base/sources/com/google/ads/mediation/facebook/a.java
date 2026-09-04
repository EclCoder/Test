package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class a implements AudienceNetworkAds.InitListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f16298d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f16299a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16300b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f16301c = new ArrayList();

    /* JADX INFO: renamed from: com.google.ads.mediation.facebook.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface InterfaceC0275a {
        void a(AdError adError);

        void b();
    }

    private a() {
    }

    static a a() {
        if (f16298d == null) {
            f16298d = new a();
        }
        return f16298d;
    }

    void b(Context context, ArrayList arrayList, InterfaceC0275a interfaceC0275a) {
        if (this.f16299a) {
            this.f16301c.add(interfaceC0275a);
        } else {
            if (this.f16300b) {
                interfaceC0275a.b();
                return;
            }
            this.f16299a = true;
            a().f16301c.add(interfaceC0275a);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.21.0.2").withPlacementIds(arrayList).withInitListener(this).initialize();
        }
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        int i10 = 0;
        this.f16299a = false;
        this.f16300b = initResult.isSuccess();
        ArrayList arrayList = this.f16301c;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            InterfaceC0275a interfaceC0275a = (InterfaceC0275a) obj;
            if (initResult.isSuccess()) {
                interfaceC0275a.b();
            } else {
                interfaceC0275a.a(new AdError(104, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN));
            }
        }
        this.f16301c.clear();
    }
}
