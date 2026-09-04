package w1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class x implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f55851b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f55852a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Message f55853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private x f55854b;

        private b() {
        }

        private void b() {
            this.f55853a = null;
            this.f55854b = null;
            x.e(this);
        }

        @Override // w1.j.a
        public void a() {
            ((Message) w1.a.e(this.f55853a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) w1.a.e(this.f55853a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, x xVar) {
            this.f55853a = message;
            this.f55854b = xVar;
            return this;
        }
    }

    public x(Handler handler) {
        this.f55852a = handler;
    }

    private static b d() {
        b bVar;
        List list = f55851b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : (b) list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(b bVar) {
        List list = f55851b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // w1.j
    public boolean a(int i10) {
        w1.a.a(i10 != 0);
        return this.f55852a.hasMessages(i10);
    }

    @Override // w1.j
    public boolean b(j.a aVar) {
        return ((b) aVar).c(this.f55852a);
    }

    @Override // w1.j
    public Looper getLooper() {
        return this.f55852a.getLooper();
    }

    @Override // w1.j
    public j.a obtainMessage(int i10) {
        return d().d(this.f55852a.obtainMessage(i10), this);
    }

    @Override // w1.j
    public boolean post(Runnable runnable) {
        return this.f55852a.post(runnable);
    }

    @Override // w1.j
    public void removeCallbacksAndMessages(Object obj) {
        this.f55852a.removeCallbacksAndMessages(obj);
    }

    @Override // w1.j
    public void removeMessages(int i10) {
        w1.a.a(i10 != 0);
        this.f55852a.removeMessages(i10);
    }

    @Override // w1.j
    public boolean sendEmptyMessage(int i10) {
        return this.f55852a.sendEmptyMessage(i10);
    }

    @Override // w1.j
    public boolean sendEmptyMessageAtTime(int i10, long j10) {
        return this.f55852a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // w1.j
    public j.a obtainMessage(int i10, Object obj) {
        return d().d(this.f55852a.obtainMessage(i10, obj), this);
    }

    @Override // w1.j
    public j.a obtainMessage(int i10, int i11, int i12) {
        return d().d(this.f55852a.obtainMessage(i10, i11, i12), this);
    }

    @Override // w1.j
    public j.a obtainMessage(int i10, int i11, int i12, Object obj) {
        return d().d(this.f55852a.obtainMessage(i10, i11, i12, obj), this);
    }
}
