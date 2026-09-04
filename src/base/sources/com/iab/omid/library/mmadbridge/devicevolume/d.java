package com.iab.omid.library.mmadbridge.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f24083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f24084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f24085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f24086e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f24082a = context;
        this.f24083b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f24084c = aVar;
        this.f24085d = cVar;
    }

    private float a() {
        return this.f24084c.a(this.f24083b.getStreamVolume(3), this.f24083b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f24085d.a(this.f24086e);
    }

    public void c() {
        this.f24086e = a();
        b();
        this.f24082a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f24082a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f24086e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f24086e;
    }
}
