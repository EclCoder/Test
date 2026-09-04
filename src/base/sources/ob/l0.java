package ob;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class l0 implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f48400b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f48401a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Message f48402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l0 f48403b;

        private b() {
        }

        private void b() {
            this.f48402a = null;
            this.f48403b = null;
            l0.e(this);
        }

        @Override // ob.q.a
        public void a() {
            ((Message) ob.a.e(this.f48402a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) ob.a.e(this.f48402a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, l0 l0Var) {
            this.f48402a = message;
            this.f48403b = l0Var;
            return this;
        }
    }

    public l0(Handler handler) {
        this.f48401a = handler;
    }

    private static b d() {
        b bVar;
        List list = f48400b;
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
        List list = f48400b;
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

    @Override // ob.q
    public boolean a(int i10) {
        return this.f48401a.hasMessages(i10);
    }

    @Override // ob.q
    public boolean b(q.a aVar) {
        return ((b) aVar).c(this.f48401a);
    }

    @Override // ob.q
    public Looper getLooper() {
        return this.f48401a.getLooper();
    }

    @Override // ob.q
    public q.a obtainMessage(int i10) {
        return d().d(this.f48401a.obtainMessage(i10), this);
    }

    @Override // ob.q
    public boolean post(Runnable runnable) {
        return this.f48401a.post(runnable);
    }

    @Override // ob.q
    public void removeCallbacksAndMessages(Object obj) {
        this.f48401a.removeCallbacksAndMessages(obj);
    }

    @Override // ob.q
    public void removeMessages(int i10) {
        this.f48401a.removeMessages(i10);
    }

    @Override // ob.q
    public boolean sendEmptyMessage(int i10) {
        return this.f48401a.sendEmptyMessage(i10);
    }

    @Override // ob.q
    public boolean sendEmptyMessageAtTime(int i10, long j10) {
        return this.f48401a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // ob.q
    public q.a obtainMessage(int i10, Object obj) {
        return d().d(this.f48401a.obtainMessage(i10, obj), this);
    }

    @Override // ob.q
    public q.a obtainMessage(int i10, int i11, int i12) {
        return d().d(this.f48401a.obtainMessage(i10, i11, i12), this);
    }
}
