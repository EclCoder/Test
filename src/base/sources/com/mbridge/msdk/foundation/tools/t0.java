package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f30964a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f30965b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f30966c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f30967d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f30968e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t0.b();
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f30965b) {
                return;
            }
            f30965b = true;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                f30964a = externalFilesDir.getAbsolutePath();
            }
            try {
                b(context);
            } catch (Exception unused) {
                b(context);
            }
        } catch (Exception e10) {
            q0.b("SameSDCardTool", e10.getMessage());
        }
    }

    private static void b(Context context) {
        File externalFilesDir;
        if (TextUtils.isEmpty(f30964a) && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
            f30964a = externalFilesDir.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(f30964a)) {
            com.mbridge.msdk.foundation.same.directory.e.a(new com.mbridge.msdk.foundation.same.directory.d(f30964a));
            com.mbridge.msdk.foundation.same.directory.e.b().a();
        }
        b();
    }

    public static int c() {
        return f30967d;
    }

    public static int a() {
        if (System.currentTimeMillis() - f30968e > 1800000) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a());
        }
        return f30966c;
    }

    public static void b() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks();
            f30967d = Long.valueOf(((((long) statFs.getBlockCount()) * blockSize) / 1000) / 1000).intValue();
            f30966c = Long.valueOf(((availableBlocks * blockSize) / 1000) / 1000).intValue();
            f30968e = System.currentTimeMillis();
        } catch (Exception e10) {
            q0.b("SameSDCardTool", e10.getMessage());
        }
    }
}
