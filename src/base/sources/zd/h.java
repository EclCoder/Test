package zd;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f58812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f58813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wd.c f58814c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements xd.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final wd.c f58815d = new wd.c() { // from class: zd.g
            @Override // wd.c
            public final void a(Object obj, Object obj2) {
                h.a.b(obj, (wd.d) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f58816a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f58817b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private wd.c f58818c = f58815d;

        public static /* synthetic */ void b(Object obj, wd.d dVar) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f58816a), new HashMap(this.f58817b), this.f58818c);
        }

        public a d(xd.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // xd.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, wd.c cVar) {
            this.f58816a.put(cls, cVar);
            this.f58817b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, wd.c cVar) {
        this.f58812a = map;
        this.f58813b = map2;
        this.f58814c = cVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f58812a, this.f58813b, this.f58814c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
