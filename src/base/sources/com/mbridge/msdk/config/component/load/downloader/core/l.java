package com.mbridge.msdk.config.component.load.downloader.core;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile l f28887e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28888a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.d f28889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.c f28890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile v f28891d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.mbridge.msdk.config.component.load.downloader.database.d {
        a() {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.database.d
        public SQLiteDatabase getWritableDatabase() {
            return com.mbridge.msdk.config.component.database.a.a().a(true);
        }
    }

    private l() {
    }

    public static l c() {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(f28887e)) {
            synchronized (l.class) {
                try {
                    if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(f28887e)) {
                        f28887e = new l();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f28887e;
    }

    private void e() {
        HandlerThread handlerThread = new HandlerThread("mb_db_thread");
        handlerThread.start();
        this.f28890c = new com.mbridge.msdk.config.component.load.downloader.database.a(new Handler(handlerThread.getLooper()), new a());
    }

    public int a() {
        return this.f28888a;
    }

    public com.mbridge.msdk.config.component.load.downloader.database.c b() {
        return this.f28890c;
    }

    public v d() {
        if (this.f28891d == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(w.HTTP_1_1);
            com.mbridge.msdk.thrid.okhttp.m mVar = new com.mbridge.msdk.thrid.okhttp.m(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false)));
            mVar.a(this.f28889b.f());
            mVar.b(this.f28889b.g());
            v.b bVar = new v.b();
            long jA = this.f28889b.a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f28891d = bVar.b(jA, timeUnit).d(this.f28889b.a(), timeUnit).e(this.f28889b.d(), timeUnit).a(mVar).c(this.f28889b.b(), timeUnit).b(true).a(new com.mbridge.msdk.thrid.okhttp.i(32, 5L, TimeUnit.MINUTES)).a(arrayList).a();
        }
        return this.f28891d;
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.d dVar) {
        this.f28889b = dVar;
        e();
    }
}
