package com.iab.omid.library.vungle.devicevolume;

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
    private final Handler f24236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f24237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f24238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.a f24239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f24240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f24241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f24242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f24243h;

    class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.vungle.devicevolume.d$a$a, reason: collision with other inner class name */
        class RunnableC0358a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f24245a;

            RunnableC0358a(float f10) {
                this.f24245a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f24240e.a(this.f24245a);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f24242g.set(false);
            if (((Float) d.this.f24241f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f24236a.post(new RunnableC0358a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.vungle.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f24241f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f24242g = new AtomicBoolean(false);
        this.f24243h = Executors.newSingleThreadExecutor();
        this.f24236a = handler;
        this.f24237b = context;
        this.f24238c = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f24239d = aVar;
        this.f24240e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f24239d.a(this.f24238c.getStreamVolume(3), this.f24238c.getStreamMaxVolume(3));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f24242g.getAndSet(true)) {
            return;
        }
        d();
    }

    private void d() {
        this.f24243h.submit(new a());
    }

    public void b() {
        d();
        this.f24237b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f24237b.getContentResolver().unregisterContentObserver(this);
    }
}
