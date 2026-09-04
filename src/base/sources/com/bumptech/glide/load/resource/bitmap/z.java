package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f11580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f11581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final File f11582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile z f11583h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11586c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f11587d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11584a = 20000;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f11580e = i10 < 29;
        f11581f = i10 >= 28;
        f11582g = new File("/proc/self/fd");
    }

    z() {
    }

    private boolean a() {
        return f11580e && !this.f11587d.get();
    }

    public static z b() {
        if (f11583h == null) {
            synchronized (z.class) {
                try {
                    if (f11583h == null) {
                        f11583h = new z();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f11583h;
    }

    private int c() {
        if (e()) {
            return 500;
        }
        return this.f11584a;
    }

    private synchronized boolean d() {
        try {
            boolean z10 = true;
            int i10 = this.f11585b + 1;
            this.f11585b = i10;
            if (i10 >= 50) {
                this.f11585b = 0;
                int length = f11582g.list().length;
                long jC = c();
                if (length >= jC) {
                    z10 = false;
                }
                this.f11586c = z10;
                if (!z10 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jC);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f11586c;
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f11581f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i10 < 0 || i11 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    boolean g(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean zF = f(i10, i11, z10, z11);
        if (zF) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zF;
    }

    public void h() {
        m6.l.a();
        this.f11587d.set(true);
    }
}
