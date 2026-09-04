package com.inmobi.media;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Nf {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f25348e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25349a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25350b = DevicePublicKeyStringDef.NONE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25351c = TtmlNode.RIGHT;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25352d;

    public final String toString() {
        return "OrientationProperties(allowOrientationChange=" + this.f25349a + ", forceOrientation='" + this.f25350b + "', direction='" + this.f25351c + "', creativeSuppliedProperties=" + this.f25352d + ")";
    }
}
