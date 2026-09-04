package y5;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.h;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import r5.g;
import x5.n;
import x5.o;
import x5.r;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f57427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f57428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f57429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class f57430d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f57431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f57432b;

        a(Context context, Class cls) {
            this.f57431a = context;
            this.f57432b = cls;
        }

        @Override // x5.o
        public final n d(r rVar) {
            return new d(this.f57431a, rVar.d(File.class, this.f57432b), rVar.d(Uri.class, this.f57432b), this.f57432b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: y5.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0880d implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String[] f57433k = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f57434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n f57435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n f57436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f57437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f57438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f57439f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final g f57440g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Class f57441h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f57442i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d f57443j;

        C0880d(Context context, n nVar, n nVar2, Uri uri, int i10, int i11, g gVar, Class cls) {
            this.f57434a = context.getApplicationContext();
            this.f57435b = nVar;
            this.f57436c = nVar2;
            this.f57437d = uri;
            this.f57438e = i10;
            this.f57439f = i11;
            this.f57440g = gVar;
            this.f57441h = cls;
        }

        private n.a c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f57435b.b(h(this.f57437d), this.f57438e, this.f57439f, this.f57440g);
            }
            if (Build.VERSION.SDK_INT >= 30 || s5.b.a(this.f57437d)) {
                return this.f57436c.b(this.f57437d, this.f57438e, this.f57439f, this.f57440g);
            }
            return this.f57436c.b(g() ? MediaStore.setRequireOriginal(this.f57437d) : this.f57437d, this.f57438e, this.f57439f, this.f57440g);
        }

        private com.bumptech.glide.load.data.d f() {
            n.a aVarC = c();
            if (aVarC != null) {
                return aVarC.f56703c;
            }
            return null;
        }

        private boolean g() {
            return this.f57434a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f57434a.getContentResolver().query(uri, f57433k, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th2) {
                if (0 == 0) {
                    throw th2;
                }
                cursor.close();
                throw th2;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f57441h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d dVar = this.f57443j;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f57442i = true;
            com.bumptech.glide.load.data.d dVar = this.f57443j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public r5.a d() {
            return r5.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(h hVar, com.bumptech.glide.load.data.d.a aVar) {
            try {
                com.bumptech.glide.load.data.d dVarF = f();
                if (dVarF == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f57437d));
                    return;
                }
                this.f57443j = dVarF;
                if (this.f57442i) {
                    cancel();
                } else {
                    dVarF.e(hVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    d(Context context, n nVar, n nVar2, Class cls) {
        this.f57427a = context.getApplicationContext();
        this.f57428b = nVar;
        this.f57429c = nVar2;
        this.f57430d = cls;
    }

    @Override // x5.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, g gVar) {
        return new n.a(new l6.d(uri), new C0880d(this.f57427a, this.f57428b, this.f57429c, uri, i10, i11, gVar, this.f57430d));
    }

    @Override // x5.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && s5.b.d(uri);
    }
}
