package be;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import dd.a0;
import dd.t;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce.b f8855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f8856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ce.b f8857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f8858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f8859e;

    private f(final Context context, final String str, Set set, ce.b bVar, Executor executor) {
        this(new t(new ce.b() { // from class: be.c
            @Override // ce.b
            public final Object get() {
                return f.c(context, str);
            }
        }), set, executor, bVar, context);
    }

    public static /* synthetic */ String b(f fVar) {
        String string;
        synchronized (fVar) {
            try {
                p pVar = (p) fVar.f8855a.get();
                List listF = pVar.f();
                pVar.e();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < listF.size(); i10++) {
                    q qVar = (q) listF.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", qVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) qVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", MBridgeConstans.API_REUQEST_CATEGORY_APP);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes(C.UTF8_NAME));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString(C.UTF8_NAME);
                    } catch (Throwable th2) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        return string;
    }

    public static /* synthetic */ p c(Context context, String str) {
        return new p(context, str);
    }

    public static /* synthetic */ f d(a0 a0Var, dd.d dVar) {
        return new f((Context) dVar.a(Context.class), ((com.google.firebase.f) dVar.a(com.google.firebase.f.class)).o(), dVar.b(g.class), dVar.f(ie.i.class), (Executor) dVar.e(a0Var));
    }

    public static /* synthetic */ Void e(f fVar) {
        synchronized (fVar) {
            ((p) fVar.f8855a.get()).j(System.currentTimeMillis(), ((ie.i) fVar.f8857c.get()).getUserAgent());
        }
        return null;
    }

    public static dd.c f() {
        final a0 a0VarA = a0.a(cd.a.class, Executor.class);
        return dd.c.f(f.class, i.class, j.class).b(dd.q.j(Context.class)).b(dd.q.j(com.google.firebase.f.class)).b(dd.q.m(g.class)).b(dd.q.l(ie.i.class)).b(dd.q.i(a0VarA)).e(new dd.g() { // from class: be.b
            @Override // dd.g
            public final Object a(dd.d dVar) {
                return f.d(a0VarA, dVar);
            }
        }).c();
    }

    @Override // be.i
    public Task a() {
        return !j0.p.a(this.f8856b) ? Tasks.forResult("") : Tasks.call(this.f8859e, new Callable() { // from class: be.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.b(this.f8853a);
            }
        });
    }

    public Task g() {
        if (this.f8858d.size() <= 0) {
            return Tasks.forResult(null);
        }
        return !j0.p.a(this.f8856b) ? Tasks.forResult(null) : Tasks.call(this.f8859e, new Callable() { // from class: be.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.e(this.f8854a);
            }
        });
    }

    f(ce.b bVar, Set set, Executor executor, ce.b bVar2, Context context) {
        this.f8855a = bVar;
        this.f8858d = set;
        this.f8859e = executor;
        this.f8857c = bVar2;
        this.f8856b = context;
    }
}
