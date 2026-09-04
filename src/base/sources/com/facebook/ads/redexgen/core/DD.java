package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("Should be package private once we migrate to Factory pattern")
public interface DD {
    void A5y();

    long A7a();

    void AAB(InterfaceC2694pF interfaceC2694pF, Uri uri, Map<String, List<String>> map, long j10, long j11, HA ha2) throws IOException;

    int AHM(HV hv) throws IOException;

    void AHb();

    void AJ6(long j10, long j11);
}
