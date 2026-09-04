package com.facebook.ads.redexgen.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2098f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C09753r A00;

    public C2098f6(C09753r c09753r) {
        this.A00 = c09753r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        new Handler(Looper.getMainLooper()).post(new C1210Dl(this, i10));
    }
}
