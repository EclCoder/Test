package com.google.ads.mediation.inmobi;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f16320a = Collections.synchronizedMap(new LinkedHashMap(10, 1.5f, true));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f16321b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f16322c = 1000000;

    l() {
        e(Runtime.getRuntime().maxMemory() / 4);
    }

    private void a() {
        Log.i("MemoryCache", "cache size=" + this.f16321b + " length=" + this.f16320a.size());
        if (this.f16321b > this.f16322c) {
            Iterator it = this.f16320a.entrySet().iterator();
            while (it.hasNext()) {
                this.f16321b -= c(((BitmapDrawable) ((Map.Entry) it.next()).getValue()).getBitmap());
                it.remove();
                if (this.f16321b <= this.f16322c) {
                    break;
                }
            }
            Log.i("MemoryCache", "Clean cache. New size " + this.f16320a.size());
        }
    }

    private long c(Bitmap bitmap) {
        if (bitmap == null) {
            return 0L;
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    private void e(long j10) {
        this.f16322c = j10;
        Log.i("MemoryCache", "MemoryCache will use up to " + ((this.f16322c / 1024.0d) / 1024.0d) + "MB");
    }

    public Drawable b(String str) {
        try {
            if (this.f16320a.containsKey(str)) {
                return (Drawable) this.f16320a.get(str);
            }
            return null;
        } catch (NullPointerException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    void d(String str, Drawable drawable) {
        try {
            if (this.f16320a.containsKey(str)) {
                this.f16321b -= c(((BitmapDrawable) this.f16320a.get(str)).getBitmap());
            }
            this.f16320a.put(str, drawable);
            this.f16321b += c(((BitmapDrawable) drawable).getBitmap());
            a();
            Log.d("MemoryCache", "Drawable used from cache");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
