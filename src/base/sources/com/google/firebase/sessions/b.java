package com.google.firebase.sessions;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import em.o0;
import em.p0;
import gl.r;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import kl.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import ne.SessionData;
import ne.a1;
import ne.g0;
import ne.k0;
import ne.l;
import ne.t0;
import ne.x0;
import ne.y0;
import ne.z0;
import qe.SessionConfigs;
import z0.d0;
import z0.h;
import z0.i;
import z0.x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        a a(j jVar);

        a b(j jVar);

        b build();

        a c(ce.b bVar);

        a d(de.e eVar);

        a e(com.google.firebase.f fVar);

        a f(Context context);
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0330b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22439a = a.f22440a;

        /* JADX INFO: renamed from: com.google.firebase.sessions.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f22440a = new a();

            private a() {
            }

            private final h f(d0 d0Var, a1.b bVar, List list, o0 o0Var, tl.a aVar) {
                return h() ? x.f58514a.a(d0Var, bVar, list, o0Var, aVar) : i.f58270a.a(d0Var, bVar, list, o0Var, aVar);
            }

            static /* synthetic */ h g(a aVar, d0 d0Var, a1.b bVar, List list, o0 o0Var, tl.a aVar2, int i10, Object obj) {
                if ((i10 & 4) != 0) {
                    list = r.l();
                }
                return aVar.f(d0Var, bVar, list, o0Var, aVar2);
            }

            private final boolean h() {
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return true;
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return false;
                }
            }

            private final void i(File file) throws IOException {
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    return;
                }
                if (parentFile.exists() && !parentFile.isDirectory() && s.c(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                    throw new IOException("Failed to delete conflicting file: " + parentFile);
                }
                if (parentFile.isDirectory()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                        return;
                    } catch (Exception e10) {
                        throw new IOException("Failed to create directory: " + parentFile, e10);
                    }
                }
                if (parentFile.mkdirs() || parentFile.isDirectory()) {
                    return;
                }
                throw new IOException("Failed to create directory: " + parentFile);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File l(Context context) throws IOException {
                File fileA = y0.a.a(context, "firebaseSessions/sessionConfigsDataStore.data");
                f22440a.i(fileA);
                return fileA;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionData n(g0 g0Var, CorruptionException ex) {
                s.h(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return g0Var.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File o(Context context) throws IOException {
                File fileA = y0.a.a(context, "firebaseSessions/sessionDataStore.data");
                f22440a.i(fileA);
                return fileA;
            }

            public final ne.b e(com.google.firebase.f firebaseApp) {
                s.h(firebaseApp, "firebaseApp");
                return k0.f47185a.b(firebaseApp);
            }

            public final h j(final Context appContext, j blockingDispatcher) {
                s.h(appContext, "appContext");
                s.h(blockingDispatcher, "blockingDispatcher");
                return g(this, qe.i.f50683a, new a1.b(new Function1() { // from class: ne.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.google.firebase.sessions.b.InterfaceC0330b.a.k((CorruptionException) obj);
                    }
                }), null, p0.a(blockingDispatcher), new tl.a() { // from class: ne.n
                    @Override // tl.a
                    public final Object invoke() {
                        return com.google.firebase.sessions.b.InterfaceC0330b.a.l(appContext);
                    }
                }, 4, null);
            }

            public final h m(final Context appContext, j blockingDispatcher, final g0 sessionDataSerializer) {
                s.h(appContext, "appContext");
                s.h(blockingDispatcher, "blockingDispatcher");
                s.h(sessionDataSerializer, "sessionDataSerializer");
                return g(this, sessionDataSerializer, new a1.b(new Function1() { // from class: ne.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.google.firebase.sessions.b.InterfaceC0330b.a.n(sessionDataSerializer, (CorruptionException) obj);
                    }
                }), null, p0.a(blockingDispatcher), new tl.a() { // from class: ne.p
                    @Override // tl.a
                    public final Object invoke() {
                        return com.google.firebase.sessions.b.InterfaceC0330b.a.o(appContext);
                    }
                }, 4, null);
            }

            public final x0 p() {
                return y0.f47310a;
            }

            public final z0 q() {
                return a1.f47098a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionConfigs k(CorruptionException ex) {
                s.h(ex, "ex");
                Log.w("FirebaseSessions", trPLwhKZgZ.YXpaDg, ex);
                return qe.i.f50683a.getDefaultValue();
            }
        }
    }

    t0 a();

    l b();
}
