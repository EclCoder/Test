package com.iab.omid.library.inmobi.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f23941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f23942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f23943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.a f23944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f23945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f23946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f23947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f23948h;

    class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.inmobi.devicevolume.d$a$a, reason: collision with other inner class name */
        class RunnableC0349a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f23950a;

            RunnableC0349a(float f10) {
                this.f23950a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f23945e.a(this.f23950a);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f23947g.set(false);
            if (((Float) d.this.f23946f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f23941a.post(new RunnableC0349a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.inmobi.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f23946f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f23947g = new AtomicBoolean(false);
        this.f23948h = Executors.newSingleThreadExecutor();
        this.f23941a = handler;
        this.f23942b = context;
        this.f23943c = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f23944d = aVar;
        this.f23945e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f23944d.a(this.f23943c.getStreamVolume(3), this.f23943c.getStreamMaxVolume(3));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f23947g.getAndSet(true)) {
            return;
        }
        d();
    }

    private void d() {
        this.f23948h.submit(new a());
    }

    public void b() {
        d();
        this.f23942b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f23942b.getContentResolver().unregisterContentObserver(this);
    }
}
