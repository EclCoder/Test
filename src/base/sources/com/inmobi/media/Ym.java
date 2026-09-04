package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ym implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaPlayer f26097a;

    public Ym(MediaPlayer mediaPlayer) {
        this.f26097a = mediaPlayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f26097a.release();
        return fl.g0.f38750a;
    }
}
