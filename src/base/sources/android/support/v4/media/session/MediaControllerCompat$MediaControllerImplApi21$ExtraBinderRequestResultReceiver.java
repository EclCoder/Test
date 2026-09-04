package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference f524a;

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i10, Bundle bundle) {
        b.a(this.f524a.get());
    }
}
