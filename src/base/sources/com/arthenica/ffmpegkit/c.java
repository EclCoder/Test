package com.arthenica.ffmpegkit;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f11073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f11074b;

    public c(e eVar) {
        this.f11073a = eVar;
        this.f11074b = eVar.v();
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.f(this.f11073a);
        f fVar = this.f11074b;
        if (fVar != null) {
            try {
                fVar.a(this.f11073a);
            } catch (Exception e10) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside session complete callback.%s", o5.a.a(e10)));
            }
        }
        f fVarH = FFmpegKitConfig.h();
        if (fVarH != null) {
            try {
                fVarH.a(this.f11073a);
            } catch (Exception e11) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside global complete callback.%s", o5.a.a(e11)));
            }
        }
    }
}
