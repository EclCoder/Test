package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import i5.p;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b implements b5.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f7874d = l.f("CommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7876b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f7877c = new Object();

    b(Context context) {
        this.f7875a = context;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent c(Context context, String str, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return intent;
    }

    static Intent e(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void g(Intent intent, int i10, e eVar) {
        l.c().a(f7874d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new c(this.f7875a, i10, eVar).a();
    }

    private void h(Intent intent, int i10, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f7877c) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                l lVarC = l.c();
                String str = f7874d;
                lVarC.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
                if (this.f7876b.containsKey(string)) {
                    l.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
                } else {
                    d dVar = new d(this.f7875a, i10, string, eVar);
                    this.f7876b.put(string, dVar);
                    dVar.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void i(Intent intent, int i10) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z10 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        l.c().a(f7874d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        d(string, z10);
    }

    private void j(Intent intent, int i10, e eVar) {
        l.c().a(f7874d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        eVar.g().s();
    }

    private void k(Intent intent, int i10, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        l lVarC = l.c();
        String str = f7874d;
        lVarC.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase workDatabaseO = eVar.g().o();
        workDatabaseO.c();
        try {
            p pVarG = workDatabaseO.B().g(string);
            if (pVarG == null) {
                l.c().h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (pVarG.f41041b.d()) {
                l.c().h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long jA = pVarG.a();
            if (pVarG.b()) {
                l.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                a.c(this.f7875a, eVar.g(), string, jA);
                eVar.k(new e.b(eVar, a(this.f7875a), i10));
            } else {
                l.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                a.c(this.f7875a, eVar.g(), string, jA);
            }
            workDatabaseO.r();
        } finally {
            workDatabaseO.g();
        }
    }

    private void l(Intent intent, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        l.c().a(f7874d, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        eVar.g().x(string);
        a.a(this.f7875a, eVar.g(), string);
        eVar.d(string, false);
    }

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // b5.b
    public void d(String str, boolean z10) {
        synchronized (this.f7877c) {
            try {
                b5.b bVar = (b5.b) this.f7876b.remove(str);
                if (bVar != null) {
                    bVar.d(str, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean n() {
        boolean z10;
        synchronized (this.f7877c) {
            z10 = !this.f7876b.isEmpty();
        }
        return z10;
    }

    void o(Intent intent, int i10, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i10, eVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i10, eVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            l.c().b(f7874d, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i10, eVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i10, eVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i10);
        } else {
            l.c().h(f7874d, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
