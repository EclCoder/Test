package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: com.inmobi.media.an, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2845an implements MediaPlayer.OnErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3322t9 f26231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ em.q f26233c;

    public C2845an(InterfaceC3322t9 interfaceC3322t9, String str, em.q qVar) {
        this.f26231a = interfaceC3322t9;
        this.f26232b = str;
        this.f26233c = qVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        InterfaceC3322t9 interfaceC3322t9 = this.f26231a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("VideoLoaderHelper", "Video Load Error URL: " + this.f26232b);
        }
        T4.a(this.f26233c, Boolean.FALSE);
        return true;
    }
}
