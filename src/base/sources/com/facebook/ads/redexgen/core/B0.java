package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface B0 {
    @MetaExoPlayerCustomization("No longer in upstream exo")
    void A58(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10, Object obj);

    int A5s();

    int A5u(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer A8J(int i10);

    ByteBuffer A8e(int i10);

    MediaFormat A8f();

    @MetaExoPlayerCustomization("Added in D39791066")
    Pair<Long, Integer> A8j();

    @MetaExoPlayerCustomization("Added in D39791066")
    int A9K();

    void AHI(int i10, int i11, int i12, long j10, int i13);

    void AHK(int i10, int i11, C10355z c10355z, long j10, int i12);

    void AHb();

    void AHh(int i10, long j10);

    void AHi(int i10, boolean z10);

    void AJa(InterfaceC1149Az interfaceC1149Az, Handler handler);

    void AJb(Surface surface);

    void AJs(int i10);

    void flush();

    @MetaExoPlayerCustomization("No longer in upstream exo")
    @Deprecated
    void reset();

    @MetaExoPlayerCustomization("No longer in upstream exo")
    void start();

    @MetaExoPlayerCustomization("No longer in upstream exo")
    @Deprecated
    void stop();
}
