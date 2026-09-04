package com.facebook.appevents;

import android.preference.PreferenceManager;
import android.util.Log;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f14910a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f14911b = c.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ReentrantReadWriteLock f14912c = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f14913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile boolean f14914e;

    private c() {
    }

    public static final String b() {
        if (!f14914e) {
            Log.w(f14911b, "initStore should have been called before calling setUserID");
            f14910a.c();
        }
        f14912c.readLock().lock();
        try {
            return f14913d;
        } finally {
            f14912c.readLock().unlock();
        }
    }

    public static final void d() {
        if (f14914e) {
            return;
        }
        o0.f14970b.c().execute(new Runnable() { // from class: com.facebook.appevents.b
            @Override // java.lang.Runnable
            public final void run() {
                c.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        f14910a.c();
    }

    private final void c() {
        if (f14914e) {
            return;
        }
        f14912c.writeLock().lock();
        try {
            if (!f14914e) {
                f14913d = PreferenceManager.getDefaultSharedPreferences(com.facebook.h0.m()).getString(obFGmWgqyy.vKbgPZmQbP, null);
                f14914e = true;
            }
        } finally {
            f14912c.writeLock().unlock();
        }
    }
}
