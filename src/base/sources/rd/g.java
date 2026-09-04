package rd;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import jd.g1;
import jd.l0;
import jd.m0;
import jd.n0;
import jd.r0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f51301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f51302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f51303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l0 f51304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rd.a f51305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f51306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m0 f51307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicReference f51308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicReference f51309i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements SuccessContinuation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kd.i f51310a;

        a(kd.i iVar) {
            this.f51310a = iVar;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task then(Void r10) throws Throwable {
            JSONObject jSONObject = (JSONObject) this.f51310a.f43182d.c().submit(new Callable() { // from class: rd.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    g.a aVar = this.f51300a;
                    return g.this.f51306f.a(g.this.f51302b, true);
                }
            }).get();
            if (jSONObject != null) {
                d dVarB = g.this.f51303c.b(jSONObject);
                g.this.f51305e.c(dVarB.f51285c, jSONObject);
                g.this.q(jSONObject, "Loaded settings: ");
                g gVar = g.this;
                gVar.r(gVar.f51302b.f51318f);
                g.this.f51308h.set(dVarB);
                ((TaskCompletionSource) g.this.f51309i.get()).trySetResult(dVarB);
            }
            return Tasks.forResult(null);
        }
    }

    g(Context context, k kVar, l0 l0Var, h hVar, rd.a aVar, l lVar, m0 m0Var) {
        AtomicReference atomicReference = new AtomicReference();
        this.f51308h = atomicReference;
        this.f51309i = new AtomicReference(new TaskCompletionSource());
        this.f51301a = context;
        this.f51302b = kVar;
        this.f51304d = l0Var;
        this.f51303c = hVar;
        this.f51305e = aVar;
        this.f51306f = lVar;
        this.f51307g = m0Var;
        atomicReference.set(b.b(l0Var));
    }

    public static g l(Context context, String str, r0 r0Var, od.b bVar, String str2, String str3, pd.j jVar, m0 m0Var) {
        String strG = r0Var.g();
        g1 g1Var = new g1();
        return new g(context, new k(str, r0Var.h(), r0Var.i(), r0Var.j(), r0Var, jd.i.h(jd.i.m(context), str, str3, str2), str3, str2, n0.e(strG).g()), g1Var, new h(g1Var), new rd.a(jVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), m0Var);
    }

    private d m(e eVar) throws Throwable {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject jSONObjectB = this.f51305e.b();
                if (jSONObjectB != null) {
                    d dVarB = this.f51303c.b(jSONObjectB);
                    if (dVarB == null) {
                        gd.g.f().e("Failed to parse cached settings data.", null);
                        return null;
                    }
                    q(jSONObjectB, "Loaded cached settings: ");
                    long jA = this.f51304d.a();
                    if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && dVarB.a(jA)) {
                        gd.g.f().i("Cached settings have expired.");
                        return null;
                    }
                    try {
                        gd.g.f().i("Returning cached settings.");
                        return dVarB;
                    } catch (Exception e10) {
                        e = e10;
                        dVar = dVarB;
                        gd.g.f().e("Failed to get cached settings", e);
                        return dVar;
                    }
                }
                gd.g.f().b("No cached settings data found.");
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    private String n() {
        return jd.i.q(this.f51301a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        gd.g.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        SharedPreferences.Editor editorEdit = jd.i.q(this.f51301a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    @Override // rd.j
    public Task a() {
        return ((TaskCompletionSource) this.f51309i.get()).getTask();
    }

    @Override // rd.j
    public d b() {
        return (d) this.f51308h.get();
    }

    boolean k() {
        return !n().equals(this.f51302b.f51318f);
    }

    public Task o(kd.i iVar) {
        return p(e.USE_CACHE, iVar);
    }

    public Task p(e eVar, kd.i iVar) throws Throwable {
        d dVarM;
        if (!k() && (dVarM = m(eVar)) != null) {
            this.f51308h.set(dVarM);
            ((TaskCompletionSource) this.f51309i.get()).trySetResult(dVarM);
            return Tasks.forResult(null);
        }
        d dVarM2 = m(e.IGNORE_CACHE_EXPIRATION);
        if (dVarM2 != null) {
            this.f51308h.set(dVarM2);
            ((TaskCompletionSource) this.f51309i.get()).trySetResult(dVarM2);
        }
        return this.f51307g.i().onSuccessTask(iVar.f43179a, new a(iVar));
    }
}
