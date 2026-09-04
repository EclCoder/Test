package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static y f855d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f858c = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f860b;

        a() {
        }
    }

    y(Context context, LocationManager locationManager) {
        this.f856a = context;
        this.f857b = locationManager;
    }

    static y a(Context context) {
        if (f855d == null) {
            Context applicationContext = context.getApplicationContext();
            f855d = new y(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f855d;
    }

    private Location b() {
        Location locationC = androidx.core.content.f.b(this.f856a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = androidx.core.content.f.b(this.f856a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f857b.isProviderEnabled(str)) {
                return this.f857b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f858c.f860b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f858c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        x xVarB = x.b();
        xVarB.a(jCurrentTimeMillis - com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS, location.getLatitude(), location.getLongitude());
        xVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = xVarB.f854c == 1;
        long j11 = xVarB.f853b;
        long j12 = xVarB.f852a;
        xVarB.a(jCurrentTimeMillis + com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS, location.getLatitude(), location.getLongitude());
        long j13 = xVarB.f853b;
        if (j11 == -1 || j12 == -1) {
            j10 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j12) {
                j11 = j13;
            } else if (jCurrentTimeMillis > j11) {
                j11 = j12;
            }
            j10 = j11 + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
        aVar.f859a = z10;
        aVar.f860b = j10;
    }

    boolean d() {
        a aVar = this.f858c;
        if (e()) {
            return aVar.f859a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f859a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
