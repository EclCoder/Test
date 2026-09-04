package ob;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class k0 implements d {
    protected k0() {
    }

    @Override // ob.d
    public q createHandler(Looper looper, Handler.Callback callback) {
        return new l0(new Handler(looper, callback));
    }

    @Override // ob.d
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // ob.d
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }

    @Override // ob.d
    public void a() {
    }
}
