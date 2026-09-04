package com.inmobi.media;

import android.content.Context;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.inmobi.media.C3337to;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.inmobi.media.to, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3337to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5 f27578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3311so f27579b;

    public C3337to(final Context context, final AdConfig.WebAssetCacheConfig webAssetCacheConfig) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(webAssetCacheConfig, "webAssetCacheConfig");
        this.f27579b = new C3311so();
        Runnable runnable = new Runnable() { // from class: yh.ec
            @Override // java.lang.Runnable
            public final void run() {
                C3337to.a(webAssetCacheConfig, this, context);
            }
        };
        Context context2 = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    public final InputStream a(String url, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(url, "url");
        L5 l10 = this.f27578a;
        if (l10 == null) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed readFromCache: " + url);
            }
            return null;
        }
        try {
            K5 k5B = l10.b(String.valueOf(url.hashCode()));
            if (k5B != null && kotlin.jvm.internal.s.c(url, AbstractC3308sl.a(new InputStreamReader(k5B.f25102a[0], AbstractC3308sl.f27480b)))) {
                return k5B.f25102a[1];
            }
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("WebAssetLRUCacheHelper", "did not find any valid cache entry for " + url);
            }
            return null;
        } catch (Exception e10) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("WebAssetLRUCacheHelper", "Failed to read from cache with: " + e10.getMessage() + " for " + url);
            }
        }
    }

    public final boolean a(String url, String data, InterfaceC3322t9 interfaceC3322t9) throws Throwable {
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(data, "data");
        if (this.f27578a == null) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed writeToCache: " + url);
            }
            return false;
        }
        try {
            String strValueOf = String.valueOf(url.hashCode());
            L5 l10 = this.f27578a;
            OutputStreamWriter outputStreamWriter = null;
            if (l10 == null) {
                kotlin.jvm.internal.s.w("diskLruCache");
                l10 = null;
            }
            H5 h5A = l10.a(strValueOf);
            if (h5A == null) {
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: diskLruCache.editor is null for " + url);
                }
                return false;
            }
            try {
                OutputStream outputStreamA = h5A.a(0);
                Charset charset = AbstractC3308sl.f27480b;
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(outputStreamA, charset);
                try {
                    outputStreamWriter2.write(url);
                    AbstractC3308sl.a(outputStreamWriter2);
                    try {
                        OutputStreamWriter outputStreamWriter3 = new OutputStreamWriter(h5A.a(1), charset);
                        try {
                            outputStreamWriter3.write(data);
                            AbstractC3308sl.a(outputStreamWriter3);
                            if (h5A.f24920c) {
                                h5A.f24921d.a(h5A, false);
                                h5A.f24921d.d(h5A.f24918a.f24982a);
                            } else {
                                h5A.f24921d.a(h5A, true);
                            }
                            return true;
                        } catch (Throwable th2) {
                            th = th2;
                            outputStreamWriter = outputStreamWriter3;
                            AbstractC3308sl.a(outputStreamWriter);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    outputStreamWriter = outputStreamWriter2;
                    AbstractC3308sl.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Exception e10) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: " + e10.getMessage() + " for " + url);
            }
        }
    }

    public static final void a(AdConfig.WebAssetCacheConfig webAssetCacheConfig, C3337to c3337to, Context context) {
        try {
            B5.f24500a.getClass();
            long j10 = B5.f24502c;
            if (j10 < webAssetCacheConfig.getMinAvailableDiskSpace()) {
                c3337to.getClass();
                a(context, j10);
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                La.a(Ka.a(context, "web_asset_file_key"), "cache_enabled", false);
                return;
            }
            c3337to.a(context, webAssetCacheConfig, j10);
            ConcurrentHashMap concurrentHashMap2 = La.f25197b;
            La.a(Ka.a(context, "web_asset_file_key"), "cache_enabled", true);
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            W9.a(new M2(e10));
            e10.getMessage();
        }
    }

    public final void a(Context context, AdConfig.WebAssetCacheConfig webAssetCacheConfig, long j10) throws IOException {
        File file = new File(context.getFilesDir(), "inmobiwebassetcache");
        kotlin.jvm.internal.s.h(webAssetCacheConfig, "webAssetCacheConfig");
        long jMin = ((long) (j10 == -1 ? 0 : Math.min(webAssetCacheConfig.getCacheSize(), (int) ((j10 * ((long) webAssetCacheConfig.getCacheSizeToDiskSpaceMaxPercent())) / ((long) 100))))) * 1024 * ((long) UserVerificationMethods.USER_VERIFY_ALL);
        C3311so c3311so = this.f27579b;
        Pattern pattern = L5.f25174p;
        if (jMin > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            L5 l10 = new L5(file, jMin, c3311so);
            if (l10.f25178c.exists()) {
                try {
                    l10.b();
                    l10.a();
                    l10.f25187l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(l10.f25178c, true), AbstractC3308sl.f27479a));
                } catch (IOException e10) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    l10.close();
                    AbstractC3308sl.a(l10.f25177b);
                    file.mkdirs();
                    l10 = new L5(file, jMin, c3311so);
                    l10.c();
                }
            } else {
                file.mkdirs();
                l10 = new L5(file, jMin, c3311so);
                l10.c();
            }
            this.f27578a = l10;
            return;
        }
        throw new IllegalArgumentException(obFGmWgqyy.CcrdFbdugmFm);
    }

    public static void a(Context context, long j10) {
        fl.q qVarA = fl.w.a("size", Long.valueOf(j10));
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        La laA = Ka.a(context, "web_asset_file_key");
        kotlin.jvm.internal.s.h("cache_enabled", "key");
        Map mapM = gl.l0.m(qVarA, fl.w.a("state", Boolean.valueOf(laA.f25198a.getBoolean("cache_enabled", false))));
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("LowAvailableSpaceForCache", mapM, EnumC3281rk.SDK);
    }
}
