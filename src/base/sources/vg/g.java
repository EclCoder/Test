package vg;

import android.content.Context;
import android.content.SharedPreferences;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.promotions.UtilityCatalog;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.squareup.moshi.r;
import em.c1;
import em.i;
import em.o0;
import fl.g0;
import fl.k;
import fl.l;
import fl.s;
import gn.b0;
import gn.d0;
import gn.f0;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.m;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile UtilityCatalog f55543d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f55540a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f55541b = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final nm.a f55542c = nm.g.b(false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final k f55544e = l.b(new tl.a() { // from class: vg.e
        @Override // tl.a
        public final Object invoke() {
            return g.m();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final k f55545f = l.b(new tl.a() { // from class: vg.f
        @Override // tl.a
        public final Object invoke() {
            return g.k();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f55546r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Context f55547s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, kl.f fVar) {
            super(2, fVar);
            this.f55547s = context;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return new a(this.f55547s, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String string;
            ll.b.f();
            if (this.f55546r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Context applicationContext = this.f55547s.getApplicationContext();
            g gVar = g.f55540a;
            kotlin.jvm.internal.s.e(applicationContext);
            UtilityCatalog utilityCatalogN = gVar.n(applicationContext);
            if (!nm.a.g(g.f55542c, null, 1, null)) {
                return utilityCatalogN;
            }
            try {
                try {
                    SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("utility_catalog", 0);
                    long jCurrentTimeMillis = System.currentTimeMillis() - sharedPreferences.getLong("last_fetch_ms", 0L);
                    if (0 > jCurrentTimeMillis || jCurrentTimeMillis >= g.f55541b) {
                        d0.a aVarV = new d0.a().v(gVar.t());
                        if (gVar.l(applicationContext).exists() && (string = sharedPreferences.getString(DownloadModel.ETAG, null)) != null) {
                            aVarV.n("If-None-Match", string);
                        }
                        f0 f0VarExecute = gVar.p().a(aVarV.b()).execute();
                        try {
                            if (f0VarExecute.m() == 304) {
                                wp.a.a("Catalog unchanged", new Object[0]);
                                kotlin.jvm.internal.s.e(sharedPreferences);
                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                editorEdit.putLong("last_fetch_ms", System.currentTimeMillis());
                                editorEdit.apply();
                                ql.b.a(f0VarExecute, null);
                            } else if (f0VarExecute.i0()) {
                                xn.g gVarSource = f0VarExecute.d().source();
                                gVarSource.request(131073L);
                                if (gVarSource.u().size() > 131072) {
                                    wp.a.i("Catalog is implausibly large, ignoring", new Object[0]);
                                    ql.b.a(f0VarExecute, null);
                                } else {
                                    String strX0 = gVarSource.u().X0();
                                    UtilityCatalog utilityCatalog = (UtilityCatalog) gVar.o().fromJson(strX0);
                                    if (utilityCatalog != null && !utilityCatalog.getItems().isEmpty()) {
                                        boolean zU = gVar.u(applicationContext, strX0);
                                        kotlin.jvm.internal.s.e(sharedPreferences);
                                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                                        editorEdit2.putLong("last_fetch_ms", System.currentTimeMillis());
                                        if (zU) {
                                            editorEdit2.putString(DownloadModel.ETAG, f0.c0(f0VarExecute, Command.HTTP_HEADER_ETAG, null, 2, null));
                                        } else {
                                            editorEdit2.remove(DownloadModel.ETAG);
                                        }
                                        editorEdit2.apply();
                                        g.f55543d = utilityCatalog;
                                        wp.a.a("Catalog updated to version %d", kotlin.coroutines.jvm.internal.b.d(utilityCatalog.getVersion()));
                                        ql.b.a(f0VarExecute, null);
                                        nm.a.b(g.f55542c, null, 1, null);
                                        return utilityCatalog;
                                    }
                                    wp.a.i("Catalog is empty or unparseable, keeping the old one", new Object[0]);
                                    ql.b.a(f0VarExecute, null);
                                }
                            } else {
                                wp.a.i("Catalog fetch failed: %d", kotlin.coroutines.jvm.internal.b.d(f0VarExecute.m()));
                                ql.b.a(f0VarExecute, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                ql.b.a(f0VarExecute, th2);
                                throw th3;
                            }
                        }
                    }
                } catch (Exception e10) {
                    wp.a.c(e10, "Catalog refresh failed, using cached copy", new Object[0]);
                }
                nm.a.b(g.f55542c, null, 1, null);
                return utilityCatalogN;
            } catch (Throwable th4) {
                nm.a.b(g.f55542c, null, 1, null);
                throw th4;
            }
        }
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.squareup.moshi.f k() {
        return new r.a().a().c(UtilityCatalog.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File l(Context context) {
        return new File(context.getFilesDir(), "utility_catalog.json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 m() {
        b0.a aVar = new b0.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return aVar.e(15L, timeUnit).R(15L, timeUnit).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.squareup.moshi.f o() {
        return (com.squareup.moshi.f) f55545f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b0 p() {
        return (b0) f55544e.getValue();
    }

    private final UtilityCatalog q(Context context) {
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.utility_catalog);
            kotlin.jvm.internal.s.g(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, bm.d.f9079b), 8192);
            try {
                String strC = ql.k.c(bufferedReader);
                ql.b.a(bufferedReader, null);
                UtilityCatalog utilityCatalog = (UtilityCatalog) o().fromJson(strC);
                return utilityCatalog == null ? new UtilityCatalog(0, null, 3, null) : utilityCatalog;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.b.a(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Exception e10) {
            wp.a.f(e10, "Bundled promo catalog is unreadable", new Object[0]);
            return new UtilityCatalog(0, null, 3, null);
        }
    }

    private final UtilityCatalog r(Context context) {
        try {
            File fileL = l(context);
            if (fileL.exists()) {
                return (UtilityCatalog) o().fromJson(ql.f.f(fileL, null, 1, null));
            }
            return null;
        } catch (Exception e10) {
            wp.a.j(e10, "Discarding unreadable catalog cache", new Object[0]);
            try {
                fl.r.a aVar = fl.r.f38769b;
                fl.r.b(Boolean.valueOf(l(context).delete()));
            } catch (Throwable th2) {
                fl.r.a aVar2 = fl.r.f38769b;
                fl.r.b(s.a(th2));
            }
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("utility_catalog", 0);
                kotlin.jvm.internal.s.g(sharedPreferences, "getSharedPreferences(...)");
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.remove(DownloadModel.ETAG);
                editorEdit.apply();
                fl.r.b(g0.f38750a);
            } catch (Throwable th3) {
                fl.r.a aVar3 = fl.r.f38769b;
                fl.r.b(s.a(th3));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String t() {
        return "https://cdn.risenapps.com/az-screen-recorder/utility_catalog.json";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u(Context context, String str) {
        try {
            File file = new File(context.getFilesDir(), "utility_catalog.json.tmp");
            ql.f.h(file, str, null, 2, null);
            if (file.renameTo(l(context))) {
                return true;
            }
            file.delete();
            wp.a.i("Could not replace the cached catalog", new Object[0]);
            return false;
        } catch (Exception e10) {
            wp.a.j(e10, "Could not cache catalog", new Object[0]);
            return false;
        }
    }

    public final UtilityCatalog n(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        UtilityCatalog utilityCatalog = f55543d;
        if (utilityCatalog != null) {
            return utilityCatalog;
        }
        UtilityCatalog utilityCatalogR = r(context);
        if (utilityCatalogR == null) {
            utilityCatalogR = q(context);
        }
        f55543d = utilityCatalogR;
        return utilityCatalogR;
    }

    public final Object s(Context context, kl.f fVar) {
        return i.j(c1.b(), new a(context, null), fVar);
    }
}
