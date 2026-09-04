package com.bykv.vk.openvk.preload.geckox.e;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f11826a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f11827b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f11828c;

    public b(Context context, String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("access key empty");
        }
        if (file != null) {
            this.f11828c = new File(file, str).getAbsolutePath();
            return;
        }
        this.f11828c = new File(context.getFilesDir(), "gecko_offline_res_x" + File.separator + str).getAbsolutePath();
    }

    private a d(String str) {
        a aVar;
        int iIndexOf = str.indexOf("/");
        if (iIndexOf == -1) {
            new RuntimeException("channel：".concat(str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        synchronized (this.f11826a) {
            try {
                aVar = this.f11826a.get(strSubstring);
                if (aVar == null) {
                    aVar = new a(this.f11828c, strSubstring);
                    this.f11826a.put(strSubstring, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public final String a() {
        return this.f11828c;
    }

    public final int b(String str) {
        if (this.f11827b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).c(str);
    }

    public final boolean c(String str) {
        if (this.f11827b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).b(str);
    }

    public final InputStream a(String str) {
        if (this.f11827b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).a(str);
    }

    public final Map<String, Long> b() {
        HashMap map = new HashMap();
        synchronized (this.f11826a) {
            try {
                Collection<a> collectionValues = this.f11826a.values();
                if (collectionValues == null) {
                    return map;
                }
                for (a aVar : collectionValues) {
                    map.put(aVar.b(), aVar.a());
                }
                return map;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        if (this.f11827b.getAndSet(true)) {
            return;
        }
        GeckoLogger.d("Loader", "release version res loader");
        synchronized (this.f11826a) {
            try {
                Iterator<a> it = this.f11826a.values().iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
                this.f11826a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
