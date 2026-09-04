package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC1740Yi {
    void AAu(Intent intent, Bundle bundle, C1560Re c1560Re);

    void AFA(boolean z10);

    void AFi(boolean z10);

    void AIv(Bundle bundle);

    String getCurrentClientToken();

    boolean onActivityResult(int i10, int i11, Intent intent);

    void onDestroy();
}
