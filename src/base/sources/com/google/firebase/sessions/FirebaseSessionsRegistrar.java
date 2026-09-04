package com.google.firebase.sessions;

import a9.i;
import android.content.Context;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import dd.a0;
import dd.q;
import em.k0;
import gl.r;
import ie.h;
import java.util.List;
import kl.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import ne.l;
import z0.x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Ldd/c;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a(null);

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final a0 appContext;
    private static final a0 backgroundDispatcher;
    private static final a0 blockingDispatcher;
    private static final a0 firebaseApp;
    private static final a0 firebaseInstallationsApi;
    private static final a0 firebaseSessionsComponent;
    private static final a0 transportFactory;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        a0 a0VarB = a0.b(Context.class);
        s.g(a0VarB, "unqualified(...)");
        appContext = a0VarB;
        a0 a0VarB2 = a0.b(com.google.firebase.f.class);
        s.g(a0VarB2, "unqualified(...)");
        firebaseApp = a0VarB2;
        a0 a0VarB3 = a0.b(de.e.class);
        s.g(a0VarB3, "unqualified(...)");
        firebaseInstallationsApi = a0VarB3;
        a0 a0VarA = a0.a(cd.a.class, k0.class);
        s.g(a0VarA, "qualified(...)");
        backgroundDispatcher = a0VarA;
        a0 a0VarA2 = a0.a(cd.b.class, k0.class);
        s.g(a0VarA2, "qualified(...)");
        blockingDispatcher = a0VarA2;
        a0 a0VarB4 = a0.b(i.class);
        s.g(a0VarB4, "unqualified(...)");
        transportFactory = a0VarB4;
        a0 a0VarB5 = a0.b(b.class);
        s.g(a0VarB5, "unqualified(...)");
        firebaseSessionsComponent = a0VarB5;
        try {
            x.f58514a.getClass();
        } catch (NoClassDefFoundError unused) {
            Log.w("FirebaseSessions", "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l getComponents$lambda$0(dd.d dVar) {
        return ((b) dVar.e(firebaseSessionsComponent)).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b getComponents$lambda$1(dd.d dVar) {
        b.a aVarA = com.google.firebase.sessions.a.a();
        Object objE = dVar.e(appContext);
        s.g(objE, "get(...)");
        b.a aVarF = aVarA.f((Context) objE);
        Object objE2 = dVar.e(backgroundDispatcher);
        s.g(objE2, "get(...)");
        b.a aVarA2 = aVarF.a((j) objE2);
        Object objE3 = dVar.e(blockingDispatcher);
        s.g(objE3, "get(...)");
        b.a aVarB = aVarA2.b((j) objE3);
        Object objE4 = dVar.e(firebaseApp);
        s.g(objE4, "get(...)");
        b.a aVarE = aVarB.e((com.google.firebase.f) objE4);
        Object objE5 = dVar.e(firebaseInstallationsApi);
        s.g(objE5, "get(...)");
        b.a aVarD = aVarE.d((de.e) objE5);
        ce.b bVarH = dVar.h(transportFactory);
        s.g(bVarH, "getProvider(...)");
        return aVarD.c(bVarH).build();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<dd.c> getComponents() {
        return r.o(dd.c.e(l.class).g(LIBRARY_NAME).b(q.i(firebaseSessionsComponent)).e(new dd.g() { // from class: ne.q
            @Override // dd.g
            public final Object a(dd.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(dVar);
            }
        }).d().c(), dd.c.e(b.class).g("fire-sessions-component").b(q.i(appContext)).b(q.i(backgroundDispatcher)).b(q.i(blockingDispatcher)).b(q.i(firebaseApp)).b(q.i(firebaseInstallationsApi)).b(q.k(transportFactory)).e(new dd.g() { // from class: ne.r
            @Override // dd.g
            public final Object a(dd.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(dVar);
            }
        }).c(), h.b(LIBRARY_NAME, "3.0.7"));
    }
}
