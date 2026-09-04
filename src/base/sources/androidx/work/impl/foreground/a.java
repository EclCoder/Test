package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.g;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import b5.i;
import e5.c;
import e5.d;
import i5.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a implements c, b5.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f7928k = l.f("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f7930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k5.a f7931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f7932d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f7933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map f7934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map f7935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Set f7936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final d f7937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f7938j;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0103a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WorkDatabase f7939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7940b;

        RunnableC0103a(WorkDatabase workDatabase, String str) {
            this.f7939a = workDatabase;
            this.f7940b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVarG = this.f7939a.B().g(this.f7940b);
            if (pVarG == null || !pVarG.b()) {
                return;
            }
            synchronized (a.this.f7932d) {
                a.this.f7935g.put(this.f7940b, pVarG);
                a.this.f7936h.add(pVarG);
                a aVar = a.this;
                aVar.f7937i.d(aVar.f7936h);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface b {
        void a(int i10, Notification notification);

        void c(int i10, int i11, Notification notification);

        void d(int i10);

        void stop();
    }

    a(Context context) {
        this.f7929a = context;
        i iVarK = i.k(context);
        this.f7930b = iVarK;
        k5.a aVarP = iVarK.p();
        this.f7931c = aVarP;
        this.f7933e = null;
        this.f7934f = new LinkedHashMap();
        this.f7936h = new HashSet();
        this.f7935g = new HashMap();
        this.f7937i = new d(this.f7929a, aVarP, this);
        this.f7930b.m().c(this);
    }

    public static Intent a(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.a());
        intent.putExtra("KEY_NOTIFICATION", gVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.a());
        intent.putExtra("KEY_NOTIFICATION", gVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(Intent intent) {
        l.c().d(f7928k, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f7930b.f(UUID.fromString(stringExtra));
    }

    private void h(Intent intent) {
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        l.c().a(f7928k, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f7938j == null) {
            return;
        }
        this.f7934f.put(stringExtra, new g(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f7933e)) {
            this.f7933e = stringExtra;
            this.f7938j.c(intExtra, intExtra2, notification);
            return;
        }
        this.f7938j.a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f7934f.entrySet().iterator();
        while (it.hasNext()) {
            iA |= ((g) ((Map.Entry) it.next()).getValue()).a();
        }
        g gVar = (g) this.f7934f.get(this.f7933e);
        if (gVar != null) {
            this.f7938j.c(gVar.c(), iA, gVar.b());
        }
    }

    private void i(Intent intent) {
        l.c().d(f7928k, String.format("Started foreground service %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.f7931c.b(new RunnableC0103a(this.f7930b.o(), stringExtra));
    }

    @Override // e5.c
    public void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            l.c().a(f7928k, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f7930b.w(str);
        }
    }

    @Override // b5.b
    public void d(String str, boolean z10) {
        Map.Entry entry;
        synchronized (this.f7932d) {
            try {
                p pVar = (p) this.f7935g.remove(str);
                if (pVar != null ? this.f7936h.remove(pVar) : false) {
                    this.f7937i.d(this.f7936h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g gVar = (g) this.f7934f.remove(str);
        if (str.equals(this.f7933e) && this.f7934f.size() > 0) {
            Iterator it = this.f7934f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f7933e = (String) entry.getKey();
            if (this.f7938j != null) {
                g gVar2 = (g) entry.getValue();
                this.f7938j.c(gVar2.c(), gVar2.a(), gVar2.b());
                this.f7938j.d(gVar2.c());
            }
        }
        b bVar = this.f7938j;
        if (gVar == null || bVar == null) {
            return;
        }
        l.c().a(f7928k, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(gVar.c()), str, Integer.valueOf(gVar.a())), new Throwable[0]);
        bVar.d(gVar.c());
    }

    void j(Intent intent) {
        l.c().d(f7928k, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f7938j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    void k() {
        this.f7938j = null;
        synchronized (this.f7932d) {
            this.f7937i.e();
        }
        this.f7930b.m().i(this);
    }

    void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    void m(b bVar) {
        if (this.f7938j != null) {
            l.c().b(f7928k, "A callback already exists.", new Throwable[0]);
        } else {
            this.f7938j = bVar;
        }
    }

    @Override // e5.c
    public void f(List list) {
    }
}
