package com.vungle.ads.internal.session;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.util.j;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.s;
import fl.g0;
import fl.r;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.e;
import kotlinx.serialization.json.v;
import zl.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    private static final String FILENAME = "unclosed_ad";
    private final Context context;
    private final com.vungle.ads.internal.executor.a executors;
    private File file;
    private final s pathProvider;
    private boolean ready;
    private final String sessionId;
    private final CopyOnWriteArrayList<UnclosedAd> unclosedAdList;
    public static final b Companion = new b(null);
    private static final kotlinx.serialization.json.b json = v.b(null, a.INSTANCE, 1, null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class a extends t implements Function1 {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((e) obj);
            return g0.f38750a;
        }

        public final void invoke(e Json) {
            kotlin.jvm.internal.s.h(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
            Json.c(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public d(Context context, String sessionId, com.vungle.ads.internal.executor.a executors, s pathProvider) {
        Object objB;
        boolean zI;
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(sessionId, "sessionId");
        kotlin.jvm.internal.s.h(executors, "executors");
        kotlin.jvm.internal.s.h(pathProvider, "pathProvider");
        this.context = context;
        this.sessionId = sessionId;
        this.executors = executors;
        this.pathProvider = pathProvider;
        this.file = pathProvider.getUnclosedAdFile(FILENAME);
        this.unclosedAdList = new CopyOnWriteArrayList<>();
        if (this.file.exists()) {
            zI = true;
        } else {
            try {
                r.a aVar = r.f38769b;
                objB = r.b(Boolean.valueOf(this.file.createNewFile()));
            } catch (Throwable th2) {
                r.a aVar2 = r.f38769b;
                objB = r.b(fl.s.a(th2));
            }
            Throwable thE = r.e(objB);
            if (thE != null) {
                q.Companion.e("UnclosedAdDetector", "Fail to create unclosed ad file: " + thE.getMessage());
            }
            zI = r.i(objB);
        }
        this.ready = zI;
    }

    private final /* synthetic */ <T> T decodeJson(String str) {
        kotlinx.serialization.json.b bVar = json;
        vm.b bVarA = bVar.a();
        kotlin.jvm.internal.s.m(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        pm.d dVarB = pm.t.b(bVarA, null);
        kotlin.jvm.internal.s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (T) bVar.b(dVarB, str);
    }

    private final List<UnclosedAd> readUnclosedAdFromFile() {
        return !this.ready ? gl.r.l() : (List) new com.vungle.ads.internal.executor.b(this.executors.getIoExecutor().submit(new Callable() { // from class: com.vungle.ads.internal.session.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d.m141readUnclosedAdFromFile$lambda4(this.f35853a);
            }
        })).get(1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readUnclosedAdFromFile$lambda-4, reason: not valid java name */
    public static final List m141readUnclosedAdFromFile$lambda4(d this$0) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        try {
            String string = j.INSTANCE.readString(this$0.file);
            if (string != null && string.length() != 0) {
                kotlinx.serialization.json.b bVar = json;
                pm.d dVarB = pm.t.b(bVar.a(), l0.l(List.class, m.f58989c.a(l0.k(UnclosedAd.class))));
                kotlin.jvm.internal.s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                return (List) bVar.b(dVarB, string);
            }
            return new ArrayList();
        } catch (Exception e10) {
            q.Companion.e("UnclosedAdDetector", "Fail to read unclosed ad file " + e10.getMessage());
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: retrieveUnclosedAd$lambda-3, reason: not valid java name */
    public static final void m142retrieveUnclosedAd$lambda3(d this$0) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        try {
            j.deleteAndLogIfFailed(this$0.file);
        } catch (Exception e10) {
            q.Companion.e("UnclosedAdDetector", "Fail to delete file " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeUnclosedAdToFile$lambda-5, reason: not valid java name */
    public static final void m143writeUnclosedAdToFile$lambda5(d this$0, String jsonContent) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        kotlin.jvm.internal.s.h(jsonContent, "$jsonContent");
        j.INSTANCE.writeString(this$0.file, jsonContent);
    }

    public final void addUnclosedAd(UnclosedAd ad2) {
        kotlin.jvm.internal.s.h(ad2, "ad");
        if (this.ready) {
            ad2.setSessionId(this.sessionId);
            this.unclosedAdList.add(ad2);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final com.vungle.ads.internal.executor.a getExecutors() {
        return this.executors;
    }

    public final s getPathProvider() {
        return this.pathProvider;
    }

    public final void removeUnclosedAd(UnclosedAd ad2) {
        kotlin.jvm.internal.s.h(ad2, "ad");
        if (this.ready && this.unclosedAdList.contains(ad2)) {
            this.unclosedAdList.remove(ad2);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final List<UnclosedAd> retrieveUnclosedAd() {
        ArrayList arrayList = new ArrayList();
        if (!this.ready) {
            return arrayList;
        }
        List<UnclosedAd> unclosedAdFromFile = readUnclosedAdFromFile();
        if (unclosedAdFromFile != null) {
            arrayList.addAll(unclosedAdFromFile);
        }
        this.executors.getIoExecutor().execute(new Runnable() { // from class: com.vungle.ads.internal.session.b
            @Override // java.lang.Runnable
            public final void run() {
                d.m142retrieveUnclosedAd$lambda3(this.f35854a);
            }
        });
        return arrayList;
    }

    private final void writeUnclosedAdToFile(List<UnclosedAd> list) {
        if (this.ready) {
            try {
                kotlinx.serialization.json.b bVar = json;
                pm.d dVarB = pm.t.b(bVar.a(), l0.l(List.class, m.f58989c.a(l0.k(UnclosedAd.class))));
                kotlin.jvm.internal.s.f(dVarB, lkCBSIFlvmyGX.tANEKn);
                final String strC = bVar.c(dVarB, list);
                this.executors.getIoExecutor().execute(new Runnable() { // from class: com.vungle.ads.internal.session.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.m143writeUnclosedAdToFile$lambda5(this.f35855a, strC);
                    }
                });
            } catch (Throwable th2) {
                q.Companion.e("UnclosedAdDetector", "Fail to write unclosed ad file " + th2.getMessage());
            }
        }
    }
}
