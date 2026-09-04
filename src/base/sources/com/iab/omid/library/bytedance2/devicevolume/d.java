package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f23813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f23814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f23815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f23816e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f23812a = context;
        this.f23813b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f23814c = aVar;
        this.f23815d = cVar;
    }

    private float a() {
        return this.f23814c.a(this.f23813b.getStreamVolume(3), this.f23813b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f23815d.a(this.f23816e);
    }

    public void c() {
        this.f23816e = a();
        b();
        this.f23812a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f23812a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f23816e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f23816e;
    }
}
