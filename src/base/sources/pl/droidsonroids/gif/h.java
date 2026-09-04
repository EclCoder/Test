package pl.droidsonroids.gif;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class h extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f50241a;

    h(b bVar) {
        super(Looper.getMainLooper());
        this.f50241a = new WeakReference(bVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        b bVar = (b) this.f50241a.get();
        if (bVar == null) {
            return;
        }
        if (message.what == -1) {
            bVar.invalidateSelf();
            return;
        }
        Iterator it = bVar.f50192h.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }
}
