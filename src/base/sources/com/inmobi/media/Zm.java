package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Zm implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3322t9 f26155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ em.q f26157c;

    public Zm(InterfaceC3322t9 interfaceC3322t9, String str, em.q qVar) {
        this.f26155a = interfaceC3322t9;
        this.f26156b = str;
        this.f26157c = qVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        InterfaceC3322t9 interfaceC3322t9 = this.f26155a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("VideoLoaderHelper", "Video Load Success for URL: " + this.f26156b);
        }
        T4.a(this.f26157c, Boolean.TRUE);
    }
}
