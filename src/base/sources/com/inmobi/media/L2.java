package com.inmobi.media;

import android.content.Context;
import android.os.storage.StorageManager;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.cache.CacheDataSink;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.inmobi.media.L2;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class L2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final fl.k f25166h = fl.l.a(fl.o.SYNCHRONIZED, new tl.a() { // from class: yh.h2
        @Override // tl.a
        public final Object invoke() {
            return L2.b();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25167a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f25168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig.VideoCacheConfig f25169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2.h f25170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y1.b f25171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f25172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile androidx.media3.datasource.cache.h f25173g;

    public L2() {
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.e(context);
        this.f25168b = context;
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        this.f25169c = ((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getHybridNative().getVideoCache();
        this.f25171e = new y1.b(context);
        this.f25172f = new AtomicInteger(0);
        this.f25170d = new a2.h(a(context));
    }

    public static final L2 b() {
        return new L2();
    }

    public final long a(Context context) {
        long maxSize = this.f25169c.getMaxSize();
        long j10 = UserVerificationMethods.USER_VERIFY_ALL;
        long j11 = maxSize * j10 * j10;
        B5.f24500a.getClass();
        if (B5.A()) {
            try {
                Object systemService = context.getSystemService("storage");
                kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.os.storage.StorageManager");
                StorageManager storageManager = (StorageManager) systemService;
                UUID uuidForPath = storageManager.getUuidForPath(context.getCacheDir());
                kotlin.jvm.internal.s.g(uuidForPath, "getUuidForPath(...)");
                return Math.min(j11, storageManager.getCacheQuotaBytes(uuidForPath));
            } catch (Exception e10) {
                e10.getMessage();
            }
        }
        return j11;
    }

    public final androidx.media3.datasource.cache.h a() throws IOException {
        File file = new File(this.f25168b.getCacheDir(), "im_exoplayer_video_cache");
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException("Could not create cache directory: " + file);
        }
        return new androidx.media3.datasource.cache.h(file, this.f25170d, this.f25171e);
    }

    public final androidx.media3.exoplayer.source.r a(String url, boolean z10) {
        androidx.media3.datasource.a.InterfaceC0055a aVar;
        androidx.media3.datasource.cache.h hVarA;
        kotlin.jvm.internal.s.h(url, "url");
        t1.r rVarA = new t1.r.c().h(url).b(url).a();
        kotlin.jvm.internal.s.g(rVarA, "build(...)");
        if (this.f25169c.getIsEnabled() && z10) {
            androidx.media3.datasource.b.a aVar2 = new androidx.media3.datasource.b.a(this.f25168b);
            synchronized (this.f25167a) {
                hVarA = this.f25173g;
                if (hVarA == null) {
                    hVarA = a();
                    this.f25173g = hVarA;
                }
            }
            aVar = new androidx.media3.datasource.cache.a.c().c(hVarA).g(aVar2).e(new CacheDataSink.a().a(hVarA)).d(new FileDataSource.b()).f(2);
            kotlin.jvm.internal.s.g(aVar, "setFlags(...)");
        } else {
            aVar = new androidx.media3.datasource.b.a(this.f25168b);
        }
        androidx.media3.exoplayer.source.r rVarD = new androidx.media3.exoplayer.source.i(aVar).d(rVarA);
        kotlin.jvm.internal.s.g(rVarD, "createMediaSource(...)");
        return rVarD;
    }

    public final int a(String url) {
        androidx.media3.datasource.cache.h hVar;
        kotlin.jvm.internal.s.h(url, "url");
        try {
            synchronized (this.f25167a) {
                hVar = this.f25173g;
            }
            if (hVar == null) {
                return 0;
            }
            a2.d contentMetadata = hVar.getContentMetadata(url);
            kotlin.jvm.internal.s.g(contentMetadata, "getContentMetadata(...)");
            long jB = a2.d.b(contentMetadata);
            if (jB <= 0) {
                return 0;
            }
            return (int) ((hVar.m(url, 0L, jB) * ((long) 100)) / jB);
        } catch (Exception e10) {
            e10.getMessage();
            return 0;
        }
    }
}
