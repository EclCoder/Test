package p4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface c extends Closeable {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f49508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f49509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f49510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f49511d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Context f49512a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            String f49513b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            a f49514c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f49515d;

            a(Context context) {
                this.f49512a = context;
            }

            public b a() {
                if (this.f49514c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f49512a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f49515d && TextUtils.isEmpty(this.f49513b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f49512a, this.f49513b, this.f49514c, this.f49515d);
            }

            public a b(a aVar) {
                this.f49514c = aVar;
                return this;
            }

            public a c(String str) {
                this.f49513b = str;
                return this;
            }

            public a d(boolean z10) {
                this.f49515d = z10;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z10) {
            this.f49508a = context;
            this.f49509b = str;
            this.f49510c = aVar;
            this.f49511d = z10;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* JADX INFO: renamed from: p4.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0762c {
        c a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    p4.b getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49507a;

        public a(int i10) {
            this.f49507a = i10;
        }

        private void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void c(p4.b bVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar.w());
            if (!bVar.isOpen()) {
                a(bVar.w());
                return;
            }
            List listA = null;
            try {
                try {
                    listA = bVar.A();
                } catch (SQLiteException unused) {
                }
                try {
                    bVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (listA != null) {
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        a((String) ((Pair) it.next()).second);
                    }
                } else {
                    a(bVar.w());
                }
            }
        }

        public abstract void d(p4.b bVar);

        public abstract void e(p4.b bVar, int i10, int i11);

        public abstract void g(p4.b bVar, int i10, int i11);

        public void b(p4.b bVar) {
        }

        public void f(p4.b bVar) {
        }
    }
}
