package fd;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce.a f38459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile hd.a f38460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile id.b f38461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f38462d;

    public d(ce.a aVar) {
        this(aVar, new id.c(), new hd.f());
    }

    public static /* synthetic */ void a(d dVar, ce.b bVar) {
        dVar.getClass();
        gd.g.f().b("AnalyticsConnector now available.");
        bd.a aVar = (bd.a) bVar.get();
        hd.e eVar = new hd.e(aVar);
        e eVar2 = new e();
        if (g(aVar, eVar2) == null) {
            gd.g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        gd.g.f().b("Registered Firebase Analytics listener.");
        hd.d dVar2 = new hd.d();
        hd.c cVar = new hd.c(eVar, 500, TimeUnit.MILLISECONDS);
        synchronized (dVar) {
            try {
                Iterator it = dVar.f38462d.iterator();
                while (it.hasNext()) {
                    dVar2.a((id.a) it.next());
                }
                eVar2.d(dVar2);
                eVar2.e(cVar);
                dVar.f38461c = dVar2;
                dVar.f38460b = cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void c(d dVar, id.a aVar) {
        synchronized (dVar) {
            try {
                if (dVar.f38461c instanceof id.c) {
                    dVar.f38462d.add(aVar);
                }
                dVar.f38461c.a(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void f() {
        this.f38459a.a(new ce.a.InterfaceC0137a() { // from class: fd.c
            @Override // ce.a.InterfaceC0137a
            public final void a(ce.b bVar) {
                d.a(this.f38458a, bVar);
            }
        });
    }

    private static bd.a.InterfaceC0113a g(bd.a aVar, e eVar) {
        bd.a.InterfaceC0113a interfaceC0113aD = aVar.d("clx", eVar);
        if (interfaceC0113aD != null) {
            return interfaceC0113aD;
        }
        gd.g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        bd.a.InterfaceC0113a interfaceC0113aD2 = aVar.d(AppMeasurement.CRASH_ORIGIN, eVar);
        if (interfaceC0113aD2 != null) {
            gd.g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return interfaceC0113aD2;
    }

    public hd.a d() {
        return new hd.a() { // from class: fd.b
            @Override // hd.a
            public final void a(String str, Bundle bundle) {
                this.f38457a.f38460b.a(str, bundle);
            }
        };
    }

    public id.b e() {
        return new id.b() { // from class: fd.a
            @Override // id.b
            public final void a(id.a aVar) {
                d.c(this.f38456a, aVar);
            }
        };
    }

    public d(ce.a aVar, id.b bVar, hd.a aVar2) {
        this.f38459a = aVar;
        this.f38461c = bVar;
        this.f38462d = new ArrayList();
        this.f38460b = aVar2;
        f();
    }
}
