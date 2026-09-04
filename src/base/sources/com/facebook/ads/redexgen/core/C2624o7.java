package com.facebook.ads.redexgen.core;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.o7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2624o7 implements BY {
    public MediaCodecInfo[] A00;
    public final int A01;

    public C2624o7(boolean z10, boolean z11) {
        int i10;
        if (z10 || z11) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.A01 = i10;
    }

    @EnsuresNonNull({"mediaCodecInfos"})
    private void A00() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final int A7P() {
        A00();
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final MediaCodecInfo A7Q(int i10) {
        A00();
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final boolean AAR(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final boolean AAS(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final boolean AJ4() {
        return true;
    }
}
