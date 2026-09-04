package x5;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f56690a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56691a;

        public a(Context context) {
            this.f56691a = context;
        }

        @Override // x5.o
        public n d(r rVar) {
            return new l(this.f56691a);
        }
    }

    public l(Context context) {
        this.f56690a = context;
    }

    @Override // x5.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, r5.g gVar) {
        return new n.a(new l6.d(uri), new b(this.f56690a, uri));
    }

    @Override // x5.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return s5.b.d(uri);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f56692c = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f56694b;

        b(Context context, Uri uri) {
            this.f56693a = context;
            this.f56694b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public r5.a d() {
            return r5.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d.a aVar) {
            Cursor cursorQuery = this.f56693a.getContentResolver().query(this.f56694b, f56692c, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.f(new File(string));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f56694b));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
