package com.inmobi.media;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.provider.Settings;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.inmobi.media.C3350ub;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.ub, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3350ub implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3350ub f27616a = new C3350ub();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LocationManager f27617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HandlerThread f27618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static GoogleApiClient f27619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f27620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f27621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final nm.a f27622g;

    static {
        HandlerThread handlerThread = new HandlerThread("LThread");
        f27618c = handlerThread;
        f27620e = C3350ub.class.getSimpleName();
        f27622g = nm.g.b(false, 1, null);
        L6.a(handlerThread, "LThread");
        Context context = Xi.f26021a;
        if (context != null) {
            Object systemService = context.getSystemService("location");
            f27617b = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        }
    }

    public static Location c() {
        try {
            Context context = Xi.f26021a;
            kotlin.jvm.internal.s.e(context);
            FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
            kotlin.jvm.internal.s.g(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
            Task<Location> lastLocation = fusedLocationProviderClient.getLastLocation();
            kotlin.jvm.internal.s.g(lastLocation, "getLastLocation(...)");
            return lastLocation.getResult();
        } catch (Exception unused) {
            return null;
        } catch (IncompatibleClassChangeError e10) {
            String TAG = f27620e;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            e10.toString();
            return null;
        }
    }

    public static boolean d() {
        try {
            return Sf.a(Xi.f26021a, "android.permission.ACCESS_FINE_LOCATION") || Sf.a(Xi.f26021a, "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception unused) {
            String TAG = f27620e;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            return false;
        }
    }

    public static boolean e() {
        int i10;
        Context context = Xi.f26021a;
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            LocationManager locationManager = f27617b;
            return locationManager != null && locationManager.isLocationEnabled();
        }
        try {
            i10 = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException unused) {
            i10 = 0;
        }
        return i10 != 0;
    }

    public static boolean f() {
        try {
            kotlin.jvm.internal.l0.b(GoogleApiClient.class).k();
            kotlin.jvm.internal.l0.b(FusedLocationProviderClient.class).k();
            kotlin.jvm.internal.l0.b(LocationServices.class).k();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        C3324tb c3324tb;
        nm.a aVar;
        if (dVar instanceof C3324tb) {
            c3324tb = (C3324tb) dVar;
            int i10 = c3324tb.f27540d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3324tb.f27540d = i10 - Integer.MIN_VALUE;
            } else {
                c3324tb = new C3324tb(this, dVar);
            }
        } else {
            c3324tb = new C3324tb(this, dVar);
        }
        Object obj = c3324tb.f27538b;
        Object objF = ll.b.f();
        int i11 = c3324tb.f27540d;
        if (i11 == 0) {
            fl.s.b(obj);
            nm.a aVar2 = f27622g;
            c3324tb.f27537a = aVar2;
            c3324tb.f27540d = 1;
            if (aVar2.e(null, c3324tb) == objF) {
                return objF;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = c3324tb.f27537a;
            fl.s.b(obj);
        }
        try {
            try {
                C3350ub c3350ub = f27616a;
                if (d() && e()) {
                    c3350ub.b();
                    if (!f()) {
                        a(Xi.f26021a);
                    }
                }
            } catch (Exception e10) {
                String TAG = f27620e;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                e10.getMessage();
            }
            return fl.g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }

    public final void b() {
        LocationManager locationManager = f27617b;
        if (locationManager != null) {
            Criteria criteria = new Criteria();
            criteria.setBearingAccuracy(2);
            criteria.setPowerRequirement(2);
            criteria.setCostAllowed(false);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider != null) {
                kotlin.jvm.internal.s.g(f27620e, "TAG");
                locationManager.requestSingleUpdate(bestProvider, this, f27618c.getLooper());
            } else {
                String TAG = f27620e;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                kotlin.jvm.internal.s.g(TAG, "TAG");
            }
        }
        fl.g0 g0Var = fl.g0.f38750a;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        LocationManager locationManager;
        kotlin.jvm.internal.s.h(location, "location");
        try {
            String TAG = f27620e;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            location.getTime();
            location.getLatitude();
            location.getLongitude();
            location.getAccuracy();
            if (!d() || (locationManager = f27617b) == null) {
                return;
            }
            locationManager.removeUpdates(this);
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String provider) {
        kotlin.jvm.internal.s.h(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String provider) {
        kotlin.jvm.internal.s.h(provider, "provider");
    }

    public static void a(Context context) {
        try {
            GoogleApiClient googleApiClient = f27619d;
            if (googleApiClient == null) {
                String TAG = f27620e;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                kotlin.jvm.internal.s.e(context);
                GoogleApiClient googleApiClientBuild = new GoogleApiClient.Builder(context).addConnectionCallbacks(new C3298sb()).addOnConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener() { // from class: yh.fc
                    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
                    public final void onConnectionFailed(ConnectionResult connectionResult) {
                        C3350ub.a(connectionResult);
                    }
                }).addApi(LocationServices.API).build();
                f27619d = googleApiClientBuild;
                if (googleApiClientBuild != null) {
                    googleApiClientBuild.connect();
                    return;
                }
                return;
            }
            googleApiClient.connect();
        } catch (Exception e10) {
            String TAG2 = f27620e;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            e10.getMessage();
        }
    }

    public static final void a(ConnectionResult it) {
        kotlin.jvm.internal.s.h(it, "it");
        f27621f = false;
    }

    public static Location a() {
        Location location;
        Location locationC;
        Location locationA;
        try {
            if (e() && d()) {
                locationC = f27621f ? c() : null;
                try {
                    locationA = (f27617b == null || !Sf.a(Xi.f26021a, "android.permission.ACCESS_COARSE_LOCATION")) ? null : a(2, 2);
                } catch (Exception e10) {
                    location = locationC;
                    e = e10;
                    String TAG = f27620e;
                    kotlin.jvm.internal.s.g(TAG, "TAG");
                    e.getMessage();
                    locationC = location;
                }
            } else {
                locationC = null;
                locationA = null;
            }
        } catch (Exception e11) {
            e = e11;
            location = null;
        }
        if (locationC == null && locationA == null) {
            String TAG2 = f27620e;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            return null;
        }
        return a(locationC, locationA);
    }

    public static Location a(Location location, Location location2) {
        if (location == null) {
            String TAG = f27620e;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            if (location2 != null) {
                location2.getTime();
            }
            Objects.toString(location2);
            return location2;
        }
        if (location2 == null) {
            String TAG2 = f27620e;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            location.getTime();
            location.toString();
            return location;
        }
        long time = location.getTime() - location2.getTime();
        boolean z10 = time > 120000;
        boolean z11 = time < -120000;
        boolean z12 = time > 0;
        if (z10) {
            String TAG3 = f27620e;
            kotlin.jvm.internal.s.g(TAG3, "TAG");
            location.getTime();
            location.toString();
            return location;
        }
        if (z11) {
            String TAG4 = f27620e;
            kotlin.jvm.internal.s.g(TAG4, "TAG");
            location2.getTime();
            location2.toString();
            return location2;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z13 = accuracy > 0;
        boolean z14 = accuracy < 0;
        boolean z15 = accuracy > 200;
        if (!z14 && (!z12 || (z13 && z15))) {
            String TAG5 = f27620e;
            kotlin.jvm.internal.s.g(TAG5, "TAG");
            location2.getTime();
            location2.toString();
            return location2;
        }
        String TAG6 = f27620e;
        kotlin.jvm.internal.s.g(TAG6, "TAG");
        location.getTime();
        location.toString();
        return location;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[DONT_INVERT, PHI: r1
      0x0057: PHI (r1v4 android.location.Location) = 
      (r1v3 android.location.Location)
      (r1v3 android.location.Location)
      (r1v3 android.location.Location)
      (r1v5 android.location.Location)
     binds: [B:31:0x0057, B:17:0x0047, B:19:0x004d, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:15:0x003d->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x005d A[EDGE_INSN: B:38:0x005d->B:28:0x005d BREAK  A[LOOP:0: B:15:0x003d->B:26:0x005a], SYNTHETIC] */
    public static Location a(int i10, int i11) {
        String bestProvider;
        Location lastKnownLocation;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(i10);
        criteria.setPowerRequirement(i11);
        criteria.setCostAllowed(false);
        LocationManager locationManager = f27617b;
        Location lastKnownLocation2 = null;
        if (locationManager != null && (bestProvider = locationManager.getBestProvider(criteria, true)) != null) {
            try {
                lastKnownLocation = locationManager.getLastKnownLocation(bestProvider);
            } catch (Exception unused) {
                lastKnownLocation = null;
            }
            if (lastKnownLocation != null || i10 == 1) {
                lastKnownLocation2 = lastKnownLocation;
            } else {
                LocationManager locationManager2 = f27617b;
                if (locationManager2 != null) {
                    kotlin.jvm.internal.s.e(locationManager2);
                    List<String> providers = locationManager2.getProviders(true);
                    kotlin.jvm.internal.s.g(providers, "getProviders(...)");
                    int size = providers.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i12 = size - 1;
                            String str = providers.get(size);
                            try {
                                LocationManager locationManager3 = f27617b;
                                if (locationManager3 != null && locationManager3.isProviderEnabled(str)) {
                                    try {
                                        lastKnownLocation2 = locationManager3.getLastKnownLocation(str);
                                    } catch (SecurityException unused2) {
                                    }
                                    if (lastKnownLocation2 != null) {
                                        break;
                                    }
                                    if (i12 < 0) {
                                        break;
                                        break;
                                    }
                                    size = i12;
                                } else {
                                    if (i12 < 0) {
                                        break;
                                    }
                                    size = i12;
                                }
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
            }
        }
        String TAG = f27620e;
        kotlin.jvm.internal.s.g(TAG, "TAG");
        return lastKnownLocation2;
    }

    public static HashMap a(Location location, boolean z10, Location location2) {
        HashMap map = new HashMap();
        Context context = Xi.f26021a;
        if (context != null) {
            if (location != null) {
                if (location.getTime() > 0) {
                    map.put("u-ll-ts", Long.valueOf(location.getTime()));
                }
                map.put("u-latlong-accu", a(location));
                map.put("sdk-collected", Integer.valueOf(z10 ? 1 : 0));
            }
            C3484zh c3484zh = AbstractC3229pj.f27269a;
            if (Xi.b() == null || AbstractC3229pj.a().getLocationEnabled()) {
                map.put("loc-allowed", Integer.valueOf(e() ? 1 : 0));
            }
            if (location2 != null) {
                map.put("u-latlong-accu-fine", a(location2));
                map.put("u-ll-ts-fine", Long.valueOf(location2.getTime()));
            }
            if (e() && d()) {
                if (Sf.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                    map.put("loc-granularity", "coarse");
                }
            } else {
                map.put("loc-granularity", DevicePublicKeyStringDef.NONE);
                return map;
            }
        }
        return map;
    }

    public static String a(Location location) {
        return location.getLatitude() + "," + location.getLongitude() + "," + ((int) location.getAccuracy());
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
