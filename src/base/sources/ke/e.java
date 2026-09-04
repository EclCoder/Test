package ke;

import android.util.Log;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f43192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f43193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Executor f43194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f43195d = Collections.newSetFromMap(new ConcurrentHashMap());

    public e(f fVar, a aVar, Executor executor) {
        this.f43192a = fVar;
        this.f43193b = aVar;
        this.f43194c = executor;
    }

    public static /* synthetic */ void a(e eVar, Task task, final me.f fVar, g gVar) {
        eVar.getClass();
        try {
            g gVar2 = (g) task.getResult();
            if (gVar2 != null) {
                final me.e eVarB = eVar.f43193b.b(gVar2);
                eVar.f43194c.execute(new Runnable() { // from class: ke.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(eVarB);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e10);
        }
    }

    public void d(g gVar) {
        try {
            final me.e eVarB = this.f43193b.b(gVar);
            for (final me.f fVar : this.f43195d) {
                this.f43194c.execute(new Runnable() { // from class: ke.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(eVarB);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
        }
    }

    public void e(final me.f fVar) {
        this.f43195d.add(fVar);
        final Task taskE = this.f43192a.e();
        taskE.addOnSuccessListener(this.f43194c, new OnSuccessListener() { // from class: ke.c
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                e.a(this.f43187a, taskE, fVar, (g) obj);
            }
        });
    }
}
