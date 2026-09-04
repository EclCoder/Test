package com.inmobi.ads.rendering;

import android.R;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/inmobi/ads/rendering/InMobiInAppBrowserActivity;", "Lcom/inmobi/ads/rendering/InMobiAdActivity;", "<init>", "()V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiInAppBrowserActivity extends InMobiAdActivity {
    @Override // com.inmobi.ads.rendering.InMobiAdActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().clearFlags(2);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        getWindow().getDecorView().setBackgroundColor(0);
    }
}
