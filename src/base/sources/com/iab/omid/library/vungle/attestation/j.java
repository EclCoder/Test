package com.iab.omid.library.vungle.attestation;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public class j implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile j f24223d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Boolean f24224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Boolean f24225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f24226c;

    private j(Context context) {
        this.f24226c = context;
        c();
    }

    public static j a(Context context) {
        if (f24223d == null) {
            synchronized (j.class) {
                try {
                    if (f24223d == null) {
                        f24223d = new j(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f24223d;
    }

    public boolean b() {
        boolean zHasSystemFeature;
        if (this.f24225b != null) {
            return this.f24225b.booleanValue();
        }
        synchronized (this) {
            try {
                if (this.f24225b == null) {
                    if (c()) {
                        try {
                            PackageManager packageManager = this.f24226c.getPackageManager();
                            if (packageManager == null) {
                                com.iab.omid.library.vungle.utils.d.b("PackageManager is null when checking attestation capability");
                                this.f24225b = Boolean.FALSE;
                            } else {
                                zHasSystemFeature = packageManager.hasSystemFeature("com.amazon.privacypass");
                                this.f24225b = Boolean.valueOf(zHasSystemFeature);
                            }
                        } catch (SecurityException e10) {
                            com.iab.omid.library.vungle.utils.d.a("Security exception when checking attestation capability", e10);
                            this.f24225b = Boolean.FALSE;
                            return false;
                        } catch (Exception e11) {
                            com.iab.omid.library.vungle.utils.d.a("Unexpected error when checking attestation capability", e11);
                            this.f24225b = Boolean.FALSE;
                            return false;
                        }
                    } else {
                        this.f24225b = Boolean.FALSE;
                    }
                    return false;
                }
                zHasSystemFeature = this.f24225b.booleanValue();
                return zHasSystemFeature;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean c() {
        boolean zBooleanValue;
        int i10;
        if (this.f24224a != null) {
            return this.f24224a.booleanValue();
        }
        synchronized (this) {
            try {
                if (this.f24224a != null) {
                    zBooleanValue = this.f24224a.booleanValue();
                } else {
                    zBooleanValue = this.f24226c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && (i10 = Build.VERSION.SDK_INT) >= 25 && i10 <= 30;
                    this.f24224a = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    @Override // com.iab.omid.library.vungle.attestation.k
    public boolean a() {
        return c();
    }
}
