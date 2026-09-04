package com.google.ads.mediation.pangle;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static b f16363f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f16364a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16365b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f16366c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f16367d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.a f16368e = new com.google.ads.mediation.pangle.a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(AdError adError);

        void b();
    }

    private b() {
    }

    public static b a() {
        if (f16363f == null) {
            f16363f = new b();
        }
        return f16363f;
    }

    public void b(Context context, String str, a aVar) {
        if (TextUtils.isEmpty(str)) {
            AdError adErrorA = u8.a.a(101, "Failed to initialize Pangle SDK. Missing or invalid App ID.");
            Log.w(PangleMediationAdapter.TAG, adErrorA.toString());
            aVar.a(adErrorA);
        } else {
            if (this.f16364a) {
                this.f16366c.add(aVar);
                return;
            }
            if (this.f16365b) {
                aVar.b();
                return;
            }
            this.f16364a = true;
            this.f16366c.add(aVar);
            this.f16367d.c(context, this.f16368e.a().appId(str).setAdxId("207").setUserData(String.format("[{\"name\":\"mediation\",\"value\":\"google\"},{\"name\":\"adapter_version\",\"value\":\"%s\"}]", "7.9.1.3.0")).build(), this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void fail(int i10, String str) {
        int i11 = 0;
        this.f16364a = false;
        this.f16365b = false;
        AdError adErrorC = u8.a.c(i10, str);
        ArrayList arrayList = this.f16366c;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((a) obj).a(adErrorC);
        }
        this.f16366c.clear();
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void success() {
        int i10 = 0;
        this.f16364a = false;
        this.f16365b = true;
        ArrayList arrayList = this.f16366c;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((a) obj).b();
        }
        this.f16366c.clear();
    }
}
