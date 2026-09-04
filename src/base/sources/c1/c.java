package c1;

import android.content.Context;
import em.o0;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import zl.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c implements kotlin.properties.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a1.b f9250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f9251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o0 f9252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile z0.h f9254f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f9255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f9256b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f9255a = context;
            this.f9256b = cVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f9255a;
            s.g(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f9256b.f9249a);
        }
    }

    public c(String name, a1.b bVar, Function1 produceMigrations, o0 scope) {
        s.h(name, "name");
        s.h(produceMigrations, "produceMigrations");
        s.h(scope, "scope");
        this.f9249a = name;
        this.f9250b = bVar;
        this.f9251c = produceMigrations;
        this.f9252d = scope;
        this.f9253e = new Object();
    }

    @Override // kotlin.properties.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z0.h getValue(Context thisRef, k property) {
        z0.h hVar;
        s.h(thisRef, "thisRef");
        s.h(property, "property");
        z0.h hVar2 = this.f9254f;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (this.f9253e) {
            try {
                if (this.f9254f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    d1.e eVar = d1.e.f36099a;
                    a1.b bVar = this.f9250b;
                    Function1 function1 = this.f9251c;
                    s.g(applicationContext, "applicationContext");
                    this.f9254f = eVar.a(bVar, (List) function1.invoke(applicationContext), this.f9252d, new a(applicationContext, this));
                }
                hVar = this.f9254f;
                s.e(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
