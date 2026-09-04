package ob;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f48357a = new k0();

    void a();

    q createHandler(Looper looper, Handler.Callback callback);

    long elapsedRealtime();

    long uptimeMillis();
}
