package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC2138fk {
    void A9d();

    boolean A9q();

    boolean A9r();

    boolean AAc();

    void AGr(boolean z10, int i10);

    void AK1(int i10);

    void AK6(EnumC2085et enumC2085et, int i10);

    void AKF(int i10);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC2085et getStartReason();

    EnumC2140fm getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i10);

    void setBackgroundPlaybackEnabled(boolean z10);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z10);

    void setRequestedVolume(float f10);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(InterfaceC2141fn interfaceC2141fn);

    void setup(Uri uri);
}
