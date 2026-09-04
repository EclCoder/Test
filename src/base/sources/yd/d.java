package yd;

import com.google.firebase.encoders.EncodingException;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements xd.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final wd.c f57486e = new wd.c() { // from class: yd.a
        @Override // wd.c
        public final void a(Object obj, Object obj2) {
            d.c(obj, (wd.d) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final wd.e f57487f = new wd.e() { // from class: yd.b
        @Override // wd.e
        public final void a(Object obj, Object obj2) {
            ((wd.f) obj2).e((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final wd.e f57488g = new wd.e() { // from class: yd.c
        @Override // wd.e
        public final void a(Object obj, Object obj2) {
            ((wd.f) obj2).f(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f57489h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f57490a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f57491b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private wd.c f57492c = f57486e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f57493d = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements wd.a {
        a() {
        }

        @Override // wd.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f57490a, d.this.f57491b, d.this.f57492c, d.this.f57493d);
            eVar.k(obj, false);
            eVar.u();
        }

        @Override // wd.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements wd.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final DateFormat f57495a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f57495a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // wd.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, wd.f fVar) {
            fVar.e(f57495a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        m(String.class, f57487f);
        m(Boolean.class, f57488g);
        m(Date.class, f57489h);
    }

    public static /* synthetic */ void c(Object obj, wd.d dVar) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public wd.a i() {
        return new a();
    }

    public d j(xd.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f57493d = z10;
        return this;
    }

    @Override // xd.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, wd.c cVar) {
        this.f57490a.put(cls, cVar);
        this.f57491b.remove(cls);
        return this;
    }

    public d m(Class cls, wd.e eVar) {
        this.f57491b.put(cls, eVar);
        this.f57490a.remove(cls);
        return this;
    }
}
