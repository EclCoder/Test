package com.inmobi.media;

import android.app.KeyguardManager;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.PowerManager;

/* JADX INFO: renamed from: com.inmobi.media.in, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3051in {
    public static final boolean a(Context context, boolean z10) {
        kotlin.jvm.internal.s.h(context, "<this>");
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return false;
        }
        Object systemService2 = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        if (keyguardManager == null) {
            return false;
        }
        return powerManager.isInteractive() && (z10 || !keyguardManager.isKeyguardLocked());
    }

    public static final MediaPlayer a(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        if (Build.VERSION.SDK_INT >= 34) {
            return yh.x8.a(context);
        }
        return new MediaPlayer();
    }

    public static final void a(MediaPlayer mediaPlayer, Q1 audioFocusManager) {
        kotlin.jvm.internal.s.h(mediaPlayer, "<this>");
        kotlin.jvm.internal.s.h(audioFocusManager, "audioFocusManager");
        if (Build.VERSION.SDK_INT >= 26) {
            mediaPlayer.setAudioAttributes(audioFocusManager.f25530d);
        } else {
            mediaPlayer.setAudioStreamType(3);
        }
    }
}
