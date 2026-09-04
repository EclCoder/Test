package x5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f56658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f56659b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements o, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56660a;

        a(Context context) {
            this.f56660a = context;
        }

        @Override // x5.f.e
        public Class a() {
            return AssetFileDescriptor.class;
        }

        @Override // x5.o
        public n d(r rVar) {
            return new f(this.f56660a, this);
        }

        @Override // x5.f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // x5.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements o, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56662a;

        c(Context context) {
            this.f56662a = context;
        }

        @Override // x5.f.e
        public Class a() {
            return InputStream.class;
        }

        @Override // x5.o
        public n d(r rVar) {
            return new f(this.f56662a, this);
        }

        @Override // x5.f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // x5.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface e {
        Class a();

        void b(Object obj);

        Object c(Resources.Theme theme, Resources resources, int i10);
    }

    f(Context context, e eVar) {
        this.f56658a = context.getApplicationContext();
        this.f56659b = eVar;
    }

    public static o c(Context context) {
        return new a(context);
    }

    public static o e(Context context) {
        return new b(context);
    }

    public static o g(Context context) {
        return new c(context);
    }

    @Override // x5.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public n.a b(Integer num, int i10, int i11, r5.g gVar) {
        Resources.Theme theme = (Resources.Theme) gVar.c(b6.g.f8492b);
        return new n.a(new l6.d(num), new d(theme, theme != null ? theme.getResources() : this.f56658a.getResources(), this.f56659b, num.intValue()));
    }

    @Override // x5.n
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources.Theme f56663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Resources f56664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f56665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f56666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f56667e;

        d(Resources.Theme theme, Resources resources, e eVar, int i10) {
            this.f56663a = theme;
            this.f56664b = resources;
            this.f56665c = eVar;
            this.f56666d = i10;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f56665c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f56667e;
            if (obj != null) {
                try {
                    this.f56665c.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public r5.a d() {
            return r5.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d.a aVar) {
            try {
                Object objC = this.f56665c.c(this.f56663a, this.f56664b, this.f56666d);
                this.f56667e = objC;
                aVar.f(objC);
            } catch (Resources.NotFoundException e10) {
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements o, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56661a;

        b(Context context) {
            this.f56661a = context;
        }

        @Override // x5.f.e
        public Class a() {
            return Drawable.class;
        }

        @Override // x5.o
        public n d(r rVar) {
            return new f(this.f56661a, this);
        }

        @Override // x5.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable c(Resources.Theme theme, Resources resources, int i10) {
            return b6.d.a(this.f56661a, i10, theme);
        }

        @Override // x5.f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(Drawable drawable) {
        }
    }
}
