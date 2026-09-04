package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.google.firebase.f;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.t;
import com.google.firebase.remoteconfig.internal.v;
import de.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import je.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f22232n = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f22234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yc.b f22235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f22236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f22237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f22238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f22239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m f22240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o f22241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t f22242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e f22243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p f22244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ke.e f22245m;

    a(Context context, f fVar, e eVar, yc.b bVar, Executor executor, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, m mVar, o oVar, t tVar, p pVar, ke.e eVar2) {
        this.f22233a = context;
        this.f22234b = fVar;
        this.f22243k = eVar;
        this.f22235c = bVar;
        this.f22236d = executor;
        this.f22237e = fVar2;
        this.f22238f = fVar3;
        this.f22239g = fVar4;
        this.f22240h = mVar;
        this.f22241i = oVar;
        this.f22242j = tVar;
        this.f22244l = pVar;
        this.f22245m = eVar2;
    }

    public static /* synthetic */ Void a(a aVar, i iVar) {
        aVar.f22242j.l(iVar);
        return null;
    }

    public static /* synthetic */ Task e(final a aVar, Task task, Task task2, Task task3) {
        aVar.getClass();
        if (!task.isSuccessful() || task.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        g gVar = (g) task.getResult();
        return (!task2.isSuccessful() || l(gVar, (g) task2.getResult())) ? aVar.f22238f.i(gVar).continueWith(aVar.f22236d, new Continuation() { // from class: je.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                return Boolean.valueOf(this.f42439a.m(task4));
            }
        }) : Tasks.forResult(Boolean.FALSE);
    }

    public static a h() {
        return i(f.l());
    }

    public static a i(f fVar) {
        return ((c) fVar.j(c.class)).g();
    }

    private static boolean l(g gVar, g gVar2) {
        return gVar2 == null || !gVar.i().equals(gVar2.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(Task task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.f22237e.d();
        g gVar = (g) task.getResult();
        if (gVar == null) {
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        t(gVar.f());
        this.f22245m.d(gVar);
        return true;
    }

    private Task q(Map map) {
        try {
            return this.f22239g.i(g.m().b(map).a()).onSuccessTask(ed.i.a(), new SuccessContinuation() { // from class: je.e
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return Tasks.forResult(null);
                }
            });
        } catch (JSONException e10) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e10);
            return Tasks.forResult(null);
        }
    }

    static List s(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public Task f() {
        final Task taskE = this.f22237e.e();
        final Task taskE2 = this.f22238f.e();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskE, taskE2}).continueWithTask(this.f22236d, new Continuation() { // from class: je.d
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return com.google.firebase.remoteconfig.a.e(this.f42434a, taskE, taskE2, task);
            }
        });
    }

    public Task g() {
        return this.f22240h.i().onSuccessTask(ed.i.a(), new SuccessContinuation() { // from class: je.g
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Tasks.forResult(null);
            }
        });
    }

    ke.e j() {
        return this.f22245m;
    }

    public String k(String str) {
        return this.f22241i.e(str);
    }

    public Task n(final i iVar) {
        return Tasks.call(this.f22236d, new Callable() { // from class: je.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return com.google.firebase.remoteconfig.a.a(this.f42437a, iVar);
            }
        });
    }

    void o(boolean z10) {
        this.f22244l.b(z10);
    }

    public Task p(int i10) {
        return q(v.a(this.f22233a, i10));
    }

    void r() {
        this.f22238f.e();
        this.f22239g.e();
        this.f22237e.e();
    }

    void t(JSONArray jSONArray) {
        if (this.f22235c == null) {
            return;
        }
        try {
            this.f22235c.m(s(jSONArray));
        } catch (AbtException e10) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
        } catch (JSONException e11) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
        }
    }
}
