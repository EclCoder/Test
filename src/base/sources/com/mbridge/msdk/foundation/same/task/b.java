package com.mbridge.msdk.foundation.same.task;

import android.content.Context;
import com.mbridge.msdk.foundation.tools.s0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ThreadPoolExecutor f30786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    HashMap<Long, com.mbridge.msdk.foundation.same.task.a> f30787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    WeakReference<Context> f30788c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.mbridge.msdk.foundation.same.task.a.InterfaceC0400a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.task.a f30789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.task.a.InterfaceC0400a f30790b;

        a(com.mbridge.msdk.foundation.same.task.a aVar, com.mbridge.msdk.foundation.same.task.a.InterfaceC0400a interfaceC0400a) {
            this.f30789a = aVar;
            this.f30790b = interfaceC0400a;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0400a
        public void a(com.mbridge.msdk.foundation.same.task.a.b bVar) {
            if (bVar == com.mbridge.msdk.foundation.same.task.a.b.CANCEL || bVar == com.mbridge.msdk.foundation.same.task.a.b.FINISH) {
                b.this.f30787b.remove(Long.valueOf(this.f30789a.getId()));
            } else if (bVar == com.mbridge.msdk.foundation.same.task.a.b.RUNNING && b.this.f30788c.get() == null) {
                b.this.a();
            }
            com.mbridge.msdk.foundation.same.task.a.InterfaceC0400a interfaceC0400a = this.f30790b;
            if (interfaceC0400a != null) {
                interfaceC0400a.a(bVar);
            }
        }
    }

    public b(Context context, int i10) {
        if (s0.a().a("c_t_l_t_p", true)) {
            this.f30786a = c.b();
        } else {
            if (i10 == 0) {
                this.f30786a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f30786a = new ThreadPoolExecutor(i10, (i10 * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f30786a.allowCoreThreadTimeOut(true);
        }
        this.f30787b = new HashMap<>();
        this.f30788c = new WeakReference<>(context);
    }

    public void a(com.mbridge.msdk.foundation.same.task.a aVar) {
        a(aVar, null);
        this.f30786a.execute(aVar);
    }

    public void b(com.mbridge.msdk.foundation.same.task.a aVar, com.mbridge.msdk.foundation.same.task.a.InterfaceC0400a interfaceC0400a) {
        a(aVar, interfaceC0400a);
        this.f30786a.execute(aVar);
    }

    private synchronized void a(com.mbridge.msdk.foundation.same.task.a aVar, com.mbridge.msdk.foundation.same.task.a.InterfaceC0400a interfaceC0400a) {
        this.f30787b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a(aVar, interfaceC0400a));
    }

    public synchronized void a() {
        try {
            Iterator<Map.Entry<Long, com.mbridge.msdk.foundation.same.task.a>> it = this.f30787b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.f30787b.clear();
        } catch (Exception unused) {
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public b(Context context) {
        if (s0.a().a("c_t_l_t_p", true)) {
            this.f30786a = c.b();
        } else {
            if (s0.a().a("c_t_p_t_l", true)) {
                int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.f30786a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f30786a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f30786a.allowCoreThreadTimeOut(true);
        }
        this.f30787b = new HashMap<>();
        this.f30788c = new WeakReference<>(context);
    }
}
