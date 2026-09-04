package bd;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzlt;
import com.google.firebase.f;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b implements bd.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile bd.a f8841c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AppMeasurementSdk f8842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f8843b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements bd.a.InterfaceC0113a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f8845b;

        a(b bVar, String str) {
            this.f8844a = str;
            Objects.requireNonNull(bVar);
            this.f8845b = bVar;
        }
    }

    b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f8842a = appMeasurementSdk;
        this.f8843b = new ConcurrentHashMap();
    }

    public static bd.a g(f fVar, Context context, ae.d dVar) {
        Preconditions.checkNotNull(fVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f8841c == null) {
            synchronized (b.class) {
                try {
                    if (f8841c == null) {
                        Bundle bundle = new Bundle(1);
                        if (fVar.u()) {
                            dVar.a(com.google.firebase.b.class, d.f8847a, c.f8846a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.t());
                        }
                        f8841c = new b(zzez.zza(context, bundle).zzb());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f8841c;
    }

    static /* synthetic */ void h(ae.a aVar) {
        throw null;
    }

    private final boolean i(String str) {
        if (str.isEmpty()) {
            return false;
        }
        Map map = this.f8843b;
        return map.containsKey(str) && map.get(str) != null;
    }

    @Override // bd.a
    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.b(str2, bundle) && com.google.firebase.analytics.connector.internal.b.e(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f8842a.logEvent(str, str2, bundle);
        }
    }

    @Override // bd.a
    public Map c(boolean z10) {
        return this.f8842a.getUserProperties(null, null, z10);
    }

    @Override // bd.a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.b.b(str2, bundle)) {
            this.f8842a.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @Override // bd.a
    public bd.a.InterfaceC0113a d(String str, bd.a.b bVar) {
        Object fVar;
        Preconditions.checkNotNull(bVar);
        if (com.google.firebase.analytics.connector.internal.b.a(str) && !i(str)) {
            AppMeasurementSdk appMeasurementSdk = this.f8842a;
            if (AppMeasurement.FIAM_ORIGIN.equals(str)) {
                fVar = new com.google.firebase.analytics.connector.internal.d(appMeasurementSdk, bVar);
            } else {
                fVar = "clx".equals(str) ? new com.google.firebase.analytics.connector.internal.f(appMeasurementSdk, bVar) : null;
            }
            if (fVar != null) {
                this.f8843b.put(str, fVar);
                return new a(this, str);
            }
        }
        return null;
    }

    @Override // bd.a
    public int e(String str) {
        return this.f8842a.getMaxUserProperties(str);
    }

    @Override // bd.a
    public List f(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f8842a.getConditionalUserProperties(str, str2)) {
            int i10 = com.google.firebase.analytics.connector.internal.b.f22089g;
            Preconditions.checkNotNull(bundle);
            bd.a.c cVar = new bd.a.c();
            cVar.f8826a = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "origin", String.class, null));
            cVar.f8827b = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "name", String.class, null));
            cVar.f8828c = zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
            cVar.f8829d = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            cVar.f8830e = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            cVar.f8831f = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            cVar.f8832g = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            cVar.f8833h = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            cVar.f8834i = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            cVar.f8835j = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            cVar.f8836k = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            cVar.f8837l = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            cVar.f8839n = ((Boolean) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f8838m = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            cVar.f8840o = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // bd.a
    public void a(bd.a.c cVar) {
        String str;
        int i10 = com.google.firebase.analytics.connector.internal.b.f22089g;
        if (cVar == null || (str = cVar.f8826a) == null || str.isEmpty()) {
            return;
        }
        Object obj = cVar.f8828c;
        if ((obj == null || zzlt.zzb(obj) != null) && com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.d(str, cVar.f8827b)) {
            String str2 = cVar.f8836k;
            if (str2 == null || (com.google.firebase.analytics.connector.internal.b.b(str2, cVar.f8837l) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f8836k, cVar.f8837l))) {
                String str3 = cVar.f8833h;
                if (str3 == null || (com.google.firebase.analytics.connector.internal.b.b(str3, cVar.f8834i) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f8833h, cVar.f8834i))) {
                    String str4 = cVar.f8831f;
                    if (str4 == null || (com.google.firebase.analytics.connector.internal.b.b(str4, cVar.f8832g) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f8831f, cVar.f8832g))) {
                        AppMeasurementSdk appMeasurementSdk = this.f8842a;
                        Bundle bundle = new Bundle();
                        String str5 = cVar.f8826a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = cVar.f8827b;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj2 = cVar.f8828c;
                        if (obj2 != null) {
                            zzjh.zza(bundle, obj2);
                        }
                        String str7 = cVar.f8829d;
                        if (str7 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str7);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, cVar.f8830e);
                        String str8 = cVar.f8831f;
                        if (str8 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str8);
                        }
                        Bundle bundle2 = cVar.f8832g;
                        if (bundle2 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
                        }
                        String str9 = cVar.f8833h;
                        if (str9 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str9);
                        }
                        Bundle bundle3 = cVar.f8834i;
                        if (bundle3 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, cVar.f8835j);
                        String str10 = cVar.f8836k;
                        if (str10 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str10);
                        }
                        Bundle bundle4 = cVar.f8837l;
                        if (bundle4 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, cVar.f8838m);
                        bundle.putBoolean(HqKnbV.FFHsGOxf, cVar.f8839n);
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, cVar.f8840o);
                        appMeasurementSdk.setConditionalUserProperty(bundle);
                    }
                }
            }
        }
    }
}
