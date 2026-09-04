package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static b f21203e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21204a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f21205b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f21206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f21207d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.d((c) message.obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface InterfaceC0316b {
        void a(int i10);

        void show();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference f21209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f21211c;

        c(int i10, InterfaceC0316b interfaceC0316b) {
            this.f21209a = new WeakReference(interfaceC0316b);
            this.f21210b = i10;
        }

        boolean a(InterfaceC0316b interfaceC0316b) {
            return interfaceC0316b != null && this.f21209a.get() == interfaceC0316b;
        }
    }

    private b() {
    }

    private boolean a(c cVar, int i10) {
        InterfaceC0316b interfaceC0316b = (InterfaceC0316b) cVar.f21209a.get();
        if (interfaceC0316b == null) {
            return false;
        }
        this.f21205b.removeCallbacksAndMessages(cVar);
        interfaceC0316b.a(i10);
        return true;
    }

    static b c() {
        if (f21203e == null) {
            f21203e = new b();
        }
        return f21203e;
    }

    private boolean f(InterfaceC0316b interfaceC0316b) {
        c cVar = this.f21206c;
        return cVar != null && cVar.a(interfaceC0316b);
    }

    private boolean g(InterfaceC0316b interfaceC0316b) {
        c cVar = this.f21207d;
        return cVar != null && cVar.a(interfaceC0316b);
    }

    private void l(c cVar) {
        int i10 = cVar.f21210b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f21205b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f21205b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }

    private void n() {
        c cVar = this.f21207d;
        if (cVar != null) {
            this.f21206c = cVar;
            this.f21207d = null;
            InterfaceC0316b interfaceC0316b = (InterfaceC0316b) cVar.f21209a.get();
            if (interfaceC0316b != null) {
                interfaceC0316b.show();
            } else {
                this.f21206c = null;
            }
        }
    }

    public void b(InterfaceC0316b interfaceC0316b, int i10) {
        synchronized (this.f21204a) {
            try {
                if (f(interfaceC0316b)) {
                    a(this.f21206c, i10);
                } else if (g(interfaceC0316b)) {
                    a(this.f21207d, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void d(c cVar) {
        synchronized (this.f21204a) {
            try {
                if (this.f21206c == cVar || this.f21207d == cVar) {
                    a(cVar, 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(InterfaceC0316b interfaceC0316b) {
        boolean z10;
        synchronized (this.f21204a) {
            try {
                z10 = f(interfaceC0316b) || g(interfaceC0316b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void h(InterfaceC0316b interfaceC0316b) {
        synchronized (this.f21204a) {
            try {
                if (f(interfaceC0316b)) {
                    this.f21206c = null;
                    if (this.f21207d != null) {
                        n();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(InterfaceC0316b interfaceC0316b) {
        synchronized (this.f21204a) {
            try {
                if (f(interfaceC0316b)) {
                    l(this.f21206c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(InterfaceC0316b interfaceC0316b) {
        synchronized (this.f21204a) {
            try {
                if (f(interfaceC0316b)) {
                    c cVar = this.f21206c;
                    if (!cVar.f21211c) {
                        cVar.f21211c = true;
                        this.f21205b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(InterfaceC0316b interfaceC0316b) {
        synchronized (this.f21204a) {
            try {
                if (f(interfaceC0316b)) {
                    c cVar = this.f21206c;
                    if (cVar.f21211c) {
                        cVar.f21211c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(int i10, InterfaceC0316b interfaceC0316b) {
        synchronized (this.f21204a) {
            try {
                if (f(interfaceC0316b)) {
                    c cVar = this.f21206c;
                    cVar.f21210b = i10;
                    this.f21205b.removeCallbacksAndMessages(cVar);
                    l(this.f21206c);
                    return;
                }
                if (g(interfaceC0316b)) {
                    this.f21207d.f21210b = i10;
                } else {
                    this.f21207d = new c(i10, interfaceC0316b);
                }
                c cVar2 = this.f21206c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.f21206c = null;
                    n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
