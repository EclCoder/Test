package w1;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class w implements d {
    protected w() {
    }

    @Override // w1.d
    public j createHandler(Looper looper, Handler.Callback callback) {
        return new x(new Handler(looper, callback));
    }

    @Override // w1.d
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // w1.d
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // w1.d
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // w1.d
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }

    @Override // w1.d
    public void a() {
    }
}
