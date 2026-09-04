package o7;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.h0;
import com.facebook.internal.e1;
import com.facebook.j0;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import gl.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import n7.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f48237a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f48238b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f48239c = r.o("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f48240d = r.o(DevicePublicKeyStringDef.NONE, "address", "health");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* JADX INFO: renamed from: o7.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public /* synthetic */ class C0744a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f48244a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f48244a = iArr;
            }
        }

        public final String g() {
            int i10 = C0744a.f48244a[ordinal()];
            if (i10 == 1) {
                return "integrity_detect";
            }
            if (i10 == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final String h() {
            int i10 = C0744a.f48244a[ordinal()];
            if (i10 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i10 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f48245i = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f48246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f48247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f48248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f48249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float[] f48250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private File f48251f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private o7.b f48252g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Runnable f48253h;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final void d(String str, int i10) {
                File[] fileArrListFiles;
                File fileA = j.a();
                if (fileA == null || (fileArrListFiles = fileA.listFiles()) == null || fileArrListFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i10;
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    s.g(name, "name");
                    if (bm.r.N(name, str, false, 2, null) && !bm.r.N(name, str2, false, 2, null)) {
                        file.delete();
                    }
                }
            }

            private final void e(String str, String str2, m.a aVar) {
                File file = new File(j.a(), str2);
                if (str == null || file.exists()) {
                    aVar.a(file);
                } else {
                    new m(str, file, aVar).execute(new String[0]);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void g(List slaves, File file) {
                s.h(slaves, "$slaves");
                s.h(file, "file");
                final o7.b bVarA = o7.b.f48223m.a(file);
                if (bVarA != null) {
                    Iterator it = slaves.iterator();
                    while (it.hasNext()) {
                        final b bVar = (b) it.next();
                        b.f48245i.e(bVar.e(), bVar.g() + '_' + bVar.h() + "_rule", new m.a() { // from class: o7.h
                            @Override // n7.m.a
                            public final void a(File file2) {
                                f.b.a.h(bVar, bVarA, file2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void h(b slave, o7.b bVar, File file) {
                s.h(slave, "$slave");
                s.h(file, "file");
                slave.i(bVar);
                slave.k(file);
                Runnable runnable = slave.f48253h;
                if (runnable != null) {
                    runnable.run();
                }
            }

            public final b c(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String useCase = jSONObject.getString("use_case");
                    String assetUri = jSONObject.getString("asset_uri");
                    String strOptString = jSONObject.optString("rules_uri", null);
                    int i10 = jSONObject.getInt("version_id");
                    float[] fArrD = f.d(f.f48237a, jSONObject.getJSONArray("thresholds"));
                    s.g(useCase, "useCase");
                    s.g(assetUri, "assetUri");
                    return new b(useCase, assetUri, strOptString, i10, fArrD);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void f(b master, final List slaves) {
                s.h(master, "master");
                s.h(slaves, "slaves");
                d(master.g(), master.h());
                e(master.b(), master.g() + '_' + master.h(), new m.a() { // from class: o7.g
                    @Override // n7.m.a
                    public final void a(File file) {
                        f.b.a.g(slaves, file);
                    }
                });
            }

            private a() {
            }
        }

        public b(String useCase, String assetUri, String str, int i10, float[] fArr) {
            s.h(useCase, "useCase");
            s.h(assetUri, "assetUri");
            this.f48246a = useCase;
            this.f48247b = assetUri;
            this.f48248c = str;
            this.f48249d = i10;
            this.f48250e = fArr;
        }

        public final String b() {
            return this.f48247b;
        }

        public final o7.b c() {
            return this.f48252g;
        }

        public final File d() {
            return this.f48251f;
        }

        public final String e() {
            return this.f48248c;
        }

        public final float[] f() {
            return this.f48250e;
        }

        public final String g() {
            return this.f48246a;
        }

        public final int h() {
            return this.f48249d;
        }

        public final void i(o7.b bVar) {
            this.f48252g = bVar;
        }

        public final b j(Runnable runnable) {
            this.f48253h = runnable;
            return this;
        }

        public final void k(File file) {
            this.f48251f = file;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48254a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f48254a = iArr;
        }
    }

    private f() {
    }

    public static final /* synthetic */ float[] d(f fVar, JSONArray jSONArray) {
        if (x7.a.c(f.class)) {
            return null;
        }
        try {
            return fVar.o(jSONArray);
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
            return null;
        }
    }

    private final void e(JSONObject jSONObject) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    b bVarC = b.f48245i.c(jSONObject.getJSONObject(itKeys.next()));
                    if (bVarC != null) {
                        f48238b.put(bVarC.g(), bVarC);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final void f() {
        if (x7.a.c(f.class)) {
            return;
        }
        try {
            e1.E0(new Runnable() { // from class: o7.c
                @Override // java.lang.Runnable
                public final void run() {
                    f.g();
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g() {
        if (x7.a.c(f.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = h0.m().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
            String string = sharedPreferences.getString("models", null);
            JSONObject jSONObject = (string == null || string.length() == 0) ? new JSONObject() : new JSONObject(string);
            long j10 = sharedPreferences.getLong("model_request_timestamp", 0L);
            if (!com.facebook.internal.s.g(com.facebook.internal.s.b.ModelRequest) || jSONObject.length() == 0 || !f48237a.n(j10)) {
                jSONObject = f48237a.k();
                if (jSONObject == null) {
                    return;
                } else {
                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                }
            }
            f fVar = f48237a;
            fVar.e(jSONObject);
            fVar.h();
        } catch (Exception unused) {
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
        }
    }

    private final void h() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String strB = null;
            int iMax = 0;
            for (Map.Entry entry : f48238b.entrySet()) {
                String str = (String) entry.getKey();
                b bVar = (b) entry.getValue();
                if (s.c(str, a.MTML_APP_EVENT_PREDICTION.h())) {
                    String strB2 = bVar.b();
                    int iMax2 = Math.max(iMax, bVar.h());
                    if (com.facebook.internal.s.g(com.facebook.internal.s.b.SuggestedEvents) && m()) {
                        arrayList.add(bVar.j(new Runnable() { // from class: o7.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.i();
                            }
                        }));
                    }
                    strB = strB2;
                    iMax = iMax2;
                }
                if (s.c(str, a.MTML_INTEGRITY_DETECT.h())) {
                    strB = bVar.b();
                    iMax = Math.max(iMax, bVar.h());
                    if (com.facebook.internal.s.g(com.facebook.internal.s.b.IntelligentIntegrity)) {
                        arrayList.add(bVar.j(new Runnable() { // from class: o7.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.j();
                            }
                        }));
                    }
                }
            }
            if (strB == null || iMax <= 0 || arrayList.isEmpty()) {
                return;
            }
            b.f48245i.f(new b("MTML", strB, null, iMax, null), arrayList);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i() {
        if (x7.a.c(f.class)) {
            return;
        }
        try {
            r7.e.b();
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j() {
        if (x7.a.c(f.class)) {
            return;
        }
        try {
            m7.c.a();
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
        }
    }

    private final JSONObject k() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            j0 j0VarX = j0.f15486n.x(null, "app/model_asset", null);
            j0VarX.G(bundle);
            JSONObject jSONObjectC = j0VarX.k().c();
            if (jSONObjectC == null) {
                return null;
            }
            return p(jSONObjectC);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static final File l(a task) {
        if (x7.a.c(f.class)) {
            return null;
        }
        try {
            s.h(task, "task");
            b bVar = (b) f48238b.get(task.h());
            if (bVar == null) {
                return null;
            }
            return bVar.d();
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
            return null;
        }
    }

    private final boolean m() {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            Locale localeO = e1.O();
            if (localeO == null) {
                return true;
            }
            String language = localeO.getLanguage();
            s.g(language, "locale.language");
            return bm.r.T(language, "en", false, 2, null);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    private final boolean n(long j10) {
        if (x7.a.c(this) || j10 == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j10 < 259200000;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    private final float[] o(JSONArray jSONArray) {
        if (x7.a.c(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    String string = jSONArray.getString(i10);
                    s.g(string, "jsonArray.getString(i)");
                    fArr[i10] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final JSONObject p(JSONObject jSONObject) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static final String[] q(a task, float[][] denses, String[] texts) {
        o7.b bVarC;
        if (x7.a.c(f.class)) {
            return null;
        }
        try {
            s.h(task, "task");
            s.h(denses, "denses");
            s.h(texts, "texts");
            b bVar = (b) f48238b.get(task.h());
            if (bVar != null && (bVarC = bVar.c()) != null) {
                float[] fArrF = bVar.f();
                int length = texts.length;
                int length2 = denses[0].length;
                o7.a aVar = new o7.a(new int[]{length, length2});
                for (int i10 = 0; i10 < length; i10++) {
                    System.arraycopy(denses[i10], 0, aVar.a(), i10 * length2, length2);
                }
                o7.a aVarB = bVarC.b(aVar, texts, task.g());
                if (aVarB != null && fArrF != null && aVarB.a().length != 0 && fArrF.length != 0) {
                    int i11 = c.f48254a[task.ordinal()];
                    if (i11 == 1) {
                        return f48237a.s(aVarB, fArrF);
                    }
                    if (i11 == 2) {
                        return f48237a.r(aVarB, fArrF);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
            return null;
        }
    }

    private final String[] r(o7.a aVar, float[] fArr) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            float[] fArrA = aVar.a();
            if (iB2 != fArr.length) {
                return null;
            }
            yl.f fVarM = yl.g.m(0, iB);
            ArrayList arrayList = new ArrayList(r.v(fVarM, 10));
            Iterator it = fVarM.iterator();
            while (it.hasNext()) {
                int iNextInt = ((gl.j0) it).nextInt();
                Object obj = DevicePublicKeyStringDef.NONE;
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (fArrA[(iNextInt * iB2) + i11] >= fArr[i10]) {
                        obj = f48240d.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add((String) obj);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final String[] s(o7.a aVar, float[] fArr) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            float[] fArrA = aVar.a();
            if (iB2 != fArr.length) {
                return null;
            }
            yl.f fVarM = yl.g.m(0, iB);
            ArrayList arrayList = new ArrayList(r.v(fVarM, 10));
            Iterator it = fVarM.iterator();
            while (it.hasNext()) {
                int iNextInt = ((gl.j0) it).nextInt();
                Object obj = "other";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (fArrA[(iNextInt * iB2) + i11] >= fArr[i10]) {
                        obj = f48239c.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add((String) obj);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }
}
