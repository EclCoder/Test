package w1;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface j {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a();
    }

    boolean a(int i10);

    boolean b(a aVar);

    Looper getLooper();

    a obtainMessage(int i10);

    a obtainMessage(int i10, int i11, int i12);

    a obtainMessage(int i10, int i11, int i12, Object obj);

    a obtainMessage(int i10, Object obj);

    boolean post(Runnable runnable);

    void removeCallbacksAndMessages(Object obj);

    void removeMessages(int i10);

    boolean sendEmptyMessage(int i10);

    boolean sendEmptyMessageAtTime(int i10, long j10);
}
