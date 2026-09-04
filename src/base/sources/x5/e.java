package x5;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f56652a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        Class a();

        void b(Object obj);

        Object c(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f56656a = new a();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements a {
            a() {
            }

            @Override // x5.e.a
            public Class a() {
                return InputStream.class;
            }

            @Override // x5.e.a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // x5.e.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // x5.o
        public n d(r rVar) {
            return new e(this.f56656a);
        }
    }

    public e(a aVar) {
        this.f56652a = aVar;
    }

    @Override // x5.n
    public boolean a(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // x5.n
    public n.a b(Object obj, int i10, int i11, r5.g gVar) {
        return new n.a(new l6.d(obj), new b(obj.toString(), this.f56652a));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f56653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f56654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f56655c;

        b(String str, a aVar) {
            this.f56653a = str;
            this.f56654b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f56654b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f56654b.b(this.f56655c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public r5.a d() {
            return r5.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d.a aVar) {
            try {
                Object objC = this.f56654b.c(this.f56653a);
                this.f56655c = objC;
                aVar.f(objC);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
