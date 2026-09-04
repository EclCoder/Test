package i7;

import am.j;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.privacysandbox.ads.adservices.measurement.e;
import bm.r;
import com.facebook.appevents.d;
import com.facebook.h0;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import fl.g0;
import java.net.URLEncoder;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41169a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f41170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f41171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static h7.a f41172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f41173e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends t implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f41174a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject) {
            super(1);
            this.f41174a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            Object objOpt = this.f41174a.opt(str);
            if (objOpt == null) {
                return null;
            }
            try {
                return URLEncoder.encode(str, C.UTF8_NAME) + '=' + URLEncoder.encode(objOpt.toString(), C.UTF8_NAME);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: i7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0625b implements OutcomeReceiver {
        C0625b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            s.h(error, "error");
            Log.d(b.c(), "OUTCOME_RECEIVER_TRIGGER_FAILURE");
            h7.a aVarB = b.b();
            if (aVarB == null) {
                s.w("gpsDebugLogger");
                aVarB = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_ara_failed_reason", error.toString());
            g0 g0Var = g0.f38750a;
            aVarB.b("gps_ara_failed", bundle);
        }

        public void onResult(Object result) {
            s.h(result, "result");
            Log.d(b.c(), "OUTCOME_RECEIVER_TRIGGER_SUCCESS");
            h7.a aVarB = b.b();
            if (aVarB == null) {
                s.w("gpsDebugLogger");
                aVarB = null;
            }
            aVarB.b("gps_ara_succeed", null);
        }
    }

    static {
        String string = b.class.toString();
        s.g(string, "GpsAraTriggersManager::class.java.toString()");
        f41170b = string;
    }

    private b() {
    }

    public static final /* synthetic */ h7.a b() {
        if (x7.a.c(b.class)) {
            return null;
        }
        try {
            return f41172d;
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (x7.a.c(b.class)) {
            return null;
        }
        try {
            return f41170b;
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
            return null;
        }
    }

    private final boolean d() {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            if (!f41171c || Build.VERSION.SDK_INT < 33) {
                return false;
            }
            h7.a aVar = null;
            try {
                Class.forName("android.adservices.measurement.MeasurementManager");
                Class.forName("android.os.OutcomeReceiver");
                return true;
            } catch (Error e10) {
                Log.i(f41170b, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                h7.a aVar2 = f41172d;
                if (aVar2 == null) {
                    s.w("gpsDebugLogger");
                } else {
                    aVar = aVar2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", e10.toString());
                g0 g0Var = g0.f38750a;
                aVar.b("gps_ara_failed", bundle);
                return false;
            } catch (Exception e11) {
                Log.i(f41170b, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                h7.a aVar3 = f41172d;
                if (aVar3 == null) {
                    s.w("gpsDebugLogger");
                } else {
                    aVar = aVar3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_ara_failed_reason", e11.toString());
                g0 g0Var2 = g0.f38750a;
                aVar.b("gps_ara_failed", bundle2);
                return false;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    public static final void e() {
        if (x7.a.c(b.class)) {
            return;
        }
        try {
            f41171c = true;
            f41172d = new h7.a(h0.m());
            f41173e = "https://www." + h0.w() + "/privacy_sandbox/mobile/register/trigger";
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
        }
    }

    private final String f(d dVar) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            JSONObject jSONObjectH = dVar.h();
            if (jSONObjectH != null && jSONObjectH.length() != 0) {
                Iterator<String> itKeys = jSONObjectH.keys();
                s.g(itKeys, "params.keys()");
                return j.w(j.z(j.e(itKeys), new a(jSONObjectH)), "&", null, null, 0, null, null, 62, null);
            }
            return "";
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final boolean g(d dVar) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            String eventName = dVar.h().getString("_eventName");
            if (!s.c(eventName, "_removed_")) {
                s.g(eventName, "eventName");
                if (!r.T(eventName, "gps", false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(String applicationId, d event) {
        if (x7.a.c(b.class)) {
            return;
        }
        try {
            s.h(applicationId, "$applicationId");
            s.h(event, "$event");
            f41169a.h(applicationId, event);
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
        }
    }

    public final void h(String applicationId, d event) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(applicationId, "applicationId");
            s.h(event, "event");
            if (g(event) && d()) {
                Context contextM = h0.m();
                h7.a aVar = null;
                try {
                    MeasurementManager measurementManagerA = e.a(contextM.getSystemService(androidx.privacysandbox.ads.adservices.measurement.d.a()));
                    if (measurementManagerA == null) {
                        measurementManagerA = MeasurementManager.get(contextM.getApplicationContext());
                    }
                    if (measurementManagerA == null) {
                        Log.w(f41170b, "FAILURE_GET_MEASUREMENT_MANAGER");
                        h7.a aVar2 = f41172d;
                        if (aVar2 == null) {
                            s.w("gpsDebugLogger");
                            aVar2 = null;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("gps_ara_failed_reason", "Failed to get measurement manager");
                        g0 g0Var = g0.f38750a;
                        aVar2.b("gps_ara_failed", bundle);
                        return;
                    }
                    String strF = f(event);
                    StringBuilder sb2 = new StringBuilder();
                    String str = f41173e;
                    if (str == null) {
                        s.w("serverUri");
                        str = null;
                    }
                    sb2.append(str);
                    sb2.append('?');
                    sb2.append(MBridgeConstans.APP_ID);
                    sb2.append('=');
                    sb2.append(applicationId);
                    sb2.append('&');
                    sb2.append(strF);
                    Uri uri = Uri.parse(sb2.toString());
                    s.g(uri, "parse(\"$serverUri?$appId…=$applicationId&$params\")");
                    measurementManagerA.registerTrigger(uri, h0.v(), new C0625b());
                } catch (Error e10) {
                    Log.w(f41170b, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                    h7.a aVar3 = f41172d;
                    if (aVar3 == null) {
                        s.w("gpsDebugLogger");
                    } else {
                        aVar = aVar3;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("gps_ara_failed_reason", e10.toString());
                    g0 g0Var2 = g0.f38750a;
                    aVar.b("gps_ara_failed", bundle2);
                } catch (Exception e11) {
                    Log.w(f41170b, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                    h7.a aVar4 = f41172d;
                    if (aVar4 == null) {
                        s.w("gpsDebugLogger");
                    } else {
                        aVar = aVar4;
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("gps_ara_failed_reason", e11.toString());
                    g0 g0Var3 = g0.f38750a;
                    aVar.b("gps_ara_failed", bundle3);
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void i(final String applicationId, final d event) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(applicationId, "applicationId");
            s.h(event, "event");
            h0.v().execute(new Runnable() { // from class: i7.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.j(applicationId, event);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
