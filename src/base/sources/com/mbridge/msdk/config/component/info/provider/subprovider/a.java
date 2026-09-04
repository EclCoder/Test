package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile a f28754h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28755a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28756b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28757c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28758d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f28759e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f28760f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicBoolean f28761g = new AtomicBoolean(false);

    private a() {
    }

    public static a b() {
        if (f28754h == null) {
            synchronized (a.class) {
                try {
                    if (f28754h == null) {
                        f28754h = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f28754h;
    }

    private void c() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f28756b = com.mbridge.msdk.config.component.common.util.b.a(contextD).a("adId", "");
        this.f28758d = com.mbridge.msdk.config.component.common.util.b.a(contextD).a("isLimitAdId", -1);
    }

    public Map<String, Object> a() {
        String str;
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(this.f28755a)) {
            str = TextUtils.isEmpty(this.f28756b) ? "" : this.f28756b;
        } else {
            str = this.f28755a;
        }
        int i10 = this.f28757c;
        if (i10 == -1 && (i10 = this.f28758d) == -1) {
            i10 = 0;
        }
        map.put("adId", str);
        map.put("adIdB64", TextUtils.isEmpty(str) ? "" : k0.b(str));
        map.put("adIdLimit", String.valueOf(i10));
        map.put("amazonIdInfo", this.f28759e);
        map.put("amazonIdInfoB64", this.f28760f);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        try {
            Map<String, Object> mapA = a(com.mbridge.msdk.foundation.controller.c.n().d());
            a(this.f28755a, this.f28757c);
            if (aVar != null) {
                aVar.a(mapA);
            }
        } catch (Throwable th2) {
            q0.b("ADIDProvider", th2.getMessage());
        }
    }

    public void a(final com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f28776a.b(aVar);
            }
        });
    }

    public Map<String, Object> a(Context context) {
        String str;
        if (context == null) {
            return new HashMap();
        }
        try {
            c();
            try {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                    this.f28755a = advertisingIdInfo.getId();
                    this.f28757c = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                } catch (Exception unused) {
                    q0.d("ADIDProvider", "GET ADID FROM GOOGLE PLAY APP ERROR");
                }
            } catch (Exception unused2) {
                com.mbridge.msdk.foundation.tools.c.b bVarA = new com.mbridge.msdk.foundation.tools.c().a(context);
                this.f28755a = bVarA.a();
                this.f28757c = bVarA.b() ? 1 : 0;
            } catch (Throwable th2) {
                q0.b("ADIDProvider", th2.getMessage());
            }
            if (!b(context)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                    int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                    String string = Settings.Secure.getString(contentResolver, "advertising_id");
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, i10);
                    jSONObject.put("amazonId", string);
                    String string2 = jSONObject.toString();
                    if (!TextUtils.isEmpty(string2)) {
                        this.f28759e = string2;
                        this.f28760f = k0.b(string2);
                    }
                } catch (Throwable th3) {
                    q0.b("ADIDProvider", th3.getMessage());
                }
            }
        } catch (Throwable th4) {
            q0.b("ADIDProvider", th4.getMessage());
        }
        if (TextUtils.isEmpty(this.f28755a)) {
            str = TextUtils.isEmpty(this.f28756b) ? "" : this.f28756b;
        } else {
            str = this.f28755a;
        }
        this.f28755a = str;
        int i11 = this.f28757c;
        if (i11 == -1 && (i11 = this.f28758d) == -1) {
            i11 = 0;
        }
        this.f28757c = i11;
        this.f28761g.set(true);
        HashMap map = new HashMap();
        map.put("adId", this.f28755a);
        map.put("adIdB64", k0.b(this.f28755a));
        map.put("isLimitAdId", Integer.valueOf(this.f28757c));
        map.put("amazonIdInfo", this.f28759e);
        map.put("amazonIdInfoB64", this.f28760f);
        return map;
    }

    private boolean b(Context context) {
        return "amazon".equalsIgnoreCase(Build.MANUFACTURER) || (context != null ? context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv") : false);
    }

    private void a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (str.equals(this.f28756b) && i10 == this.f28758d) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(contextD).b("adId", str);
        com.mbridge.msdk.config.component.common.util.b.a(contextD).b("isLimitAdId", i10);
    }
}
